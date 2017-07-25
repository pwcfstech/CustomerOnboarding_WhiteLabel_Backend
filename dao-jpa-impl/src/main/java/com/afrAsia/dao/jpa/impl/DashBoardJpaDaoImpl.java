package com.afrAsia.dao.jpa.impl;

import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.Query;

import com.afrAsia.dao.jpa.DashBoardJpaDao;
import com.afrAsia.entities.jpa.ApplicationReference;
import com.afrAsia.entities.response.Apps;

public class DashBoardJpaDaoImpl extends BaseJpaDAOImpl<String, ApplicationReference>implements DashBoardJpaDao {

	public Collection<ApplicationReference> getMonthly() {

		String queryString = "from ApplicationReference ar where ar.appStatus=:as "
				+ "and ar.updatedTime between :stDate and :edDate ";

		Query query = getEntityManager().createQuery(queryString);

		Date today = new Date();
		Calendar cal = new GregorianCalendar();
		cal.setTime(today);
		cal.add(Calendar.DAY_OF_MONTH, -30);
		Date today30 = cal.getTime();

		query.setParameter("as", "ACCOUNT OPENED");
		
		 query.setParameter("stDate", today30); 
		 query.setParameter("edDate", today);
		 

		List<ApplicationReference> listOfEntries = query.getResultList();

		System.out.println("######## in JpaDaoImpl , listOfEntries for monthly datas" + listOfEntries);

		return listOfEntries;

	}

	public Collection<ApplicationReference> getQuarterly() {
		String queryString = "From ApplicationReference ar where ar.appStatus=:as "
				+ "and ar.updatedTime BETWEEN :stDate AND :edDate";

		Query query = getEntityManager().createQuery(queryString);
		Date today = new Date();
		Calendar cal = new GregorianCalendar();
		cal.setTime(today);
		cal.add(Calendar.DAY_OF_MONTH, -90);
		Date today90 = cal.getTime();
		query.setParameter("as", "ACCOUNT OPENED");
		query.setParameter("stDate", today90);
		query.setParameter("edDate", today);

		List<ApplicationReference> listOfEntries = query.getResultList();

		System.out.println("######## listOfEntries for quarterly datas" + listOfEntries);

		return listOfEntries;

	}

	public Collection<ApplicationReference> getHalfYeary() {
		String queryString = "From ApplicationReference ar where ar.appStatus=:as "
				+ "and ar.updatedTime BETWEEN :stDate AND :edDate";

		Query query = getEntityManager().createQuery(queryString);
		Date today = new Date();
		Calendar cal = new GregorianCalendar();
		cal.setTime(today);
		cal.add(Calendar.DAY_OF_MONTH, -180);
		Date today180 = cal.getTime();
		query.setParameter("as", "ACCOUNT OPENED");
		query.setParameter("stDate", today180);
		query.setParameter("edDate", today);

		List<ApplicationReference> listOfEntries = query.getResultList();

		System.out.println("######## listOfEntries for half yearly datas" + listOfEntries);

		return listOfEntries;

	}

	public Collection<ApplicationReference> getYearly() {
		String queryString = "From ApplicationReference ar where ar.appStatus=:as "
				+ "and ar.updatedTime BETWEEN :stDate AND :edDate";

		Query query = getEntityManager().createQuery(queryString);
		Date today = new Date();
		Calendar cal = new GregorianCalendar();
		cal.setTime(today);
		cal.add(Calendar.DAY_OF_MONTH, -365);
		Date today365 = cal.getTime();
		query.setParameter("as", "ACCOUNT OPENED");
		query.setParameter("stDate", today365);
		query.setParameter("edDate", today);

		List<ApplicationReference> listOfEntries = query.getResultList();

		System.out.println("######## listOfEntries for yearly datas" + listOfEntries);

		return listOfEntries;

	}

	public Collection<ApplicationReference> getLogged() {
		String queryString = "From ApplicationReference ar where ar.updatedTime BETWEEN :stDate AND :edDate";

		Query query = getEntityManager().createQuery(queryString);

		Date today = new Date();
		Calendar cal = new GregorianCalendar();
		cal.setTime(today);
		cal.add(Calendar.DAY_OF_MONTH, -30);
		Date today30 = cal.getTime();

		query.setParameter("stDate", today30);
		query.setParameter("edDate", today);

		List<ApplicationReference> listOfEntries = query.getResultList();

		System.out.println("######## listOfEntries for number of logged users data" + listOfEntries);

		return listOfEntries;

	}

