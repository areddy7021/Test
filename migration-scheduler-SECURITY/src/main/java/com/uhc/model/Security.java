package com.uhc.model;
 
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Immutable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Immutable
@Table(name = "stg_security_topic" , schema = "eim")
public class Security {

    @Id
    @Column(name = "consumer_nm")
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private String consumerNm;

    @Column(name = "security_role")
    private String securityRole;

    @Column(name = "permission")
    private String permission;

    @Column(name = "src_sys")
    private String srcSys;

    @Column(name = "msg_status")
    private String msgStatus;

    @Column(name = "creat_by")
    private String creatBy;

    @Column(name = "creat_dt")
    private String creatDt;

    @Column(name = "lst_mod_by")
    private String lstModBy;

    @Column(name = "lst_mod_dt")
    private String lstModDt;


}