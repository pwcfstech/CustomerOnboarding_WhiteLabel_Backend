package com.afrAsia.dao.jpa.impl;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.Query;

import org.springframework.transaction.annotation.Transactional;

import com.afrAsia.dao.jpa.ComplianceJpaDao;
import com.afrAsia.entities.jpa.ApplicationReference;
import com.afrAsia.entities.transactions.MobApplCheckComments;

public class ComplianceJpaDAOImpl extends BaseJpaDAOImpl<Long, ApplicationReference>implements ComplianceJpaDao {

	public List<Object> getDetailsByAccountRejectedDefault() {

		Query query = getEntityManager()
				.createQuery("select ar.id,marri1.recordId,rm.rmName,apd.firstName,apd.lastName,ar.modifiedDate "
						+ "from MobRmAppRefId ar, ApplicantPersonalDetails apd,MobAppRefRecordId marri1,RMDetails rm "
						+ "where ar.id=apd.id AND ar.id=marri1.id " + "AND apd.customerType =:custType "
						+ "AND ar.appStatus =:appStatus  AND ar.rmUsedId=rm.id "
						+ "AND marri1.createdDate=(select max(marri2.createdDate) from MobAppRefRecordId marri2 where marri2.id = marri1.id) "
						+ "AND ar.modifiedDate between :startDate and :endDate AND ar.appStatus not in :appStatus1 " 
						+ "order by ar.modifiedDate desc");

		Date today = new Date();
		Calendar cal = new GregorianCalendar();
		cal.setTime(today);
		cal.add(Calendar.DAY_OF_MONTH, -30);
		Date today30 = cal.getTime();

		query.setParameter("custType", "Primary");
		query.setParameter("startDate", today30);
		query.setParameter("endDate", today);
		query.setParameter("appStatus", "ACCOUNT REJECTED");
		query.setParameter("appStatus1", "KYC Pending");
		
		List<Object> detailsByAccountRejectedDefault = query.getResultList();

		return detailsByAccountRejectedDefault;
	}
	
	public List<Object> getDetailsByAccountOpenedDefault() {

		Query query = getEntityManager()
			.createQuery("select ar.id,marri1.recordId,rm.rmName,apd.firstName,apd.lastName,ar.accountNumber,ar.modifiedDate "
						+ "from MobRmAppRefId ar, ApplicantPersonalDetails apd,MobAppRefRecordId marri1,RMDetails rm "
						+ "where ar.id=apd.id AND ar.id=marri1.id " + "AND apd.customerType =:custType "
						+ "AND ar.appStatus =:appStatus  AND ar.rmUsedId=rm.id "
						+ "AND marri1.createdDate=(select max(marri2.createdDate) from MobAppRefRecordId marri2 where marri2.id = marri1.id) "
						+ "AND ar.modifiedDate between :startDate and :endDate AND ar.appStatus not in :appStatus1 " 
						+ "order by ar.modifiedDate desc");

		Date today = new Date();
		Calendar cal = new GregorianCalendar();
		cal.setTime(today);
		cal.add(Calendar.DAY_OF_MONTH, -30);
		Date today30 = cal.getTime();

		query.setParameter("custType", "Primary");
		query.setParameter("startDate", today30);
		query.setParameter("endDate", today);
		query.setParameter("appStatus", "ACCOUNT OPENED");
		query.setParameter("appStatus1", "KYC Pending");
		query.setMaxResults(10);
		
		List<Object> detailsByAccountOpenedDefault = query.getResultList();

		return detailsByAccountOpenedDefault;
	}
	
