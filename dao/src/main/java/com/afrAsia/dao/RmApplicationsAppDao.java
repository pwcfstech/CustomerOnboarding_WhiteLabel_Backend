package com.afrAsia.dao;

import java.util.Date;
import java.util.List;

import com.afrAsia.entities.jpa.ApplicationReference;
import com.afrAsia.entities.response.Apps;

public interface RmApplicationsAppDao {
	
	public List<String> getId(String id);

	public List<Object> getDetailsByefault(String rmId);
	
	public List<Object> getDetailsByName(String name,String rmId);

	public List<Object> getDetailsByDates(Date startDate,Date endDate,String rmId);
	
	public List<Object> getDetailsByStatus(String status,String rmId);
	
	public List<Object> getDetailsByAllCriteriaWithoutStatus(String name,Date startDate,Date endDate,String rmId);
	
	public List<Object> getDetailsByAllCriteriaWithStatus(String name,Date startDate,Date endDate,String status,String rmId);

}
