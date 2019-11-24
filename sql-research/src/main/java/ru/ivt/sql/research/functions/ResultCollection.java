package ru.ivt.sql.research.functions;

import org.apache.flink.table.functions.AggregateFunction;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class ResultCollection extends AggregateFunction<Map<Integer, Float>, Map<Integer, Float>> {

    @Override
    public Map<Integer, Float> createAccumulator() {
        return new TreeMap<>();
    }

    @Override
    public Map<Integer, Float> getValue(Map<Integer, Float> integerFloatMap) {
        return integerFloatMap;
    }

    public void accumulate(Map<Integer, Float> acc, Integer iValue, Float iValue2) {
        acc.put(iValue, iValue2);
    }
    public void resetAccumulator(Map<Integer, Float> acc) {
        acc.clear();
    }
    public void merge(Map<Integer, Float> acc, Iterable<Map<Integer, Float>> it) {
        Iterator<Map<Integer, Float>> iter = it.iterator();
        while (iter.hasNext()) {
            acc.putAll(iter.next());
        }
    }
}
