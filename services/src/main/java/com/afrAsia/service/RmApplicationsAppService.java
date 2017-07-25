package com.afrAsia.service;

import java.util.Date;

import com.afrAsia.entities.response.RmApplicationAppResponse;

public interface RmApplicationsAppService {
	
	public RmApplicationAppResponse getDetailsByNameAndID(Long id, String name);

	public RmApplicationAppResponse getDetailsByDates(Date startDate,Date endDate);
	
	public RmApplicationAppResponse getDetailsById(Long id);

	public RmApplicationAppResponse getDetailsByStatus(String status);
	
}