	public List<Object> getDetailsByUnderProcessingDefault() {

		Query query = getEntityManager()
				.createQuery("select ar.id,marri1.recordId,rm.rmName,apd.firstName,apd.lastName,ar.modifiedDate,ar.appStatus,"
						+ "mac.isAppLocked,mac.lockedBy,mac.kycDone,mac.kycStatus,mac.kycUrl,mac.kycDoneBy,mac.kycDate, "
						+ "mac.wcDone,mac.wcStatus,mac.wcUrl,mac.wcDoneBy,mac.wcDate, "
						+ "mac.ccDone,mac.ccStatus,mac.ccUrl,mac.ccDoneBy,mac.ccDate, "
						+ "mac.icDone,mac.icStatus,mac.icUrl,mac.icDoneBy,mac.icDate "
						+ "from MobRmAppRefId ar, ApplicantPersonalDetails apd,MobAppRefRecordId marri1,RMDetails rm,MobApplCheck mac "
						+ "where ar.id=apd.id AND ar.id=marri1.id AND ar.rmUsedId=rm.id AND ar.id=mac.id " 
						+ "AND ar.appStatus=:appStatus AND apd.customerType =:custType "
						+ "AND marri1.createdDate=(select max(marri2.createdDate) from MobAppRefRecordId marri2 "
						+ "where marri2.id = marri1.id) AND ar.appStatus not in :appStatus1 " 
						+ "order by ar.modifiedDate ASC");

		query.setParameter("custType", "Primary");
		query.setParameter("appStatus", "Under Processing");
		query.setParameter("appStatus1", "KYC Pending");
		
		List<Object> detailsByUnderProcessingDefault = query.getResultList();

		return detailsByUnderProcessingDefault; 
	}

	public List<Object> getDetailsByAccountRejectedName(String name) {

		Query query = getEntityManager()
				.createQuery("select ar.id,marri1.recordId,rm.rmName,apd.firstName,apd.lastName,ar.modifiedDate "
						+ "from MobRmAppRefId ar, ApplicantPersonalDetails apd,MobAppRefRecordId marri1,RMDetails rm "
						+ "where ar.id=apd.id AND ar.id=marri1.id " + "AND ar.appStatus=:appStatus "
						+ "AND apd.customerType =:custType AND ar.rmUsedId=rm.id "
						+ "AND (lower(apd.firstName) || ' ' || lower(apd.lastName)) like lower(:name) "
						+ "AND marri1.createdDate=(select max(marri2.createdDate) from MobAppRefRecordId marri2 "
						+ "where marri2.id = marri1.id) AND ar.appStatus not in :appStatus1 "
						+ "order by ar.modifiedDate desc");

		query.setParameter("appStatus", "ACCOUNT REJECTED");
		query.setParameter("name", "%" + name + "%");
		query.setParameter("custType", "Primary");
		query.setParameter("appStatus1", "KYC Pending");
		
		List<Object> detailsByAccountRejectedName = query.getResultList();

		return detailsByAccountRejectedName;
	}

	public List<Object> getDetailsByAccountOpenedName(String name) {

		Query query = getEntityManager()
				.createQuery("select ar.id,marri1.recordId,rm.rmName,apd.firstName,apd.lastName,ar.accountNumber,ar.modifiedDate "
						+ "from MobRmAppRefId ar, ApplicantPersonalDetails apd,MobAppRefRecordId marri1,RMDetails rm "
						+ "where ar.id=apd.id AND ar.id=marri1.id " + "AND ar.appStatus=:appStatus "
						+ "AND apd.customerType =:custType AND ar.rmUsedId=rm.id "
						+ "AND (lower(apd.firstName) || ' ' || lower(apd.lastName)) like lower(:name) "
						+ "AND marri1.createdDate=(select max(marri2.createdDate) from MobAppRefRecordId marri2 "
						+ "where marri2.id = marri1.id) AND ar.appStatus not in :appStatus1 "
						+ "order by ar.modifiedDate desc");

		query.setParameter("appStatus", "ACCOUNT OPENED");
		query.setParameter("name", "%" + name + "%");
		query.setParameter("custType", "Primary");
		query.setParameter("appStatus1", "KYC Pending");
		
		List<Object> detailsByAccountOpenedName = query.getResultList();

		return detailsByAccountOpenedName;
	}
	
