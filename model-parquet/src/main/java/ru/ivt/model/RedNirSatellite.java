package ru.ivt.model;

import org.apache.avro.Schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class RedNirSatellite implements Serializable, org.apache.avro.generic.IndexedRecord{
    public static final Schema SCHEMA$ = new Schema.Parser().parse("" +
            "{\"type\":\"record\",\"name\":\"RedNirSatellite\",\"namespace\":\"ru.ivt.model\",\"" +
            "fields\":" +
            "[{\"name\":\"rowId\",\"type\":\"int\"}," +
            "{\"name\":\"width\",\"type\":\"int\"}," +
            "{\"name\":\"height\",\"type\":\"int\"}," +
            "{\"name\":\"projection\",\"type\":\"string\"}," +
            "{\"name\":\"geoTransform\",\"type\":{\"type\":\"array\",\"items\":\"double\"},\"default\":[0]}," +
            "{\"name\":\"dataRed\",\"type\":{\"type\":\"array\",\"items\":\"float\"},\"default\":[0]}," +
            "{\"name\":\"dataNIR\",\"type\":{\"type\":\"array\",\"items\":\"float\"},\"default\":[0]}]}");

    public static Schema getClassSchema() { return SCHEMA$; }
    public Integer rowId;
    public int width;
    public int height;
    public CharSequence projection;
    public java.util.List<Double> geoTransform;
    public List<Float> dataRed;
    public List<Float> dataNIR;

    public RedNirSatellite(){}
    public RedNirSatellite(Integer rowId, Integer width, Integer height, CharSequence projection, java.util.List<Double> geoTransform, List<Float> dataRed, List<Float> dataNIR){
        this.rowId = rowId;
        this.width = width;
        this.height = height;
        this.projection = projection;
        this.geoTransform = geoTransform;
        this.dataRed = dataRed;
        this.dataNIR = dataNIR;
    }
    public RedNirSatellite(Integer rowId, Integer width, Integer height, CharSequence projection, java.util.List<Double> geoTransform, Collection<Float> dataRed, Collection<Float> dataNIR){
        this.rowId = rowId;
        this.width = width;
        this.height = height;
        this.projection = projection;
        this.geoTransform = geoTransform;
        this.dataRed = new ArrayList<>(dataRed);
        this.dataNIR = new ArrayList<>(dataNIR);
    }

    @Override
    public void put(int field$, Object value$) {
        switch (field$) {
            case 0: rowId = (Integer)value$; break;
            case 1: width = (Integer)value$; break;
            case 2: height = (Integer)value$; break;
            case 3: projection = (String)value$; break;
            case 4: geoTransform = (List<Double>)value$; break;
            case 5: dataRed = (List<Float>)value$; break;
            case 6: dataNIR = (List<Float>)value$; break;
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
            case 5: return dataRed;
            case 6: return dataNIR;
            default: throw new org.apache.avro.AvroRuntimeException("Bad index");
        }
    }

    @Override
    public Schema getSchema() {
        return SCHEMA$;
    }
}
