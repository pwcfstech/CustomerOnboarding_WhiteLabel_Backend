package com.afrAsia.dao.jpa.impl;


import com.afrAsia.dao.jpa.AccountCreateJpaDao;
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

public class AccountCreateJpaDaoImpl extends BaseJpaDAOImpl<String, MobAppRefRecordId> implements AccountCreateJpaDao {

	public MobRmAppRefId storeMobRmAppRefId(MobRmAppRefId mobRmAppRefId) {
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



	

}
