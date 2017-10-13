package com.ofss.fcubs.gw.ws;

import java.math.BigDecimal;
import java.security.SecureRandom;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.log4j.Logger;

import com.afrAsia.entities.request.AccountCreationDetails;
import com.afrAsia.entities.request.MobCreateCustomerSOAPRequest;
import com.afrAsia.entities.transactions.MobAccountAdditionalDetail;
import com.afrAsia.entities.transactions.MobAccountDetail;
import com.afrAsia.entities.transactions.MobApplicantCommDetail;
import com.afrAsia.entities.transactions.MobApplicantPersonalDetail;
import com.google.gson.Gson;
import com.ofss.fcubs.gw.ws.types.FCUBSAccService;
import com.ofss.fcubs.gw.ws.types.FCUBSAccServiceSEI;
import com.ofss.fcubs.service.fcubsaccservice.CREATECUSTACCFSFSREQ;
import com.ofss.fcubs.service.fcubsaccservice.CREATECUSTACCFSFSRES;
import com.ofss.fcubs.service.fcubsaccservice.CustAccFullType;
import com.ofss.fcubs.service.fcubsaccservice.CustAccountMISFullType;
import com.ofss.fcubs.service.fcubsaccservice.FCUBSHEADERType;
import com.ofss.fcubs.service.fcubsaccservice.LinkedEntitiesFullType;
import com.ofss.fcubs.service.fcubsaccservice.MsgStatType;
import com.ofss.fcubs.service.fcubsaccservice.UBSCOMPType;
import com.ofss.fcubs.service.fcubsaccservice.UDFDETAILSType2;


public class CreateAccountSOAP  implements CreateCustomerSOAPConstants {
	 final static Logger debugLog = Logger.getLogger("debugLogger");
		final static Logger infoLog = Logger.getLogger("infoLogger");
		final static Logger errorLog = Logger.getLogger("errorLogger");
	static SecureRandom rnd = new SecureRandom();
	
