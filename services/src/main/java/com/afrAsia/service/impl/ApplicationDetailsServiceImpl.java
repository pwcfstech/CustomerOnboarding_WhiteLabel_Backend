package com.afrAsia.service.impl;

import com.afrAsia.dao.jpa.ApplicationDetailsJpaDAO;
import com.afrAsia.entities.jpa.RmApplication;
import com.afrAsia.service.ApplicationDetailsService;

public class ApplicationDetailsServiceImpl implements ApplicationDetailsService {
	
	
	ApplicationDetailsJpaDAO applicationDetailsDAO;
	
	public ApplicationDetailsJpaDAO getApplicationDetailsDAO() {
		return applicationDetailsDAO;
	}

	public void setapplicationDetailsDAO(ApplicationDetailsJpaDAO applicationDetailsDAO) {
		this.applicationDetailsDAO = applicationDetailsDAO;
	}

	public RmApplication getApplicationDetails(Integer appRefId) {
		System.out.println("here in  Service");
		return applicationDetailsDAO.getApplicationDetails(appRefId);
	}
}
