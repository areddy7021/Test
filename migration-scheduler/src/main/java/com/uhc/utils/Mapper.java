package com.uhc.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.joda.time.LocalDate;

import com.uhc.model.Preferences;
import com.uhc.schema.model.preferences.IndividualPreferenceSelection;
import com.uhc.schema.model.preferences.audit;
import com.uhc.schema.model.preferences.operational;
import com.uhc.schema.model.preferences.preferenceSelection;
import com.uhc.schema.model.preferences.security;
import com.uhc.schema.model.preferences.securityPermission;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.util.Arrays;

public class Mapper {

    public static IndividualPreferenceSelection getMapping(Preferences preferences) throws ParseException {
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
                .setCreateDatetime(createdDtTime)
                .setUpdateUserIdentifier(preferences.getLastModBy())
                .setUpdateDatetime(modDt)
                .setSourceSystemCreateUserIdentifier(preferences.getSrcCreatBy())
                .setSourceSystemCreateDatetime(srcCreatedDtTime)
                .setSourceSystemUpdateUserIdentifier(preferences.getSrcLstModBy())
                .setSourceSystemUpdateDatetime(srcLastModDtTime)
                .setRecordStatusCode(preferences.getRecStatus()).build();

        preferenceSelection preferenceSelection1 = preferenceSelection.newBuilder()
                .setPreferenceCategoryCode(preferences.getCatCd())
                .setPreferenceTopicCode(preferences.getTopicCd())
                .setPreferencePropertyCode(preferences.getPropCd())
                .setPreferenceSelectionEffectiveDate(null)
                .setPreferencePropertyOptionCode(preferences.getPrefCd())
                .setPreferenceTopicDescription("")
                .setPreferencePropertyDescription("")
                .setPreferencePropertyOptionDescription("")
                .setPreferencePropertyOptionValue("")
                .setLastUpdateDateTime(srcLastModDtTime)
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