package com.afrAsia.dao.jpa;

import java.util.Date;
import java.util.List;

import com.afrAsia.dao.ComplianceDao;
import com.afrAsia.entities.jpa.ApplicationReference;

public interface ComplianceJpaDao extends ComplianceDao, BaseJpaDAO<Long, ApplicationReference> {

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

	public void updateErrorMessage(Long id, Long recordId);

}
