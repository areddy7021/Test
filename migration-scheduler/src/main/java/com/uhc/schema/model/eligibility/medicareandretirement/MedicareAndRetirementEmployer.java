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
public class MedicareAndRetirementEmployer extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -5997009324710579524L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"MedicareAndRetirementEmployer\",\"namespace\":\"com.uhc.schema.model.eligibility.medicareandretirement\",\"fields\":[{\"name\":\"branchNumber\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"employerDates\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"DateRangeType\",\"namespace\":\"com.uhc.schema.model.eligibility.common\",\"fields\":[{\"name\":\"startDate\",\"type\":[\"null\",\"string\"],\"doc\":\"Date format: CCYY-MM-DD\",\"default\":null},{\"name\":\"endDate\",\"type\":[\"null\",\"string\"],\"doc\":\"Date format: CCYY-MM-DD\",\"default\":null}]}],\"default\":null},{\"name\":\"employerIdentifier\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"employmentStatus\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"DescriptionType\",\"namespace\":\"com.uhc.schema.model.eligibility.common\",\"fields\":[{\"name\":\"code\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"description\",\"type\":[\"null\",\"string\"],\"default\":null}]}],\"doc\":\"Indicates the employment status for an employment record (e.g., Full Time, Part Time, etc.).\",\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<MedicareAndRetirementEmployer> ENCODER =
      new BinaryMessageEncoder<MedicareAndRetirementEmployer>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<MedicareAndRetirementEmployer> DECODER =
      new BinaryMessageDecoder<MedicareAndRetirementEmployer>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<MedicareAndRetirementEmployer> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<MedicareAndRetirementEmployer> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<MedicareAndRetirementEmployer>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this MedicareAndRetirementEmployer to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a MedicareAndRetirementEmployer from a ByteBuffer. */
  public static MedicareAndRetirementEmployer fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence branchNumber;
  @Deprecated public com.uhc.schema.model.eligibility.common.DateRangeType employerDates;
  @Deprecated public java.lang.CharSequence employerIdentifier;
  /** Indicates the employment status for an employment record (e.g., Full Time, Part Time, etc.). */
  @Deprecated public com.uhc.schema.model.eligibility.common.DescriptionType employmentStatus;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public MedicareAndRetirementEmployer() {}

  /**
   * All-args constructor.
   * @param branchNumber The new value for branchNumber
   * @param employerDates The new value for employerDates
   * @param employerIdentifier The new value for employerIdentifier
   * @param employmentStatus Indicates the employment status for an employment record (e.g., Full Time, Part Time, etc.).
   */
  public MedicareAndRetirementEmployer(java.lang.CharSequence branchNumber, com.uhc.schema.model.eligibility.common.DateRangeType employerDates, java.lang.CharSequence employerIdentifier, com.uhc.schema.model.eligibility.common.DescriptionType employmentStatus) {
    this.branchNumber = branchNumber;
    this.employerDates = employerDates;
    this.employerIdentifier = employerIdentifier;
    this.employmentStatus = employmentStatus;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return branchNumber;
    case 1: return employerDates;
    case 2: return employerIdentifier;
    case 3: return employmentStatus;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: branchNumber = (java.lang.CharSequence)value$; break;
    case 1: employerDates = (com.uhc.schema.model.eligibility.common.DateRangeType)value$; break;
    case 2: employerIdentifier = (java.lang.CharSequence)value$; break;
    case 3: employmentStatus = (com.uhc.schema.model.eligibility.common.DescriptionType)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'branchNumber' field.
   * @return The value of the 'branchNumber' field.
   */
  public java.lang.CharSequence getBranchNumber() {
    return branchNumber;
  }

  /**
   * Sets the value of the 'branchNumber' field.
   * @param value the value to set.
   */
  public void setBranchNumber(java.lang.CharSequence value) {
    this.branchNumber = value;
  }

  /**
   * Gets the value of the 'employerDates' field.
   * @return The value of the 'employerDates' field.
   */
  public com.uhc.schema.model.eligibility.common.DateRangeType getEmployerDates() {
    return employerDates;
  }

  /**
   * Sets the value of the 'employerDates' field.
   * @param value the value to set.
   */
  public void setEmployerDates(com.uhc.schema.model.eligibility.common.DateRangeType value) {
    this.employerDates = value;
  }

  /**
   * Gets the value of the 'employerIdentifier' field.
   * @return The value of the 'employerIdentifier' field.
   */
  public java.lang.CharSequence getEmployerIdentifier() {
    return employerIdentifier;
  }

  /**
   * Sets the value of the 'employerIdentifier' field.
   * @param value the value to set.
   */
  public void setEmployerIdentifier(java.lang.CharSequence value) {
    this.employerIdentifier = value;
  }

  /**
   * Gets the value of the 'employmentStatus' field.
   * @return Indicates the employment status for an employment record (e.g., Full Time, Part Time, etc.).
   */
  public com.uhc.schema.model.eligibility.common.DescriptionType getEmploymentStatus() {
    return employmentStatus;
  }

  /**
   * Sets the value of the 'employmentStatus' field.
   * Indicates the employment status for an employment record (e.g., Full Time, Part Time, etc.).
   * @param value the value to set.
   */
  public void setEmploymentStatus(com.uhc.schema.model.eligibility.common.DescriptionType value) {
    this.employmentStatus = value;
  }

  /**
   * Creates a new MedicareAndRetirementEmployer RecordBuilder.
   * @return A new MedicareAndRetirementEmployer RecordBuilder
   */
  public static com.uhc.schema.model.eligibility.medicareandretirement.MedicareAndRetirementEmployer.Builder newBuilder() {
    return new com.uhc.schema.model.eligibility.medicareandretirement.MedicareAndRetirementEmployer.Builder();
  }

  /**
   * Creates a new MedicareAndRetirementEmployer RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new MedicareAndRetirementEmployer RecordBuilder
   */
  public static com.uhc.schema.model.eligibility.medicareandretirement.MedicareAndRetirementEmployer.Builder newBuilder(com.uhc.schema.model.eligibility.medicareandretirement.MedicareAndRetirementEmployer.Builder other) {
    return new com.uhc.schema.model.eligibility.medicareandretirement.MedicareAndRetirementEmployer.Builder(other);
  }

  /**
   * Creates a new MedicareAndRetirementEmployer RecordBuilder by copying an existing MedicareAndRetirementEmployer instance.
   * @param other The existing instance to copy.
   * @return A new MedicareAndRetirementEmployer RecordBuilder
   */
  public static com.uhc.schema.model.eligibility.medicareandretirement.MedicareAndRetirementEmployer.Builder newBuilder(com.uhc.schema.model.eligibility.medicareandretirement.MedicareAndRetirementEmployer other) {
    return new com.uhc.schema.model.eligibility.medicareandretirement.MedicareAndRetirementEmployer.Builder(other);
  }

  /**
   * RecordBuilder for MedicareAndRetirementEmployer instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<MedicareAndRetirementEmployer>
    implements org.apache.avro.data.RecordBuilder<MedicareAndRetirementEmployer> {

    private java.lang.CharSequence branchNumber;
    private com.uhc.schema.model.eligibility.common.DateRangeType employerDates;
    private com.uhc.schema.model.eligibility.common.DateRangeType.Builder employerDatesBuilder;
    private java.lang.CharSequence employerIdentifier;
    /** Indicates the employment status for an employment record (e.g., Full Time, Part Time, etc.). */
    private com.uhc.schema.model.eligibility.common.DescriptionType employmentStatus;
    private com.uhc.schema.model.eligibility.common.DescriptionType.Builder employmentStatusBuilder;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.uhc.schema.model.eligibility.medicareandretirement.MedicareAndRetirementEmployer.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.branchNumber)) {
        this.branchNumber = data().deepCopy(fields()[0].schema(), other.branchNumber);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.employerDates)) {
        this.employerDates = data().deepCopy(fields()[1].schema(), other.employerDates);
        fieldSetFlags()[1] = true;
      }
      if (other.hasEmployerDatesBuilder()) {
        this.employerDatesBuilder = com.uhc.schema.model.eligibility.common.DateRangeType.newBuilder(other.getEmployerDatesBuilder());
      }
      if (isValidValue(fields()[2], other.employerIdentifier)) {
        this.employerIdentifier = data().deepCopy(fields()[2].schema(), other.employerIdentifier);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.employmentStatus)) {
        this.employmentStatus = data().deepCopy(fields()[3].schema(), other.employmentStatus);
        fieldSetFlags()[3] = true;
      }
      if (other.hasEmploymentStatusBuilder()) {
        this.employmentStatusBuilder = com.uhc.schema.model.eligibility.common.DescriptionType.newBuilder(other.getEmploymentStatusBuilder());
      }
    }

    /**
     * Creates a Builder by copying an existing MedicareAndRetirementEmployer instance
     * @param other The existing instance to copy.
     */
    private Builder(com.uhc.schema.model.eligibility.medicareandretirement.MedicareAndRetirementEmployer other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.branchNumber)) {
        this.branchNumber = data().deepCopy(fields()[0].schema(), other.branchNumber);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.employerDates)) {
        this.employerDates = data().deepCopy(fields()[1].schema(), other.employerDates);
        fieldSetFlags()[1] = true;
      }
      this.employerDatesBuilder = null;
      if (isValidValue(fields()[2], other.employerIdentifier)) {
        this.employerIdentifier = data().deepCopy(fields()[2].schema(), other.employerIdentifier);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.employmentStatus)) {
        this.employmentStatus = data().deepCopy(fields()[3].schema(), other.employmentStatus);
        fieldSetFlags()[3] = true;
      }
      this.employmentStatusBuilder = null;
    }

    /**
      * Gets the value of the 'branchNumber' field.
      * @return The value.
      */
    public java.lang.CharSequence getBranchNumber() {
      return branchNumber;
    }

    /**
      * Sets the value of the 'branchNumber' field.
      * @param value The value of 'branchNumber'.
      * @return This builder.
      */
    public com.uhc.schema.model.eligibility.medicareandretirement.MedicareAndRetirementEmployer.Builder setBranchNumber(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.branchNumber = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'branchNumber' field has been set.
      * @return True if the 'branchNumber' field has been set, false otherwise.
      */
    public boolean hasBranchNumber() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'branchNumber' field.
      * @return This builder.
      */
    public com.uhc.schema.model.eligibility.medicareandretirement.MedicareAndRetirementEmployer.Builder clearBranchNumber() {
      branchNumber = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'employerDates' field.
      * @return The value.
      */
    public com.uhc.schema.model.eligibility.common.DateRangeType getEmployerDates() {
      return employerDates;
    }

    /**
      * Sets the value of the 'employerDates' field.
      * @param value The value of 'employerDates'.
      * @return This builder.
      */
    public com.uhc.schema.model.eligibility.medicareandretirement.MedicareAndRetirementEmployer.Builder setEmployerDates(com.uhc.schema.model.eligibility.common.DateRangeType value) {
      validate(fields()[1], value);
      this.employerDatesBuilder = null;
      this.employerDates = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'employerDates' field has been set.
      * @return True if the 'employerDates' field has been set, false otherwise.
      */
    public boolean hasEmployerDates() {
      return fieldSetFlags()[1];
    }

    /**
     * Gets the Builder instance for the 'employerDates' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.uhc.schema.model.eligibility.common.DateRangeType.Builder getEmployerDatesBuilder() {
      if (employerDatesBuilder == null) {
        if (hasEmployerDates()) {
          setEmployerDatesBuilder(com.uhc.schema.model.eligibility.common.DateRangeType.newBuilder(employerDates));
        } else {
          setEmployerDatesBuilder(com.uhc.schema.model.eligibility.common.DateRangeType.newBuilder());
        }
      }
      return employerDatesBuilder;
    }

    /**
     * Sets the Builder instance for the 'employerDates' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public com.uhc.schema.model.eligibility.medicareandretirement.MedicareAndRetirementEmployer.Builder setEmployerDatesBuilder(com.uhc.schema.model.eligibility.common.DateRangeType.Builder value) {
      clearEmployerDates();
      employerDatesBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'employerDates' field has an active Builder instance
     * @return True if the 'employerDates' field has an active Builder instance
     */
    public boolean hasEmployerDatesBuilder() {
      return employerDatesBuilder != null;
    }

    /**
      * Clears the value of the 'employerDates' field.
      * @return This builder.
      */
    public com.uhc.schema.model.eligibility.medicareandretirement.MedicareAndRetirementEmployer.Builder clearEmployerDates() {
      employerDates = null;
      employerDatesBuilder = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'employerIdentifier' field.
      * @return The value.
      */
    public java.lang.CharSequence getEmployerIdentifier() {
      return employerIdentifier;
    }

    /**
      * Sets the value of the 'employerIdentifier' field.
      * @param value The value of 'employerIdentifier'.
      * @return This builder.
      */
    public com.uhc.schema.model.eligibility.medicareandretirement.MedicareAndRetirementEmployer.Builder setEmployerIdentifier(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.employerIdentifier = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'employerIdentifier' field has been set.
      * @return True if the 'employerIdentifier' field has been set, false otherwise.
      */
    public boolean hasEmployerIdentifier() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'employerIdentifier' field.
      * @return This builder.
      */
    public com.uhc.schema.model.eligibility.medicareandretirement.MedicareAndRetirementEmployer.Builder clearEmployerIdentifier() {
      employerIdentifier = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'employmentStatus' field.
      * Indicates the employment status for an employment record (e.g., Full Time, Part Time, etc.).
      * @return The value.
      */
    public com.uhc.schema.model.eligibility.common.DescriptionType getEmploymentStatus() {
      return employmentStatus;
    }

    /**
      * Sets the value of the 'employmentStatus' field.
      * Indicates the employment status for an employment record (e.g., Full Time, Part Time, etc.).
      * @param value The value of 'employmentStatus'.
      * @return This builder.
      */
    public com.uhc.schema.model.eligibility.medicareandretirement.MedicareAndRetirementEmployer.Builder setEmploymentStatus(com.uhc.schema.model.eligibility.common.DescriptionType value) {
      validate(fields()[3], value);
      this.employmentStatusBuilder = null;
      this.employmentStatus = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'employmentStatus' field has been set.
      * Indicates the employment status for an employment record (e.g., Full Time, Part Time, etc.).
      * @return True if the 'employmentStatus' field has been set, false otherwise.
      */
    public boolean hasEmploymentStatus() {
      return fieldSetFlags()[3];
    }

    /**
     * Gets the Builder instance for the 'employmentStatus' field and creates one if it doesn't exist yet.
     * Indicates the employment status for an employment record (e.g., Full Time, Part Time, etc.).
     * @return This builder.
     */
    public com.uhc.schema.model.eligibility.common.DescriptionType.Builder getEmploymentStatusBuilder() {
      if (employmentStatusBuilder == null) {
        if (hasEmploymentStatus()) {
          setEmploymentStatusBuilder(com.uhc.schema.model.eligibility.common.DescriptionType.newBuilder(employmentStatus));
        } else {
          setEmploymentStatusBuilder(com.uhc.schema.model.eligibility.common.DescriptionType.newBuilder());
        }
      }
      return employmentStatusBuilder;
    }

    /**
     * Sets the Builder instance for the 'employmentStatus' field
     * Indicates the employment status for an employment record (e.g., Full Time, Part Time, etc.).
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public com.uhc.schema.model.eligibility.medicareandretirement.MedicareAndRetirementEmployer.Builder setEmploymentStatusBuilder(com.uhc.schema.model.eligibility.common.DescriptionType.Builder value) {
      clearEmploymentStatus();
      employmentStatusBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'employmentStatus' field has an active Builder instance
     * Indicates the employment status for an employment record (e.g., Full Time, Part Time, etc.).
     * @return True if the 'employmentStatus' field has an active Builder instance
     */
    public boolean hasEmploymentStatusBuilder() {
      return employmentStatusBuilder != null;
    }

    /**
      * Clears the value of the 'employmentStatus' field.
      * Indicates the employment status for an employment record (e.g., Full Time, Part Time, etc.).
      * @return This builder.
      */
    public com.uhc.schema.model.eligibility.medicareandretirement.MedicareAndRetirementEmployer.Builder clearEmploymentStatus() {
      employmentStatus = null;
      employmentStatusBuilder = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public MedicareAndRetirementEmployer build() {
      try {
        MedicareAndRetirementEmployer record = new MedicareAndRetirementEmployer();
        record.branchNumber = fieldSetFlags()[0] ? this.branchNumber : (java.lang.CharSequence) defaultValue(fields()[0]);
        if (employerDatesBuilder != null) {
          record.employerDates = this.employerDatesBuilder.build();
        } else {
          record.employerDates = fieldSetFlags()[1] ? this.employerDates : (com.uhc.schema.model.eligibility.common.DateRangeType) defaultValue(fields()[1]);
        }
        record.employerIdentifier = fieldSetFlags()[2] ? this.employerIdentifier : (java.lang.CharSequence) defaultValue(fields()[2]);
        if (employmentStatusBuilder != null) {
          record.employmentStatus = this.employmentStatusBuilder.build();
        } else {
          record.employmentStatus = fieldSetFlags()[3] ? this.employmentStatus : (com.uhc.schema.model.eligibility.common.DescriptionType) defaultValue(fields()[3]);
        }
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<MedicareAndRetirementEmployer>
    WRITER$ = (org.apache.avro.io.DatumWriter<MedicareAndRetirementEmployer>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<MedicareAndRetirementEmployer>
    READER$ = (org.apache.avro.io.DatumReader<MedicareAndRetirementEmployer>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
