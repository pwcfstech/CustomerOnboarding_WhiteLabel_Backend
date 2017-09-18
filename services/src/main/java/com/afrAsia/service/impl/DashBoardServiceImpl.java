package com.afrAsia.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.NoResultException;

import org.apache.log4j.Logger;

import com.afrAsia.dao.jpa.DashBoardJpaDao;
import com.afrAsia.entities.jpa.ApplicationReference;
import com.afrAsia.entities.response.AppLoggedSummary;
import com.afrAsia.entities.response.Apps;
import com.afrAsia.entities.response.AverageProductivity;
import com.afrAsia.entities.response.DashboardResponse;
import com.afrAsia.entities.response.MessageHeader;
import com.afrAsia.entities.response.PendingAction;
import com.afrAsia.entities.response.RequestError;
import com.afrAsia.service.DashBoardService;

public class DashBoardServiceImpl implements DashBoardService {

	final static Logger debugLog = Logger.getLogger("debugLogger");
	final static Logger infoLog = Logger.getLogger("infoLogger");
	final static Logger errorLog = Logger.getLogger("errorLogger");
	
	private DashBoardJpaDao dashBoardDao;

	public DashBoardJpaDao getDashBoardDao() {
		return dashBoardDao;
	}

	public void setDashBoardDao(DashBoardJpaDao dashBoardDao) {
		this.dashBoardDao = dashBoardDao;
	}
	
	public static double round(double value, int places) {
	    if (places < 0) throw new IllegalArgumentException();

	    long factor = (long) Math.pow(10, places);
	    value = value * factor;
	    long tmp = Math.round(value);
	    return (double) tmp / factor;
	}

	public AverageProductivity getAvgProductivity(String rmId) {

		AverageProductivity averageProductivity = new AverageProductivity();

		List<ApplicationReference> listMonthlyRecords = new ArrayList<ApplicationReference>();

		List<ApplicationReference> listQuarterlyRecords = new ArrayList<ApplicationReference>();

		List<ApplicationReference> listHalfYearlyRecords = new ArrayList<ApplicationReference>();

		List<ApplicationReference> listYearlyRecords = new ArrayList<ApplicationReference>();

		// set quarterly average record

		listMonthlyRecords = (List<ApplicationReference>) dashBoardDao.getMonthly(rmId);

		double avgMonthly = (listMonthlyRecords.size()) ;

		if (avgMonthly < 0.1) {
			debugLog.debug(" avgMonthly value is less than 0.1 ");
			averageProductivity.setAvgMonthly(0.0);
		} else {
			averageProductivity.setAvgMonthly(avgMonthly);
			debugLog.debug(" avgMonthly value is : "+averageProductivity.getAvgMonthly());
		}
		
		// set quarterly average record

		listQuarterlyRecords = (List<ApplicationReference>) dashBoardDao.getQuarterly(rmId);

		double avgQuarterly = (listQuarterlyRecords.size()) / 3D;
		
		avgQuarterly=round(avgQuarterly, 1);
		
		if (avgQuarterly < 0.1) {
			debugLog.debug(" avgQuarterly value is less than 0.1 ");
			averageProductivity.setAvgQuarterly(0.0);
		} else {
			averageProductivity.setAvgQuarterly(avgQuarterly);
			debugLog.debug(" avgQuarterly value is : "+averageProductivity.getAvgQuarterly());
		}

		// set Half Yearly average record

		listHalfYearlyRecords = (List<ApplicationReference>) dashBoardDao.getHalfYeary(rmId);

		double avgHalfYearly = (listHalfYearlyRecords.size()) / 6D;
		
		avgHalfYearly=round(avgHalfYearly, 1);
		
		if (avgHalfYearly < 0.1) {
			debugLog.debug(" avgHalfYearly value is less than 0.1 ");
			averageProductivity.setAvgHalfYearly(0.0);
		} else {
			averageProductivity.setAvgHalfYearly(avgHalfYearly);
			debugLog.debug(" AvgHalfYearly value is : "+averageProductivity.getAvgHalfYearly());
		}

		// set Yearly average record

		listYearlyRecords = (List<ApplicationReference>) dashBoardDao.getYearly(rmId);

		double avgYearly = (listYearlyRecords.size())  / 12D;
		avgYearly=round(avgYearly, 1);
		
		if (avgYearly < 0.1) {
			debugLog.debug(" avgYearly value is less than 0.1 ");
			averageProductivity.setAvgYearly(0.0);
		} else {
			averageProductivity.setAvgYearly(avgYearly);
			debugLog.debug(" avgYearly value is : "+averageProductivity.getAvgYearly());
		}

		return averageProductivity;
	}

