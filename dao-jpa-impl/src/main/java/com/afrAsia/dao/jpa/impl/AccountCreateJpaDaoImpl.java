package com.afrAsia.dao.jpa.impl;

import java.util.Date;
import java.util.List;

import javax.persistence.Query;

import com.afrAsia.dao.jpa.AccountCreateJpaDao;
import com.afrAsia.entities.request.AccountCreationRequest;
import com.afrAsia.entities.request.AccountCreationRequest.AccountDetails;
import com.afrAsia.entities.request.ApplicantDetails;
import com.afrAsia.entities.request.NomineeInfo;
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

public class AccountCreateJpaDaoImpl extends BaseJpaDAOImpl<String, MobAppRefRecordId>implements AccountCreateJpaDao {

	public MobRmAppRefId storeMobRmAppRefId(MobRmAppRefId mobRmAppRefId) {
		//System.out.println("Value for RM Id table : " + mobRmAppRefId.toString());
		getEntityManager().persist(mobRmAppRefId);
		getEntityManager().flush();
		return mobRmAppRefId;
	}

	public MobAccountAdditionalDetail storeMobAccountAdditionalDetail(
			MobAccountAdditionalDetail mobAccountAdditionalDetail) {
		getEntityManager().persist(mobAccountAdditionalDetail);
		getEntityManager().flush();
		return mobAccountAdditionalDetail;
	}

	public MobAccountAddnDetailsHist storeMobAccountAddnDetailsHist(
			MobAccountAddnDetailsHist mobAccountAddnDetailsHist) {
		getEntityManager().persist(mobAccountAddnDetailsHist);
		getEntityManager().flush();
		return mobAccountAddnDetailsHist;
	}

	public MobAccountDetail storeMobAccountDetail(MobAccountDetail mobAccountDetail) {
		getEntityManager().persist(mobAccountDetail);
		getEntityManager().flush();
		return mobAccountDetail;
	}

	public MobAccountDetailsHist storeMobAccountDetailsHist(MobAccountDetailsHist mobAccountDetailsHist) {
		getEntityManager().persist(mobAccountDetailsHist);
		getEntityManager().flush();
		return mobAccountDetailsHist;
	}

	public MobApplAdditionalDtlsHist storeMobApplAdditionalDtlsHist(
			MobApplAdditionalDtlsHist mobApplAdditionalDtlsHist) {
		getEntityManager().persist(mobApplAdditionalDtlsHist);
		getEntityManager().flush();
		return mobApplAdditionalDtlsHist;
	}

	public MobApplCommDetailsHist storeMobApplCommDetailsHist(MobApplCommDetailsHist mobApplCommDetailsHist) {
		getEntityManager().persist(mobApplCommDetailsHist);
		getEntityManager().flush();
		return mobApplCommDetailsHist;
	}

	public MobApplicantAdditionalDtl storeMobApplicantAdditionalDtl(
			MobApplicantAdditionalDtl mobApplicantAdditionalDtl) {
		getEntityManager().persist(mobApplicantAdditionalDtl);
		getEntityManager().flush();
		return mobApplicantAdditionalDtl;
	}

	public MobApplicantCommDetail storeMobApplicantCommDetail(MobApplicantCommDetail mobApplicantCommDetail) {
		getEntityManager().persist(mobApplicantCommDetail);
		getEntityManager().flush();
		return mobApplicantCommDetail;
	}

	public MobApplicantRecordIdHist storeMobApplicantRecordIdHist(MobApplicantRecordIdHist mobApplicantRecordIdHist) {
		getEntityManager().persist(mobApplicantRecordIdHist);
		getEntityManager().flush();
		return mobApplicantRecordIdHist;
	}

	public MobApplicantRecordId storeMobApplicantRecordId(MobApplicantRecordId mobApplicantRecordId) {
		getEntityManager().persist(mobApplicantRecordId);
		getEntityManager().flush();
		return mobApplicantRecordId;
	}

	public MobAppRefRecordId storeMobAppRefRecordId(MobAppRefRecordId mobAppRefRecordId) {
		getEntityManager().persist(mobAppRefRecordId);
		getEntityManager().flush();
		return mobAppRefRecordId;
	}

