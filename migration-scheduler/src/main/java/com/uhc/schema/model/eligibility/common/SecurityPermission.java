/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.uhc.schema.model.eligibility.common;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class SecurityPermission extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 7280188429174999016L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"SecurityPermission\",\"namespace\":\"com.uhc.schema.model.eligibility.common\",\"fields\":[{\"name\":\"securityPermissionValue\",\"type\":[\"null\",\"string\"],\"doc\":\"A security attribute identifying the secure class under which the record instance is administered.\",\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<SecurityPermission> ENCODER =
      new BinaryMessageEncoder<SecurityPermission>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<SecurityPermission> DECODER =
      new BinaryMessageDecoder<SecurityPermission>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<SecurityPermission> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<SecurityPermission> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<SecurityPermission>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this SecurityPermission to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a SecurityPermission from a ByteBuffer. */
  public static SecurityPermission fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** A security attribute identifying the secure class under which the record instance is administered. */
  @Deprecated public java.lang.CharSequence securityPermissionValue;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public SecurityPermission() {}

  /**
   * All-args constructor.
   * @param securityPermissionValue A security attribute identifying the secure class under which the record instance is administered.
   */
  public SecurityPermission(java.lang.CharSequence securityPermissionValue) {
    this.securityPermissionValue = securityPermissionValue;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return securityPermissionValue;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: securityPermissionValue = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'securityPermissionValue' field.
   * @return A security attribute identifying the secure class under which the record instance is administered.
   */
  public java.lang.CharSequence getSecurityPermissionValue() {
    return securityPermissionValue;
  }

  /**
   * Sets the value of the 'securityPermissionValue' field.
   * A security attribute identifying the secure class under which the record instance is administered.
   * @param value the value to set.
   */
  public void setSecurityPermissionValue(java.lang.CharSequence value) {
    this.securityPermissionValue = value;
  }

  /**
   * Creates a new SecurityPermission RecordBuilder.
   * @return A new SecurityPermission RecordBuilder
   */
  public static com.uhc.schema.model.eligibility.common.SecurityPermission.Builder newBuilder() {
    return new com.uhc.schema.model.eligibility.common.SecurityPermission.Builder();
  }

  /**
   * Creates a new SecurityPermission RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new SecurityPermission RecordBuilder
   */
  public static com.uhc.schema.model.eligibility.common.SecurityPermission.Builder newBuilder(com.uhc.schema.model.eligibility.common.SecurityPermission.Builder other) {
    return new com.uhc.schema.model.eligibility.common.SecurityPermission.Builder(other);
  }

  /**
   * Creates a new SecurityPermission RecordBuilder by copying an existing SecurityPermission instance.
   * @param other The existing instance to copy.
   * @return A new SecurityPermission RecordBuilder
   */
  public static com.uhc.schema.model.eligibility.common.SecurityPermission.Builder newBuilder(com.uhc.schema.model.eligibility.common.SecurityPermission other) {
    return new com.uhc.schema.model.eligibility.common.SecurityPermission.Builder(other);
  }

  /**
   * RecordBuilder for SecurityPermission instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<SecurityPermission>
    implements org.apache.avro.data.RecordBuilder<SecurityPermission> {

    /** A security attribute identifying the secure class under which the record instance is administered. */
    private java.lang.CharSequence securityPermissionValue;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.uhc.schema.model.eligibility.common.SecurityPermission.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.securityPermissionValue)) {
        this.securityPermissionValue = data().deepCopy(fields()[0].schema(), other.securityPermissionValue);
        fieldSetFlags()[0] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing SecurityPermission instance
     * @param other The existing instance to copy.
     */
    private Builder(com.uhc.schema.model.eligibility.common.SecurityPermission other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.securityPermissionValue)) {
        this.securityPermissionValue = data().deepCopy(fields()[0].schema(), other.securityPermissionValue);
        fieldSetFlags()[0] = true;
      }
    }

    /**
      * Gets the value of the 'securityPermissionValue' field.
      * A security attribute identifying the secure class under which the record instance is administered.
      * @return The value.
      */
    public java.lang.CharSequence getSecurityPermissionValue() {
      return securityPermissionValue;
    }

    /**
      * Sets the value of the 'securityPermissionValue' field.
      * A security attribute identifying the secure class under which the record instance is administered.
      * @param value The value of 'securityPermissionValue'.
      * @return This builder.
      */
    public com.uhc.schema.model.eligibility.common.SecurityPermission.Builder setSecurityPermissionValue(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.securityPermissionValue = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'securityPermissionValue' field has been set.
      * A security attribute identifying the secure class under which the record instance is administered.
      * @return True if the 'securityPermissionValue' field has been set, false otherwise.
      */
    public boolean hasSecurityPermissionValue() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'securityPermissionValue' field.
      * A security attribute identifying the secure class under which the record instance is administered.
      * @return This builder.
      */
    public com.uhc.schema.model.eligibility.common.SecurityPermission.Builder clearSecurityPermissionValue() {
      securityPermissionValue = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public SecurityPermission build() {
      try {
        SecurityPermission record = new SecurityPermission();
        record.securityPermissionValue = fieldSetFlags()[0] ? this.securityPermissionValue : (java.lang.CharSequence) defaultValue(fields()[0]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<SecurityPermission>
    WRITER$ = (org.apache.avro.io.DatumWriter<SecurityPermission>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<SecurityPermission>
    READER$ = (org.apache.avro.io.DatumReader<SecurityPermission>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
