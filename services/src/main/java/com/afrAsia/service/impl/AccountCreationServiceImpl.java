package com.afrAsia.service.impl;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.persistence.NoResultException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;

import com.afrAsia.customexception.IdNotFoundException;
import com.afrAsia.dao.RMDetailsDao;
import com.afrAsia.dao.jpa.AccountCreateJpaDao;
import com.afrAsia.dao.jpa.ApplicationDetailsJpaDAO;
import com.afrAsia.dao.jpa.impl.AccountCreateJpaDaoImpl;
import com.afrAsia.entities.jpa.MsgHeader;
import com.afrAsia.entities.jpa.MsgHeader.Error;
import com.afrAsia.entities.masters.RMDetails;
import com.afrAsia.entities.request.AccountCreationRequest;
import com.afrAsia.entities.request.AccountCreationRequest.AccountDetails;
import com.afrAsia.entities.request.ApplicantDetails;
import com.afrAsia.entities.request.JointApplicants;
import com.afrAsia.entities.request.NomineeInfo;
import com.afrAsia.entities.response.AccountCreateResponse;
import com.afrAsia.entities.response.AccountCreateResponse.Data;
import com.afrAsia.entities.response.AccountCreateResponse.Data.JointApplicantsData;
import com.afrAsia.entities.transactions.HistTableCompositePK;
import com.afrAsia.entities.transactions.MainTableCompositePK;
import com.afrAsia.entities.transactions.MobAccountAdditionalDetail;
import com.afrAsia.entities.transactions.MobAccountAddnDetailsHist;
import com.afrAsia.entities.transactions.MobAccountDetail;
import com.afrAsia.entities.transactions.MobAccountDetailsHist;
import com.afrAsia.entities.transactions.MobAppRefRecordId;
import com.afrAsia.entities.transactions.MobApplAdditionalDtlsHist;
import com.afrAsia.entities.transactions.MobApplCommDetailsHist;
import com.afrAsia.entities.transactions.MobApplEmploymentDtlsHist;
import com.afrAsia.entities.transactions.MobApplPersonalDetailsHist;
import com.afrAsia.entities.transactions.MobApplicantAdditionalDtl;
import com.afrAsia.entities.transactions.MobApplicantCommDetail;
import com.afrAsia.entities.transactions.MobApplicantEmploymentDtl;
import com.afrAsia.entities.transactions.MobApplicantPersonalDetail;
import com.afrAsia.entities.transactions.MobApplicantRecordId;
import com.afrAsia.entities.transactions.MobApplicantRecordIdHist;
import com.afrAsia.entities.transactions.MobRmAppRefId;
import com.afrAsia.service.AccountCreationService;

public class AccountCreationServiceImpl implements AccountCreationService {
	
	private static final Logger logger = LoggerFactory.getLogger(AccountCreationServiceImpl.class);

	private AccountCreateJpaDao accountCreateDao = new AccountCreateJpaDaoImpl();

	private ApplicationDetailsJpaDAO applicationDetailsDAO;
	
	private RMDetailsDao rmDetailsDAO;

	public RMDetailsDao getRmDetailsDAO() {
		return rmDetailsDAO;
	}

	public void setRmDetailsDAO(RMDetailsDao rmDetailsDAO) {
		this.rmDetailsDAO = rmDetailsDAO;
	}

	public AccountCreateJpaDao getAccountCreateDao() {
		return accountCreateDao;
	}

	public void setAccountCreateDao(AccountCreateJpaDao accountCreateDao) {
		this.accountCreateDao = accountCreateDao;
	}

	public ApplicationDetailsJpaDAO getApplicationDetailsDAO() {
		return applicationDetailsDAO;
	}

	public void setApplicationDetailsDAO(ApplicationDetailsJpaDAO applicationDetailsDAO) {
		this.applicationDetailsDAO = applicationDetailsDAO;
	}

	@Override
	public String toString() {
		return "AccountCreationServiceImpl [accountCreateDao=" + accountCreateDao + ", applicationDetailsDAO="
				+ applicationDetailsDAO + "]";
	}

	@Transactional(readOnly = false, rollbackFor = {Exception.class})
	public AccountCreateResponse createAccount(AccountCreationRequest accountCreationRequest) {

		// Get app reference number from create request	

		AccountCreateResponse accountCreateResponse=new AccountCreateResponse();

		String rmUserId=accountCreationRequest.getData().getRmId();

		String rmUserIdFromDB=null;
		try{			
			rmUserIdFromDB= accountCreateDao.getRMuserId(rmUserId);			
			if(rmUserIdFromDB==null){
				logger.error("############ Provided RM user id is not present, please pass proper value : ");
				throw new IdNotFoundException("Provided RM user id is not present, please pass proper value");
			}

		}  
		catch(IdNotFoundException exceptionMessage){
			logger.error("############ Provided RM user id is not present, please pass proper value ");
			MsgHeader msgHdr = new MsgHeader();
			Error err = new MsgHeader().new Error();
			err.setRsn("Provided RM user id is not present, please pass proper value");
			err.setCd("404");
			err.setCustomCode("IdNotFoundException");
			msgHdr.setError(err);
			accountCreateResponse.setMsgHeader(msgHdr);
			return accountCreateResponse;
		}	
		catch(NoResultException excpMessage){
			logger.error("############ Provided RM user id is not present, please pass proper value ");
			MsgHeader msgHdr = new MsgHeader();
			Error err = new MsgHeader().new Error();
			err.setRsn("Provided RM user id is not present, please pass proper value");
			err.setCd("404");
			err.setCustomCode("NoResultException");
			msgHdr.setError(err);
			accountCreateResponse.setMsgHeader(msgHdr);
			return accountCreateResponse;
		}

		AccountCreateResponse accountCreationResponse = new AccountCreateResponse();
		Data data= new AccountCreateResponse().new Data();
		List<JointApplicantsData> jointApplicants = new ArrayList<JointApplicantsData>(); 


		// Create Application Reference id against Rm id
		MobRmAppRefId mobRmAppRefId = createApplicationReferenceId(accountCreationRequest);
		Long appRefNo = mobRmAppRefId.getId();
		data.setRefNo(appRefNo);
		logger.info("############ Created Application Reference id against Rm "+mobRmAppRefId.toString());

		// Create a record id for the application reference id.
		MobAppRefRecordId mobAppRefRecordId = createRecordIdForApplication(accountCreationRequest,appRefNo);
		Long recordId = mobAppRefRecordId.getRecordId(); 
		data.setRecordId(recordId);
		logger.info("############ Created a record id for the application reference "+mobAppRefRecordId.toString());

		//Create applicant id
		ApplicantDetails primaryApplicant = accountCreationRequest.getData().getPrimaryApplicantDetail();
		MobApplicantRecordId mobApplicantPrimary = createApplicant(accountCreationRequest, primaryApplicant, appRefNo, recordId, "Primary");
		logger.info("############ Created primary applicant "+primaryApplicant.toString());
		
		data.setPrimaryApplicantRefNo(mobApplicantPrimary.getApplicantId());

		//Create Guardian
		MobApplicantRecordId mobGuardianPrimary = null;
		ApplicantDetails guardianPrimary = accountCreationRequest.getData().getGuardianDetail();
		if(guardianPrimary != null && guardianPrimary.getFirstName()!=null && !guardianPrimary.getFirstName().isEmpty()){
			mobGuardianPrimary = createApplicant(accountCreationRequest, guardianPrimary, appRefNo, recordId, "Guardian");
			data.setGuardianRefNo(mobGuardianPrimary.getApplicantId());
			logger.info("############ Created guardian primary applicant "+guardianPrimary.toString());
		}


		//Create Joint holders
		List<JointApplicants> jointHolders = accountCreationRequest.getData().getJointApplicants();
		MobApplicantRecordId[] mobJoint = new MobApplicantRecordId[5];
		MobApplicantRecordId[] mobGuardianJoint = new MobApplicantRecordId[5];

		int i = 0;

		for (JointApplicants jointApplicantInfo : jointHolders){

			JointApplicantsData applicantRefNo = new AccountCreateResponse().new Data().new JointApplicantsData();

			ApplicantDetails jointApplicant = jointApplicantInfo.getJointApplicantDetail();
			if(jointApplicant != null){
				mobJoint[i] = createApplicant(accountCreationRequest, jointApplicant, appRefNo, recordId, "Joint");
				applicantRefNo.setJointAppRefNo(mobJoint[i].getApplicantId());
				logger.info("############ Created jointApplicant applicant  "+jointApplicant.toString());
			}
			ApplicantDetails guardianJoint = jointApplicantInfo.getGuardianDetail();
			if(guardianJoint != null){
				mobGuardianJoint[i] = createApplicant(accountCreationRequest, guardianJoint, appRefNo, recordId, "Guardian");
				applicantRefNo.setGuardianRefNo(mobGuardianJoint[i].getApplicantId());
				logger.info("############ Created joint Guardian Applicant applicant  "+guardianJoint.toString());
			}
			else {
				mobGuardianJoint[i] = null;
			}
			i++;
			jointApplicants.add(applicantRefNo);
		}

		//Create Account
		AccountDetails accountDetails = accountCreationRequest.getData().getAccountDetails();
		enterAccountDetails(accountCreationRequest,appRefNo, recordId, mobApplicantPrimary, mobGuardianPrimary, mobJoint, mobGuardianJoint, accountDetails);
		logger.info("############ accountDetails is : "+accountDetails.toString());
		
		//Trigger email and sms to customer


		//Send application reference id to frontend
		data.setJointApplicants(jointApplicants);
		//data.setRefNo(mobRmAppRefId.getId());
		accountCreationResponse.setData(data);
		logger.info("############ accountCreationResponse is : "+accountCreationResponse.toString());
		return accountCreationResponse;
	}

