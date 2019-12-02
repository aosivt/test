/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package ru.ivt.model;
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class SatelliteImage extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"SatelliteImage\",\"namespace\":\"ru.ivt.model\",\"fields\":[{\"name\":\"rowId\",\"type\":\"int\"},{\"name\":\"width\",\"type\":\"int\"},{\"name\":\"height\",\"type\":\"int\"},{\"name\":\"projection\",\"type\":\"string\"},{\"name\":\"geoTransform\",\"type\":{\"type\":\"array\",\"items\":\"double\"},\"default\":[0]},{\"name\":\"dataDeepBlue\",\"type\":{\"type\":\"array\",\"items\":\"float\"},\"default\":[0]},{\"name\":\"dataBlue\",\"type\":{\"type\":\"array\",\"items\":\"float\"},\"default\":[0]},{\"name\":\"dataGreen\",\"type\":{\"type\":\"array\",\"items\":\"float\"},\"default\":[0]},{\"name\":\"dataRed\",\"type\":{\"type\":\"array\",\"items\":\"float\"},\"default\":[0]},{\"name\":\"dataNIR\",\"type\":{\"type\":\"array\",\"items\":\"float\"},\"default\":[0]},{\"name\":\"dataSWIR2\",\"type\":{\"type\":\"array\",\"items\":\"float\"},\"default\":[0]},{\"name\":\"dataSWIR3\",\"type\":{\"type\":\"array\",\"items\":\"float\"},\"default\":[0]},{\"name\":\"dataSWIR1\",\"type\":{\"type\":\"array\",\"items\":\"float\"},\"default\":[0]},{\"name\":\"dataCirrus\",\"type\":{\"type\":\"array\",\"items\":\"float\"},\"default\":[0]},{\"name\":\"dataTer\",\"type\":{\"type\":\"array\",\"items\":\"float\"},\"default\":[0]},{\"name\":\"dataTIRS1\",\"type\":{\"type\":\"array\",\"items\":\"float\"},\"default\":[0]},{\"name\":\"dataTIRS2\",\"type\":{\"type\":\"array\",\"items\":\"float\"},\"default\":[0]},{\"name\":\"dataVCID1\",\"type\":{\"type\":\"array\",\"items\":\"float\"},\"default\":[0]},{\"name\":\"dataVCID2\",\"type\":{\"type\":\"array\",\"items\":\"float\"},\"default\":[0]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public int rowId;
  @Deprecated public int width;
  @Deprecated public int height;
  @Deprecated public CharSequence projection;
  @Deprecated public java.util.List<Double> geoTransform;
  @Deprecated public java.util.List<Float> dataDeepBlue;
  @Deprecated public java.util.List<Float> dataBlue;
  @Deprecated public java.util.List<Float> dataGreen;
  @Deprecated public java.util.List<Float> dataRed;
  @Deprecated public java.util.List<Float> dataNIR;
  @Deprecated public java.util.List<Float> dataSWIR2;
  @Deprecated public java.util.List<Float> dataSWIR3;
  @Deprecated public java.util.List<Float> dataSWIR1;
  @Deprecated public java.util.List<Float> dataCirrus;
  @Deprecated public java.util.List<Float> dataTer;
  @Deprecated public java.util.List<Float> dataTIRS1;
  @Deprecated public java.util.List<Float> dataTIRS2;
  @Deprecated public java.util.List<Float> dataVCID1;
  @Deprecated public java.util.List<Float> dataVCID2;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public SatelliteImage() {}

  /**
   * All-args constructor.
   */
  public SatelliteImage(Integer rowId, Integer width, Integer height, CharSequence projection, java.util.List<Double> geoTransform, java.util.List<Float> dataDeepBlue, java.util.List<Float> dataBlue, java.util.List<Float> dataGreen, java.util.List<Float> dataRed, java.util.List<Float> dataNIR, java.util.List<Float> dataSWIR2, java.util.List<Float> dataSWIR3, java.util.List<Float> dataSWIR1, java.util.List<Float> dataCirrus, java.util.List<Float> dataTer, java.util.List<Float> dataTIRS1, java.util.List<Float> dataTIRS2, java.util.List<Float> dataVCID1, java.util.List<Float> dataVCID2) {
    this.rowId = rowId;
    this.width = width;
    this.height = height;
    this.projection = projection;
    this.geoTransform = geoTransform;
    this.dataDeepBlue = dataDeepBlue;
    this.dataBlue = dataBlue;
    this.dataGreen = dataGreen;
    this.dataRed = dataRed;
    this.dataNIR = dataNIR;
    this.dataSWIR2 = dataSWIR2;
    this.dataSWIR3 = dataSWIR3;
    this.dataSWIR1 = dataSWIR1;
    this.dataCirrus = dataCirrus;
    this.dataTer = dataTer;
    this.dataTIRS1 = dataTIRS1;
    this.dataTIRS2 = dataTIRS2;
    this.dataVCID1 = dataVCID1;
    this.dataVCID2 = dataVCID2;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public Object get(int field$) {
    switch (field$) {
    case 0: return rowId;
    case 1: return width;
    case 2: return height;
    case 3: return projection;
    case 4: return geoTransform;
    case 5: return dataDeepBlue;
    case 6: return dataBlue;
    case 7: return dataGreen;
    case 8: return dataRed;
    case 9: return dataNIR;
    case 10: return dataSWIR2;
    case 11: return dataSWIR3;
    case 12: return dataSWIR1;
    case 13: return dataCirrus;
    case 14: return dataTer;
    case 15: return dataTIRS1;
    case 16: return dataTIRS2;
    case 17: return dataVCID1;
    case 18: return dataVCID2;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, Object value$) {
    switch (field$) {
    case 0: rowId = (Integer)value$; break;
    case 1: width = (Integer)value$; break;
    case 2: height = (Integer)value$; break;
    case 3: projection = (CharSequence)value$; break;
    case 4: geoTransform = (java.util.List<Double>)value$; break;
    case 5: dataDeepBlue = (java.util.List<Float>)value$; break;
    case 6: dataBlue = (java.util.List<Float>)value$; break;
    case 7: dataGreen = (java.util.List<Float>)value$; break;
    case 8: dataRed = (java.util.List<Float>)value$; break;
    case 9: dataNIR = (java.util.List<Float>)value$; break;
    case 10: dataSWIR2 = (java.util.List<Float>)value$; break;
    case 11: dataSWIR3 = (java.util.List<Float>)value$; break;
    case 12: dataSWIR1 = (java.util.List<Float>)value$; break;
    case 13: dataCirrus = (java.util.List<Float>)value$; break;
    case 14: dataTer = (java.util.List<Float>)value$; break;
    case 15: dataTIRS1 = (java.util.List<Float>)value$; break;
    case 16: dataTIRS2 = (java.util.List<Float>)value$; break;
    case 17: dataVCID1 = (java.util.List<Float>)value$; break;
    case 18: dataVCID2 = (java.util.List<Float>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'rowId' field.
   */
  public Integer getRowId() {
    return rowId;
  }

  /**
   * Sets the value of the 'rowId' field.
   * @param value the value to set.
   */
  public void setRowId(Integer value) {
    this.rowId = value;
  }

  /**
   * Gets the value of the 'width' field.
   */
  public Integer getWidth() {
    return width;
  }

  /**
   * Sets the value of the 'width' field.
   * @param value the value to set.
   */
  public void setWidth(Integer value) {
    this.width = value;
  }

  /**
   * Gets the value of the 'height' field.
   */
  public Integer getHeight() {
    return height;
  }

  /**
   * Sets the value of the 'height' field.
   * @param value the value to set.
   */
  public void setHeight(Integer value) {
    this.height = value;
  }

  /**
   * Gets the value of the 'projection' field.
   */
  public CharSequence getProjection() {
    return projection;
  }

  /**
   * Sets the value of the 'projection' field.
   * @param value the value to set.
   */
  public void setProjection(CharSequence value) {
    this.projection = value;
  }

  /**
   * Gets the value of the 'geoTransform' field.
   */
  public java.util.List<Double> getGeoTransform() {
    return geoTransform;
  }

  /**
   * Sets the value of the 'geoTransform' field.
   * @param value the value to set.
   */
  public void setGeoTransform(java.util.List<Double> value) {
    this.geoTransform = value;
  }

  /**
   * Gets the value of the 'dataDeepBlue' field.
   */
  public java.util.List<Float> getDataDeepBlue() {
    return dataDeepBlue;
  }

  /**
   * Sets the value of the 'dataDeepBlue' field.
   * @param value the value to set.
   */
  public void setDataDeepBlue(java.util.List<Float> value) {
    this.dataDeepBlue = value;
  }

  /**
   * Gets the value of the 'dataBlue' field.
   */
  public java.util.List<Float> getDataBlue() {
    return dataBlue;
  }

  /**
   * Sets the value of the 'dataBlue' field.
   * @param value the value to set.
   */
  public void setDataBlue(java.util.List<Float> value) {
    this.dataBlue = value;
  }

  /**
   * Gets the value of the 'dataGreen' field.
   */
  public java.util.List<Float> getDataGreen() {
    return dataGreen;
  }

  /**
   * Sets the value of the 'dataGreen' field.
   * @param value the value to set.
   */
  public void setDataGreen(java.util.List<Float> value) {
    this.dataGreen = value;
  }

  /**
   * Gets the value of the 'dataRed' field.
   */
  public java.util.List<Float> getDataRed() {
    return dataRed;
  }

  /**
   * Sets the value of the 'dataRed' field.
   * @param value the value to set.
   */
  public void setDataRed(java.util.List<Float> value) {
    this.dataRed = value;
  }

  /**
   * Gets the value of the 'dataNIR' field.
   */
  public java.util.List<Float> getDataNIR() {
    return dataNIR;
  }

  /**
   * Sets the value of the 'dataNIR' field.
   * @param value the value to set.
   */
  public void setDataNIR(java.util.List<Float> value) {
    this.dataNIR = value;
  }

  /**
   * Gets the value of the 'dataSWIR2' field.
   */
  public java.util.List<Float> getDataSWIR2() {
    return dataSWIR2;
  }

  /**
   * Sets the value of the 'dataSWIR2' field.
   * @param value the value to set.
   */
  public void setDataSWIR2(java.util.List<Float> value) {
    this.dataSWIR2 = value;
  }

  /**
   * Gets the value of the 'dataSWIR3' field.
   */
  public java.util.List<Float> getDataSWIR3() {
    return dataSWIR3;
  }

  /**
   * Sets the value of the 'dataSWIR3' field.
   * @param value the value to set.
   */
  public void setDataSWIR3(java.util.List<Float> value) {
    this.dataSWIR3 = value;
  }

  /**
   * Gets the value of the 'dataSWIR1' field.
   */
  public java.util.List<Float> getDataSWIR1() {
    return dataSWIR1;
  }

  /**
   * Sets the value of the 'dataSWIR1' field.
   * @param value the value to set.
   */
  public void setDataSWIR1(java.util.List<Float> value) {
    this.dataSWIR1 = value;
  }

  /**
   * Gets the value of the 'dataCirrus' field.
   */
  public java.util.List<Float> getDataCirrus() {
    return dataCirrus;
  }

  /**
   * Sets the value of the 'dataCirrus' field.
   * @param value the value to set.
   */
  public void setDataCirrus(java.util.List<Float> value) {
    this.dataCirrus = value;
  }

  /**
   * Gets the value of the 'dataTer' field.
   */
  public java.util.List<Float> getDataTer() {
    return dataTer;
  }

  /**
   * Sets the value of the 'dataTer' field.
   * @param value the value to set.
   */
  public void setDataTer(java.util.List<Float> value) {
    this.dataTer = value;
  }

  /**
   * Gets the value of the 'dataTIRS1' field.
   */
  public java.util.List<Float> getDataTIRS1() {
    return dataTIRS1;
  }

  /**
   * Sets the value of the 'dataTIRS1' field.
   * @param value the value to set.
   */
  public void setDataTIRS1(java.util.List<Float> value) {
    this.dataTIRS1 = value;
  }

  /**
   * Gets the value of the 'dataTIRS2' field.
   */
  public java.util.List<Float> getDataTIRS2() {
    return dataTIRS2;
  }

  /**
   * Sets the value of the 'dataTIRS2' field.
   * @param value the value to set.
   */
  public void setDataTIRS2(java.util.List<Float> value) {
    this.dataTIRS2 = value;
  }

  /**
   * Gets the value of the 'dataVCID1' field.
   */
  public java.util.List<Float> getDataVCID1() {
    return dataVCID1;
  }

  /**
   * Sets the value of the 'dataVCID1' field.
   * @param value the value to set.
   */
  public void setDataVCID1(java.util.List<Float> value) {
    this.dataVCID1 = value;
  }

  /**
   * Gets the value of the 'dataVCID2' field.
   */
  public java.util.List<Float> getDataVCID2() {
    return dataVCID2;
  }

  /**
   * Sets the value of the 'dataVCID2' field.
   * @param value the value to set.
   */
  public void setDataVCID2(java.util.List<Float> value) {
    this.dataVCID2 = value;
  }

  /** Creates a new SatelliteImage RecordBuilder */
  public static ru.ivt.model.SatelliteImage.Builder newBuilder() {
    return new ru.ivt.model.SatelliteImage.Builder();
  }

  /** Creates a new SatelliteImage RecordBuilder by copying an existing Builder */
  public static ru.ivt.model.SatelliteImage.Builder newBuilder(ru.ivt.model.SatelliteImage.Builder other) {
    return new ru.ivt.model.SatelliteImage.Builder(other);
  }

  /** Creates a new SatelliteImage RecordBuilder by copying an existing SatelliteImage instance */
  public static ru.ivt.model.SatelliteImage.Builder newBuilder(ru.ivt.model.SatelliteImage other) {
    return new ru.ivt.model.SatelliteImage.Builder(other);
  }

  /**
   * RecordBuilder for SatelliteImage instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<SatelliteImage>
    implements org.apache.avro.data.RecordBuilder<SatelliteImage> {

    private int rowId;
    private int width;
    private int height;
    private CharSequence projection;
    private java.util.List<Double> geoTransform;
    private java.util.List<Float> dataDeepBlue;
    private java.util.List<Float> dataBlue;
    private java.util.List<Float> dataGreen;
    private java.util.List<Float> dataRed;
    private java.util.List<Float> dataNIR;
    private java.util.List<Float> dataSWIR2;
    private java.util.List<Float> dataSWIR3;
    private java.util.List<Float> dataSWIR1;
    private java.util.List<Float> dataCirrus;
    private java.util.List<Float> dataTer;
    private java.util.List<Float> dataTIRS1;
    private java.util.List<Float> dataTIRS2;
    private java.util.List<Float> dataVCID1;
    private java.util.List<Float> dataVCID2;

    /** Creates a new Builder */
    private Builder() {
      super(ru.ivt.model.SatelliteImage.SCHEMA$);
    }

    /** Creates a Builder by copying an existing Builder */
    private Builder(ru.ivt.model.SatelliteImage.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.rowId)) {
        this.rowId = data().deepCopy(fields()[0].schema(), other.rowId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.width)) {
        this.width = data().deepCopy(fields()[1].schema(), other.width);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.height)) {
        this.height = data().deepCopy(fields()[2].schema(), other.height);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.projection)) {
        this.projection = data().deepCopy(fields()[3].schema(), other.projection);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.geoTransform)) {
        this.geoTransform = data().deepCopy(fields()[4].schema(), other.geoTransform);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.dataDeepBlue)) {
        this.dataDeepBlue = data().deepCopy(fields()[5].schema(), other.dataDeepBlue);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.dataBlue)) {
        this.dataBlue = data().deepCopy(fields()[6].schema(), other.dataBlue);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.dataGreen)) {
        this.dataGreen = data().deepCopy(fields()[7].schema(), other.dataGreen);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.dataRed)) {
        this.dataRed = data().deepCopy(fields()[8].schema(), other.dataRed);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.dataNIR)) {
        this.dataNIR = data().deepCopy(fields()[9].schema(), other.dataNIR);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.dataSWIR2)) {
        this.dataSWIR2 = data().deepCopy(fields()[10].schema(), other.dataSWIR2);
        fieldSetFlags()[10] = true;
      }
      if (isValidValue(fields()[11], other.dataSWIR3)) {
        this.dataSWIR3 = data().deepCopy(fields()[11].schema(), other.dataSWIR3);
        fieldSetFlags()[11] = true;
      }
      if (isValidValue(fields()[12], other.dataSWIR1)) {
        this.dataSWIR1 = data().deepCopy(fields()[12].schema(), other.dataSWIR1);
        fieldSetFlags()[12] = true;
      }
      if (isValidValue(fields()[13], other.dataCirrus)) {
        this.dataCirrus = data().deepCopy(fields()[13].schema(), other.dataCirrus);
        fieldSetFlags()[13] = true;
      }
      if (isValidValue(fields()[14], other.dataTer)) {
        this.dataTer = data().deepCopy(fields()[14].schema(), other.dataTer);
        fieldSetFlags()[14] = true;
      }
      if (isValidValue(fields()[15], other.dataTIRS1)) {
        this.dataTIRS1 = data().deepCopy(fields()[15].schema(), other.dataTIRS1);
        fieldSetFlags()[15] = true;
      }
      if (isValidValue(fields()[16], other.dataTIRS2)) {
        this.dataTIRS2 = data().deepCopy(fields()[16].schema(), other.dataTIRS2);
        fieldSetFlags()[16] = true;
      }
      if (isValidValue(fields()[17], other.dataVCID1)) {
        this.dataVCID1 = data().deepCopy(fields()[17].schema(), other.dataVCID1);
        fieldSetFlags()[17] = true;
      }
      if (isValidValue(fields()[18], other.dataVCID2)) {
        this.dataVCID2 = data().deepCopy(fields()[18].schema(), other.dataVCID2);
        fieldSetFlags()[18] = true;
      }
    }

    /** Creates a Builder by copying an existing SatelliteImage instance */
    private Builder(ru.ivt.model.SatelliteImage other) {
            super(ru.ivt.model.SatelliteImage.SCHEMA$);
      if (isValidValue(fields()[0], other.rowId)) {
        this.rowId = data().deepCopy(fields()[0].schema(), other.rowId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.width)) {
        this.width = data().deepCopy(fields()[1].schema(), other.width);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.height)) {
        this.height = data().deepCopy(fields()[2].schema(), other.height);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.projection)) {
        this.projection = data().deepCopy(fields()[3].schema(), other.projection);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.geoTransform)) {
        this.geoTransform = data().deepCopy(fields()[4].schema(), other.geoTransform);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.dataDeepBlue)) {
        this.dataDeepBlue = data().deepCopy(fields()[5].schema(), other.dataDeepBlue);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.dataBlue)) {
        this.dataBlue = data().deepCopy(fields()[6].schema(), other.dataBlue);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.dataGreen)) {
        this.dataGreen = data().deepCopy(fields()[7].schema(), other.dataGreen);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.dataRed)) {
        this.dataRed = data().deepCopy(fields()[8].schema(), other.dataRed);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.dataNIR)) {
        this.dataNIR = data().deepCopy(fields()[9].schema(), other.dataNIR);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.dataSWIR2)) {
        this.dataSWIR2 = data().deepCopy(fields()[10].schema(), other.dataSWIR2);
        fieldSetFlags()[10] = true;
      }
      if (isValidValue(fields()[11], other.dataSWIR3)) {
        this.dataSWIR3 = data().deepCopy(fields()[11].schema(), other.dataSWIR3);
        fieldSetFlags()[11] = true;
      }
      if (isValidValue(fields()[12], other.dataSWIR1)) {
        this.dataSWIR1 = data().deepCopy(fields()[12].schema(), other.dataSWIR1);
        fieldSetFlags()[12] = true;
      }
      if (isValidValue(fields()[13], other.dataCirrus)) {
        this.dataCirrus = data().deepCopy(fields()[13].schema(), other.dataCirrus);
        fieldSetFlags()[13] = true;
      }
      if (isValidValue(fields()[14], other.dataTer)) {
        this.dataTer = data().deepCopy(fields()[14].schema(), other.dataTer);
        fieldSetFlags()[14] = true;
      }
      if (isValidValue(fields()[15], other.dataTIRS1)) {
        this.dataTIRS1 = data().deepCopy(fields()[15].schema(), other.dataTIRS1);
        fieldSetFlags()[15] = true;
      }
      if (isValidValue(fields()[16], other.dataTIRS2)) {
        this.dataTIRS2 = data().deepCopy(fields()[16].schema(), other.dataTIRS2);
        fieldSetFlags()[16] = true;
      }
      if (isValidValue(fields()[17], other.dataVCID1)) {
        this.dataVCID1 = data().deepCopy(fields()[17].schema(), other.dataVCID1);
        fieldSetFlags()[17] = true;
      }
      if (isValidValue(fields()[18], other.dataVCID2)) {
        this.dataVCID2 = data().deepCopy(fields()[18].schema(), other.dataVCID2);
        fieldSetFlags()[18] = true;
      }
    }

    /** Gets the value of the 'rowId' field */
    public Integer getRowId() {
      return rowId;
    }

    /** Sets the value of the 'rowId' field */
    public ru.ivt.model.SatelliteImage.Builder setRowId(int value) {
      validate(fields()[0], value);
      this.rowId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /** Checks whether the 'rowId' field has been set */
    public boolean hasRowId() {
      return fieldSetFlags()[0];
    }

    /** Clears the value of the 'rowId' field */
    public ru.ivt.model.SatelliteImage.Builder clearRowId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'width' field */
    public Integer getWidth() {
      return width;
    }

    /** Sets the value of the 'width' field */
    public ru.ivt.model.SatelliteImage.Builder setWidth(int value) {
      validate(fields()[1], value);
      this.width = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /** Checks whether the 'width' field has been set */
    public boolean hasWidth() {
      return fieldSetFlags()[1];
    }

    /** Clears the value of the 'width' field */
    public ru.ivt.model.SatelliteImage.Builder clearWidth() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'height' field */
    public Integer getHeight() {
      return height;
    }

    /** Sets the value of the 'height' field */
    public ru.ivt.model.SatelliteImage.Builder setHeight(int value) {
      validate(fields()[2], value);
      this.height = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /** Checks whether the 'height' field has been set */
    public boolean hasHeight() {
      return fieldSetFlags()[2];
    }

    /** Clears the value of the 'height' field */
    public ru.ivt.model.SatelliteImage.Builder clearHeight() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'projection' field */
    public CharSequence getProjection() {
      return projection;
    }

    /** Sets the value of the 'projection' field */
    public ru.ivt.model.SatelliteImage.Builder setProjection(CharSequence value) {
      validate(fields()[3], value);
      this.projection = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /** Checks whether the 'projection' field has been set */
    public boolean hasProjection() {
      return fieldSetFlags()[3];
    }

    /** Clears the value of the 'projection' field */
    public ru.ivt.model.SatelliteImage.Builder clearProjection() {
      projection = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'geoTransform' field */
    public java.util.List<Double> getGeoTransform() {
      return geoTransform;
    }

    /** Sets the value of the 'geoTransform' field */
    public ru.ivt.model.SatelliteImage.Builder setGeoTransform(java.util.List<Double> value) {
      validate(fields()[4], value);
      this.geoTransform = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /** Checks whether the 'geoTransform' field has been set */
    public boolean hasGeoTransform() {
      return fieldSetFlags()[4];
    }

    /** Clears the value of the 'geoTransform' field */
    public ru.ivt.model.SatelliteImage.Builder clearGeoTransform() {
      geoTransform = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'dataDeepBlue' field */
    public java.util.List<Float> getDataDeepBlue() {
      return dataDeepBlue;
    }

    /** Sets the value of the 'dataDeepBlue' field */
    public ru.ivt.model.SatelliteImage.Builder setDataDeepBlue(java.util.List<Float> value) {
      validate(fields()[5], value);
      this.dataDeepBlue = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /** Checks whether the 'dataDeepBlue' field has been set */
    public boolean hasDataDeepBlue() {
      return fieldSetFlags()[5];
    }

    /** Clears the value of the 'dataDeepBlue' field */
    public ru.ivt.model.SatelliteImage.Builder clearDataDeepBlue() {
      dataDeepBlue = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the 'dataBlue' field */
    public java.util.List<Float> getDataBlue() {
      return dataBlue;
    }

    /** Sets the value of the 'dataBlue' field */
    public ru.ivt.model.SatelliteImage.Builder setDataBlue(java.util.List<Float> value) {
      validate(fields()[6], value);
      this.dataBlue = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /** Checks whether the 'dataBlue' field has been set */
    public boolean hasDataBlue() {
      return fieldSetFlags()[6];
    }

    /** Clears the value of the 'dataBlue' field */
    public ru.ivt.model.SatelliteImage.Builder clearDataBlue() {
      dataBlue = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /** Gets the value of the 'dataGreen' field */
    public java.util.List<Float> getDataGreen() {
      return dataGreen;
    }

    /** Sets the value of the 'dataGreen' field */
    public ru.ivt.model.SatelliteImage.Builder setDataGreen(java.util.List<Float> value) {
      validate(fields()[7], value);
      this.dataGreen = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /** Checks whether the 'dataGreen' field has been set */
    public boolean hasDataGreen() {
      return fieldSetFlags()[7];
    }

    /** Clears the value of the 'dataGreen' field */
    public ru.ivt.model.SatelliteImage.Builder clearDataGreen() {
      dataGreen = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /** Gets the value of the 'dataRed' field */
    public java.util.List<Float> getDataRed() {
      return dataRed;
    }

    /** Sets the value of the 'dataRed' field */
    public ru.ivt.model.SatelliteImage.Builder setDataRed(java.util.List<Float> value) {
      validate(fields()[8], value);
      this.dataRed = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /** Checks whether the 'dataRed' field has been set */
    public boolean hasDataRed() {
      return fieldSetFlags()[8];
    }

    /** Clears the value of the 'dataRed' field */
    public ru.ivt.model.SatelliteImage.Builder clearDataRed() {
      dataRed = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    /** Gets the value of the 'dataNIR' field */
    public java.util.List<Float> getDataNIR() {
      return dataNIR;
    }

    /** Sets the value of the 'dataNIR' field */
    public ru.ivt.model.SatelliteImage.Builder setDataNIR(java.util.List<Float> value) {
      validate(fields()[9], value);
      this.dataNIR = value;
      fieldSetFlags()[9] = true;
      return this;
    }

    /** Checks whether the 'dataNIR' field has been set */
    public boolean hasDataNIR() {
      return fieldSetFlags()[9];
    }

    /** Clears the value of the 'dataNIR' field */
    public ru.ivt.model.SatelliteImage.Builder clearDataNIR() {
      dataNIR = null;
      fieldSetFlags()[9] = false;
      return this;
    }

    /** Gets the value of the 'dataSWIR2' field */
    public java.util.List<Float> getDataSWIR2() {
      return dataSWIR2;
    }

    /** Sets the value of the 'dataSWIR2' field */
    public ru.ivt.model.SatelliteImage.Builder setDataSWIR2(java.util.List<Float> value) {
      validate(fields()[10], value);
      this.dataSWIR2 = value;
      fieldSetFlags()[10] = true;
      return this;
    }

    /** Checks whether the 'dataSWIR2' field has been set */
    public boolean hasDataSWIR2() {
      return fieldSetFlags()[10];
    }

    /** Clears the value of the 'dataSWIR2' field */
    public ru.ivt.model.SatelliteImage.Builder clearDataSWIR2() {
      dataSWIR2 = null;
      fieldSetFlags()[10] = false;
      return this;
    }

    /** Gets the value of the 'dataSWIR3' field */
    public java.util.List<Float> getDataSWIR3() {
      return dataSWIR3;
    }

    /** Sets the value of the 'dataSWIR3' field */
    public ru.ivt.model.SatelliteImage.Builder setDataSWIR3(java.util.List<Float> value) {
      validate(fields()[11], value);
      this.dataSWIR3 = value;
      fieldSetFlags()[11] = true;
      return this;
    }

    /** Checks whether the 'dataSWIR3' field has been set */
    public boolean hasDataSWIR3() {
      return fieldSetFlags()[11];
    }

    /** Clears the value of the 'dataSWIR3' field */
    public ru.ivt.model.SatelliteImage.Builder clearDataSWIR3() {
      dataSWIR3 = null;
      fieldSetFlags()[11] = false;
      return this;
    }

    /** Gets the value of the 'dataSWIR1' field */
    public java.util.List<Float> getDataSWIR1() {
      return dataSWIR1;
    }

    /** Sets the value of the 'dataSWIR1' field */
    public ru.ivt.model.SatelliteImage.Builder setDataSWIR1(java.util.List<Float> value) {
      validate(fields()[12], value);
      this.dataSWIR1 = value;
      fieldSetFlags()[12] = true;
      return this;
    }

    /** Checks whether the 'dataSWIR1' field has been set */
    public boolean hasDataSWIR1() {
      return fieldSetFlags()[12];
    }

    /** Clears the value of the 'dataSWIR1' field */
    public ru.ivt.model.SatelliteImage.Builder clearDataSWIR1() {
      dataSWIR1 = null;
      fieldSetFlags()[12] = false;
      return this;
    }

    /** Gets the value of the 'dataCirrus' field */
    public java.util.List<Float> getDataCirrus() {
      return dataCirrus;
    }

    /** Sets the value of the 'dataCirrus' field */
    public ru.ivt.model.SatelliteImage.Builder setDataCirrus(java.util.List<Float> value) {
      validate(fields()[13], value);
      this.dataCirrus = value;
      fieldSetFlags()[13] = true;
      return this;
    }

    /** Checks whether the 'dataCirrus' field has been set */
    public boolean hasDataCirrus() {
      return fieldSetFlags()[13];
    }

    /** Clears the value of the 'dataCirrus' field */
    public ru.ivt.model.SatelliteImage.Builder clearDataCirrus() {
      dataCirrus = null;
      fieldSetFlags()[13] = false;
      return this;
    }

    /** Gets the value of the 'dataTer' field */
    public java.util.List<Float> getDataTer() {
      return dataTer;
    }

    /** Sets the value of the 'dataTer' field */
    public ru.ivt.model.SatelliteImage.Builder setDataTer(java.util.List<Float> value) {
      validate(fields()[14], value);
      this.dataTer = value;
      fieldSetFlags()[14] = true;
      return this;
    }

    /** Checks whether the 'dataTer' field has been set */
    public boolean hasDataTer() {
      return fieldSetFlags()[14];
    }

    /** Clears the value of the 'dataTer' field */
    public ru.ivt.model.SatelliteImage.Builder clearDataTer() {
      dataTer = null;
      fieldSetFlags()[14] = false;
      return this;
    }

    /** Gets the value of the 'dataTIRS1' field */
    public java.util.List<Float> getDataTIRS1() {
      return dataTIRS1;
    }

    /** Sets the value of the 'dataTIRS1' field */
    public ru.ivt.model.SatelliteImage.Builder setDataTIRS1(java.util.List<Float> value) {
      validate(fields()[15], value);
      this.dataTIRS1 = value;
      fieldSetFlags()[15] = true;
      return this;
    }

    /** Checks whether the 'dataTIRS1' field has been set */
    public boolean hasDataTIRS1() {
      return fieldSetFlags()[15];
    }

    /** Clears the value of the 'dataTIRS1' field */
    public ru.ivt.model.SatelliteImage.Builder clearDataTIRS1() {
      dataTIRS1 = null;
      fieldSetFlags()[15] = false;
      return this;
    }

    /** Gets the value of the 'dataTIRS2' field */
    public java.util.List<Float> getDataTIRS2() {
      return dataTIRS2;
    }

    /** Sets the value of the 'dataTIRS2' field */
    public ru.ivt.model.SatelliteImage.Builder setDataTIRS2(java.util.List<Float> value) {
      validate(fields()[16], value);
      this.dataTIRS2 = value;
      fieldSetFlags()[16] = true;
      return this;
    }

    /** Checks whether the 'dataTIRS2' field has been set */
    public boolean hasDataTIRS2() {
      return fieldSetFlags()[16];
    }

    /** Clears the value of the 'dataTIRS2' field */
    public ru.ivt.model.SatelliteImage.Builder clearDataTIRS2() {
      dataTIRS2 = null;
      fieldSetFlags()[16] = false;
      return this;
    }

    /** Gets the value of the 'dataVCID1' field */
    public java.util.List<Float> getDataVCID1() {
      return dataVCID1;
    }

    /** Sets the value of the 'dataVCID1' field */
    public ru.ivt.model.SatelliteImage.Builder setDataVCID1(java.util.List<Float> value) {
      validate(fields()[17], value);
      this.dataVCID1 = value;
      fieldSetFlags()[17] = true;
      return this;
    }

    /** Checks whether the 'dataVCID1' field has been set */
    public boolean hasDataVCID1() {
      return fieldSetFlags()[17];
    }

    /** Clears the value of the 'dataVCID1' field */
    public ru.ivt.model.SatelliteImage.Builder clearDataVCID1() {
      dataVCID1 = null;
      fieldSetFlags()[17] = false;
      return this;
    }

    /** Gets the value of the 'dataVCID2' field */
    public java.util.List<Float> getDataVCID2() {
      return dataVCID2;
    }

    /** Sets the value of the 'dataVCID2' field */
    public ru.ivt.model.SatelliteImage.Builder setDataVCID2(java.util.List<Float> value) {
      validate(fields()[18], value);
      this.dataVCID2 = value;
      fieldSetFlags()[18] = true;
      return this;
    }

    /** Checks whether the 'dataVCID2' field has been set */
    public boolean hasDataVCID2() {
      return fieldSetFlags()[18];
    }

    /** Clears the value of the 'dataVCID2' field */
    public ru.ivt.model.SatelliteImage.Builder clearDataVCID2() {
      dataVCID2 = null;
      fieldSetFlags()[18] = false;
      return this;
    }

    @Override
    public SatelliteImage build() {
      try {
        SatelliteImage record = new SatelliteImage();
        record.rowId = fieldSetFlags()[0] ? this.rowId : (Integer) defaultValue(fields()[0]);
        record.width = fieldSetFlags()[1] ? this.width : (Integer) defaultValue(fields()[1]);
        record.height = fieldSetFlags()[2] ? this.height : (Integer) defaultValue(fields()[2]);
        record.projection = fieldSetFlags()[3] ? this.projection : (CharSequence) defaultValue(fields()[3]);
        record.geoTransform = fieldSetFlags()[4] ? this.geoTransform : (java.util.List<Double>) defaultValue(fields()[4]);
        record.dataDeepBlue = fieldSetFlags()[5] ? this.dataDeepBlue : (java.util.List<Float>) defaultValue(fields()[5]);
        record.dataBlue = fieldSetFlags()[6] ? this.dataBlue : (java.util.List<Float>) defaultValue(fields()[6]);
        record.dataGreen = fieldSetFlags()[7] ? this.dataGreen : (java.util.List<Float>) defaultValue(fields()[7]);
        record.dataRed = fieldSetFlags()[8] ? this.dataRed : (java.util.List<Float>) defaultValue(fields()[8]);
        record.dataNIR = fieldSetFlags()[9] ? this.dataNIR : (java.util.List<Float>) defaultValue(fields()[9]);
        record.dataSWIR2 = fieldSetFlags()[10] ? this.dataSWIR2 : (java.util.List<Float>) defaultValue(fields()[10]);
        record.dataSWIR3 = fieldSetFlags()[11] ? this.dataSWIR3 : (java.util.List<Float>) defaultValue(fields()[11]);
        record.dataSWIR1 = fieldSetFlags()[12] ? this.dataSWIR1 : (java.util.List<Float>) defaultValue(fields()[12]);
        record.dataCirrus = fieldSetFlags()[13] ? this.dataCirrus : (java.util.List<Float>) defaultValue(fields()[13]);
        record.dataTer = fieldSetFlags()[14] ? this.dataTer : (java.util.List<Float>) defaultValue(fields()[14]);
        record.dataTIRS1 = fieldSetFlags()[15] ? this.dataTIRS1 : (java.util.List<Float>) defaultValue(fields()[15]);
        record.dataTIRS2 = fieldSetFlags()[16] ? this.dataTIRS2 : (java.util.List<Float>) defaultValue(fields()[16]);
        record.dataVCID1 = fieldSetFlags()[17] ? this.dataVCID1 : (java.util.List<Float>) defaultValue(fields()[17]);
        record.dataVCID2 = fieldSetFlags()[18] ? this.dataVCID2 : (java.util.List<Float>) defaultValue(fields()[18]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
