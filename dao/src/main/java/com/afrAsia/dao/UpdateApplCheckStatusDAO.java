package com.afrAsia.dao;

import com.afrAsia.entities.transactions.MobApplCheck;
import com.afrAsia.entities.transactions.MobApplCheckComments;
import com.afrAsia.entities.transactions.MobRmAppRefId;

public interface UpdateApplCheckStatusDAO {
	
	public MobApplCheck storeApplCheckStatus(MobApplCheck mobApplCheck);
	public MobApplCheck getApplCheckStatus(Long recordId);
	public MobApplCheck saveOrUpdate(MobApplCheck entity);
	public void updateApplCheckStatus(MobApplCheck mobApplCheck);
	public void updateAppStatus(MobRmAppRefId mobRmAppRefId);
	public void updateMobApplCheckComm(MobApplCheckComments mobApplCheckComments);
}