	@Transactional(readOnly = false, rollbackFor = {Exception.class})
	public void enterAccountDetails(AccountCreationRequest accountCreationRequest ,long appRefNo, long recordId, MobApplicantRecordId mobApplicantPrimary, MobApplicantRecordId mobGuardianPrimary, MobApplicantRecordId[] mobJoint, MobApplicantRecordId[] mobGuardianJoint, AccountDetails accountDetails)
	{

		//System.out.println("Account Details::" + accountDetails);

		MobAccountDetail mobAccountDetail = new MobAccountDetail();
		MobAccountAdditionalDetail mobAccountAdditionalDetail = new MobAccountAdditionalDetail();

		mobAccountDetail.setId(appRefNo);
		mobAccountDetail.setRecordId(recordId);
		mobAccountDetail.setAccountType(accountDetails.getAccount());
		mobAccountDetail.setAccountCategory(accountDetails.getAccountType());
		mobAccountDetail.setMop(accountDetails.getMop());
		mobAccountDetail.setIndvApplicantRefNo(mobApplicantPrimary.getApplicantId());
		if(mobGuardianPrimary != null){
			mobAccountDetail.setIndvGuardianRefNo(mobGuardianPrimary.getApplicantId());
		}
		mobAccountDetail.setCreatedBy(accountCreationRequest.getData().getRmId());
		mobAccountDetail.setModifiedBy(accountCreationRequest.getData().getRmId());
		mobAccountDetail.setCreatedDate(new Date());
		mobAccountDetail.setModifiedDate(new Date());
		//System.out.println("Mob Joint 0" + mobJoint[0]);
		if(mobJoint[0] != null)
			mobAccountDetail.setJoint1ApplicantRefNo(mobJoint[0].getApplicantId());
		if(mobGuardianJoint[0] != null)
			mobAccountDetail.setJoint1GuardianRefNo(mobGuardianJoint[0].getApplicantId());
		if(mobJoint[1] != null)
			mobAccountDetail.setJoint2ApplicantRefNo(mobJoint[1].getApplicantId());
		if(mobGuardianJoint[1] != null)
			mobAccountDetail.setJoint2GuardianRefNo(mobGuardianJoint[1].getApplicantId());
		if(mobJoint[2] != null)
			mobAccountDetail.setJoint3ApplicantRefNo(mobJoint[2].getApplicantId());
		if(mobGuardianJoint[2] != null)
			mobAccountDetail.setJoint3GuardianRefNo(mobGuardianJoint[2].getApplicantId());
		if(mobJoint[3] != null)
			mobAccountDetail.setJoint4ApplicantRefNo(mobJoint[3].getApplicantId());
		if(mobGuardianJoint[3] != null)
			mobAccountDetail.setJoint4GuardianRefNo(mobGuardianJoint[3].getApplicantId());
		if(mobJoint[4] != null)
			mobAccountDetail.setJoint5ApplicantRefNo(mobJoint[4].getApplicantId());
		if(mobGuardianJoint[4] != null)
			mobAccountDetail.setJoint5GuardianRefNo(mobGuardianJoint[4].getApplicantId());
		
		//to be done in update also
		mobAccountDetail.setMinNoSignatures(accountDetails.getMinNoSignatures());
		mobAccountDetail.setOperatingInst(accountDetails.getOperatingInst());
		//to be done in update also

		mobAccountDetail.setRelationshipMinor1(null);
		mobAccountDetail.setPowerAttnGovCountry1(null);
		mobAccountDetail.setPowerAttnIssueDate1(null);
		mobAccountDetail.setPowerAttnUs1(false);
		mobAccountDetail.setMop1(null);
		mobAccountDetail.setMopInstruction1(null);

		mobAccountDetail.setRelationshipMinor2(null);
		mobAccountDetail.setPowerAttnGovCountry2(null);
		mobAccountDetail.setPowerAttnIssueDate2(null);
		mobAccountDetail.setPowerAttnUs2(false);
		mobAccountDetail.setMop2(null);
		mobAccountDetail.setMopInstruction2(null);

		mobAccountDetail.setRelationshipMinor3(null);
		mobAccountDetail.setPowerAttnGovCountry3(null);
		mobAccountDetail.setPowerAttnIssueDate3(null);
		mobAccountDetail.setPowerAttnUs3(false);
		mobAccountDetail.setMop3(null);
		mobAccountDetail.setMopInstruction3(null);

		mobAccountDetail.setRelationshipMinor4(null);
		mobAccountDetail.setPowerAttnGovCountry4(null);
		mobAccountDetail.setPowerAttnIssueDate4(null);
		mobAccountDetail.setPowerAttnUs4(false);
		mobAccountDetail.setMop4(null);
		mobAccountDetail.setMopInstruction4(null);

		mobAccountDetail.setRelationshipMinor5(null);
		mobAccountDetail.setPowerAttnGovCountry5(null);
		mobAccountDetail.setPowerAttnIssueDate5(null);
		mobAccountDetail.setPowerAttnUs5(false);
		mobAccountDetail.setMop5(null);
		mobAccountDetail.setMopInstruction5(null);
		logger.info("############ mobAccountDetail is : "+mobAccountDetail.toString());

		List<JointApplicants> jointHolders = accountCreationRequest.getData().getJointApplicants();		

		int i = 0;
		for (JointApplicants jointApplicantInfo : jointHolders){

			//			if(i == 0){
			//				mobAccountDetail.setRelationshipMinor1(jointApplicantInfo.getJointApplicantDetail().getRelationshipMinor());
			//				mobAccountDetail.setPowerAttnGovCountry1(jointApplicantInfo.getJointApplicantDetail().getPowerAttnGoverningCountry());
			//				mobAccountDetail.setPowerAttnIssueDate1(jointApplicantInfo.getJointApplicantDetail().getPowerAttnIssueDate());
			//				mobAccountDetail.setPowerAttnUs1(jointApplicantInfo.getJointApplicantDetail().getPowerAttnGivenToUSPerson());
			//				mobAccountDetail.setMop1(jointApplicantInfo.getJointApplicantDetail().getMop());
			//				mobAccountDetail.setMopInstruction1(jointApplicantInfo.getJointApplicantDetail().getMopInstruction());
			//			}
			//			if(i == 1){
			//				mobAccountDetail.setRelationshipMinor2(jointApplicantInfo.getJointApplicantDetail().getRelationshipMinor());
			//				mobAccountDetail.setPowerAttnGovCountry2(jointApplicantInfo.getJointApplicantDetail().getPowerAttnGoverningCountry());
			//				mobAccountDetail.setPowerAttnIssueDate2(jointApplicantInfo.getJointApplicantDetail().getPowerAttnIssueDate());
			//				mobAccountDetail.setPowerAttnUs2(jointApplicantInfo.getJointApplicantDetail().getPowerAttnGivenToUSPerson());
			//				mobAccountDetail.setMop2(jointApplicantInfo.getJointApplicantDetail().getMop());
			//				mobAccountDetail.setMopInstruction2(jointApplicantInfo.getJointApplicantDetail().getMopInstruction());
			//			}
			//			if(i == 2){
			//				mobAccountDetail.setRelationshipMinor3(jointApplicantInfo.getJointApplicantDetail().getRelationshipMinor());
			//				mobAccountDetail.setPowerAttnGovCountry3(jointApplicantInfo.getJointApplicantDetail().getPowerAttnGoverningCountry());
			//				mobAccountDetail.setPowerAttnIssueDate3(jointApplicantInfo.getJointApplicantDetail().getPowerAttnIssueDate());
			//				mobAccountDetail.setPowerAttnUs3(jointApplicantInfo.getJointApplicantDetail().getPowerAttnGivenToUSPerson());
			//				mobAccountDetail.setMop3(jointApplicantInfo.getJointApplicantDetail().getMop());
			//				mobAccountDetail.setMopInstruction3(jointApplicantInfo.getJointApplicantDetail().getMopInstruction());
			//			}
			//			if(i == 3){
			//				mobAccountDetail.setRelationshipMinor4(jointApplicantInfo.getJointApplicantDetail().getRelationshipMinor());
			//				mobAccountDetail.setPowerAttnGovCountry4(jointApplicantInfo.getJointApplicantDetail().getPowerAttnGoverningCountry());
			//				mobAccountDetail.setPowerAttnIssueDate4(jointApplicantInfo.getJointApplicantDetail().getPowerAttnIssueDate());
			//				mobAccountDetail.setPowerAttnUs4(jointApplicantInfo.getJointApplicantDetail().getPowerAttnGivenToUSPerson());
			//				mobAccountDetail.setMop4(jointApplicantInfo.getJointApplicantDetail().getMop());
			//				mobAccountDetail.setMopInstruction4(jointApplicantInfo.getJointApplicantDetail().getMopInstruction());
			//			}
			//			if(i == 4){
			//				mobAccountDetail.setRelationshipMinor5(jointApplicantInfo.getJointApplicantDetail().getRelationshipMinor());
			//				mobAccountDetail.setPowerAttnGovCountry5(jointApplicantInfo.getJointApplicantDetail().getPowerAttnGoverningCountry());
			//				mobAccountDetail.setPowerAttnIssueDate5(jointApplicantInfo.getJointApplicantDetail().getPowerAttnIssueDate());
			//				mobAccountDetail.setPowerAttnUs5(jointApplicantInfo.getJointApplicantDetail().getPowerAttnGivenToUSPerson());
			//				mobAccountDetail.setMop5(jointApplicantInfo.getJointApplicantDetail().getMop());
			//				mobAccountDetail.setMopInstruction5(jointApplicantInfo.getJointApplicantDetail().getMopInstruction());
			//			}
			//			
			//			i++;
		}

		mobAccountDetail=accountCreateDao.storeMobAccountDetail(mobAccountDetail);

		//Additional details to be stored for Account
		mobAccountAdditionalDetail.setId(appRefNo);
		mobAccountAdditionalDetail.setRecordId(recordId);
		mobAccountAdditionalDetail.setCreatedBy(accountCreationRequest.getData().getRmId());
		mobAccountAdditionalDetail.setModifiedBy(accountCreationRequest.getData().getRmId());
		mobAccountAdditionalDetail.setCreatedDate(new Date());
		mobAccountAdditionalDetail.setModifiedDate(new Date());
		mobAccountAdditionalDetail.setStmtDelivery(accountDetails.getStmtDelivery());
		mobAccountAdditionalDetail.setStmtAddr1(accountDetails.getStmtAddr1());
		mobAccountAdditionalDetail.setStmtAddr2(accountDetails.getStmtAddr2());
		mobAccountAdditionalDetail.setStmtAddr3(accountDetails.getStmtAddr3());
		mobAccountAdditionalDetail.setStmtCity(accountDetails.getStmtCity());
		mobAccountAdditionalDetail.setStmtCountry(accountDetails.getStmtCountry());
		mobAccountAdditionalDetail.setInternetBanking(accountDetails.getNeedInternetBanking());
		mobAccountAdditionalDetail.setCreditCard(accountDetails.getNeedCreditCard());
		mobAccountAdditionalDetail.setGlobalCustody(accountDetails.getNeedGlobalCustody());
		mobAccountAdditionalDetail.setForexBanking(accountDetails.getNeedForexBanking());
		mobAccountAdditionalDetail.setPrepaidCards(accountDetails.getNeedPrepaidCard());
		mobAccountAdditionalDetail.setIbUsername(accountDetails.getInternetBankingUn());
		mobAccountAdditionalDetail.setOptCallbkServices(accountDetails.getOptCallBackServices());
		mobAccountAdditionalDetail.setOtpEmail(accountDetails.getOtpOverEmail());
		mobAccountAdditionalDetail.setOtpSms(accountDetails.getOtpOverSMS());
		mobAccountAdditionalDetail.setPinViaSms(accountDetails.getOtpOverSMS());
		mobAccountAdditionalDetail.setPinViaPost(accountDetails.getPinViaPost());
		mobAccountAdditionalDetail.setPrefCommMode(accountDetails.getPrefCommMode());
		mobAccountAdditionalDetail.setHearAboutAfrasia(accountDetails.getWhrDidYouHearAbtAfrAsia());
		mobAccountAdditionalDetail.setCommEmail(accountDetails.getAgreeCommEmail());
		mobAccountAdditionalDetail.setCommSms(accountDetails.getAgreeCommSMS());
		mobAccountAdditionalDetail.setOptTranEmail(accountDetails.getOptTransactionsThruEmail());
		mobAccountAdditionalDetail.setAuthEmail1(accountDetails.getAuthEmail1());
		mobAccountAdditionalDetail.setAuthEmail2(accountDetails.getAuthEmail2());
		mobAccountAdditionalDetail.setAuthEmail3(accountDetails.getAuthEmail3());
		mobAccountAdditionalDetail.setAfrasiaEventQues(accountDetails.getAfrasiaEventQues());
		mobAccountAdditionalDetail.setAfrasiaEventAns(accountDetails.getAfrasiaEventAns());
		mobAccountAdditionalDetail.setOptCallbkServices(accountDetails.getOptCallBackServices());

		int cntr = 0;
		for(NomineeInfo n : accountDetails.getNomineeInfo()){
			if(cntr == 0){
				mobAccountAdditionalDetail.setNomineeId1(n.getNomineeId());
				mobAccountAdditionalDetail.setNomineeName1(n.getNomineeName());
				mobAccountAdditionalDetail.setNomineeCallbkNum1(n.getNomineeCallbkNo());	
				mobAccountAdditionalDetail.setNomineeEmail1(n.getNomineeEmail());
			}
			if(cntr == 1){
				mobAccountAdditionalDetail.setNomineeId2(n.getNomineeId());
				mobAccountAdditionalDetail.setNomineeName2(n.getNomineeName());
				mobAccountAdditionalDetail.setNomineeCallbkNum2(n.getNomineeCallbkNo());
				mobAccountAdditionalDetail.setNomineeEmail2(n.getNomineeEmail());
			}
			cntr++;
		}
		mobAccountAdditionalDetail=accountCreateDao.storeMobAccountAdditionalDetail(mobAccountAdditionalDetail);
		logger.info("############ mobAccountAdditionalDetail is : "+mobAccountAdditionalDetail.toString());
	}

