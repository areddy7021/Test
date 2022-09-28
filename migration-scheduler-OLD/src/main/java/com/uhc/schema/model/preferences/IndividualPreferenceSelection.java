/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.uhc.schema.model.preferences;

import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.SchemaStore;
import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
/** v2.00 -- Represents a domain model of individualPreferenceSelection */
@org.apache.avro.specific.AvroGenerated
public class IndividualPreferenceSelection extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -9193186317713656975L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"IndividualPreferenceSelection\",\"namespace\":\"com.optum.exts.individual.preference.selection.model\",\"doc\":\"v2.00 -- Represents a domain model of individualPreferenceSelection\",\"fields\":[{\"name\":\"individualIdentifier\",\"type\":[\"null\",\"string\"],\"doc\":\"The unique identifierto identify an individual person.\",\"default\":null},{\"name\":\"individualSourceSystemCode\",\"type\":[\"null\",\"string\"],\"doc\":\"Source system identifer.\",\"default\":null},{\"name\":\"audit\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"audit\",\"fields\":[{\"name\":\"createUserIdentifier\",\"type\":[\"null\",\"string\"],\"doc\":\"The Id of who or what performed the object creation. This can be a person or process.\",\"default\":null},{\"name\":\"createDatetime\",\"type\":[\"null\",{\"type\":\"long\",\"logicalType\":\"timestamp-micros\"}],\"doc\":\"Date and time when the object was created.\",\"default\":null},{\"name\":\"updateUserIdentifier\",\"type\":[\"null\",\"string\"],\"doc\":\"The Id of who or what performed the object update. This can be a person or process.\",\"default\":null},{\"name\":\"updateDatetime\",\"type\":[\"null\",{\"type\":\"long\",\"logicalType\":\"timestamp-micros\"}],\"doc\":\"Date and time when the object was updated.\",\"default\":null},{\"name\":\"sourceSystemCreateUserIdentifier\",\"type\":[\"null\",\"string\"],\"doc\":\"The Id of who or what performed the object creation on the source system. This can be a person or process.\",\"default\":null},{\"name\":\"sourceSystemCreateDatetime\",\"type\":[\"null\",{\"type\":\"long\",\"logicalType\":\"timestamp-micros\"}],\"doc\":\"The date and time the object was created on the source system.\",\"default\":null},{\"name\":\"sourceSystemUpdateUserIdentifier\",\"type\":[\"null\",\"string\"],\"doc\":\"The Id of who or what performed the object update on the source system. This can be a person or process.\",\"default\":null},{\"name\":\"sourceSystemUpdateDatetime\",\"type\":[\"null\",{\"type\":\"long\",\"logicalType\":\"timestamp-micros\"}],\"doc\":\"The date and time the object was updated on the source system.\",\"default\":null},{\"name\":\"recordStatusCode\",\"type\":[\"null\",\"string\"],\"doc\":\"A code indicating the status of the object. Examples: - Active - Inactive - SoftLogical Delete\",\"default\":null}]}],\"doc\":\"Audit metadata objects.\",\"default\":null},{\"name\":\"preferenceSelection\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"preferenceSelection\",\"fields\":[{\"name\":\"preferenceCategoryCode\",\"type\":[\"null\",\"string\"],\"doc\":\"(REF) The code for the category for the preference. Ex: Paperless, etc.\",\"default\":null},{\"name\":\"preferenceTopicCode\",\"type\":[\"null\",\"string\"],\"doc\":\"(REF) The code for the topic for the preference. Ex: Do Not Call, Tax Documents, Required Documents, etc.\",\"default\":null},{\"name\":\"preferencePropertyCode\",\"type\":[\"null\",\"string\"],\"doc\":\"(REF) The code for the property for the preference. Ex: Document Delivery Channel, Opt-In, etc.\",\"default\":null},{\"name\":\"preferenceSelectionEffectiveDate\",\"type\":[\"null\",{\"type\":\"int\",\"logicalType\":\"date\"}],\"doc\":\"Date preference selection becomes effective.\",\"default\":null},{\"name\":\"preferencePropertyOptionCode\",\"type\":[\"null\",\"string\"],\"doc\":\"(REF) The code for the property option for the preference. Ex: Email, Yes, etc.\",\"default\":null},{\"name\":\"preferenceTopicDescription\",\"type\":[\"null\",\"string\"],\"doc\":\"(REFDEF) The description for the preference topic code.\",\"default\":null},{\"name\":\"preferencePropertyDescription\",\"type\":[\"null\",\"string\"],\"doc\":\"(REFDEF) The description for the preference property code.\",\"default\":null},{\"name\":\"preferencePropertyOptionDescription\",\"type\":[\"null\",\"string\"],\"doc\":\"(REFDEF) The description for the preference property option code.\",\"default\":null},{\"name\":\"preferencePropertyOptionValue\",\"type\":[\"null\",\"string\"],\"doc\":\"A value for the property option.\",\"default\":null},{\"name\":\"lastUpdateDateTime\",\"type\":[\"null\",{\"type\":\"long\",\"logicalType\":\"timestamp-micros\"}],\"doc\":\"Date of last upate.\",\"default\":null},{\"name\":\"lastUpdateUser\",\"type\":[\"null\",\"string\"],\"doc\":\"User of last upate.\",\"default\":null},{\"name\":\"preferenceCategoryDescription\",\"type\":[\"null\",\"string\"],\"doc\":\"(REFDEF) The description for the category for the preference.\",\"default\":null},{\"name\":\"isDefaultSelection\",\"type\":[\"null\",\"string\"],\"doc\":\"Indicates if the selection is a system assigned default selection, as opposed to a user selected preference.\",\"default\":null},{\"name\":\"preferenceSelectionTerminationDate\",\"type\":[\"null\",{\"type\":\"int\",\"logicalType\":\"date\"}],\"doc\":\"Date preference selection is terminated.\",\"default\":null}]}}],\"doc\":\"\",\"default\":null},{\"name\":\"operational\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"operational\",\"fields\":[{\"name\":\"documentIdentifier\",\"type\":[\"null\",\"string\"],\"doc\":\"Internal system identifier that uniquely identifies the document instance.\",\"default\":null},{\"name\":\"documentCreateDatetime\",\"type\":[\"null\",{\"type\":\"long\",\"logicalType\":\"timestamp-micros\"}],\"doc\":\"The date and time that the document instance was created.\",\"default\":null},{\"name\":\"documentUpdateDatetime\",\"type\":[\"null\",{\"type\":\"long\",\"logicalType\":\"timestamp-micros\"}],\"doc\":\"The date and time that the document instance was updated.\",\"default\":null},{\"name\":\"documentOriginatingSourceSystemCode\",\"type\":[\"null\",\"string\"],\"doc\":\"The abbreviated source system designation that represents the originating system for the data found on the document instance.\",\"default\":null}]}],\"doc\":\"Operational metadata objects.\",\"default\":null},{\"name\":\"security\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"security\",\"fields\":[{\"name\":\"securitySourceSystemCode\",\"type\":[\"null\",\"string\"],\"doc\":\"A security profile identifier that is assigned to the member level information and all associated data.\",\"default\":null},{\"name\":\"securityPermission\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"securityPermission\",\"fields\":[{\"name\":\"securityPermissionValue\",\"type\":[\"null\",\"string\"],\"doc\":\"A security attribute identifying the secure class under which the record instance is administered.\",\"default\":null}]}}],\"doc\":\"Security metadata objects.\",\"default\":null}]}],\"doc\":\"Security metadata objects.\",\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<IndividualPreferenceSelection> ENCODER =
      new BinaryMessageEncoder<IndividualPreferenceSelection>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<IndividualPreferenceSelection> DECODER =
      new BinaryMessageDecoder<IndividualPreferenceSelection>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<IndividualPreferenceSelection> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<IndividualPreferenceSelection> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<IndividualPreferenceSelection>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this IndividualPreferenceSelection to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a IndividualPreferenceSelection from a ByteBuffer. */
  public static IndividualPreferenceSelection fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** The unique identifierto identify an individual person. */
  @Deprecated public CharSequence individualIdentifier;
  /** Source system identifer. */
  @Deprecated public CharSequence individualSourceSystemCode;
  /** Audit metadata objects. */
  @Deprecated public audit audit;
  /**  */
  @Deprecated public java.util.List<preferenceSelection> preferenceSelection;
  /** Operational metadata objects. */
  @Deprecated public operational operational;
  /** Security metadata objects. */
  @Deprecated public security security;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public IndividualPreferenceSelection() {}

  /**
   * All-args constructor.
   * @param individualIdentifier The unique identifierto identify an individual person.
   * @param individualSourceSystemCode Source system identifer.
   * @param audit Audit metadata objects.
   * @param preferenceSelection 
   * @param operational Operational metadata objects.
   * @param security Security metadata objects.
   */
  public IndividualPreferenceSelection(CharSequence individualIdentifier, CharSequence individualSourceSystemCode, audit audit, java.util.List<preferenceSelection> preferenceSelection, operational operational, security security) {
    this.individualIdentifier = individualIdentifier;
    this.individualSourceSystemCode = individualSourceSystemCode;
    this.audit = audit;
    this.preferenceSelection = preferenceSelection;
    this.operational = operational;
    this.security = security;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public Object get(int field$) {
    switch (field$) {
    case 0: return individualIdentifier;
    case 1: return individualSourceSystemCode;
    case 2: return audit;
    case 3: return preferenceSelection;
    case 4: return operational;
    case 5: return security;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, Object value$) {
    switch (field$) {
    case 0: individualIdentifier = (CharSequence)value$; break;
    case 1: individualSourceSystemCode = (CharSequence)value$; break;
    case 2: audit = (audit) value$; break;
    case 3: preferenceSelection = (java.util.List<preferenceSelection>)value$; break;
    case 4: operational = (operational)value$; break;
    case 5: security = (security)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'individualIdentifier' field.
   * @return The unique identifierto identify an individual person.
   */
  public CharSequence getIndividualIdentifier() {
    return individualIdentifier;
  }

  /**
   * Sets the value of the 'individualIdentifier' field.
   * The unique identifierto identify an individual person.
   * @param value the value to set.
   */
  public void setIndividualIdentifier(CharSequence value) {
    this.individualIdentifier = value;
  }

  /**
   * Gets the value of the 'individualSourceSystemCode' field.
   * @return Source system identifer.
   */
  public CharSequence getIndividualSourceSystemCode() {
    return individualSourceSystemCode;
  }

  /**
   * Sets the value of the 'individualSourceSystemCode' field.
   * Source system identifer.
   * @param value the value to set.
   */
  public void setIndividualSourceSystemCode(CharSequence value) {
    this.individualSourceSystemCode = value;
  }

  /**
   * Gets the value of the 'audit' field.
   * @return Audit metadata objects.
   */
  public audit getAudit() {
    return audit;
  }

  /**
   * Sets the value of the 'audit' field.
   * Audit metadata objects.
   * @param value the value to set.
   */
  public void setAudit(audit value) {
    this.audit = value;
  }

  /**
   * Gets the value of the 'preferenceSelection' field.
   * @return 
   */
  public java.util.List<preferenceSelection> getPreferenceSelection() {
    return preferenceSelection;
  }

  /**
   * Sets the value of the 'preferenceSelection' field.
   * 
   * @param value the value to set.
   */
  public void setPreferenceSelection(java.util.List<preferenceSelection> value) {
    this.preferenceSelection = value;
  }

  /**
   * Gets the value of the 'operational' field.
   * @return Operational metadata objects.
   */
  public operational getOperational() {
    return operational;
  }

  /**
   * Sets the value of the 'operational' field.
   * Operational metadata objects.
   * @param value the value to set.
   */
  public void setOperational(operational value) {
    this.operational = value;
  }

  /**
   * Gets the value of the 'security' field.
   * @return Security metadata objects.
   */
  public security getSecurity() {
    return security;
  }

  /**
   * Sets the value of the 'security' field.
   * Security metadata objects.
   * @param value the value to set.
   */
  public void setSecurity(security value) {
    this.security = value;
  }

  /**
   * Creates a new IndividualPreferenceSelection RecordBuilder.
   * @return A new IndividualPreferenceSelection RecordBuilder
   */
  public static Builder newBuilder() {
    return new Builder();
  }

  /**
   * Creates a new IndividualPreferenceSelection RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new IndividualPreferenceSelection RecordBuilder
   */
  public static Builder newBuilder(Builder other) {
    return new Builder(other);
  }

  /**
   * Creates a new IndividualPreferenceSelection RecordBuilder by copying an existing IndividualPreferenceSelection instance.
   * @param other The existing instance to copy.
   * @return A new IndividualPreferenceSelection RecordBuilder
   */
  public static Builder newBuilder(IndividualPreferenceSelection other) {
    return new Builder(other);
  }

  /**
   * RecordBuilder for IndividualPreferenceSelection instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<IndividualPreferenceSelection>
    implements org.apache.avro.data.RecordBuilder<IndividualPreferenceSelection> {

    /** The unique identifierto identify an individual person. */
    private CharSequence individualIdentifier;
    /** Source system identifer. */
    private CharSequence individualSourceSystemCode;
    /** Audit metadata objects. */
    private audit audit;
    private audit.Builder auditBuilder;
    /**  */
    private java.util.List<preferenceSelection> preferenceSelection;
    /** Operational metadata objects. */
    private operational operational;
    private operational.Builder operationalBuilder;
    /** Security metadata objects. */
    private security security;
    private security.Builder securityBuilder;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.individualIdentifier)) {
        this.individualIdentifier = data().deepCopy(fields()[0].schema(), other.individualIdentifier);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.individualSourceSystemCode)) {
        this.individualSourceSystemCode = data().deepCopy(fields()[1].schema(), other.individualSourceSystemCode);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.audit)) {
        this.audit = data().deepCopy(fields()[2].schema(), other.audit);
        fieldSetFlags()[2] = true;
      }
      if (other.hasAuditBuilder()) {
        this.auditBuilder = audit.newBuilder(other.getAuditBuilder());
      }
      if (isValidValue(fields()[3], other.preferenceSelection)) {
        this.preferenceSelection = data().deepCopy(fields()[3].schema(), other.preferenceSelection);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.operational)) {
        this.operational = data().deepCopy(fields()[4].schema(), other.operational);
        fieldSetFlags()[4] = true;
      }
      if (other.hasOperationalBuilder()) {
        this.operationalBuilder = operational.newBuilder(other.getOperationalBuilder());
      }
      if (isValidValue(fields()[5], other.security)) {
        this.security = data().deepCopy(fields()[5].schema(), other.security);
        fieldSetFlags()[5] = true;
      }
      if (other.hasSecurityBuilder()) {
        this.securityBuilder = security.newBuilder(other.getSecurityBuilder());
      }
    }

    /**
     * Creates a Builder by copying an existing IndividualPreferenceSelection instance
     * @param other The existing instance to copy.
     */
    private Builder(IndividualPreferenceSelection other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.individualIdentifier)) {
        this.individualIdentifier = data().deepCopy(fields()[0].schema(), other.individualIdentifier);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.individualSourceSystemCode)) {
        this.individualSourceSystemCode = data().deepCopy(fields()[1].schema(), other.individualSourceSystemCode);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.audit)) {
        this.audit = data().deepCopy(fields()[2].schema(), other.audit);
        fieldSetFlags()[2] = true;
      }
      this.auditBuilder = null;
      if (isValidValue(fields()[3], other.preferenceSelection)) {
        this.preferenceSelection = data().deepCopy(fields()[3].schema(), other.preferenceSelection);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.operational)) {
        this.operational = data().deepCopy(fields()[4].schema(), other.operational);
        fieldSetFlags()[4] = true;
      }
      this.operationalBuilder = null;
      if (isValidValue(fields()[5], other.security)) {
        this.security = data().deepCopy(fields()[5].schema(), other.security);
        fieldSetFlags()[5] = true;
      }
      this.securityBuilder = null;
    }

    /**
      * Gets the value of the 'individualIdentifier' field.
      * The unique identifierto identify an individual person.
      * @return The value.
      */
    public CharSequence getIndividualIdentifier() {
      return individualIdentifier;
    }

    /**
      * Sets the value of the 'individualIdentifier' field.
      * The unique identifierto identify an individual person.
      * @param value The value of 'individualIdentifier'.
      * @return This builder.
      */
    public Builder setIndividualIdentifier(CharSequence value) {
      validate(fields()[0], value);
      this.individualIdentifier = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'individualIdentifier' field has been set.
      * The unique identifierto identify an individual person.
      * @return True if the 'individualIdentifier' field has been set, false otherwise.
      */
    public boolean hasIndividualIdentifier() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'individualIdentifier' field.
      * The unique identifierto identify an individual person.
      * @return This builder.
      */
    public Builder clearIndividualIdentifier() {
      individualIdentifier = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'individualSourceSystemCode' field.
      * Source system identifer.
      * @return The value.
      */
    public CharSequence getIndividualSourceSystemCode() {
      return individualSourceSystemCode;
    }

    /**
      * Sets the value of the 'individualSourceSystemCode' field.
      * Source system identifer.
      * @param value The value of 'individualSourceSystemCode'.
      * @return This builder.
      */
    public Builder setIndividualSourceSystemCode(CharSequence value) {
      validate(fields()[1], value);
      this.individualSourceSystemCode = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'individualSourceSystemCode' field has been set.
      * Source system identifer.
      * @return True if the 'individualSourceSystemCode' field has been set, false otherwise.
      */
    public boolean hasIndividualSourceSystemCode() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'individualSourceSystemCode' field.
      * Source system identifer.
      * @return This builder.
      */
    public Builder clearIndividualSourceSystemCode() {
      individualSourceSystemCode = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'audit' field.
      * Audit metadata objects.
      * @return The value.
      */
    public audit getAudit() {
      return audit;
    }

    /**
      * Sets the value of the 'audit' field.
      * Audit metadata objects.
      * @param value The value of 'audit'.
      * @return This builder.
      */
    public Builder setAudit(audit value) {
      validate(fields()[2], value);
      this.auditBuilder = null;
      this.audit = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'audit' field has been set.
      * Audit metadata objects.
      * @return True if the 'audit' field has been set, false otherwise.
      */
    public boolean hasAudit() {
      return fieldSetFlags()[2];
    }

    /**
     * Gets the Builder instance for the 'audit' field and creates one if it doesn't exist yet.
     * Audit metadata objects.
     * @return This builder.
     */
    public audit.Builder getAuditBuilder() {
      if (auditBuilder == null) {
        if (hasAudit()) {
          setAuditBuilder(audit.newBuilder(audit));
        } else {
          setAuditBuilder(audit.newBuilder());
        }
      }
      return auditBuilder;
    }

    /**
     * Sets the Builder instance for the 'audit' field
     * Audit metadata objects.
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public Builder setAuditBuilder(audit.Builder value) {
      clearAudit();
      auditBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'audit' field has an active Builder instance
     * Audit metadata objects.
     * @return True if the 'audit' field has an active Builder instance
     */
    public boolean hasAuditBuilder() {
      return auditBuilder != null;
    }

    /**
      * Clears the value of the 'audit' field.
      * Audit metadata objects.
      * @return This builder.
      */
    public Builder clearAudit() {
      audit = null;
      auditBuilder = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'preferenceSelection' field.
      * 
      * @return The value.
      */
    public java.util.List<preferenceSelection> getPreferenceSelection() {
      return preferenceSelection;
    }

    /**
      * Sets the value of the 'preferenceSelection' field.
      * 
      * @param value The value of 'preferenceSelection'.
      * @return This builder.
      */
    public Builder setPreferenceSelection(java.util.List<preferenceSelection> value) {
      validate(fields()[3], value);
      this.preferenceSelection = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'preferenceSelection' field has been set.
      * 
      * @return True if the 'preferenceSelection' field has been set, false otherwise.
      */
    public boolean hasPreferenceSelection() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'preferenceSelection' field.
      * 
      * @return This builder.
      */
    public Builder clearPreferenceSelection() {
      preferenceSelection = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'operational' field.
      * Operational metadata objects.
      * @return The value.
      */
    public operational getOperational() {
      return operational;
    }

    /**
      * Sets the value of the 'operational' field.
      * Operational metadata objects.
      * @param value The value of 'operational'.
      * @return This builder.
      */
    public Builder setOperational(operational value) {
      validate(fields()[4], value);
      this.operationalBuilder = null;
      this.operational = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'operational' field has been set.
      * Operational metadata objects.
      * @return True if the 'operational' field has been set, false otherwise.
      */
    public boolean hasOperational() {
      return fieldSetFlags()[4];
    }

    /**
     * Gets the Builder instance for the 'operational' field and creates one if it doesn't exist yet.
     * Operational metadata objects.
     * @return This builder.
     */
    public operational.Builder getOperationalBuilder() {
      if (operationalBuilder == null) {
        if (hasOperational()) {
          setOperationalBuilder(operational.newBuilder(operational));
        } else {
          setOperationalBuilder(operational.newBuilder());
        }
      }
      return operationalBuilder;
    }

    /**
     * Sets the Builder instance for the 'operational' field
     * Operational metadata objects.
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public Builder setOperationalBuilder(operational.Builder value) {
      clearOperational();
      operationalBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'operational' field has an active Builder instance
     * Operational metadata objects.
     * @return True if the 'operational' field has an active Builder instance
     */
    public boolean hasOperationalBuilder() {
      return operationalBuilder != null;
    }

    /**
      * Clears the value of the 'operational' field.
      * Operational metadata objects.
      * @return This builder.
      */
    public Builder clearOperational() {
      operational = null;
      operationalBuilder = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'security' field.
      * Security metadata objects.
      * @return The value.
      */
    public security getSecurity() {
      return security;
    }

    /**
      * Sets the value of the 'security' field.
      * Security metadata objects.
      * @param value The value of 'security'.
      * @return This builder.
      */
    public Builder setSecurity(security value) {
      validate(fields()[5], value);
      this.securityBuilder = null;
      this.security = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'security' field has been set.
      * Security metadata objects.
      * @return True if the 'security' field has been set, false otherwise.
      */
    public boolean hasSecurity() {
      return fieldSetFlags()[5];
    }

    /**
     * Gets the Builder instance for the 'security' field and creates one if it doesn't exist yet.
     * Security metadata objects.
     * @return This builder.
     */
    public security.Builder getSecurityBuilder() {
      if (securityBuilder == null) {
        if (hasSecurity()) {
          setSecurityBuilder(security.newBuilder(security));
        } else {
          setSecurityBuilder(security.newBuilder());
        }
      }
      return securityBuilder;
    }

    /**
     * Sets the Builder instance for the 'security' field
     * Security metadata objects.
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public Builder setSecurityBuilder(security.Builder value) {
      clearSecurity();
      securityBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'security' field has an active Builder instance
     * Security metadata objects.
     * @return True if the 'security' field has an active Builder instance
     */
    public boolean hasSecurityBuilder() {
      return securityBuilder != null;
    }

    /**
      * Clears the value of the 'security' field.
      * Security metadata objects.
      * @return This builder.
      */
    public Builder clearSecurity() {
      security = null;
      securityBuilder = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public IndividualPreferenceSelection build() {
      try {
        IndividualPreferenceSelection record = new IndividualPreferenceSelection();
        record.individualIdentifier = fieldSetFlags()[0] ? this.individualIdentifier : (CharSequence) defaultValue(fields()[0]);
        record.individualSourceSystemCode = fieldSetFlags()[1] ? this.individualSourceSystemCode : (CharSequence) defaultValue(fields()[1]);
        if (auditBuilder != null) {
          record.audit = this.auditBuilder.build();
        } else {
          record.audit = fieldSetFlags()[2] ? this.audit : (audit) defaultValue(fields()[2]);
        }
        record.preferenceSelection = fieldSetFlags()[3] ? this.preferenceSelection : (java.util.List<preferenceSelection>) defaultValue(fields()[3]);
        if (operationalBuilder != null) {
          record.operational = this.operationalBuilder.build();
        } else {
          record.operational = fieldSetFlags()[4] ? this.operational : (operational) defaultValue(fields()[4]);
        }
        if (securityBuilder != null) {
          record.security = this.securityBuilder.build();
        } else {
          record.security = fieldSetFlags()[5] ? this.security : (security) defaultValue(fields()[5]);
        }
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<IndividualPreferenceSelection>
    WRITER$ = (org.apache.avro.io.DatumWriter<IndividualPreferenceSelection>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<IndividualPreferenceSelection>
    READER$ = (org.apache.avro.io.DatumReader<IndividualPreferenceSelection>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
