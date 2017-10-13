package com.ofss.fcubs.gw.ws;

public interface CreateCustomerSOAPConstants {
		 static final String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		 static final String BLANK = "";
		 static final String N = "N";
		 static final String Y = "Y"; 
		 static final String MUR = "MUR"; 
		 static final String SMS = "SMS";
		 static final String EMAIL = "EMAIL";
		 static final String SMS_KEY = "M";
		 static final String EMAIL_KEY = "E";
		 static final String DEFAULT_RESISTAT = "R";
		 static final String SOURCE = "EXTSYSCOB";  
		 static final String DEFAULT_MSGID = "EMP1a20s1f2116";
		 static final String DUMMY = "DUMMY";
		 static final String DEFAULT_USERID = "COBUSER";
		 static final String DEFAULT_BRANCH = "001";  
		 static final String DEFAULT_MODULEID = "AC";
		 static final String SERVICE = "FCUBSCustomerService";
		 static final String ACC_SERVICE = "FCUBSAccService";
		 static final String OPERATION_CUSTOMER = "CreateCustomer";
		 static final String OPERATION_ACCOUNT = "CreateCustAcc";
		 static final String CTYPE = "I";
		 static final int    MAX_NAME_CHAR = 105;
		 static final int    MAX_NAME_CHAR2 = 255;
		 static final String DEFAULT_LBRN = "001";  
		 static final String RESIDENCYSTATUSVAL = "NON_RES";
		 static final String CCATEG_RESIDENT = "RESIDENT";
		 static final String CCATEG_NON_RESIDENT = "NONRESIDENT"; 
		 static final String UIDNAME_PASSPORT = "PASSPORT"; 
		 static final String UIDNAME_IDENTITY_CARD = "IDENTITY_CARD"; 
		 static final String UIDVAL_NIC = "NIC"; 
		 static final String DEFAULT_MEDIA = "MAIL"; 
		 static final String DEFAULT_LOC = "OTH";	
		 static final int CHECK_LEAVES = 25;	
		 static final String REQUEST_STATUS = "REQUESTED";
		 static final String CHQ_TYPE = "COMM";
		 static final String POOLCD = "DFLTPOOL";
	 
	     static final String INDV_APPLICANT = "INDV_APPLICANT";
		 static final String INDV_GUARDIAN = "INDV_GUARDIAN";
		 static final String JOINT1_APPLICANT = "JOINT1_APPLICANT";
		 static final String JOINT1_GUARDIAN = "JOINT1_GUARDIAN";
		 static final String JOINT2_APPLICANT = "JOINT2_APPLICANT";
		 static final String JOINT2_GUARDIAN = "JOINT2_GUARDIAN";
		 static final String JOINT3_APPLICANT = "JOINT3_APPLICANT";
		 static final String JOINT3_GUARDIAN = "JOINT3_GUARDIAN";
		 static final String JOINT4_APPLICANT = "JOINT4_APPLICANT";
		 static final String JOINT4_GUARDIAN = "JOINT4_GUARDIAN";
		 static final String JOINT5_APPLICANT = "JOINT5_APPLICANT";
		 static final String JOINT5_GUARDIAN = "JOINT5_GUARDIAN"; 
		 static final String APPLICANT = "_APPLICANT";
		 static final String GUARDIAN = "_GUARDIAN";
		 static final String JOINT = "JOINT";
		 
		 static final String RELATIONSHIP_PROXY = "PROXY";
		 static final String RELATIONSHIP_PRIMARY = "Primary";
		 static final String RELATIONSHIP_LEGALGUARDIAN = "LegalGuardian";
		 static final String RELATIONSHIP_JOO = "JOO";
		 static final String RELATIONSHIP_JAO = "JAO";
		 static final String MOP_J = "J";
		 static final String MOP_E = "E";
		 static final String POST = "POST";
		 
		 
		 static final String SUCCESS = "SUCCESS";
		 static final String FAILURE = "FAILURE";
		 static final String MSGSTAT = "MSGSTAT";
		 static final String ACCNO = "ACCNO";
		 static final String WARNING = "WARNING";
		 static final String ERROR = "ERROR";
		 static final String CUSTNO = "CUSTNO";
		 static final String CRT_CUST = "CRT_CUST";
		 static final String CRT_ACC = "CRT_ACC";
		 
