package com.afrAsia.service;

import com.afrAsia.entities.jpa.RmApplication;


public interface ApplicationDetailsService {
	public RmApplication getApplicationDetails(Integer appRefId);
}