	public List<Object> getDetailsByUnderProcessingName(String name) {

		Query query = getEntityManager()
				.createQuery("select ar.id,marri1.recordId,rm.rmName,apd.firstName,apd.lastName,ar.modifiedDate,ar.appStatus,"
						+ "mac.isAppLocked,mac.lockedBy,mac.kycDone,mac.kycStatus,mac.kycUrl,mac.kycDoneBy,mac.kycDate, "
						+ "mac.wcDone,mac.wcStatus,mac.wcUrl,mac.wcDoneBy,mac.wcDate, "
						+ "mac.ccDone,mac.ccStatus,mac.ccUrl,mac.ccDoneBy,mac.ccDate, "
						+ "mac.icDone,mac.icStatus,mac.icUrl,mac.icDoneBy,mac.icDate "
						+ "from MobRmAppRefId ar, ApplicantPersonalDetails apd,MobAppRefRecordId marri1,RMDetails rm,MobApplCheck mac "
						+ "where ar.id=apd.id AND ar.id=marri1.id AND ar.rmUsedId=rm.id AND ar.id=mac.id " 
						+ "AND ar.appStatus=:appStatus AND apd.customerType =:custType "
						+ "AND (lower(apd.firstName) || ' ' || lower(apd.lastName)) like lower(:name) "
						+ "AND marri1.createdDate=(select max(marri2.createdDate) from MobAppRefRecordId marri2 "
						+ "where marri2.id = marri1.id) AND ar.appStatus not in :appStatus1 "
						+ "order by ar.modifiedDate desc");

		query.setParameter("appStatus", "Under Processing");
		query.setParameter("name", "%" + name + "%");
		query.setParameter("custType", "Primary");
		query.setParameter("appStatus1", "KYC Pending");
		
		List<Object> detailsByUnderProcessingName = query.getResultList();

		return detailsByUnderProcessingName;
	}

	public List<Object> getDetailsByAccountRejectedDates(Date startDate, Date endDate) {
		Query query = getEntityManager()
				.createQuery("select ar.id,marri1.recordId,rm.rmName,apd.firstName,apd.lastName,ar.modifiedDate "
						+ "from MobRmAppRefId ar, ApplicantPersonalDetails apd,MobAppRefRecordId marri1,RMDetails rm "
						+ "where ar.id=apd.id AND ar.id=marri1.id AND ar.rmUsedId=rm.id "
						+ "AND ar.modifiedDate between :startDate and :endDate AND ar.appStatus=:appStatus "
						+ "AND marri1.createdDate=(select max(marri2.createdDate) from MobAppRefRecordId marri2 "
						+ "where marri2.id = marri1.id) AND ar.appStatus not in :appStatus1 "
						+ "AND apd.customerType =:custType order by ar.modifiedDate desc");

		query.setParameter("appStatus", "ACCOUNT REJECTED");
		query.setParameter("custType", "Primary");
		query.setParameter("startDate", startDate);
		query.setParameter("endDate", endDate);
		query.setParameter("appStatus1", "KYC Pending");
		
		List<Object> getDetailsByAccountRejectedDates = query.getResultList();

		return getDetailsByAccountRejectedDates;
	}
	
	public List<Object> getDetailsByAccountOpenedDates(Date startDate, Date endDate) {
		Query query = getEntityManager()
				.createQuery("select ar.id,marri1.recordId,rm.rmName,apd.firstName,apd.lastName,ar.accountNumber,ar.modifiedDate "
						+ "from MobRmAppRefId ar, ApplicantPersonalDetails apd,MobAppRefRecordId marri1,RMDetails rm "
						+ "where ar.id=apd.id AND ar.id=marri1.id " + "AND ar.appStatus=:appStatus "
						+ "AND ar.modifiedDate between :startDate and :endDate  AND ar.rmUsedId=rm.id "
						+ "AND marri1.createdDate=(select max(marri2.createdDate) from MobAppRefRecordId marri2 "
						+ "where marri2.id = marri1.id) AND ar.appStatus not in :appStatus1 "
						+ "AND apd.customerType =:custType " + "order by ar.modifiedDate desc");

		query.setParameter("appStatus", "ACCOUNT OPENED");
		query.setParameter("custType", "Primary");
		query.setParameter("startDate", startDate);
		query.setParameter("endDate", endDate);
		query.setParameter("appStatus1", "KYC Pending");
		
		List<Object> getDetailsByDates = query.getResultList();

		return getDetailsByDates;
	}
	
