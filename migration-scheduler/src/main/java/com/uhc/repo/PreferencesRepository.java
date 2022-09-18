package com.uhc.repo;

import com.uhc.model.Preferences;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PreferencesRepository extends JpaRepository<Preferences, String> {
    @Query(value = "select pt.individual_id, pt.src_sys, pt.cat_cd, pt.topic_cd, pt.prop_cd, pt.select_eff_dt, pt.pref_cd, pt.rec_status, pt.msg_status, pt.src_creat_by, pt.src_creat_dt, pt.src_lst_mod_by, pt.src_lst_mod_dt, pt.creat_by, pt.creat_dt, pt.lst_mod_by, pt.lst_mod_dt, ps.src_sys, ps.permission\n" +
            "from eim.stg_preferences_topic PT\n" +
            "LEFT OUTER JOIN eim.stg_preferences_security PS ON\n" +
            "PT.Preferences_Id=PS.Preferences_Id\n" +
            "JOIN eim.etl_batch_log B ON\n" +
            "PT.BATCH_ID=B.BATCH_ID\n" +
            "WHERE batch_status='KAFKA_READY'\n" +
            "ORDER BY pt.individual_id, ps.src_sys" , nativeQuery = true)
    List<Preferences> getAllPreferences();
}