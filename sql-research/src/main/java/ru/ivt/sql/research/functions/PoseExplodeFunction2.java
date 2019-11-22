package ru.ivt.sql.research.functions;

import org.apache.flink.api.java.tuple.Tuple3;
import org.apache.flink.table.functions.TableFunction;

import java.util.List;
import java.util.Objects;
import java.util.stream.IntStream;

public class PoseExplodeFunction2 extends TableFunction<Tuple3<Integer, Float, Float>> {
    public void eval(List<Float> explode1, List<Float> explode2) {
        IntStream.range(0, explode1.size()).boxed().forEach(key->{
            Float value1 = Objects.isNull(explode1.get(key))? 0f : explode1.get(key);
            Float value2 = Objects.isNull(explode2.get(key))? 0f : explode2.get(key);
            collect(new Tuple3<>(key+1, value1, value2));
        });
    }
}