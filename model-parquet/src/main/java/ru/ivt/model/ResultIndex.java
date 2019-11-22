package ru.ivt.model;

import org.apache.avro.Schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ResultIndex implements Serializable, org.apache.avro.generic.IndexedRecord{
    public static final Schema SCHEMA$ = new Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ResultIndex\",\"namespace\":\"ru.ivt.model\",\"fields\":[{\"name\":\"rowId\",\"type\":\"int\"},{\"name\":\"result\",\"type\":{\"type\":\"array\",\"items\":\"float\"},\"default\":[0]}]}");
    public static Schema getClassSchema() { return SCHEMA$; }
    public Integer rowId;
    public List<Float> result;

    public ResultIndex(){}
    public ResultIndex(Integer rowId, List<Float> result){
        this.rowId = rowId;
        this.result = result;
    }
    public ResultIndex(Integer rowId, Collection<Float> result){
        this.rowId = rowId;
        this.result = new ArrayList<>(result);
    }

    public Integer getRowId() {
        return rowId;
    }

    public void setRowId(Integer rowId) {
        this.rowId = rowId;
    }

    public List<Float> getResult() {
        return result;
    }

    public void setResult(List<Float> result) {
        this.result = result;
    }

    @Override
    public void put(int field$, Object value$) {
        switch (field$) {
            case 0: rowId = (Integer)value$; break;
            case 1: result = (List<Float>)value$; break;
            default: throw new org.apache.avro.AvroRuntimeException("Bad index");
        }
    }

    @Override
    public Object get(int field$) {
        switch (field$) {
            case 0: return rowId;
            case 1: return result;
            default: throw new org.apache.avro.AvroRuntimeException("Bad index");
        }
    }

    @Override
    public Schema getSchema() {
        return SCHEMA$;
    }
}
