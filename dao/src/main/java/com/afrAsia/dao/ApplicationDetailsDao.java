package com.afrAsia.dao;

import java.util.List;

import com.afrAsia.entities.transactions.MobAccountAdditionalDetail;
import com.afrAsia.entities.transactions.MobAccountDetail;
import com.afrAsia.entities.transactions.MobAppRefRecordId;
import com.afrAsia.entities.transactions.MobApplicantAdditionalDtl;
import com.afrAsia.entities.transactions.MobApplicantCommDetail;
import com.afrAsia.entities.transactions.MobApplicantEmploymentDtl;
import com.afrAsia.entities.transactions.MobApplicantKycDocuments;
import com.afrAsia.entities.transactions.MobApplicantPersonalDetail;
import com.afrAsia.entities.transactions.MobApplicantRecordId;
import com.afrAsia.entities.transactions.MobComments;
import com.afrAsia.entities.transactions.MobRmAppRefId;

public interface ApplicationDetailsDao {
	public MobRmAppRefId getApplicationDetails(Long appRefId);

	public MobAccountDetail getMobAccountDetails(Long appRefId);

	public MobAccountAdditionalDetail getMobAccountAdditionalDetails(Long appRefId);

	public List<MobApplicantRecordId> getMobApplicantRecordId(Long appRefId);
	
	public MobAppRefRecordId getRecordId(Long appRefId);

	public MobApplicantPersonalDetail getMobApplicantPersonalDetails(Long appRefId, Long applicantId);

	public MobApplicantCommDetail getMobApplicantCommDetails(Long appRefId, Long applicantId);

	public MobApplicantEmploymentDtl getMobApplicantEmploymentDtl(Long appRefId, Long applicantId);

	public MobApplicantAdditionalDtl getMobApplicantAdditionalDtl(Long appRefId, Long applicantId);

	public List<MobApplicantKycDocuments> getMobApplicantKyc(Long appRefId, Long applicantId);
	
	public MobApplicantKycDocuments getKycDocumentDetails(Long appRefId, Long applicantId, String docId);

	public List<MobComments> getComments(Long appRefId);

	public MobApplicantKycDocuments  getMobApplicantKycSingleResult(Long appRefId, Long applicantId);
	
	public MobApplicantKycDocuments  getMobApplicantKycSingleResult(Long appRefId);
	
	public List<MobApplicantKycDocuments> getMobApplicantKyc(Long appid); 
}