	public AppLoggedSummary getAppLoggedSummary(String rmId) {

		AppLoggedSummary appLoggedSummary = new AppLoggedSummary();

		List<ApplicationReference> listOfLoggedUsers = new ArrayList<ApplicationReference>();

		List<ApplicationReference> listOfAccountsOpened = new ArrayList<ApplicationReference>();

		List<ApplicationReference> listOfAccountsUnderProcessing = new ArrayList<ApplicationReference>();

		List<ApplicationReference> listOfRejectedAccounts = new ArrayList<ApplicationReference>();

		// check number of logged users in last 30 days

		listOfLoggedUsers = (List<ApplicationReference>) dashBoardDao.getLogged(rmId);

		int loggedUsers = listOfLoggedUsers.size();

		if (loggedUsers == 0) {
			debugLog.debug(" loggedUsers are 0 ");
			appLoggedSummary.setLogged(0);
		} else {
			appLoggedSummary.setLogged(loggedUsers);
			debugLog.debug(" loggedUsers are : "+appLoggedSummary.getLogged());
		}

		// check number of accounts opened in last 30 days

		listOfAccountsOpened = (List<ApplicationReference>) dashBoardDao.getOpened(rmId);

		int numberOfOpenedAccount = listOfAccountsOpened.size();

		if (numberOfOpenedAccount == 0) {
			debugLog.debug(" numberOfOpenedAccount are 0 ");
			appLoggedSummary.setOpened(0);
		} else {
			appLoggedSummary.setOpened(numberOfOpenedAccount);
			debugLog.debug(" numberOfOpenedAccount are : "+appLoggedSummary.getOpened());
		}

		// check number of Accounts UnderProcessing in last 30 days

		listOfAccountsUnderProcessing = (List<ApplicationReference>) dashBoardDao.getUnderProcessing(rmId);

		int numberOfAccountsUnderProcessing = listOfAccountsUnderProcessing.size();

		if (numberOfAccountsUnderProcessing == 0) {
			debugLog.debug(" numberOfAccountsUnderProcessing is 0 ");
			appLoggedSummary.setUnderProcessing(0);
		} else {
			appLoggedSummary.setUnderProcessing(numberOfAccountsUnderProcessing);
			debugLog.debug(" numberOfAccountsUnderProcessing is : "+appLoggedSummary.getUnderProcessing());
		}

		// check number of Accounts UnderProcessing in last 30 days

		listOfRejectedAccounts = (List<ApplicationReference>) dashBoardDao.getRejected(rmId);

		int numberOfAccountsRejected = listOfRejectedAccounts.size();

		if (numberOfAccountsRejected == 0) {
			debugLog.debug(" numberOfAccountsRejected is 0 ");
			appLoggedSummary.setRejected(0);
		} else {
			appLoggedSummary.setRejected(numberOfAccountsRejected);
			debugLog.debug(" numberOfAccountsRejected is : "+appLoggedSummary.getRejected());
		}

		return appLoggedSummary;
	}

