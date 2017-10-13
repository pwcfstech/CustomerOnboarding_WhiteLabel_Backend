package com.afrAsia.dao;

import javax.persistence.NoResultException;

import com.afrAsia.entities.transactions.MobApplCheck;
import com.afrAsia.entities.transactions.MobApplCheckComments;
import com.afrAsia.entities.transactions.MobApplicantPersonalDetail;
import com.afrAsia.entities.transactions.MobRmAppRefId;

public interface UpdateApplCheckStatusDAO {
	
	public MobApplCheck storeApplCheckStatus(MobApplCheck mobApplCheck);
	public MobApplCheck getApplCheckStatus(Long recordId)  throws NoResultException;
	public MobApplCheck saveOrUpdate(MobApplCheck entity);
	public void updateApplCheckStatus(MobApplCheck mobApplCheck);
	public void updateAppStatus(MobRmAppRefId mobRmAppRefId);
	public MobApplCheckComments storeApplCheckComm(MobApplCheckComments mobApplCheckComments);
	public MobApplCheckComments getApplCheckComm(Long refId, Long recordId);
	public void updateMobApplCheckComm(MobApplCheckComments mobApplCheckComments);
	public MobRmAppRefId getMobAppRefId(Long refId);
}