	public Map<String,Object> createAfrAsiaAccount(String userId,Map<String, AccountCreationDetails> accountDtlsMap) throws DatatypeConfigurationException	{
		infoLog.info("===> createAfrAsiaAccount start ");
		//============================================================================================================
		
		AccountCreationDetails accountCreationDetails = accountDtlsMap.get(INDV_APPLICANT);
		MobCreateCustomerSOAPRequest mobCreateCustomerSOAPRequest = accountCreationDetails.getMobCreateCustomerSOAPRequest();
		
		MobApplicantPersonalDetail mobApplicantPersonalDetail = mobCreateCustomerSOAPRequest.getMobApplicantPersonalDetail();
		MobAccountDetail mobAccountDetails = mobCreateCustomerSOAPRequest.getMobAccountDetail();
		MobApplicantCommDetail mobApplicantCommDetail = mobCreateCustomerSOAPRequest.getMobApplicantCommDetail();
		
		// set the header value
				//-------------- header start-------------------
				FCUBSHEADERType headerValue = getSOAPRequestHeader();
				
				//-------------- header end-------------------
		
		CustAccFullType custAccFullType = new CustAccFullType();
		
		//   <fcub:BRN>?</fcub:BRN> - 001	Default - 001
		custAccFullType.setBRN(DEFAULT_BRANCH);
		
		//   <fcub:ACC>?</fcub:ACC> - blank
		custAccFullType.setACC(DUMMY);
		
		// CIF of primary customer. You should receive this from CreateCustomer service.
		// The CIF number of primary applicant should be populated in the INDV_APPLICANT_REF_NO field |
		// MOB_ACCOUNT_DETAILS	
		//  <fcub:CUSTNO>?</fcub:CUSTNO> 
		String custCif = mobApplicantPersonalDetail.getCustCif();
		custAccFullType.setCUSTNO(custCif);
		
		// Type of account you want to create Table: ACCOUNT_TYPE |MOB_ACCOUNT_DETAILS | 6
		//  <fcub:ACCLS>?</fcub:ACCLS> 
		String accountType = mobAccountDetails.getAccountType();
		custAccFullType.setACCLS(accountType);
		
		// <fcub:CCY>?</fcub:CCY> 
		custAccFullType.setCCY(MUR);
		
		//  FN MN LN FIRST_NAME, MIDDLE_NAME, LAST_NAME| MOB_APPLICANT_DETAILS	| 255 
		// <fcub:CUSTNAME>?</fcub:CUSTNAME>
		String fullName = getFullName(mobCreateCustomerSOAPRequest,MAX_NAME_CHAR2);
		custAccFullType.setCUSTNAME(fullName);
		
		//  FN MN LN | FIRST_NAME, MIDDLE_NAME, LAST_NAME"	MOB_APPLICANT_DETAILS
		//   <fcub:ADESC>?</fcub:ADESC> 
		/*String fullName2 = getFullName(mobCreateCustomerSOAPRequest,0);
		custAccFullType.setADESC(fullName2);*/
		custAccFullType.setADESC("New Account");
		
		// - S - Single, J -Joint | ACCOUNT_CATEGORY	| MOB_ACCOUNT_DETAILS	| 1
		// <fcub:ACCTYPE>?</fcub:ACCTYPE> 
		String accountCategory = mobAccountDetails.getAccountCategory();
		custAccFullType.setACCTYPE(accountCategory);
		
		// <fcub:ALTACC>?</fcub:ALTACC> - blank
		//custAccFullType.setALTACC(BLANK);
		
		// <fcub:ADDR1>?</fcub:ADDR1> mailing address (either send data or blank)
		//  MAIL_ADDR1	MOB_APPLICANT_COMM_DETAILS
		//String mailAddr1 = CheckNull(mobApplicantCommDetail.getMailAddr1());
		//custAccFullType.setADDR1(mailAddr1);
		
		// <fcub:ADDR2>?</fcub:ADDR2>
		//  MAIL_ADDR2	MOB_APPLICANT_COMM_DETAILS
		//String mailAddr2 = CheckNull(mobApplicantCommDetail.getMailAddr2());
		//custAccFullType.setADDR2(mailAddr2);
		
		// <fcub:ADDR3>?</fcub:ADDR3>
		//  MAIL_ADDR3	MOB_APPLICANT_COMM_DETAILS
		//String mailAddr3 = CheckNull(mobApplicantCommDetail.getMailAddr3());
		//custAccFullType.setADDR3(mailAddr3);
		
		//     <fcub:ADDR4>?</fcub:ADDR4>
		//  MAIL_CITY	MOB_APPLICANT_COMM_DETAILS
		//String mailCity = CheckNull(mobApplicantCommDetail.getMailCity());
		//custAccFullType.setADDR4(mailCity);
		
		// blank, (if IBANRQD - Y, it will be autogenerated). This will be 
		// returned in the response for createAccount
		//custAccFullType.setIBANACNO(BLANK);
		
		// OTH    <fcub:LOC>?</fcub:LOC> 
		//custAccFullType.setLOC(DEFAULT_LOC);
		
		// <fcub:MEDIA>?</fcub:MEDIA> 	
		custAccFullType.setMEDIA(DEFAULT_MEDIA);
		
		// Indicated if Cheque book is requires	Defaults to Y	1 (Y/N)
		// <fcub:CHQBOOK>?</fcub:CHQBOOK>
		custAccFullType.setCHQBOOK(Y);
		//  <fcub:CHKNAME1>?</fcub:CHKNAME1> - ignore  // new added
		// error before add : - Cheque Book name is Not Entered Please check!
		custAccFullType.setCHKNAME1(fullName);
		
		// Y <fcub:IBANRQD>?</fcub:IBANRQD>
		custAccFullType.setIBANRQD(Y);
		
		// Possible values are - S, J, E |Table | MOP| MOB_ACCOUNT_DETAILS
		String mop = mobAccountDetails.getMop();
		custAccFullType.setOPMODE(mop);
		
		// This is for the signature for the account. Pass Y if it needs to be replicated from CIF 
		//   <fcub:REPL_CUST_SIG>?</fcub:REPL_CUST_SIG>
		custAccFullType.setREPLCUSTSIG(Y);
		
		// There can be maximum 5 joint holders
		List<CustAccFullType.Jointholders> jointholders = custAccFullType.getJointholders();
		
		/* 		CIF of joint holder that would be returned from CreateCustomer service. This will need to be populated in 
		 		JOINT_1_CIF, JOINT_2_CIF, JOINT_3_CIF,JOINT_4_CIF,JOINT_5_CIF  |  MOB_ACCOUNT_DETAILS
				//-----------------------------------------------------------------------------------
				<FN MN LN>
				FIRST_NAME, MIDDLE_NAME, LAST_NAME
				Joint applicant reference no. will be received from MOB_ACCOUNTS_DETAILS table.
				Use the applicant reference no. to get details from MOB_APPLICANT_PERSONAL_DETAILS table*/
				// name of customer | MOB_APPLICANT_PERSONAL_DETAILS | 105
				// -----------------------------------------------------------------------------------
				// MOP_1, MOP_2, MOP_3, MOP_4, MOP_5  || MOB_ACCOUNT_DETAILS
				// MOP 
		       //-------------------------------------------------------------------------------------
		
		// String, AccountCreationDetails
		Set<String> jointAccKeys = new HashSet<String>();
		jointAccKeys.add(JOINT1_APPLICANT);
		jointAccKeys.add(JOINT2_APPLICANT);
		jointAccKeys.add(JOINT3_APPLICANT);
		jointAccKeys.add(JOINT4_APPLICANT);
		jointAccKeys.add(JOINT5_APPLICANT);
		
		for( String key: accountDtlsMap.keySet()){
			if(jointAccKeys.contains(key)){
				
				AccountCreationDetails accountCreationDetails2 = accountDtlsMap.get(key);
				if( null != accountCreationDetails2){
					MobApplicantPersonalDetail mobApplicantPersonalDetail2 = accountCreationDetails2.getMobCreateCustomerSOAPRequest().getMobApplicantPersonalDetail();
					//MobAccountDetail mobAccountDetail = accountCreationDetails2.getMobCreateCustomerSOAPRequest().getMobAccountDetail();
					
				/*	If Joint holder is Proxy, do not add him here. Check IS_PROXY_HOLDER field for the same 
				 * from MOB_APPLICANT_PERSONAL_DETAILS table*/
					
					if(null != mobApplicantPersonalDetail2 && !mobApplicantPersonalDetail2.getIsProxyHolder()){
						CustAccFullType.Jointholders jointholder = new CustAccFullType.Jointholders();
						
						jointholder.setJNTHLDCDE(mobApplicantPersonalDetail2.getCustCif());
						String fullName3 = getFullName(accountCreationDetails2.getMobCreateCustomerSOAPRequest(), MAX_NAME_CHAR);
						jointholder.setJNTHLDDESC(fullName3);
						//jointholder.setJNTHLDTYP(mobAccountDetail.getMop());
						jointholder.setJNTHLDTYP(mobApplicantPersonalDetail2.getSignatoryType());
						jointholders.add(jointholder);
					}
				}
			
			}
		}
		
		
		//  This is for creating cheque book | <fcub:Cust-Acc-Check>
		 CustAccFullType.CustAccCheck custAccCheck = new CustAccFullType.CustAccCheck();
		
		 // Default to 001 | <fcub:BRANCH>?</fcub:BRANCH> 
		 custAccCheck.setBRANCH(DEFAULT_BRANCH);
		 
		 // blank |  <fcub:ACCOUNT>?</fcub:ACCOUNT>
		 custAccCheck.setACCOUNT(BLANK);
		 
		 // <fcub:FIRST_CHECK_NO>?</fcub:FIRST_CHECK_NO> 
		// custAccCheck.setFIRSTCHECKNO(BLANK);
		 
		 // no.of leaves in cheque book = 25 | <fcub:CHECK_LEAVES>?</fcub:CHECK_LEAVES> 
		 custAccCheck.setCHECKLEAVES(new BigDecimal(CHECK_LEAVES));
		 
		// blank | <fcub:CHEQUE_BOOK_TYPE>?</fcub:CHEQUE_BOOK_TYPE>
		 custAccCheck.setCHEQUEBOOKTYPE(BLANK);
		 
		 // current server date |   <fcub:ORDER_DATE>?</fcub:ORDER_DATE>
		 long millis=System.currentTimeMillis();  
		 java.util.Date date=new java.util.Date(millis);
		 GregorianCalendar gcal = new GregorianCalendar();
		 gcal.setTime(date);
		 XMLGregorianCalendar ordDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(gcal);
		 custAccCheck.setORDERDATE(ordDate);
		 
		 // Principal Applicant FN LN |    <fcub:ORDER_DETAILS>?</fcub:ORDER_DETAILS>
		 String firstName = mobApplicantPersonalDetail.getFirstName();
		 String lastName = mobApplicantPersonalDetail.getLastName();
		 custAccCheck.setORDERDETAILS(firstName +" "+ lastName);
		 
		 // blank | <fcub:LANG_CODE>?</fcub:LANG_CODE>		 
		 custAccCheck.setLANGCODE(BLANK);
		 
		 // Requested |  <fcub:REQUEST_STATUS>?</fcub:REQUEST_STATUS>
		 custAccCheck.setREQUESTSTATUS(REQUEST_STATUS);
		 
		 // COMM | <fcub:CHQ_TYPE>?</fcub:CHQ_TYPE>
		 custAccCheck.setCHQTYPE(CHQ_TYPE);
		 // set the custAccCheck
	    custAccFullType.setCustAccCheck(custAccCheck);	 
	 
	 // This will be an array for all applicants
	 //   <fcub:Linkedentities> 
	for( String key : accountDtlsMap.keySet()){
			AccountCreationDetails accountCrs = accountDtlsMap.get(key);
			if( null != accountCrs){
				MobAccountDetail mobAccountDetail = accountCrs.getMobCreateCustomerSOAPRequest().getMobAccountDetail();
				MobApplicantPersonalDetail mobApplicantPersonalDetail2 = accountCrs.getMobCreateCustomerSOAPRequest().getMobApplicantPersonalDetail();
				LinkedEntitiesFullType linkedentities = new LinkedEntitiesFullType();
				 // CIF of applicant
				 linkedentities.setCUSTOMER(accountCrs.getCif());
				 
				//  Primary for Primary applicant.
				// JOO - If holding pattern is E and customer is Joint
				// JAO if holding pattern is J and customer is Joint
				// LegalGuardian for guardian
				// MOP field defines holding pattern in MOB_ACCOUNT_DETAILS table
				 // PROXY if user is a Proxy which we get IS_PROXY => MOB_APPLICANT_PERSONAL_DETAILS table
				 
				 String relationship=BLANK;
				 
				 if(mobApplicantPersonalDetail2.getIsProxyHolder()){
					 
					 relationship = RELATIONSHIP_PROXY;
				 }
				 else
				 	{
						 if(key.contains(GUARDIAN)){
							 relationship = RELATIONSHIP_LEGALGUARDIAN;
						 }
						 else if ( key.contains(JOINT) && !key.contains(GUARDIAN)){
							  if(mobAccountDetail.getMop().equalsIgnoreCase(MOP_E)){
								  relationship = RELATIONSHIP_JOO;
							  }
							  else if(mobAccountDetail.getMop().equalsIgnoreCase(MOP_J)){
								  relationship = RELATIONSHIP_JAO;
							  }
						 }					 
						 else if(key.equalsIgnoreCase(INDV_APPLICANT)){
							 relationship = RELATIONSHIP_PRIMARY;
						 }
				  }
				 
				
				 linkedentities.setRELATIONSHIP(relationship);
				  
				  // Applicant name
				  MobApplicantPersonalDetail mobApplicantPDtl = mobApplicantPersonalDetail2;
				  linkedentities.setDESCP(mobApplicantPDtl.getFirstName() + " " + mobApplicantPDtl.getLastName());
				  
				//========= set linkedentities ==================
				  custAccFullType.setLinkedentities(linkedentities);
			}
			
	 }

	 //========= CustAccountMISFullType ==============//
	  CustAccountMISFullType custAcc = new CustAccountMISFullType();
	  
	  // <fcub:BRN>?</fcub:BRN> Default is 001
	 // custAcc.setBRN(DEFAULT_BRANCH);
	  
	 // <fcub:POOLCD>?</fcub:POOLCD> -  Default to "DFLTPOOL"
	  CustAccountMISFullType.Misdetails misdetails = new CustAccountMISFullType.Misdetails();
	  misdetails.setPOOLCD(POOLCD);
	  custAcc.setMisdetails(misdetails);
      custAccFullType.setCustAcc(custAcc);  
	 //=======================   <fcub:UDFDETAILS>    not require in create account service call====================== 
     
	 List<UDFDETAILSType2> udfdetails = custAccFullType.getUDFDETAILS();
	
	// udfDetails not require in create customer 
	 // Map<String, String> udfDetailsMap = getUdfDetailsMap(mobCreateCustomerSOAPRequest);
	  Map<String, String> udfDetailsMap = new HashMap<String, String>();
	  udfDetailsMap.put("TEMP_OD", "0");
	  
	  for(String key : udfDetailsMap.keySet()){
		  UDFDETAILSType2 udfdetail = new UDFDETAILSType2();
		  udfdetail.setFLDNAM(key);
		  udfdetail.setFLDVAL(udfDetailsMap.get(key));
		  udfdetails.add(udfdetail);
	   }
    //============================================================	 
	  
	  CREATECUSTACCFSFSREQ requestMsg = new CREATECUSTACCFSFSREQ();
	  FCUBSHEADERType fCUBSHEADER = headerValue;
	  requestMsg.setFCUBSHEADER(fCUBSHEADER);
	  
	  CREATECUSTACCFSFSREQ.FCUBSBODY fCUBSBODY = new CREATECUSTACCFSFSREQ.FCUBSBODY();
	  fCUBSBODY.setCustAccountFull(custAccFullType);
	  requestMsg.setFCUBSBODY(fCUBSBODY);
	  
	  Gson gson = new Gson();
	  String requestMsgJson = gson.toJson(requestMsg);
	 
	  debugLog.debug(" requestMsgJson : "+requestMsgJson);
	  
	  CREATECUSTACCFSFSRES createCustAccFSRes = callCreateAccountSOAP(requestMsg);
	  
	  String json2 = gson.toJson(createCustAccFSRes);
		
		infoLog.info("END of CreateAccount SOAP call");
		debugLog.debug("Got response from CreateAccount: "+json2);
	  
	  
	  Map<String, Object> result = new HashMap<String, Object>();
	  if( null != createCustAccFSRes){
		  if( null != createCustAccFSRes.getFCUBSHEADER()){
			  MsgStatType msgstat = createCustAccFSRes.getFCUBSHEADER().getMSGSTAT();
			  if(null != msgstat  && msgstat.value().equalsIgnoreCase(SUCCESS)){
				  if( null != createCustAccFSRes.getFCUBSBODY().getCustAccountFull()){
					  String accNumber = createCustAccFSRes.getFCUBSBODY().getCustAccountFull().getACC();
					  if( null != accNumber && !accNumber.isEmpty()){
						  
						  result.put(ACCNO, accNumber);
						  result.put(MSGSTAT,  msgstat.value());
					  }
					  else{
						  result.put(ACCNO, null);
						  result.put(MSGSTAT,  msgstat.value());
					  }
				  }
		  		}
			  else{
				  result.put(ACCNO, "");
				  result.put(MSGSTAT,  msgstat.value());
			  }
		  }
		  
		  result.put(WARNING, createCustAccFSRes.getFCUBSBODY().getFCUBSWARNINGRESP());
		  result.put(ERROR, createCustAccFSRes.getFCUBSBODY().getFCUBSERRORRESP());
	  }
	  //======================================================================================
	  infoLog.info("===> createAfrAsiaAccount end ");
	  return result;
  }
	
