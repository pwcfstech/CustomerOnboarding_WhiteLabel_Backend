package com.afrAsia.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.afrAsia.dao.jpa.DashBoardJpaDao;
import com.afrAsia.entities.jpa.DashBoardApplicationReferenceID;
import com.afrAsia.entities.request.MessageHeader;
import com.afrAsia.entities.response.AppLoggedSummary;
import com.afrAsia.entities.response.Apps;
import com.afrAsia.entities.response.AverageProductivity;
import com.afrAsia.entities.response.DashboardResponse;
import com.afrAsia.entities.response.PendingAction;
import com.afrAsia.service.DashBoardService;

public class DashBoardServiceImpl implements DashBoardService {

	private DashBoardJpaDao dashBoardDao;

	public DashBoardJpaDao getDashBoardDao() {
		return dashBoardDao;
	}

	public void setDashBoardDao(DashBoardJpaDao dashBoardDao) {
		this.dashBoardDao = dashBoardDao;
	}

	public List<AverageProductivity> getAvgProductivity() {

		AverageProductivity averageProductivity = new AverageProductivity();
		
		List<AverageProductivity> listOfAverageProductivity = new ArrayList<AverageProductivity>();

		List<DashBoardApplicationReferenceID> listMonthlyRecords = new ArrayList<DashBoardApplicationReferenceID>();

		List<DashBoardApplicationReferenceID> listQuarterlyRecords = new ArrayList<DashBoardApplicationReferenceID>();

		List<DashBoardApplicationReferenceID> listHalfYearlyRecords = new ArrayList<DashBoardApplicationReferenceID>();

		List<DashBoardApplicationReferenceID> listYearlyRecords = new ArrayList<DashBoardApplicationReferenceID>();

		// set quarterly average record

		listMonthlyRecords = (List<DashBoardApplicationReferenceID>) dashBoardDao.getMonthly();

		double avgMonthly = ((listMonthlyRecords.size()) / 30.0);

		if (avgMonthly < 0.1) {
			averageProductivity.setAvgMonthly(0.0);
			listOfAverageProductivity.add(averageProductivity);
		} else {
			averageProductivity.setAvgMonthly(avgMonthly);
			listOfAverageProductivity.add(averageProductivity);
		}

		// set quarterly average record

		listQuarterlyRecords = (List<DashBoardApplicationReferenceID>) dashBoardDao.getQuarterly();

		double avgQuarterly = ((listQuarterlyRecords.size()) / 30.0) / 3;

		if (avgQuarterly < 0.1) {
			averageProductivity.setAvgQuarterly(0.0);
			listOfAverageProductivity.add(averageProductivity);
		} else {
			averageProductivity.setAvgQuarterly(avgQuarterly);
			listOfAverageProductivity.add(averageProductivity);
		}

		// set Half Yearly average record

		listHalfYearlyRecords = (List<DashBoardApplicationReferenceID>) dashBoardDao.getHalfYeary();

		double avgHalfYearly = ((listHalfYearlyRecords.size()) / 30.0) / 6;

		if (avgHalfYearly < 0.1) {
			averageProductivity.setAvgHalfYearly(0.0);
			listOfAverageProductivity.add(averageProductivity);
		} else {
			averageProductivity.setAvgHalfYearly(avgHalfYearly);
			listOfAverageProductivity.add(averageProductivity);
		}

		// set Yearly average record

		listYearlyRecords = (List<DashBoardApplicationReferenceID>) dashBoardDao.getYearly();

		double avgYearly = ((listYearlyRecords.size()) / 30.0) / 12;

		if (avgYearly < 0.1) {
			averageProductivity.setAvgYearly(0.0);
			listOfAverageProductivity.add(averageProductivity);
		} else {
			averageProductivity.setAvgYearly(avgYearly);
			listOfAverageProductivity.add(averageProductivity);
		}
		return listOfAverageProductivity;
	}