	public MobApplicantEmploymentDtl storeMobApplicantEmploymentDtl(
			MobApplicantEmploymentDtl mobApplicantEmploymentDtl) {
		getEntityManager().persist(mobApplicantEmploymentDtl);
		getEntityManager().flush();
		return mobApplicantEmploymentDtl;
	}

	public MobApplicantPersonalDetail storeMobApplicantPersonalDetail(
			MobApplicantPersonalDetail mobApplicantPersonalDetail) {
		getEntityManager().persist(mobApplicantPersonalDetail);
		getEntityManager().flush();
		return mobApplicantPersonalDetail;
	}

	public MobApplPersonalDetailsHist storeMobApplPersonalDetailsHist(
			MobApplPersonalDetailsHist mobApplPersonalDetailsHist) {
		getEntityManager().persist(mobApplPersonalDetailsHist);
		getEntityManager().flush();
		return mobApplPersonalDetailsHist;
	}

	public MobApplEmploymentDtlsHist storeMobApplEmploymentDtlsHist(
			MobApplEmploymentDtlsHist mobApplEmploymentDtlsHist) {
		getEntityManager().persist(mobApplEmploymentDtlsHist);
		getEntityManager().flush();
		return mobApplEmploymentDtlsHist;
	}

	/** Sameer **/
	/**
	 * Update Application - check if application id and rm id exist in the table
	 **/

	public Long getAppId(Long appId, String rmUserId) {

		Query query = getEntityManager()
				.createQuery("select ar.id from MobRmAppRefId ar " + "where ar.id=:appid AND ar.rmUsedId=:rmid");
		query.setParameter("appid", appId);
		query.setParameter("rmid", rmUserId);
		Long appid = (Long) query.getSingleResult();
		return appid;
	}

	public Integer updateAplicantRecordId(Long appId, Long recordId) {
		System.out.println("appId ==== " + appId + " " + "recordId ======== " + recordId);

		Query query = getEntityManager()
				.createQuery("update MobApplicantRecordId ma set ma.recordId =:recordid " + "where ma.id =:appid ");
		query.setParameter("appid", appId);
		query.setParameter("recordid", recordId);
		int numberOfRecords = query.executeUpdate();
		System.out.println("numberOfRecords in dao impl in updateAplicantRecordId ========== "+numberOfRecords);
		return numberOfRecords;
	}

	public Long getRecordIdFromAccountDetails(Long appId) {

		Query query = getEntityManager()
				.createQuery("select ma.recordId from MobAccountDetail ma " + "where ma.id =:appid ");
		query.setParameter("appid", appId);
		Long recordId = (Long) query.getSingleResult();
		return recordId;
	}

