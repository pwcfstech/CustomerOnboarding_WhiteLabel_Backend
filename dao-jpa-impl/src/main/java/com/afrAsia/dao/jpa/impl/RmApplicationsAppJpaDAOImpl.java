package com.afrAsia.dao.jpa.impl;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.persistence.Query;

import com.afrAsia.dao.jpa.RmApplicationsAppJpaDAO;
import com.afrAsia.entities.jpa.ApplicantPersonalDetails;
import com.afrAsia.entities.jpa.ApplicationReference;

public class RmApplicationsAppJpaDAOImpl extends BaseJpaDAOImpl<Long, ApplicationReference>
		implements RmApplicationsAppJpaDAO {

	// search on the basis of customer name and RM id

	public Collection<ApplicationReference> getRefNo(Long Id, String name) {

		String queryString = "select ar.id From ApplicationReference ar "
				+ "WHERE ar.id IN (SELECT ad.indvApplicantRefNo FROM ApplicationDetails ad "
				+ "WHERE ad.indvApplicantRefNo IN (SELECT apd.applicantId FROM ApplicantPersonalDetails apd "
				+ "WHERE apd.firstName LIKE :%FirstName% or apd.middleName LIKE :%MiddleName% or apd.lastName LIKE :%LastName%)) "
				+ "WHERE ar.id=:Id";

		Query query = getEntityManager().createQuery(queryString);

		query.setParameter("FirstName", name);
		query.setParameter("MiddleName", name);
		query.setParameter("LastName", name);
		query.setParameter("Id", Id);

		List<ApplicationReference> listOfEntries = query.getResultList();

		System.out.println("######## listOfEntries for all ids for Require Attention datas" + listOfEntries);

		return listOfEntries;
	}

	public List<Object> getCustomerName(Long Id, String name) {

		String queryString = "SELECT apd.firstName,apd.middleName,apd.lastName FROM ApplicantPersonalDetails apd "
				+ "WHERE apd.applicantId IN (SELECT ad.indvApplicantRefNo FROM ApplicationDetails ad "
				+ "WHERE ad.indvApplicantRefNo IN (SELECT ar.id FROM ApplicationReference ar WHERE ar.id = :ID )) "
				+ "WHERE apd.firstName LIKE :%FirstName% or apd.middleName LIKE :%MiddleName% or apd.lastName LIKE :%LastName%)) "
				+ "WHERE ar.id=:Id";
		;

		Query query = getEntityManager().createQuery(queryString);

		query.setParameter("FirstName", name);
		query.setParameter("MiddleName", name);
		query.setParameter("LastName", name);
		query.setParameter("Id", Id);

		List<Object> listOfEntries = query.getResultList();

		System.out.println("######## listOfEntries for all ids for Require Attention datas" + listOfEntries);

		return listOfEntries;
	}

	public Collection<ApplicationReference> getAppSubmittedDate(Long Id, String name) {

		String queryString = "select ar.createdTime From ApplicationReference ar "
				+ "WHERE ar.id IN (SELECT ad.indvApplicantRefNo FROM ApplicationDetails ad "
				+ "WHERE ad.indvApplicantRefNo IN (SELECT apd.applicantId FROM ApplicantPersonalDetails apd "
				+ "WHERE apd.firstName LIKE :%FirstName% or apd.middleName LIKE :%MiddleName% or apd.lastName LIKE :%LastName%)) "
				+ "WHERE ar.id=:Id";

		Query query = getEntityManager().createQuery(queryString);

		query.setParameter("FirstName", name);
		query.setParameter("MiddleName", name);
		query.setParameter("LastName", name);
		query.setParameter("Id", Id);

		List<ApplicationReference> listOfEntries = query.getResultList();

		System.out.println("######## listOfEntries for all ids for Require Attention datas" + listOfEntries);

		return listOfEntries;
	}

	public Collection<ApplicationReference> getAppStatus(Long Id, String name) {

		String queryString = "select ar.appStatus From ApplicationReference ar "
				+ "WHERE ar.id IN (SELECT ad.indvApplicantRefNo FROM ApplicationDetails ad "
				+ "WHERE ad.indvApplicantRefNo IN (SELECT apd.applicantId FROM ApplicantPersonalDetails apd "
				+ "WHERE apd.firstName LIKE :%FirstName% or apd.middleName LIKE :%MiddleName% or apd.lastName LIKE :%LastName%)) "
				+ "WHERE ar.id=:Id";

		Query query = getEntityManager().createQuery(queryString);

		query.setParameter("FirstName", name);
		query.setParameter("MiddleName", name);
		query.setParameter("LastName", name);
		query.setParameter("Id", Id);

		List<ApplicationReference> listOfEntries = query.getResultList();

		System.out.println("######## listOfEntries for all ids for Require Attention datas" + listOfEntries);

		return listOfEntries;
	}

	public Collection<ApplicationReference> getRefNo(Date startdate, Date endDate) {

		String queryString = "select ar.id From ApplicationReference ar where ar.createdTime BETWEEN :stDate AND :edDate ";

		Query query = getEntityManager().createQuery(queryString);

		query.setParameter("stDate", startdate);
		query.setParameter("edDate", endDate);

		List<ApplicationReference> listOfEntries = query.getResultList();

		System.out.println("######## listOfEntries with start and end dates" + listOfEntries);

		return listOfEntries;
	}

	public List<Object> getCustomerName(Date startdate, Date endDate) {

		String queryString = "SELECT apd.firstName,apd.middleName,apd.lastName FROM ApplicantPersonalDetails apd "
				+ "WHERE apd.applicantId IN (SELECT ad.indvApplicantRefNo FROM ApplicationDetails ad "
				+ "WHERE ad.indvApplicantRefNo IN (SELECT ar.id FROM ApplicationReference ar WHERE ar.createdTime BETWEEN :stDate AND :edDate )) ";

		Query query = getEntityManager().createQuery(queryString);

		query.setParameter("stDate", startdate);
		query.setParameter("edDate", endDate);

		List<Object> listOfEntries = query.getResultList();

		System.out.println("######## listOfEntries for all ids for Require Attention datas" + listOfEntries);

		return listOfEntries;
	}

	public Collection<ApplicationReference> getAppSubmittedDate(Date startdate, Date endDate) {

		String queryString = "select ar.createdTime From ApplicationReference ar where ar.createdTime BETWEEN :stDate AND :edDate ";

		Query query = getEntityManager().createQuery(queryString);

		query.setParameter("stDate", startdate);
		query.setParameter("edDate", endDate);

		List<ApplicationReference> listOfEntries = query.getResultList();

		System.out.println("######## listOfEntries with start and end dates" + listOfEntries);

		return listOfEntries;
	}

	public Collection<ApplicationReference> getAppStatus(Date startdate, Date endDate) {

		String queryString = "select ar.appStatus From ApplicationReference ar where ar.createdTime BETWEEN :stDate AND :edDate ";

		Query query = getEntityManager().createQuery(queryString);

		query.setParameter("stDate", startdate);
		query.setParameter("edDate", endDate);

		List<ApplicationReference> listOfEntries = query.getResultList();

		System.out.println("######## listOfEntries with start and end dates" + listOfEntries);

		return listOfEntries;
	}

	public Collection<ApplicationReference> getRefNo(Long Id) {

		String queryString = "select ar.id From ApplicationReference ar where ar.id=:ids ";

		Query query = getEntityManager().createQuery(queryString);

		query.setParameter("ids", Id);

		List<ApplicationReference> listOfEntries = query.getResultList();

		System.out.println("######## listOfEntries for all ids for Require Attention datas" + listOfEntries);

		return listOfEntries;
	}

	public List<Object> getCustomerName(Long id) {

		String queryString = "SELECT apd.firstName,apd.middleName,apd.lastName FROM ApplicantPersonalDetails apd "
				+ "WHERE apd.applicantId IN (SELECT ad.indvApplicantRefNo FROM ApplicationDetails ad "
				+ "WHERE ad.indvApplicantRefNo IN (SELECT ar.id FROM ApplicationReference ar WHERE ar.id=:ID )) ";

		Query query = getEntityManager().createQuery(queryString);

		query.setParameter("ID", id);

		List<Object> listOfEntries = query.getResultList();

		System.out.println("######## listOfEntries for all ids for Require Attention datas" + listOfEntries);

		return listOfEntries;
	}

	public Collection<ApplicationReference> getAppSubmittedDate(Long id) {

		String queryString = "select ar.createdTime From ApplicationReference ar where ar.id=:ID ";

		Query query = getEntityManager().createQuery(queryString);

		query.setParameter("ID", id);

		List<ApplicationReference> listOfEntries = query.getResultList();

		System.out.println("######## listOfEntries for all ids for Require Attention datas" + listOfEntries);

		return listOfEntries;
	}

	public Collection<ApplicationReference> getAppStatus(Long id) {

		String queryString = "select ar.appStatus From ApplicationReference ar where ar.id=:ID ";

		Query query = getEntityManager().createQuery(queryString);

		query.setParameter("ID", id);

		List<ApplicationReference> listOfEntries = query.getResultList();

		System.out.println("######## listOfEntries for all ids for Require Attention datas" + listOfEntries);

		return listOfEntries;
	}

	public Collection<ApplicationReference> getRefNo(String appStatus) {
		String queryString = "select ar.id From ApplicationReference ar where ar.appStatus=:as ";

		Query query = getEntityManager().createQuery(queryString);

		query.setParameter("as", appStatus);

		List<ApplicationReference> listOfEntries = query.getResultList();

		System.out.println("######## listOfEntries for all ids for Require Attention datas" + listOfEntries);

		return listOfEntries;
	}

	public List<Object> getCustomerName(String appStatus) {

		String queryString = "SELECT apd.firstName,apd.middleName,apd.lastName FROM ApplicantPersonalDetails apd "
				+ "WHERE apd.applicantId IN (SELECT ad.indvApplicantRefNo FROM ApplicationDetails ad "
				+ "WHERE ad.indvApplicantRefNo IN (SELECT ar.id FROM ApplicationReference ar WHERE ar.appStatus=:appstatus )) ";

		Query query = getEntityManager().createQuery(queryString);

		query.setParameter("appstatus", appStatus);

		List<Object> listOfEntries = query.getResultList();

		System.out.println("######## listOfEntries for all ids for Require Attention datas" + listOfEntries);

		return listOfEntries;
	}

	public Collection<ApplicationReference> getAppSubmittedDate(String appStatus) {

		String queryString = "select ar.createdTime From ApplicationReference ar where ar.appStatus=:as ";

		Query query = getEntityManager().createQuery(queryString);

		query.setParameter("as", appStatus);

		List<ApplicationReference> listOfEntries = query.getResultList();

		System.out.println("######## listOfEntries for all ids for Require Attention datas" + listOfEntries);

		return listOfEntries;
	}

	public Collection<ApplicationReference> getAppStatus(String appStatus) {

		String queryString = "select ar.appStatus From ApplicationReference ar where ar.appStatus=:as ";

		Query query = getEntityManager().createQuery(queryString);

		query.setParameter("as", appStatus);

		List<ApplicationReference> listOfEntries = query.getResultList();

		System.out.println("######## listOfEntries for all ids for Require Attention datas" + listOfEntries);

		return listOfEntries;
	}
	
	public Long getIdFromDB(Long id) {

		ApplicationReference applicationReference=findById(id);
		
		applicationReference.getId();
		
		System.out.println("######## check whether id is present or not"+applicationReference.getId());

		return applicationReference.getId();
	} 

}