	public List<Object> getDetailsByUnderProcessingDates(Date startDate, Date endDate) {
		Query query = getEntityManager()
				.createQuery("select ar.id,marri1.recordId,rm.rmName,apd.firstName,apd.lastName,ar.modifiedDate,ar.appStatus,"
						+ "mac.isAppLocked,mac.lockedBy,mac.kycDone,mac.kycStatus,mac.kycUrl,mac.kycDoneBy,mac.kycDate, "
						+ "mac.wcDone,mac.wcStatus,mac.wcUrl,mac.wcDoneBy,mac.wcDate, "
						+ "mac.ccDone,mac.ccStatus,mac.ccUrl,mac.ccDoneBy,mac.ccDate, "
						+ "mac.icDone,mac.icStatus,mac.icUrl,mac.icDoneBy,mac.icDate "
						+ "from MobRmAppRefId ar, ApplicantPersonalDetails apd,MobAppRefRecordId marri1,RMDetails rm,MobApplCheck mac "
						+ "where ar.id=apd.id AND ar.id=marri1.id AND ar.rmUsedId=rm.id AND ar.id=mac.id " 
						+ "AND ar.appStatus=:appStatus AND apd.customerType =:custType "
						+ "AND ar.modifiedDate between :startDate and :endDate "
						+ "AND marri1.createdDate=(select max(marri2.createdDate) from MobAppRefRecordId marri2 "
						+ "where marri2.id = marri1.id) AND ar.appStatus not in :appStatus1 "  
						+ "order by ar.modifiedDate desc");

		query.setParameter("appStatus", "Under Processing");
		query.setParameter("custType", "Primary");
		query.setParameter("startDate", startDate);
		query.setParameter("endDate", endDate);
		query.setParameter("appStatus1", "KYC Pending");
		
		List<Object> getDetailsByUnderProcessingDates = query.getResultList();

		return getDetailsByUnderProcessingDates;
	}

	public List<Object> getDetailsByAccountRejectedAllCriteria(String name, Date startDate, Date endDate) {

		Query query = getEntityManager()
				.createQuery("select ar.id,marri1.recordId,rm.rmName,apd.firstName,apd.lastName,ar.modifiedDate "
						+ "from MobRmAppRefId ar, ApplicantPersonalDetails apd,MobAppRefRecordId marri1,RMDetails rm "
						+ "where ar.id=apd.id AND ar.id=marri1.id " + "AND ar.appStatus=:appStatus "
						+ "AND apd.customerType =:custType AND ar.rmUsedId=rm.id "
						+ "AND ar.modifiedDate between :startDate and :endDate "
						+ "AND (lower(apd.firstName) || ' ' || lower(apd.lastName)) like lower(:name) "
						+ "AND marri1.createdDate=(select max(marri2.createdDate) from MobAppRefRecordId marri2 "
						+ "where marri2.id = marri1.id) AND ar.appStatus not in :appStatus1 "
						+ "order by ar.modifiedDate desc");

		query.setParameter("appStatus", "ACCOUNT REJECTED");
		query.setParameter("custType", "Primary");
		query.setParameter("startDate", startDate);
		query.setParameter("endDate", endDate);
		query.setParameter("name", "%" + name + "%");
		query.setParameter("appStatus1", "KYC Pending");
		
		List<Object> detailsByAccountRejectedAllCriteria = query.getResultList();

		return detailsByAccountRejectedAllCriteria;
	}
	
	public List<Object> getDetailsByAccountOpenedAllCriteria(String name, Date startDate, Date endDate) {

		Query query = getEntityManager()
				.createQuery("select ar.id,marri1.recordId,rm.rmName,apd.firstName,apd.lastName,ar.accountNumber,ar.modifiedDate "
						+ "from MobRmAppRefId ar, ApplicantPersonalDetails apd,MobAppRefRecordId marri1,RMDetails rm "
						+ "where ar.id=apd.id AND ar.id=marri1.id " + "AND ar.appStatus=:appStatus "
						+ "AND apd.customerType =:custType AND ar.rmUsedId=rm.id "
						+ "AND ar.modifiedDate between :startDate and :endDate "
						+ "AND (lower(apd.firstName) || ' ' || lower(apd.lastName)) like lower(:name) "
						+ "AND marri1.createdDate=(select max(marri2.createdDate) from MobAppRefRecordId marri2 "
						+ "where marri2.id = marri1.id) AND ar.appStatus not in :appStatus1 "
						+ "order by ar.modifiedDate desc");

		query.setParameter("appStatus", "ACCOUNT OPENED");
		query.setParameter("custType", "Primary");
		query.setParameter("startDate", startDate);
		query.setParameter("endDate", endDate);
		query.setParameter("name", "%" + name + "%");
		query.setParameter("appStatus1", "KYC Pending");
		
		List<Object> detailsByAccountOpenedAllCriteria = query.getResultList();

		return detailsByAccountOpenedAllCriteria;
	}
	
