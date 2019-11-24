package ru.ivt.program.research.functions;

import org.apache.flink.api.common.typeinfo.TypeInformation;
import org.apache.flink.table.api.Types;
import org.apache.flink.table.functions.ScalarFunction;
import ru.ivt.program.research.Research;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DviFunction extends ScalarFunction {
    public Float[] eval(List<Float> red, List<Float> nir) {
        return IntStream.range(0, red.size()).boxed().sequential()
                .filter(index -> index% Research.scale==0)
                .map(i-> (nir.get(i)-red.get(i)))
                .collect(Collectors.toList()).toArray(new Float[]{});
    }
    @Override
    public TypeInformation<?> getResultType(Class<?>[] signature) {
        return Types.OBJECT_ARRAY(Types.FLOAT());
    }
}
