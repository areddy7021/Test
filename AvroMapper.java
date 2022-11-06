package com.uhc.utils;

import java.nio.ByteBuffer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.joda.time.LocalDate;

import com.uhc.model.Preferences;
import com.uhc.model.Security;
import com.uhc.schema.model.eligibility.Eligibility;
import com.uhc.schema.model.eligibility.Membership;
import com.uhc.schema.model.eligibility.Product;
import com.uhc.schema.model.eligibility.SourceIndividual;
import com.uhc.schema.model.eligibility.common.DescriptionType;
import com.uhc.schema.model.eligibility.common.LastUpdated;
import com.uhc.schema.model.eligibility.individual.AlternateIdentifierValue;
import com.uhc.schema.model.eligibility.individual.AlternateIdentifiers;
import com.uhc.schema.model.eligibility.individual.DemographicInfo;
import com.uhc.schema.model.eligibility.individual.ElectronicAddress;
import com.uhc.schema.model.eligibility.individual.IndividualLegacyAttributes;
import com.uhc.schema.model.eligibility.individual.LabInfo;
import com.uhc.schema.model.eligibility.individual.PersonName;
import com.uhc.schema.model.eligibility.individual.PostalAddress;
import com.uhc.schema.model.eligibility.individual.TelephoneNumber;
import com.uhc.schema.model.preferences.IndividualPreferenceSelection;
import com.uhc.schema.model.preferences.audit;
import com.uhc.schema.model.preferences.operational;
import com.uhc.schema.model.preferences.preferenceSelection;
import com.uhc.schema.model.preferences.security;
import com.uhc.schema.model.preferences.securityPermission;
import com.uhc.schema.model.security.ConsumerRolePermission;

import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.util.Arrays;

public class AvroMapper {

	/**
	 * Map Preferences
	 * 
	 * @param preferences
	 * @return
	 * @throws ParseException
	 */
	public static IndividualPreferenceSelection getPreferencesMapping(Preferences preferences) throws ParseException {
		IndividualPreferenceSelection selection = new IndividualPreferenceSelection();
		SimpleDateFormat string_date = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date cd = string_date.parse(preferences.getCreatDt());
		long createdDtTime = cd.getTime();
		Date d = string_date.parse(preferences.getLastModDt());
		long modDt = d.getTime();
		Date srcCreatedDt = string_date.parse(preferences.getSrcCreatDt());
		long srcCreatedDtTime = srcCreatedDt.getTime();
		Date srcLastModDt = string_date.parse(preferences.getGetSrcLstModDt());
		long srcLastModDtTime = srcLastModDt.getTime();
		final DateTimeFormatter dtf = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss");
		final LocalDate effDt = dtf.parseLocalDate(preferences.getSelectEffDt());
//        Date srcEffectiveDate = string_date.parse(preferences.getSelectEffDt());
//        long srcEffectiveDt = srcEffectiveDate.getTime();
		audit audit1 = audit.newBuilder().setCreateUserIdentifier(preferences.getCreatBy())
				.setCreateDatetime(createdDtTime).setUpdateUserIdentifier(preferences.getLastModBy())
				.setUpdateDatetime(modDt).setSourceSystemCreateUserIdentifier(preferences.getSrcCreatBy())
				.setSourceSystemCreateDatetime(srcCreatedDtTime)
				.setSourceSystemUpdateUserIdentifier(preferences.getSrcLstModBy())
				.setSourceSystemUpdateDatetime(srcLastModDtTime).setRecordStatusCode(preferences.getRecStatus())
				.build();

		preferenceSelection preferenceSelection1 = preferenceSelection.newBuilder()
				.setPreferenceCategoryCode(preferences.getCatCd()).setPreferenceTopicCode(preferences.getTopicCd())
				.setPreferencePropertyCode(preferences.getPropCd()).setPreferenceSelectionEffectiveDate(null)
				.setPreferencePropertyOptionCode(preferences.getPrefCd()).setPreferenceTopicDescription("")
				.setPreferencePropertyDescription("").setPreferencePropertyOptionDescription("")
				.setPreferencePropertyOptionValue("").setLastUpdateDateTime(srcLastModDtTime)
				.setLastUpdateUser(preferences.getSrcLstModBy()).setPreferenceCategoryDescription("")
				.setIsDefaultSelection("").setPreferenceSelectionTerminationDate(null).build();

		operational operational1 = operational.newBuilder().setDocumentIdentifier("").setDocumentCreateDatetime(null)
				.setDocumentOriginatingSourceSystemCode(null).setDocumentUpdateDatetime(null).build();

		List<securityPermission> securityPermissionList = new ArrayList<securityPermission>();
		securityPermission securityPermission1 = securityPermission.newBuilder()
				.setSecurityPermissionValue(preferences.getPermission()).build();
		securityPermissionList.add(securityPermission1);

		security security1 = security.newBuilder().setSecurityPermission(null)
				.setSecuritySourceSystemCode(preferences.getSrcSys()).build();

		List<preferenceSelection> prefSelectionList = new ArrayList<preferenceSelection>();
		prefSelectionList.add(preferenceSelection1);

		selection.setIndividualIdentifier(preferences.getId());
		selection.setIndividualSourceSystemCode(preferences.getSrcSys() == null ? "COMPASS" : preferences.getSrcSys());
		selection.setAudit(audit1);
		selection.setPreferenceSelection(prefSelectionList);
		selection.setOperational(operational1);
		selection.setPreferenceSelection(prefSelectionList);
		selection.setSecurity(security1);

		return selection;
	}