	@Transactional(readOnly = false, rollbackFor = {Exception.class}) 
	public MobApplicantRecordId createApplicant(AccountCreationRequest accountCreationRequest, ApplicantDetails applicant, Long appRefNo, Long recordId, String customerType){

		MobApplicantRecordId mobApplicantRecordId = new MobApplicantRecordId();
		mobApplicantRecordId.setId(appRefNo);
		mobApplicantRecordId.setRecordId(recordId);
		mobApplicantRecordId.setCreatedBy(accountCreationRequest.getData().getRmId());
		mobApplicantRecordId.setModifiedBy(accountCreationRequest.getData().getRmId());
		mobApplicantRecordId.setCreatedDate(new Date());
		mobApplicantRecordId.setModifiedDate(new Date());
		mobApplicantRecordId=accountCreateDao.storeMobApplicantRecordId(mobApplicantRecordId);
		logger.info("############ mobApplicantRecordId is : "+mobApplicantRecordId.toString());

		//calculate age of applicant
		Date currentDate=new Date();
		Calendar firstCalendar = Calendar.getInstance();
		firstCalendar.setTime(applicant.getDob()); //set the time as the first java.util.Date
		Calendar secondCalendar = Calendar.getInstance();
		secondCalendar.setTime(currentDate); //set the time as the second java.util.Date
		int year = Calendar.YEAR;
		int month = Calendar.MONTH;
		int age = secondCalendar.get(year) - firstCalendar.get(year);
		if (age > 0 && (secondCalendar.get(month) < firstCalendar.get(month))) {
			age--;
		} 

		//Enter personal details of applicant
		
		/*Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy h:mm:ss a");
		String dateString = sdf.format(date);
		Date date2=new Date();
		try {
			date2=sdf.parse(dateString);
			System.out.println("date is : "+date2);
		} catch (ParseException e) {
			System.out.println("can not convert");
		}*/

		MobApplicantPersonalDetail mobApplicantPersonalDetail = new MobApplicantPersonalDetail();
		mobApplicantPersonalDetail.setId(new MainTableCompositePK());
		mobApplicantPersonalDetail.getId().setId(appRefNo);
		mobApplicantPersonalDetail.getId().setApplicantId(mobApplicantRecordId.getApplicantId());
		mobApplicantPersonalDetail.setRecordId(recordId);
		mobApplicantPersonalDetail.setCreatedBy(accountCreationRequest.getData().getRmId());
		mobApplicantPersonalDetail.setModifiedBy(accountCreationRequest.getData().getRmId());
		mobApplicantPersonalDetail.setCreatedDate(new Date());
		mobApplicantPersonalDetail.setModifiedDate(new Date());
		mobApplicantPersonalDetail.setResidencyStatus(applicant.getResidencyStatus());
		mobApplicantPersonalDetail.setOtherBank1(applicant.getOtherBank1());
		mobApplicantPersonalDetail.setOtherBank2(applicant.getOtherBank2());
		mobApplicantPersonalDetail.setOtherBank3(applicant.getOtherBank3());

		mobApplicantPersonalDetail.setEmployee(applicant.getIsEmployee());
		mobApplicantPersonalDetail.setTitle(applicant.getTitle());
		mobApplicantPersonalDetail.setFirstName(applicant.getFirstName());
		mobApplicantPersonalDetail.setLastName(applicant.getLastName());
		mobApplicantPersonalDetail.setMaidenName(applicant.getMaidenName());
		mobApplicantPersonalDetail.setNic(applicant.getNic());
		mobApplicantPersonalDetail.setPassportNo(applicant.getPassportNo());
		mobApplicantPersonalDetail.setPassportExpiryDate(applicant.getPassportExpDate());
		mobApplicantPersonalDetail.setNationality(applicant.getNationality());
		mobApplicantPersonalDetail.setEmail(applicant.getEmail());
		mobApplicantPersonalDetail.setDob(applicant.getDob());
		mobApplicantPersonalDetail.setCountryBirth(applicant.getCountryBirth());
		mobApplicantPersonalDetail.setExistingCustomer(applicant.getIsExistingCustomer());
		mobApplicantPersonalDetail.setCustCif(applicant.getCustomerCIF());
		mobApplicantPersonalDetail.setMaritalStatus(applicant.getMaritialStatus());
		mobApplicantPersonalDetail.setCustomerType(customerType);
		
		//To be done in update also
		mobApplicantPersonalDetail.setSex(applicant.getSex());
		mobApplicantPersonalDetail.setIsHnwi(applicant.getIsHnwi());
		
		String mop = accountCreationRequest.getData().getAccountDetails().getMop();
		if(mop.equalsIgnoreCase("E")){
			if(customerType.equalsIgnoreCase("Primary")){
				mobApplicantPersonalDetail.setSignatoryType("JOF");
			}
			if(customerType.equalsIgnoreCase("Joint")){
				mobApplicantPersonalDetail.setSignatoryType("JOO");
			}
		}
		else if(mop.equalsIgnoreCase("J")){
			if(customerType.equalsIgnoreCase("Primary")){
				mobApplicantPersonalDetail.setSignatoryType("JAF");
			}
			if(customerType.equalsIgnoreCase("Joint")){
				mobApplicantPersonalDetail.setSignatoryType("JAO");
			}
		}
		else if(mop.equalsIgnoreCase("S")){
			if(customerType.equalsIgnoreCase("Primary")){
				mobApplicantPersonalDetail.setSignatoryType("SOW");
			}
		}
		//To be done in update also
		
		
		mobApplicantPersonalDetail=accountCreateDao.storeMobApplicantPersonalDetail(mobApplicantPersonalDetail);


		if(age > 18){
			mobApplicantPersonalDetail.setIsMinor(false);
		}
		else{
			mobApplicantPersonalDetail.setIsMinor(true);
		}
		logger.info("############ mobApplicantPersonalDetail is : "+mobApplicantPersonalDetail.toString());

		//Enter communication details of applicant
		MobApplicantCommDetail mobApplicantCommDetail = new MobApplicantCommDetail();
		mobApplicantCommDetail.setId(new MainTableCompositePK());
		mobApplicantCommDetail.getId().setId(appRefNo);
		mobApplicantCommDetail.getId().setApplicantId(mobApplicantRecordId.getApplicantId());
		mobApplicantCommDetail.setRecordId(recordId);
		mobApplicantCommDetail.setCreatedBy(accountCreationRequest.getData().getRmId());
		mobApplicantCommDetail.setModifiedBy(accountCreationRequest.getData().getRmId());
		mobApplicantCommDetail.setCreatedDate(new Date());
		mobApplicantCommDetail.setModifiedDate(new Date());
		mobApplicantCommDetail.setPermAddr1(applicant.getPermAddr1());
		mobApplicantCommDetail.setPermAddr2(applicant.getPermAddr2());
		mobApplicantCommDetail.setPermAddr3(applicant.getPermAddr3());
		mobApplicantCommDetail.setPermCity(applicant.getPermCity());
		mobApplicantCommDetail.setPermCountry(applicant.getPermCountry());
		mobApplicantCommDetail.setMailAddr1(applicant.getMailAddr1());
		mobApplicantCommDetail.setMailAddr2(applicant.getMailAddr2());
		mobApplicantCommDetail.setMailAddr3(applicant.getMailAddr3());
		mobApplicantCommDetail.setMailCity(applicant.getMailCity());
		mobApplicantCommDetail.setMailCountry(applicant.getMailCountry());
		mobApplicantCommDetail.setTelNoHome(applicant.getTelNoHome());
		mobApplicantCommDetail.setTelNoHomeCc(applicant.getTelNoHomeCallingCode());
		mobApplicantCommDetail.setTelNoOff(applicant.getTelNoOff());
		mobApplicantCommDetail.setTelNoOffCc(applicant.getTelOffCallingCode());
		mobApplicantCommDetail.setMobNo(applicant.getMobNo());
		mobApplicantCommDetail.setMobNoCc(applicant.getMobNoCountryCode());
		mobApplicantCommDetail.setFaxNo(applicant.getFaxNo());
		mobApplicantCommDetail.setFaxNoCc(applicant.getFaxNoCallingCode());
		
		//to be done in update also.
		mobApplicantCommDetail.setIsMailPermSame(applicant.getIsMailAddrSameAsPerm());
		//to be done in update also.
		
		mobApplicantCommDetail=accountCreateDao.storeMobApplicantCommDetail(mobApplicantCommDetail);
		logger.info("############ mobApplicantCommDetail is : "+mobApplicantCommDetail.toString());
		
		//Enter employment details
		MobApplicantEmploymentDtl mobApplicantEmploymentDtl = new MobApplicantEmploymentDtl();
		mobApplicantEmploymentDtl.setId(new MainTableCompositePK());
		mobApplicantEmploymentDtl.getId().setId(appRefNo);
		mobApplicantEmploymentDtl.getId().setApplicantId(mobApplicantRecordId.getApplicantId());
		mobApplicantEmploymentDtl.setRecordId(recordId);
		mobApplicantEmploymentDtl.setCreatedBy(accountCreationRequest.getData().getRmId());
		mobApplicantEmploymentDtl.setModifiedBy(accountCreationRequest.getData().getRmId());
		mobApplicantEmploymentDtl.setCreatedDate(new Date());
		mobApplicantEmploymentDtl.setModifiedDate(new Date());
		mobApplicantEmploymentDtl.setEmploymentSts(applicant.getEmploymentStatus());
		mobApplicantEmploymentDtl.setCurrOccupation(applicant.getCurrentOccupation());
		mobApplicantEmploymentDtl.setEmployerName(applicant.getEmployerName());
		mobApplicantEmploymentDtl.setEmployerAddr1(applicant.getEmployerAddr1());
		mobApplicantEmploymentDtl.setEmployerAddr2(applicant.getEmployerAddr2());
		mobApplicantEmploymentDtl.setEmployerAddr3(applicant.getEmployerAddr3());
		mobApplicantEmploymentDtl.setEmployerCity(applicant.getEmployerCity());
		mobApplicantEmploymentDtl.setEmployerCountry(applicant.getEmployerCountry());
		mobApplicantEmploymentDtl.setNoOfYearsService(applicant.getNoYearsService());
		mobApplicantEmploymentDtl.setBusinessSector(applicant.getBusinessSector());
		mobApplicantEmploymentDtl.setDateStarted(applicant.getDateStarted());
		mobApplicantEmploymentDtl.setNetMonthlyIncome(applicant.getNetMonthlyIncome());
		mobApplicantEmploymentDtl.setAnnDepositTurnovr(applicant.getAnnualDepositTurnover());
		mobApplicantEmploymentDtl.setAnnCashDeposit(applicant.getAnnualCashDeposit());
		mobApplicantEmploymentDtl.setAnnCashWithdrawl(applicant.getAnnualCashWithdrawl());
		mobApplicantEmploymentDtl.setOtherSourcesIncome(applicant.getOtherIncomeSource());
		mobApplicantEmploymentDtl.setFundSources(applicant.getFundSources());
		mobApplicantEmploymentDtl=accountCreateDao.storeMobApplicantEmploymentDtl(mobApplicantEmploymentDtl);
		logger.info("############ mobApplicantEmploymentDtl is : "+mobApplicantEmploymentDtl.toString());
		
		//enter applicant Additional information
		MobApplicantAdditionalDtl mobApplicantAdditionalDtl = new MobApplicantAdditionalDtl();
		mobApplicantAdditionalDtl.setId(new MainTableCompositePK());
		mobApplicantAdditionalDtl.getId().setId(appRefNo);
		mobApplicantAdditionalDtl.getId().setApplicantId(mobApplicantRecordId.getApplicantId());
		mobApplicantAdditionalDtl.setRecordId(recordId);
		mobApplicantAdditionalDtl.setCreatedBy(accountCreationRequest.getData().getRmId());
		mobApplicantAdditionalDtl.setModifiedBy(accountCreationRequest.getData().getRmId());
		mobApplicantAdditionalDtl.setCreatedDate(new Date());
		mobApplicantAdditionalDtl.setModifiedDate(new Date());
		mobApplicantAdditionalDtl.setUsCitizen(applicant.getiSUSCitizen());
		mobApplicantAdditionalDtl.setIncomeUsTaxable(applicant.getIsIncomeTaxableinUSA());
		mobApplicantAdditionalDtl.setUsSsn(applicant.getUsaSsn());
		mobApplicantAdditionalDtl.setOseasAddr1(applicant.getoAddr1());
		mobApplicantAdditionalDtl.setOseasAddr2(applicant.getoAddr2());
		mobApplicantAdditionalDtl.setOseasAddr3(applicant.getoAddr3());
		mobApplicantAdditionalDtl.setOseasCity(applicant.getoCity());
		mobApplicantAdditionalDtl.setOseasCountry(applicant.getoCountry());
		mobApplicantAdditionalDtl.setWorkPermitExpDate(applicant.getWorkPermitExpDate());
		mobApplicantAdditionalDtl.setIncomeOtherCountryTax(applicant.getIncomeOtherCountryTaxable());
		mobApplicantAdditionalDtl.setCountry1(applicant.getCrsCountryResidence1());
		mobApplicantAdditionalDtl.setCountry2(applicant.getCrsCountryResidence2());
		mobApplicantAdditionalDtl.setCountry3(applicant.getCrsCountryResidence3());
		mobApplicantAdditionalDtl.setTin1(applicant.getCrsTin1());
		mobApplicantAdditionalDtl.setTin2(applicant.getCrsTin2());
		mobApplicantAdditionalDtl.setTin3(applicant.getCrsTin3());
		mobApplicantAdditionalDtl=accountCreateDao.storeMobApplicantAdditionalDtl(mobApplicantAdditionalDtl);
		logger.info("############ mobApplicantAdditionalDtl is : "+mobApplicantAdditionalDtl.toString());
		return mobApplicantRecordId;
	}

