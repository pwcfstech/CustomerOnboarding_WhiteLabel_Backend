package com.afrAsia.service;

import java.util.Date;

import com.afrAsia.entities.response.RmApplicationAppResponse;

public interface ComplianceService {
	
	public RmApplicationAppResponse getDetailsByefault(String status) ;
	
	public RmApplicationAppResponse getDetailsByName(String name,String status);

	public RmApplicationAppResponse getDetailsByDates(Date startDate,Date endDate,String status);
	
	public RmApplicationAppResponse getDetailsByAllCriteria(String name,Date startDate,Date endDate,String status);
	
}
