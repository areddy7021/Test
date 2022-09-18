package com.uhc.utils;

import com.uhc.model.Preferences;
import com.uhc.schema.model.preferences.IndividualPreferenceSelection;
import com.uhc.schema.model.preferences.audit;
import com.uhc.schema.model.preferences.preferenceSelection;

import java.util.Arrays;

public class Mapper {

    public static IndividualPreferenceSelection getMapping(Preferences preferences){
        IndividualPreferenceSelection selection = new IndividualPreferenceSelection();
        selection.setIndividualIdentifier(preferences.getId());
        selection.setIndividualSourceSystemCode(preferences.getSrcSys() == null ? "COMPASS": preferences.getSrcSys());

        audit audit1 = audit.newBuilder().setCreateUserIdentifier(preferences.getCreatBy())
                .setCreateDatetime(Long.getLong(preferences.getCreatDt()))
                .setUpdateUserIdentifier(preferences.getLastModBy())
                .setUpdateDatetime(Long.valueOf(preferences.getLastModDt()))
                .setSourceSystemCreateUserIdentifier(preferences.getSrcCreatBy())
                .setSourceSystemCreateDatetime(Long.valueOf(preferences.getSrcCreatDt()))
                .setSourceSystemUpdateUserIdentifier(preferences.getSrcLstModBy())
                .setSourceSystemUpdateDatetime(Long.valueOf(preferences.getGetSrcLstModDt()))
                .setRecordStatusCode(preferences.getRecStatus()).build();

        selection.setAudit(audit1);

        preferenceSelection preferenceSelection1 = preferenceSelection.newBuilder()
                .build();

        selection.setPreferenceSelection(Arrays.asList(preferenceSelection1));
        return  selection;
    }
}
