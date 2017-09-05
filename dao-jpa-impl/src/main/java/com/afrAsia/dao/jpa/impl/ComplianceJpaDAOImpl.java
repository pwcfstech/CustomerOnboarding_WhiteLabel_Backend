package com.afrAsia.dao.jpa.impl;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.Query;

import com.afrAsia.dao.jpa.ComplianceJpaDao;
import com.afrAsia.entities.jpa.ApplicationReference;

public class ComplianceJpaDAOImpl extends BaseJpaDAOImpl<Long, ApplicationReference>implements ComplianceJpaDao {

	public List<Object> getDetailsByDefaultByUnderProcessingStatus() {

		Query query = getEntityManager()
				.createQuery("select ar.id,marri1.recordId,apd.firstName,apd.lastName,ar.createdDate, "
						+ "ar.appStatus,ar.accountNumber,ar.modifiedDate "
						+ "from MobRmAppRefId ar, ApplicantPersonalDetails apd,MobAppRefRecordId marri1 "
						+ "where ar.id=apd.id AND ar.id=marri1.id " + "AND lower(apd.customerType) =lower(:custType) "
						+ "AND marri1.createdDate=(select max(marri2.createdDate) from MobAppRefRecordId marri2 where marri2.id = marri1.id) "
						+ "AND lower(ar.appStatus)=lower(:appStatus) " + "order by ar.createdDate ASC");

		query.setParameter("custType", "Primary");
		query.setParameter("appStatus", "Under Processing");

		List<Object> detailsByefaultByUnderProcessingStatus = query.getResultList();

		for (Object object : detailsByefaultByUnderProcessingStatus) {
			Object[] outputs = (Object[]) object;
			System.out.println(outputs[0].toString());
			System.out.println(outputs[1].toString());
			System.out.println(outputs[2].toString());
			System.out.println(outputs[3].toString());
			System.out.println(outputs[4].toString());
			System.out.println(outputs[5].toString());
			try {
				if (outputs[6].toString() != null) {
					System.out.println("outputs[6].toString() in try  =========== " + outputs[6].toString());
				} else {
					System.out.println("############## outputs[6] is null ");
				}
			} catch (NullPointerException e) {
				System.out.println("outputs[6].toString() in catch =========== ");
			}
			System.out.println(outputs[7].toString());
		}
			return detailsByefaultByUnderProcessingStatus;
	}

