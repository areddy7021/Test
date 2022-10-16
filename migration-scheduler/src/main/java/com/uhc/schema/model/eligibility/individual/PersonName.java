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
public class PersonName extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 8705616061354386010L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"PersonName\",\"namespace\":\"com.uhc.schema.model.eligibility.individual\",\"fields\":[{\"name\":\"firstName\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"lastName\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"lastUpdated\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"LastUpdated\",\"namespace\":\"com.uhc.schema.model.eligibility.common\",\"doc\":\"Information about the last update made to a given entity.\",\"fields\":[{\"name\":\"sourceSystemTimestamp\",\"type\":[\"null\",\"string\"],\"doc\":\"The last time the entity was updated on the source system (CDB ROW_TMSTMP) in format (UTC timezone): CCYY-MM-DDThh:mm:ss.sssZ\",\"default\":null},{\"name\":\"sourceTimestamp\",\"type\":[\"null\",\"string\"],\"doc\":\"The last time the entity was updated on the originating source (CDB SRC_TMSTMP) in format (UTC timezone): CCYY-MM-DDThh:mm:ss.sssZ\",\"default\":null},{\"name\":\"userId\",\"type\":[\"null\",\"string\"],\"doc\":\"The last person or application to update the entity.\",\"default\":null}]}],\"default\":null},{\"name\":\"middleInitial\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"middleName\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"nameType\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"DescriptionType\",\"namespace\":\"com.uhc.schema.model.eligibility.common\",\"fields\":[{\"name\":\"code\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"description\",\"type\":[\"null\",\"string\"],\"default\":null}]}],\"default\":null},{\"name\":\"preferredFirstName\",\"type\":[\"null\",\"string\"],\"doc\":\"The preferred first name for an individual.\",\"default\":null},{\"name\":\"prefix\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"sourceCode\",\"type\":[\"null\",\"string\"],\"default\":null,\"aliases\":[\"sourceSystemCode\"]},{\"name\":\"suffix\",\"type\":[\"null\",\"string\"],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<PersonName> ENCODER =
      new BinaryMessageEncoder<PersonName>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<PersonName> DECODER =
      new BinaryMessageDecoder<PersonName>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<PersonName> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<PersonName> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<PersonName>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this PersonName to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a PersonName from a ByteBuffer. */
  public static PersonName fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence firstName;
  @Deprecated public java.lang.CharSequence lastName;
  @Deprecated public com.uhc.schema.model.eligibility.common.LastUpdated lastUpdated;
  @Deprecated public java.lang.CharSequence middleInitial;
  @Deprecated public java.lang.CharSequence middleName;
  @Deprecated public com.uhc.schema.model.eligibility.common.DescriptionType nameType;
  /** The preferred first name for an individual. */
  @Deprecated public java.lang.CharSequence preferredFirstName;
  @Deprecated public java.lang.CharSequence prefix;
  @Deprecated public java.lang.CharSequence sourceCode;
  @Deprecated public java.lang.CharSequence suffix;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public PersonName() {}

  /**
   * All-args constructor.
   * @param firstName The new value for firstName
   * @param lastName The new value for lastName
   * @param lastUpdated The new value for lastUpdated
   * @param middleInitial The new value for middleInitial
   * @param middleName The new value for middleName
   * @param nameType The new value for nameType
   * @param preferredFirstName The preferred first name for an individual.
   * @param prefix The new value for prefix
   * @param sourceCode The new value for sourceCode
   * @param suffix The new value for suffix
   */
  public PersonName(java.lang.CharSequence firstName, java.lang.CharSequence lastName, com.uhc.schema.model.eligibility.common.LastUpdated lastUpdated, java.lang.CharSequence middleInitial, java.lang.CharSequence middleName, com.uhc.schema.model.eligibility.common.DescriptionType nameType, java.lang.CharSequence preferredFirstName, java.lang.CharSequence prefix, java.lang.CharSequence sourceCode, java.lang.CharSequence suffix) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.lastUpdated = lastUpdated;
    this.middleInitial = middleInitial;
    this.middleName = middleName;
    this.nameType = nameType;
    this.preferredFirstName = preferredFirstName;
    this.prefix = prefix;
    this.sourceCode = sourceCode;
    this.suffix = suffix;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return firstName;
    case 1: return lastName;
    case 2: return lastUpdated;
    case 3: return middleInitial;
    case 4: return middleName;
    case 5: return nameType;
    case 6: return preferredFirstName;
    case 7: return prefix;
    case 8: return sourceCode;
    case 9: return suffix;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: firstName = (java.lang.CharSequence)value$; break;
    case 1: lastName = (java.lang.CharSequence)value$; break;
    case 2: lastUpdated = (com.uhc.schema.model.eligibility.common.LastUpdated)value$; break;
    case 3: middleInitial = (java.lang.CharSequence)value$; break;
    case 4: middleName = (java.lang.CharSequence)value$; break;
    case 5: nameType = (com.uhc.schema.model.eligibility.common.DescriptionType)value$; break;
    case 6: preferredFirstName = (java.lang.CharSequence)value$; break;
    case 7: prefix = (java.lang.CharSequence)value$; break;
    case 8: sourceCode = (java.lang.CharSequence)value$; break;
    case 9: suffix = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'firstName' field.
   * @return The value of the 'firstName' field.
   */
  public java.lang.CharSequence getFirstName() {
    return firstName;
  }

  /**
   * Sets the value of the 'firstName' field.
   * @param value the value to set.
   */
  public void setFirstName(java.lang.CharSequence value) {
    this.firstName = value;
  }

  /**
   * Gets the value of the 'lastName' field.
   * @return The value of the 'lastName' field.
   */
  public java.lang.CharSequence getLastName() {
    return lastName;
  }

  /**
   * Sets the value of the 'lastName' field.
   * @param value the value to set.
   */
  public void setLastName(java.lang.CharSequence value) {
    this.lastName = value;
  }

  /**
   * Gets the value of the 'lastUpdated' field.
   * @return The value of the 'lastUpdated' field.
   */
  public com.uhc.schema.model.eligibility.common.LastUpdated getLastUpdated() {
    return lastUpdated;
  }

  /**
   * Sets the value of the 'lastUpdated' field.
   * @param value the value to set.
   */
  public void setLastUpdated(com.uhc.schema.model.eligibility.common.LastUpdated value) {
    this.lastUpdated = value;
  }

  /**
   * Gets the value of the 'middleInitial' field.
   * @return The value of the 'middleInitial' field.
   */
  public java.lang.CharSequence getMiddleInitial() {
    return middleInitial;
  }

  /**
   * Sets the value of the 'middleInitial' field.
   * @param value the value to set.
   */
  public void setMiddleInitial(java.lang.CharSequence value) {
    this.middleInitial = value;
  }

  /**
   * Gets the value of the 'middleName' field.
   * @return The value of the 'middleName' field.
   */
  public java.lang.CharSequence getMiddleName() {
    return middleName;
  }

  /**
   * Sets the value of the 'middleName' field.
   * @param value the value to set.
   */
  public void setMiddleName(java.lang.CharSequence value) {
    this.middleName = value;
  }

  /**
   * Gets the value of the 'nameType' field.
   * @return The value of the 'nameType' field.
   */
  public com.uhc.schema.model.eligibility.common.DescriptionType getNameType() {
    return nameType;
  }

  /**
   * Sets the value of the 'nameType' field.
   * @param value the value to set.
   */
  public void setNameType(com.uhc.schema.model.eligibility.common.DescriptionType value) {
    this.nameType = value;
  }

  /**
   * Gets the value of the 'preferredFirstName' field.
   * @return The preferred first name for an individual.
   */
  public java.lang.CharSequence getPreferredFirstName() {
    return preferredFirstName;
  }

  /**
   * Sets the value of the 'preferredFirstName' field.
   * The preferred first name for an individual.
   * @param value the value to set.
   */
  public void setPreferredFirstName(java.lang.CharSequence value) {
    this.preferredFirstName = value;
  }

  /**
   * Gets the value of the 'prefix' field.
   * @return The value of the 'prefix' field.
   */
  public java.lang.CharSequence getPrefix() {
    return prefix;
  }

  /**
   * Sets the value of the 'prefix' field.
   * @param value the value to set.
   */
  public void setPrefix(java.lang.CharSequence value) {
    this.prefix = value;
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
   * Gets the value of the 'suffix' field.
   * @return The value of the 'suffix' field.
   */
  public java.lang.CharSequence getSuffix() {
    return suffix;
  }

  /**
   * Sets the value of the 'suffix' field.
   * @param value the value to set.
   */
  public void setSuffix(java.lang.CharSequence value) {
    this.suffix = value;
  }

  /**
   * Creates a new PersonName RecordBuilder.
   * @return A new PersonName RecordBuilder
   */
  public static com.uhc.schema.model.eligibility.individual.PersonName.Builder newBuilder() {
    return new com.uhc.schema.model.eligibility.individual.PersonName.Builder();
  }

  /**
   * Creates a new PersonName RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new PersonName RecordBuilder
   */
  public static com.uhc.schema.model.eligibility.individual.PersonName.Builder newBuilder(com.uhc.schema.model.eligibility.individual.PersonName.Builder other) {
    return new com.uhc.schema.model.eligibility.individual.PersonName.Builder(other);
  }

  /**
   * Creates a new PersonName RecordBuilder by copying an existing PersonName instance.
   * @param other The existing instance to copy.
   * @return A new PersonName RecordBuilder
   */
  public static com.uhc.schema.model.eligibility.individual.PersonName.Builder newBuilder(com.uhc.schema.model.eligibility.individual.PersonName other) {
    return new com.uhc.schema.model.eligibility.individual.PersonName.Builder(other);
  }

  /**
   * RecordBuilder for PersonName instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<PersonName>
    implements org.apache.avro.data.RecordBuilder<PersonName> {

    private java.lang.CharSequence firstName;
    private java.lang.CharSequence lastName;
    private com.uhc.schema.model.eligibility.common.LastUpdated lastUpdated;
    private com.uhc.schema.model.eligibility.common.LastUpdated.Builder lastUpdatedBuilder;
    private java.lang.CharSequence middleInitial;
    private java.lang.CharSequence middleName;
    private com.uhc.schema.model.eligibility.common.DescriptionType nameType;
    private com.uhc.schema.model.eligibility.common.DescriptionType.Builder nameTypeBuilder;
    /** The preferred first name for an individual. */
    private java.lang.CharSequence preferredFirstName;
    private java.lang.CharSequence prefix;
    private java.lang.CharSequence sourceCode;
    private java.lang.CharSequence suffix;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.uhc.schema.model.eligibility.individual.PersonName.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.firstName)) {
        this.firstName = data().deepCopy(fields()[0].schema(), other.firstName);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.lastName)) {
        this.lastName = data().deepCopy(fields()[1].schema(), other.lastName);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.lastUpdated)) {
        this.lastUpdated = data().deepCopy(fields()[2].schema(), other.lastUpdated);
        fieldSetFlags()[2] = true;
      }
      if (other.hasLastUpdatedBuilder()) {
        this.lastUpdatedBuilder = com.uhc.schema.model.eligibility.common.LastUpdated.newBuilder(other.getLastUpdatedBuilder());
      }
      if (isValidValue(fields()[3], other.middleInitial)) {
        this.middleInitial = data().deepCopy(fields()[3].schema(), other.middleInitial);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.middleName)) {
        this.middleName = data().deepCopy(fields()[4].schema(), other.middleName);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.nameType)) {
        this.nameType = data().deepCopy(fields()[5].schema(), other.nameType);
        fieldSetFlags()[5] = true;
      }
      if (other.hasNameTypeBuilder()) {
        this.nameTypeBuilder = com.uhc.schema.model.eligibility.common.DescriptionType.newBuilder(other.getNameTypeBuilder());
      }
      if (isValidValue(fields()[6], other.preferredFirstName)) {
        this.preferredFirstName = data().deepCopy(fields()[6].schema(), other.preferredFirstName);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.prefix)) {
        this.prefix = data().deepCopy(fields()[7].schema(), other.prefix);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.sourceCode)) {
        this.sourceCode = data().deepCopy(fields()[8].schema(), other.sourceCode);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.suffix)) {
        this.suffix = data().deepCopy(fields()[9].schema(), other.suffix);
        fieldSetFlags()[9] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing PersonName instance
     * @param other The existing instance to copy.
     */
    private Builder(com.uhc.schema.model.eligibility.individual.PersonName other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.firstName)) {
        this.firstName = data().deepCopy(fields()[0].schema(), other.firstName);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.lastName)) {
        this.lastName = data().deepCopy(fields()[1].schema(), other.lastName);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.lastUpdated)) {
        this.lastUpdated = data().deepCopy(fields()[2].schema(), other.lastUpdated);
        fieldSetFlags()[2] = true;
      }
      this.lastUpdatedBuilder = null;
      if (isValidValue(fields()[3], other.middleInitial)) {
        this.middleInitial = data().deepCopy(fields()[3].schema(), other.middleInitial);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.middleName)) {
        this.middleName = data().deepCopy(fields()[4].schema(), other.middleName);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.nameType)) {
        this.nameType = data().deepCopy(fields()[5].schema(), other.nameType);
        fieldSetFlags()[5] = true;
      }
      this.nameTypeBuilder = null;
      if (isValidValue(fields()[6], other.preferredFirstName)) {
        this.preferredFirstName = data().deepCopy(fields()[6].schema(), other.preferredFirstName);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.prefix)) {
        this.prefix = data().deepCopy(fields()[7].schema(), other.prefix);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.sourceCode)) {
        this.sourceCode = data().deepCopy(fields()[8].schema(), other.sourceCode);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.suffix)) {
        this.suffix = data().deepCopy(fields()[9].schema(), other.suffix);
        fieldSetFlags()[9] = true;
      }
    }

    /**
      * Gets the value of the 'firstName' field.
      * @return The value.
      */
    public java.lang.CharSequence getFirstName() {
      return firstName;
    }

    /**
      * Sets the value of the 'firstName' field.
      * @param value The value of 'firstName'.
      * @return This builder.
      */
    public com.uhc.schema.model.eligibility.individual.PersonName.Builder setFirstName(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.firstName = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'firstName' field has been set.
      * @return True if the 'firstName' field has been set, false otherwise.
      */
    public boolean hasFirstName() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'firstName' field.
      * @return This builder.
      */
    public com.uhc.schema.model.eligibility.individual.PersonName.Builder clearFirstName() {
      firstName = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'lastName' field.
      * @return The value.
      */
    public java.lang.CharSequence getLastName() {
      return lastName;
    }

    /**
      * Sets the value of the 'lastName' field.
      * @param value The value of 'lastName'.
      * @return This builder.
      */
    public com.uhc.schema.model.eligibility.individual.PersonName.Builder setLastName(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.lastName = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'lastName' field has been set.
      * @return True if the 'lastName' field has been set, false otherwise.
      */
    public boolean hasLastName() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'lastName' field.
      * @return This builder.
      */
    public com.uhc.schema.model.eligibility.individual.PersonName.Builder clearLastName() {
      lastName = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'lastUpdated' field.
      * @return The value.
      */
    public com.uhc.schema.model.eligibility.common.LastUpdated getLastUpdated() {
      return lastUpdated;
    }

    /**
      * Sets the value of the 'lastUpdated' field.
      * @param value The value of 'lastUpdated'.
      * @return This builder.
      */
    public com.uhc.schema.model.eligibility.individual.PersonName.Builder setLastUpdated(com.uhc.schema.model.eligibility.common.LastUpdated value) {
      validate(fields()[2], value);
      this.lastUpdatedBuilder = null;
      this.lastUpdated = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'lastUpdated' field has been set.
      * @return True if the 'lastUpdated' field has been set, false otherwise.
      */
    public boolean hasLastUpdated() {
      return fieldSetFlags()[2];
    }

    /**
     * Gets the Builder instance for the 'lastUpdated' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.uhc.schema.model.eligibility.common.LastUpdated.Builder getLastUpdatedBuilder() {
      if (lastUpdatedBuilder == null) {
        if (hasLastUpdated()) {
          setLastUpdatedBuilder(com.uhc.schema.model.eligibility.common.LastUpdated.newBuilder(lastUpdated));
        } else {
          setLastUpdatedBuilder(com.uhc.schema.model.eligibility.common.LastUpdated.newBuilder());
        }
      }
      return lastUpdatedBuilder;
    }

    /**
     * Sets the Builder instance for the 'lastUpdated' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public com.uhc.schema.model.eligibility.individual.PersonName.Builder setLastUpdatedBuilder(com.uhc.schema.model.eligibility.common.LastUpdated.Builder value) {
      clearLastUpdated();
      lastUpdatedBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'lastUpdated' field has an active Builder instance
     * @return True if the 'lastUpdated' field has an active Builder instance
     */
    public boolean hasLastUpdatedBuilder() {
      return lastUpdatedBuilder != null;
    }

    /**
      * Clears the value of the 'lastUpdated' field.
      * @return This builder.
      */
    public com.uhc.schema.model.eligibility.individual.PersonName.Builder clearLastUpdated() {
      lastUpdated = null;
      lastUpdatedBuilder = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'middleInitial' field.
      * @return The value.
      */
    public java.lang.CharSequence getMiddleInitial() {
      return middleInitial;
    }

    /**
      * Sets the value of the 'middleInitial' field.
      * @param value The value of 'middleInitial'.
      * @return This builder.
      */
    public com.uhc.schema.model.eligibility.individual.PersonName.Builder setMiddleInitial(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.middleInitial = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'middleInitial' field has been set.
      * @return True if the 'middleInitial' field has been set, false otherwise.
      */
    public boolean hasMiddleInitial() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'middleInitial' field.
      * @return This builder.
      */
    public com.uhc.schema.model.eligibility.individual.PersonName.Builder clearMiddleInitial() {
      middleInitial = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'middleName' field.
      * @return The value.
      */
    public java.lang.CharSequence getMiddleName() {
      return middleName;
    }

    /**
      * Sets the value of the 'middleName' field.
      * @param value The value of 'middleName'.
      * @return This builder.
      */
    public com.uhc.schema.model.eligibility.individual.PersonName.Builder setMiddleName(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.middleName = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'middleName' field has been set.
      * @return True if the 'middleName' field has been set, false otherwise.
      */
    public boolean hasMiddleName() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'middleName' field.
      * @return This builder.
      */
    public com.uhc.schema.model.eligibility.individual.PersonName.Builder clearMiddleName() {
      middleName = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'nameType' field.
      * @return The value.
      */
    public com.uhc.schema.model.eligibility.common.DescriptionType getNameType() {
      return nameType;
    }

    /**
      * Sets the value of the 'nameType' field.
      * @param value The value of 'nameType'.
      * @return This builder.
      */
    public com.uhc.schema.model.eligibility.individual.PersonName.Builder setNameType(com.uhc.schema.model.eligibility.common.DescriptionType value) {
      validate(fields()[5], value);
      this.nameTypeBuilder = null;
      this.nameType = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'nameType' field has been set.
      * @return True if the 'nameType' field has been set, false otherwise.
      */
    public boolean hasNameType() {
      return fieldSetFlags()[5];
    }

    /**
     * Gets the Builder instance for the 'nameType' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.uhc.schema.model.eligibility.common.DescriptionType.Builder getNameTypeBuilder() {
      if (nameTypeBuilder == null) {
        if (hasNameType()) {
          setNameTypeBuilder(com.uhc.schema.model.eligibility.common.DescriptionType.newBuilder(nameType));
        } else {
          setNameTypeBuilder(com.uhc.schema.model.eligibility.common.DescriptionType.newBuilder());
        }
      }
      return nameTypeBuilder;
    }

    /**
     * Sets the Builder instance for the 'nameType' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public com.uhc.schema.model.eligibility.individual.PersonName.Builder setNameTypeBuilder(com.uhc.schema.model.eligibility.common.DescriptionType.Builder value) {
      clearNameType();
      nameTypeBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'nameType' field has an active Builder instance
     * @return True if the 'nameType' field has an active Builder instance
     */
    public boolean hasNameTypeBuilder() {
      return nameTypeBuilder != null;
    }

    /**
      * Clears the value of the 'nameType' field.
      * @return This builder.
      */
    public com.uhc.schema.model.eligibility.individual.PersonName.Builder clearNameType() {
      nameType = null;
      nameTypeBuilder = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'preferredFirstName' field.
      * The preferred first name for an individual.
      * @return The value.
      */
    public java.lang.CharSequence getPreferredFirstName() {
      return preferredFirstName;
    }

    /**
      * Sets the value of the 'preferredFirstName' field.
      * The preferred first name for an individual.
      * @param value The value of 'preferredFirstName'.
      * @return This builder.
      */
    public com.uhc.schema.model.eligibility.individual.PersonName.Builder setPreferredFirstName(java.lang.CharSequence value) {
      validate(fields()[6], value);
      this.preferredFirstName = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'preferredFirstName' field has been set.
      * The preferred first name for an individual.
      * @return True if the 'preferredFirstName' field has been set, false otherwise.
      */
    public boolean hasPreferredFirstName() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'preferredFirstName' field.
      * The preferred first name for an individual.
      * @return This builder.
      */
    public com.uhc.schema.model.eligibility.individual.PersonName.Builder clearPreferredFirstName() {
      preferredFirstName = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'prefix' field.
      * @return The value.
      */
    public java.lang.CharSequence getPrefix() {
      return prefix;
    }

    /**
      * Sets the value of the 'prefix' field.
      * @param value The value of 'prefix'.
      * @return This builder.
      */
    public com.uhc.schema.model.eligibility.individual.PersonName.Builder setPrefix(java.lang.CharSequence value) {
      validate(fields()[7], value);
      this.prefix = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'prefix' field has been set.
      * @return True if the 'prefix' field has been set, false otherwise.
      */
    public boolean hasPrefix() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'prefix' field.
      * @return This builder.
      */
    public com.uhc.schema.model.eligibility.individual.PersonName.Builder clearPrefix() {
      prefix = null;
      fieldSetFlags()[7] = false;
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
    public com.uhc.schema.model.eligibility.individual.PersonName.Builder setSourceCode(java.lang.CharSequence value) {
      validate(fields()[8], value);
      this.sourceCode = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /**
      * Checks whether the 'sourceCode' field has been set.
      * @return True if the 'sourceCode' field has been set, false otherwise.
      */
    public boolean hasSourceCode() {
      return fieldSetFlags()[8];
    }


    /**
      * Clears the value of the 'sourceCode' field.
      * @return This builder.
      */
    public com.uhc.schema.model.eligibility.individual.PersonName.Builder clearSourceCode() {
      sourceCode = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    /**
      * Gets the value of the 'suffix' field.
      * @return The value.
      */
    public java.lang.CharSequence getSuffix() {
      return suffix;
    }

    /**
      * Sets the value of the 'suffix' field.
      * @param value The value of 'suffix'.
      * @return This builder.
      */
    public com.uhc.schema.model.eligibility.individual.PersonName.Builder setSuffix(java.lang.CharSequence value) {
      validate(fields()[9], value);
      this.suffix = value;
      fieldSetFlags()[9] = true;
      return this;
    }

    /**
      * Checks whether the 'suffix' field has been set.
      * @return True if the 'suffix' field has been set, false otherwise.
      */
    public boolean hasSuffix() {
      return fieldSetFlags()[9];
    }


    /**
      * Clears the value of the 'suffix' field.
      * @return This builder.
      */
    public com.uhc.schema.model.eligibility.individual.PersonName.Builder clearSuffix() {
      suffix = null;
      fieldSetFlags()[9] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public PersonName build() {
      try {
        PersonName record = new PersonName();
        record.firstName = fieldSetFlags()[0] ? this.firstName : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.lastName = fieldSetFlags()[1] ? this.lastName : (java.lang.CharSequence) defaultValue(fields()[1]);
        if (lastUpdatedBuilder != null) {
          record.lastUpdated = this.lastUpdatedBuilder.build();
        } else {
          record.lastUpdated = fieldSetFlags()[2] ? this.lastUpdated : (com.uhc.schema.model.eligibility.common.LastUpdated) defaultValue(fields()[2]);
        }
        record.middleInitial = fieldSetFlags()[3] ? this.middleInitial : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.middleName = fieldSetFlags()[4] ? this.middleName : (java.lang.CharSequence) defaultValue(fields()[4]);
        if (nameTypeBuilder != null) {
          record.nameType = this.nameTypeBuilder.build();
        } else {
          record.nameType = fieldSetFlags()[5] ? this.nameType : (com.uhc.schema.model.eligibility.common.DescriptionType) defaultValue(fields()[5]);
        }
        record.preferredFirstName = fieldSetFlags()[6] ? this.preferredFirstName : (java.lang.CharSequence) defaultValue(fields()[6]);
        record.prefix = fieldSetFlags()[7] ? this.prefix : (java.lang.CharSequence) defaultValue(fields()[7]);
        record.sourceCode = fieldSetFlags()[8] ? this.sourceCode : (java.lang.CharSequence) defaultValue(fields()[8]);
        record.suffix = fieldSetFlags()[9] ? this.suffix : (java.lang.CharSequence) defaultValue(fields()[9]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<PersonName>
    WRITER$ = (org.apache.avro.io.DatumWriter<PersonName>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<PersonName>
    READER$ = (org.apache.avro.io.DatumReader<PersonName>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}