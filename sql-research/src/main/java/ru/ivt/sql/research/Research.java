package ru.ivt.sql.research;

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
import ru.ivt.base.BaseResearch;
import ru.ivt.model.ResultIndex;
import ru.ivt.model.SateliteImage;
import ru.ivt.service.dataset.RedNirDataset;
import ru.ivt.sql.research.functions.PoseExplodeFunction2;
import ru.ivt.sql.research.functions.ResultCollection;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Simple example for demonstrating the use of the Table API for a Word Count in Java.
 *
 * <p>This example shows how to:
 *  - Convert DataSets to Tables
 *  - Apply group, aggregate, select, and filter operations
 */
public class Research extends BaseResearch {
    // включать при условии если не хватает в локальном исполнении памяти на винчестере
//    static {
//        System.setProperty("java.io.tmpdir", "/media/oshchepkovay/176C53FC3E3CCA8E1/temp/");
//    }



    // *************************************************************************
    //     PROGRAM
    // *************************************************************************
    // Для того что бы запустить в клестере необходимо задать в зависимостях provide для hadoop
    // Если же использовать в локальной среде потребуется убрать данную пометку
    // Так же стоит отметить, что в локальной среде стоит переключать на ip  в адресе hdfs с доменного имени
    // Так же стоит отметить если происходит перенос кодовой базы модели для паркета то и необходимо
    // поменять namespace для модели описанный в схеме (SCHEME)
    public static void main(String[] args) throws Exception, IOException {

        initPath(args);

        final ExecutionEnvironment env = ExecutionEnvironment.getExecutionEnvironment();
        final BatchTableEnvironment tEnv = BatchTableEnvironment.getTableEnvironment(env);
        final Configuration parameters = new Configuration();

        Table tableData = tEnv.fromDataSet(RedNirDataset.build(parameters, env, pathInput));

        tEnv.registerFunction("posexplode2", new PoseExplodeFunction2());
        tEnv.registerFunction("resultCol", new ResultCollection());

        tEnv.registerTable("tableData", tableData);
        Table tablePosExplode =  tEnv.sqlQuery(" select rowId, colId, valueNIR, valueRed " +
                                                " from tableData INNER JOIN " +
                                                " lateral table(posexplode2(dataNIR, dataRed)) " +
                                                " N(colId, valueNIR, valueRed) on true " +
                                                " where MOD(rowId," + scale +")=0 " +
                                                " and MOD(colId," + scale +")=0 " +
                                                "");
        tEnv.registerTable("tablePosExplode", tablePosExplode);

        Table result = tEnv.sqlQuery("" +
                " select rowId, resultCol(colId,(valueNIR-valueRed)/(valueNIR+valueRed)) AS `result` " +
                                        " from tablePosExplode " +
                                        " group by rowId " +
                                        " ");

        DataSet<Tuple2<Void, ResultIndex>> r =
                tEnv.toDataSet(result, Row.class)
                                        .map(new MapFunction<Row, Tuple2<Void, ResultIndex>>() {
                                            @Override
                                            public Tuple2<Void, ResultIndex> map(Row value) throws Exception {
                                                Integer rowId = (Integer)value.getField(0);
                                                return new Tuple2<>(null,new ResultIndex(rowId, ((Map<Integer, Float>)value.getField(1)).values()));
                                            }
                                        }
                                    );
        Job jobResult = Job.getInstance();
        jobResult.getConfiguration().set("parquet.avro.projection", ResultIndex.SCHEMA$.toString());
        AvroParquetOutputFormat.setSchema(jobResult, ResultIndex.getClassSchema());
        AvroParquetInputFormat.setAvroReadSchema(jobResult, ResultIndex.getClassSchema());
        ParquetOutputFormat.setCompression(jobResult, CompressionCodecName.UNCOMPRESSED);
        ParquetOutputFormat.setEnableDictionary(jobResult, true);
        HadoopOutputFormat parquetFormat = new HadoopOutputFormat<>(new AvroParquetOutputFormat<ResultIndex>(), jobResult);
//
        FileOutputFormat.setOutputPath(jobResult, new Path(pathOutput));
        // Output & Execute
        r.output(parquetFormat);
        env.execute();


    }

    // *************************************************************************
    //     USER DATA TYPES
    // *************************************************************************

}