	private CREATECUSTACCFSFSRES callCreateAccountSOAP(CREATECUSTACCFSFSREQ requestMsg){
		
		FCUBSAccService fCUBSAccService = new FCUBSAccService();
		FCUBSAccServiceSEI fcubsAccServiceSEI = fCUBSAccService.getFCUBSAccServiceSEI();
		CREATECUSTACCFSFSRES createCustAccFSRes = fcubsAccServiceSEI.createCustAccFS(requestMsg);
		
		return createCustAccFSRes;
	}
	
	private Map<String,String> getCustomermisMap(MobCreateCustomerSOAPRequest mobCreateCustomerSOAPRequest){
		/*CUST_SEGM - (Values can be R_PRIV, R_HNWI, R_STAFF)
		In MOB_APPLICANT_PERSONAL_DETAILS, if IS_EMPLOYEE = true value should be R_STAFF.
		In MOB_APPLICANT_PERSONAL_DETAILS, if IS_HNWI = true value should be R_HNWI else it should be R_PRIV*/
		Map<String,String> misMap = new HashMap<String,String>();
		boolean isEmployee = mobCreateCustomerSOAPRequest.getMobApplicantPersonalDetail().isEmployee();
		boolean isHnwi = false;//mobCreateCustomerSOAPRequest.getMobApplicantPersonalDetail().getIsHNWI();
		if(isEmployee)
		{
			misMap.put("CUST_SEGM", CUST_SEGM_EMP); //misMap.put("CUST_SEGM", "R_STAFF");
		}
		else if (isHnwi){
			misMap.put("CUST_SEGM", CUST_SEGM_HNWI); // misMap.put("CUST_SEGM", "R_HNWI");
		}
		else{
			misMap.put("CUST_SEGM", CUST_SEGM_OTHER);     // misMap.put("CUST_SEGM", "R_PRIV");
		}
		
		/*IND_SEGM: By default – HHLD 
		SUB_SECT: By default - PERS_ALL 
		REL_MANAG: RM_ID
		This will be RM_ID that can be obtained from MOB_RM_APP_REF_ID table, against appref (id) column*/
		
		misMap.put("IND_SEGM", IND_SEGM);  // misMap.put("IND_SEGM", "HHLD");
		misMap.put("SUB_SECT", SUB_SECT); // misMap.put("SUB_SECT", "PERS_ALL");
		String rmUsedId = mobCreateCustomerSOAPRequest.getMobRmAppRefId().getRmUsedId();
		misMap.put("REL_MANAG", rmUsedId); // misMap.put("REL_MANAG", rmUsedId);
		
		/*CUST_TYPE: By Default – INDIVIDUA 
		OFFSHORE: To be selected by RM 
		[On hold - Adilah to confirm] // ?
		TDS_TYPE: By default – INDIVIDUA 
		SUBSECT: By default - S95  */
		misMap.put("CUST_TYPE", CUST_TYPE);  //misMap.put("CUST_TYPE", "INDIVIDUA");
		misMap.put("OFFSHORE", OFFSHORE); // misMap.put("OFFSHORE", BLANK);
		misMap.put("TDS_TYPE", TDS_TYPE); // misMap.put("TDS_TYPE", "INDIVIDUA");
		misMap.put("SUBSECT", SUBSECT); // misMap.put("SUBSECT", "S95");
		
		return misMap;
	}