	/**
	 * Map Security
	 * 
	 * @param security
	 * @return
	 */
	public static ConsumerRolePermission getSecurityMapping(Security security) {
		ConsumerRolePermission rolePermission = new ConsumerRolePermission();
		rolePermission.setConsumerName(security.getConsumerNm());
		rolePermission.setPermission(security.getPermission() != null ? security.getPermission() : "MRIS_READ");
		rolePermission.setRole(security.getSecurityRole());
		rolePermission.setSourceSystem(security.getSrcSys());
		return rolePermission;
	}

	/**
	 * Eligibility Mapping
	 * 
	 * @param eligibility
	 * @return
	 * @throws ParseException 
	 */
	public static Eligibility getEligibilityMapping(com.uhc.model.Eligibility eligibility) throws ParseException {
		Eligibility eligibilityAvro = new Eligibility();
		
		String indStr = "";
		if(eligibility.getIndividualId() != null) {
			byte[] indBytes = ByteBuffer.allocate(8).putLong(eligibility.getIndividualId().longValue()).array();
			indStr = new String(indBytes);
		}
		
		SimpleDateFormat lastUpdatedDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date lastUpdatedDate = lastUpdatedDateFormat.parse(eligibility.getSrcLastModifiedDate());
		
		LastUpdated lastUpdated = LastUpdated.newBuilder()
				.setSourceSystemTimestamp(lastUpdatedDateFormat.format(lastUpdatedDate))
				.setSourceTimestamp(eligibility.getLastModifiedDate())
				.setUserId(eligibility.getLastModifiedBy())
				.build();
		
		// Get these values from EligibilitySecurity
		com.uhc.schema.model.eligibility.common.Security membershipSecurity = com.uhc.schema.model.eligibility.common.Security.newBuilder()
				//.setSecurityPermission(Arrays.asList(eligibility.getP))
				//.setSecuritySourceSystemCode(eligibility.getsr)
				.build();
		
		Membership membership = Membership.newBuilder()
				.setActive(true)
				.setBookOfBusiness(DescriptionType.newBuilder().setDescription(eligibility.getBookOfBusiness()).build())
				.setBusinessSegment(eligibility.getBusiness() != null ? eligibility.getBusiness() : "M&R")
				//setCustomerAccountIdentifier -- """36000"" for all plans but PHIP (NONPHIP).  PHIP Plans get ""0704088"""
				.setCustomerAccountIdentifier(eligibility.getCustAccountId())
				.setEffectiveDate(eligibility.getInsPlanEffDate())
				.setEmployerIdentifier(eligibility.getEmpId()+"")
				.setEnrolleeMemberFacingIdentifier(eligibility.getEnrollMbrFaceId())
				.setLastUpdated(lastUpdated)
				.setProduct(Product.newBuilder().setProductCode(eligibility.getProdCd() != null ? eligibility.getProdCd() : "Medical").build())
				.setSite(eligibility.getSpbState())
				.setSitusState(eligibility.getSpbState())
				.setSubscriberMemberFacingIdentifier(eligibility.getMbrNbr()+"")
				.setTerminationDate(eligibility.getInsPlanTermDate())
				.setSecurity(membershipSecurity)
				.setIndividualIdentifier(indStr)
				.setProductCode(eligibility.getProdCd())
				//.setSitusState(eligibility.getSitusStatus())
				.build();
		
		AlternateIdentifiers alternativeIdentifiers = AlternateIdentifiers.newBuilder()
				.setAlternateIds(Arrays.asList(AlternateIdentifierValue.newBuilder().setActive(true).build()))
				.setFamilyId(eligibility.getHouseholdId().intValue())
				.setMbiNumbers(Arrays.asList(AlternateIdentifierValue.newBuilder().setIdentifier(eligibility.getMcareClainNbr()).setActive(true).build()))
				.build();
		
		DemographicInfo demographicInfo = DemographicInfo.newBuilder()
				.setBirthDate(eligibility.getDob())
				.setGenderType(DescriptionType.newBuilder().setCode(eligibility.getGenderCd()).build())
				.setLastUpdated(LastUpdated.newBuilder().setSourceTimestamp(eligibility.getLastModifiedDate()).build())
				.build();
		
		ElectronicAddress electronicAddress = ElectronicAddress.newBuilder()
				.setActive(true)
				.setElectronicAddress(eligibility.getEmailAddress())
				.setLastUpdated(LastUpdated.newBuilder().setSourceTimestamp(eligibility.getLastModifiedDate()).build())
				.setSourceCode(eligibility.getSrcSysCd() != null ? eligibility.getSrcSysCd() : "COMPAS")
				.build();
		
		LabInfo labInfo = LabInfo.newBuilder()
				.setActive(true)
				.build();
		String mbrStr = "";
		if(eligibility.getMbrNbr() != null) {
			byte[] mbrBytes = ByteBuffer.allocate(8).putLong(eligibility.getMbrNbr().longValue()).array();
			mbrStr = new String(mbrBytes);
		}
		IndividualLegacyAttributes individualLegacyAttributes = IndividualLegacyAttributes.newBuilder()
				.setSubscriberId(mbrStr)
				.build();
		
		PersonName personName = PersonName.newBuilder()
				.setFirstName(eligibility.getFirstName())
				.setMiddleName(eligibility.getMidName())
				.setLastName(eligibility.getLastName())
				.setLastUpdated(LastUpdated.newBuilder().setSourceTimestamp(eligibility.getLastModifiedDate()).build())
				.setSourceCode(eligibility.getSrcSysCd() != null ? eligibility.getSrcSysCd() : "COMPAS")
				.build();
		
		// Get from STG_ELIGIBILITY_ADDR
		PostalAddress postalAddress = PostalAddress.newBuilder()
				.setActive(true)
				.setAddressType(DescriptionType.newBuilder().setDescription(null).build())
				.setBeginDate(null)
				.setCountrySubCode(null)
				.setEndDate(null)
				.setLine1Text(null)
				.setLine2Text(null)
				.setLine3Text(null)
				.setPostalCode(null)
				.setStateProvinceCode(null)
				.setTownName(null)
				.setSourceCode(eligibility.getSrcSysCd() != null ? eligibility.getSrcSysCd() : "COMPAS")
				.build();
		
		// Get these values from EligibilitySecurity
		com.uhc.schema.model.eligibility.common.Security sourceIndividualSecurity = com.uhc.schema.model.eligibility.common.Security.newBuilder()
				//.setSecurityPermission(Arrays.asList(eligibility.getP))
				//.setSecuritySourceSystemCode(eligibility.getsr)
				.build();
		TelephoneNumber dayPhone = new TelephoneNumber();
		TelephoneNumber eveningPhone = new TelephoneNumber();
		if(eligibility.getDayPhone() != null) {
			dayPhone = TelephoneNumber.newBuilder()
					.setAreaCode(eligibility.getDayPhone().subSequence(0, 2))
					.setTelephoneNumber(eligibility.getDayPhone().subSequence(2, 9))
					.build();
		}
		if(eligibility.getEveningPhone() != null) {
			eveningPhone = TelephoneNumber.newBuilder()
					.setAreaCode(eligibility.getEveningPhone().subSequence(0, 2))
					.setTelephoneNumber(eligibility.getEveningPhone().subSequence(2, 9))
					.build();
		}
		SourceIndividual sourceIndividual = SourceIndividual.newBuilder()
				.setAlternateIdentifiers(alternativeIdentifiers)
				.setDemographicInfo(demographicInfo)
				.setElectronicAddresses(Arrays.asList(electronicAddress))
				.setLabInfos(Arrays.asList(labInfo))
				.setLegacyAttributes(individualLegacyAttributes)
				.setPersonName(personName)
				.setPostalAddresses(Arrays.asList(postalAddress))
				.setSecurity(sourceIndividualSecurity)
				.setTelephoneNumbers(Arrays.asList(dayPhone, eveningPhone))
				.setActive(true)
				.setLastUpdated(LastUpdated.newBuilder().setSourceTimestamp(eligibility.getLastModifiedDate()).build())
				.build();
		
		// Get these values from EligibilitySecurity
		com.uhc.schema.model.eligibility.common.Security security = com.uhc.schema.model.eligibility.common.Security.newBuilder()
				//.setSecurityPermission(Arrays.asList(eligibility.))
				.setSecuritySourceSystemCode(eligibility.getSrcSysCd())
				.build();
		
		eligibilityAvro.setActive(true);
		eligibilityAvro.setIndividualIdentifier(indStr);
		eligibilityAvro.setLastUpdated(lastUpdated);
		eligibilityAvro.setMemberships(Arrays.asList(membership));
		eligibilityAvro.setSecurity(security);
		eligibilityAvro.setSourceSystemCode(eligibility.getSrcSysCd() != null ? eligibility.getSrcSysCd() : "COMPAS");
		eligibilityAvro.setSourceIndividual(sourceIndividual);
		 
		return eligibilityAvro;
	}
}