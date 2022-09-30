/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.uhc.schema.model.eligibility.boss;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class BossMembershipSourceSystemAttributes extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -221738467269079076L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"BossMembershipSourceSystemAttributes\",\"namespace\":\"com.uhc.schema.model.eligibility.boss\",\"fields\":[{\"name\":\"customerAccountIdentifier\",\"type\":[\"null\",\"string\"],\"doc\":\"The customerAccountIdentifier as stored in BOSS (ie. padded with leading zeroes to minimum length of 9)\",\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<BossMembershipSourceSystemAttributes> ENCODER =
      new BinaryMessageEncoder<BossMembershipSourceSystemAttributes>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<BossMembershipSourceSystemAttributes> DECODER =
      new BinaryMessageDecoder<BossMembershipSourceSystemAttributes>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<BossMembershipSourceSystemAttributes> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<BossMembershipSourceSystemAttributes> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<BossMembershipSourceSystemAttributes>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this BossMembershipSourceSystemAttributes to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a BossMembershipSourceSystemAttributes from a ByteBuffer. */
  public static BossMembershipSourceSystemAttributes fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** The customerAccountIdentifier as stored in BOSS (ie. padded with leading zeroes to minimum length of 9) */
  @Deprecated public java.lang.CharSequence customerAccountIdentifier;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public BossMembershipSourceSystemAttributes() {}

  /**
   * All-args constructor.
   * @param customerAccountIdentifier The customerAccountIdentifier as stored in BOSS (ie. padded with leading zeroes to minimum length of 9)
   */
  public BossMembershipSourceSystemAttributes(java.lang.CharSequence customerAccountIdentifier) {
    this.customerAccountIdentifier = customerAccountIdentifier;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return customerAccountIdentifier;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: customerAccountIdentifier = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'customerAccountIdentifier' field.
   * @return The customerAccountIdentifier as stored in BOSS (ie. padded with leading zeroes to minimum length of 9)
   */
  public java.lang.CharSequence getCustomerAccountIdentifier() {
    return customerAccountIdentifier;
  }

  /**
   * Sets the value of the 'customerAccountIdentifier' field.
   * The customerAccountIdentifier as stored in BOSS (ie. padded with leading zeroes to minimum length of 9)
   * @param value the value to set.
   */
  public void setCustomerAccountIdentifier(java.lang.CharSequence value) {
    this.customerAccountIdentifier = value;
  }

  /**
   * Creates a new BossMembershipSourceSystemAttributes RecordBuilder.
   * @return A new BossMembershipSourceSystemAttributes RecordBuilder
   */
  public static com.uhc.schema.model.eligibility.boss.BossMembershipSourceSystemAttributes.Builder newBuilder() {
    return new com.uhc.schema.model.eligibility.boss.BossMembershipSourceSystemAttributes.Builder();
  }

  /**
   * Creates a new BossMembershipSourceSystemAttributes RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new BossMembershipSourceSystemAttributes RecordBuilder
   */
  public static com.uhc.schema.model.eligibility.boss.BossMembershipSourceSystemAttributes.Builder newBuilder(com.uhc.schema.model.eligibility.boss.BossMembershipSourceSystemAttributes.Builder other) {
    return new com.uhc.schema.model.eligibility.boss.BossMembershipSourceSystemAttributes.Builder(other);
  }

  /**
   * Creates a new BossMembershipSourceSystemAttributes RecordBuilder by copying an existing BossMembershipSourceSystemAttributes instance.
   * @param other The existing instance to copy.
   * @return A new BossMembershipSourceSystemAttributes RecordBuilder
   */
  public static com.uhc.schema.model.eligibility.boss.BossMembershipSourceSystemAttributes.Builder newBuilder(com.uhc.schema.model.eligibility.boss.BossMembershipSourceSystemAttributes other) {
    return new com.uhc.schema.model.eligibility.boss.BossMembershipSourceSystemAttributes.Builder(other);
  }

  /**
   * RecordBuilder for BossMembershipSourceSystemAttributes instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<BossMembershipSourceSystemAttributes>
    implements org.apache.avro.data.RecordBuilder<BossMembershipSourceSystemAttributes> {

    /** The customerAccountIdentifier as stored in BOSS (ie. padded with leading zeroes to minimum length of 9) */
    private java.lang.CharSequence customerAccountIdentifier;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.uhc.schema.model.eligibility.boss.BossMembershipSourceSystemAttributes.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.customerAccountIdentifier)) {
        this.customerAccountIdentifier = data().deepCopy(fields()[0].schema(), other.customerAccountIdentifier);
        fieldSetFlags()[0] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing BossMembershipSourceSystemAttributes instance
     * @param other The existing instance to copy.
     */
    private Builder(com.uhc.schema.model.eligibility.boss.BossMembershipSourceSystemAttributes other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.customerAccountIdentifier)) {
        this.customerAccountIdentifier = data().deepCopy(fields()[0].schema(), other.customerAccountIdentifier);
        fieldSetFlags()[0] = true;
      }
    }

    /**
      * Gets the value of the 'customerAccountIdentifier' field.
      * The customerAccountIdentifier as stored in BOSS (ie. padded with leading zeroes to minimum length of 9)
      * @return The value.
      */
    public java.lang.CharSequence getCustomerAccountIdentifier() {
      return customerAccountIdentifier;
    }

    /**
      * Sets the value of the 'customerAccountIdentifier' field.
      * The customerAccountIdentifier as stored in BOSS (ie. padded with leading zeroes to minimum length of 9)
      * @param value The value of 'customerAccountIdentifier'.
      * @return This builder.
      */
    public com.uhc.schema.model.eligibility.boss.BossMembershipSourceSystemAttributes.Builder setCustomerAccountIdentifier(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.customerAccountIdentifier = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'customerAccountIdentifier' field has been set.
      * The customerAccountIdentifier as stored in BOSS (ie. padded with leading zeroes to minimum length of 9)
      * @return True if the 'customerAccountIdentifier' field has been set, false otherwise.
      */
    public boolean hasCustomerAccountIdentifier() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'customerAccountIdentifier' field.
      * The customerAccountIdentifier as stored in BOSS (ie. padded with leading zeroes to minimum length of 9)
      * @return This builder.
      */
    public com.uhc.schema.model.eligibility.boss.BossMembershipSourceSystemAttributes.Builder clearCustomerAccountIdentifier() {
      customerAccountIdentifier = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public BossMembershipSourceSystemAttributes build() {
      try {
        BossMembershipSourceSystemAttributes record = new BossMembershipSourceSystemAttributes();
        record.customerAccountIdentifier = fieldSetFlags()[0] ? this.customerAccountIdentifier : (java.lang.CharSequence) defaultValue(fields()[0]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<BossMembershipSourceSystemAttributes>
    WRITER$ = (org.apache.avro.io.DatumWriter<BossMembershipSourceSystemAttributes>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<BossMembershipSourceSystemAttributes>
    READER$ = (org.apache.avro.io.DatumReader<BossMembershipSourceSystemAttributes>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