	public List<AppLoggedSummary> getAppLoggedSummary() {

		AppLoggedSummary appLoggedSummary = new AppLoggedSummary();
		
		List<AppLoggedSummary> listOfAppLoggedSummaries=new ArrayList<AppLoggedSummary>();

		List<DashBoardApplicationReferenceID> listOfLoggedUsers = new ArrayList<DashBoardApplicationReferenceID>();

		List<DashBoardApplicationReferenceID> listOfAccountsOpened = new ArrayList<DashBoardApplicationReferenceID>();

		List<DashBoardApplicationReferenceID> listOfAccountsUnderProcessing = new ArrayList<DashBoardApplicationReferenceID>();

		List<DashBoardApplicationReferenceID> listOfRejectedAccounts = new ArrayList<DashBoardApplicationReferenceID>();

		// check number of logged users in last 30 days

		listOfLoggedUsers = (List<DashBoardApplicationReferenceID>) dashBoardDao.getLogged();

		int loggedUsers = listOfLoggedUsers.size();

		if (loggedUsers == 0) {
			appLoggedSummary.setLogged(0);
			listOfAppLoggedSummaries.add(appLoggedSummary);
		} else {
			appLoggedSummary.setLogged(loggedUsers);
			listOfAppLoggedSummaries.add(appLoggedSummary);
		}

		// check number of accounts opened in last 30 days

		listOfAccountsOpened = (List<DashBoardApplicationReferenceID>) dashBoardDao.getOpened();

		int numberOfOpenedAccount = listOfAccountsOpened.size();

		if (numberOfOpenedAccount == 0) {
			appLoggedSummary.setOpened(0);
			listOfAppLoggedSummaries.add(appLoggedSummary);
		} else {
			appLoggedSummary.setOpened(numberOfOpenedAccount);
			listOfAppLoggedSummaries.add(appLoggedSummary);
		}

		// check number of Accounts UnderProcessing in last 30 days

		listOfAccountsUnderProcessing = (List<DashBoardApplicationReferenceID>) dashBoardDao.getUnderProcessing();

		int numberOfAccountsUnderProcessing = listOfAccountsUnderProcessing.size();

		if (numberOfAccountsUnderProcessing == 0) {
			appLoggedSummary.setUnderProcessing(0);
			listOfAppLoggedSummaries.add(appLoggedSummary);
		} else {
			appLoggedSummary.setUnderProcessing(numberOfAccountsUnderProcessing);
			listOfAppLoggedSummaries.add(appLoggedSummary);
		}

		// check number of Accounts UnderProcessing in last 30 days

		listOfRejectedAccounts = (List<DashBoardApplicationReferenceID>) dashBoardDao.getRejected();

		int numberOfAccountsRejected = listOfRejectedAccounts.size();

		if (numberOfAccountsRejected == 0) {
			appLoggedSummary.setRejected(0);
			listOfAppLoggedSummaries.add(appLoggedSummary);
		} else {
			appLoggedSummary.setRejected(numberOfAccountsRejected); 
			listOfAppLoggedSummaries.add(appLoggedSummary);
		}

		return listOfAppLoggedSummaries;
	}

	public List<PendingAction> getPendingAction() {
		
		PendingAction pendingAction = new PendingAction();
		
		List<PendingAction> listOfPendingActions=new ArrayList<PendingAction>();

		List<Apps> listApps=new ArrayList<Apps>();
		
		Apps apps=new Apps();
		
		List<DashBoardApplicationReferenceID> listOfReferenceNumber = new ArrayList<DashBoardApplicationReferenceID>();
		
		List<DashBoardApplicationReferenceID> listOfCustormerName = new ArrayList<DashBoardApplicationReferenceID>();
		
		List<DashBoardApplicationReferenceID> listOfPendingSinceStatus = new ArrayList<DashBoardApplicationReferenceID>();
		
		// get number of application reference number
		
		listOfReferenceNumber=(List<DashBoardApplicationReferenceID>) dashBoardDao.getRefNo();
		
		for(DashBoardApplicationReferenceID id:listOfReferenceNumber){
			
			apps.setRefNo(String.valueOf(id.getId()));
			listApps.add(apps);
		}
		
		// get all the customer names		--------------- pending 
		
		listOfCustormerName=(List<DashBoardApplicationReferenceID>) dashBoardDao.getRefNo();
				
		for(DashBoardApplicationReferenceID id:listOfCustormerName){
					
			apps.setCustomerName(String.valueOf(id.getId()));
			listApps.add(apps);
					
		}
				
		// get number of pending dates 
				
		listOfPendingSinceStatus=(List<DashBoardApplicationReferenceID>) dashBoardDao.getPendingSinceStatus();
				
		for(DashBoardApplicationReferenceID id:listOfPendingSinceStatus){
					
			apps.setRefNo(String.valueOf(id.getId()));
			listApps.add(apps);
		}
		pendingAction.setApps(listApps);
		listOfPendingActions.add(pendingAction);
		return listOfPendingActions;
	}

	public DashboardResponse getDashBoardSummery() {
		
		DashboardResponse dashboardResponse=new DashboardResponse();
		
		dashboardResponse.setAvgProductivity(getAvgProductivity());
		
		dashboardResponse.setAppLoggedSummary(getAppLoggedSummary());
		
		dashboardResponse.setPendingAction(getPendingAction());
		
		dashboardResponse.setMessageHeader(null);
		
		return dashboardResponse; 
	}

}