	private Map<String,String> getCompositemisMap(MobCreateCustomerSOAPRequest mobCreateCustomerSOAPRequest){
		
		/*LOAN_STRU 
		INTL_RISK  
		IFRS_PART   
		XBRLGROUP
		SECURED_B 
		SUBSECT      -  S95
		SCH_TYPE   
		HLD_FAC      */
		Map<String,String> misMap = new HashMap<String,String>();
		misMap.put("LOAN_STRU", BLANK);
		misMap.put("INTL_RISK", BLANK);
		misMap.put("IFRS_PART", BLANK);
		misMap.put("XBRLGROUP", BLANK);
		misMap.put("SECURED_B", BLANK);
		misMap.put("SUBSECT", "S95");
		misMap.put("SCH_TYPE", BLANK);
		misMap.put("HLD_FAC", BLANK);
		
		return misMap;
	}
	
	private Map<String,String> getUdfDetailsMap(MobCreateCustomerSOAPRequest mobCreateCustomerSOAPRequest){
		
		Map<String,String> udfDetailsMap = new HashMap<String,String>();
		
		/*Field name: FIRST_HEAR_ABOUT_AFRASIA
		Values: GOLF_EVENT OTHER_EVENTS  FRIEND_REFERRAL BILLBOARD_MAGZNE MAGZNE_NEWSPAPER	WEBSITE_AFRASIA	SOCIAL_MEDIA
		OTH_BANNER_VIDEO BRANCH_VISIT MOBILE_APP TV_RADIO MANAGEMNT_COMP RMS_CSAS OTHER
		Table Field name HEAR_ABOUT_AFRASIA | MOB_ACCOUNT_ADDITIONAL_DETAILS */
		MobAccountAdditionalDetail mobAccountAdditionalDetail = mobCreateCustomerSOAPRequest.getMobAccountAdditionalDetail();
		//udfDetailsMap.put("FIRST_HEAR_ABOUT_AFRASIA", mobAccountAdditionalDetail.getHearAboutAfrasia());
		
		/*Field name : AC_E_STMNT_FLG
		Value :  Y, N 		Table Field name: STMT_DELIVERY
		If value for STMT_DELIVERY is POST send N else send Y | MOB_ACCOUNT_ADDITIONAL_DETAILS*/
		
	/*	String stmtDelivery = mobAccountAdditionalDetail.getStmtDelivery();
		if( null != stmtDelivery && !stmtDelivery.isEmpty() ){
			if(stmtDelivery.equalsIgnoreCase(POST)){
				udfDetailsMap.put("AC_E_STMNT_FLG", N);
			}
			else{
				udfDetailsMap.put("AC_E_STMNT_FLG", Y);
			}
		}*/
		
			/*CRS_COUNTRY_OF_TAX_RESIDENCE_1
			CRS_COUNTRY_OF_TAX_RESIDENCE_2
			CRS_COUNTRY_OF_TAX_RESIDENCE_3
			Value:  3 digit country code
			Table: MOB_APPLICANT_ADDITIONAL_DTLS
			If INCOME_OTHER_COUNTRY_TAX then create this else no.
			COUNTRY_1 |	COUNTRY_2 |	COUNTRY_3*/
		Boolean incomeOtherCountryTax = mobCreateCustomerSOAPRequest.getMobApplicantAdditionalDtl().getIncomeOtherCountryTax();
		if(incomeOtherCountryTax){
			String country1 = mobCreateCustomerSOAPRequest.getMobApplicantAdditionalDtl().getCountry1();
			String country2 = mobCreateCustomerSOAPRequest.getMobApplicantAdditionalDtl().getCountry2();
			String country3 = mobCreateCustomerSOAPRequest.getMobApplicantAdditionalDtl().getCountry3();
			
			
			country1 = country1 != null ? country1 :BLANK;
			country2 = country2 != null ? country2 :BLANK;
			country3 = country3 != null ? country3 :BLANK;
			
			udfDetailsMap.put("CRS_COUNTRY_OF_TAX_RESIDENCE_1", country1);
			udfDetailsMap.put("CRS_COUNTRY_OF_TAX_RESIDENCE_2", country2);
			udfDetailsMap.put("CRS_COUNTRY_OF_TAX_RESIDENCE_3", country3);
		}
		
		/* CRS_TIN_1 |	CRS_TIN_2 | CRS_TIN_3
		Value:  3 digit country code
		Table: MOB_APPLICANT_ADDITIONAL_DTLS
		If INCOME_OTHER_COUNTRY_TAX then create this else no.
		TIN_1 | TIN_2 | TIN_3
		*/
		if(incomeOtherCountryTax){
			String tin1 = mobCreateCustomerSOAPRequest.getMobApplicantAdditionalDtl().getTin1();
			String tin2 = mobCreateCustomerSOAPRequest.getMobApplicantAdditionalDtl().getTin2();
			String tin3 = mobCreateCustomerSOAPRequest.getMobApplicantAdditionalDtl().getTin3();
			
			tin1 = tin1 != null ? tin1 :BLANK;
			tin2 = tin2 != null ? tin2 :BLANK;
			tin3 = tin3 != null ? tin3 :BLANK;
			
			udfDetailsMap.put("CRS_TIN_1", tin1);
			udfDetailsMap.put("CRS_TIN_2", tin2);
			udfDetailsMap.put("CRS_TIN_3", tin3);
		}
		
		
		
		return udfDetailsMap;
		
	}
	// S-Single,M-Married,D-Divorced,R-Remarried,P-Separated,E-Spouse Expired. 
	public Map<String,String> getMaritalStatus() {
		Map<String,String> maritalStatus = new HashMap<String,String>();
		maritalStatus.put("S", "Single");
		maritalStatus.put("M", "Married");
		maritalStatus.put("D", "Divorced");
		maritalStatus.put("R", "Remarried");
		maritalStatus.put("P", "Separated");
		maritalStatus.put("E", "Spouse Expired");
	return 	maritalStatus;
	}
	// F-Full-time permanent,T-Full-time temporary,U-Unemployed,
	//	S-Self Employed,P-Part-time,R-Retired-pensioned,N-Retired non-pensioned,O-Other 
	public Map<String,String> getEmploymentStatus() {
		Map<String,String> maritalStatus = new HashMap<String,String>();
		maritalStatus.put("F", "Full-time permanent");
		maritalStatus.put("T", "Full-time temporary");
		maritalStatus.put("U", "Unemployed");
		maritalStatus.put("S", "Self Employed");
		maritalStatus.put("P", "Part-time");
		maritalStatus.put("R", "Retired-pensioned");
		maritalStatus.put("N", "Retired non-pensioned");
		maritalStatus.put("O", "Other");
	return 	maritalStatus;
	}
	
	
	private	String randomString( int len ){
		   StringBuilder sb = new StringBuilder( len );
		   for( int i = 0; i < len; i++ ) 
		      sb.append( AB.charAt( rnd.nextInt(AB.length()) ) );
		   return sb.toString();
		}

