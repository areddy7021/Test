/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.uhc.schema.model.eligibility.cdb;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class CdbMigratedMembership extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -2344524347489469223L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"CdbMigratedMembership\",\"namespace\":\"com.uhc.schema.model.eligibility.cdb\",\"fields\":[{\"name\":\"active\",\"type\":\"boolean\",\"default\":false},{\"name\":\"consumerId\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"effectiveDate\",\"type\":[\"null\",\"string\"],\"doc\":\"Date format: CCYY-MM-DD\",\"default\":null},{\"name\":\"legacySourceId\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"partitionNumber\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"policyNumber\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"sourceCode\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"subscriberId\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"terminationDate\",\"type\":[\"null\",\"string\"],\"doc\":\"Date format: CCYY-MM-DD\",\"default\":null},{\"name\":\"xrefId\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"xrefIdPartitionNumber\",\"type\":[\"null\",\"int\"],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<CdbMigratedMembership> ENCODER =
      new BinaryMessageEncoder<CdbMigratedMembership>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<CdbMigratedMembership> DECODER =
      new BinaryMessageDecoder<CdbMigratedMembership>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<CdbMigratedMembership> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<CdbMigratedMembership> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<CdbMigratedMembership>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this CdbMigratedMembership to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a CdbMigratedMembership from a ByteBuffer. */
  public static CdbMigratedMembership fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public boolean active;
  @Deprecated public java.lang.Integer consumerId;
  /** Date format: CCYY-MM-DD */
  @Deprecated public java.lang.CharSequence effectiveDate;
  @Deprecated public java.lang.CharSequence legacySourceId;
  @Deprecated public java.lang.Integer partitionNumber;
  @Deprecated public java.lang.CharSequence policyNumber;
  @Deprecated public java.lang.CharSequence sourceCode;
  @Deprecated public java.lang.CharSequence subscriberId;
  /** Date format: CCYY-MM-DD */
  @Deprecated public java.lang.CharSequence terminationDate;
  @Deprecated public java.lang.Integer xrefId;
  @Deprecated public java.lang.Integer xrefIdPartitionNumber;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public CdbMigratedMembership() {}

  /**
   * All-args constructor.
   * @param active The new value for active
   * @param consumerId The new value for consumerId
   * @param effectiveDate Date format: CCYY-MM-DD
   * @param legacySourceId The new value for legacySourceId
   * @param partitionNumber The new value for partitionNumber
   * @param policyNumber The new value for policyNumber
   * @param sourceCode The new value for sourceCode
   * @param subscriberId The new value for subscriberId
   * @param terminationDate Date format: CCYY-MM-DD
   * @param xrefId The new value for xrefId
   * @param xrefIdPartitionNumber The new value for xrefIdPartitionNumber
   */
  public CdbMigratedMembership(java.lang.Boolean active, java.lang.Integer consumerId, java.lang.CharSequence effectiveDate, java.lang.CharSequence legacySourceId, java.lang.Integer partitionNumber, java.lang.CharSequence policyNumber, java.lang.CharSequence sourceCode, java.lang.CharSequence subscriberId, java.lang.CharSequence terminationDate, java.lang.Integer xrefId, java.lang.Integer xrefIdPartitionNumber) {
    this.active = active;
    this.consumerId = consumerId;
    this.effectiveDate = effectiveDate;
    this.legacySourceId = legacySourceId;
    this.partitionNumber = partitionNumber;
    this.policyNumber = policyNumber;
    this.sourceCode = sourceCode;
    this.subscriberId = subscriberId;
    this.terminationDate = terminationDate;
    this.xrefId = xrefId;
    this.xrefIdPartitionNumber = xrefIdPartitionNumber;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return active;
    case 1: return consumerId;
    case 2: return effectiveDate;
    case 3: return legacySourceId;
    case 4: return partitionNumber;
    case 5: return policyNumber;
    case 6: return sourceCode;
    case 7: return subscriberId;
    case 8: return terminationDate;
    case 9: return xrefId;
    case 10: return xrefIdPartitionNumber;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: active = (java.lang.Boolean)value$; break;
    case 1: consumerId = (java.lang.Integer)value$; break;
    case 2: effectiveDate = (java.lang.CharSequence)value$; break;
    case 3: legacySourceId = (java.lang.CharSequence)value$; break;
    case 4: partitionNumber = (java.lang.Integer)value$; break;
    case 5: policyNumber = (java.lang.CharSequence)value$; break;
    case 6: sourceCode = (java.lang.CharSequence)value$; break;
    case 7: subscriberId = (java.lang.CharSequence)value$; break;
    case 8: terminationDate = (java.lang.CharSequence)value$; break;
    case 9: xrefId = (java.lang.Integer)value$; break;
    case 10: xrefIdPartitionNumber = (java.lang.Integer)value$; break;
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
   * Gets the value of the 'consumerId' field.
   * @return The value of the 'consumerId' field.
   */
  public java.lang.Integer getConsumerId() {
    return consumerId;
  }

  /**
   * Sets the value of the 'consumerId' field.
   * @param value the value to set.
   */
  public void setConsumerId(java.lang.Integer value) {
    this.consumerId = value;
  }

  /**
   * Gets the value of the 'effectiveDate' field.
   * @return Date format: CCYY-MM-DD
   */
  public java.lang.CharSequence getEffectiveDate() {
    return effectiveDate;
  }

  /**
   * Sets the value of the 'effectiveDate' field.
   * Date format: CCYY-MM-DD
   * @param value the value to set.
   */
  public void setEffectiveDate(java.lang.CharSequence value) {
    this.effectiveDate = value;
  }

  /**
   * Gets the value of the 'legacySourceId' field.
   * @return The value of the 'legacySourceId' field.
   */
  public java.lang.CharSequence getLegacySourceId() {
    return legacySourceId;
  }

  /**
   * Sets the value of the 'legacySourceId' field.
   * @param value the value to set.
   */
  public void setLegacySourceId(java.lang.CharSequence value) {
    this.legacySourceId = value;
  }

  /**
   * Gets the value of the 'partitionNumber' field.
   * @return The value of the 'partitionNumber' field.
   */
  public java.lang.Integer getPartitionNumber() {
    return partitionNumber;
  }

  /**
   * Sets the value of the 'partitionNumber' field.
   * @param value the value to set.
   */
  public void setPartitionNumber(java.lang.Integer value) {
    this.partitionNumber = value;
  }

  /**
   * Gets the value of the 'policyNumber' field.
   * @return The value of the 'policyNumber' field.
   */
  public java.lang.CharSequence getPolicyNumber() {
    return policyNumber;
  }

  /**
   * Sets the value of the 'policyNumber' field.
   * @param value the value to set.
   */
  public void setPolicyNumber(java.lang.CharSequence value) {
    this.policyNumber = value;
  }

  /**
   * Gets the value of the 'sourceCode' field.
   * @return The value of the 'sourceCode' field.
   */
  public java.lang.CharSequence getSourceCode() {
    return sourceCode;
  }

  /**
   * Sets the value of the 'sourceCode' field.
   * @param value the value to set.
   */
  public void setSourceCode(java.lang.CharSequence value) {
    this.sourceCode = value;
  }

  /**
   * Gets the value of the 'subscriberId' field.
   * @return The value of the 'subscriberId' field.
   */
  public java.lang.CharSequence getSubscriberId() {
    return subscriberId;
  }

  /**
   * Sets the value of the 'subscriberId' field.
   * @param value the value to set.
   */
  public void setSubscriberId(java.lang.CharSequence value) {
    this.subscriberId = value;
  }

  /**
   * Gets the value of the 'terminationDate' field.
   * @return Date format: CCYY-MM-DD
   */
  public java.lang.CharSequence getTerminationDate() {
    return terminationDate;
  }

  /**
   * Sets the value of the 'terminationDate' field.
   * Date format: CCYY-MM-DD
   * @param value the value to set.
   */
  public void setTerminationDate(java.lang.CharSequence value) {
    this.terminationDate = value;
  }

  /**
   * Gets the value of the 'xrefId' field.
   * @return The value of the 'xrefId' field.
   */
  public java.lang.Integer getXrefId() {
    return xrefId;
  }

  /**
   * Sets the value of the 'xrefId' field.
   * @param value the value to set.
   */
  public void setXrefId(java.lang.Integer value) {
    this.xrefId = value;
  }

  /**
   * Gets the value of the 'xrefIdPartitionNumber' field.
   * @return The value of the 'xrefIdPartitionNumber' field.
   */
  public java.lang.Integer getXrefIdPartitionNumber() {
    return xrefIdPartitionNumber;
  }

  /**
   * Sets the value of the 'xrefIdPartitionNumber' field.
   * @param value the value to set.
   */
  public void setXrefIdPartitionNumber(java.lang.Integer value) {
    this.xrefIdPartitionNumber = value;
  }

  /**
   * Creates a new CdbMigratedMembership RecordBuilder.
   * @return A new CdbMigratedMembership RecordBuilder
   */
  public static com.uhc.schema.model.eligibility.cdb.CdbMigratedMembership.Builder newBuilder() {
    return new com.uhc.schema.model.eligibility.cdb.CdbMigratedMembership.Builder();
  }

  /**
   * Creates a new CdbMigratedMembership RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new CdbMigratedMembership RecordBuilder
   */
  public static com.uhc.schema.model.eligibility.cdb.CdbMigratedMembership.Builder newBuilder(com.uhc.schema.model.eligibility.cdb.CdbMigratedMembership.Builder other) {
    return new com.uhc.schema.model.eligibility.cdb.CdbMigratedMembership.Builder(other);
  }

  /**
   * Creates a new CdbMigratedMembership RecordBuilder by copying an existing CdbMigratedMembership instance.
   * @param other The existing instance to copy.
   * @return A new CdbMigratedMembership RecordBuilder
   */
  public static com.uhc.schema.model.eligibility.cdb.CdbMigratedMembership.Builder newBuilder(com.uhc.schema.model.eligibility.cdb.CdbMigratedMembership other) {
    return new com.uhc.schema.model.eligibility.cdb.CdbMigratedMembership.Builder(other);
  }

  /**
   * RecordBuilder for CdbMigratedMembership instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<CdbMigratedMembership>
    implements org.apache.avro.data.RecordBuilder<CdbMigratedMembership> {

    private boolean active;
    private java.lang.Integer consumerId;
    /** Date format: CCYY-MM-DD */
    private java.lang.CharSequence effectiveDate;
    private java.lang.CharSequence legacySourceId;
    private java.lang.Integer partitionNumber;
    private java.lang.CharSequence policyNumber;
    private java.lang.CharSequence sourceCode;
    private java.lang.CharSequence subscriberId;
    /** Date format: CCYY-MM-DD */
    private java.lang.CharSequence terminationDate;
    private java.lang.Integer xrefId;
    private java.lang.Integer xrefIdPartitionNumber;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.uhc.schema.model.eligibility.cdb.CdbMigratedMembership.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.active)) {
        this.active = data().deepCopy(fields()[0].schema(), other.active);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.consumerId)) {
        this.consumerId = data().deepCopy(fields()[1].schema(), other.consumerId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.effectiveDate)) {
        this.effectiveDate = data().deepCopy(fields()[2].schema(), other.effectiveDate);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.legacySourceId)) {
        this.legacySourceId = data().deepCopy(fields()[3].schema(), other.legacySourceId);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.partitionNumber)) {
        this.partitionNumber = data().deepCopy(fields()[4].schema(), other.partitionNumber);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.policyNumber)) {
        this.policyNumber = data().deepCopy(fields()[5].schema(), other.policyNumber);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.sourceCode)) {
        this.sourceCode = data().deepCopy(fields()[6].schema(), other.sourceCode);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.subscriberId)) {
        this.subscriberId = data().deepCopy(fields()[7].schema(), other.subscriberId);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.terminationDate)) {
        this.terminationDate = data().deepCopy(fields()[8].schema(), other.terminationDate);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.xrefId)) {
        this.xrefId = data().deepCopy(fields()[9].schema(), other.xrefId);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.xrefIdPartitionNumber)) {
        this.xrefIdPartitionNumber = data().deepCopy(fields()[10].schema(), other.xrefIdPartitionNumber);
        fieldSetFlags()[10] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing CdbMigratedMembership instance
     * @param other The existing instance to copy.
     */
    private Builder(com.uhc.schema.model.eligibility.cdb.CdbMigratedMembership other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.active)) {
        this.active = data().deepCopy(fields()[0].schema(), other.active);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.consumerId)) {
        this.consumerId = data().deepCopy(fields()[1].schema(), other.consumerId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.effectiveDate)) {
        this.effectiveDate = data().deepCopy(fields()[2].schema(), other.effectiveDate);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.legacySourceId)) {
        this.legacySourceId = data().deepCopy(fields()[3].schema(), other.legacySourceId);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.partitionNumber)) {
        this.partitionNumber = data().deepCopy(fields()[4].schema(), other.partitionNumber);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.policyNumber)) {
        this.policyNumber = data().deepCopy(fields()[5].schema(), other.policyNumber);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.sourceCode)) {
        this.sourceCode = data().deepCopy(fields()[6].schema(), other.sourceCode);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.subscriberId)) {
        this.subscriberId = data().deepCopy(fields()[7].schema(), other.subscriberId);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.terminationDate)) {
        this.terminationDate = data().deepCopy(fields()[8].schema(), other.terminationDate);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.xrefId)) {
        this.xrefId = data().deepCopy(fields()[9].schema(), other.xrefId);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.xrefIdPartitionNumber)) {
        this.xrefIdPartitionNumber = data().deepCopy(fields()[10].schema(), other.xrefIdPartitionNumber);
        fieldSetFlags()[10] = true;
      }
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
    public com.uhc.schema.model.eligibility.cdb.CdbMigratedMembership.Builder setActive(boolean value) {
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
    public com.uhc.schema.model.eligibility.cdb.CdbMigratedMembership.Builder clearActive() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'consumerId' field.
      * @return The value.
      */
    public java.lang.Integer getConsumerId() {
      return consumerId;
    }

    /**
      * Sets the value of the 'consumerId' field.
      * @param value The value of 'consumerId'.
      * @return This builder.
      */
    public com.uhc.schema.model.eligibility.cdb.CdbMigratedMembership.Builder setConsumerId(java.lang.Integer value) {
      validate(fields()[1], value);
      this.consumerId = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'consumerId' field has been set.
      * @return True if the 'consumerId' field has been set, false otherwise.
      */
    public boolean hasConsumerId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'consumerId' field.
      * @return This builder.
      */
    public com.uhc.schema.model.eligibility.cdb.CdbMigratedMembership.Builder clearConsumerId() {
      consumerId = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'effectiveDate' field.
      * Date format: CCYY-MM-DD
      * @return The value.
      */
    public java.lang.CharSequence getEffectiveDate() {
      return effectiveDate;
    }

    /**
      * Sets the value of the 'effectiveDate' field.
      * Date format: CCYY-MM-DD
      * @param value The value of 'effectiveDate'.
      * @return This builder.
      */
    public com.uhc.schema.model.eligibility.cdb.CdbMigratedMembership.Builder setEffectiveDate(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.effectiveDate = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'effectiveDate' field has been set.
      * Date format: CCYY-MM-DD
      * @return True if the 'effectiveDate' field has been set, false otherwise.
      */
    public boolean hasEffectiveDate() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'effectiveDate' field.
      * Date format: CCYY-MM-DD
      * @return This builder.
      */
    public com.uhc.schema.model.eligibility.cdb.CdbMigratedMembership.Builder clearEffectiveDate() {
      effectiveDate = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'legacySourceId' field.
      * @return The value.
      */
    public java.lang.CharSequence getLegacySourceId() {
      return legacySourceId;
    }

    /**
      * Sets the value of the 'legacySourceId' field.
      * @param value The value of 'legacySourceId'.
      * @return This builder.
      */
    public com.uhc.schema.model.eligibility.cdb.CdbMigratedMembership.Builder setLegacySourceId(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.legacySourceId = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'legacySourceId' field has been set.
      * @return True if the 'legacySourceId' field has been set, false otherwise.
      */
    public boolean hasLegacySourceId() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'legacySourceId' field.
      * @return This builder.
      */
    public com.uhc.schema.model.eligibility.cdb.CdbMigratedMembership.Builder clearLegacySourceId() {
      legacySourceId = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'partitionNumber' field.
      * @return The value.
      */
    public java.lang.Integer getPartitionNumber() {
      return partitionNumber;
    }

    /**
      * Sets the value of the 'partitionNumber' field.
      * @param value The value of 'partitionNumber'.
      * @return This builder.
      */
    public com.uhc.schema.model.eligibility.cdb.CdbMigratedMembership.Builder setPartitionNumber(java.lang.Integer value) {
      validate(fields()[4], value);
      this.partitionNumber = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'partitionNumber' field has been set.
      * @return True if the 'partitionNumber' field has been set, false otherwise.
      */
    public boolean hasPartitionNumber() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'partitionNumber' field.
      * @return This builder.
      */
    public com.uhc.schema.model.eligibility.cdb.CdbMigratedMembership.Builder clearPartitionNumber() {
      partitionNumber = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'policyNumber' field.
      * @return The value.
      */
    public java.lang.CharSequence getPolicyNumber() {
      return policyNumber;
    }

    /**
      * Sets the value of the 'policyNumber' field.
      * @param value The value of 'policyNumber'.
      * @return This builder.
      */
    public com.uhc.schema.model.eligibility.cdb.CdbMigratedMembership.Builder setPolicyNumber(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this.policyNumber = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'policyNumber' field has been set.
      * @return True if the 'policyNumber' field has been set, false otherwise.
      */
    public boolean hasPolicyNumber() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'policyNumber' field.
      * @return This builder.
      */
    public com.uhc.schema.model.eligibility.cdb.CdbMigratedMembership.Builder clearPolicyNumber() {
      policyNumber = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'sourceCode' field.
      * @return The value.
      */
    public java.lang.CharSequence getSourceCode() {
      return sourceCode;
    }

    /**
      * Sets the value of the 'sourceCode' field.
      * @param value The value of 'sourceCode'.
      * @return This builder.
      */
    public com.uhc.schema.model.eligibility.cdb.CdbMigratedMembership.Builder setSourceCode(java.lang.CharSequence value) {
      validate(fields()[6], value);
      this.sourceCode = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'sourceCode' field has been set.
      * @return True if the 'sourceCode' field has been set, false otherwise.
      */
    public boolean hasSourceCode() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'sourceCode' field.
      * @return This builder.
      */
    public com.uhc.schema.model.eligibility.cdb.CdbMigratedMembership.Builder clearSourceCode() {
      sourceCode = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'subscriberId' field.
      * @return The value.
      */
    public java.lang.CharSequence getSubscriberId() {
      return subscriberId;
    }

    /**
      * Sets the value of the 'subscriberId' field.
      * @param value The value of 'subscriberId'.
      * @return This builder.
      */
    public com.uhc.schema.model.eligibility.cdb.CdbMigratedMembership.Builder setSubscriberId(java.lang.CharSequence value) {
      validate(fields()[7], value);
      this.subscriberId = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'subscriberId' field has been set.
      * @return True if the 'subscriberId' field has been set, false otherwise.
      */
    public boolean hasSubscriberId() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'subscriberId' field.
      * @return This builder.
      */
    public com.uhc.schema.model.eligibility.cdb.CdbMigratedMembership.Builder clearSubscriberId() {
      subscriberId = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /**
      * Gets the value of the 'terminationDate' field.
      * Date format: CCYY-MM-DD
      * @return The value.
      */
    public java.lang.CharSequence getTerminationDate() {
      return terminationDate;
    }

    /**
      * Sets the value of the 'terminationDate' field.
      * Date format: CCYY-MM-DD
      * @param value The value of 'terminationDate'.
      * @return This builder.
      */
    public com.uhc.schema.model.eligibility.cdb.CdbMigratedMembership.Builder setTerminationDate(java.lang.CharSequence value) {
      validate(fields()[8], value);
      this.terminationDate = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /**
      * Checks whether the 'terminationDate' field has been set.
      * Date format: CCYY-MM-DD
      * @return True if the 'terminationDate' field has been set, false otherwise.
      */
    public boolean hasTerminationDate() {
      return fieldSetFlags()[8];
    }


    /**
      * Clears the value of the 'terminationDate' field.
      * Date format: CCYY-MM-DD
      * @return This builder.
      */
    public com.uhc.schema.model.eligibility.cdb.CdbMigratedMembership.Builder clearTerminationDate() {
      terminationDate = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    /**
      * Gets the value of the 'xrefId' field.
      * @return The value.
      */
    public java.lang.Integer getXrefId() {
      return xrefId;
    }

    /**
      * Sets the value of the 'xrefId' field.
      * @param value The value of 'xrefId'.
      * @return This builder.
      */
    public com.uhc.schema.model.eligibility.cdb.CdbMigratedMembership.Builder setXrefId(java.lang.Integer value) {
      validate(fields()[9], value);
      this.xrefId = value;
      fieldSetFlags()[9] = true;
      return this;
    }

    /**
      * Checks whether the 'xrefId' field has been set.
      * @return True if the 'xrefId' field has been set, false otherwise.
      */
    public boolean hasXrefId() {
      return fieldSetFlags()[9];
    }


    /**
      * Clears the value of the 'xrefId' field.
      * @return This builder.
      */
    public com.uhc.schema.model.eligibility.cdb.CdbMigratedMembership.Builder clearXrefId() {
      xrefId = null;
      fieldSetFlags()[9] = false;
      return this;
    }

    /**
      * Gets the value of the 'xrefIdPartitionNumber' field.
      * @return The value.
      */
    public java.lang.Integer getXrefIdPartitionNumber() {
      return xrefIdPartitionNumber;
    }

    /**
      * Sets the value of the 'xrefIdPartitionNumber' field.
      * @param value The value of 'xrefIdPartitionNumber'.
      * @return This builder.
      */
    public com.uhc.schema.model.eligibility.cdb.CdbMigratedMembership.Builder setXrefIdPartitionNumber(java.lang.Integer value) {
      validate(fields()[10], value);
      this.xrefIdPartitionNumber = value;
      fieldSetFlags()[10] = true;
      return this;
    }

    /**
      * Checks whether the 'xrefIdPartitionNumber' field has been set.
      * @return True if the 'xrefIdPartitionNumber' field has been set, false otherwise.
      */
    public boolean hasXrefIdPartitionNumber() {
      return fieldSetFlags()[10];
    }


    /**
      * Clears the value of the 'xrefIdPartitionNumber' field.
      * @return This builder.
      */
    public com.uhc.schema.model.eligibility.cdb.CdbMigratedMembership.Builder clearXrefIdPartitionNumber() {
      xrefIdPartitionNumber = null;
      fieldSetFlags()[10] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public CdbMigratedMembership build() {
      try {
        CdbMigratedMembership record = new CdbMigratedMembership();
        record.active = fieldSetFlags()[0] ? this.active : (java.lang.Boolean) defaultValue(fields()[0]);
        record.consumerId = fieldSetFlags()[1] ? this.consumerId : (java.lang.Integer) defaultValue(fields()[1]);
        record.effectiveDate = fieldSetFlags()[2] ? this.effectiveDate : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.legacySourceId = fieldSetFlags()[3] ? this.legacySourceId : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.partitionNumber = fieldSetFlags()[4] ? this.partitionNumber : (java.lang.Integer) defaultValue(fields()[4]);
        record.policyNumber = fieldSetFlags()[5] ? this.policyNumber : (java.lang.CharSequence) defaultValue(fields()[5]);
        record.sourceCode = fieldSetFlags()[6] ? this.sourceCode : (java.lang.CharSequence) defaultValue(fields()[6]);
        record.subscriberId = fieldSetFlags()[7] ? this.subscriberId : (java.lang.CharSequence) defaultValue(fields()[7]);
        record.terminationDate = fieldSetFlags()[8] ? this.terminationDate : (java.lang.CharSequence) defaultValue(fields()[8]);
        record.xrefId = fieldSetFlags()[9] ? this.xrefId : (java.lang.Integer) defaultValue(fields()[9]);
        record.xrefIdPartitionNumber = fieldSetFlags()[10] ? this.xrefIdPartitionNumber : (java.lang.Integer) defaultValue(fields()[10]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<CdbMigratedMembership>
    WRITER$ = (org.apache.avro.io.DatumWriter<CdbMigratedMembership>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<CdbMigratedMembership>
    READER$ = (org.apache.avro.io.DatumReader<CdbMigratedMembership>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
