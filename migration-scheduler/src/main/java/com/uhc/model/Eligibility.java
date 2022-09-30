package com.uhc.model;

import lombok.Data;
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
@Table(name = "stg_preferences_topic", schema = "eim")
public class Eligibility {

	@Id
	@Column(name = "individual_id")
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
	private String individualId;

	@Column(name = "household_id")
	private Integer householdId;

	@Column(name = "mbr_nbr")
	private String mbrNbr;

	@Column(name = "accoc_id")
	private String assocId;

	@Column(name = "EMP_ID")
	private String empId;

	@Column(name = "INSURED_CD")
	private String insuredCd;

	@Column(name = "CUST_ACCT_ID")
	private String custAccountId;

	@Column(name = "ENROLL_MBR_FACE_ID")
	private String enrollMbrFaceId;

	@Column(name = "MCARE_CLAIM_NBR")
	private String mcareClainNbr;

	@Column(name = "PROD_CD")
	private String prodCd;

	@Column(name = "SRC_SYS_CD")
	private String srcSysCd;

	@Column(name = "LAST_NM")
	private String lastName;

	@Column(name = "FIRST_NM")
	private String firstName;

	@Column(name = "MID_NM")
	private String midName;

	@Column(name = "GENDER_CD")
	private String genderCd;

	@Column(name = "EMAIL_ADDR")
	private String emailAddress;

	@Column(name = "DAY_PHONE")
	private String dayPhone;

	@Column(name = "EVENING_PHONE")
	private String eveningPhone;

	@Column(name = "DOB")
	private String dob;

	@Column(name = "INS_PLAN_EFF_DT")
	private String insPlanEffDate;

	@Column(name = "INS_PLAN_TERM_DT")
	private String insPlanTermDate;

	@Column(name = "SPB_STATE")
	private String spbState;

	@Column(name = "BUSINESS")
	private String business;

	@Column(name = "BOOK_OF_BUSINESS")
	private String bookOfBusiness;

	@Column(name = "REC_STATUS")
	private String recStatus;

	@Column(name = "MSG_STATUS")
	private String msgStatus;

	@Column(name = "SRC_CREAT_BY")
	private String srcCreatedBy;

	@Column(name = "SRC_CREAT_DT")
	private String srcCreatedDate;

	@Column(name = "SRC_LST_MOD_BY")
	private String srcLastModifiedBy;

	@Column(name = "SRC_LST_MOD_DT")
	private String srcLastModifiedDate;

	@Column(name = "CREAT_BY")
	private String createdBy;

	@Column(name = "CREAT_DT")
	private String createdDate;

	@Column(name = "LST_MOD_BY")
	private String lastModifiedBy;

	@Column(name = "LST_MOD_DT")
	private String lastModifiedDate;

	// INDIVIDUAL_ID, HOUSEHOLD_ID, MBR_NBR, ASSOC_ID, EMP_ID, INSURED_CD,
	// CUST_ACCT_ID, ENROLL_MBR_FACE_ID, MCARE_CLAIM_NBR, PROD_CD, SRC_SYS_CD,
	// LAST_NM,
	// FIRST_NM, MID_NM, GENDER_CD, EMAIL_ADDR, DAY_PHONE,

	// EVENING_PHONE, DOB, INS_PLAN_EFF_DT, INS_PLAN_TERM_DT, SPB_STATE, BUSINESS,
	// BOOK_OF_BUSINESS,
	// REC_STATUS, MSG_STATUS, SRC_CREAT_BY, SRC_CREAT_DT, SRC_LST_MOD_BY,
	// SRC_LST_MOD_DT, CREAT_BY, CREAT_DT, LST_MOD_BY, LST_MOD_DT

}
