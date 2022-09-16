package com.uhc.model;
 
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Immutable;
import org.hibernate.annotations.Subselect;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Immutable
@Table(name = "stg_preferences_topic" , schema = "eim")
public class Preferences {

    @Id
    @Column(name = "individual_id")
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "cat_cd")
    private String catCd;

    @Column(name = "topic_cd")
    private String topicCd;

    @Column(name = "prop_cd")
    private String propCd;

    @Column(name = "select_eff_dt")
    private String selectEffDt;

    @Column(name = "pref_cd")
    private String prefCd;

    @Column(name = "rec_status")
    private String recStatus;

    @Column(name = "msg_status")
    private String msgStatus;

    @Column(name = "src_creat_by")
    private String srcCreatBy;

    @Column(name = "src_creat_dt")
    private String srcCreatDt;

    @Column(name = "src_lst_mod_by")
    private String srcLstModBy;

    @Column(name = "src_lst_mod_dt")
    private String getSrcLstModDt;

    @Column(name = "creat_by")
    private String creatBy;

    @Column(name = "creat_dt")
    private String creatDt;

    @Column(name = "lst_mod_by")
    private String lastModBy;

    @Column(name = "lst_mod_dt")
    private String lastModDt;

    @Column(name = "src_sys")
    private String srcSys;

    @Column(name = "permission")
    private String permission;


}