	public List<MobApplicantRecordId> updateApplicant(AccountCreationRequest accountCreationRequest, ApplicantDetails applicant,
			Long appId, Long recordId, String typeOfApplicant) {

		// get all the details of MobApplicantRecordId 
		Query query5 = getEntityManager().createQuery("From MobApplicantRecordId b where b.id=:apId");
		query5.setParameter("apId", appId);
		List<MobApplicantRecordId> listMobApplicantRecordId=(List<MobApplicantRecordId>) query5.getResultList();
		//System.out.println("mobApplicantRecordId in dao updateApplicant ========= "+listMobApplicantRecordId);
		
		int i=0;
		//for(MobApplicantRecordId mobApplicantRecordId:listMobApplicantRecordId){
		// update MobApplicantCommDetail
		Query query1 = getEntityManager().createQuery("update MobApplicantCommDetail ma set ma.recordId =:recordid,ma.faxNo=:faxno,"
				+ "ma.faxNoCc=:faxNocc,ma.mailAddr1=:mailaddr1,ma.mailAddr2=:mailaddr2,ma.mailAddr3=:mailaddr3,ma.mailCity=:mailcity, ma.mailCountry=:mailcountry,"
				+ "ma.mobNo=:mobno,ma.mobNoCc=:mobNocc,ma.modifiedBy=:modifiedby,ma.modifiedDate=:modifieddate,ma.permAddr1=:permaddr1,ma.permAddr2=:permaddr2,"
				+ "ma.permAddr3=:permaddr3,ma.permCity=:permcity,ma.permCountry=:permcountry,ma.telNoHome=:telNohome,ma.telNoHomeCc=:telNoHomecc, "
				+ "ma.telNoOff=:telNooff,ma.telNoOffCc=:telNoOffcc "
				+ "where ma.id.id =:appid ");
		query1.setParameter("appid", appId);
		query1.setParameter("recordid", recordId);
		query1.setParameter("faxno", applicant.getFaxNo());
		query1.setParameter("faxNocc", applicant.getFaxNoCallingCode());
		query1.setParameter("mailaddr1", applicant.getMailAddr1());
		query1.setParameter("mailaddr2", applicant.getMailAddr2());
		query1.setParameter("mailaddr3", applicant.getMailAddr3());
		query1.setParameter("mailcity", applicant.getMailCity());
		query1.setParameter("mailcountry", applicant.getMailCountry());
		query1.setParameter("mobno", applicant.getMobNo());
		query1.setParameter("mobNocc", applicant.getMobNoCountryCode());
		query1.setParameter("modifiedby", accountCreationRequest.getData().getRmId());
		query1.setParameter("modifieddate", new Date());
		query1.setParameter("permaddr1", applicant.getPermAddr1());
		query1.setParameter("permaddr2", applicant.getPermAddr2());
		query1.setParameter("permaddr3", applicant.getPermAddr3());
		query1.setParameter("permcity", applicant.getPermCity());
		query1.setParameter("permcountry", applicant.getPermCountry());
		query1.setParameter("telNohome", applicant.getTelNoHome());
		query1.setParameter("telNoHomecc", applicant.getTelNoHomeCallingCode());
		query1.setParameter("telNooff", applicant.getTelNoOff());
		query1.setParameter("telNoOffcc", applicant.getTelOffCallingCode());
		
		int numberMobApplicantCommDetail = query1.executeUpdate();
		System.out.println("numberMobApplicantCommDetail in updateApplicant ================== " + numberMobApplicantCommDetail);
		
		// update MobApplicantPersonalDetail
		Query query2 = getEntityManager().createQuery("update MobApplicantPersonalDetail ma set ma.recordId =:recordid,ma.countryBirth=:countrybirth,"
				+ "ma.custCif=:custcif,ma.dob=:dob1,ma.email=:email1,ma.existingCustomer=:existingcustomer,ma.firstName=:firstname,"
				+ "ma.isEmployee=:isemployee,ma.lastName=:lastname,ma.maidenName=:maidenname,ma.maritalStatus=:maritalstatus,ma.middleName=:middlename,"
				+ "ma.modifiedBy=:modifiedby,ma.modifiedDate=:modifieddate,ma.nationality=:nationality1,ma.nic=:nic1,ma.otherBank1=:otherbank1,"
				+ "ma.otherBank2=:otherbank2,ma.otherBank3=:otherbank3,ma.passportExpiryDate=:passportExpirydate,"
				+ "ma.passportNo=:passportno,ma.residencyStatus=:residencystatus,ma.title=:title1,ma.customerType=:customertype,"
				+ "ma.isMinor=:isminor " 
				+ "where ma.id.id =:appid ");
		query2.setParameter("appid", appId);
		query2.setParameter("recordid", recordId);
		query2.setParameter("countrybirth", applicant.getCountryBirth());
		query2.setParameter("custcif", applicant.getCustomerCIF());
		query2.setParameter("dob1", applicant.getDob());
		query2.setParameter("email1", applicant.getEmail());
		query2.setParameter("existingcustomer", applicant.getIsExistingCustomer());
		query2.setParameter("firstname", applicant.getFirstName());
		query2.setParameter("isemployee", applicant.getIsEmployee());
		query2.setParameter("lastname", applicant.getLastName());
		query2.setParameter("maidenname", applicant.getMaidenName());
		query2.setParameter("maritalstatus", applicant.getMaritialStatus());
		query2.setParameter("middlename", applicant.getMiddleName());
		query2.setParameter("modifiedby", accountCreationRequest.getData().getRmId());
		query2.setParameter("modifieddate", new Date());
		query2.setParameter("nationality1", applicant.getNationality());
		query2.setParameter("nic1", applicant.getNic());
		query2.setParameter("otherbank1", applicant.getOtherBank1());
		query2.setParameter("otherbank2", applicant.getOtherBank2());
		query2.setParameter("otherbank3", applicant.getOtherBank3());
		query2.setParameter("passportExpirydate", applicant.getPassportExpDate());
		query2.setParameter("passportno", applicant.getPassportNo());
		query2.setParameter("residencystatus", applicant.getResidencyStatus());
		query2.setParameter("title1", applicant.getTitle());
		query2.setParameter("customertype", typeOfApplicant);
		query2.setParameter("isminor", applicant.getIsMinor());
		
		int numberMobApplicantPersonalDetail = query2.executeUpdate();
		System.out.println("numberMobApplicantPersonalDetail in updateApplicant ================== " + numberMobApplicantPersonalDetail);
		
		// update MobApplicantEmploymentDtl
		Query query3 = getEntityManager().createQuery("update MobApplicantEmploymentDtl ma set ma.recordId =:recordid,ma.annCashDeposit=:annCashdeposit, "
				+ "ma.annCashWithdrawl=:annCashwithdrawl,ma.annDepositTurnovr=:annDepositturnovr,ma.businessSector=:businesssector,ma.currOccupation=:curroccupation, "
				+ "ma.dateStarted=:datestarted,ma.employerAddr1=:employeraddr1,ma.employerAddr2=:employeraddr2,ma.employerAddr3=:employeraddr3, "
				+ "ma.employerCity=:employercity,ma.employerCountry=:employercountry,ma.employerName=:employername,ma.employmentSts=:employmentsts, "
				+ "ma.fundSources=:fundsources,ma.modifiedBy=:modifiedby,ma.modifiedDate=:modifieddate, "
				+ "ma.netMonthlyIncome=:netMonthlyincome,ma.noOfYearsService=:noOfYearsservice,ma.otherSourcesIncome=:otherSourcesincome " 
				+ "where ma.id.id =:appid ");
		query3.setParameter("appid", appId);
		query3.setParameter("recordid", recordId);
		query3.setParameter("annCashdeposit", applicant.getAnnualCashDeposit());
		query3.setParameter("annCashwithdrawl", applicant.getAnnualCashWithdrawl());
		query3.setParameter("annDepositturnovr", applicant.getAnnualDepositTurnover());
		query3.setParameter("businesssector", applicant.getBusinessSector());
		query3.setParameter("curroccupation", applicant.getCurrentOccupation());
		query3.setParameter("datestarted", applicant.getDateStarted());
		query3.setParameter("employeraddr1", applicant.getEmployerAddr1());
		query3.setParameter("employeraddr2", applicant.getEmployerAddr2());
		query3.setParameter("employeraddr3", applicant.getEmployerAddr3());
		query3.setParameter("employercity", applicant.getEmployerCity());
		query3.setParameter("employercountry", applicant.getEmployerCountry());
		query3.setParameter("employername", applicant.getEmployerName());
		query3.setParameter("employmentsts", applicant.getEmploymentStatus());
		query3.setParameter("fundsources", applicant.getFundSources());
		query3.setParameter("modifiedby", accountCreationRequest.getData().getRmId());
		query3.setParameter("modifieddate", new Date());
		query3.setParameter("netMonthlyincome", applicant.getNetMonthlyIncome());
		query3.setParameter("noOfYearsservice", applicant.getNoYearsService());
		query3.setParameter("otherSourcesincome", applicant.getOtherIncomeSource());
		int numberMobApplicantEmploymentDtl = query3.executeUpdate();
		System.out.println("numberMobApplicantEmploymentDtl in updateApplicant ================== " + numberMobApplicantEmploymentDtl);
		
		// update MobApplicantAdditionalDtl
		Query query4 = getEntityManager().createQuery("update MobApplicantAdditionalDtl ma set ma.recordId =:recordid,ma.country1=:country1_1,"
				+ "ma.country2=:country2_2,ma.country3=:country3_3,ma.incomeOtherCountryTax=:incomeOtherCountrytax,ma.incomeUsTaxable=:incomeUstaxable,"
				+ "ma.modifiedBy=:modifiedby,ma.modifiedDate=:modifieddate,ma.oseasAddr1=:oseasaddr1,ma.oseasAddr2=:oseasaddr2,ma.oseasAddr3=:oseasaddr3, "
				+ "ma.oseasCity=:oseascity,ma.oseasCountry=:oseascountry,ma.tin1=:tin1_1,ma.tin2=:tin2_2,ma.tin3=:tin3_3,ma.usCitizen=:uscitizen,ma.usSsn=:usssn,"
				+ "ma.workPermitExpDate=:workPermitExpdate " 
				+ "where ma.id.id =:appid ");
		query4.setParameter("appid", appId);
		query4.setParameter("recordid", recordId);
		query4.setParameter("country1_1", applicant.getCrsCountryResidence1());
		query4.setParameter("country2_2", applicant.getCrsCountryResidence2());
		query4.setParameter("country3_3", applicant.getCrsCountryResidence3());
		query4.setParameter("incomeOtherCountrytax", applicant.getIncomeOtherCountryTaxable());
		query4.setParameter("incomeUstaxable", applicant.getIsIncomeTaxableinUSA());
		query4.setParameter("modifiedby", accountCreationRequest.getData().getRmId());
		query4.setParameter("modifieddate", new Date());
		query4.setParameter("oseasaddr1", applicant.getoAddr1());
		query4.setParameter("oseasaddr2", applicant.getoAddr2());
		query4.setParameter("oseasaddr3", applicant.getoAddr3());
		query4.setParameter("oseascity", applicant.getoCity());
		query4.setParameter("oseascountry", applicant.getoCountry());
		query4.setParameter("tin1_1", applicant.getCrsTin1());
		query4.setParameter("tin2_2", applicant.getCrsTin2());
		query4.setParameter("tin3_3", applicant.getCrsTin3());
		query4.setParameter("uscitizen", applicant.getiSUSCitizen());
		query4.setParameter("usssn", applicant.getUsaSsn());
		query4.setParameter("workPermitExpdate", applicant.getWorkPermitExpDate());
		int numberMobApplicantAdditionalDtl = query4.executeUpdate();
		System.out.println("numberMobApplicantAdditionalDtl in updateApplicant ================== " + numberMobApplicantAdditionalDtl);
//		i++;
	//	}
		return listMobApplicantRecordId;
		
	}

