package ru.ivt.sql.research.functions;

import org.apache.flink.api.java.tuple.Tuple2;
import org.apache.flink.table.functions.TableFunction;

import java.util.List;
import java.util.Objects;
import java.util.stream.IntStream;

public class PoseExplodeFunction extends TableFunction<Tuple2<Integer, Float>> {
    public void eval(List<Float> explode) {
        IntStream.range(0, explode.size()).boxed().sequential().forEach(key->{
            Float value = Objects.isNull(explode.get(key))? 0f : explode.get(key);
            collect(new Tuple2<>(key, value));
        });
    }
}