		 static final String  MARITAL_STATUS_KEY_S ="S";
		 static final String  MARITAL_STATUS_VAL_S ="SINGLE";
		 static final String  MARITAL_STATUS_KEY_M ="M";
		 static final String  MARITAL_STATUS_VAL_M ="MARRIED";
		 static final String  MARITAL_STATUS_KEY_D ="D";
		 static final String  MARITAL_STATUS_VAL_D ="DIVORCED";
		 static final String  MARITAL_STATUS_KEY_R ="R";
		 static final String  MARITAL_STATUS_VAL_R ="REMARRIED";
		 static final String  MARITAL_STATUS_KEY_P ="P";
		 static final String  MARITAL_STATUS_VAL_P ="SEPARATED";
		 static final String  MARITAL_STATUS_KEY_E ="E";
		 static final String  MARITAL_STATUS_VAL_E ="SPOUSE EXPIRED";
		
		 static final String  EMPLOYMENT_STATUS_KEY_F ="F";
		 static final String  EMPLOYMENT_STATUS_VAL_F ="Full-time permanent";
		 static final String  EMPLOYMENT_STATUS_KEY_T ="T";
		 static final String  EMPLOYMENT_STATUS_VAL_T ="Full-time temporary";
		 static final String  EMPLOYMENT_STATUS_KEY_U ="U";
		 static final String  EMPLOYMENT_STATUS_VAL_U ="Unemployed";
		 static final String  EMPLOYMENT_STATUS_KEY_S ="S";
		 static final String  EMPLOYMENT_STATUS_VAL_S ="Self Employed";
		 static final String  EMPLOYMENT_STATUS_KEY_P ="P";
		 static final String  EMPLOYMENT_STATUS_VAL_P ="Part-time";		 
		 static final String  EMPLOYMENT_STATUS_KEY_R ="R";
		 static final String  EMPLOYMENT_STATUS_VAL_R ="Retired-pensioned";
		 static final String  EMPLOYMENT_STATUS_KEY_N ="N";
		 static final String  EMPLOYMENT_STATUS_VAL_N ="Retired non-pensioned";
		 static final String  EMPLOYMENT_STATUS_KEY_O ="O";
		 static final String  EMPLOYMENT_STATUS_VAL_O ="Other";
		 
		 static final String  CUST_SEGM_EMP ="R_STAFF";
		 static final String  CUST_SEGM_HNWI ="R_HNWI";
		 static final String  CUST_SEGM_OTHER ="R_PRIV";
		 static final String  IND_SEGM ="HHLD";
		 static final String  SUB_SECT ="PERS_ALL";
		 static final String  CUST_TYPE ="INDIVIDUA";
		 static final String  OFFSHORE ="";
		 static final String  TDS_TYPE ="INDIVIDUA";
		 static final String  SUBSECT ="S95";
		 
		 static final String  ACCOUNT_OPENED ="ACCOUNT OPENED";
		 static final String  UNDER_PROCESSING ="UNDER_PROCESSING";
		 
		 static final String  CRS_TIN_1 ="CRS_TIN_1";
		 static final String  CRS_TIN_2 ="CRS_TIN_2";
		 static final String  CRS_TIN_3 ="CRS_TIN_3";
		 static final String  NO_TIN_OPTION_B ="B";
		 static final String  FIRST_HEAR_ABOUT_AFRASIA = "FIRST_HEAR_ABOUT_AFRASIA";
		 static final String  LEISURE_PREFERENCE = "LEISURE_PREFERENCE";
		 static final String  PRIMARY = "PRIMARY";

}