	public PendingAction getPendingAction(String rmId) {

		PendingAction pendingAction = new PendingAction();

		List<Apps> listApps = new ArrayList<Apps>();
		
		Set<Apps> setOfApps = new LinkedHashSet<Apps>(listApps);

		List<Long> listOfReferenceNumber = new ArrayList<Long>();

		List<Object> listOfCustormerName = new ArrayList<Object>();

		List<Date> listOfPendingSinceStatus = new ArrayList<Date>();

		// get number of application reference number

		listOfReferenceNumber = (List<Long>) dashBoardDao.getRefNo(rmId);

		for (Long id : listOfReferenceNumber) {
			Apps apps=new Apps();
			apps.setRefNo(id + "");
			listApps.add(apps);
		}

		// get all the customer names --------------- pending

		listOfCustormerName = (List<Object>) dashBoardDao.getCustermerName(rmId);
		
		int i = 0;
		for (Object object : listOfCustormerName) {
			Apps apps = listApps.get(i);
			Object[] outputs = (Object[]) object;
			apps.setCustomerName(outputs[0].toString() + " " /*+ outputs[1].toString() + " "*/ + outputs[1].toString());
			listApps.add(apps);   
			i++;
		}

		// get number of pending dates

		listOfPendingSinceStatus = (List<Date>) dashBoardDao.getPendingSinceStatus(rmId);
		for (Date date : listOfPendingSinceStatus) {
			Apps apps = listApps.get(i);
			apps.setPendingSince(date.getTime());
			apps.setPendingSince(date.getTime());
			listApps.add(apps);
			i++;
		}
		
		setOfApps.addAll(listApps);
		pendingAction.setApps(setOfApps);
		debugLog.debug(" pendingAction is : "+pendingAction.getApps());
		return pendingAction;
	}

	public DashboardResponse getDashBoardSummery(String rmId) {
		DashboardResponse dashboardResponse = new DashboardResponse();
		
		/*List<String> id= dashBoardDao.getId(rmId);
		
		ApplicationReference applicationReference=new ApplicationReference();
		for(String object:id){
			applicationReference.setRmUserId(object);
		}*/
		// check whether the given RmId is present in DB or not 
		//String rmUserIdFromDB=null;
		try{			
			//rmUserIdFromDB= dashBoardDao.getRmId(rmId);			
			/*if(rmUserIdFromDB==null){
						throw new IdNotFoundException("Provided RM user id is not present, please pass proper value");
					}*/
		}  
		/*catch(IdNotFoundException exceptionMessage){
					MessageHeader messageHeader=new MessageHeader();
					RequestError requestError=new RequestError();
					requestError.setRsn("Provided Rm user id is not present");
					messageHeader.setError(requestError);
					rmApplicationAppResponse.setMessageHeader(messageHeader);
					return rmApplicationAppResponse;
				}	*/
		catch(NoResultException excpMessage){
			MessageHeader messageHeader=new MessageHeader();
			RequestError requestError=new RequestError();
			requestError.setCustomCode("requested RM user is not present, please pass another RM userid");
			messageHeader.setError(requestError);
			dashboardResponse.setMessageHeader(messageHeader);
			return dashboardResponse;
		}

		dashboardResponse.setAvgProductivity(getAvgProductivity(rmId));
		dashboardResponse.setAppLoggedSummary(getAppLoggedSummary(rmId));
		dashboardResponse.setPendingAction(getPendingAction(rmId));
		
		debugLog.debug(" AvgProductivity is : "+dashboardResponse.getAvgProductivity()+
				" AppLoggedSummary is : "+dashboardResponse.getAppLoggedSummary()+
				" PendingAction is : "+dashboardResponse.getPendingAction());
		
		/*try{	
			if(applicationReference.getRmUserId() !=null && applicationReference.getRmUserId().equals(rmId)){ 
				dashboardResponse.setAvgProductivity(getAvgProductivity(rmId));
				dashboardResponse.setAppLoggedSummary(getAppLoggedSummary(rmId));
				dashboardResponse.setPendingAction(getPendingAction(rmId));
		    }
			else{
				MessageHeader messageHeader=new MessageHeader();
				RequestError requestError=new RequestError();
				requestError.setCustomCode("requested RM user is not present for the given id , please pass another RM userid");
				messageHeader.setError(requestError);
				dashboardResponse.setMessageHeader(messageHeader);
				throw new IdNotFoundException("Provided Rm user id is not present, please pass another id");
			}
		}catch(IdNotFoundException exceptionMessage){
		}
*/		debugLog.debug(" dashboardResponse is : "+dashboardResponse.toString());
		return dashboardResponse;
	}
}
