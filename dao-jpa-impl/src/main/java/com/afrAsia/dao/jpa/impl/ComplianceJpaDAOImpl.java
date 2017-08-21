package com.afrAsia.dao.jpa.impl;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.Query;

import com.afrAsia.dao.jpa.ComplianceJpaDao;
import com.afrAsia.entities.jpa.ApplicationReference;

public class ComplianceJpaDAOImpl extends BaseJpaDAOImpl<Long, ApplicationReference>
		implements ComplianceJpaDao {
	
	public List<Object> getDetailsByefaultByUnderProcessingStatus(String ststus) {

		List<Object> defaultResult = null;
		if(ststus.equalsIgnoreCase("Under Processing")){
		Query query = getEntityManager().createQuery("select ar.id,apd.recordId,apd.firstName,apd.lastName,ar.createdTime, "
				+ "ar.appStatus,ar.accountNumber,ar.modifiedTime "
				+ "from ApplicationReference ar, ApplicantPersonalDetails apd "
				+ "where ar.id=apd.id "
				+ "AND apd.customerType =:custType "
				+ "AND lower(ar.appStatus)=:(lower(:appStatus)) "
				+ "order by ar.createdTime ASC;");

		query.setParameter("custType", "Primary");
		query.setParameter("appStatus", "Under Processing");
		
		List<Object> detailsByefaultByUnderProcessingStatus = query.getResultList();
		
		for (Object object : detailsByefaultByUnderProcessingStatus) {
			Object[] outputs = (Object[]) object;
			System.out.println("id in dao =========== "+outputs[0].toString());
			System.out.println("recordId in dao =========== "+outputs[1].toString());
			System.out.println("name in dao =========== "+outputs[2].toString()+" "+outputs[3].toString());
			System.out.println("createdTime in dao =========== "+outputs[4].toString());
			System.out.println("appStatus in dao =========== "+outputs[5].toString());
			System.out.println("accountNumber in dao =========== "+outputs[6].toString());
			System.out.println("modifiedTime in dao =========== "+outputs[7].toString());
		}
		defaultResult=detailsByefaultByUnderProcessingStatus;
		//return detailsByefaultByUnderProcessingStatus; 
		}
		else if(ststus.equalsIgnoreCase("ACCOUNT OPENED") || ststus.equalsIgnoreCase("ACCOUNT REJECTED")){
			Query query = getEntityManager().createQuery("select ar.id,apd.recordId,apd.firstName,apd.lastName,ar.createdTime, "
					+ "ar.appStatus,ar.accountNumber,ar.modifiedTime "
					+ "from ApplicationReference ar, ApplicantPersonalDetails apd "
					+ "where ar.id=apd.id "
					+ "AND apd.customerType =:custType "
					+ "AND lower(ar.appStatus) in (lower(:appStatus1),lower(:appStatus2)) "
					+ "AND ar.updatedTime between :startDate and :endDate "
					+ "order by ar.createdTime desc");

			Date today = new Date();
			Calendar cal = new GregorianCalendar();
			cal.setTime(today);
			cal.add(Calendar.DAY_OF_MONTH, -30);
			Date today30 = cal.getTime();
			
			query.setParameter("custType", "Primary");
			query.setParameter("startDate", today30); 
			query.setParameter("endDate", today);					
			query.setParameter("appStatus1", "ACCOUNT OPENED");
			query.setParameter("appStatus2", "ACCOUNT REJECTED");
			
			List<Object> detailsByefault = query.getResultList();
			
			for (Object object : detailsByefault) {
				Object[] outputs = (Object[]) object;
			System.out.println("id in dao =========== "+outputs[0].toString());
			System.out.println("recordId in dao =========== "+outputs[1].toString());
			System.out.println("name in dao =========== "+outputs[2].toString()+" "+outputs[3].toString());
			System.out.println("createdTime in dao =========== "+outputs[4].toString());
			System.out.println("appStatus in dao =========== "+outputs[5].toString());
			System.out.println("accountNumber in dao =========== "+outputs[6].toString());
			System.out.println("modifiedTime in dao =========== "+outputs[7].toString());
			}
			defaultResult=detailsByefault;
			//return detailsByefault; 
		}
		return defaultResult;
	}
	
	public List<Object> getDetailsByefaultByAccOpenedOrRejectedStatus() {

		Query query = getEntityManager().createQuery("select ar.id,apd.recordId,apd.firstName,apd.lastName,ar.createdTime, "
				+ "ar.appStatus,ar.accountNumber,ar.modifiedTime "
				+ "from ApplicationReference ar, ApplicantPersonalDetails apd "
				+ "where ar.id=apd.id "
				+ "AND apd.customerType =:custType "
				+ "AND lower(ar.appStatus) in (lower(:appStatus1),lower(:appStatus2)) "
				+ "AND ar.updatedTime between :startDate and :endDate "
				+ "order by ar.createdTime desc");

		Date today = new Date();
		Calendar cal = new GregorianCalendar();
		cal.setTime(today);
		cal.add(Calendar.DAY_OF_MONTH, -30);
		Date today30 = cal.getTime();
		
		query.setParameter("custType", "Primary");
		query.setParameter("startDate", today30); 
		query.setParameter("endDate", today);					
		query.setParameter("appStatus1", "ACCOUNT OPENED");
		query.setParameter("appStatus2", "ACCOUNT REJECTED");
		
		List<Object> detailsByefault = query.getResultList();
		
		for (Object object : detailsByefault) {
			Object[] outputs = (Object[]) object;
		System.out.println("id in dao =========== "+outputs[0].toString());
		System.out.println("recordId in dao =========== "+outputs[1].toString());
		System.out.println("name in dao =========== "+outputs[2].toString()+" "+outputs[3].toString());
		System.out.println("createdTime in dao =========== "+outputs[4].toString());
		System.out.println("appStatus in dao =========== "+outputs[5].toString());
		System.out.println("accountNumber in dao =========== "+outputs[6].toString());
		System.out.println("modifiedTime in dao =========== "+outputs[7].toString());
		}

		return detailsByefault; 
	}
	
	public List<Object> getDetailsByName(String name, String appStatus) {

		System.out.println("========== in dao , getDetailsByName ==============");
		
		Query query = getEntityManager().createQuery("select ar.id,apd.recordId,apd.firstName,apd.lastName,ar.createdTime, "
				+ "ar.appStatus,ar.accountNumber,ar.modifiedTime "
				+ "from ApplicationReference ar, ApplicantPersonalDetails apd "
				+ "where ar.id=apd.id  "
		+ "AND lower(ar.appStatus)=:(lower(:appStatus)) "
		+ "AND apd.customerType=:custType "
		+ "AND (lower(apd.firstName) || ' ' || lower(apd.lastName)) like lower(:name) " 
		+ "order by ar.createdTime desc");

		query.setParameter("appStatus", appStatus);
		
		query.setParameter("name", "%"+name+"%");
		
		query.setParameter("custType", "Primary");

		List<Object> detailsByName = query.getResultList();
		
		for (Object object : detailsByName) {
			Object[] outputs = (Object[]) object;
			System.out.println("id in dao =========== "+outputs[0].toString());
			System.out.println("recordId in dao =========== "+outputs[1].toString());
			System.out.println("name in dao =========== "+outputs[2].toString()+" "+outputs[3].toString());
			System.out.println("createdTime in dao =========== "+outputs[4].toString());
			System.out.println("appStatus in dao =========== "+outputs[5].toString());
			System.out.println("accountNumber in dao =========== "+outputs[6].toString());
			System.out.println("modifiedTime in dao =========== "+outputs[7].toString());
		}
		
		return detailsByName;
	}
	
	public List<Object> getDetailsByDates(Date startDate, Date endDate, String appStatus) {
		Query query = getEntityManager().createQuery("select ar.id,apd.recordId,apd.firstName,apd.lastName,ar.createdTime, "
				+ "ar.appStatus,ar.accountNumber,ar.modifiedTime "
				+ "from ApplicationReference ar, ApplicantPersonalDetails apd "
				+ "where ar.id=apd.id "
				+ "AND lower(ar.appStatus)=:(lower(:appStatus)) "
				+ "AND ar.updatedTime between :startDate and :endDate "
				+ "AND apd.customerType =:custType "
				+ "order by ar.createdTime desc");

		query.setParameter("appStatus", appStatus);
		query.setParameter("custType", "Primary");
		query.setParameter("startDate", startDate); 
		query.setParameter("endDate", endDate);

		List<Object> getDetailsByDates = query.getResultList();
		
		for (Object object : getDetailsByDates) {
			Object[] outputs = (Object[]) object;
			System.out.println("id in dao =========== "+outputs[0].toString());
			System.out.println("recordId in dao =========== "+outputs[1].toString());
			System.out.println("name in dao =========== "+outputs[2].toString()+" "+outputs[3].toString());
			System.out.println("createdTime in dao =========== "+outputs[4].toString());
			System.out.println("appStatus in dao =========== "+outputs[5].toString());
			System.out.println("accountNumber in dao =========== "+outputs[6].toString());
			System.out.println("modifiedTime in dao =========== "+outputs[7].toString());
		}
		return getDetailsByDates;
	}
		
	public List<Object> getDetailsByAllCriteria(String name, Date startDate, Date endDate, String appStatus) {

		Query query = getEntityManager().createQuery("select ar.id,apd.recordId,apd.firstName,apd.lastName,ar.createdTime, "
				+ "ar.appStatus,ar.accountNumber,ar.modifiedTime "
				+ "from ApplicationReference ar, ApplicantPersonalDetails apd "
				+ "where ar.id=apd.id "
				+ "AND lower(ar.appStatus)=:(lower(:appStatus)) "
				+ "AND apd.customerType =:custType "
				+ "AND ar.updatedTime between :startDate and :endDate "
				+ "AND (lower(apd.firstName) || ' ' || lower(apd.lastName)) like lower(:name) "
				+ "order by ar.createdTime desc");

		query.setParameter("appStatus", appStatus);
		query.setParameter("custType", "Primary");
		query.setParameter("startDate", startDate);
		query.setParameter("endDate", endDate);
		query.setParameter("name", "%"+name+"%");

		
		List<Object> detailsByAllCriteria = query.getResultList();
		
		for (Object object : detailsByAllCriteria) {
			Object[] outputs = (Object[]) object;
			System.out.println("id in dao =========== "+outputs[0].toString());
			System.out.println("recordId in dao =========== "+outputs[1].toString());
			System.out.println("name in dao =========== "+outputs[2].toString()+" "+outputs[3].toString());
			System.out.println("createdTime in dao =========== "+outputs[4].toString());
			System.out.println("appStatus in dao =========== "+outputs[5].toString());
			System.out.println("accountNumber in dao =========== "+outputs[6].toString());
			System.out.println("modifiedTime in dao =========== "+outputs[7].toString());
			}
		return detailsByAllCriteria; 

	}
}