	private FCUBSHEADERType getSOAPRequestHeader() {
		
		FCUBSHEADERType headerValue = new FCUBSHEADERType();
		// set source String value {  <fcub:SOURCE>?</fcub:SOURCE> => constant value, to be created for Pwc } 
		headerValue.setSOURCE(SOURCE);
		
		// set UBSCOMP enum {String} value { <fcub:UBSCOMP> FCUBS </fcub:UBSCOMP> } 
		headerValue.setUBSCOMP(UBSCOMPType.FCUBS);
		
		// set msgid String value <fcub:MSGID>?</fcub:MSGID>  - 20 char long, alphanumeric unique no Eg: EMP1a20s1f2116
		String uniqueNo = randomString(20);
		uniqueNo = uniqueNo != null ? uniqueNo : DEFAULT_MSGID ;
		headerValue.setMSGID(uniqueNo);
		
		// set correlid String value <fcub:CORRELID>?</fcub:CORRELID> - can be same as message Id | Same as MSGID
		headerValue.setCORRELID(uniqueNo);
		
		// set correlid String value  <fcub:USERID>?</fcub:USERID> - user id of compliance member who initiated the request
		//  Flex id of compliance  who created the request | Login user id | Max: 12
		headerValue.setUSERID(DEFAULT_USERID); 
		
		// set branch String value  <fcub:BRANCH>?</fcub:BRANCH> - 001 | Default value - 001
		headerValue.setBRANCH(DEFAULT_BRANCH);
		
		// set moduleid String value <fcub:MODULEID>?</fcub:MODULEID>  |  AC
		headerValue.setMODULEID(DEFAULT_MODULEID);
		
		// set service String value <fcub:SERVICE>?</fcub:SERVICE> - FCUBSAccService | FCUBSAccService
		headerValue.setSERVICE(ACC_SERVICE);
		
		// set operation String value <fcub:OPERATION>?</fcub:OPERATION> - CreateCustAcc | CreateCustAcc
		headerValue.setOPERATION(OPERATION_ACCOUNT);
		
		return headerValue;
	}
	
