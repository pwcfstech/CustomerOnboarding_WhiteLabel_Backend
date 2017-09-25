package com.afrAsia.service.impl;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.afrAsia.dao.ComplianceDao;
import com.afrAsia.dao.jpa.ApplicationDetailsJpaDAO;
import com.afrAsia.entities.request.AccountCreationDetails;
import com.afrAsia.entities.request.MobCreateCustomerSOAPRequest;
import com.afrAsia.entities.transactions.MobAccountDetail;
import com.afrAsia.entities.transactions.MobApplCheckComments;
import com.afrAsia.entities.transactions.MobApplicantPersonalDetail;
import com.afrAsia.entities.transactions.MobRmAppRefId;
import com.afrAsia.service.AccountCreationSOAPService;
import com.afrAsia.service.KYCService;
import com.google.gson.Gson;
import com.ofss.fcubs.gw.ws.CreateAccountSOAP;
import com.ofss.fcubs.gw.ws.CreateCustomerSOAP;
import com.ofss.fcubs.gw.ws.CreateCustomerSOAPConstants;


public class AccountCreationSOAPServiceImpl implements AccountCreationSOAPService,CreateCustomerSOAPConstants {	
	ApplicationDetailsJpaDAO applicationDetailsDAO;
	ComplianceDao complianceDao;
	
	KYCService kycService;
	
	public KYCService getKycService() {
		return kycService;
	}

	public void setKycService(KYCService kycService) {
		this.kycService = kycService;
	}

	public ComplianceDao getComplianceDao() {
		return complianceDao;
	}

	public void setComplianceDao(ComplianceDao complianceDao) {
		this.complianceDao = complianceDao;
	}

	public ApplicationDetailsJpaDAO getApplicationDetailsDAO() {
		return applicationDetailsDAO;
	}

