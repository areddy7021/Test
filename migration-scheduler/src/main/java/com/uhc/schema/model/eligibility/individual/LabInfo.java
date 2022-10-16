/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.uhc.schema.model.eligibility.individual;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class LabInfo extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 7757322160843870105L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"LabInfo\",\"namespace\":\"com.uhc.schema.model.eligibility.individual\",\"fields\":[{\"name\":\"active\",\"type\":\"boolean\",\"default\":false},{\"name\":\"description\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"effectiveCancelDate\",\"type\":[\"null\",\"string\"],\"doc\":\"Date format: CCYY-MM-DD\",\"default\":null},{\"name\":\"effectiveStartDate\",\"type\":[\"null\",\"string\"],\"doc\":\"Date format: CCYY-MM-DD\",\"default\":null},{\"name\":\"labType\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"DescriptionType\",\"namespace\":\"com.uhc.schema.model.eligibility.common\",\"fields\":[{\"name\":\"code\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"description\",\"type\":[\"null\",\"string\"],\"default\":null}]}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<LabInfo> ENCODER =
      new BinaryMessageEncoder<LabInfo>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<LabInfo> DECODER =
      new BinaryMessageDecoder<LabInfo>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<LabInfo> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<LabInfo> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<LabInfo>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this LabInfo to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a LabInfo from a ByteBuffer. */
  public static LabInfo fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public boolean active;
  @Deprecated public java.lang.CharSequence description;
  /** Date format: CCYY-MM-DD */
  @Deprecated public java.lang.CharSequence effectiveCancelDate;
  /** Date format: CCYY-MM-DD */
  @Deprecated public java.lang.CharSequence effectiveStartDate;
  @Deprecated public com.uhc.schema.model.eligibility.common.DescriptionType labType;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public LabInfo() {}

  /**
   * All-args constructor.
   * @param active The new value for active
   * @param description The new value for description
   * @param effectiveCancelDate Date format: CCYY-MM-DD
   * @param effectiveStartDate Date format: CCYY-MM-DD
   * @param labType The new value for labType
   */
  public LabInfo(java.lang.Boolean active, java.lang.CharSequence description, java.lang.CharSequence effectiveCancelDate, java.lang.CharSequence effectiveStartDate, com.uhc.schema.model.eligibility.common.DescriptionType labType) {
    this.active = active;
    this.description = description;
    this.effectiveCancelDate = effectiveCancelDate;
    this.effectiveStartDate = effectiveStartDate;
    this.labType = labType;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return active;
    case 1: return description;
    case 2: return effectiveCancelDate;
    case 3: return effectiveStartDate;
    case 4: return labType;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: active = (java.lang.Boolean)value$; break;
    case 1: description = (java.lang.CharSequence)value$; break;
    case 2: effectiveCancelDate = (java.lang.CharSequence)value$; break;
    case 3: effectiveStartDate = (java.lang.CharSequence)value$; break;
    case 4: labType = (com.uhc.schema.model.eligibility.common.DescriptionType)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'active' field.
   * @return The value of the 'active' field.
   */
  public java.lang.Boolean getActive() {
    return active;
  }

  /**
   * Sets the value of the 'active' field.
   * @param value the value to set.
   */
  public void setActive(java.lang.Boolean value) {
    this.active = value;
  }

  /**
   * Gets the value of the 'description' field.
   * @return The value of the 'description' field.
   */
  public java.lang.CharSequence getDescription() {
    return description;
  }

  /**
   * Sets the value of the 'description' field.
   * @param value the value to set.
   */
  public void setDescription(java.lang.CharSequence value) {
    this.description = value;
  }

  /**
   * Gets the value of the 'effectiveCancelDate' field.
   * @return Date format: CCYY-MM-DD
   */
  public java.lang.CharSequence getEffectiveCancelDate() {
    return effectiveCancelDate;
  }

  /**
   * Sets the value of the 'effectiveCancelDate' field.
   * Date format: CCYY-MM-DD
   * @param value the value to set.
   */
  public void setEffectiveCancelDate(java.lang.CharSequence value) {
    this.effectiveCancelDate = value;
  }

  /**
   * Gets the value of the 'effectiveStartDate' field.
   * @return Date format: CCYY-MM-DD
   */
  public java.lang.CharSequence getEffectiveStartDate() {
    return effectiveStartDate;
  }

  /**
   * Sets the value of the 'effectiveStartDate' field.
   * Date format: CCYY-MM-DD
   * @param value the value to set.
   */
  public void setEffectiveStartDate(java.lang.CharSequence value) {
    this.effectiveStartDate = value;
  }

  /**
   * Gets the value of the 'labType' field.
   * @return The value of the 'labType' field.
   */
  public com.uhc.schema.model.eligibility.common.DescriptionType getLabType() {
    return labType;
  }

  /**
   * Sets the value of the 'labType' field.
   * @param value the value to set.
   */
  public void setLabType(com.uhc.schema.model.eligibility.common.DescriptionType value) {
    this.labType = value;
  }

  /**
   * Creates a new LabInfo RecordBuilder.
   * @return A new LabInfo RecordBuilder
   */
  public static com.uhc.schema.model.eligibility.individual.LabInfo.Builder newBuilder() {
    return new com.uhc.schema.model.eligibility.individual.LabInfo.Builder();
  }

  /**
   * Creates a new LabInfo RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new LabInfo RecordBuilder
   */
  public static com.uhc.schema.model.eligibility.individual.LabInfo.Builder newBuilder(com.uhc.schema.model.eligibility.individual.LabInfo.Builder other) {
    return new com.uhc.schema.model.eligibility.individual.LabInfo.Builder(other);
  }

  /**
   * Creates a new LabInfo RecordBuilder by copying an existing LabInfo instance.
   * @param other The existing instance to copy.
   * @return A new LabInfo RecordBuilder
   */
  public static com.uhc.schema.model.eligibility.individual.LabInfo.Builder newBuilder(com.uhc.schema.model.eligibility.individual.LabInfo other) {
    return new com.uhc.schema.model.eligibility.individual.LabInfo.Builder(other);
  }

  /**
   * RecordBuilder for LabInfo instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<LabInfo>
    implements org.apache.avro.data.RecordBuilder<LabInfo> {

    private boolean active;
    private java.lang.CharSequence description;
    /** Date format: CCYY-MM-DD */
    private java.lang.CharSequence effectiveCancelDate;
    /** Date format: CCYY-MM-DD */
    private java.lang.CharSequence effectiveStartDate;
    private com.uhc.schema.model.eligibility.common.DescriptionType labType;
    private com.uhc.schema.model.eligibility.common.DescriptionType.Builder labTypeBuilder;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.uhc.schema.model.eligibility.individual.LabInfo.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.active)) {
        this.active = data().deepCopy(fields()[0].schema(), other.active);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.description)) {
        this.description = data().deepCopy(fields()[1].schema(), other.description);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.effectiveCancelDate)) {
        this.effectiveCancelDate = data().deepCopy(fields()[2].schema(), other.effectiveCancelDate);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.effectiveStartDate)) {
        this.effectiveStartDate = data().deepCopy(fields()[3].schema(), other.effectiveStartDate);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.labType)) {
        this.labType = data().deepCopy(fields()[4].schema(), other.labType);
        fieldSetFlags()[4] = true;
      }
      if (other.hasLabTypeBuilder()) {
        this.labTypeBuilder = com.uhc.schema.model.eligibility.common.DescriptionType.newBuilder(other.getLabTypeBuilder());
      }
    }

    /**
     * Creates a Builder by copying an existing LabInfo instance
     * @param other The existing instance to copy.
     */
    private Builder(com.uhc.schema.model.eligibility.individual.LabInfo other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.active)) {
        this.active = data().deepCopy(fields()[0].schema(), other.active);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.description)) {
        this.description = data().deepCopy(fields()[1].schema(), other.description);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.effectiveCancelDate)) {
        this.effectiveCancelDate = data().deepCopy(fields()[2].schema(), other.effectiveCancelDate);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.effectiveStartDate)) {
        this.effectiveStartDate = data().deepCopy(fields()[3].schema(), other.effectiveStartDate);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.labType)) {
        this.labType = data().deepCopy(fields()[4].schema(), other.labType);
        fieldSetFlags()[4] = true;
      }
      this.labTypeBuilder = null;
    }

    /**
      * Gets the value of the 'active' field.
      * @return The value.
      */
    public java.lang.Boolean getActive() {
      return active;
    }

    /**
      * Sets the value of the 'active' field.
      * @param value The value of 'active'.
      * @return This builder.
      */
    public com.uhc.schema.model.eligibility.individual.LabInfo.Builder setActive(boolean value) {
      validate(fields()[0], value);
      this.active = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'active' field has been set.
      * @return True if the 'active' field has been set, false otherwise.
      */
    public boolean hasActive() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'active' field.
      * @return This builder.
      */
    public com.uhc.schema.model.eligibility.individual.LabInfo.Builder clearActive() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'description' field.
      * @return The value.
      */
    public java.lang.CharSequence getDescription() {
      return description;
    }

    /**
      * Sets the value of the 'description' field.
      * @param value The value of 'description'.
      * @return This builder.
      */
    public com.uhc.schema.model.eligibility.individual.LabInfo.Builder setDescription(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.description = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'description' field has been set.
      * @return True if the 'description' field has been set, false otherwise.
      */
    public boolean hasDescription() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'description' field.
      * @return This builder.
      */
    public com.uhc.schema.model.eligibility.individual.LabInfo.Builder clearDescription() {
      description = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'effectiveCancelDate' field.
      * Date format: CCYY-MM-DD
      * @return The value.
      */
    public java.lang.CharSequence getEffectiveCancelDate() {
      return effectiveCancelDate;
    }

    /**
      * Sets the value of the 'effectiveCancelDate' field.
      * Date format: CCYY-MM-DD
      * @param value The value of 'effectiveCancelDate'.
      * @return This builder.
      */
    public com.uhc.schema.model.eligibility.individual.LabInfo.Builder setEffectiveCancelDate(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.effectiveCancelDate = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'effectiveCancelDate' field has been set.
      * Date format: CCYY-MM-DD
      * @return True if the 'effectiveCancelDate' field has been set, false otherwise.
      */
    public boolean hasEffectiveCancelDate() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'effectiveCancelDate' field.
      * Date format: CCYY-MM-DD
      * @return This builder.
      */
    public com.uhc.schema.model.eligibility.individual.LabInfo.Builder clearEffectiveCancelDate() {
      effectiveCancelDate = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'effectiveStartDate' field.
      * Date format: CCYY-MM-DD
      * @return The value.
      */
    public java.lang.CharSequence getEffectiveStartDate() {
      return effectiveStartDate;
    }

    /**
      * Sets the value of the 'effectiveStartDate' field.
      * Date format: CCYY-MM-DD
      * @param value The value of 'effectiveStartDate'.
      * @return This builder.
      */
    public com.uhc.schema.model.eligibility.individual.LabInfo.Builder setEffectiveStartDate(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.effectiveStartDate = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'effectiveStartDate' field has been set.
      * Date format: CCYY-MM-DD
      * @return True if the 'effectiveStartDate' field has been set, false otherwise.
      */
    public boolean hasEffectiveStartDate() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'effectiveStartDate' field.
      * Date format: CCYY-MM-DD
      * @return This builder.
      */
    public com.uhc.schema.model.eligibility.individual.LabInfo.Builder clearEffectiveStartDate() {
      effectiveStartDate = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'labType' field.
      * @return The value.
      */
    public com.uhc.schema.model.eligibility.common.DescriptionType getLabType() {
      return labType;
    }

    /**
      * Sets the value of the 'labType' field.
      * @param value The value of 'labType'.
      * @return This builder.
      */
    public com.uhc.schema.model.eligibility.individual.LabInfo.Builder setLabType(com.uhc.schema.model.eligibility.common.DescriptionType value) {
      validate(fields()[4], value);
      this.labTypeBuilder = null;
      this.labType = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'labType' field has been set.
      * @return True if the 'labType' field has been set, false otherwise.
      */
    public boolean hasLabType() {
      return fieldSetFlags()[4];
    }

    /**
     * Gets the Builder instance for the 'labType' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.uhc.schema.model.eligibility.common.DescriptionType.Builder getLabTypeBuilder() {
      if (labTypeBuilder == null) {
        if (hasLabType()) {
          setLabTypeBuilder(com.uhc.schema.model.eligibility.common.DescriptionType.newBuilder(labType));
        } else {
          setLabTypeBuilder(com.uhc.schema.model.eligibility.common.DescriptionType.newBuilder());
        }
      }
      return labTypeBuilder;
    }

    /**
     * Sets the Builder instance for the 'labType' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public com.uhc.schema.model.eligibility.individual.LabInfo.Builder setLabTypeBuilder(com.uhc.schema.model.eligibility.common.DescriptionType.Builder value) {
      clearLabType();
      labTypeBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'labType' field has an active Builder instance
     * @return True if the 'labType' field has an active Builder instance
     */
    public boolean hasLabTypeBuilder() {
      return labTypeBuilder != null;
    }

    /**
      * Clears the value of the 'labType' field.
      * @return This builder.
      */
    public com.uhc.schema.model.eligibility.individual.LabInfo.Builder clearLabType() {
      labType = null;
      labTypeBuilder = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public LabInfo build() {
      try {
        LabInfo record = new LabInfo();
        record.active = fieldSetFlags()[0] ? this.active : (java.lang.Boolean) defaultValue(fields()[0]);
        record.description = fieldSetFlags()[1] ? this.description : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.effectiveCancelDate = fieldSetFlags()[2] ? this.effectiveCancelDate : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.effectiveStartDate = fieldSetFlags()[3] ? this.effectiveStartDate : (java.lang.CharSequence) defaultValue(fields()[3]);
        if (labTypeBuilder != null) {
          record.labType = this.labTypeBuilder.build();
        } else {
          record.labType = fieldSetFlags()[4] ? this.labType : (com.uhc.schema.model.eligibility.common.DescriptionType) defaultValue(fields()[4]);
        }
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<LabInfo>
    WRITER$ = (org.apache.avro.io.DatumWriter<LabInfo>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<LabInfo>
    READER$ = (org.apache.avro.io.DatumReader<LabInfo>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}