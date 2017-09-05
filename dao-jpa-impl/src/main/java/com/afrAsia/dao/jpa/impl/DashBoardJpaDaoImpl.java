package com.afrAsia.dao.jpa.impl;

import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.Query;

import com.afrAsia.dao.jpa.DashBoardJpaDao;
import com.afrAsia.entities.jpa.ApplicationReference;

public class DashBoardJpaDaoImpl extends BaseJpaDAOImpl<String, ApplicationReference> implements DashBoardJpaDao {

	/*public List<String> getId(String id) {
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

	public Collection<ApplicationReference> getMonthly(String rmId) {

		String queryString = "from ApplicationReference ar where lower(ar.appStatus)=lower(:as) AND ar.rmUserId=:rmID "
				+ "and ar.updatedTime between :stDate and :edDate ";

		Query query = getEntityManager().createQuery(queryString);

		Date today = new Date();
		Calendar cal = new GregorianCalendar();
		cal.setTime(today);
		cal.add(Calendar.DAY_OF_MONTH, -30);
		Date today30 = cal.getTime();

		query.setParameter("as", "ACCOUNT OPENED");
		query.setParameter("rmID", rmId);
		query.setParameter("stDate", today30);
		query.setParameter("edDate", today);

		List<ApplicationReference> listOfEntries = query.getResultList();

		return listOfEntries;

	}

	public Collection<ApplicationReference> getQuarterly(String rmId) {
		String queryString = "From ApplicationReference ar where lower(ar.appStatus)=lower(:as) AND ar.rmUserId=:rmID "
				+ "and ar.updatedTime BETWEEN :stDate AND :edDate";

		Query query = getEntityManager().createQuery(queryString);
		Date today = new Date();
		Calendar cal = new GregorianCalendar();
		cal.setTime(today);
		cal.add(Calendar.DAY_OF_MONTH, -90);
		Date today90 = cal.getTime();

		query.setParameter("as", "ACCOUNT OPENED");
		query.setParameter("rmID", rmId);
		query.setParameter("stDate", today90);
		query.setParameter("edDate", today);

		List<ApplicationReference> listOfEntries = query.getResultList();

		return listOfEntries;

	}

	public Collection<ApplicationReference> getHalfYeary(String rmId) {
		String queryString = "From ApplicationReference ar where lower(ar.appStatus)=lower(:as) AND ar.rmUserId=:rmID "
				+ "and ar.updatedTime BETWEEN :stDate AND :edDate";

		Query query = getEntityManager().createQuery(queryString);
		Date today = new Date();
		Calendar cal = new GregorianCalendar();
		cal.setTime(today);
		cal.add(Calendar.DAY_OF_MONTH, -180);
		Date today180 = cal.getTime();

		query.setParameter("as", "ACCOUNT OPENED");
		query.setParameter("rmID", rmId);
		query.setParameter("stDate", today180);
		query.setParameter("edDate", today);

		List<ApplicationReference> listOfEntries = query.getResultList();

		return listOfEntries;

	}

	public Collection<ApplicationReference> getYearly(String rmId) {
		String queryString = "From ApplicationReference ar where lower(ar.appStatus)=lower(:as) AND ar.rmUserId=:rmID "
				+ "and ar.updatedTime BETWEEN :stDate AND :edDate";

		Query query = getEntityManager().createQuery(queryString);

		Calendar cal = Calendar.getInstance();
		Date today = cal.getTime();
		cal.add(Calendar.YEAR, -1);
		Date lastYear = cal.getTime();

		query.setParameter("as", "ACCOUNT OPENED");
		query.setParameter("rmID", rmId);
		query.setParameter("stDate", lastYear);
		query.setParameter("edDate", today);

		List<ApplicationReference> listOfEntries = query.getResultList();

		return listOfEntries;

	}

	public Collection<ApplicationReference> getLogged(String rmId) {

		String queryString = "From ApplicationReference ar where ar.rmUserId=:rmID "
				+ "AND trunc(ar.updatedTime) BETWEEN :stDate AND :edDate "
				+ "AND lower(ar.appStatus) NOT IN (lower(:appStatus1),lower(:appStatus2))";

		Query query = getEntityManager().createQuery(queryString);

		Date today = new Date();
		Calendar cal = new GregorianCalendar();
		cal.setTime(today);
		cal.add(Calendar.DAY_OF_MONTH, -30);
		Date today30 = cal.getTime();

		query.setParameter("stDate", today30);
		query.setParameter("rmID", rmId);
		query.setParameter("edDate", today);
		query.setParameter("appStatus1", "Require Attention");
		query.setParameter("appStatus2", "KYC Pending");

		List<ApplicationReference> listOfEntries = query.getResultList();

		return listOfEntries;

	}

	public Collection<ApplicationReference> getOpened(String rmId) {
		String queryString = "From ApplicationReference ar where lower(ar.appStatus)=lower(:as) AND ar.rmUserId=:rmID "
				+ "and ar.updatedTime BETWEEN :stDate AND :edDate";

		Query query = getEntityManager().createQuery(queryString);

		Date today = new Date();
		Calendar cal = new GregorianCalendar();
		cal.setTime(today);
		cal.add(Calendar.DAY_OF_MONTH, -30);
		Date today30 = cal.getTime();

		query.setParameter("as", "ACCOUNT OPENED");
		query.setParameter("rmID", rmId);
		query.setParameter("stDate", today30);
		query.setParameter("edDate", today);

		List<ApplicationReference> listOfEntries = query.getResultList();

		return listOfEntries;

	}

	public Collection<ApplicationReference> getUnderProcessing(String rmId) {

		String queryString = "From ApplicationReference ar where lower(ar.appStatus)=lower(:as) AND ar.rmUserId=:rmID "
				+ "and ar.updatedTime BETWEEN :stDate AND :edDate";

		Query query = getEntityManager().createQuery(queryString);

		Date today = new Date();
		Calendar cal = new GregorianCalendar();
		cal.setTime(today);
		cal.add(Calendar.DAY_OF_MONTH, -30);
		Date today30 = cal.getTime();

		query.setParameter("as", "Under Processing");
		query.setParameter("rmID", rmId);
		query.setParameter("stDate", today30);
		query.setParameter("edDate", today);

		List<ApplicationReference> listOfEntries = query.getResultList();

		return listOfEntries;

	}

	public Collection<ApplicationReference> getRejected(String rmId) {

		String queryString = "From ApplicationReference ar where lower(ar.appStatus)=lower(:as) AND ar.rmUserId=:rmID "
				+ "and ar.updatedTime BETWEEN :stDate AND :edDate";

		Query query = getEntityManager().createQuery(queryString);

		Date today = new Date();
		Calendar cal = new GregorianCalendar();
		cal.setTime(today);
		cal.add(Calendar.DAY_OF_MONTH, -30);
		Date today30 = cal.getTime();

		query.setParameter("as", "Rejected Application");
		query.setParameter("rmID", rmId);
		query.setParameter("stDate", today30);
		query.setParameter("edDate", today);

		List<ApplicationReference> listOfEntries = query.getResultList();

		return listOfEntries;

	}

	// get the details of reference number
	public Collection<Long> getRefNo(String rmId) {

		String queryString = "select ar.id From ApplicationReference ar where lower(ar.appStatus)=lower(:as) "
				+ "AND ar.rmUserId=:rmID "
				+ "order by ar.updatedTime DESC";

		Query query = getEntityManager().createQuery(queryString);

		query.setParameter("as", "Require Attention");
		query.setParameter("rmID", rmId);

		List<Long> listOfEntries = query.getResultList();

		return listOfEntries;

	}

	// get the Custermer Name
	public Collection<Object> getCustermerName(String rmId) {

		/*String queryString ="SELECT apd.firstName,apd.lastName FROM ApplicantPersonalDetails apd "
		+ "WHERE apd.id IN (SELECT ar.id FROM ApplicationReference ar "
		+ "WHERE lower(ar.appStatus) = lower(:as) AND ar.rmUserId=:rmID))"
		+ "order by apd.id DESC";*/
		String queryString = "select apd.firstName,apd.lastName "
				+ "from ApplicationReference ar, ApplicantPersonalDetails apd "
				+ "WHERE lower(ar.appStatus) = lower(:as) AND ar.rmUserId=:rmID AND ar.id=apd.id "
				+ "order by ar.updatedTime desc";
		/*Query query = getEntityManager().createQuery("select apd.firstName,apd.lastName"
				+ " from ApplicationReference ar, ApplicantPersonalDetails apd "
				+ "WHERE lower(ar.appStatus) = lower(:as) AND ar.rmUserId=:rmID"
				+ "order by ar.createdTime desc");*/