	@Transactional(readOnly = false, rollbackFor = {Exception.class})
	public MobAppRefRecordId createRecordIdForApplication(AccountCreationRequest accountCreationRequest, Long appRefNo){
		MobAppRefRecordId mobAppRefRecordId = new MobAppRefRecordId();
		mobAppRefRecordId.setId(appRefNo);
		mobAppRefRecordId.setCreatedBy(accountCreationRequest.getData().getRmId());
		mobAppRefRecordId.setModifiedBy(accountCreationRequest.getData().getRmId());
		mobAppRefRecordId.setCreatedDate(new Date());
		mobAppRefRecordId.setModifiedDate(new Date());
		mobAppRefRecordId=accountCreateDao.storeMobAppRefRecordId(mobAppRefRecordId);
		logger.info("############ mobApplicantAdditionalDtl is : "+mobAppRefRecordId.toString());
		return mobAppRefRecordId;
	}

	@Transactional(readOnly = false, rollbackFor = {Exception.class})
	public MobRmAppRefId createApplicationReferenceId(AccountCreationRequest accountCreationRequest){
		MobRmAppRefId mobRmAppRefId = new MobRmAppRefId();
		mobRmAppRefId.setRmUsedId(accountCreationRequest.getData().getRmId());
		mobRmAppRefId.setCreatedBy(accountCreationRequest.getData().getRmId());
		mobRmAppRefId.setModifiedBy(accountCreationRequest.getData().getRmId());
		mobRmAppRefId.setCreatedDate(new Date());
		mobRmAppRefId.setModifiedDate(new Date());
		mobRmAppRefId.setAppStatus("KYC Pending");
		mobRmAppRefId=accountCreateDao.storeMobRmAppRefId(mobRmAppRefId);
		logger.info("############ mobApplicantAdditionalDtl is : "+mobRmAppRefId.toString());
		return mobRmAppRefId;
	}

	
	// update Account service ==============================
	// =============================================
	// =============================================     


