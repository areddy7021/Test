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
public class IndividualSourceSystemAttributes extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -6770254129012323060L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"IndividualSourceSystemAttributes\",\"namespace\":\"com.uhc.schema.model.eligibility.individual\",\"fields\":[{\"name\":\"cdb\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"CdbIndividualSourceSystemAttributes\",\"namespace\":\"com.uhc.schema.model.eligibility.cdb\",\"fields\":[{\"name\":\"consumerId\",\"type\":[\"null\",\"int\"],\"doc\":\"Consumer Id (CNSM_ID).\",\"default\":null},{\"name\":\"customerAccountIdentifier\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"familyPartitionNumber\",\"type\":[\"null\",\"int\"],\"doc\":\"Family partition number(FAM_PARTN_NBR).\",\"default\":null},{\"name\":\"migratedMemberships\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"CdbMigratedMembership\",\"fields\":[{\"name\":\"active\",\"type\":\"boolean\",\"default\":false},{\"name\":\"consumerId\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"effectiveDate\",\"type\":[\"null\",\"string\"],\"doc\":\"Date format: CCYY-MM-DD\",\"default\":null},{\"name\":\"legacySourceId\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"partitionNumber\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"policyNumber\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"sourceCode\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"subscriberId\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"terminationDate\",\"type\":[\"null\",\"string\"],\"doc\":\"Date format: CCYY-MM-DD\",\"default\":null},{\"name\":\"xrefId\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"xrefIdPartitionNumber\",\"type\":[\"null\",\"int\"],\"default\":null}]}}],\"default\":null},{\"name\":\"otherInsurances\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"CdbIndividualOtherInsurance\",\"fields\":[{\"name\":\"coverageTypeCode\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"custody\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"DescriptionType\",\"namespace\":\"com.uhc.schema.model.eligibility.common\",\"fields\":[{\"name\":\"code\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"description\",\"type\":[\"null\",\"string\"],\"default\":null}]}],\"doc\":\"custody types.\",\"default\":null},{\"name\":\"effectiveDate\",\"type\":[\"null\",\"string\"],\"doc\":\"Date format: CCYY-MM-DD\",\"default\":null},{\"name\":\"otherInsuranceIndicator\",\"type\":\"boolean\",\"default\":false},{\"name\":\"sourceUpdateTypeCode\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"terminationDate\",\"type\":[\"null\",\"string\"],\"doc\":\"Date format: CCYY-MM-DD\",\"default\":null},{\"name\":\"updateRestrictionTypeCode\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"verificationDate\",\"type\":[\"null\",\"string\"],\"doc\":\"Date format: CCYY-MM-DD\",\"default\":null}]}}],\"default\":null},{\"name\":\"partitionNumber\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"referenceData\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"CdbIndividualReferenceData\",\"fields\":[{\"name\":\"employmentStatusCode\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"genderTypeCode\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"maritalStatusTypeCode\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"subscriberRelationshipTypeCode\",\"type\":[\"null\",\"string\"],\"default\":null}]}],\"default\":null},{\"name\":\"spclProcHndlCd\",\"type\":[\"null\",\"string\"],\"doc\":\"Code for cdbSpclProc.\",\"default\":null},{\"name\":\"xrefId\",\"type\":[\"null\",\"int\"],\"doc\":\"An integer field which represents the SRC_CD, LGCY_SRC_ID, CNSM_ID, and PARTN_NBR.\",\"default\":null},{\"name\":\"xrefIdPartitionNumber\",\"type\":[\"null\",\"int\"],\"doc\":\"Partition number for cdbXrefId.\",\"default\":null}]}],\"default\":null},{\"name\":\"cirrus\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"CirrusIndividualSourceSystemAttributes\",\"namespace\":\"com.uhc.schema.model.eligibility.cirrus\",\"fields\":[{\"name\":\"eligibilityHoldIndicator\",\"type\":\"boolean\",\"default\":false},{\"name\":\"internationalPhoneIndicator\",\"type\":\"boolean\",\"default\":false}]}],\"default\":null},{\"name\":\"medicareAndRetirement\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"MedicareAndRetirementIndividualSourceSystemAttributes\",\"namespace\":\"com.uhc.schema.model.eligibility.medicareandretirement\",\"fields\":[{\"name\":\"insuredCode\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"migratedSourceSystem\",\"type\":[\"null\",\"com.uhc.schema.model.eligibility.common.DescriptionType\"],\"default\":null},{\"name\":\"specialHandling\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"com.uhc.schema.model.eligibility.common.DescriptionType\"}],\"default\":null}]}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<IndividualSourceSystemAttributes> ENCODER =
      new BinaryMessageEncoder<IndividualSourceSystemAttributes>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<IndividualSourceSystemAttributes> DECODER =
      new BinaryMessageDecoder<IndividualSourceSystemAttributes>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<IndividualSourceSystemAttributes> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<IndividualSourceSystemAttributes> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<IndividualSourceSystemAttributes>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this IndividualSourceSystemAttributes to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a IndividualSourceSystemAttributes from a ByteBuffer. */
  public static IndividualSourceSystemAttributes fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public com.uhc.schema.model.eligibility.cdb.CdbIndividualSourceSystemAttributes cdb;
  @Deprecated public com.uhc.schema.model.eligibility.cirrus.CirrusIndividualSourceSystemAttributes cirrus;
  @Deprecated public com.uhc.schema.model.eligibility.medicareandretirement.MedicareAndRetirementIndividualSourceSystemAttributes medicareAndRetirement;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public IndividualSourceSystemAttributes() {}

  /**
   * All-args constructor.
   * @param cdb The new value for cdb
   * @param cirrus The new value for cirrus
   * @param medicareAndRetirement The new value for medicareAndRetirement
   */
  public IndividualSourceSystemAttributes(com.uhc.schema.model.eligibility.cdb.CdbIndividualSourceSystemAttributes cdb, com.uhc.schema.model.eligibility.cirrus.CirrusIndividualSourceSystemAttributes cirrus, com.uhc.schema.model.eligibility.medicareandretirement.MedicareAndRetirementIndividualSourceSystemAttributes medicareAndRetirement) {
    this.cdb = cdb;
    this.cirrus = cirrus;
    this.medicareAndRetirement = medicareAndRetirement;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return cdb;
    case 1: return cirrus;
    case 2: return medicareAndRetirement;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: cdb = (com.uhc.schema.model.eligibility.cdb.CdbIndividualSourceSystemAttributes)value$; break;
    case 1: cirrus = (com.uhc.schema.model.eligibility.cirrus.CirrusIndividualSourceSystemAttributes)value$; break;
    case 2: medicareAndRetirement = (com.uhc.schema.model.eligibility.medicareandretirement.MedicareAndRetirementIndividualSourceSystemAttributes)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'cdb' field.
   * @return The value of the 'cdb' field.
   */
  public com.uhc.schema.model.eligibility.cdb.CdbIndividualSourceSystemAttributes getCdb() {
    return cdb;
  }

  /**
   * Sets the value of the 'cdb' field.
   * @param value the value to set.
   */
  public void setCdb(com.uhc.schema.model.eligibility.cdb.CdbIndividualSourceSystemAttributes value) {
    this.cdb = value;
  }

  /**
   * Gets the value of the 'cirrus' field.
   * @return The value of the 'cirrus' field.
   */
  public com.uhc.schema.model.eligibility.cirrus.CirrusIndividualSourceSystemAttributes getCirrus() {
    return cirrus;
  }

  /**
   * Sets the value of the 'cirrus' field.
   * @param value the value to set.
   */
  public void setCirrus(com.uhc.schema.model.eligibility.cirrus.CirrusIndividualSourceSystemAttributes value) {
    this.cirrus = value;
  }

  /**
   * Gets the value of the 'medicareAndRetirement' field.
   * @return The value of the 'medicareAndRetirement' field.
   */
  public com.uhc.schema.model.eligibility.medicareandretirement.MedicareAndRetirementIndividualSourceSystemAttributes getMedicareAndRetirement() {
    return medicareAndRetirement;
  }

  /**
   * Sets the value of the 'medicareAndRetirement' field.
   * @param value the value to set.
   */
  public void setMedicareAndRetirement(com.uhc.schema.model.eligibility.medicareandretirement.MedicareAndRetirementIndividualSourceSystemAttributes value) {
    this.medicareAndRetirement = value;
  }

  /**
   * Creates a new IndividualSourceSystemAttributes RecordBuilder.
   * @return A new IndividualSourceSystemAttributes RecordBuilder
   */
  public static com.uhc.schema.model.eligibility.individual.IndividualSourceSystemAttributes.Builder newBuilder() {
    return new com.uhc.schema.model.eligibility.individual.IndividualSourceSystemAttributes.Builder();
  }

  /**
   * Creates a new IndividualSourceSystemAttributes RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new IndividualSourceSystemAttributes RecordBuilder
   */
  public static com.uhc.schema.model.eligibility.individual.IndividualSourceSystemAttributes.Builder newBuilder(com.uhc.schema.model.eligibility.individual.IndividualSourceSystemAttributes.Builder other) {
    return new com.uhc.schema.model.eligibility.individual.IndividualSourceSystemAttributes.Builder(other);
  }

  /**
   * Creates a new IndividualSourceSystemAttributes RecordBuilder by copying an existing IndividualSourceSystemAttributes instance.
   * @param other The existing instance to copy.
   * @return A new IndividualSourceSystemAttributes RecordBuilder
   */
  public static com.uhc.schema.model.eligibility.individual.IndividualSourceSystemAttributes.Builder newBuilder(com.uhc.schema.model.eligibility.individual.IndividualSourceSystemAttributes other) {
    return new com.uhc.schema.model.eligibility.individual.IndividualSourceSystemAttributes.Builder(other);
  }

  /**
   * RecordBuilder for IndividualSourceSystemAttributes instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<IndividualSourceSystemAttributes>
    implements org.apache.avro.data.RecordBuilder<IndividualSourceSystemAttributes> {

    private com.uhc.schema.model.eligibility.cdb.CdbIndividualSourceSystemAttributes cdb;
    private com.uhc.schema.model.eligibility.cdb.CdbIndividualSourceSystemAttributes.Builder cdbBuilder;
    private com.uhc.schema.model.eligibility.cirrus.CirrusIndividualSourceSystemAttributes cirrus;
    private com.uhc.schema.model.eligibility.cirrus.CirrusIndividualSourceSystemAttributes.Builder cirrusBuilder;
    private com.uhc.schema.model.eligibility.medicareandretirement.MedicareAndRetirementIndividualSourceSystemAttributes medicareAndRetirement;
    private com.uhc.schema.model.eligibility.medicareandretirement.MedicareAndRetirementIndividualSourceSystemAttributes.Builder medicareAndRetirementBuilder;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.uhc.schema.model.eligibility.individual.IndividualSourceSystemAttributes.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.cdb)) {
        this.cdb = data().deepCopy(fields()[0].schema(), other.cdb);
        fieldSetFlags()[0] = true;
      }
      if (other.hasCdbBuilder()) {
        this.cdbBuilder = com.uhc.schema.model.eligibility.cdb.CdbIndividualSourceSystemAttributes.newBuilder(other.getCdbBuilder());
      }
      if (isValidValue(fields()[1], other.cirrus)) {
        this.cirrus = data().deepCopy(fields()[1].schema(), other.cirrus);
        fieldSetFlags()[1] = true;
      }
      if (other.hasCirrusBuilder()) {
        this.cirrusBuilder = com.uhc.schema.model.eligibility.cirrus.CirrusIndividualSourceSystemAttributes.newBuilder(other.getCirrusBuilder());
      }
      if (isValidValue(fields()[2], other.medicareAndRetirement)) {
        this.medicareAndRetirement = data().deepCopy(fields()[2].schema(), other.medicareAndRetirement);
        fieldSetFlags()[2] = true;
      }
      if (other.hasMedicareAndRetirementBuilder()) {
        this.medicareAndRetirementBuilder = com.uhc.schema.model.eligibility.medicareandretirement.MedicareAndRetirementIndividualSourceSystemAttributes.newBuilder(other.getMedicareAndRetirementBuilder());
      }
    }

    /**
     * Creates a Builder by copying an existing IndividualSourceSystemAttributes instance
     * @param other The existing instance to copy.
     */
    private Builder(com.uhc.schema.model.eligibility.individual.IndividualSourceSystemAttributes other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.cdb)) {
        this.cdb = data().deepCopy(fields()[0].schema(), other.cdb);
        fieldSetFlags()[0] = true;
      }
      this.cdbBuilder = null;
      if (isValidValue(fields()[1], other.cirrus)) {
        this.cirrus = data().deepCopy(fields()[1].schema(), other.cirrus);
        fieldSetFlags()[1] = true;
      }
      this.cirrusBuilder = null;
      if (isValidValue(fields()[2], other.medicareAndRetirement)) {
        this.medicareAndRetirement = data().deepCopy(fields()[2].schema(), other.medicareAndRetirement);
        fieldSetFlags()[2] = true;
      }
      this.medicareAndRetirementBuilder = null;
    }

    /**
      * Gets the value of the 'cdb' field.
      * @return The value.
      */
    public com.uhc.schema.model.eligibility.cdb.CdbIndividualSourceSystemAttributes getCdb() {
      return cdb;
    }

    /**
      * Sets the value of the 'cdb' field.
      * @param value The value of 'cdb'.
      * @return This builder.
      */
    public com.uhc.schema.model.eligibility.individual.IndividualSourceSystemAttributes.Builder setCdb(com.uhc.schema.model.eligibility.cdb.CdbIndividualSourceSystemAttributes value) {
      validate(fields()[0], value);
      this.cdbBuilder = null;
      this.cdb = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'cdb' field has been set.
      * @return True if the 'cdb' field has been set, false otherwise.
      */
    public boolean hasCdb() {
      return fieldSetFlags()[0];
    }

    /**
     * Gets the Builder instance for the 'cdb' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.uhc.schema.model.eligibility.cdb.CdbIndividualSourceSystemAttributes.Builder getCdbBuilder() {
      if (cdbBuilder == null) {
        if (hasCdb()) {
          setCdbBuilder(com.uhc.schema.model.eligibility.cdb.CdbIndividualSourceSystemAttributes.newBuilder(cdb));
        } else {
          setCdbBuilder(com.uhc.schema.model.eligibility.cdb.CdbIndividualSourceSystemAttributes.newBuilder());
        }
      }
      return cdbBuilder;
    }

    /**
     * Sets the Builder instance for the 'cdb' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public com.uhc.schema.model.eligibility.individual.IndividualSourceSystemAttributes.Builder setCdbBuilder(com.uhc.schema.model.eligibility.cdb.CdbIndividualSourceSystemAttributes.Builder value) {
      clearCdb();
      cdbBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'cdb' field has an active Builder instance
     * @return True if the 'cdb' field has an active Builder instance
     */
    public boolean hasCdbBuilder() {
      return cdbBuilder != null;
    }

    /**
      * Clears the value of the 'cdb' field.
      * @return This builder.
      */
    public com.uhc.schema.model.eligibility.individual.IndividualSourceSystemAttributes.Builder clearCdb() {
      cdb = null;
      cdbBuilder = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'cirrus' field.
      * @return The value.
      */
    public com.uhc.schema.model.eligibility.cirrus.CirrusIndividualSourceSystemAttributes getCirrus() {
      return cirrus;
    }

    /**
      * Sets the value of the 'cirrus' field.
      * @param value The value of 'cirrus'.
      * @return This builder.
      */
    public com.uhc.schema.model.eligibility.individual.IndividualSourceSystemAttributes.Builder setCirrus(com.uhc.schema.model.eligibility.cirrus.CirrusIndividualSourceSystemAttributes value) {
      validate(fields()[1], value);
      this.cirrusBuilder = null;
      this.cirrus = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'cirrus' field has been set.
      * @return True if the 'cirrus' field has been set, false otherwise.
      */
    public boolean hasCirrus() {
      return fieldSetFlags()[1];
    }

    /**
     * Gets the Builder instance for the 'cirrus' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.uhc.schema.model.eligibility.cirrus.CirrusIndividualSourceSystemAttributes.Builder getCirrusBuilder() {
      if (cirrusBuilder == null) {
        if (hasCirrus()) {
          setCirrusBuilder(com.uhc.schema.model.eligibility.cirrus.CirrusIndividualSourceSystemAttributes.newBuilder(cirrus));
        } else {
          setCirrusBuilder(com.uhc.schema.model.eligibility.cirrus.CirrusIndividualSourceSystemAttributes.newBuilder());
        }
      }
      return cirrusBuilder;
    }

    /**
     * Sets the Builder instance for the 'cirrus' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public com.uhc.schema.model.eligibility.individual.IndividualSourceSystemAttributes.Builder setCirrusBuilder(com.uhc.schema.model.eligibility.cirrus.CirrusIndividualSourceSystemAttributes.Builder value) {
      clearCirrus();
      cirrusBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'cirrus' field has an active Builder instance
     * @return True if the 'cirrus' field has an active Builder instance
     */
    public boolean hasCirrusBuilder() {
      return cirrusBuilder != null;
    }

    /**
      * Clears the value of the 'cirrus' field.
      * @return This builder.
      */
    public com.uhc.schema.model.eligibility.individual.IndividualSourceSystemAttributes.Builder clearCirrus() {
      cirrus = null;
      cirrusBuilder = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'medicareAndRetirement' field.
      * @return The value.
      */
    public com.uhc.schema.model.eligibility.medicareandretirement.MedicareAndRetirementIndividualSourceSystemAttributes getMedicareAndRetirement() {
      return medicareAndRetirement;
    }

    /**
      * Sets the value of the 'medicareAndRetirement' field.
      * @param value The value of 'medicareAndRetirement'.
      * @return This builder.
      */
    public com.uhc.schema.model.eligibility.individual.IndividualSourceSystemAttributes.Builder setMedicareAndRetirement(com.uhc.schema.model.eligibility.medicareandretirement.MedicareAndRetirementIndividualSourceSystemAttributes value) {
      validate(fields()[2], value);
      this.medicareAndRetirementBuilder = null;
      this.medicareAndRetirement = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'medicareAndRetirement' field has been set.
      * @return True if the 'medicareAndRetirement' field has been set, false otherwise.
      */
    public boolean hasMedicareAndRetirement() {
      return fieldSetFlags()[2];
    }

    /**
     * Gets the Builder instance for the 'medicareAndRetirement' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.uhc.schema.model.eligibility.medicareandretirement.MedicareAndRetirementIndividualSourceSystemAttributes.Builder getMedicareAndRetirementBuilder() {
      if (medicareAndRetirementBuilder == null) {
        if (hasMedicareAndRetirement()) {
          setMedicareAndRetirementBuilder(com.uhc.schema.model.eligibility.medicareandretirement.MedicareAndRetirementIndividualSourceSystemAttributes.newBuilder(medicareAndRetirement));
        } else {
          setMedicareAndRetirementBuilder(com.uhc.schema.model.eligibility.medicareandretirement.MedicareAndRetirementIndividualSourceSystemAttributes.newBuilder());
        }
      }
      return medicareAndRetirementBuilder;
    }

    /**
     * Sets the Builder instance for the 'medicareAndRetirement' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public com.uhc.schema.model.eligibility.individual.IndividualSourceSystemAttributes.Builder setMedicareAndRetirementBuilder(com.uhc.schema.model.eligibility.medicareandretirement.MedicareAndRetirementIndividualSourceSystemAttributes.Builder value) {
      clearMedicareAndRetirement();
      medicareAndRetirementBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'medicareAndRetirement' field has an active Builder instance
     * @return True if the 'medicareAndRetirement' field has an active Builder instance
     */
    public boolean hasMedicareAndRetirementBuilder() {
      return medicareAndRetirementBuilder != null;
    }

    /**
      * Clears the value of the 'medicareAndRetirement' field.
      * @return This builder.
      */
    public com.uhc.schema.model.eligibility.individual.IndividualSourceSystemAttributes.Builder clearMedicareAndRetirement() {
      medicareAndRetirement = null;
      medicareAndRetirementBuilder = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public IndividualSourceSystemAttributes build() {
      try {
        IndividualSourceSystemAttributes record = new IndividualSourceSystemAttributes();
        if (cdbBuilder != null) {
          record.cdb = this.cdbBuilder.build();
        } else {
          record.cdb = fieldSetFlags()[0] ? this.cdb : (com.uhc.schema.model.eligibility.cdb.CdbIndividualSourceSystemAttributes) defaultValue(fields()[0]);
        }
        if (cirrusBuilder != null) {
          record.cirrus = this.cirrusBuilder.build();
        } else {
          record.cirrus = fieldSetFlags()[1] ? this.cirrus : (com.uhc.schema.model.eligibility.cirrus.CirrusIndividualSourceSystemAttributes) defaultValue(fields()[1]);
        }
        if (medicareAndRetirementBuilder != null) {
          record.medicareAndRetirement = this.medicareAndRetirementBuilder.build();
        } else {
          record.medicareAndRetirement = fieldSetFlags()[2] ? this.medicareAndRetirement : (com.uhc.schema.model.eligibility.medicareandretirement.MedicareAndRetirementIndividualSourceSystemAttributes) defaultValue(fields()[2]);
        }
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<IndividualSourceSystemAttributes>
    WRITER$ = (org.apache.avro.io.DatumWriter<IndividualSourceSystemAttributes>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<IndividualSourceSystemAttributes>
    READER$ = (org.apache.avro.io.DatumReader<IndividualSourceSystemAttributes>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}