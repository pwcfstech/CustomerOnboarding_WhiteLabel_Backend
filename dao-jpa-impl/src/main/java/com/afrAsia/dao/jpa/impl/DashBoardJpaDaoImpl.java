package com.afrAsia.dao.jpa.impl;

import java.util.Collection;
import java.util.List;

import org.hibernate.SQLQuery;

import com.afrAsia.dao.jpa.DashBoardJpaDao;
import com.afrAsia.entities.jpa.DashBoardApplicationReferenceID;

public class DashBoardJpaDaoImpl extends BaseJpaDAOImpl<String, DashBoardApplicationReferenceID>implements DashBoardJpaDao {

	public Collection<DashBoardApplicationReferenceID> getMonthly() {

		String queryString = "select * from MOB_RM_APP_REF_ID where MOB_RM_APP_REF_ID.APP_STATUS='ACCOUNT OPENED' and MOB_RM_APP_REF_ID.UPDATED_TIME <= TRUNC(SYSDATE) - 30";
		SQLQuery query = (SQLQuery) getEntityManager().createNamedQuery(queryString);

		List<DashBoardApplicationReferenceID> listOfEntries = query.addEntity(DashBoardApplicationReferenceID.class).list();
		
		return listOfEntries;
		

	}

	public Collection<DashBoardApplicationReferenceID> getQuarterly() {
		String queryString = "select * from MOB_RM_APP_REF_ID where appStatus='ACCOUNT OPENED' UPDATED_TIME <= TRUNC(SYSDATE) - 90";
		SQLQuery query = (SQLQuery) getEntityManager().createNamedQuery(queryString);

		List<DashBoardApplicationReferenceID> listOfEntries = query.addEntity(DashBoardApplicationReferenceID.class).list();

		return listOfEntries;

	}

	public Collection<DashBoardApplicationReferenceID> getHalfYeary() {
		String queryString = "select * from MOB_RM_APP_REF_ID where appStatus='ACCOUNT OPENED' UPDATED_TIME <= TRUNC(SYSDATE) - 180";
		SQLQuery query = (SQLQuery) getEntityManager().createNamedQuery(queryString);

		List<DashBoardApplicationReferenceID> listOfEntries = query.addEntity(DashBoardApplicationReferenceID.class).list();

		
		return listOfEntries;

	}

	public Collection<DashBoardApplicationReferenceID> getYearly() {
		String queryString = "select * from MOB_RM_APP_REF_ID where appStatus='ACCOUNT OPENED' UPDATED_TIME <= TRUNC(SYSDATE) - 365";
		SQLQuery query = (SQLQuery) getEntityManager().createNamedQuery(queryString);

		List<DashBoardApplicationReferenceID> listOfEntries = query.addEntity(DashBoardApplicationReferenceID.class).list();

		return listOfEntries;

	}

	public Collection<DashBoardApplicationReferenceID> getLogged() {
		String queryString = "select * from MOB_RM_APP_REF_ID WHERE UPDATED_TIME <= TRUNC(SYSDATE) - 30";
		SQLQuery query = (SQLQuery) getEntityManager().createNamedQuery(queryString);

		List<DashBoardApplicationReferenceID> listOfEntries = query.addEntity(DashBoardApplicationReferenceID.class).list();

		return listOfEntries;

	}

	public Collection<DashBoardApplicationReferenceID> getOpened() {
		String queryString = "select * from MOB_RM_APP_REF_ID WHERE appStatus='ACCOUNT OPENED' AND UPDATED_TIME <= TRUNC(SYSDATE) - 30";
		SQLQuery query = (SQLQuery) getEntityManager().createNamedQuery(queryString);

		List<DashBoardApplicationReferenceID> listOfEntries = query.addEntity(DashBoardApplicationReferenceID.class).list();

		return listOfEntries;

	}

	public Collection<DashBoardApplicationReferenceID> getUnderProcessing() {
		String queryString = "select * from MOB_RM_APP_REF_ID where appStatus='Under Processing' AND UPDATED_TIME <= TRUNC(SYSDATE) - 30";
		SQLQuery query = (SQLQuery) getEntityManager().createNamedQuery(queryString);

		List<DashBoardApplicationReferenceID> listOfEntries = query.addEntity(DashBoardApplicationReferenceID.class).list();

		return listOfEntries;

	}

	public Collection<DashBoardApplicationReferenceID> getRejected() {

		String queryString = "select * from MOB_RM_APP_REF_ID where appStatus='Rejected' AND UPDATED_TIME <= TRUNC(SYSDATE) - 30";
		SQLQuery query = (SQLQuery) getEntityManager().createNamedQuery(queryString);

		List<DashBoardApplicationReferenceID> listOfEntries = query.addEntity(DashBoardApplicationReferenceID.class).list();

		return listOfEntries;

	}

	// get the details of reference number
	public Collection<DashBoardApplicationReferenceID> getRefNo() {

		String queryString = "select ID from MOB_RM_APP_REF_ID where appStatus='Require Attention'";

		SQLQuery query = (SQLQuery) getEntityManager().createNamedQuery(queryString);

		List<DashBoardApplicationReferenceID> listOfEntries = query.addEntity(DashBoardApplicationReferenceID.class).list();

		return listOfEntries;

	}

	// get the Custermer Name
	public Collection<DashBoardApplicationReferenceID> getCustermerName() {

		String queryString = "SELECT pd.FIRST_NAME, pd.MIDDLE_NAME, pd.LAST_NAME FROM MOB_APPLICANT_PERSONAL_DETAILS pd "
				+ "INNER JOIN MOB_ACCOUNT_DETAILS ad on pd.APPLICANT_ID = ad.INDV_APPLICANT_REF_NO "
				+ "INNER JOIN MOB_RM_APP_REF_ID arf on ad.INDV_APPLICANT_REF_NO = arf.MOB_RM_APP_REF_ID"
				+ "WHERE arf.APP_STATUS='Require Attention'";

		SQLQuery query = (SQLQuery) getEntityManager().createNamedQuery(queryString);

		List<DashBoardApplicationReferenceID> listOfEntries = query.addEntity(DashBoardApplicationReferenceID.class).list();

		return listOfEntries;

	}

	// get pending since status
	public Collection<DashBoardApplicationReferenceID> getPendingSinceStatus() {

		String queryString = "select UPDATED_TIME from MOB_RM_APP_REF_ID where appStatus='Require Attention'";

		SQLQuery query = (SQLQuery) getEntityManager().createNamedQuery(queryString);

		List<DashBoardApplicationReferenceID> listOfEntries = query.addEntity(DashBoardApplicationReferenceID.class).list();

		return listOfEntries;

	}

	

}
