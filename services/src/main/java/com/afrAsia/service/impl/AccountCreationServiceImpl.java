package com.afrAsia.service.impl;

import com.afrAsia.dao.jpa.AccountCreateJpaDao;
import com.afrAsia.dao.jpa.MobRmAppRefIdJpaDao;
import com.afrAsia.entities.request.AccountCreationRequest;
import com.afrAsia.entities.response.AccountCreateResponse;
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
	
	
	private AccountCreateJpaDao accountCreateDao;
	
	public AccountCreateResponse createAccount(AccountCreationRequest accountCreationRequest) {
		MobRmAppRefId mobRmAppRefId=new MobRmAppRefId();
		MobAppRefRecordId mobAppRefRecordId=new MobAppRefRecordId();
     	MobAccountAdditionalDetail mobAccountAdditionalDetail=new MobAccountAdditionalDetail();
     	
     	MobAccountDetail mobAccountDetail= new MobAccountDetail();
     	
     	MobApplicantAdditionalDtl mobApplicantAdditionalDtl= new MobApplicantAdditionalDtl(); 
     	MobApplicantCommDetail mobApplicantCommDetail= new MobApplicantCommDetail();
     	MobApplicantEmploymentDtl mobApplicantEmploymentDtl= new MobApplicantEmploymentDtl();
     	MobApplicantPersonalDetail  mobApplicantPersonalDetail= new MobApplicantPersonalDetail();
     	MobApplicantRecordId mobApplicantRecordId= new MobApplicantRecordId();
     	
     	
     	//need to set from request object
     	 mobRmAppRefId=accountCreateDao.storeMobRmAppRefId(mobRmAppRefId);
     	 
     	 mobAppRefRecordId=accountCreateDao.storeMobAppRefRecordId(mobAppRefRecordId);
     	 
     	 mobApplicantRecordId=accountCreateDao.storeMobApplicantRecordId(mobApplicantRecordId);
     	 
     	 accountCreateDao.storeMobApplicantPersonalDetail(mobApplicantPersonalDetail);
     	 accountCreateDao.storeMobApplicantAdditionalDtl(mobApplicantAdditionalDtl);
     	 accountCreateDao.storeMobAccountDetail(mobAccountDetail);
     	 accountCreateDao.storeMobAccountAdditionalDetail(mobAccountAdditionalDetail);
     	 accountCreateDao.storeMobApplicantCommDetail(mobApplicantCommDetail);
     	 accountCreateDao.storeMobApplicantEmploymentDtl(mobApplicantEmploymentDtl);
     	 
     	 
     	 
     	 
     	 
     	 
     	 
     	
		return null;
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
