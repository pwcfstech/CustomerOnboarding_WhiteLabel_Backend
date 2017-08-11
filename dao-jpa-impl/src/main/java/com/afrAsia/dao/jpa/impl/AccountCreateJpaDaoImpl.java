package com.afrAsia.dao.jpa.impl;

import java.util.Date;

import javax.persistence.Query;

import com.afrAsia.dao.jpa.AccountCreateJpaDao;
import com.afrAsia.entities.request.AccountCreationRequest;
import com.afrAsia.entities.request.AccountUpdateRequest.AccountDetails;
import com.afrAsia.entities.request.ApplicantDetails;
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
		System.out.println("Value for RM Id table : " + mobRmAppRefId.toString());
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
		return numberOfRecords;
	}

	public Long getRecordIdFromAccountDetails(Long appId) {

		Query query = getEntityManager()
				.createQuery("select ma.recordId from MobAccountDetail ma " + "where ma.id =:appid ");
		query.setParameter("appid", appId);
		Long recordId = (Long) query.getSingleResult();
		return recordId;
	}

	public MobApplicantRecordId updateApplicant(AccountCreationRequest accountCreationRequest, ApplicantDetails applicant,
			Long appId, Long recordId, String typeOfApplicant) {

		// update MobApplicantCommDetail
		Query query1 = getEntityManager().createQuery("update MobApplicantCommDetail ma set ma.recordId =:recordid,ma.faxNo=:faxNo,"
				+ "ma.faxNoCc=:faxNoCc,ma.mailAddr1=:mailAddr1,ma.mailAddr2=:mailAddr2,ma.mailAddr3=:mailAddr3,ma.mailCity=:mailCity, ma.mailCountry=:mailCountry,"
				+ "ma.mobNo=:mobNo,ma.mobNoCc=:mobNoCc,ma.modifiedBy=:modifiedBy,ma.modifiedDate=:modifiedDate,ma.permAddr1=:permAddr1,ma.permAddr2=:permAddr2,"
				+ "ma.permAddr3=:permAddr3,ma.permCity=:permCity,ma.permCountry=:permCountry,ma.telNoHome=:telNoHome,ma.telNoHomeCc=:telNoHomeCc, "
				+ "ma.telNoOff=:telNoOff,ma.telNoOffCc=:telNoOffCc "
				+ "where ma.id =:appid ");
		query1.setParameter("appid", appId);
		query1.setParameter("recordid", recordId);
		query1.setParameter("faxNo", applicant.getFaxNo());
		query1.setParameter("faxNoCc", applicant.getFaxNoCallingCode());
		query1.setParameter("mailAddr1", applicant.getMailAddr1());
		query1.setParameter("mailAddr2", applicant.getMailAddr2());
		query1.setParameter("mailAddr3", applicant.getMailAddr3());
		query1.setParameter("mailCity", applicant.getMailCity());
		query1.setParameter("mailCountry", applicant.getMailCountry());
		query1.setParameter("mobNo", applicant.getMobNo());
		query1.setParameter("mobNoCc", applicant.getMobNoCountryCode());
		query1.setParameter("modifiedBy", accountCreationRequest.getData().getRmId());
		query1.setParameter("modifiedDate", new Date());
		query1.setParameter("permAddr1", applicant.getPermAddr1());
		query1.setParameter("permAddr2", applicant.getPermAddr2());
		query1.setParameter("permAddr3", applicant.getPermAddr3());
		query1.setParameter("permCity", applicant.getPermCity());
		query1.setParameter("permCountry", applicant.getPermCountry());
		query1.setParameter("telNoHome", applicant.getTelNoHome());
		query1.setParameter("telNoHomeCc", applicant.getTelNoHomeCallingCode());
		query1.setParameter("telNoOff", applicant.getTelNoOff());
		query1.setParameter("telNoOffCc", applicant.getTelOffCallingCode());
		
		int numberMobApplicantCommDetail = query1.executeUpdate();
		System.out.println("numberMobApplicantCommDetail in updateApplicant ================== " + numberMobApplicantCommDetail);
		
		// update MobApplicantPersonalDetail
		Query query2 = getEntityManager().createQuery("update MobApplicantPersonalDetail ma set ma.recordId =:recordid,ma.countryBirth=:countryBirth, "
				+ "ma.custCif=:custCif,,ma.dob=:dob,ma.email=:email,ma.existingCustomer=:existingCustomer,ma.firstName=:firstName, "
				+ "ma.isEmployee=:isEmployee,ma.lastName=:lastName,ma.maidenName=:maidenName,ma.maritalStatus=:maritalStatus,ma.middleName=:middleName,"
				+ "ma.modifiedBy=:modifiedBy,ma.modifiedDate=:modifiedDate,ma.nationality=:nationality,ma.nic=:nic,ma.otherBank1=:otherBank1,"
				+ "ma.otherBank2=:otherBank2,ma.otherBank3=:otherBank3,ma.passportExpiryDate=:passportExpiryDate, "
				+ "ma.passportNo=:passportNo,ma.residencyStatus=:residencyStatus,ma.title=:title, " 
				+ "where ma.id =:appid ");
		query2.setParameter("appid", appId);
		query2.setParameter("recordid", recordId);
		query2.setParameter("countryBirth", applicant.getCountryBirth());
		query2.setParameter("custCif", applicant.getCustomerCIF());
		query2.setParameter("dob", applicant.getDob());
		query2.setParameter("email", applicant.getEmail());
		query2.setParameter("existingCustomer", applicant.getIsExistingCustomer());
		query2.setParameter("firstName", applicant.getFirstName());
		query2.setParameter("isEmployee", applicant.getIsEmployee());
		query2.setParameter("lastName", applicant.getLastName());
		query2.setParameter("maidenName", applicant.getMaidenName());
		query2.setParameter("maritalStatus", applicant.getMaritialStatus());
		query2.setParameter("middleName", applicant.getMiddleName());
		query2.setParameter("modifiedBy", accountCreationRequest.getData().getRmId());
		query2.setParameter("modifiedDate", new Date());
		query2.setParameter("nationality", applicant.getNationality());
		query2.setParameter("nic", applicant.getNic());
		query2.setParameter("otherBank1", applicant.getOtherBank1());
		query2.setParameter("otherBank2", applicant.getOtherBank2());
		query2.setParameter("otherBank3", applicant.getOtherBank3());
		query2.setParameter("passportExpiryDate", applicant.getPassportExpDate());
		query2.setParameter("passportNo", applicant.getPassportNo());
		query2.setParameter("residencyStatus", applicant.getResidencyStatus());
		query2.setParameter("title", applicant.getTitle());
		int numberMobApplicantPersonalDetail = query2.executeUpdate();
		System.out.println("numberMobApplicantPersonalDetail in updateApplicant ================== " + numberMobApplicantPersonalDetail);
		
		// update MobApplicantEmploymentDtl
		Query query3 = getEntityManager().createQuery("update MobApplicantEmploymentDtl ma set ma.recordId =:recordid,ma.annCashDeposit=:annCashDeposit,"
				+ "ma.annCashWithdrawl=:annCashWithdrawl,ma.annDepositTurnovr=:annDepositTurnovr,ma.businessSector=:businessSector,ma.currOccupation=:currOccupation,"
				+ "ma.dateStarted=:dateStarted,ma.employerAddr1=:employerAddr1,ma.employerAddr2=:employerAddr2,ma.employerAddr3=:employerAddr3,"
				+ "ma.employerCity=:employerCity,ma.employerCountry=:employerCountry,ma.employerName=:employerName,ma.employmentSts=:employmentSts,"
				+ "ma.fundSources=:fundSources,ma.modifiedBy=:modifiedBy,ma.modifiedDate=:modifiedDate, "
				+ "ma.netMonthlyIncome=:netMonthlyIncome,ma.noOfYearsService=:noOfYearsService,ma.otherSourcesIncome=:otherSourcesIncome " 
				+ "where ma.id =:appid ");
		query3.setParameter("appid", appId);
		query3.setParameter("recordid", recordId);
		query3.setParameter("annCashDeposit", applicant.getAnnualCashDeposit());
		query3.setParameter("annCashWithdrawl", applicant.getAnnualCashWithdrawl());
		query3.setParameter("annDepositTurnovr", applicant.getAnnualDepositTurnover());
		query3.setParameter("businessSector", applicant.getBusinessSector());
		query3.setParameter("currOccupation", recordId);
		query3.setParameter("dateStarted", applicant.getDateStarted());
		query3.setParameter("employerAddr1", applicant.getEmployerAddr1());
		query3.setParameter("employerAddr2", applicant.getEmployerAddr2());
		query3.setParameter("employerAddr3", applicant.getEmployerAddr3());
		query3.setParameter("maritalStatus", applicant.getMaritialStatus());
		query3.setParameter("employerCity", applicant.getEmployerCity());
		query3.setParameter("employerCountry", applicant.getEmployerCountry());
		query3.setParameter("employerName", applicant.getEmployerName());
		query3.setParameter("employmentSts", applicant.getEmploymentStatus());
		query3.setParameter("fundSources", applicant.getFundSources());
		query3.setParameter("modifiedBy", accountCreationRequest.getData().getRmId());
		query3.setParameter("modifiedDate", new Date());
		query3.setParameter("netMonthlyIncome", applicant.getNetMonthlyIncome());
		query3.setParameter("noOfYearsService", applicant.getNoYearsService());
		query3.setParameter("otherSourcesIncome", applicant.getOtherIncomeSource());
		int numberMobApplicantEmploymentDtl = query3.executeUpdate();
		System.out.println("numberMobApplicantEmploymentDtl in updateApplicant ================== " + numberMobApplicantEmploymentDtl);
		
		// update MobApplicantAdditionalDtl
		Query query4 = getEntityManager().createQuery("update MobApplicantAdditionalDtl ma set ma.recordId =:recordid,ma.country1=:country1,"
				+ "ma.country2=:country2,ma.country3=:country3,ma.incomeOtherCountryTax=:incomeOtherCountryTax,ma.incomeUsTaxable=:incomeUsTaxable,"
				+ "ma.modifiedBy=:modifiedBy,ma.modifiedDate=:modifiedDate,ma.oseasAddr1=:oseasAddr1,ma.oseasAddr2=:oseasAddr2,ma.oseasAddr3=:oseasAddr3, "
				+ "ma.oseasCity=:oseasCity,ma.oseasCountry=:oseasCountry,ma.tin1=:tin1,ma.tin2=:tin2,ma.tin3=:tin3,ma.usCitizen=:usCitizen,ma.usSsn=:usSsn,"
				+ "ma.workPermitExpDate=:workPermitExpDate " 
				+ "where ma.id =:appid ");
		query4.setParameter("appid", appId);
		query4.setParameter("recordid", recordId);
		query4.setParameter("country1", applicant.getCrsCountryResidence1());
		query4.setParameter("country2", applicant.getCrsCountryResidence2());
		query4.setParameter("country3", applicant.getCrsCountryResidence3());
		query4.setParameter("incomeOtherCountryTax", applicant.getIncomeOtherCountryTaxable());
		query4.setParameter("incomeUsTaxable", applicant.getIsIncomeTaxableinUSA());
		query4.setParameter("modifiedBy", accountCreationRequest.getData().getRmId());
		query4.setParameter("modifiedDate", new Date());
		query4.setParameter("oseasAddr1", applicant.getoAddr1());
		query4.setParameter("oseasAddr2", applicant.getoAddr2());
		query4.setParameter("oseasAddr3", applicant.getoAddr3());
		query4.setParameter("oseasCity", applicant.getoCity());
		query4.setParameter("oseasCountry", applicant.getoCountry());
		query4.setParameter("tin1", applicant.getCrsTin1());
		query4.setParameter("tin2", applicant.getCrsTin2());
		query4.setParameter("tin3", applicant.getCrsTin3());
		query4.setParameter("usCitizen", applicant.getiSUSCitizen());
		query4.setParameter("usSsn", applicant.getUsaSsn());
		query4.setParameter("workPermitExpDate", applicant.getWorkPermitExpDate());
		int numberMobApplicantAdditionalDtl = query4.executeUpdate();
		System.out.println("numberMobApplicantAdditionalDtl in updateApplicant ================== " + numberMobApplicantAdditionalDtl);
		return null;
		
	}

	public void updateAccountDetails(AccountCreationRequest accountCreationRequest, Long appId, Long recordId,
			MobApplicantRecordId mobApplicantPrimary, MobApplicantRecordId mobGuardianPrimary,
			MobApplicantRecordId[] mobJoint, MobApplicantRecordId[] mobGuardianJoint, 
			com.afrAsia.entities.request.AccountCreationRequest.AccountDetails accountDetails) {
		System.out.println("appId ==== " + appId + " " + "recordId ======== " + recordId);

		Query query = getEntityManager()
				.createQuery("update MobAccountDetail ma set ma.recordId =:recordid,ma.accountCategory=:accountCategory,ma.accountType=:accountType,"
						+ "ma.indvApplicantRefNo=:indvApplicantRefNo,ma.indvGuardianRefNo=:indvGuardianRefNo,ma.joint1ApplicantRefNo=:joint1ApplicantRefNo,"
						+ "ma.joint1GuardianRefNo=:joint1GuardianRefNo,ma.joint2ApplicantRefNo=:joint2ApplicantRefNo,ma.joint2GuardianRefNo=:joint2GuardianRefNo,"
						+ "ma.joint3ApplicantRefNo=:joint3ApplicantRefNo,ma.joint3GuardianRefNo=:joint3GuardianRefNo,ma.joint4ApplicantRefNo=;joint4ApplicantRefNo,"
						+ "ma.joint4GuardianRefNo=;joint4GuardianRefNo,ma.joint5ApplicantRefNo=:joint5ApplicantRefNo,ma.joint5GuardianRefNo=:joint5GuardianRefNo,"
						+ "ma.modifiedBy=:modifiedBy,ma.modifiedDate=:modifiedDate,ma.mop=:mop,,ma.mop1=:mop1,ma.mop2=:mop2,ma.mop3=:mop3,ma.mop4=:mop4,ma.mop5=:mop5,"
						+ "ma.mopInstruction1=:mopInstruction1,ma.mopInstruction2=:mopInstruction2,ma.mopInstruction3=:mopInstruction3,"
						+ "ma.mopInstruction4=:mopInstruction4,ma.mopInstruction5=:mopInstruction5,ma.powerAttnGovCountry1=:powerAttnGovCountry1,"
						+ "ma.powerAttnGovCountry2=:powerAttnGovCountry2,ma.powerAttnGovCountry3=:powerAttnGovCountry3,ma.powerAttnGovCountry4=:powerAttnGovCountry4,"
						+ "ma.powerAttnGovCountry5=:powerAttnGovCountry5,ma.powerAttnIssueDate1=:powerAttnIssueDate1,ma.powerAttnIssueDate2=:powerAttnIssueDate2,"
						+ "ma.powerAttnIssueDate3=:powerAttnIssueDate3,ma.powerAttnIssueDate4=:powerAttnIssueDate4,ma.powerAttnIssueDate5=:powerAttnIssueDate5,"
						+ "ma.powerAttnUs1=:powerAttnUs1,ma.powerAttnUs2=:powerAttnUs2,ma.powerAttnUs3=:powerAttnUs3,ma.powerAttnUs4=:powerAttnUs4,"
						+ "ma.powerAttnUs5=:powerAttnUs5,ma.relationshipMinor1=:relationshipMinor1,ma.relationshipMinor2=:relationshipMinor2,"
						+ "ma.relationshipMinor3=:relationshipMinor3,ma.relationshipMinor4=:relationshipMinor4,ma.relationshipMinor5=:relationshipMinor5 "
						+ "where ma.id =:appid ");
		query.setParameter("appid", appId);
		query.setParameter("recordid", recordId);
		query.setParameter("recordid", recordId);
		query.setParameter("recordid", recordId);
		query.setParameter("recordid", recordId);
		query.setParameter("recordid", recordId);
		query.setParameter("recordid", recordId);
		query.setParameter("recordid", recordId);
		query.setParameter("recordid", recordId);
		query.setParameter("recordid", recordId);
		query.setParameter("recordid", recordId);
		query.setParameter("recordid", recordId);
		query.setParameter("recordid", recordId);
		query.setParameter("recordid", recordId);
		query.setParameter("recordid", recordId);
		query.setParameter("recordid", recordId);
		query.setParameter("recordid", recordId);
		query.setParameter("recordid", recordId);
		query.setParameter("recordid", recordId);
		query.setParameter("recordid", recordId);
		query.setParameter("recordid", recordId);
		query.setParameter("recordid", recordId);
		query.setParameter("recordid", recordId);
		query.setParameter("recordid", recordId);
		query.setParameter("recordid", recordId);
		query.setParameter("recordid", recordId);
		query.setParameter("recordid", recordId);
		query.setParameter("recordid", recordId);
		query.setParameter("recordid", recordId);
		query.setParameter("recordid", recordId);
		query.setParameter("recordid", recordId);
		query.setParameter("recordid", recordId);
		query.setParameter("recordid", recordId);
		query.setParameter("recordid", recordId);
		query.setParameter("recordid", recordId);
		query.setParameter("recordid", recordId);
		query.setParameter("recordid", recordId);
		query.setParameter("recordid", recordId);
		query.setParameter("recordid", recordId);
		query.setParameter("recordid", recordId);
		query.setParameter("recordid", recordId);
		query.setParameter("recordid", recordId);
		query.setParameter("recordid", recordId);
		query.setParameter("recordid", recordId);
		query.setParameter("recordid", recordId);
		query.setParameter("recordid", recordId);
		query.setParameter("recordid", recordId);
		query.setParameter("recordid", recordId);
		query.setParameter("recordid", recordId);
		int numberOfRecords = query.executeUpdate();
		System.out.println("numberOfRecords in updateAccountDetails ================== " + numberOfRecords);
	}
}
