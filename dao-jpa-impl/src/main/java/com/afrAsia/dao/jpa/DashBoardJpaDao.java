package com.afrAsia.dao.jpa;

import java.util.Collection;
import java.util.Date;

import com.afrAsia.dao.DashBoardDao;
import com.afrAsia.entities.jpa.ApplicantPersonalDetails;
import com.afrAsia.entities.jpa.ApplicationReference;

public interface DashBoardJpaDao extends DashBoardDao {

	public Collection<ApplicationReference> getMonthly();

	public Collection<ApplicationReference> getQuarterly();

	public Collection<ApplicationReference> getHalfYeary();

	public Collection<ApplicationReference> getYearly();

	public Collection<ApplicationReference> getLogged();

	public Collection<ApplicationReference> getOpened();

	public Collection<ApplicationReference> getUnderProcessing();

	public Collection<ApplicationReference> getRejected();

	// get the details of reference number
	public Collection<Long> getRefNo();

	// get the Custermer Name
	public Collection<Object> getCustermerName();

	// get pending since status
	public Collection<Date> getPendingSinceStatus();
	
}
