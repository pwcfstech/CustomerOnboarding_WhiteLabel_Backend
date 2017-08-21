package com.afrAsia.dao.jpa;

import java.util.Date;
import java.util.List;

import com.afrAsia.dao.ComplianceDao;
import com.afrAsia.entities.jpa.ApplicationReference;

public interface ComplianceJpaDao extends ComplianceDao, BaseJpaDAO<Long, ApplicationReference> {

	public List<Object> getDetailsByefaultByUnderProcessingStatus(String status);
	
	public List<Object> getDetailsByefaultByAccOpenedOrRejectedStatus();
	
	public List<Object> getDetailsByName(String name,String status);

	public List<Object> getDetailsByDates(Date startDate,Date endDate,String status);
	
	public List<Object> getDetailsByAllCriteria(String name,Date startDate,Date endDate,String status);

}
