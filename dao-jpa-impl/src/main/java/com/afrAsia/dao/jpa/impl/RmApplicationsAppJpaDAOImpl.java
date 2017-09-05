package com.afrAsia.dao.jpa.impl;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.Query;

import com.afrAsia.dao.jpa.RmApplicationsAppJpaDAO;
import com.afrAsia.entities.jpa.ApplicationReference;

public class RmApplicationsAppJpaDAOImpl extends BaseJpaDAOImpl<Long, ApplicationReference>
		implements RmApplicationsAppJpaDAO {
	
	/*public List<String> getId(String id){
		Query query = getEntityManager().createQuery("select ar.rmUserId from ApplicationReference ar "
				+ "where ar.rmUserId=:rmid");
		
		query.setParameter("rmid", id);
		
		List<String> detailsByefault = query.getResultList();
		return detailsByefault; 
	}*/
	
	public String getRmId(String rmUserId){
		Query query = getEntityManager()
				.createQuery("select ar.id from RMDetails ar where ar.id=:rmUserId AND ar.userGroup=:rm");
		query.setParameter("rmUserId", rmUserId);
		query.setParameter("rm", "RM");
		return (String) query.getSingleResult(); 
	}

	public List<Object> getDetailsByefault(String rmId) {

		Query query = getEntityManager().createQuery("select ar.id, ar.createdTime, ar.appStatus,"
				+ "apd.firstName,apd.lastName from ApplicationReference ar, ApplicantPersonalDetails apd "
				+ "where ar.id=apd.id AND ar.rmUserId=:rmid "
				+ "AND apd.customerType =:custType "
				+ "AND ar.appStatus not in :appStatus "
				+ "AND lower(ar.appStatus) in (lower(:as1),lower(:as2)) "
				+ "order by ar.createdTime desc");

		query.setParameter("rmid", rmId);
		query.setParameter("custType", "Primary");
		query.setParameter("as1", "Require Attention");
		query.setParameter("as2", "Under Processing");
		query.setParameter("appStatus", "KYC Pending");
		query.setMaxResults(10);
		
		List<Object> detailsByefault = query.getResultList();
		
		return detailsByefault; 
	}

	public List<Object> getDetailsByDates(Date startDate, Date endDate, String rmId) {
		
		Query query = getEntityManager().createQuery("select ar.id, ar.createdTime, ar.appStatus,"
				+ "apd.firstName,apd.lastName from ApplicationReference ar, ApplicantPersonalDetails apd "
				+ "where ar.id=apd.id AND ar.rmUserId=:rmid "
				+ "AND ar.updatedTime >= :startDate AND ar.updatedTime <= :endDate " 
				+ "AND apd.customerType =:custType "
				+ "AND ar.appStatus not in :appStatus "
				+ "order by ar.createdTime desc");

		query.setParameter("rmid", rmId);
		query.setParameter("custType", "Primary");
		query.setParameter("startDate", startDate); 
		query.setParameter("endDate", endDate);
		query.setParameter("appStatus", "KYC Pending");

		List<Object> getDetailsByDates = query.getResultList();
		
		return getDetailsByDates;
	}
	
	public List<Object> getDetailsByStatus(String status, String rmId) {
		Query query = getEntityManager().createQuery("select ar.id, ar.createdTime, ar.appStatus,"
				+ "apd.firstName,apd.lastName from ApplicationReference ar, ApplicantPersonalDetails apd " 
				+ "where ar.id=apd.id AND ar.rmUserId=:rmid "
				+ "AND lower(ar.appStatus) =lower(:st) " //or lower(ar.appStatus) like lower(:st1)"
				+ "AND ar.updatedTime between :stDate and :edDate "
				+ "AND apd.customerType = :custType "
				+ "AND ar.appStatus not in :appStatus "
				+ "order by ar.createdTime desc");

		Date today = new Date();
		Calendar cal = new GregorianCalendar();
		cal.setTime(today);
		cal.add(Calendar.DAY_OF_MONTH, -30);
		Date today30 = cal.getTime();
		
		query.setParameter("rmid", rmId);
		query.setParameter("custType", "Primary");
		query.setParameter("st", status);
		query.setParameter("stDate", today30); 
		query.setParameter("edDate", today);
		query.setParameter("appStatus", "KYC Pending");
		
		List<Object> detailsStatus = query.getResultList();
		
		return detailsStatus;
	}

	public List<Object> getDetailsByAllCriteriaWithoutStatus(String name, Date startDate, Date endDate, String rmId) {

		Query query = getEntityManager().createQuery("select ar.id, ar.createdTime, ar.appStatus,"
				+ "apd.firstName,apd.lastName from ApplicationReference ar, ApplicantPersonalDetails apd "
				+ "where ar.id=apd.id AND ar.rmUserId=:rmid "
				+ "AND apd.customerType =:custType "
				+ "AND ar.updatedTime between :stDate and :edDate "
				+ "AND (lower(apd.firstName) || ' ' || lower(apd.lastName)) like lower(:nm) "
				+ "AND ar.appStatus not in :appStatus "
				+ "order by ar.createdTime desc");

		query.setParameter("rmid", rmId);
		query.setParameter("custType", "Primary");
		query.setParameter("stDate", startDate);
		query.setParameter("edDate", endDate);
		query.setParameter("nm", "%"+name+"%");
		query.setParameter("appStatus", "KYC Pending");
		
		List<Object> detailsByAllCriteriaWithoutStatus = query.getResultList();
		
		return detailsByAllCriteriaWithoutStatus; 
	}

	public List<Object> getDetailsByAllCriteriaWithStatus(String name, Date startDate, Date endDate, String status,
			String rmId) {
		
		Query query = getEntityManager().createQuery("select ar.id, ar.createdTime, ar.appStatus,"
				+ "apd.firstName,apd.lastName from ApplicationReference ar, ApplicantPersonalDetails apd "
				+ "where ar.id=apd.id AND ar.rmUserId=:rmid "
				+ "AND lower(ar.appStatus) =lower(:as) "
				+ "AND ar.updatedTime between :stDate and :edDate "
				+ "AND apd.customerType =:custType "
				+ "AND (lower(apd.firstName) || ' ' || lower(apd.lastName)) like lower(:nm) "
				+ "AND ar.appStatus not in :appStatus "
				+ "order by ar.createdTime desc");

		query.setParameter("rmid", rmId);
		query.setParameter("custType", "Primary");
		query.setParameter("as", "status");
		query.setParameter("appStatus", "KYC Pending");
		query.setParameter("stDate", startDate); 
		query.setParameter("edDate", endDate);
		query.setParameter("nm", "%"+name+"%");

		List<Object> detailsByAllCriteriaWithStatus = query.getResultList();

		return detailsByAllCriteriaWithStatus;
	}

	public List<Object> getDetailsByName(String name, String rmId) {

		Query query = getEntityManager().createQuery("select ar.id, ar.createdTime, ar.appStatus,"
		+ "apd.firstName,apd.lastName from ApplicationReference ar, ApplicantPersonalDetails apd "
		+ "where ar.id=apd.id AND ar.rmUserId=:rmid "
		+ "AND apd.customerType=:custType "
		+ "AND (lower(apd.firstName) || ' ' || lower(apd.lastName)) like lower(:nm) " 
		+ "AND ar.appStatus not in :appStatus "
		+ "order by ar.createdTime desc");

		query.setParameter("rmid", rmId);
		query.setParameter("nm", "%"+name+"%");
		query.setParameter("custType", "Primary");
		query.setParameter("appStatus", "KYC Pending");
		
		List<Object> detailsByName = query.getResultList();
		
		return detailsByName;
	}
}
