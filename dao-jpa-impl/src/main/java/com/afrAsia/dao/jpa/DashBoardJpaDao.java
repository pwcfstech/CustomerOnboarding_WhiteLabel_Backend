package com.afrAsia.dao.jpa;

import java.util.Collection;
import java.util.List;

import com.afrAsia.dao.DashBoardDao;
import com.afrAsia.entities.jpa.DashBoardApplicationReferenceID;

public interface DashBoardJpaDao extends DashBoardDao {

	public Collection<DashBoardApplicationReferenceID> getMonthly();

	public Collection<DashBoardApplicationReferenceID> getQuarterly();

	public Collection<DashBoardApplicationReferenceID> getHalfYeary();

	public Collection<DashBoardApplicationReferenceID> getYearly();

	public Collection<DashBoardApplicationReferenceID> getLogged();

	public Collection<DashBoardApplicationReferenceID> getOpened();

	public Collection<DashBoardApplicationReferenceID> getUnderProcessing();

	public Collection<DashBoardApplicationReferenceID> getRejected();

	// get the details of reference number
	public Collection<DashBoardApplicationReferenceID> getRefNo();

	// get the Custermer Name
	public Collection<DashBoardApplicationReferenceID> getCustermerName();

	// get pending since status
	public Collection<DashBoardApplicationReferenceID> getPendingSinceStatus();
	
}
