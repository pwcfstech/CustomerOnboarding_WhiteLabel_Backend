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
	
	public List<String> getId(String id){
		Query query = getEntityManager().createQuery("select ar.rmUserId from ApplicationReference ar "
				+ "where ar.rmUserId=:rmid");
		query.setParameter("rmid", id);
		
		List<String> detailsByefault = query.getResultList();
		return detailsByefault; 
	}

	public List<Object> getDetailsByefault(String rmId) {

		Query query = getEntityManager().createQuery("select ar.id, ar.createdTime, ar.appStatus,"
				+ "apd.firstName,apd.lastName from ApplicationReference ar, ApplicantPersonalDetails apd "
				+ "where ar.id=apd.id AND ar.rmUserId=:rmid "
				+ "AND apd.customerType =:custType "
				+ "AND lower(ar.appStatus) in (lower(:as1),lower(:as2)) "
				+ "order by ar.createdTime desc");

		query.setParameter("rmid", rmId);
		query.setParameter("custType", "Primary");
		query.setParameter("as1", "Require Attention");
		query.setParameter("as2", "Under Processing");
		query.setMaxResults(10);
		
		List<Object> detailsByefault = query.getResultList();
		
		for (Object object : detailsByefault) {
			Object[] outputs = (Object[]) object;
		System.out.println("rmid in dao =========== "+outputs[0].toString());
		System.out.println("createdTime in dao =========== "+outputs[1].toString());
		System.out.println("appStatus in dao =========== "+outputs[2].toString());
		System.out.println("name in dao =========== "+outputs[3].toString()+" "+outputs[4].toString());
		}

		return detailsByefault; 

	}

	public List<Object> getDetailsByDates(Date startDate, Date endDate, String rmId) {
		Query query = getEntityManager().createQuery("select ar.id, ar.createdTime, ar.appStatus,"
				+ "apd.firstName,apd.lastName from ApplicationReference ar, ApplicantPersonalDetails apd "
				+ "where ar.id=apd.id AND ar.rmUserId=:rmid "
				+ "AND ar.updatedTime between :stDate and :edDate "
				+ "AND apd.customerType =:custType "
				+ "order by ar.createdTime desc");

		query.setParameter("rmid", rmId);
		query.setParameter("custType", "Primary");
		query.setParameter("stDate", startDate); 
		query.setParameter("edDate", endDate);

		List<Object> getDetailsByDates = query.getResultList();
		
		for (Object object : getDetailsByDates) {
			Object[] outputs = (Object[]) object;
			System.out.println("rmid in dao =========== "+outputs[0].toString());
			System.out.println("createdTime in dao =========== "+outputs[1].toString());
			System.out.println("appStatus in dao =========== "+outputs[2].toString());
			System.out.println("name in dao =========== "+outputs[3].toString()+" "+outputs[4].toString());
		}
		return getDetailsByDates;
	}

	public List<Object> getDetailsByStatus(String status, String rmId) {
		System.out.println("in dao ========= getDetailsByStatus =========== ");
		Query query = getEntityManager().createQuery("select ar.id, ar.createdTime, ar.appStatus,"
				+ "apd.firstName,apd.lastName from ApplicationReference ar, ApplicantPersonalDetails apd " 
				+ "where ar.id=apd.id AND ar.rmUserId=:rmid "
				+ "AND lower(ar.appStatus) =lower(:st) " //or lower(ar.appStatus) like lower(:st1)"
				+ "AND ar.updatedTime between :stDate and :edDate "
				+ "AND apd.customerType = :custType "
				+ "order by ar.createdTime desc");

		Date today = new Date();
		Calendar cal = new GregorianCalendar();
		cal.setTime(today);
		cal.add(Calendar.DAY_OF_MONTH, -30);
		Date today30 = cal.getTime();
		
		query.setParameter("rmid", rmId);
		query.setParameter("custType", "Primary");
		query.setParameter("st", status);
		//query.setParameter("st1", "%"+status+"%");
		query.setParameter("stDate", today30); 
		query.setParameter("edDate", today);

		List<Object> detailsStatus = query.getResultList();
		System.out.println("detailsStatus by status ========== in dao ==== "+detailsStatus);
		
		for (Object object : detailsStatus) {
			System.out.println("in for ===== in dao ========= ");
			Object[] outputs = (Object[]) object;
			System.out.println("rmid in dao =========== "+outputs[0].toString());
			System.out.println("createdTime in dao =========== "+outputs[1].toString());
			System.out.println("appStatus in dao =========== "+outputs[2].toString());
			System.out.println("name in dao =========== "+outputs[3].toString()+" "+outputs[4].toString());
			}
		
		return detailsStatus;
	}

	public List<Object> getDetailsByAllCriteriaWithoutStatus(String name, Date startDate, Date endDate, String rmId) {

		Query query = getEntityManager().createQuery("select ar.id, ar.createdTime, ar.appStatus,"
				+ "apd.firstName,apd.lastName from ApplicationReference ar, ApplicantPersonalDetails apd "
				+ "where ar.id=apd.id AND ar.rmUserId=:rmid "
				+ "AND apd.customerType =:custType "
				+ "AND ar.updatedTime between :stDate and :edDate "
				+ "AND (lower(apd.firstName) || ' ' || lower(apd.lastName)) like lower(:nm) "
				+ "order by ar.createdTime desc");

		query.setParameter("rmid", rmId);
		query.setParameter("custType", "Primary");
		query.setParameter("stDate", startDate);
		query.setParameter("edDate", endDate);
		query.setParameter("nm", "%"+name+"%");

		
		List<Object> detailsByAllCriteriaWithoutStatus = query.getResultList();
		
		for (Object object : detailsByAllCriteriaWithoutStatus) {
			Object[] outputs = (Object[]) object;
			System.out.println("rmid in dao =========== "+outputs[0].toString());
			System.out.println("createdTime in dao =========== "+outputs[1].toString());
			System.out.println("appStatus in dao =========== "+outputs[2].toString());
			System.out.println("name in dao =========== "+outputs[3].toString()+" "+outputs[4].toString());
			}
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
				+ "order by ar.createdTime desc");

		query.setParameter("rmid", rmId);
		query.setParameter("custType", "Primary");
		query.setParameter("as", "status");
		
		query.setParameter("stDate", startDate); 
		query.setParameter("edDate", endDate);
		
		query.setParameter("nm", "%"+name+"%");

		List<Object> detailsByAllCriteriaWithStatus = query.getResultList();

		for (Object object : detailsByAllCriteriaWithStatus) {
			Object[] outputs = (Object[]) object;
			System.out.println("rmid in dao =========== "+outputs[0].toString());
			System.out.println("createdTime in dao =========== "+outputs[1].toString());
			System.out.println("appStatus in dao =========== "+outputs[2].toString());
			System.out.println("name in dao =========== "+outputs[3].toString()+" "+outputs[4].toString());
			}

		
		return detailsByAllCriteriaWithStatus;
	}

	public List<Object> getDetailsByName(String name, String rmId) {

		System.out.println("========== in dao , getDetailsByName ==============");
		
		Query query = getEntityManager().createQuery("select ar.id, ar.createdTime, ar.appStatus,"
		+ "apd.firstName,apd.lastName from ApplicationReference ar, ApplicantPersonalDetails apd "
		+ "where ar.id=apd.id AND ar.rmUserId=:rmid "
		+ "AND apd.customerType=:custType "
		+ "AND (lower(apd.firstName) || ' ' || lower(apd.lastName)) like lower(:nm) " 
		+ "order by ar.createdTime desc");

		query.setParameter("rmid", rmId);
		
		query.setParameter("nm", "%"+name+"%");
		
		query.setParameter("custType", "Primary");

		List<Object> detailsByName = query.getResultList();
		
		for (Object object : detailsByName) {
			Object[] outputs = (Object[]) object;
			System.out.println("rmid in dao =========== "+outputs[0].toString());
			System.out.println("createdTime in dao =========== "+outputs[1].toString());
			System.out.println("appStatus in dao =========== "+outputs[2].toString());
			System.out.println("name in dao =========== "+outputs[3].toString()+" "+outputs[4].toString());
		}
		
		return detailsByName;
	}

}
