package com.afrAsia.dao;

import com.afrAsia.entities.jpa.RmApplication;


public interface ApplicationDetailsDao {	
	public RmApplication getApplicationDetails(Integer appRefId);
	
}
