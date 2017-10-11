package com.afrAsia.service.impl;


import java.util.Date;

import javax.persistence.NoResultException;

import org.apache.log4j.Logger;
import org.springframework.transaction.annotation.Transactional;

import com.afrAsia.dao.LockApplicationDAO;
import com.afrAsia.entities.request.LockApplicationRequest;
import com.afrAsia.entities.response.LockApplicationResponse;
import com.afrAsia.entities.transactions.MobApplCheck;
import com.afrAsia.service.LockApplicationService;
import com.afrAsia.entities.response.LockApplicationResponse.Data;

public class LockApplicationServiceImpl implements LockApplicationService {
	
	final static Logger debugLog = Logger.getLogger("debugLogger");
	final static Logger infoLog = Logger.getLogger("infoLogger");
	final static Logger errorLog = Logger.getLogger("errorLogger");

	private LockApplicationDAO lockApplicationDAO;

	public LockApplicationDAO getLockApplicationDAO() {
		return lockApplicationDAO;
	}


	public void setLockApplicationDAO(LockApplicationDAO lockApplicationDAO) {
		this.lockApplicationDAO = lockApplicationDAO;
	}

	@Override
	public String toString() {
		return "LockApplicationServiceImpl [lockApplicationDAO=" + lockApplicationDAO + "]";
	}

	@Transactional(readOnly = false, rollbackFor = {Exception.class})
	public LockApplicationResponse lockAccount(LockApplicationRequest lockApplicationRequest) {

		LockApplicationResponse lockApplicationResponse=new LockApplicationResponse();
		Data data = new LockApplicationResponse().new Data();
		try{
			MobApplCheck mobApplCheck = lockApplicationDAO.getApplCheckStatus(lockApplicationRequest.getData().getRefId(),lockApplicationRequest.getData().getRecordId());
			mobApplCheck.setLockedBy(lockApplicationRequest.getData().getUserId());
			mobApplCheck.setIsAppLocked(lockApplicationRequest.getData().getLockApp());
			mobApplCheck.setModifiedBy(lockApplicationRequest.getData().getUserId());
			mobApplCheck.setModifiedDate(new Date());
			lockApplicationDAO.updateApplCheckStatus(mobApplCheck);
		}
		catch(NoResultException e)
		{
			MobApplCheck mobApplCheck = new MobApplCheck();
			mobApplCheck.setId(lockApplicationRequest.getData().getRefId());
			mobApplCheck.setRecordId(lockApplicationRequest.getData().getRecordId());
			mobApplCheck.setLockedBy(lockApplicationRequest.getData().getUserId());
			mobApplCheck.setIsAppLocked(lockApplicationRequest.getData().getLockApp());
			mobApplCheck.setKycDone(false);
			mobApplCheck.setCcDone(false);
			mobApplCheck.setIcDone(false);
			mobApplCheck.setWcDone(false);
			mobApplCheck.setCreatedBy(lockApplicationRequest.getData().getUserId());
			mobApplCheck.setCreatedDate(new Date());
			mobApplCheck.setModifiedBy(lockApplicationRequest.getData().getUserId());
			mobApplCheck.setModifiedDate(new Date());
			lockApplicationDAO.storeApplCheckStatus(mobApplCheck);
		}
		 
		data.setSuccess("Y");
		lockApplicationResponse.setData(data);
		infoLog.info(" lockApplicationResponse is : "+lockApplicationResponse.toString());
		return lockApplicationResponse;
	}


	
}