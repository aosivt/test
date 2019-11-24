package ru.ivt.service.dataset;

import org.apache.flink.api.java.DataSet;
import org.apache.flink.api.java.ExecutionEnvironment;
import org.apache.flink.api.java.tuple.Tuple2;
import org.apache.flink.configuration.Configuration;
import org.apache.flink.hadoopcompatibility.HadoopInputs;
import org.apache.hadoop.mapreduce.Job;
import org.apache.parquet.avro.AvroParquetInputFormat;
import org.apache.parquet.avro.AvroParquetOutputFormat;
import ru.ivt.model.RedNirSatellite;

import java.io.IOException;

public class RedNirDataset {

    private RedNirDataset() throws IllegalAccessException {
        throw new IllegalAccessException();
    }

    public static DataSet<RedNirSatellite> build(Configuration parameters, ExecutionEnvironment env, String path)
                                                                                                    throws IOException {
        Job job = Job.getInstance();
        job.getConfiguration().set("parquet.avro.projection", RedNirSatellite.SCHEMA$.toString());
        AvroParquetOutputFormat.setSchema(job, RedNirSatellite.getClassSchema());
        AvroParquetInputFormat.setAvroReadSchema(job, RedNirSatellite.getClassSchema());
        AvroParquetInputFormat a = new AvroParquetInputFormat<RedNirSatellite>();

        return env.createInput(HadoopInputs.readHadoopFile(
                        a,
                        Void.class,
                        RedNirSatellite.class,
                        path,
                        job)).withParameters(parameters)
                        .map(m->((Tuple2)m).getField(1))
                        .returns(RedNirSatellite.class);

    }
}