	public void setapplicationDetailsDAO(ApplicationDetailsJpaDAO applicationDetailsDAO) {
		this.applicationDetailsDAO = applicationDetailsDAO;
	}
	
	
	public Map<String,Object> createAccount(long appId, String userId, long recordId ) {
		
		System.out.println("Inside createAccount method of AccountCreeationSOAPServiceImpl");
		
		if(appId <= 0 && !(null != userId && !userId.isEmpty())){ return null;}
		
		Map<String,Object> returnValue = new HashMap<String, Object>();
		Map<String,AccountCreationDetails> accountDtlsMap = new HashMap<String, AccountCreationDetails>();
		MobAccountDetail mobAccountDetails = applicationDetailsDAO.getMobAccountDetails(appId);	
		// ==================================SET accountDtlsMap ===================================
		
		//======== INDV_APPLICANT_REF_NO ===============//
		setAccDataRefDetails(INDV_APPLICANT, accountDtlsMap, mobAccountDetails.getIndvApplicantRefNo(),appId);
		
		//======== INDV_GUARDIAN_REF_NO ===============//
		setAccDataRefDetails(INDV_GUARDIAN,accountDtlsMap, mobAccountDetails.getIndvGuardianRefNo(),appId);
			
		//======== JOINT1_APPLICANT_REF_NO ===============//
		setAccDataRefDetails(JOINT1_APPLICANT, accountDtlsMap, mobAccountDetails.getJoint1ApplicantRefNo(),appId);
		
		//======== JOINT1_GUARDIAN_REF_NO ===============//
		setAccDataRefDetails(JOINT1_GUARDIAN, accountDtlsMap, mobAccountDetails.getJoint1GuardianRefNo(),appId);
		
		//======== JOINT2_APPLICANT_REF_NO ===============//
		setAccDataRefDetails(JOINT2_APPLICANT, accountDtlsMap, mobAccountDetails.getJoint2ApplicantRefNo(),appId);
		
		//======== JOINT2_GUARDIAN_REF_NO ===============//
		setAccDataRefDetails(JOINT2_GUARDIAN, accountDtlsMap, mobAccountDetails.getJoint2GuardianRefNo(),appId);
		
		//======== JOINT3_APPLICANT_REF_NO ===============//
		setAccDataRefDetails(JOINT3_APPLICANT, accountDtlsMap, mobAccountDetails.getJoint3ApplicantRefNo(),appId);
		
		//======== JOINT3_GUARDIAN_REF_NO ===============//
		setAccDataRefDetails(JOINT3_GUARDIAN, accountDtlsMap, mobAccountDetails.getJoint3GuardianRefNo(),appId);
		
		//======== JOINT4_APPLICANT_REF_NO ===============//
		setAccDataRefDetails(JOINT4_APPLICANT,accountDtlsMap, mobAccountDetails.getJoint4ApplicantRefNo(),appId);
	
		//======== JOINT4_GUARDIAN_REF_NO ===============//
		setAccDataRefDetails(JOINT4_GUARDIAN, accountDtlsMap, mobAccountDetails.getJoint4GuardianRefNo(),appId);
				
		//======== JOINT5_APPLICANT_REF_NO ===============//
		setAccDataRefDetails(JOINT5_APPLICANT,accountDtlsMap, mobAccountDetails.getJoint5ApplicantRefNo(),appId);
	
		//======== JOINT5_GUARDIAN_REF_NO ===============//
		setAccDataRefDetails(JOINT5_GUARDIAN, accountDtlsMap, mobAccountDetails.getJoint5GuardianRefNo(),appId);		
	 //===========================================================================	
		
	 for( String key : accountDtlsMap.keySet()){
			
			AccountCreationDetails accountCreationDetails = accountDtlsMap.get(key);
			
			if( null == accountCreationDetails){
				continue;
			}
			
			// if cif exist
			if( accountCreationDetails.isCifExist()){
				String cif = accountCreationDetails.getCif();
				
				if( null != cif && !cif.isEmpty()){
					 continue;
				}
				else{
					cif = accountCreationDetails.getMobCreateCustomerSOAPRequest().getMobApplicantPersonalDetail().getCustCif();
					if(null != cif && !cif.isEmpty()){
						continue;
					}
				}
			}
			
			// for new cif creation
			CreateCustomerSOAP createCustomerStub = new CreateCustomerSOAP();
			try {
				// if minor account
				if(accountCreationDetails.isMinor()){
					String guardianName = accountCreationDetails.getGuardianName();
					AccountCreationDetails accountCreationDetailsGrdn = accountDtlsMap.get(guardianName);
					
					// if no data for guardian
					if( null == accountCreationDetailsGrdn){
						System.out.println("No data found for guardian :"+ guardianName +" of junior Applicant :"+ key);
					}
					// create guardian  first
					String grdnCifNo = null;
					Map<String,Object> responseMap = null;
					if(!accountCreationDetailsGrdn.isCifExist()){
					System.out.println("guardian create start"+accountCreationDetails.isCifExist());
					 responseMap = createCustomerStub.createAfrAsiaCustomer(userId,accountCreationDetailsGrdn.getMobCreateCustomerSOAPRequest() , null);
					System.out.println("guardian create end");
					/*Map<String,Object> responseMap = new HashMap<String, Object>();
					responseMap.put("MSGSTAT", "SUCCESS");
					responseMap.put("CUSTNO", "0001");
					responseMap.put("ERROR", BLANK);
					responseMap.put("WARNING", BLANK);*/
					
					
					if( null != responseMap && responseMap.get(MSGSTAT).toString().equals(SUCCESS)){
						grdnCifNo = responseMap.get(CUSTNO) != null ? responseMap.get(CUSTNO).toString():BLANK;
					}
					else{
						accountDtlsMap.get(guardianName).setSoapResError(responseMap.get(ERROR));
						updateErrorTable(accountDtlsMap, null, appId, recordId);
					}
				}
				else{
					grdnCifNo = accountCreationDetailsGrdn.getCif();
					}
					if( null != grdnCifNo && !grdnCifNo.isEmpty()){
					  if(!accountCreationDetailsGrdn.isCifExist()){
							System.out.println(" create customer for guardian  [ "+accountDtlsMap.get(guardianName).getRefNo()+" ] success. Got grdnCifNo =" + grdnCifNo);
							// update grdnCifNo in DB also
							MobApplicantPersonalDetail mobApplicantPersonalDetailGrdn = accountCreationDetailsGrdn.getMobCreateCustomerSOAPRequest().getMobApplicantPersonalDetail();
							mobApplicantPersonalDetailGrdn.setCustCif(grdnCifNo);
							applicationDetailsDAO.updateMobApplicantPersonalDetails(mobApplicantPersonalDetailGrdn);
							// updating the map
							accountDtlsMap.get(guardianName).setCif(grdnCifNo);
							accountDtlsMap.get(guardianName).setCifExist(true);
							accountDtlsMap.get(guardianName).setSoapResWarning(responseMap.get(WARNING));
						}
						// on success create junior account
						Map<String,Object> jnrAccntResponseMap  = createCustomerStub.createAfrAsiaCustomer(userId,accountCreationDetails.getMobCreateCustomerSOAPRequest() , accountCreationDetailsGrdn.getMobCreateCustomerSOAPRequest());	
						/*Map<String,Object> jnrAccntResponseMap = new HashMap<String, Object>();
						jnrAccntResponseMap.put("MSGSTAT", "SUCCESS");
						jnrAccntResponseMap.put("CUSTNO", "0002");
						jnrAccntResponseMap.put("ERROR", BLANK);
						jnrAccntResponseMap.put("WARNING", BLANK);*/
						
						String jnrAccntCifNo = null;
						if( null != jnrAccntResponseMap && jnrAccntResponseMap.get(MSGSTAT).toString().equals(SUCCESS)){
							jnrAccntCifNo = jnrAccntResponseMap.get(CUSTNO) != null ? jnrAccntResponseMap.get(CUSTNO).toString():BLANK;
						}
						else{
							accountDtlsMap.get(key).setSoapResError(jnrAccntResponseMap.get(ERROR));
							updateErrorTable(accountDtlsMap, null, appId, recordId);
						}
						
						if( null != jnrAccntCifNo && !jnrAccntCifNo.isEmpty()){
							System.out.println(" create customer for junior  [ "+accountDtlsMap.get(key).getRefNo()+" ]  success. Got jnrAccntCifNo =" + jnrAccntCifNo);
							// update jnrAccntCifNo in DB also
							MobApplicantPersonalDetail mobApplicantPersonalDetailJunior = accountCreationDetails.getMobCreateCustomerSOAPRequest().getMobApplicantPersonalDetail();
							mobApplicantPersonalDetailJunior.setCustCif(jnrAccntCifNo);
							applicationDetailsDAO.updateMobApplicantPersonalDetails(mobApplicantPersonalDetailJunior);
							// updating the map
							accountDtlsMap.get(key).setCif(jnrAccntCifNo);
							accountDtlsMap.get(key).setCifExist(true);
							accountDtlsMap.get(key).setSoapResWarning(responseMap.get(WARNING));
						}
						else{
							System.out.println(" create customer for junior  [ "+accountDtlsMap.get(key).getRefNo()+" ]  failed. Got jnrAccntCifNo =" + jnrAccntCifNo);
						}
					}
					else{
						System.out.println(" create customer for guardian  [ "+accountDtlsMap.get(guardianName).getRefNo()+" ]  failed. Got grdnCifNo =" + grdnCifNo);
					}
				}
				else{
					Map<String,Object> accntResponseMap = createCustomerStub.createAfrAsiaCustomer(userId,accountCreationDetails.getMobCreateCustomerSOAPRequest() , null);
					/*Map<String,Object> accntResponseMap = new HashMap<String, Object>();
					accntResponseMap.put("MSGSTAT", "SUCCESS");
					accntResponseMap.put("CUSTNO", "0003");
					accntResponseMap.put("ERROR", BLANK);
					accntResponseMap.put("WARNING", BLANK);*/

					String accntCifNo = null;
					
					if( null != accntResponseMap && accntResponseMap.get(MSGSTAT).toString().equals(SUCCESS)){
						
						accntCifNo = accntResponseMap.get(CUSTNO) != null ? accntResponseMap.get(CUSTNO).toString():BLANK;
					}
					else{
						accountDtlsMap.get(key).setSoapResError(accntResponseMap.get(ERROR));
						updateErrorTable(accountDtlsMap, null, appId, recordId);
					}
					
					if( null != accntCifNo && !accntCifNo.isEmpty()){
						System.out.println(" create customer for joint/single applicant [ "+ accountDtlsMap.get(key).getRefNo()+" ]( not junior ) success. Got accntCifNo =" + accntCifNo);
						// update DB
						MobApplicantPersonalDetail mobApplicantPersonalDetail = accountCreationDetails.getMobCreateCustomerSOAPRequest().getMobApplicantPersonalDetail();
						mobApplicantPersonalDetail.setCustCif(accntCifNo);
						applicationDetailsDAO.updateMobApplicantPersonalDetails(mobApplicantPersonalDetail);
						// updating the map
						accountDtlsMap.get(key).setCif(accntCifNo);
						accountDtlsMap.get(key).setCifExist(true);
						accountDtlsMap.get(key).setSoapResWarning(accntResponseMap.get(WARNING));
					}
					else{
						System.out.println(" create customer for joint/single applicant [ "+accountDtlsMap.get(key).getRefNo()+" ]( not junior ) failure. Got accntCifNo =" + accntCifNo);
					}
				 }
				} catch (Exception e) { //DatatypeConfigurationException
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
		}
	
		// create account call
		// check all customer cif exist
		boolean cifExistForAll = isCifExistForAll(accountDtlsMap);
		Map<String, Object> createAfrAsiaAccount = null;
		boolean accountExists = false;
		MobRmAppRefId mobRmAppRefId = accountDtlsMap.get(INDV_APPLICANT).getMobCreateCustomerSOAPRequest().getMobRmAppRefId();
	   if(cifExistForAll){
		   System.out.println("Create account call starting");
		   if(null != mobRmAppRefId && null != mobRmAppRefId.getAccountNumber() && !mobRmAppRefId.getAccountNumber().isEmpty()){
			   System.out.println("Create account Service not called User Account Exists");
			   System.out.println("User account number is : " + mobRmAppRefId.getAccountNumber());
			   accountExists = true;
		   }
		   else{
			CreateAccountSOAP createAccountSOAP = new CreateAccountSOAP();
			try {
				// createAfrAsiaAccount = createAccountSOAP.createAfrAsiaAccount(userId, accountDtlsMap);
				createAfrAsiaAccount = new HashMap<String, Object>();
				createAfrAsiaAccount.put(ACCNO, "00009");
				createAfrAsiaAccount.put(MSGSTAT, SUCCESS); 
				 
				 String accNo = null;
				 
				 if( null != createAfrAsiaAccount && createAfrAsiaAccount.get(MSGSTAT).toString().equals(SUCCESS)){
					    accNo = createAfrAsiaAccount.get(ACCNO) != null ? createAfrAsiaAccount.get(ACCNO).toString():BLANK;
					}
				 else{
					 // error already set in createAfrAsiaAccount method
					 updateErrorTable(accountDtlsMap, createAfrAsiaAccount, appId, recordId);
				 }
									 
				if( null != accNo && !accNo.isEmpty()){
				
				     System.out.println("Create account call for AppID [ "+appId +" ] end with success. Got Account number :"+accNo);
				     mobRmAppRefId.setAccountNumber(accNo);
				     applicationDetailsDAO.updateMobRmAppRefId(mobRmAppRefId);
				     accountExists = true;
				}
				else{
					System.out.println("Create account call for AppID [ "+appId +" ] end with failure. Got Account number :"+accNo);
				}
				
			} catch (Exception e) {// DatatypeConfigurationException
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	     }
		   System.out.println("Create account call end.");
	    }
	   else{
		   System.out.println("Can not initiate Create account call All the cif not exist.");
	   }
	   
	   
	  //===============if account exists or created successfully == upload kyc doc movement ====================//
	   boolean kycUploadStatus = false;
	   if(accountExists){
		   // 11. If document successfully uploaded, document path should be updated in 
		   // MOB_APPLICANT_KYC_DOCUMENTS table against respective applicant Id and Doc Id
		   
		   //-----------------------------
		   // KYCServiceImpl implements KYCService
		   for( String key : accountDtlsMap.keySet()){
			   AccountCreationDetails accountCreationDetails = accountDtlsMap.get(key);
				
				if( null == accountCreationDetails){
					continue;
				}
				// if cif exist
				if( accountCreationDetails.isCifExist()){
					String cif = accountCreationDetails.getCif();
					long lonfCif = 0;
					if(null != cif && !cif.isEmpty()){
						try{
							lonfCif = Long.parseLong(cif);
						}
						catch(NumberFormatException nfe){
							kycUploadStatus = false;
							System.out.println("Found number format exception for cif "+nfe.getMessage());
							lonfCif = 0;
						}
					}
					
					long applicantId = accountCreationDetails.getRefNo();
					try {
						kycService.copyKYCFiles(appId, applicantId, lonfCif, recordId, userId);
						// if  copyKYCFiles Success
						kycUploadStatus = true;
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				else{
					kycUploadStatus = false;
				}
		   }
		   //-----------------------------
		   
		// 14. In case of error, following fields should be populated in the FLEX_ERROR_CODE and 
		  //  FLEX_ERROR_MESSAGE field. FLEX_ERROR_CODE should have value "UploadKYC" and FLEX_ERROR_MESSAGE 
		  // should be "Error in uploading KYC".
		   if(!kycUploadStatus){
			   MobApplCheckComments mobApplCheckComment = new MobApplCheckComments();
			   mobApplCheckComment.setId(appId);
			   mobApplCheckComment.setRecordId(recordId);
			   mobApplCheckComment.setFlexErrorCode("UploadKYC");
			   mobApplCheckComment.setFlexErrorMessage("Error in uploading KYC");
			   complianceDao.updateErrorMessage(mobApplCheckComment);
		   }
	   }
	   
	   // 10. If all DMS documents are successfully uploaded in the respective folders, 
	   // account status should be updated to "ACCOUNT_CREATED" in MOB_APP_REF_ID table against STATUS field.
	   // 12. If any of the above steps fail i.e createCustomer, createAccount, uploadKYC the account 
	   // status cannot be changed to "ACCOUNT CREATED", and the status will remain "UNDER PROCESSING".
	   if(kycUploadStatus){
		   mobRmAppRefId.setAppStatus(ACCOUNT_CREATED);
	   }
	   else{
		   mobRmAppRefId.setAppStatus(UNDER_PROCESSING);
	   }
	   applicationDetailsDAO.updateMobRmAppRefId(mobRmAppRefId);
	 //==================================================================//
	   
	   // setting return data 
	   returnValue.put(CRT_CUST, accountDtlsMap);
	   returnValue.put(CRT_ACC, createAfrAsiaAccount);
	   
	   System.out.println("end of createAccount method of AccountCreeationSOAPServiceImpl");
		
	  return returnValue;
	}

	private void updateErrorTable(Map<String,AccountCreationDetails> accountDtlsMap, Map<String,Object> createAfrAsiaAccount,long appId, long recordId){
		System.out.println("start AccountCreationSOAPServiceImpl::updateErrorTable() method ");
		System.out.println("AccountCreationSOAPServiceImpl::updateErrorTable() ==>  appId: " +appId + "recordId: "+ recordId);
		Gson gson = new Gson(); 
		String error ="";
		String errorCode="CreateAccount";
		 for( String key : accountDtlsMap.keySet()){
				AccountCreationDetails accountCreationDetails = accountDtlsMap.get(key);
				System.out.println("key"+ key);
				if( null != accountCreationDetails){
				Object soapResError = accountCreationDetails.getSoapResError();
				if( null != soapResError){
					List<com.ofss.fcubs.service.fcubscustomerservice.ERRORType> errType = null;
					errType = (List<com.ofss.fcubs.service.fcubscustomerservice.ERRORType>) soapResError;
					error = (error + "||" + accountCreationDetails.getRefNo() + " : ");
					error = error + gson.toJson(errType);
					errorCode="CreateCustomer";
					
				}
			}
		 }
	  if( null != createAfrAsiaAccount ){
			Object errorObject = createAfrAsiaAccount.get(ERROR);
			if( null != errorObject ){
				List<com.ofss.fcubs.service.fcubsaccservice.ERRORType> errType = null;
				errType = (List<com.ofss.fcubs.service.fcubsaccservice.ERRORType>) errorObject;
				error = (error + "|| CREATE ACCOUNT WS-CALL ERROR : ");
				error = error + gson.toJson(errType);
			}
			else{
				System.out.println(errorObject.toString());
			}
		}
	  
	  // update the error table 
	  System.out.println("In updateErrorTable errorCode : "+ errorCode + "\n error:"+error);
	   MobApplCheckComments mobApplCheckComment = new MobApplCheckComments();
	   mobApplCheckComment.setId(appId);
	   mobApplCheckComment.setRecordId(recordId);
	   mobApplCheckComment.setFlexErrorCode(errorCode);
	   mobApplCheckComment.setFlexErrorMessage(error);
	   complianceDao.updateErrorMessage(mobApplCheckComment);
	   
	   System.out.println("end AccountCreationSOAPServiceImpl::updateErrorTable() method ");
	}
	
	private boolean isCifExistForAll(Map<String, AccountCreationDetails> accountDtlsMap) {
		boolean cifExistForAll = false;
		for( String key : accountDtlsMap.keySet()){
			
			AccountCreationDetails accountCreationDetails = accountDtlsMap.get(key);
			
			if( null == accountCreationDetails){
				continue;
			}
			
			// if cif exist
			if( accountCreationDetails.isCifExist()){
				String cif = accountCreationDetails.getCif();
				
				if( null != cif && !cif.isEmpty()){
					 cifExistForAll= true;
					 continue;
				}
				else{
					cif = accountCreationDetails.getMobCreateCustomerSOAPRequest().getMobApplicantPersonalDetail().getCustCif();
					if(null != cif && !cif.isEmpty()){
						cifExistForAll = true;
						continue;
					}
					else{
						cifExistForAll = false;
					}
				}
			}
			else{
				cifExistForAll = false;
			}
	   }
	   System.out.println("Got cifExistForAll value : "+cifExistForAll);
		return cifExistForAll;
	}

	private void setAccDataRefDetails(String key,Map<String, AccountCreationDetails> accountDtlsMap, Long mobAccountRefNo, Long appId) {
		AccountCreationDetails accountCreationDetails;
		Long refNo;
		refNo = mobAccountRefNo;
		accountCreationDetails = new AccountCreationDetails();
		if( null != refNo && refNo !=0){
			accountCreationDetails.setRefNo(refNo);
			accountCreationDetails.setRefNoOwner(key);
			
			MobApplicantPersonalDetail mobApplicantPersonalDetails = applicationDetailsDAO.getMobApplicantPersonalDetails(appId, refNo);
			
				if(mobApplicantPersonalDetails.getCustCif() != null && !mobApplicantPersonalDetails.getCustCif().trim().isEmpty()){
					// cif already exists
					System.out.println("cif already exists");
					// set cif
					accountCreationDetails.setCif(mobApplicantPersonalDetails.getCustCif());
					accountCreationDetails.setCifExist(true);
				}
				else{
					System.out.println("new customer no cif found");
				}
				 // get and set the data in map
					MobCreateCustomerSOAPRequest mobCreateCustomerSOAPRequest = new MobCreateCustomerSOAPRequest();
					
					mobCreateCustomerSOAPRequest.setMobRmAppRefId(applicationDetailsDAO.getApplicationDetails(appId));
					mobCreateCustomerSOAPRequest.setMobAccountDetail(applicationDetailsDAO.getMobAccountDetails(appId));
					mobCreateCustomerSOAPRequest.setMobAccountAdditionalDetail(applicationDetailsDAO.getMobAccountAdditionalDetails(appId));
					
					mobCreateCustomerSOAPRequest.setMobApplicantPersonalDetail(mobApplicantPersonalDetails);
					mobCreateCustomerSOAPRequest.setMobApplicantCommDetail(applicationDetailsDAO.getMobApplicantCommDetails(appId, refNo));
					mobCreateCustomerSOAPRequest.setMobApplicantAdditionalDtl(applicationDetailsDAO.getMobApplicantAdditionalDtl(appId, refNo));
					mobCreateCustomerSOAPRequest.setMobApplicantEmploymentDtl(applicationDetailsDAO.getMobApplicantEmploymentDtl(appId, refNo));
					mobCreateCustomerSOAPRequest.setMobAccountAdditionalDetail(applicationDetailsDAO.getMobAccountAdditionalDetails(appId));
					
					accountCreationDetails.setMobCreateCustomerSOAPRequest(mobCreateCustomerSOAPRequest);
				
				
				// set minor flag
				Boolean isMinor = mobApplicantPersonalDetails.getIsMinor();
				
				accountCreationDetails.setMinor(isMinor == null ? false : isMinor);
				
				// set GUARDIAN Name i.e the map key
				String guardianName = key.split("_")[0]+ GUARDIAN ;
				accountCreationDetails.setGuardianName(guardianName);
				
			accountDtlsMap.put(accountCreationDetails.getRefNoOwner(),accountCreationDetails);
		}
		else{
			accountDtlsMap.put(key,null);
		}
	}

	public void createCustomerSOAPRequest(long appId, String userId) {
		// TODO Auto-generated method stub
		
	}

	
	}
