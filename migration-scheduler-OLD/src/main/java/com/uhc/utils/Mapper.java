package com.uhc.utils;

import java.util.ArrayList;
import java.util.List;

import org.joda.time.LocalDate;

import com.uhc.model.Preferences;
import com.uhc.schema.model.preferences.IndividualPreferenceSelection;
import com.uhc.schema.model.preferences.audit;
import com.uhc.schema.model.preferences.operational;
import com.uhc.schema.model.preferences.preferenceSelection;
import com.uhc.schema.model.preferences.security;
import com.uhc.schema.model.preferences.securityPermission;

import java.util.Arrays;

public class Mapper {

    public static IndividualPreferenceSelection getMapping(Preferences preferences){
        IndividualPreferenceSelection selection = new IndividualPreferenceSelection();
        
        audit audit1 = audit.newBuilder().setCreateUserIdentifier(preferences.getCreatBy())
				.setCreateDatetime(Long.getLong(preferences.getCreatDt()))
				.setUpdateUserIdentifier(preferences.getLastModBy())
				.setUpdateDatetime(Long.valueOf(preferences.getLastModDt()))
				.setSourceSystemCreateUserIdentifier(preferences.getSrcCreatBy())
				.setSourceSystemCreateDatetime(Long.valueOf(preferences.getSrcCreatDt()))
				.setSourceSystemUpdateUserIdentifier(preferences.getSrcLstModBy())
				.setSourceSystemUpdateDatetime(Long.valueOf(preferences.getGetSrcLstModDt()))
				.setRecordStatusCode(preferences.getRecStatus()).build();
		
		preferenceSelection preferenceSelection1 = preferenceSelection.newBuilder()
				.setPreferenceCategoryCode(preferences.getCatCd())
				.setPreferenceTopicCode(preferences.getTopicCd())
				.setPreferencePropertyCode(preferences.getPropCd())
				.setPreferenceSelectionEffectiveDate(LocalDate.parse(preferences.getSelectEffDt()))
				 .setPreferencePropertyOptionCode(preferences.getPrefCd())
				.setPreferenceTopicDescription("")
				.setPreferencePropertyDescription("")
				.setPreferencePropertyOptionDescription("")
				.setPreferencePropertyOptionValue("")
				//.setLastUpdateDateTime(LocalDate.parse(preferences.getSrcLstModBy()))
				.setLastUpdateUser(preferences.getSrcLstModBy())
				.setPreferenceCategoryDescription("")
				.setIsDefaultSelection("")
				.setPreferenceSelectionTerminationDate(null)
				.build();
		
		operational operational1 = operational.newBuilder()
				.setDocumentIdentifier("")
				.setDocumentCreateDatetime(null)
				.setDocumentOriginatingSourceSystemCode(null)
				.setDocumentUpdateDatetime(null)
				.build();
		
		List<securityPermission> securityPermissionList = new ArrayList<securityPermission>();
		securityPermission securityPermission1 = securityPermission.newBuilder()
				.setSecurityPermissionValue(preferences.getPermission())
				.build();
		securityPermissionList.add(securityPermission1);
		
		security security1 = security.newBuilder()
				.setSecurityPermission(null)
				.setSecuritySourceSystemCode(preferences.getSrcSys())
				.build();

		List<preferenceSelection> prefSelectionList = new ArrayList<preferenceSelection>();
		prefSelectionList.add(preferenceSelection1);

		selection.setIndividualIdentifier(preferences.getId());
		selection.setIndividualSourceSystemCode(preferences.getSrcSys() == null ? "COMPASS": preferences.getSrcSys());
		selection.setAudit(audit1);
		selection.setPreferenceSelection(prefSelectionList);
		selection.setOperational(operational1);
		selection.setPreferenceSelection(prefSelectionList);
		selection.setSecurity(security1);	
        
        return  selection;
    }
}
