package ru.ivt.model;

import org.apache.avro.Schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ResultIndex implements Serializable, org.apache.avro.generic.IndexedRecord{
    public static final Schema SCHEMA$ = new Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ResultIndex\",\"namespace\":\"ru.ivt.model\"," +
            "\"fields\":" +
            "[{\"name\":\"rowId\",\"type\":\"int\"}," +
            "{\"name\":\"width\",\"type\":\"int\"}," +
            "{\"name\":\"height\",\"type\":\"int\"}," +
            "{\"name\":\"projection\",\"type\":\"string\"}," +
            "{\"name\":\"geoTransform\",\"type\":{\"type\":\"array\",\"items\":\"double\"},\"default\":[0]}," +
            "{\"name\":\"result\",\"type\":{\"type\":\"array\",\"items\":\"float\"},\"default\":[0]}]}" +
            "");
    public static Schema getClassSchema() { return SCHEMA$; }
    public Integer rowId;
    public int width;
    public int height;
    public CharSequence projection;
    public java.util.List<Double> geoTransform;
    public List<Float> result;

    public ResultIndex(){}
    public ResultIndex(Integer rowId, Integer width, Integer height, CharSequence projection, java.util.List<Double> geoTransform, List<Float> result){
        this.rowId = rowId;
        this.width = width;
        this.height = height;
        this.projection = projection;
        this.geoTransform = geoTransform;
        this.result = result;
    }
    public ResultIndex(Integer rowId, Integer width, Integer height, CharSequence projection, java.util.List<Double> geoTransform, Collection<Float> result){
        this.rowId = rowId;
        this.width = width;
        this.height = height;
        this.projection = projection;
        this.geoTransform = geoTransform;
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
            case 1: width = (Integer)value$; break;
            case 2: height = (Integer)value$; break;
            case 3: projection = (String)value$; break;
            case 4: geoTransform = (List<Double>)value$; break;
            case 5: result = (List<Float>)value$; break;
            default: throw new org.apache.avro.AvroRuntimeException("Bad index");
        }
    }

    @Override
    public Object get(int field$) {
        switch (field$) {
            case 0: return rowId;
            case 1: return width;
            case 2: return height;
            case 3: return projection;
            case 4: return geoTransform;
            case 5: return result;
            default: throw new org.apache.avro.AvroRuntimeException("Bad index");
        }
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public CharSequence getProjection() {
        return projection;
    }

    public void setProjection(CharSequence projection) {
        this.projection = projection;
    }

    public List<Double> getGeoTransform() {
        return geoTransform;
    }

    public void setGeoTransform(List<Double> geoTransform) {
        this.geoTransform = geoTransform;
    }

    @Override
    public Schema getSchema() {
        return SCHEMA$;
    }
}
