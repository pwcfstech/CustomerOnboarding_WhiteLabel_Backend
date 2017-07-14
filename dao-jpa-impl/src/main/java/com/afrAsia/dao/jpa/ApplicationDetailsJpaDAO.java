package com.afrAsia.dao.jpa;

import com.afrAsia.dao.ApplicationDetailsDao;
import com.afrAsia.entities.jpa.RmApplication;


public interface ApplicationDetailsJpaDAO extends ApplicationDetailsDao {
	public RmApplication getApplicationDetails(Integer appRefId);
}