		Query query = getEntityManager().createQuery(queryString);

		query.setParameter("as", "Require Attention");
		query.setParameter("rmID", rmId);

		List<Object> listOfNames = query.getResultList();

		return listOfNames;
	}

	// get pending since status
	public Collection<Date> getPendingSinceStatus(String rmId) {

		String queryString = "select ar.updatedTime From ApplicationReference ar where "
				+ "lower(ar.appStatus)=lower(:as) AND ar.rmUserId=:rmID "
				+ "order by ar.updatedTime DESC";

		Query query = getEntityManager().createQuery(queryString);

		query.setParameter("as", "Require Attention");
		query.setParameter("rmID", rmId);

		List<Date> listOfEntries = query.getResultList();

		return listOfEntries;

	}

	public List<Object> getPendingSinceData(String rmId) {

		Query query = getEntityManager().createQuery("select ar.id, ar.updatedTime,"
				+ "apd.firstName,apd.lastName from ApplicationReference ar, ApplicantPersonalDetails apd "
				+ "where ar.id=apd.id AND ar.rmUserId=:rmid "
				+ "AND lower(ar.appStatus) =(lower(:as1)) "
				+ "order by ar.updatedTime desc");

		query.setParameter("rmid", rmId);
		query.setParameter("as1", "Require Attention");

		List<Object> detailsByefault = query.getResultList();

		return detailsByefault;

	}

	/* (non-Javadoc)
	 * @see com.afrAsia.dao.jpa.DashBoardJpaDao#updateAppStatus(com.afrAsia.entities.jpa.ApplicationReference)
	 */
	@SuppressWarnings("unchecked")
	public void updateAppStatus(ApplicationReference appRef) {
		if (null != appRef) {
			Query query = getEntityManager().createQuery("select ar from ApplicationReference ar where ar.id=:apId");
			query.setParameter("apId", appRef.getId());
			List<ApplicationReference> appRefList = query.getResultList();
			if (null != appRefList && !appRefList.isEmpty()) {
				ApplicationReference appRefDetails = appRefList.get(0);
				appRefDetails.setAppStatus(appRef.getAppStatus());
				appRefDetails.setUpdatedBy(appRef.getUpdatedBy());
				appRefDetails.setUpdatedTime(appRef.getUpdatedTime());
				getEntityManager().merge(appRefDetails);
				getEntityManager().flush();
			}
		}
	}
}