	public List<Object> getDetailsByDefaultByAccOpenedOrRejectedStatus() {

		Query query = getEntityManager()
				.createQuery("select ar.id,marri1.recordId,apd.firstName,apd.lastName,ar.createdDate, "
						+ "ar.appStatus,ar.accountNumber,ar.modifiedDate "
						+ "from MobRmAppRefId ar, ApplicantPersonalDetails apd,MobAppRefRecordId marri1 "
						+ "where ar.id=apd.id AND ar.id=marri1.id " + "AND lower(apd.customerType) =lower(:custType) "
						+ "AND lower(ar.appStatus) in (lower(:appStatus1),lower(:appStatus2)) "
						+ "AND marri1.createdDate=(select max(marri2.createdDate) from MobAppRefRecordId marri2 where marri2.id = marri1.id) "
						+ "AND ar.modifiedDate between :startDate and :endDate " + "order by ar.createdDate desc");

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
			System.out.println(outputs[0].toString());
			System.out.println(outputs[1].toString());
			System.out.println(outputs[2].toString());
			System.out.println(outputs[3].toString());
			System.out.println(outputs[4].toString());
			System.out.println(outputs[5].toString());
			try {
				if (outputs[6].toString() != null) {
					System.out.println("outputs[6].toString() in try  =========== " + outputs[6].toString());
				} else {
					System.out.println("############## outputs[6] is null ");
				}
			} catch (NullPointerException e) {
				System.out.println("outputs[6].toString() in catch =========== ");
			}
			System.out.println(outputs[7].toString());
		}
			return detailsByDefaultByAccOpenedOrRejectedStatus;
	}

	public List<Object> getDetailsByName(String name, String appStatus) {

		Query query = getEntityManager()
				.createQuery("select ar.id,marri1.recordId,apd.firstName,apd.lastName,ar.createdDate, "
						+ "ar.appStatus,ar.accountNumber,ar.modifiedDate "
						+ "from MobRmAppRefId ar, ApplicantPersonalDetails apd,MobAppRefRecordId marri1 "
						+ "where ar.id=apd.id AND ar.id=marri1.id " + "AND lower(ar.appStatus)=lower(:appStatus) "
						+ "AND lower(apd.customerType) =lower(:custType) "
						+ "AND (lower(apd.firstName) || ' ' || lower(apd.lastName)) like lower(:name) "
						+ "AND marri1.createdDate=(select max(marri2.createdDate) from MobAppRefRecordId marri2 where marri2.id = marri1.id) "
						+ "order by ar.createdDate desc");

		query.setParameter("appStatus", appStatus);
		query.setParameter("name", "%" + name + "%");
		query.setParameter("custType", "Primary");

		List<Object> detailsByName = query.getResultList();

		for (Object object : detailsByName) {
			Object[] outputs = (Object[]) object;
			System.out.println(outputs[0].toString());
			System.out.println(outputs[1].toString());
			System.out.println(outputs[2].toString());
			System.out.println(outputs[3].toString());
			System.out.println(outputs[4].toString());
			System.out.println(outputs[5].toString());
			try {
				if (outputs[6].toString() != null) {
					System.out.println("outputs[6].toString() in try  =========== " + outputs[6].toString());
				} else {
					System.out.println("############## outputs[6] is null ");
				}
			} catch (NullPointerException e) {
				System.out.println("outputs[6].toString() in catch =========== ");
			}
			System.out.println(outputs[7].toString());
		}
			return detailsByName;
	}

	public List<Object> getDetailsByDates(Date startDate, Date endDate, String appStatus) {
		Query query = getEntityManager()
				.createQuery("select ar.id,marri1.recordId,apd.firstName,apd.lastName,ar.createdDate, "
						+ "ar.appStatus,ar.accountNumber,ar.modifiedDate "
						+ "from MobRmAppRefId ar, ApplicantPersonalDetails apd,MobAppRefRecordId marri1 "
						+ "where ar.id=apd.id AND ar.id=marri1.id " + "AND lower(ar.appStatus)=lower(:appStatus) "
						+ "AND ar.modifiedDate between :startDate and :endDate "
						+ "AND marri1.createdDate=(select max(marri2.createdDate) from MobAppRefRecordId marri2 where marri2.id = marri1.id) "
						+ "AND lower(apd.customerType) =lower(:custType) " + "order by ar.createdDate desc");

		query.setParameter("appStatus", appStatus);
		query.setParameter("custType", "Primary");
		query.setParameter("startDate", startDate);
		query.setParameter("endDate", endDate);

		List<Object> getDetailsByDates = query.getResultList();

		for (Object object : getDetailsByDates) {
			Object[] outputs = (Object[]) object;
			System.out.println(outputs[0].toString());
			System.out.println(outputs[1].toString());
			System.out.println(outputs[2].toString());
			System.out.println(outputs[3].toString());
			System.out.println(outputs[4].toString());
			System.out.println(outputs[5].toString());
			try {
				if (outputs[6].toString() != null) {
					System.out.println("outputs[6].toString() in try  =========== " + outputs[6].toString());
				} else {
					System.out.println("############## outputs[6] is null ");
				}
			} catch (NullPointerException e) {
				System.out.println("outputs[6].toString() in catch =========== ");
			}
			System.out.println(outputs[7].toString());
		}

		return getDetailsByDates;
	}

	public List<Object> getDetailsByAllCriteria(String name, Date startDate, Date endDate, String appStatus) {

		Query query = getEntityManager()
				.createQuery("select ar.id,marri1.recordId,apd.firstName,apd.lastName,ar.createdDate, "
						+ "ar.appStatus,ar.accountNumber,ar.modifiedDate "
						+ "from MobRmAppRefId ar, ApplicantPersonalDetails apd,MobAppRefRecordId marri1 "
						+ "where ar.id=apd.id AND ar.id=marri1.id " + "AND lower(ar.appStatus)=lower(:appStatus) "
						+ "AND lower(apd.customerType) =lower(:custType) "
						+ "AND ar.modifiedDate between :startDate and :endDate "
						+ "AND (lower(apd.firstName) || ' ' || lower(apd.lastName)) like lower(:name) "
						+ "AND marri1.createdDate=(select max(marri2.createdDate) from MobAppRefRecordId marri2 where marri2.id = marri1.id) "
						+ "order by ar.createdDate desc");

		query.setParameter("appStatus", appStatus);
		query.setParameter("custType", "Primary");
		query.setParameter("startDate", startDate);
		query.setParameter("endDate", endDate);
		query.setParameter("name", "%" + name + "%");

		List<Object> detailsByAllCriteria = query.getResultList();

		for (Object object : detailsByAllCriteria) {
			Object[] outputs = (Object[]) object;
			System.out.println(outputs[0].toString());
			System.out.println(outputs[1].toString());
			System.out.println(outputs[2].toString());
			System.out.println(outputs[3].toString());
			System.out.println(outputs[4].toString());
			System.out.println(outputs[5].toString());
			try {
				if (outputs[6].toString() != null) {
					System.out.println("outputs[6].toString() in try  =========== " + outputs[6].toString());
				} else {
					System.out.println("############## outputs[6] is null ");
				}
			} catch (NullPointerException e) {
				System.out.println("outputs[6].toString() in catch =========== ");
			}
			System.out.println(outputs[7].toString());
		}
			return detailsByAllCriteria;
	}
}