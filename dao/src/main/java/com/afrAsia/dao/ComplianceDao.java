package com.afrAsia.dao;

import java.util.Date;
import java.util.List;

public interface ComplianceDao {
	
	public List<Object> getDetailsByefaultByUnderProcessingStatus(String status);
	
	public List<Object> getDetailsByefaultByAccOpenedOrRejectedStatus();
	
	public List<Object> getDetailsByName(String name,String status);

	public List<Object> getDetailsByDates(Date startDate,Date endDate,String status);
	
	public List<Object> getDetailsByAllCriteria(String name,Date startDate,Date endDate,String status);
	
}
