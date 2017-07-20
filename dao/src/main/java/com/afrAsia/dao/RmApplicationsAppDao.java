package com.afrAsia.dao;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import com.afrAsia.entities.jpa.ApplicantPersonalDetails;
import com.afrAsia.entities.jpa.ApplicationReference;

public interface RmApplicationsAppDao {

public Collection<ApplicationReference> getRefNo(Date startdate,Date endDate);
	
	public Collection<ApplicationReference> getRefNo(String appStatus);
	
	public Collection<ApplicationReference> getRefNo(Long Id, String name);
	
	public Collection<ApplicationReference> getRefNo(Long Id);

	public List<Object> getCustomerName(Long Id, String name);
	
	public List<Object> getCustomerName(Date startdate,Date endDate);
	
	public List<Object> getCustomerName(String appStatus);
	
	public List<Object> getCustomerName(Long id);

	public Collection<ApplicationReference> getAppSubmittedDate(Long Id, String name);
	
	public Collection<ApplicationReference> getAppSubmittedDate(Date startdate,Date endDate);
	
	public Collection<ApplicationReference> getAppSubmittedDate(String appStatus);
	
	public Collection<ApplicationReference> getAppSubmittedDate(Long id);
	
	public Collection<ApplicationReference> getAppStatus(Long Id, String name);
	
	public Collection<ApplicationReference> getAppStatus(Date startdate,Date endDate);
	
	public Collection<ApplicationReference> getAppStatus(String appStatus);
	
	public Collection<ApplicationReference> getAppStatus(Long id);
	
	public Long getIdFromDB(Long id);

}