	@Transactional(readOnly = false, rollbackFor = {Exception.class})
	public AccountCreateResponse updateAccount(AccountCreationRequest accountCreationRequest) {

		//1. Get app reference number and RM user Id from update request. Check if application there in MOB_RM_APP_REF_ID	

		AccountCreateResponse accountCreateResponse=new AccountCreateResponse();

		Long appId=accountCreationRequest.getData().getAppRefNo();

		String rmUserId=accountCreationRequest.getData().getRmId();

		Long recordIdFromRequest=accountCreationRequest.getData().getRecordId();

		Long appIdFromDb=0L;
		try{			
			appIdFromDb= accountCreateDao.getAppId(appId,rmUserId);			
			if(appIdFromDb==null){
				logger.error("############ Provided Rm user id and app ref id doestn't match, please pass proper values");
				MsgHeader messageHeader=new MsgHeader();
				MsgHeader.Error error=new MsgHeader().new Error();
				error.setCd("404");
				error.setCustomCode("ERR404");
				error.setRsn("Provided Rm user id and app ref id doestn't match, please pass proper values");
				messageHeader.setError(error);
				accountCreateResponse.setMsgHeader(messageHeader);
				throw new IdNotFoundException("Provided Rm user id and app ref id doestn't match, please pass proper values");
			}

		}  catch(IdNotFoundException exceptionMessage){
			logger.error("############ Provided Rm user id and app ref id doestn't match, please pass proper values");
			MsgHeader msgHdr = new MsgHeader();
			Error err = new MsgHeader().new Error();
			err.setRsn("Provided Rm user id and app ref id doestn't match, please pass proper values");
			err.setCd("404");
			err.setCustomCode("IdNotFoundException");
			msgHdr.setError(err);
			accountCreateResponse.setMsgHeader(msgHdr);
			return accountCreateResponse;
		}	
		catch(NoResultException excpMessage){
			logger.error("############ Provided Rm user id and app ref id doestn't match, please pass proper values");
			MsgHeader msgHdr = new MsgHeader();
			Error err = new MsgHeader().new Error();
			err.setRsn("Provided Rm user id and app ref id doestn't match, please pass proper values");
			err.setCd("404");
			err.setCustomCode("NoResultException");
			msgHdr.setError(err);
			accountCreateResponse.setMsgHeader(msgHdr);
			return accountCreateResponse;
		}

		//1.B. check whether requested record id is present for the application reference number or not in MOB_APP_REF_RECORD_ID		 	

		Long recordIdFromDb=0L;
		try{			
			recordIdFromDb= accountCreateDao.checkRecordId(appId,recordIdFromRequest);			
			if(appIdFromDb==null){
				logger.error("############ Provided record id and app ref id doestn't match, please pass proper values");
				throw new IdNotFoundException("Provided record id and app ref id doestn't match, please pass proper values");
			}

		}  catch(IdNotFoundException exceptionMessage){
			logger.error("############ Provided record id and app ref id doestn't match, please pass proper values");
			MsgHeader msgHdr = new MsgHeader();
			Error err = new MsgHeader().new Error();
			err.setRsn("Provided record id and app ref id doestn't match, please pass proper values");
			err.setCd("404");
			err.setCustomCode("IdNotFoundException");
			msgHdr.setError(err);
			accountCreateResponse.setMsgHeader(msgHdr);
			return accountCreateResponse;
		}	
		catch(NoResultException excpMessage){
			logger.error("############ Provided record id and app ref id doestn't match, please pass proper values");
			MsgHeader msgHdr = new MsgHeader();
			Error err = new MsgHeader().new Error();
			err.setRsn("Provided record id and app ref id doestn't match, please pass proper values");
			err.setCd("404");
			err.setCustomCode("NoResultException");
			msgHdr.setError(err);
			accountCreateResponse.setMsgHeader(msgHdr);
			return accountCreateResponse;
		}

		//2. Create a record id for the application reference id.
		MobAppRefRecordId mobAppRefRecordId = createRecordIdForApplication(accountCreationRequest,accountCreationRequest.getData().getAppRefNo());
		Long recordId=mobAppRefRecordId.getRecordId();
		logger.info("############ Created a record id for the application reference id "+mobAppRefRecordId.toString());
		//3. Take data from MOB_APPLICANT_RECORD_ID table for appRefNo and push data in MOB_APPLICANT_RECORD_ID_HIST					
		//3.1 Fetch data from MOB_APPLICANT_RECORD_ID table for appRefNo
		//3.2 This will return a list
		//3.3 Push this data in MOB_APPLICANT_RECORD_ID_HIST table

		populateHistoryTables(appId);
		
		/* Update MOB_RM_APP_REF_ID table with Modified date and Rm ID*/
		accountCreateDao.updateMobRmAppRefId(accountCreationRequest.getData().getAppRefNo(), accountCreationRequest.getData().getRmId());

		//4. Update MOB_APPLICANT_RECORD_ID with new recordId with MODIFIED DATE, and rmId
		saveMobApplicantRecordId(accountCreationRequest,recordId);

		//5. update other tables ==========
		Data data= new AccountCreateResponse().new Data();
		AccountCreateResponse accountCreationResponse = new AccountCreateResponse();

		//Update applicant id	=========== needs to be done 
		MobApplicantRecordId mobApplicantRecordId=new MobApplicantRecordId();
		Long primaryApplicantRefNo=null;
		ApplicantDetails primaryApplicant = accountCreationRequest.getData().getPrimaryApplicantDetail();
		
		if(primaryApplicant!=null)
		{
			mobApplicantRecordId=accountCreateDao.updateApplicant(accountCreationRequest, primaryApplicant, appId, recordId, "Primary");
			data.setPrimaryApplicantRefNo(mobApplicantRecordId.getApplicantId());
			primaryApplicantRefNo=primaryApplicant.getApplicantId();
			logger.info("############ mobApplicantRecordId "+mobApplicantRecordId.toString());
		}	
		else
		{
			logger.error("############ PrimaryApplicant is null ");
			MsgHeader msgHdr = new MsgHeader();
			Error err = new MsgHeader().new Error();
			err.setRsn("PrimaryApplicant details has not been sent properly, please send proper values");
			err.setCd("404");
			err.setCustomCode("PrimaryApplicant is null");
			msgHdr.setError(err);
			accountCreateResponse.setMsgHeader(msgHdr);
		}

		Long guardianRefNo=null;
		ApplicantDetails guardianPrimary = accountCreationRequest.getData().getGuardianDetail();
		
		if(guardianPrimary!=null)
		{
			mobApplicantRecordId=accountCreateDao.updateApplicant(accountCreationRequest, guardianPrimary, appId, recordId, "Guardian");
			data.setGuardianRefNo(mobApplicantRecordId.getApplicantId());
			guardianRefNo=guardianPrimary.getApplicantId();
			logger.info("############ guardianPrimary "+mobApplicantRecordId.toString());
		}	
		else
		{
			logger.error("############ guardianPrimary is null ");
			MsgHeader msgHdr = new MsgHeader();
			Error err = new MsgHeader().new Error();
			err.setRsn("guardianPrimary details has not been sent properly, please send proper values");
			err.setCd("404");
			err.setCustomCode("guardianPrimary is null");
			msgHdr.setError(err);
			accountCreateResponse.setMsgHeader(msgHdr);
		}


		//Update Joint holders	=========== needs to be done
		//Create Joint holders

		List<JointApplicantsData> jointApplicants = new ArrayList<JointApplicantsData>();
		List<JointApplicants> jointHolders = accountCreationRequest.getData().getJointApplicants();

		MobApplicantRecordId[] mobJoint = new MobApplicantRecordId[5];
		MobApplicantRecordId[] mobGuardianJoint = new MobApplicantRecordId[5];

		int i = 0; 

		for (JointApplicants jointApplicantInfo : jointHolders){

			JointApplicantsData applicantRefNo = new AccountCreateResponse().new Data().new JointApplicantsData();

			ApplicantDetails jointApplicant = jointApplicantInfo.getJointApplicantDetail();
			
			if(jointApplicant != null){
				mobJoint[i]=accountCreateDao.updateApplicant(accountCreationRequest, jointApplicant, appId, recordId, "Joint");
				applicantRefNo.setJointAppRefNo(mobJoint[i].getApplicantId());
				logger.info("############ jointApplicant "+mobJoint[i].toString());
			}
			ApplicantDetails guardianJoint = jointApplicantInfo.getGuardianDetail();
			
			if(guardianJoint != null){
				mobGuardianJoint[i]=accountCreateDao.updateApplicant(accountCreationRequest, guardianJoint, appId, recordId, "Guardian");
				applicantRefNo.setGuardianRefNo(mobGuardianJoint[i].getApplicantId());
				logger.info("############ guardianJoint "+mobGuardianJoint[i].toString());
			}
			else {
				mobGuardianJoint[i] = null;
			}
			i++;
			jointApplicants.add(applicantRefNo);
		}
		data.setJointApplicants(jointApplicants);

		AccountDetails accountDetails=accountCreationRequest.getData().getAccountDetails();
		accountCreateDao.updateAccountDetails(accountCreationRequest,appId,recordId,primaryApplicantRefNo, guardianRefNo,
				mobJoint, mobGuardianJoint,accountDetails);

// accountCreateDao.updateApplicant(accountCreationRequest, primaryApplicant, appId, recordId, "Primary"); --------- check ====

		//		// Trigger email and sms to customer 

		// Send application reference id to frontend
		
		data.setRefNo(appId);
		data.setRecordId(recordId);
		accountCreationResponse.setData(data);
		logger.info("############ accountCreationResponse "+accountCreationResponse.toString());
		return accountCreationResponse;
	}


