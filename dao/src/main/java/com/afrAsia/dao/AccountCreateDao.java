package com.afrAsia.dao;

import java.util.List;

import com.afrAsia.entities.request.AccountCreationRequest;
import com.afrAsia.entities.request.ApplicantDetails;
import com.afrAsia.entities.request.AccountUpdateRequest.AccountDetails;
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

public interface AccountCreateDao {
	public MobRmAppRefId storeMobRmAppRefId(MobRmAppRefId mobRmAppRefId);

	public MobAccountAdditionalDetail storeMobAccountAdditionalDetail(
			MobAccountAdditionalDetail mobAccountAdditionalDetail);

	public MobAccountAddnDetailsHist storeMobAccountAddnDetailsHist(
			MobAccountAddnDetailsHist mobAccountAddnDetailsHist);

	public MobAccountDetail storeMobAccountDetail(MobAccountDetail mobAccountDetail);

	public MobAccountDetailsHist storeMobAccountDetailsHist(MobAccountDetailsHist mobAccountDetailsHist);

	public MobApplAdditionalDtlsHist storeMobApplAdditionalDtlsHist(
			MobApplAdditionalDtlsHist mobApplAdditionalDtlsHist);

	public MobApplCommDetailsHist storeMobApplCommDetailsHist(MobApplCommDetailsHist mobApplCommDetailsHist);

	public MobApplicantAdditionalDtl storeMobApplicantAdditionalDtl(
			MobApplicantAdditionalDtl mobApplicantAdditionalDtl);

	public MobApplicantCommDetail storeMobApplicantCommDetail(MobApplicantCommDetail mobApplicantCommDetail);

	public MobApplicantEmploymentDtl storeMobApplicantEmploymentDtl(
			MobApplicantEmploymentDtl mobApplicantEmploymentDtl);

	public MobApplicantPersonalDetail storeMobApplicantPersonalDetail(
			MobApplicantPersonalDetail mobApplicantPersonalDetail);

	public MobApplicantRecordIdHist storeMobApplicantRecordIdHist(MobApplicantRecordIdHist mobApplicantRecordIdHist);

	public MobApplicantRecordId storeMobApplicantRecordId(MobApplicantRecordId mobApplicantRecordId);

	public MobApplPersonalDetailsHist storeMobApplPersonalDetailsHist(
			MobApplPersonalDetailsHist mobApplPersonalDetailsHist);

	public MobAppRefRecordId storeMobAppRefRecordId(MobAppRefRecordId mobAccountAddnDetailsHist);

	public MobApplEmploymentDtlsHist storeMobApplEmploymentDtlsHist(
			MobApplEmploymentDtlsHist mobApplEmploymentDtlsHist);

	public Long getAppId(Long appId, String rmUserid);

	public Integer updateAplicantRecordId(Long appId, Long recordId);

	public Long getRecordIdFromAccountDetails(Long appId);

	public List<MobApplicantRecordId> updateApplicant(AccountCreationRequest accountCreationRequest, ApplicantDetails primaryApplicant,
			Long appId, Long recordId, String typeOfApplicant);

	public void updateAccountDetails(AccountCreationRequest accountCreationRequest, Long appId, Long recordId,
			MobApplicantRecordId[] mobApplicantPrimary, MobApplicantRecordId[] mobGuardianPrimary,
			MobApplicantRecordId[] mobJoint, MobApplicantRecordId[] mobGuardianJoint, com.afrAsia.entities.request.AccountCreationRequest.AccountDetails accountDetails);

	public void storeIntoMobApplKycDocumentsHist(Long appid);
}