	private String getFullName( MobCreateCustomerSOAPRequest mobCreateCustomerSOAPRequest,int limit){
		String firstName = mobCreateCustomerSOAPRequest.getMobApplicantPersonalDetail().getFirstName();
		String middleName = mobCreateCustomerSOAPRequest.getMobApplicantPersonalDetail().getMiddleName();
		String lastName = mobCreateCustomerSOAPRequest.getMobApplicantPersonalDetail().getLastName();
		debugLog.debug("firstName: "+firstName);
		debugLog.debug("lastName: "+lastName);
		debugLog.debug("middleName: "+middleName);
		String fullName = "";
				String 	frName= firstName != null ? firstName : BLANK;
				String 	midName =	  middleName != null ? " " +middleName : BLANK ;
				String 	lstName	=  lastName != null ? " "+lastName : BLANK ;
				fullName = 	frName + midName + lstName;
		debugLog.debug("fullName: "+fullName);
		fullName = substractChar(limit, fullName);
		debugLog.debug("fullName: "+fullName);
		return fullName;
	}
	
	private String CheckNull(String data){
		
		return data != null ? data : BLANK;
	}
	
	private String substractChar(int MAX_NAME_CHAR, String inputChar) {
		
		if(inputChar == null){
			return null;
		}
		inputChar = inputChar.trim().length() > MAX_NAME_CHAR ? inputChar.trim().substring(0, MAX_NAME_CHAR) : inputChar.trim();
		return inputChar;
	}
	
	
}
