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
	
	public List<Object> getDetailsByDefaultByUnderProcessingStatus() {


		Query query = getEntityManager().createQuery("select ar.id,apd.recordId,apd.firstName,apd.lastName,ar.createdDate, "
				+ "ar.appStatus,ar.accountNumber,ar.modifiedDate "
				+ "from MobRmAppRefId ar, ApplicantPersonalDetails apd "
				+ "where ar.id=apd.id "
				+ "AND lower(apd.customerType) =lower(:custType) "
				+ "AND lower(ar.appStatus)=lower(:appStatus) "
				+ "order by ar.createdDate ASC");

		query.setParameter("custType", "Primary");
		query.setParameter("appStatus", "Under Processing");
		
		List<Object> detailsByefaultByUnderProcessingStatus = query.getResultList();
		
		for (Object object : detailsByefaultByUnderProcessingStatus) {
			Object[] outputs = (Object[]) object;
			System.out.println("id in dao,getDetailsByefaultByUnderProcessingStatus =========== "+outputs[0].toString());
			System.out.println("recordId,getDetailsByefaultByUnderProcessingStatus in dao =========== "+outputs[1].toString());
			System.out.println("name,getDetailsByefaultByUnderProcessingStatus in dao =========== "+outputs[2].toString()+" "+outputs[3].toString());
			System.out.println("createdDate,getDetailsByefaultByUnderProcessingStatus in dao =========== "+outputs[4].toString());
			System.out.println("appStatus,getDetailsByefaultByUnderProcessingStatus in dao =========== "+outputs[5].toString());
			//System.out.println("accountNumber,getDetailsByefaultByUnderProcessingStatus in dao =========== "+outputs[6].toString());
			System.out.println("modifiedDate,getDetailsByefaultByUnderProcessingStatus in dao =========== "+outputs[7].toString());
		}

		return detailsByefaultByUnderProcessingStatus; 
		
	}
	
	public List<Object> getDetailsByDefaultByAccOpenedOrRejectedStatus() {

		Query query = getEntityManager().createQuery("select ar.id,apd.recordId,apd.firstName,apd.lastName,ar.createdDate, "
				+ "ar.appStatus,ar.accountNumber,ar.modifiedDate "
				+ "from MobRmAppRefId ar, ApplicantPersonalDetails apd "
				+ "where ar.id=apd.id "
				+ "AND lower(apd.customerType) =lower(:custType) "
				+ "AND lower(ar.appStatus) in (lower(:appStatus1),lower(:appStatus2)) "
				+ "AND ar.modifiedDate between :startDate and :endDate "
				+ "order by ar.createdDate desc");

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
		
		List<Object> detailsByDefaultByAccOpenedOrRejectedStatus = query.getResultList();
		
		for (Object object : detailsByDefaultByAccOpenedOrRejectedStatus) {
			Object[] outputs = (Object[]) object;
		System.out.println("id in dao,getDetailsByefaultByAccOpenedOrRejectedStatus =========== "+outputs[0].toString());
		System.out.println("recordId,getDetailsByefaultByAccOpenedOrRejectedStatus in dao =========== "+outputs[1].toString());
		System.out.println("name in dao,getDetailsByefaultByAccOpenedOrRejectedStatus =========== "+outputs[2].toString()+" "+outputs[3].toString());
		System.out.println("createdDate in dao,getDetailsByefaultByAccOpenedOrRejectedStatus =========== "+outputs[4].toString());
		System.out.println("appStatus in dao,getDetailsByefaultByAccOpenedOrRejectedStatus =========== "+outputs[5].toString());
		//System.out.println("accountNumber in dao,getDetailsByefaultByAccOpenedOrRejectedStatus =========== "+outputs[6].toString());
		System.out.println("modifiedDate in dao,getDetailsByefaultByAccOpenedOrRejectedStatus =========== "+outputs[7].toString());
		}

		return detailsByDefaultByAccOpenedOrRejectedStatus; 
	}
	
	public List<Object> getDetailsByName(String name, String appStatus) {

		System.out.println("========== in dao , getDetailsByName ==============");
		
		Query query = getEntityManager().createQuery("select ar.id,apd.recordId,apd.firstName,apd.lastName,ar.createdDate, "
				+ "ar.appStatus,ar.accountNumber,ar.modifiedDate "
				+ "from MobRmAppRefId ar, ApplicantPersonalDetails apd "
				+ "where ar.id=apd.id  "			
				+ "AND lower(ar.appStatus)=lower(:appStatus) "
				+ "AND lower(apd.customerType) =lower(:custType) "
				+ "AND (lower(apd.firstName) || ' ' || lower(apd.lastName)) like lower(:name) " 
				+ "order by ar.createdDate desc");

		query.setParameter("appStatus", appStatus);
		
		query.setParameter("name", "%"+name+"%");
		
		query.setParameter("custType", "Primary");

		List<Object> detailsByName = query.getResultList();
		
		for (Object object : detailsByName) {
			Object[] outputs = (Object[]) object;
			System.out.println("id in dao =========== "+outputs[0].toString());
			System.out.println("recordId in dao =========== "+outputs[1].toString());
			System.out.println("name in dao =========== "+outputs[2].toString()+" "+outputs[3].toString());
			System.out.println("createdDate in dao =========== "+outputs[4].toString());
			System.out.println("appStatus in dao =========== "+outputs[5].toString());
			//System.out.println("accountNumber in dao =========== "+outputs[6].toString());
			System.out.println("modifiedDate in dao =========== "+outputs[7].toString());
		}
		
		return detailsByName;
	}
	
	public List<Object> getDetailsByDates(Date startDate, Date endDate, String appStatus) {
		Query query = getEntityManager().createQuery("select ar.id,apd.recordId,apd.firstName,apd.lastName,ar.createdDate, "
				+ "ar.appStatus,ar.accountNumber,ar.modifiedDate "
				+ "from MobRmAppRefId ar, ApplicantPersonalDetails apd "
				+ "where ar.id=apd.id "
				+ "AND lower(ar.appStatus)=lower(:appStatus) "
				+ "AND ar.modifiedDate between :startDate and :endDate "
				+ "AND lower(apd.customerType) =lower(:custType) "
				+ "order by ar.createdDate desc");

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
			System.out.println("createdDate in dao =========== "+outputs[4].toString());
			System.out.println("appStatus in dao =========== "+outputs[5].toString());
			//System.out.println("accountNumber in dao =========== "+outputs[6].toString());
			System.out.println("modifiedDate in dao =========== "+outputs[7].toString());
		}
		return getDetailsByDates;
	}
		
	public List<Object> getDetailsByAllCriteria(String name, Date startDate, Date endDate, String appStatus) {

		Query query = getEntityManager().createQuery("select ar.id,apd.recordId,apd.firstName,apd.lastName,ar.createdDate, "
				+ "ar.appStatus,ar.accountNumber,ar.modifiedDate "
				+ "from MobRmAppRefId ar, ApplicantPersonalDetails apd "
				+ "where ar.id=apd.id "
				+ "AND lower(ar.appStatus)=lower(:appStatus) "
				+ "AND lower(apd.customerType) =lower(:custType) "
				+ "AND ar.modifiedDate between :startDate and :endDate "
				+ "AND (lower(apd.firstName) || ' ' || lower(apd.lastName)) like lower(:name) "
				+ "order by ar.createdDate desc");

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
			System.out.println("createdDate in dao =========== "+outputs[4].toString());
			System.out.println("appStatus in dao =========== "+outputs[5].toString());
			//System.out.println("accountNumber in dao =========== "+outputs[6].toString());
			System.out.println("modifiedDate in dao =========== "+outputs[7].toString());
			}
		return detailsByAllCriteria; 

	}

}
