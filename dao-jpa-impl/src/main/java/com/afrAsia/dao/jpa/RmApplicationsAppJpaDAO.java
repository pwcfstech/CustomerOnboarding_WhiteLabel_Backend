package com.afrAsia.dao.jpa;

import java.util.Date;
import java.util.List;

import com.afrAsia.dao.RmApplicationsAppDao;
import com.afrAsia.entities.jpa.ApplicationReference;

public interface RmApplicationsAppJpaDAO extends RmApplicationsAppDao, BaseJpaDAO<Long, ApplicationReference> {

	public List<String> getId(String id);
	
	public List<Object> getDetailsByefault(String rmId);
	
	public List<Object> getDetailsByName(String name,String rmId);

	public List<Object> getDetailsByDates(Date startDate,Date endDate,String rmId);
	
	public List<Object> getDetailsByStatus(String status,String rmId);
	
	public List<Object> getDetailsByAllCriteriaWithoutStatus(String name,Date startDate,Date endDate,String rmId);
	
	public List<Object> getDetailsByAllCriteriaWithStatus(String name,Date startDate,Date endDate,String status,String rmId);

}
