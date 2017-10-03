package com.afrAsia.dao.jpa;

import javax.persistence.NoResultException;

import com.afrAsia.dao.LockApplicationDAO;
import com.afrAsia.entities.transactions.MobApplCheck;

public interface LockApplicationJpaDao extends LockApplicationDAO {
	
	public void storeApplCheckStatus(MobApplCheck mobApplCheck);
	public MobApplCheck getApplCheckStatus(MobApplCheck mobApplCheck) throws NoResultException;
	public void updateApplCheckStatus(MobApplCheck mobApplCheck);
}