	public List<Object> getDetailsByUnderProcessingAllCriteria(String name, Date startDate, Date endDate) {

		Query query = getEntityManager()
				.createQuery("select ar.id,marri1.recordId,rm.rmName,apd.firstName,apd.lastName,ar.modifiedDate,ar.appStatus,"
						+ "mac.isAppLocked,mac.lockedBy,mac.kycDone,mac.kycStatus,mac.kycUrl,mac.kycDoneBy,mac.kycDate, "
						+ "mac.wcDone,mac.wcStatus,mac.wcUrl,mac.wcDoneBy,mac.wcDate, "
						+ "mac.ccDone,mac.ccStatus,mac.ccUrl,mac.ccDoneBy,mac.ccDate, "
						+ "mac.icDone,mac.icStatus,mac.icUrl,mac.icDoneBy,mac.icDate "
						+ "from MobRmAppRefId ar, ApplicantPersonalDetails apd,MobAppRefRecordId marri1,RMDetails rm,MobApplCheck mac "
						+ "where ar.id=apd.id AND ar.id=marri1.id AND ar.rmUsedId=rm.id AND ar.id=mac.id " 
						+ "AND ar.appStatus=:appStatus AND apd.customerType =:custType "
						+ "AND ar.modifiedDate between :startDate and :endDate "
						+ "AND (lower(apd.firstName) || ' ' || lower(apd.lastName)) like lower(:name) "
						+ "AND marri1.createdDate=(select max(marri2.createdDate) from MobAppRefRecordId marri2 "
						+ "where marri2.id = marri1.id) AND ar.appStatus not in :appStatus1 "
						+ "order by ar.modifiedDate desc");

		query.setParameter("appStatus", "Under Processing");
		query.setParameter("custType", "Primary");
		query.setParameter("startDate", startDate);
		query.setParameter("endDate", endDate);
		query.setParameter("name", "%" + name + "%");
		query.setParameter("appStatus1", "KYC Pending");

		List<Object> detailsByUnderProcessingAllCriteria = query.getResultList();

		return detailsByUnderProcessingAllCriteria;
	}

	@Transactional(readOnly = false, rollbackFor = {Exception.class})
	public void updateErrorMessage(MobApplCheckComments mobApplCheckComment) {

		System.out.println("Enter : updateErrorMessage() id : " + mobApplCheckComment.getId() +" | recordId" + mobApplCheckComment.getRecordId());
		if (null != mobApplCheckComment.getId() && null != mobApplCheckComment.getRecordId()) {
			Query query = getEntityManager().createQuery("select ar from MobApplCheckComments ar where ar.id=:id and ar.recordId=:recordId");
			query.setParameter("id", mobApplCheckComment.getId());
			query.setParameter("recordId", mobApplCheckComment.getRecordId());
			List<MobApplCheckComments> mobApplCheckCommentsList = query.getResultList();
			if (null != mobApplCheckCommentsList && !mobApplCheckCommentsList.isEmpty()) {
				
				MobApplCheckComments mobApplCheckComments = mobApplCheckCommentsList.get(0);
				mobApplCheckComments.setFlexErrorCode(mobApplCheckComment.getFlexErrorCode());
				mobApplCheckComments.setFlexErrorMessage(mobApplCheckComment.getFlexErrorMessage());
				getEntityManager().merge(mobApplCheckComments);
				getEntityManager().flush();
			}
			else{
				System.out.println("No record found to update : updateErrorMessage()");
			}
		}
		System.out.println("Exit : updateErrorMessage()");
		
	}

}