	// get MobApplicantRecordId table data and set in MobApplicantRecordIdHist table ===========
	@Transactional(readOnly = false, rollbackFor = {Exception.class})
	public void populateHistoryTables(Long appid) {

		List<MobApplicantRecordId> listMobApplicantRecordId=new ArrayList<MobApplicantRecordId>();
		listMobApplicantRecordId = applicationDetailsDAO.getMobApplicantRecordId(appid);

		for (MobApplicantRecordId mobApplicantRecordId : listMobApplicantRecordId) {

			HistTableCompositePK histTableCompositePK=new HistTableCompositePK();
			histTableCompositePK.setRecordId(mobApplicantRecordId.getRecordId());
			histTableCompositePK.setApplicantId(mobApplicantRecordId.getApplicantId());


			//MOB APPLICANT RECORD HIST TABLE
			MobApplicantRecordIdHist mobApplicantRecordIdHist=new MobApplicantRecordIdHist();
			mobApplicantRecordIdHist.setId(histTableCompositePK);
			mobApplicantRecordIdHist.setCreatedBy(mobApplicantRecordId.getCreatedBy());
			mobApplicantRecordIdHist.setCreatedDate(mobApplicantRecordId.getCreatedDate());
			mobApplicantRecordIdHist.setModifiedBy(mobApplicantRecordId.getModifiedBy());
			mobApplicantRecordIdHist.setModifiedDate(mobApplicantRecordId.getModifiedDate());
			accountCreateDao.storeMobApplicantRecordIdHist(mobApplicantRecordIdHist);
			logger.info("############ mobApplicantRecordIdHist "+mobApplicantRecordIdHist.toString());

			//MOB_APPLICANT_PERSONAL_DETAILS_TABLE
			MobApplPersonalDetailsHist mobApplPersonalDetailsHist=new MobApplPersonalDetailsHist();
			MobApplicantPersonalDetail mobApplicantPersonalDetail=applicationDetailsDAO.getMobApplicantPersonalDetails(appid,mobApplicantRecordId.getApplicantId());

			mobApplPersonalDetailsHist.setRecordId(mobApplicantPersonalDetail.getRecordId());
			mobApplPersonalDetailsHist.setApplicantId(mobApplicantPersonalDetail.getId().getApplicantId());
			mobApplPersonalDetailsHist.setCountryBirth(mobApplicantPersonalDetail.getCountryBirth());
			mobApplPersonalDetailsHist.setCreatedBy(mobApplicantPersonalDetail.getCreatedBy());
			mobApplPersonalDetailsHist.setCreatedDate(mobApplicantPersonalDetail.getCreatedDate());
			mobApplPersonalDetailsHist.setCustCif(mobApplicantPersonalDetail.getCustCif());
			mobApplPersonalDetailsHist.setDob(mobApplicantPersonalDetail.getDob());
			mobApplPersonalDetailsHist.setEmail(mobApplicantPersonalDetail.getEmail());
			mobApplPersonalDetailsHist.setExistingCustomer(mobApplicantPersonalDetail.isExistingCustomer());
			mobApplPersonalDetailsHist.setFirstName(mobApplicantPersonalDetail.getFirstName());
			mobApplPersonalDetailsHist.setEmployee(mobApplicantPersonalDetail.isEmployee());
			mobApplPersonalDetailsHist.setLastName(mobApplicantPersonalDetail.getLastName());
			mobApplPersonalDetailsHist.setMaidenName(mobApplicantPersonalDetail.getMaidenName());
			mobApplPersonalDetailsHist.setModifiedBy(mobApplicantPersonalDetail.getModifiedBy());
			mobApplPersonalDetailsHist.setModifiedDate(mobApplicantPersonalDetail.getModifiedDate());
			mobApplPersonalDetailsHist.setNationality(mobApplicantPersonalDetail.getNationality());
			mobApplPersonalDetailsHist.setNic(mobApplicantPersonalDetail.getNic());
			mobApplPersonalDetailsHist.setOtherBank1(mobApplicantPersonalDetail.getOtherBank1());
			mobApplPersonalDetailsHist.setOtherBank2(mobApplicantPersonalDetail.getOtherBank2());
			mobApplPersonalDetailsHist.setOtherBank3(mobApplicantPersonalDetail.getOtherBank3());
			mobApplPersonalDetailsHist.setPassportExpiryDate(mobApplicantPersonalDetail.getPassportExpiryDate());
			mobApplPersonalDetailsHist.setPassportNo(mobApplicantPersonalDetail.getPassportNo());
			mobApplPersonalDetailsHist.setResidencyStatus(mobApplicantPersonalDetail.getResidencyStatus());
			mobApplPersonalDetailsHist.setTitle(mobApplicantPersonalDetail.getTitle());
			mobApplPersonalDetailsHist.setMaritalStatus(mobApplicantPersonalDetail.getMaritalStatus());
			mobApplPersonalDetailsHist.setMiddleName(mobApplicantPersonalDetail.getMiddleName());
			mobApplPersonalDetailsHist.setCustomerType(mobApplicantPersonalDetail.getCustomerType());
			mobApplPersonalDetailsHist.setIsMinor(mobApplicantPersonalDetail.getIsMinor());
			mobApplPersonalDetailsHist.setSex(mobApplicantPersonalDetail.getSex());
			mobApplPersonalDetailsHist.setIsHnwi(mobApplicantPersonalDetail.getIsHnwi());
			mobApplPersonalDetailsHist.setSignatoryType(mobApplicantPersonalDetail.getSignatoryType());
			accountCreateDao.storeMobApplPersonalDetailsHist(mobApplPersonalDetailsHist);
			logger.info("############ mobApplPersonalDetailsHist "+mobApplPersonalDetailsHist.toString());
			
			//Mob_Applicant_Comm_details table
			MobApplCommDetailsHist mobApplCommDetailsHist=new MobApplCommDetailsHist();
			MobApplicantCommDetail mobApplicantCommDetail=applicationDetailsDAO.getMobApplicantCommDetails(appid,mobApplicantRecordId.getApplicantId());
			mobApplCommDetailsHist.setId(histTableCompositePK);
			mobApplCommDetailsHist.setCreatedBy(mobApplicantCommDetail.getCreatedBy());
			mobApplCommDetailsHist.setCreatedDate(mobApplicantCommDetail.getCreatedDate());
			mobApplCommDetailsHist.setFaxNo(mobApplicantCommDetail.getFaxNo());
			mobApplCommDetailsHist.setFaxNoCc(mobApplicantCommDetail.getFaxNoCc());
			mobApplCommDetailsHist.setMailAddr1(mobApplicantCommDetail.getMailAddr1());
			mobApplCommDetailsHist.setMailAddr2(mobApplicantCommDetail.getMailAddr2());
			mobApplCommDetailsHist.setMailAddr3(mobApplicantCommDetail.getMailAddr3());
			mobApplCommDetailsHist.setMailCity(mobApplicantCommDetail.getMailCity());
			mobApplCommDetailsHist.setMailCountry(mobApplicantCommDetail.getMailCountry());
			mobApplCommDetailsHist.setMobNo(mobApplicantCommDetail.getMobNo());
			mobApplCommDetailsHist.setMobNoCc(mobApplicantCommDetail.getMobNoCc());
			mobApplCommDetailsHist.setModifiedBy(mobApplicantCommDetail.getModifiedBy());
			mobApplCommDetailsHist.setModifiedDate(mobApplicantCommDetail.getModifiedDate());
			mobApplCommDetailsHist.setPermAddr1(mobApplicantCommDetail.getPermAddr1());
			mobApplCommDetailsHist.setPermAddr2(mobApplicantCommDetail.getPermAddr2());
			mobApplCommDetailsHist.setPermAddr3(mobApplicantCommDetail.getPermAddr3());
			mobApplCommDetailsHist.setPermCity(mobApplicantCommDetail.getPermCity());
			mobApplCommDetailsHist.setPermCountry(mobApplicantCommDetail.getPermCountry());
			mobApplCommDetailsHist.setTelNoHome(mobApplicantCommDetail.getTelNoHome());
			mobApplCommDetailsHist.setTelNoHomeCc(mobApplicantCommDetail.getTelNoHomeCc());
			mobApplCommDetailsHist.setTelNoOff(mobApplicantCommDetail.getTelNoOff());
			mobApplCommDetailsHist.setTelNoOffCc(mobApplicantCommDetail.getTelNoOffCc());
			mobApplCommDetailsHist.setIsMailPermSame(mobApplicantCommDetail.getIsMailPermSame());
			accountCreateDao.storeMobApplCommDetailsHist(mobApplCommDetailsHist);
			logger.info("############ mobApplCommDetailsHist "+mobApplCommDetailsHist.toString());
			
			//Mob app_mob_app_employment_details
			MobApplEmploymentDtlsHist mobApplEmploymentDtlsHist=new MobApplEmploymentDtlsHist();
			MobApplicantEmploymentDtl mobApplicantEmploymentDtl=applicationDetailsDAO.getMobApplicantEmploymentDtl(appid,mobApplicantRecordId.getApplicantId());
			mobApplEmploymentDtlsHist.setId(histTableCompositePK);
			mobApplEmploymentDtlsHist.setAnnCashDeposit(mobApplicantEmploymentDtl.getAnnCashDeposit());
			mobApplEmploymentDtlsHist.setAnnCashWithdrawl(mobApplicantEmploymentDtl.getAnnCashWithdrawl());
			mobApplEmploymentDtlsHist.setAnnDepositTurnovr(mobApplicantEmploymentDtl.getAnnDepositTurnovr());
			mobApplEmploymentDtlsHist.setBusinessSector(mobApplicantEmploymentDtl.getBusinessSector());
			mobApplEmploymentDtlsHist.setCreatedBy(mobApplicantEmploymentDtl.getCreatedBy());
			mobApplEmploymentDtlsHist.setCreatedDate(mobApplicantEmploymentDtl.getCreatedDate());
			mobApplEmploymentDtlsHist.setCurrOccupation(mobApplicantEmploymentDtl.getCurrOccupation());
			mobApplEmploymentDtlsHist.setDateStarted(mobApplicantEmploymentDtl.getDateStarted());
			mobApplEmploymentDtlsHist.setEmployerAddr1(mobApplicantEmploymentDtl.getEmployerAddr1());
			mobApplEmploymentDtlsHist.setEmployerAddr2(mobApplicantEmploymentDtl.getEmployerAddr2());
			mobApplEmploymentDtlsHist.setEmployerAddr3(mobApplicantEmploymentDtl.getEmployerAddr3());
			mobApplEmploymentDtlsHist.setEmployerCity(mobApplicantEmploymentDtl.getEmployerCity());
			mobApplEmploymentDtlsHist.setEmployerCountry(mobApplicantEmploymentDtl.getEmployerCountry());
			mobApplEmploymentDtlsHist.setEmployerName(mobApplicantEmploymentDtl.getEmployerName());
			mobApplEmploymentDtlsHist.setEmploymentSts(mobApplicantEmploymentDtl.getEmploymentSts());
			mobApplEmploymentDtlsHist.setFundSources(mobApplicantEmploymentDtl.getFundSources());
			mobApplEmploymentDtlsHist.setModifiedBy(mobApplicantEmploymentDtl.getModifiedBy());
			mobApplEmploymentDtlsHist.setModifiedDate(mobApplicantEmploymentDtl.getModifiedDate());
			mobApplEmploymentDtlsHist.setNetMonthlyIncome(mobApplicantEmploymentDtl.getNetMonthlyIncome());
			mobApplEmploymentDtlsHist.setNoOfYearsService(mobApplicantEmploymentDtl.getNoOfYearsService());
			mobApplEmploymentDtlsHist.setOtherSourcesIncome(mobApplicantEmploymentDtl.getOtherSourcesIncome());
			mobApplEmploymentDtlsHist.setBusinessSector(mobApplicantEmploymentDtl.getBusinessSector());
			accountCreateDao.storeMobApplEmploymentDtlsHist(mobApplEmploymentDtlsHist);
			logger.info("############ mobApplEmploymentDtlsHist "+mobApplEmploymentDtlsHist.toString());
			
			//mob_app_add_detail
			MobApplAdditionalDtlsHist mobApplAdditionalDtlsHist=new MobApplAdditionalDtlsHist();
			MobApplicantAdditionalDtl mobApplicantAdditionalDtl=applicationDetailsDAO.getMobApplicantAdditionalDtl(appid,mobApplicantRecordId.getApplicantId());
			mobApplAdditionalDtlsHist.setId(histTableCompositePK);
			mobApplAdditionalDtlsHist.setCountry1(mobApplicantAdditionalDtl.getCountry1());
			mobApplAdditionalDtlsHist.setCountry2(mobApplicantAdditionalDtl.getCountry2());
			mobApplAdditionalDtlsHist.setCountry3(mobApplicantAdditionalDtl.getCountry3());
			mobApplAdditionalDtlsHist.setCreatedBy(mobApplicantAdditionalDtl.getCreatedBy());
			mobApplAdditionalDtlsHist.setCreatedDate(mobApplicantAdditionalDtl.getCreatedDate());
			mobApplAdditionalDtlsHist.setIncomeOtherCountryTax(mobApplicantAdditionalDtl.getIncomeOtherCountryTax());
			mobApplAdditionalDtlsHist.setIncomeUsTaxable(mobApplicantAdditionalDtl.getIncomeUsTaxable());
			mobApplAdditionalDtlsHist.setModifiedBy(mobApplicantAdditionalDtl.getModifiedBy());
			mobApplAdditionalDtlsHist.setModifiedDate(mobApplicantAdditionalDtl.getModifiedDate());
			mobApplAdditionalDtlsHist.setOseasAddr1(mobApplicantAdditionalDtl.getOseasAddr1());
			mobApplAdditionalDtlsHist.setOseasAddr2(mobApplicantAdditionalDtl.getOseasAddr2());
			mobApplAdditionalDtlsHist.setOseasAddr3(mobApplicantAdditionalDtl.getOseasAddr3());
			mobApplAdditionalDtlsHist.setUsCitizen(mobApplicantAdditionalDtl.getUsCitizen());
			mobApplAdditionalDtlsHist.setUsSsn(mobApplicantAdditionalDtl.getUsSsn());
			mobApplAdditionalDtlsHist.setWorkPermitExpDate(mobApplicantAdditionalDtl.getWorkPermitExpDate());
			accountCreateDao.storeMobApplAdditionalDtlsHist(mobApplAdditionalDtlsHist);
			logger.info("############ mobApplAdditionalDtlsHist "+mobApplAdditionalDtlsHist.toString());
		}

		//Mob_account_Details - application Id to mob_account_details_history


		MobAccountDetailsHist mobAccountDetailsHist=new MobAccountDetailsHist();
		MobAccountDetail mobAccountDetail=applicationDetailsDAO.getMobAccountDetails(appid);

		mobAccountDetailsHist.setAccountCategory(mobAccountDetail.getAccountCategory());
		mobAccountDetailsHist.setAccountType(mobAccountDetail.getAccountType());
		mobAccountDetailsHist.setCreatedBy(mobAccountDetail.getCreatedBy());
		mobAccountDetailsHist.setCreatedDate(mobAccountDetail.getCreatedDate());
		mobAccountDetailsHist.setRecordId(mobAccountDetail.getRecordId());
		mobAccountDetailsHist.setIndvApplicantRefNo(mobAccountDetail.getIndvApplicantRefNo());
		mobAccountDetailsHist.setIndvGuardianRefNo(mobAccountDetail.getIndvGuardianRefNo());
		mobAccountDetailsHist.setJoint1ApplicantRefNo(mobAccountDetail.getJoint1ApplicantRefNo());
		mobAccountDetailsHist.setJoint1GuardianRefNo(mobAccountDetail.getJoint1GuardianRefNo());
		mobAccountDetailsHist.setJoint2ApplicantRefNo(mobAccountDetail.getJoint2ApplicantRefNo());
		mobAccountDetailsHist.setJoint2GuardianRefNo(mobAccountDetail.getJoint2GuardianRefNo());
		mobAccountDetailsHist.setJoint3ApplicantRefNo(mobAccountDetail.getJoint3ApplicantRefNo());
		mobAccountDetailsHist.setJoint3GuardianRefNo(mobAccountDetail.getJoint3GuardianRefNo());
		mobAccountDetailsHist.setJoint4ApplicantRefNo(mobAccountDetail.getJoint4ApplicantRefNo());
		mobAccountDetailsHist.setJoint4GuardianRefNo(mobAccountDetail.getJoint4GuardianRefNo());
		mobAccountDetailsHist.setJoint5ApplicantRefNo(mobAccountDetail.getJoint5ApplicantRefNo());
		mobAccountDetailsHist.setJoint5GuardianRefNo(mobAccountDetail.getJoint5GuardianRefNo());
		mobAccountDetailsHist.setModifiedBy(mobAccountDetail.getModifiedBy());
		mobAccountDetailsHist.setModifiedDate(mobAccountDetail.getModifiedDate());
		mobAccountDetailsHist.setMop(mobAccountDetail.getMop());
		mobAccountDetailsHist.setMop1(mobAccountDetail.getMop1());
		mobAccountDetailsHist.setMop2(mobAccountDetail.getMop2());
		mobAccountDetailsHist.setMop3(mobAccountDetail.getMop3());
		mobAccountDetailsHist.setMop4(mobAccountDetail.getMop4());
		mobAccountDetailsHist.setMop5(mobAccountDetail.getMop5());
		mobAccountDetailsHist.setMopInstruction1(mobAccountDetail.getMopInstruction1());
		mobAccountDetailsHist.setMopInstruction2(mobAccountDetail.getMopInstruction2());
		mobAccountDetailsHist.setMopInstruction3(mobAccountDetail.getMopInstruction3());
		mobAccountDetailsHist.setMopInstruction4(mobAccountDetail.getMopInstruction4());
		mobAccountDetailsHist.setMopInstruction5(mobAccountDetail.getMopInstruction5());
		mobAccountDetailsHist.setPowerAttnGovCountry1(mobAccountDetail.getPowerAttnGovCountry1());
		mobAccountDetailsHist.setPowerAttnGovCountry2(mobAccountDetail.getPowerAttnGovCountry2());
		mobAccountDetailsHist.setPowerAttnGovCountry3(mobAccountDetail.getPowerAttnGovCountry3());
		mobAccountDetailsHist.setPowerAttnGovCountry4(mobAccountDetail.getPowerAttnGovCountry4());
		mobAccountDetailsHist.setPowerAttnGovCountry5(mobAccountDetail.getPowerAttnGovCountry5());
		mobAccountDetailsHist.setPowerAttnIssueDate1(mobAccountDetail.getPowerAttnIssueDate1());
		mobAccountDetailsHist.setPowerAttnIssueDate2(mobAccountDetail.getPowerAttnIssueDate2());
		mobAccountDetailsHist.setPowerAttnIssueDate3(mobAccountDetail.getPowerAttnIssueDate3());
		mobAccountDetailsHist.setPowerAttnIssueDate4(mobAccountDetail.getPowerAttnIssueDate4());
		mobAccountDetailsHist.setPowerAttnIssueDate5(mobAccountDetail.getPowerAttnIssueDate5());
		mobAccountDetailsHist.setPowerAttnUs1(mobAccountDetail.isPowerAttnUs1());
		mobAccountDetailsHist.setPowerAttnUs2(mobAccountDetail.isPowerAttnUs2());
		mobAccountDetailsHist.setPowerAttnUs3(mobAccountDetail.isPowerAttnUs3());
		mobAccountDetailsHist.setPowerAttnUs4(mobAccountDetail.isPowerAttnUs4());
		mobAccountDetailsHist.setPowerAttnUs5(mobAccountDetail.isPowerAttnUs5());
		mobAccountDetailsHist.setRelationshipMinor1(mobAccountDetail.getRelationshipMinor1());
		mobAccountDetailsHist.setRelationshipMinor2(mobAccountDetail.getRelationshipMinor2());
		mobAccountDetailsHist.setRelationshipMinor3(mobAccountDetail.getRelationshipMinor3());
		mobAccountDetailsHist.setRelationshipMinor4(mobAccountDetail.getRelationshipMinor4());
		mobAccountDetailsHist.setRelationshipMinor5(mobAccountDetail.getRelationshipMinor5());
		mobAccountDetailsHist.setMinNoSignatures(mobAccountDetail.getMinNoSignatures());
		mobAccountDetailsHist.setOperatingInst(mobAccountDetail.getOperatingInst());

		accountCreateDao.storeMobAccountDetailsHist(mobAccountDetailsHist);
		logger.info("############ mobAccountDetailsHist "+mobAccountDetailsHist.toString());
		
		//Mob account addn details = application Id to history table
		MobAccountAddnDetailsHist mobAccountAddnDetailsHist=new MobAccountAddnDetailsHist();	
		MobAccountAdditionalDetail mobAccountAdditionalDetail=applicationDetailsDAO.getMobAccountAdditionalDetails(appid);
		mobAccountAddnDetailsHist.setAuthEmail1(mobAccountAdditionalDetail.getAuthEmail1());
		mobAccountAddnDetailsHist.setAuthEmail2(mobAccountAdditionalDetail.getAuthEmail2());
		mobAccountAddnDetailsHist.setAuthEmail3(mobAccountAdditionalDetail.getAuthEmail3());
		mobAccountAddnDetailsHist.setCommEmail(mobAccountAdditionalDetail.getCommEmail());
		mobAccountAddnDetailsHist.setCommSms(mobAccountAdditionalDetail.getCommSms());
		mobAccountAddnDetailsHist.setCreatedBy(mobAccountAdditionalDetail.getCreatedBy());
		mobAccountAddnDetailsHist.setCreatedDate(mobAccountAdditionalDetail.getCreatedDate());  
		mobAccountAddnDetailsHist.setCreditCard(mobAccountAdditionalDetail.getCreditCard());
		mobAccountAddnDetailsHist.setForexBanking(mobAccountAdditionalDetail.getForexBanking());
		mobAccountAddnDetailsHist.setGlobalCustody(mobAccountAdditionalDetail.getGlobalCustody());
		mobAccountAddnDetailsHist.setHearAboutAfrasia(mobAccountAdditionalDetail.getHearAboutAfrasia());
		mobAccountAddnDetailsHist.setIbUsername(mobAccountAdditionalDetail.getIbUsername());
		mobAccountAddnDetailsHist.setRecordId(mobAccountAdditionalDetail.getRecordId());
		mobAccountAddnDetailsHist.setInternetBanking(mobAccountAdditionalDetail.getInternetBanking());
		mobAccountAddnDetailsHist.setModifiedBy(mobAccountAdditionalDetail.getModifiedBy());
		mobAccountAddnDetailsHist.setModifiedDate(mobAccountAdditionalDetail.getModifiedDate());
		mobAccountAddnDetailsHist.setNomineeCallbkNum1(mobAccountAdditionalDetail.getNomineeCallbkNum1());
		mobAccountAddnDetailsHist.setNomineeCallbkNum2(mobAccountAdditionalDetail.getNomineeCallbkNum2());
		mobAccountAddnDetailsHist.setNomineeId1(mobAccountAdditionalDetail.getNomineeId1());
		mobAccountAddnDetailsHist.setNomineeId2(mobAccountAdditionalDetail.getNomineeId2());
		mobAccountAddnDetailsHist.setNomineeName1(mobAccountAdditionalDetail.getNomineeId1());
		mobAccountAddnDetailsHist.setNomineeName2(mobAccountAdditionalDetail.getNomineeId2());
		mobAccountAddnDetailsHist.setOptCallbkServices(mobAccountAdditionalDetail.getOptCallbkServices());
		mobAccountAddnDetailsHist.setOptTranEmail(mobAccountAdditionalDetail.getOptTranEmail());
		mobAccountAddnDetailsHist.setOtpEmail(mobAccountAdditionalDetail.getOtpEmail());
		mobAccountAddnDetailsHist.setOtpSms(mobAccountAdditionalDetail.getOtpSms());
		mobAccountAddnDetailsHist.setPinViaPost(mobAccountAdditionalDetail.getPinViaPost()); 
		mobAccountAddnDetailsHist.setPinViaSms(mobAccountAdditionalDetail.getPinViaSms());
		mobAccountAddnDetailsHist.setPrefCommMode(mobAccountAdditionalDetail.getPrefCommMode());
		mobAccountAddnDetailsHist.setPrepaidCards(mobAccountAdditionalDetail.getPrepaidCards());
		mobAccountAddnDetailsHist.setStmtAddr1(mobAccountAdditionalDetail.getStmtAddr1());
		mobAccountAddnDetailsHist.setStmtAddr2(mobAccountAdditionalDetail.getStmtAddr2());
		mobAccountAddnDetailsHist.setStmtAddr3(mobAccountAdditionalDetail.getStmtAddr3());
		mobAccountAddnDetailsHist.setStmtCity(mobAccountAdditionalDetail.getStmtCity());
		mobAccountAddnDetailsHist.setStmtCountry(mobAccountAdditionalDetail.getStmtCountry());
		mobAccountAddnDetailsHist.setStmtDelivery(mobAccountAdditionalDetail.getStmtDelivery());
		mobAccountAddnDetailsHist.setRequireChqBook(mobAccountAdditionalDetail.getRequireChqBook());
		mobAccountAddnDetailsHist.setAfrasiaEventQues(mobAccountAdditionalDetail.getAfrasiaEventQues());
		mobAccountAddnDetailsHist.setAfrasiaEventAns(mobAccountAdditionalDetail.getAfrasiaEventAns());
		mobAccountAddnDetailsHist.setNomineeEmail1(mobAccountAdditionalDetail.getNomineeEmail1());
		mobAccountAddnDetailsHist.setNomineeEmail2(mobAccountAdditionalDetail.getNomineeEmail2());
		accountCreateDao.storeMobAccountAddnDetailsHist(mobAccountAddnDetailsHist);
		logger.info("############ mobAccountAddnDetailsHist "+mobAccountAddnDetailsHist.toString());
		
		accountCreateDao.storeIntoMobApplKycDocumentsHist(appid);
		logger.info("############ MobApplKycDocumentsHist is updated ");
	}

	// update MobApplicantRecordId table with the new record id  ===================== 
	@Transactional(readOnly = false, rollbackFor = {Exception.class}) 
	private void saveMobApplicantRecordId(AccountCreationRequest accountCreationRequest,Long recordId) {
		accountCreateDao.updateAplicantRecordId(accountCreationRequest.getData().getAppRefNo(),recordId);
		logger.info("############ AplicantRecordId is updated ");
	}
	
	@Transactional(readOnly = false, rollbackFor = {Exception.class}) 
	public RMDetails getRMDetails(String RMId){
    	RMDetails rmDetails = rmDetailsDAO.getRMDetailByRMId(RMId);
    	return rmDetails;
    }

}