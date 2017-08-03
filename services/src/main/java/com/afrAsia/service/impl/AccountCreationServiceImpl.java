package com.afrAsia.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.afrAsia.dao.jpa.AccountCreateJpaDao;
import com.afrAsia.dao.jpa.impl.AccountCreateJpaDaoImpl;
import com.afrAsia.entities.request.AccountCreationRequest;
import com.afrAsia.entities.request.AccountCreationRequest.Data.AccountDetails;
import com.afrAsia.entities.request.ApplicantDetails;
import com.afrAsia.entities.request.JointApplicants;
import com.afrAsia.entities.request.NomineeInfo;
import com.afrAsia.entities.response.AccountCreateResponse;
import com.afrAsia.entities.response.AccountCreateResponse.Data;
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
	private AccountCreateJpaDao accountCreateDao = new AccountCreateJpaDaoImpl();
	
	public AccountCreateJpaDao getAccountCreateDao() {
		return accountCreateDao;
	}

	public void setAccountCreateDao(AccountCreateJpaDao accountCreateDao) {
		this.accountCreateDao = accountCreateDao;
	}

	@Override
	public String toString() {
		return "AccountCreationServiceImpl [accountCreateDao=" + accountCreateDao + "]";
	}

	@Transactional(readOnly = false, rollbackFor = {Exception.class})
	public AccountCreateResponse createAccount(AccountCreationRequest accountCreationRequest) {
		AccountCreateResponse accountCreationResponse = new AccountCreateResponse();
		Data data= new AccountCreateResponse().new Data();
		
		// Create Application Reference id against Rm id
		MobRmAppRefId mobRmAppRefId = createApplicationReferenceId(accountCreationRequest);
		Long appRefNo = mobRmAppRefId.getId();
		
		// Create a record id for the application reference id.
		MobAppRefRecordId mobAppRefRecordId = createRecordIdForApplication(accountCreationRequest,appRefNo);
		Long recordId = mobAppRefRecordId.getRecordId(); 
		
		//Create applicant id
		ApplicantDetails primaryApplicant = accountCreationRequest.getData().getPrimaryApplicantDetail();
		MobApplicantRecordId mobApplicantPrimary = createApplicant(accountCreationRequest, primaryApplicant, appRefNo, recordId, "Primary");
		
		//Create Guardian
		MobApplicantRecordId mobGuardianPrimary = null;
		ApplicantDetails guardianPrimary = accountCreationRequest.getData().getGuardianDetail();
		if(guardianPrimary != null && guardianPrimary.getFirstName()!=null && !guardianPrimary.getFirstName().isEmpty()){
			mobGuardianPrimary = createApplicant(accountCreationRequest, guardianPrimary, appRefNo, recordId, "Guardian");
		}
		//Create Joint holders
		List<JointApplicants> jointHolders = accountCreationRequest.getData().getJointApplicants();
//		
		for (JointApplicants s : jointHolders){
			System.out.println("Joint applicant Info::" + s.toString());
		}
		
		
		MobApplicantRecordId[] mobJoint = new MobApplicantRecordId[5];
		MobApplicantRecordId[] mobGuardianJoint = new MobApplicantRecordId[5];
		
		int i = 0;
		for (JointApplicants jointApplicantInfo : jointHolders){
			System.out.println("I am here");
			ApplicantDetails jointApplicant = jointApplicantInfo.getJointApplicantDetail();
			if(jointApplicant != null){
				System.out.println("I am also here " + jointApplicant.toString());
				mobJoint[i] = createApplicant(accountCreationRequest, jointApplicant, appRefNo, recordId, "Joint");
				System.out.println("Applicant id" + mobJoint[i].getApplicantId());
			}
			ApplicantDetails guardianJoint = jointApplicantInfo.getGuardianDetail();
			if(guardianJoint != null){
				System.out.println("I am also here " + guardianJoint.toString());
				mobGuardianJoint[i] = createApplicant(accountCreationRequest, guardianJoint, appRefNo, recordId, "Guardian");
				System.out.println("Guardins id" + mobGuardianJoint[i].getApplicantId());
			}
			else {
				mobGuardianJoint[i] = null;
			}
			i++;
		}
		
		//Create Account
		AccountDetails accountDetails = accountCreationRequest.getData().getAccountDetails();
		enterAccountDetails(accountCreationRequest,appRefNo, recordId, mobApplicantPrimary, mobGuardianPrimary, mobJoint, mobGuardianJoint, accountDetails);
		//Trigger email and sms to customer
		
		
		//Send application reference id to frontend
		data.setRefNo(mobRmAppRefId.getId());
		accountCreationResponse.setData(data);
		return accountCreationResponse;
	}
	
	@Transactional(readOnly = false, rollbackFor = {Exception.class})
	public void enterAccountDetails(AccountCreationRequest accountCreationRequest ,long appRefNo, long recordId, MobApplicantRecordId mobApplicantPrimary, MobApplicantRecordId mobGuardianPrimary, MobApplicantRecordId[] mobJoint, MobApplicantRecordId[] mobGuardianJoint, AccountDetails accountDetails)
	{
		
		System.out.println("Account Details::" + accountDetails);
		
		MobAccountDetail mobAccountDetail = new MobAccountDetail();
		MobAccountAdditionalDetail mobAccountAdditionalDetail = new MobAccountAdditionalDetail();
		
		mobAccountDetail.setId(appRefNo);
		mobAccountDetail.setRecordId(recordId);
		mobAccountDetail.setAccountType(accountDetails.getAccount());
		mobAccountDetail.setAccountCategory(accountDetails.getAccountType());
		mobAccountDetail.setMop(accountDetails.getMop());
		mobAccountDetail.setIndvApplicantRefNo(mobApplicantPrimary.getApplicantId());
		mobAccountDetail.setIndvGuardianRefNo(mobGuardianPrimary.getApplicantId());
		mobAccountDetail.setCreatedBy(accountCreationRequest.getData().getRmId());
		mobAccountDetail.setModifiedBy(accountCreationRequest.getData().getRmId());
		mobAccountDetail.setCreatedDate(new Date());
		mobAccountDetail.setModifiedDate(new Date());
		System.out.println("Mob Joint 0" + mobJoint[0]);
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
			mobAccountDetail.setJoint4ApplicantRefNo(mobJoint[4].getApplicantId());
		if(mobGuardianJoint[4] != null)
			mobAccountDetail.setJoint4GuardianRefNo(mobGuardianJoint[4].getApplicantId());
		
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
		mobAccountAdditionalDetail.setAuthEmail1(accountDetails.getAuthEmail2());
		mobAccountAdditionalDetail.setAuthEmail1(accountDetails.getAuthEmail3());
		
		mobAccountAdditionalDetail.setOptCallbkServices(accountDetails.getOptCallBackServices());
		
		int cntr = 0;
		for(NomineeInfo n : accountDetails.getNomineeInfo()){
			if(cntr == 0){
				mobAccountAdditionalDetail.setNomineeId1(n.getNomineeId());
				mobAccountAdditionalDetail.setNomineeName1(n.getNomineeName());
				mobAccountAdditionalDetail.setNomineeCallbkNum1(n.getNomineeCallbkNo());		
			}
			if(cntr == 1){
				mobAccountAdditionalDetail.setNomineeId2(n.getNomineeId());
				mobAccountAdditionalDetail.setNomineeName2(n.getNomineeName());
				mobAccountAdditionalDetail.setNomineeCallbkNum2(n.getNomineeCallbkNo());		
			}
			cntr++;
		}
		mobAccountAdditionalDetail=accountCreateDao.storeMobAccountAdditionalDetail(mobAccountAdditionalDetail);
		
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
		
		
		
		//Enter personal details of applicant
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
		
		mobApplicantPersonalDetail.setIsEmployee(applicant.getIsEmployee());
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
		mobApplicantPersonalDetail=accountCreateDao.storeMobApplicantPersonalDetail(mobApplicantPersonalDetail);
		
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
		mobApplicantCommDetail=accountCreateDao.storeMobApplicantCommDetail(mobApplicantCommDetail);
		
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
		return mobAppRefRecordId;
	}
	
	@Transactional(readOnly = false, rollbackFor = {Exception.class})
	public MobRmAppRefId createApplicationReferenceId(AccountCreationRequest accountCreationRequest){
		MobRmAppRefId mobRmAppRefId = new MobRmAppRefId();
		mobRmAppRefId.setRmUsedId(accountCreationRequest.getData().getRmId());
		mobRmAppRefId.setRmName("Neha");
		mobRmAppRefId.setCreatedBy(accountCreationRequest.getData().getRmId());
		mobRmAppRefId.setModifiedBy(accountCreationRequest.getData().getRmId());
		mobRmAppRefId.setCreatedDate(new Date());
		mobRmAppRefId.setModifiedDate(new Date());
		mobRmAppRefId.setAppStatus("Under Processing");
		mobRmAppRefId=accountCreateDao.storeMobRmAppRefId(mobRmAppRefId);
		return mobRmAppRefId;
	}

	public AccountCreateResponse updateAccount(AccountCreationRequest accountCreationRequest) {
		MobRmAppRefId mobRmAppRefId=new MobRmAppRefId();
		MobAppRefRecordId mobAppRefRecordId=new MobAppRefRecordId();
     	MobAccountAdditionalDetail mobAccountAdditionalDetail=new MobAccountAdditionalDetail();
     	MobAccountAddnDetailsHist mobAccountAddnDetailsHist=new MobAccountAddnDetailsHist();
     	MobAccountDetail mobAccountDetail= new MobAccountDetail();
     	MobAccountDetailsHist  mobAccountDetailsHist=new MobAccountDetailsHist();
     	MobApplAdditionalDtlsHist mobApplAdditionalDtlsHist= new MobApplAdditionalDtlsHist();
     	MobApplCommDetailsHist mobApplCommDetailsHist= new MobApplCommDetailsHist();
     	MobApplEmploymentDtlsHist  mobApplEmploymentDtlsHist= new MobApplEmploymentDtlsHist();
     	MobApplicantAdditionalDtl mobApplicantAdditionalDtl= new MobApplicantAdditionalDtl(); 
     	MobApplicantCommDetail mobApplicantCommDetail= new MobApplicantCommDetail();
     	MobApplicantEmploymentDtl mobApplicantEmploymentDtl= new MobApplicantEmploymentDtl();
     	MobApplicantPersonalDetail  mobApplicantPersonalDetail= new MobApplicantPersonalDetail();
     	MobApplicantRecordId mobApplicantRecordId= new MobApplicantRecordId();
     	MobApplicantRecordIdHist mobApplicantRecordIdHist= new MobApplicantRecordIdHist();
     	MobApplPersonalDetailsHist mobApplPersonalDetailsHist= new MobApplPersonalDetailsHist();
     	
		return null;
	}	
}