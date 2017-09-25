package com.afrAsia.dao;

import java.util.Date;
import java.util.List;

import com.afrAsia.entities.transactions.MobApplCheckComments;

public interface ComplianceDao {
	
	public List<Object> getDetailsByAccountRejectedDefault();

	public List<Object> getDetailsByAccountOpenedDefault();

	public List<Object> getDetailsByUnderProcessingDefault();

	public List<Object> getDetailsByAccountRejectedName(String name);

	public List<Object> getDetailsByAccountOpenedName(String name);

	public List<Object> getDetailsByUnderProcessingName(String name);

	public List<Object> getDetailsByAccountRejectedDates(Date startDate, Date endDate);

	public List<Object> getDetailsByAccountOpenedDates(Date startDate, Date endDate);

	public List<Object> getDetailsByUnderProcessingDates(Date startDate, Date endDate);

	public List<Object> getDetailsByAccountRejectedAllCriteria(String name, Date startDate, Date endDate);

	public List<Object> getDetailsByAccountOpenedAllCriteria(String name, Date startDate, Date endDate);

	public List<Object> getDetailsByUnderProcessingAllCriteria(String name, Date startDate, Date endDate);

	public void updateErrorMessage(MobApplCheckComments mobApplCheckComment);
	
}
