package com.afrAsia.service;

import java.util.Date;

import com.afrAsia.entities.response.ComplianceResponse;

public interface ComplianceService {
	
	public ComplianceResponse getDetailsBydefault() ;
	
	public ComplianceResponse getDetailsByName(String name,String status);

	public ComplianceResponse getDetailsByDates(Date startDate,Date endDate,String status);
	
	public ComplianceResponse getDetailsByAllCriteria(String name,Date startDate,Date endDate,String status);
	
}
