/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.uhc.schema.model.security;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
/** Represents a domain model of Security */
@org.apache.avro.specific.AvroGenerated
public class ConsumerRolePermission extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -7861264828339628710L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ConsumerRolePermission\",\"namespace\":\"com.optum.exts.security.model\",\"doc\":\"Represents a domain model of Security\",\"fields\":[{\"name\":\"consumer_name\",\"type\":[\"null\",\"string\"]},{\"name\":\"role\",\"type\":[\"null\",\"string\"]},{\"name\":\"permission\",\"type\":[\"null\",\"string\"]},{\"name\":\"source_system\",\"type\":[\"null\",\"string\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<ConsumerRolePermission> ENCODER =
      new BinaryMessageEncoder<ConsumerRolePermission>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<ConsumerRolePermission> DECODER =
      new BinaryMessageDecoder<ConsumerRolePermission>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<ConsumerRolePermission> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<ConsumerRolePermission> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<ConsumerRolePermission>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this ConsumerRolePermission to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a ConsumerRolePermission from a ByteBuffer. */
  public static ConsumerRolePermission fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence consumer_name;
  @Deprecated public java.lang.CharSequence role;
  @Deprecated public java.lang.CharSequence permission;
  @Deprecated public java.lang.CharSequence source_system;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public ConsumerRolePermission() {}

  /**
   * All-args constructor.
   * @param consumer_name The new value for consumer_name
   * @param role The new value for role
   * @param permission The new value for permission
   * @param source_system The new value for source_system
   */
  public ConsumerRolePermission(java.lang.CharSequence consumer_name, java.lang.CharSequence role, java.lang.CharSequence permission, java.lang.CharSequence source_system) {
    this.consumer_name = consumer_name;
    this.role = role;
    this.permission = permission;
    this.source_system = source_system;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return consumer_name;
    case 1: return role;
    case 2: return permission;
    case 3: return source_system;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: consumer_name = (java.lang.CharSequence)value$; break;
    case 1: role = (java.lang.CharSequence)value$; break;
    case 2: permission = (java.lang.CharSequence)value$; break;
    case 3: source_system = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'consumer_name' field.
   * @return The value of the 'consumer_name' field.
   */
  public java.lang.CharSequence getConsumerName() {
    return consumer_name;
  }

  /**
   * Sets the value of the 'consumer_name' field.
   * @param value the value to set.
   */
  public void setConsumerName(java.lang.CharSequence value) {
    this.consumer_name = value;
  }

  /**
   * Gets the value of the 'role' field.
   * @return The value of the 'role' field.
   */
  public java.lang.CharSequence getRole() {
    return role;
  }

  /**
   * Sets the value of the 'role' field.
   * @param value the value to set.
   */
  public void setRole(java.lang.CharSequence value) {
    this.role = value;
  }

  /**
   * Gets the value of the 'permission' field.
   * @return The value of the 'permission' field.
   */
  public java.lang.CharSequence getPermission() {
    return permission;
  }

  /**
   * Sets the value of the 'permission' field.
   * @param value the value to set.
   */
  public void setPermission(java.lang.CharSequence value) {
    this.permission = value;
  }

  /**
   * Gets the value of the 'source_system' field.
   * @return The value of the 'source_system' field.
   */
  public java.lang.CharSequence getSourceSystem() {
    return source_system;
  }

  /**
   * Sets the value of the 'source_system' field.
   * @param value the value to set.
   */
  public void setSourceSystem(java.lang.CharSequence value) {
    this.source_system = value;
  }

  /**
   * Creates a new ConsumerRolePermission RecordBuilder.
   * @return A new ConsumerRolePermission RecordBuilder
   */
  public static ConsumerRolePermission.Builder newBuilder() {
    return new ConsumerRolePermission.Builder();
  }

  /**
   * Creates a new ConsumerRolePermission RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new ConsumerRolePermission RecordBuilder
   */
  public static ConsumerRolePermission.Builder newBuilder(ConsumerRolePermission.Builder other) {
    return new ConsumerRolePermission.Builder(other);
  }

  /**
   * Creates a new ConsumerRolePermission RecordBuilder by copying an existing ConsumerRolePermission instance.
   * @param other The existing instance to copy.
   * @return A new ConsumerRolePermission RecordBuilder
   */
  public static ConsumerRolePermission.Builder newBuilder(ConsumerRolePermission other) {
    return new ConsumerRolePermission.Builder(other);
  }

  /**
   * RecordBuilder for ConsumerRolePermission instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ConsumerRolePermission>
    implements org.apache.avro.data.RecordBuilder<ConsumerRolePermission> {

    private java.lang.CharSequence consumer_name;
    private java.lang.CharSequence role;
    private java.lang.CharSequence permission;
    private java.lang.CharSequence source_system;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(ConsumerRolePermission.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.consumer_name)) {
        this.consumer_name = data().deepCopy(fields()[0].schema(), other.consumer_name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.role)) {
        this.role = data().deepCopy(fields()[1].schema(), other.role);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.permission)) {
        this.permission = data().deepCopy(fields()[2].schema(), other.permission);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.source_system)) {
        this.source_system = data().deepCopy(fields()[3].schema(), other.source_system);
        fieldSetFlags()[3] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing ConsumerRolePermission instance
     * @param other The existing instance to copy.
     */
    private Builder(ConsumerRolePermission other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.consumer_name)) {
        this.consumer_name = data().deepCopy(fields()[0].schema(), other.consumer_name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.role)) {
        this.role = data().deepCopy(fields()[1].schema(), other.role);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.permission)) {
        this.permission = data().deepCopy(fields()[2].schema(), other.permission);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.source_system)) {
        this.source_system = data().deepCopy(fields()[3].schema(), other.source_system);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'consumer_name' field.
      * @return The value.
      */
    public java.lang.CharSequence getConsumerName() {
      return consumer_name;
    }

    /**
      * Sets the value of the 'consumer_name' field.
      * @param value The value of 'consumer_name'.
      * @return This builder.
      */
    public ConsumerRolePermission.Builder setConsumerName(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.consumer_name = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'consumer_name' field has been set.
      * @return True if the 'consumer_name' field has been set, false otherwise.
      */
    public boolean hasConsumerName() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'consumer_name' field.
      * @return This builder.
      */
    public ConsumerRolePermission.Builder clearConsumerName() {
      consumer_name = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'role' field.
      * @return The value.
      */
    public java.lang.CharSequence getRole() {
      return role;
    }

    /**
      * Sets the value of the 'role' field.
      * @param value The value of 'role'.
      * @return This builder.
      */
    public ConsumerRolePermission.Builder setRole(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.role = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'role' field has been set.
      * @return True if the 'role' field has been set, false otherwise.
      */
    public boolean hasRole() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'role' field.
      * @return This builder.
      */
    public ConsumerRolePermission.Builder clearRole() {
      role = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'permission' field.
      * @return The value.
      */
    public java.lang.CharSequence getPermission() {
      return permission;
    }

    /**
      * Sets the value of the 'permission' field.
      * @param value The value of 'permission'.
      * @return This builder.
      */
    public ConsumerRolePermission.Builder setPermission(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.permission = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'permission' field has been set.
      * @return True if the 'permission' field has been set, false otherwise.
      */
    public boolean hasPermission() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'permission' field.
      * @return This builder.
      */
    public ConsumerRolePermission.Builder clearPermission() {
      permission = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'source_system' field.
      * @return The value.
      */
    public java.lang.CharSequence getSourceSystem() {
      return source_system;
    }

    /**
      * Sets the value of the 'source_system' field.
      * @param value The value of 'source_system'.
      * @return This builder.
      */
    public ConsumerRolePermission.Builder setSourceSystem(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.source_system = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'source_system' field has been set.
      * @return True if the 'source_system' field has been set, false otherwise.
      */
    public boolean hasSourceSystem() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'source_system' field.
      * @return This builder.
      */
    public ConsumerRolePermission.Builder clearSourceSystem() {
      source_system = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public ConsumerRolePermission build() {
      try {
        ConsumerRolePermission record = new ConsumerRolePermission();
        record.consumer_name = fieldSetFlags()[0] ? this.consumer_name : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.role = fieldSetFlags()[1] ? this.role : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.permission = fieldSetFlags()[2] ? this.permission : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.source_system = fieldSetFlags()[3] ? this.source_system : (java.lang.CharSequence) defaultValue(fields()[3]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<ConsumerRolePermission>
    WRITER$ = (org.apache.avro.io.DatumWriter<ConsumerRolePermission>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<ConsumerRolePermission>
    READER$ = (org.apache.avro.io.DatumReader<ConsumerRolePermission>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}