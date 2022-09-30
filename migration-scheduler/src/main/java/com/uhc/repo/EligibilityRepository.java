package com.uhc.repo;

import com.uhc.model.Eligibility;
import com.uhc.model.Security;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EligibilityRepository extends JpaRepository<Eligibility, String> {
    @Query(value = "select consumer_nm, security_role, permission, src_sys, msg_status, creat_by, creat_dt, lst_mod_by, lst_mod_dt\n" +
            "from eim.stg_security_topic ST JOIN eim.etl_batch_log B ON\n" +
            "ST.BATCH_ID=B.BATCH_ID\n" +
            "WHERE batch_status='KAFKA_READY'" , nativeQuery = true)
    List<Eligibility> getAllEligibilityList();
}