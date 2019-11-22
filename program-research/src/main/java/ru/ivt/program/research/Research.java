package ru.ivt.program.research;

import org.apache.avro.generic.GenericData;
import org.apache.flink.api.common.functions.MapFunction;
import org.apache.flink.api.common.typeinfo.TypeInformation;
import org.apache.flink.api.java.DataSet;
import org.apache.flink.api.java.ExecutionEnvironment;
import org.apache.flink.api.java.hadoop.mapreduce.HadoopOutputFormat;
import org.apache.flink.api.java.tuple.Tuple2;
import org.apache.flink.api.java.tuple.Tuple3;
import org.apache.flink.configuration.Configuration;
import org.apache.flink.hadoopcompatibility.HadoopInputs;
import org.apache.flink.table.api.Table;
import org.apache.flink.table.api.Types;
import org.apache.flink.table.api.java.BatchTableEnvironment;
import org.apache.flink.table.functions.ScalarFunction;
import org.apache.flink.table.functions.TableFunction;
import org.apache.flink.types.Row;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.parquet.avro.AvroParquetInputFormat;
import org.apache.parquet.avro.AvroParquetOutputFormat;
import org.apache.parquet.hadoop.ParquetOutputFormat;
import org.apache.parquet.hadoop.metadata.CompressionCodecName;

import ru.ivt.model.RedNirSatellite;
import ru.ivt.model.ResultIndex;
import ru.ivt.model.SateliteImage;
import ru.ivt.program.research.functions.NdviFunction;
import ru.ivt.service.dataset.RedNirDataset;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;


/**
 * Simple example for demonstrating the use of the Table API for a Word Count in Java.
 *
 * <p>This example shows how to:
 *  - Convert DataSets to Tables
 *  - Apply group, aggregate, select, and filter operations
 */
public class Research {
    // включать при условии если не хватает в локальном исполнении памяти на винчестере
    static {
        System.setProperty("java.io.tmpdir", "/media/oshchepkovay/176C53FC3E3CCA8E2/temp/");
    }

    public static Integer scale = 10;
    public static String nameNodeData = "namenode";
    public static String portNameNodeData = "8020";
    public static String parquetName = "LC08_L1TP_142020_20190907_20190907_01_RT";
    public static String pathToParquet = "/user/claster/temp/parquet/";
    public static String pathResultToParquet = "/user/claster/flink/";
    public static final String formatString = "hdfs://claster@%s:%s%s%s";

    // *************************************************************************
    //     PROGRAM
    // *************************************************************************
    // Для того что бы запустить в клестере необходимо задать в зависимостях provide для hadoop
    // Если же использовать в локальной среде потребуется убрать данную пометку
    // Так же стоит отметить, что в локальной среде стоит переключать на ip  в адресе hdfs с доменного имени
    // Так же стоит отметить если происходит перенос кодовой базы модели для паркета то и необходимо
    // поменять namespace для модели описанный в схеме (SCHEME)
    public static void main(String[] args) throws Exception, IOException {
        String pathInput = String.format(formatString,nameNodeData,portNameNodeData,pathToParquet,parquetName);
        String pathOutput = String.format(formatString,nameNodeData,portNameNodeData,pathResultToParquet,parquetName);
        if (args.length!=0 && args.length!=1){
            scale = Integer.valueOf(args[0]);
            nameNodeData = args[1];
            portNameNodeData = args[2];
            parquetName = args[3];
            pathToParquet = args[4];
            pathInput = String.format("hdfs://claster@%s:%s%s%s",nameNodeData,portNameNodeData,pathToParquet,parquetName);
            pathOutput = String.format("hdfs://claster@%s:%s%s%s",nameNodeData,portNameNodeData,pathResultToParquet,parquetName);
        } else if (args.length == 1){
            scale = Integer.valueOf(args[0]);
        }

        final ExecutionEnvironment env = ExecutionEnvironment.getExecutionEnvironment();
        final BatchTableEnvironment tEnv = BatchTableEnvironment.getTableEnvironment(env);
        final Configuration parameters = new Configuration();

        Table t = tEnv.fromDataSet(RedNirDataset.build(parameters, env, pathInput));

        ScalarFunction func = new NdviFunction();
        tEnv.registerFunction("ndvi", func);

        tEnv.registerTable("table_data", t);
        Table result = tEnv.sqlQuery("" +
                " (select rowId, ndvi(dataRed, dataNIR) AS `result` " +
                                        " from table_data " +
                                        " where MOD(rowId," + scale +")=0 " +
                                        ") " +
                                        " ");

        DataSet<Tuple2<Void, ResultIndex>> r =
                tEnv.toDataSet(result, Row.class)
                    .map(new MapFunction<Row, Tuple2<Void, ResultIndex>>() {
                        @Override
                        public Tuple2<Void, ResultIndex> map(Row row) throws Exception {
                        Integer rowId = (Integer)row.getField(0);
                        return new Tuple2<Void, ResultIndex>
                                (null,new ResultIndex(rowId, Arrays.asList((Float[]) row.getField(1))));
                        }
                    });

        Job jobResult = Job.getInstance();
        jobResult.getConfiguration().set("parquet.avro.projection", ResultIndex.SCHEMA$.toString());
        AvroParquetOutputFormat.setSchema(jobResult, ResultIndex.getClassSchema());
        AvroParquetInputFormat.setAvroReadSchema(jobResult, ResultIndex.getClassSchema());
        ParquetOutputFormat.setCompression(jobResult, CompressionCodecName.UNCOMPRESSED);
        ParquetOutputFormat.setEnableDictionary(jobResult, true);
        HadoopOutputFormat parquetFormat = new HadoopOutputFormat<>(new AvroParquetOutputFormat<ResultIndex>(), jobResult);

        FileOutputFormat.setOutputPath(jobResult, new Path(pathOutput));
        // Output & Execute
        r.output(parquetFormat);
        env.execute();


    }
}
