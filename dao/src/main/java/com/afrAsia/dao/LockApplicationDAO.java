package com.afrAsia.dao;

import javax.persistence.NoResultException;

import com.afrAsia.entities.transactions.MobApplCheck;

public interface LockApplicationDAO {
	
	public void storeApplCheckStatus(MobApplCheck mobApplCheck);
	public MobApplCheck getApplCheckStatus(MobApplCheck mobApplCheck) throws NoResultException;
	public void updateApplCheckStatus(MobApplCheck mobApplCheck);
}
