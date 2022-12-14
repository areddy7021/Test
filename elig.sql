SELECT INDIVIDUAL_ID, HOUSEHOLD_ID, MBR_NBR, ASSOC_ID, EMP_ID, INSURED_CD, CUST_ACCT_ID, ENROLL_MBR_FACE_ID, MCARE_CLAIM_NBR, PROD_CD, SRC_SYS_CD, LAST_NM, FIRST_NM, MID_NM, GENDER_CD, EMAIL_ADDR, DAY_PHONE, 

EVENING_PHONE, DOB, INS_PLAN_EFF_DT, INS_PLAN_TERM_DT, SPB_STATE, BUSINESS, BOOK_OF_BUSINESS, REC_STATUS, MSG_STATUS, SRC_CREAT_BY, SRC_CREAT_DT, SRC_LST_MOD_BY, SRC_LST_MOD_DT, CREAT_BY, CREAT_DT, LST_MOD_BY, LST_MOD_DT 

FROM EIM.STG_ELIGIBILITY_TOPIC T JOIN 

EIM.ETL_BATCH_LOG B ON T.BATCH_ID=B.BATCH_ID 

WHERE B.BATCH_STATUS='KAFKA_READY' 

UNION 

SELECT INDIVIDUAL_ID, HOUSEHOLD_ID, MBR_NBR, ASSOC_ID, EMP_ID, INSURED_CD, CUST_ACCT_ID, ENROLL_MBR_FACE_ID, MCARE_CLAIM_NBR, PROD_CD, SRC_SYS_CD, LAST_NM, FIRST_NM, MID_NM, GENDER_CD, EMAIL_ADDR, DAY_PHONE, 

EVENING_PHONE, DOB, INS_PLAN_EFF_DT, INS_PLAN_TERM_DT, SPB_STATE, BUSINESS, BOOK_OF_BUSINESS, REC_STATUS, 'U' as MSG_STATUS, SRC_CREAT_BY, SRC_CREAT_DT, SRC_LST_MOD_BY, SRC_LST_MOD_DT, CREAT_BY, CREAT_DT, LST_MOD_BY, LST_MOD_DT 

FROM EIM.STG_ELIGIBILITY_TOPIC T WHERE INDIVIDUAL_ID IN 

(Select INDIVIDUAL_ID FROM EIM.STG_ELIGIBILITY_ADDR T JOIN 

EIM.ETL_BATCH_LOG B ON T.BATCH_ID=B.BATCH_ID 

WHERE B.BATCH_STATUS='KAFKA_READY' AND INDIVIDUAL_ID NOT IN 

(Select INDIVIDUAL_ID FROM EIM.STG_ELIGIBILITY_TOPIC T JOIN 

EIM.ETL_BATCH_LOG B ON T.BATCH_ID=B.BATCH_ID 

WHERE B.BATCH_STATUS='KAFKA_READY' 

)) 

ORDER BY INDIVIDUAL_ID 
