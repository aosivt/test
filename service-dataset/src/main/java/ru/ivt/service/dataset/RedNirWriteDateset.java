package ru.ivt.service.dataset;

import org.apache.flink.api.common.functions.MapFunction;
import org.apache.flink.api.java.DataSet;
import org.apache.flink.api.java.hadoop.mapreduce.HadoopOutputFormat;
import org.apache.flink.api.java.tuple.Tuple2;
import org.apache.flink.table.api.Table;
import org.apache.flink.table.api.java.BatchTableEnvironment;
import org.apache.flink.types.Row;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.parquet.avro.AvroParquetInputFormat;
import org.apache.parquet.avro.AvroParquetOutputFormat;
import org.apache.parquet.hadoop.ParquetOutputFormat;
import org.apache.parquet.hadoop.metadata.CompressionCodecName;
import ru.ivt.model.ResultIndex;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class RedNirWriteDateset {
    final BatchTableEnvironment tEnv;
    final String nameFunction;
    final String scale;
    final String pathOutput;
    final Table registerTable;
    private RedNirWriteDateset(final BatchTableEnvironment tEnv, final String nameFunction, final String scale,final String pathOutput, final Table registerTable) {
        this.tEnv = tEnv;
        this.nameFunction = nameFunction;
        this.scale = scale;
        this.pathOutput = pathOutput;
        this.registerTable = registerTable;
    }
    public static class Builder{
        private BatchTableEnvironment tEnv;
        private String nameFunction;
        private String scale = "1";
        private String pathOutput;
        private Table registerTable;

        public RedNirWriteDateset build(){
            if (Objects.isNull(tEnv)||Objects.isNull(nameFunction)||Objects.isNull(scale)||Objects.isNull(pathOutput)||Objects.isNull(registerTable))
                throw new IllegalArgumentException("Заполнены не все элементы");
            return new RedNirWriteDateset(tEnv,nameFunction,scale,pathOutput,registerTable);
        }

        public Builder settEnv(BatchTableEnvironment tEnv) {
            this.tEnv = tEnv;
            return this;

        }

        public Builder setNameFunction(String nameFunction) {
            this.nameFunction = nameFunction;
            return this;
        }

        public Builder setScale(String scale) {
            this.scale = scale;
            return this;
        }

        public Builder setPathOutput(String pathOutput) {
            this.pathOutput = pathOutput;
            return this;
        }

        public Builder setRegisterTable(Table registerTable) {
            this.registerTable = registerTable;
            return this;
        }
        public static Builder getInstance(){
            return new Builder();
        }

    }

    public void write() throws IOException {
        Table result = tEnv.sqlQuery("" +
                " (select rowId,width,height,projection,geoTransform, "+nameFunction+"(dataRed, dataNIR) AS `result` " +
                " from " + registerTable +
                " where MOD(rowId," + scale +")=0 " +
                ") " +
                " ");

        DataSet<Tuple2<Void, ResultIndex>> r =
                tEnv.toDataSet(result, Row.class)
                        .map(new MapFunction<Row, Tuple2<Void, ResultIndex>>() {
                            @Override
                            public Tuple2<Void, ResultIndex> map(Row row) throws Exception {

                                return new Tuple2<Void, ResultIndex>
                                        (null,new ResultIndex(
                                                (Integer)row.getField(0),
                                                (Integer)row.getField(1),
                                                (Integer)row.getField(2),
                                                (String)row.getField(3),
                                                (List<Double>)row.getField(4),
                                                Arrays.asList((Float[]) row.getField(5)))
                                        );
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
    }
}