	public void updateAccountDetails(AccountCreationRequest accountCreationRequest, Long appId, Long recordId,
			MobApplicantRecordId[] mobApplicantPrimary, MobApplicantRecordId[] mobGuardianPrimary,
			MobApplicantRecordId[] mobJoint, MobApplicantRecordId[] mobGuardianJoint, 
			AccountDetails accountDetails) {
		System.out.println("appId ==== " + appId + " " + "recordId ======== " + recordId);

		Query query = getEntityManager()
				.createQuery("update MobAccountDetail ma set ma.recordId =:recordid,ma.accountCategory=:accountcategory,ma.accountType=:accounttype,"
						+ "ma.indvApplicantRefNo=:indvApplicantRefno,ma.indvGuardianRefNo=:indvGuardianRefno,ma.joint1ApplicantRefNo=:joint1ApplicantRefno,"
						+ "ma.joint1GuardianRefNo=:joint1GuardianRefno,ma.joint2ApplicantRefNo=:joint2ApplicantRefno,ma.joint2GuardianRefNo=:joint2GuardianRefno,"
						+ "ma.joint3ApplicantRefNo=:joint3ApplicantRefno,ma.joint3GuardianRefNo=:joint3GuardianRefno,ma.joint4ApplicantRefNo=:joint4ApplicantRefno,"
						+ "ma.joint4GuardianRefNo=:joint4GuardianRefno,ma.joint5ApplicantRefNo=:joint5ApplicantRefno,ma.joint5GuardianRefNo=:joint5GuardianRefno,"
						+ "ma.modifiedBy=:modifiedby,ma.modifiedDate=:modifieddate,ma.mop=:mop_1,ma.mop1=:mop1_1,ma.mop2=:mop2_2,ma.mop3=:mop3_3,ma.mop4=:mop4_4,"
						+ "ma.mop5=:mop5_5,ma.mopInstruction1=:mopinstruction1,ma.mopInstruction2=:mopinstruction2,ma.mopInstruction3=:mopinstruction3,"
						+ "ma.mopInstruction4=:mopinstruction4,ma.mopInstruction5=:mopinstruction5,ma.powerAttnGovCountry1=:powerAttnGovcountry1,"
						+ "ma.powerAttnGovCountry2=:powerAttnGovcountry2,ma.powerAttnGovCountry3=:powerAttnGovcountry3,ma.powerAttnGovCountry4=:powerAttnGovcountry4,"
						+ "ma.powerAttnGovCountry5=:powerAttnGovcountry5,ma.powerAttnIssueDate1=:powerAttnIssuedate1,ma.powerAttnIssueDate2=:powerAttnIssuedate2,"
						+ "ma.powerAttnIssueDate3=:powerAttnIssuedate3,ma.powerAttnIssueDate4=:powerAttnIssuedate4,ma.powerAttnIssueDate5=:powerAttnIssuedate5,"
						+ "ma.powerAttnUs1=:powerAttnus1,ma.powerAttnUs2=:powerAttnus2,ma.powerAttnUs3=:powerAttnus3,ma.powerAttnUs4=:powerAttnus4,"
						+ "ma.powerAttnUs5=:powerAttnus5,ma.relationshipMinor1=:relationshipminor1,ma.relationshipMinor2=:relationshipminor2,"
						+ "ma.relationshipMinor3=:relationshipminor3,ma.relationshipMinor4=:relationshipminor4,ma.relationshipMinor5=:relationshipminor5 "
						+ "where ma.id =:appid ");
		
		//for(int i=0;i<mobApplicantPrimary.length;i++){
		query.setParameter("appid", appId);
		query.setParameter("recordid", recordId);
		query.setParameter("accountcategory", accountDetails.getAccountType());
		query.setParameter("accounttype", accountDetails.getAccountType());
		query.setParameter("indvApplicantRefno", mobApplicantPrimary[0].getApplicantId());
		
		if(mobGuardianPrimary != null){
			query.setParameter("indvGuardianRefno", mobGuardianPrimary[1].getApplicantId());
		}
		else{
			query.setParameter("indvGuardianRefNo", null);
		}
		if(mobJoint[0] != null){
		query.setParameter("joint1ApplicantRefno", mobJoint[0].getApplicantId());
		}
		else{
			query.setParameter("joint1ApplicantRefno", null);
		}
		if(mobGuardianJoint[0] != null)
		query.setParameter("joint1GuardianRefno", mobGuardianJoint[0].getApplicantId());
		else{
			query.setParameter("joint1GuardianRefno", null);
		}
		if(mobJoint[1] != null)
		query.setParameter("joint2ApplicantRefno", mobJoint[1].getApplicantId());
		else{
			query.setParameter("joint2ApplicantRefno", null);
		}
		if(mobGuardianJoint[1] != null)
		query.setParameter("joint2GuardianRefno", mobGuardianJoint[1].getApplicantId());
		else{
			query.setParameter("joint2GuardianRefno", null);
		}
		
		if(mobJoint[2] != null)
		query.setParameter("joint3ApplicantRefno", mobJoint[2].getApplicantId());
		else{
			query.setParameter("joint3ApplicantRefno", null);
		}
		
		if(mobGuardianJoint[2] != null)
		query.setParameter("joint3GuardianRefno", mobGuardianJoint[2].getApplicantId());
		else{
			query.setParameter("joint3GuardianRefno", null);
		}
		
		if(mobJoint[3] != null)
		query.setParameter("joint4ApplicantRefno", mobJoint[3].getApplicantId());
		else
			query.setParameter("joint4ApplicantRefno", null);
		
		if(mobGuardianJoint[3] != null)
		query.setParameter("joint4GuardianRefno", mobGuardianJoint[3].getApplicantId());
		else{
			query.setParameter("joint4GuardianRefno", null);
		}
		if(mobJoint[4] != null){
		query.setParameter("joint5ApplicantRefno", mobJoint[4].getApplicantId());
		}
		else{
			query.setParameter("joint5ApplicantRefno", null);
		}
		if(mobGuardianJoint[4] != null){
		query.setParameter("joint5GuardianRefno", mobGuardianJoint[4].getApplicantId());
		}
		else{
			query.setParameter("joint5GuardianRefno", null);
		}
		
		query.setParameter("modifiedby", accountCreationRequest.getData().getRmId());
		query.setParameter("modifieddate", new Date());
		query.setParameter("mop_1", accountDetails.getMop());
		query.setParameter("mop1_1", null);
		query.setParameter("mop2_2", null);
		query.setParameter("mop3_3", null);
		query.setParameter("mop4_4", null);
		query.setParameter("mop5_5", null);
		query.setParameter("mopinstruction1", null);
		query.setParameter("mopinstruction2", null);
		query.setParameter("mopinstruction3", null);
		query.setParameter("mopinstruction4", null);
		query.setParameter("mopinstruction5", null);
		query.setParameter("powerAttnGovcountry1", null);
		query.setParameter("powerAttnGovcountry2", null);
		query.setParameter("powerAttnGovcountry3", null);
		query.setParameter("powerAttnGovcountry4", null);
		query.setParameter("powerAttnGovcountry5", null);
		query.setParameter("powerAttnIssuedate1", null);
		query.setParameter("powerAttnIssuedate2", null);
		query.setParameter("powerAttnIssuedate3", null);
		query.setParameter("powerAttnIssuedate4", null);
		query.setParameter("powerAttnIssuedate5", null);
		query.setParameter("powerAttnus1", false);
		query.setParameter("powerAttnus2", false);
		query.setParameter("powerAttnus3", false);
		query.setParameter("powerAttnus4", false);
		query.setParameter("powerAttnus5", false);
		query.setParameter("relationshipminor1", null);
		query.setParameter("relationshipminor2", null);
		query.setParameter("relationshipminor3", null);
		query.setParameter("relationshipminor4", null);
		query.setParameter("relationshipminor5", null); 
		
		int numberOfRecords = query.executeUpdate();
		System.out.println("numberOfRecords in updateAccountDetails ================== " + numberOfRecords);
		
		
		Query query2 = getEntityManager().createQuery("update MobAccountAdditionalDetail ma set ma.recordId =:recordid,ma.authEmail1=:authemail1,"
				+ "ma.authEmail2=:authemail2,ma.authEmail3=:authemail3,ma.commEmail=:commemail,ma.commSms=:commsms,ma.creditCard=:creditcard,"
				+ "ma.forexBanking=:forexbanking,ma.globalCustody=:globalcustody,ma.hearAboutAfrasia=:hearAboutafrasia,ma.internetBanking=:internetbanking,"
				+ "ma.modifiedBy=:modifiedby,ma.modifiedDate=:modifieddate,ma.nomineeCallbkNum1=:nomineeCallbknum1,"
				+ "ma.nomineeCallbkNum2=:nomineeCallbknum2,ma.nomineeId1=:nomineeid1,ma.nomineeId2=:nomineeid2,"
				+ "ma.nomineeName1=:nomineename1,ma.nomineeName2=:nomineename2,ma.nomineeEmail1=:nomineeemail1,"
				+ "ma.nomineeEmail2=:nomineeemail2,ma.optCallbkServices=:optCallbkservices, " 	 
				+ "ma.optTranEmail=:optTranemail,ma.otpEmail=:otpemail,ma.otpSms=:otpsms,ma.pinViaPost=:pinViapost, "
				+ "ma.pinViaSms=:pinViasms,ma.prefCommMode=:prefCommmode,ma.prepaidCards=:prepaidcards,ma.stmtAddr1=:stmtaddr1, "
				+ "ma.stmtAddr2=:stmtaddr2,ma.stmtAddr3=:stmtaddr3,ma.stmtCity=:stmtcity,ma.stmtCountry=:stmtcountry, "
				+ "ma.stmtDelivery=:stmtdelivery,ma.requireChqBook=:requireChqbook,ma.afrasiaEventQues=:afrasiaEventques,ma.afrasiaEventAns=:afrasiaEventans "
				+ "where ma.id =:appid ");
		
		query2.setParameter("appid", appId);
		query2.setParameter("recordid", recordId);
		query2.setParameter("authemail1", accountDetails.getAuthEmail1());
		query2.setParameter("authemail2", accountDetails.getAuthEmail2());
		query2.setParameter("authemail3", accountDetails.getAuthEmail3());
		query2.setParameter("commemail", accountDetails.getAgreeCommEmail());
		query2.setParameter("commsms", accountDetails.getAgreeCommSMS());
		query2.setParameter("creditcard", accountDetails.getNeedCreditCard());
		query2.setParameter("forexbanking", accountDetails.getNeedForexBanking());
		query2.setParameter("globalcustody", accountDetails.getNeedGlobalCustody());
		query2.setParameter("hearAboutafrasia", accountDetails.getWhrDidYouHearAbtAfrAsia());
		query2.setParameter("internetbanking", accountDetails.getNeedInternetBanking());
		query2.setParameter("modifiedby", accountCreationRequest.getData().getRmId());
		query2.setParameter("modifieddate", new Date());
		int cntr = 0;
		List<NomineeInfo> listNomineeInfo=accountDetails.getNomineeInfo();
		if(listNomineeInfo==null){
			query2.setParameter("nomineeid1", null);
			query2.setParameter("nomineeid2", null);
			query2.setParameter("nomineename1", null);
			query2.setParameter("nomineename2", null);
			query2.setParameter("nomineeCallbknum1", null);
			query2.setParameter("nomineeCallbknum2", null);
			query2.setParameter("nomineeemail1", null);
			query2.setParameter("nomineeemail2", null);
		}else{
		for(NomineeInfo n : listNomineeInfo){
			if(cntr == 0){
				query2.setParameter("nomineeid1", n.getNomineeId());
				query2.setParameter("nomineename1", n.getNomineeName());
				query2.setParameter("nomineeCallbknum1", n.getNomineeCallbkNo());
				query2.setParameter("nomineeemail1", n.getNomineeEmail());
			}
			if(cntr == 1){
				query2.setParameter("nomineeid2", n.getNomineeId());
				query2.setParameter("nomineename2", n.getNomineeName());
				query2.setParameter("nomineeCallbknum2", n.getNomineeCallbkNo());
				query2.setParameter("nomineeemail2", n.getNomineeEmail());
			}
			/*else if(cntr == 2){
				query2.setParameter("nomineeid", n.getNomineeId());
				query2.setParameter("nomineename", n.getNomineeName());
				query2.setParameter("nomineeCallbknum", n.getNomineeCallbkNo());
				query2.setParameter("nomineeemail", n.getNomineeEmail());
			}*/
			
			cntr++;
		}
		}
		query2.setParameter("optCallbkservices", accountDetails.getOptCallBackServices());
		query2.setParameter("optTranemail", accountDetails.getOptTransactionsThruEmail());
		query2.setParameter("otpemail", accountDetails.getOtpOverEmail());
		query2.setParameter("otpsms", accountDetails.getOtpOverSMS());
		query2.setParameter("pinViapost", accountDetails.getPinViaPost());
		query2.setParameter("pinViasms", accountDetails.getOtpOverSMS());
		query2.setParameter("prefCommmode", accountDetails.getPrefCommMode());
		query2.setParameter("prepaidcards", accountDetails.getNeedPrepaidCard());
		query2.setParameter("stmtaddr1", accountDetails.getStmtAddr1());
		query2.setParameter("stmtaddr2", accountDetails.getStmtAddr2());
		query2.setParameter("stmtaddr3", accountDetails.getStmtAddr3());
		query2.setParameter("stmtcity", accountDetails.getStmtCity());
		query2.setParameter("stmtcountry", accountDetails.getStmtCountry());
		query2.setParameter("stmtdelivery", accountDetails.getStmtDelivery());		
		
		if(accountDetails.getRequireChequeBook() == null){
			//mobAccountAdditionalDetail.setRequireChqBook(false);
			query2.setParameter("requireChqbook", false);
		}
		else{
			//mobAccountAdditionalDetail.setRequireChqBook(accountDetails.getRequireChequeBook());
			query2.setParameter("requireChqbook", accountDetails.getRequireChequeBook());
		}
		
		query2.setParameter("afrasiaEventques", accountDetails.getAfrasiaEventQues());
		query2.setParameter("afrasiaEventans", accountDetails.getAfrasiaEventAns());

		int numberMobApplicantAdditionalDtl = query2.executeUpdate();
		System.out.println("numberMobApplicantAdditionalDtl in updateApplicant ================== " + numberMobApplicantAdditionalDtl);

	}
}
