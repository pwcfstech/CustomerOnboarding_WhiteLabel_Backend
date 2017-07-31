package com.afrAsia.service;

import java.util.Date;

import com.afrAsia.entities.response.RmApplicationAppResponse;

public interface RmApplicationsAppService {
	
	public RmApplicationAppResponse getDetailsByefault(String rmId) ;
	
	public RmApplicationAppResponse getDetailsByName(String name,String rmId);

	public RmApplicationAppResponse getDetailsByDates(Date startDate,Date endDate,String rmId);
	
	public RmApplicationAppResponse getDetailsByStatus(String status,String rmId);
	
	public RmApplicationAppResponse getDetailsByAllCriteriaWithoutStatus(String name,Date startDate,Date endDate,String rmId);
	
	public RmApplicationAppResponse getDetailsByAllCriteriaWithStatus(String name,Date startDate,Date endDate,String status,String rmId);
}