	public Collection<ApplicationReference> getOpened() {
		String queryString = "From ApplicationReference ar where ar.appStatus=:as "
				+ "and ar.updatedTime BETWEEN :stDate AND :edDate";

		Query query = getEntityManager().createQuery(queryString);

		Date today = new Date();
		Calendar cal = new GregorianCalendar();
		cal.setTime(today);
		cal.add(Calendar.DAY_OF_MONTH, -30);
		Date today30 = cal.getTime();

		query.setParameter("as", "ACCOUNT OPENED");
		query.setParameter("stDate", today30);
		query.setParameter("edDate", today);

		List<ApplicationReference> listOfEntries = query.getResultList();

		System.out.println("######## listOfEntries for no of acc opened" + listOfEntries);

		return listOfEntries;

	}

	public Collection<ApplicationReference> getUnderProcessing() {

		String queryString = "From ApplicationReference ar where ar.appStatus=:as "
				+ "and ar.updatedTime BETWEEN :stDate AND :edDate";

		Query query = getEntityManager().createQuery(queryString);
		Date today = new Date();
		Calendar cal = new GregorianCalendar();
		cal.setTime(today);
		cal.add(Calendar.DAY_OF_MONTH, -30);
		Date today30 = cal.getTime();

		query.setParameter("as", "Under Processing");
		query.setParameter("stDate", today30);
		query.setParameter("edDate", today);

		List<ApplicationReference> listOfEntries = query.getResultList();

		System.out.println("######## listOfEntries for under processing datas" + listOfEntries);

		return listOfEntries;

	}

	public Collection<ApplicationReference> getRejected() {

		String queryString = "From ApplicationReference ar where ar.appStatus=:as "
				+ "and ar.updatedTime BETWEEN :stDate AND :edDate";

		Query query = getEntityManager().createQuery(queryString);
		Date today = new Date();
		Calendar cal = new GregorianCalendar();
		cal.setTime(today);
		cal.add(Calendar.DAY_OF_MONTH, -30);
		Date today30 = cal.getTime();

		query.setParameter("as", "Rejected Application");
		query.setParameter("stDate", today30);
		query.setParameter("edDate", today);

		List<ApplicationReference> listOfEntries = query.getResultList();

		System.out.println("######## listOfEntries for rejected datas" + listOfEntries);

		return listOfEntries;

	}

	// get the details of reference number
	public Collection<Long> getRefNo() {

		String queryString = "select ar.id From ApplicationReference ar where ar.appStatus=:as ";

		Query query = getEntityManager().createQuery(queryString);

		query.setParameter("as", "Require Attention");

		List<Long> listOfEntries = query.getResultList();

		System.out.println("######## listOfEntries for all ids for Require Attention datas" + listOfEntries);

		return listOfEntries;

	}

	// get the Custermer Name
	public Collection<Object> getCustermerName() {

		String queryString ="SELECT apd.firstName,apd.middleName,apd.lastName FROM ApplicantPersonalDetails apd "
		+ "WHERE apd.applicantId IN (SELECT ad.indvApplicantRefNo FROM ApplicationDetails ad "
		+ "WHERE ad.indvApplicantRefNo IN (SELECT ar.id FROM ApplicationReference ar WHERE ar.appStatus = :as )) ";
		
		Query query1 = getEntityManager().createQuery(queryString);

		query1.setParameter("as", "Require Attention");
		
		List<Object> listOfNames = query1.getResultList();
		
		System.out.println("####### customer names ::: " + listOfNames);

		return listOfNames;
	}

	// get pending since status
	public Collection<Date> getPendingSinceStatus() {

		String queryString = "select ar.updatedTime From ApplicationReference ar where ar.appStatus=:as ";

		Query query = getEntityManager().createQuery(queryString);

		query.setParameter("as", "Require Attention");

		List<Date> listOfEntries = query.getResultList();

		System.out.println("####### pending status datas ::: " + listOfEntries);

		return listOfEntries;

	}

}
