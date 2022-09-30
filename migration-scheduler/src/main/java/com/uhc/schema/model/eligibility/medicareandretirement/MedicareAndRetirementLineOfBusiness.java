/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.uhc.schema.model.eligibility.medicareandretirement;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class MedicareAndRetirementLineOfBusiness extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -2818900926038057854L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"MedicareAndRetirementLineOfBusiness\",\"namespace\":\"com.uhc.schema.model.eligibility.medicareandretirement\",\"fields\":[{\"name\":\"bitValue\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"description\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"identifier\",\"type\":[\"null\",\"int\"],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<MedicareAndRetirementLineOfBusiness> ENCODER =
      new BinaryMessageEncoder<MedicareAndRetirementLineOfBusiness>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<MedicareAndRetirementLineOfBusiness> DECODER =
      new BinaryMessageDecoder<MedicareAndRetirementLineOfBusiness>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<MedicareAndRetirementLineOfBusiness> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<MedicareAndRetirementLineOfBusiness> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<MedicareAndRetirementLineOfBusiness>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this MedicareAndRetirementLineOfBusiness to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a MedicareAndRetirementLineOfBusiness from a ByteBuffer. */
  public static MedicareAndRetirementLineOfBusiness fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.Integer bitValue;
  @Deprecated public java.lang.CharSequence description;
  @Deprecated public java.lang.Integer identifier;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public MedicareAndRetirementLineOfBusiness() {}

  /**
   * All-args constructor.
   * @param bitValue The new value for bitValue
   * @param description The new value for description
   * @param identifier The new value for identifier
   */
  public MedicareAndRetirementLineOfBusiness(java.lang.Integer bitValue, java.lang.CharSequence description, java.lang.Integer identifier) {
    this.bitValue = bitValue;
    this.description = description;
    this.identifier = identifier;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return bitValue;
    case 1: return description;
    case 2: return identifier;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: bitValue = (java.lang.Integer)value$; break;
    case 1: description = (java.lang.CharSequence)value$; break;
    case 2: identifier = (java.lang.Integer)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'bitValue' field.
   * @return The value of the 'bitValue' field.
   */
  public java.lang.Integer getBitValue() {
    return bitValue;
  }

  /**
   * Sets the value of the 'bitValue' field.
   * @param value the value to set.
   */
  public void setBitValue(java.lang.Integer value) {
    this.bitValue = value;
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
   * Gets the value of the 'identifier' field.
   * @return The value of the 'identifier' field.
   */
  public java.lang.Integer getIdentifier() {
    return identifier;
  }

  /**
   * Sets the value of the 'identifier' field.
   * @param value the value to set.
   */
  public void setIdentifier(java.lang.Integer value) {
    this.identifier = value;
  }

  /**
   * Creates a new MedicareAndRetirementLineOfBusiness RecordBuilder.
   * @return A new MedicareAndRetirementLineOfBusiness RecordBuilder
   */
  public static com.uhc.schema.model.eligibility.medicareandretirement.MedicareAndRetirementLineOfBusiness.Builder newBuilder() {
    return new com.uhc.schema.model.eligibility.medicareandretirement.MedicareAndRetirementLineOfBusiness.Builder();
  }

  /**
   * Creates a new MedicareAndRetirementLineOfBusiness RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new MedicareAndRetirementLineOfBusiness RecordBuilder
   */
  public static com.uhc.schema.model.eligibility.medicareandretirement.MedicareAndRetirementLineOfBusiness.Builder newBuilder(com.uhc.schema.model.eligibility.medicareandretirement.MedicareAndRetirementLineOfBusiness.Builder other) {
    return new com.uhc.schema.model.eligibility.medicareandretirement.MedicareAndRetirementLineOfBusiness.Builder(other);
  }

  /**
   * Creates a new MedicareAndRetirementLineOfBusiness RecordBuilder by copying an existing MedicareAndRetirementLineOfBusiness instance.
   * @param other The existing instance to copy.
   * @return A new MedicareAndRetirementLineOfBusiness RecordBuilder
   */
  public static com.uhc.schema.model.eligibility.medicareandretirement.MedicareAndRetirementLineOfBusiness.Builder newBuilder(com.uhc.schema.model.eligibility.medicareandretirement.MedicareAndRetirementLineOfBusiness other) {
    return new com.uhc.schema.model.eligibility.medicareandretirement.MedicareAndRetirementLineOfBusiness.Builder(other);
  }

  /**
   * RecordBuilder for MedicareAndRetirementLineOfBusiness instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<MedicareAndRetirementLineOfBusiness>
    implements org.apache.avro.data.RecordBuilder<MedicareAndRetirementLineOfBusiness> {

    private java.lang.Integer bitValue;
    private java.lang.CharSequence description;
    private java.lang.Integer identifier;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.uhc.schema.model.eligibility.medicareandretirement.MedicareAndRetirementLineOfBusiness.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.bitValue)) {
        this.bitValue = data().deepCopy(fields()[0].schema(), other.bitValue);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.description)) {
        this.description = data().deepCopy(fields()[1].schema(), other.description);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.identifier)) {
        this.identifier = data().deepCopy(fields()[2].schema(), other.identifier);
        fieldSetFlags()[2] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing MedicareAndRetirementLineOfBusiness instance
     * @param other The existing instance to copy.
     */
    private Builder(com.uhc.schema.model.eligibility.medicareandretirement.MedicareAndRetirementLineOfBusiness other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.bitValue)) {
        this.bitValue = data().deepCopy(fields()[0].schema(), other.bitValue);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.description)) {
        this.description = data().deepCopy(fields()[1].schema(), other.description);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.identifier)) {
        this.identifier = data().deepCopy(fields()[2].schema(), other.identifier);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'bitValue' field.
      * @return The value.
      */
    public java.lang.Integer getBitValue() {
      return bitValue;
    }

    /**
      * Sets the value of the 'bitValue' field.
      * @param value The value of 'bitValue'.
      * @return This builder.
      */
    public com.uhc.schema.model.eligibility.medicareandretirement.MedicareAndRetirementLineOfBusiness.Builder setBitValue(java.lang.Integer value) {
      validate(fields()[0], value);
      this.bitValue = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'bitValue' field has been set.
      * @return True if the 'bitValue' field has been set, false otherwise.
      */
    public boolean hasBitValue() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'bitValue' field.
      * @return This builder.
      */
    public com.uhc.schema.model.eligibility.medicareandretirement.MedicareAndRetirementLineOfBusiness.Builder clearBitValue() {
      bitValue = null;
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
    public com.uhc.schema.model.eligibility.medicareandretirement.MedicareAndRetirementLineOfBusiness.Builder setDescription(java.lang.CharSequence value) {
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
    public com.uhc.schema.model.eligibility.medicareandretirement.MedicareAndRetirementLineOfBusiness.Builder clearDescription() {
      description = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'identifier' field.
      * @return The value.
      */
    public java.lang.Integer getIdentifier() {
      return identifier;
    }

    /**
      * Sets the value of the 'identifier' field.
      * @param value The value of 'identifier'.
      * @return This builder.
      */
    public com.uhc.schema.model.eligibility.medicareandretirement.MedicareAndRetirementLineOfBusiness.Builder setIdentifier(java.lang.Integer value) {
      validate(fields()[2], value);
      this.identifier = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'identifier' field has been set.
      * @return True if the 'identifier' field has been set, false otherwise.
      */
    public boolean hasIdentifier() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'identifier' field.
      * @return This builder.
      */
    public com.uhc.schema.model.eligibility.medicareandretirement.MedicareAndRetirementLineOfBusiness.Builder clearIdentifier() {
      identifier = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public MedicareAndRetirementLineOfBusiness build() {
      try {
        MedicareAndRetirementLineOfBusiness record = new MedicareAndRetirementLineOfBusiness();
        record.bitValue = fieldSetFlags()[0] ? this.bitValue : (java.lang.Integer) defaultValue(fields()[0]);
        record.description = fieldSetFlags()[1] ? this.description : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.identifier = fieldSetFlags()[2] ? this.identifier : (java.lang.Integer) defaultValue(fields()[2]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<MedicareAndRetirementLineOfBusiness>
    WRITER$ = (org.apache.avro.io.DatumWriter<MedicareAndRetirementLineOfBusiness>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<MedicareAndRetirementLineOfBusiness>
    READER$ = (org.apache.avro.io.DatumReader<MedicareAndRetirementLineOfBusiness>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
