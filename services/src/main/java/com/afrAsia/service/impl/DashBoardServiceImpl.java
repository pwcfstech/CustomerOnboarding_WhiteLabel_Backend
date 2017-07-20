package com.afrAsia.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.afrAsia.dao.jpa.DashBoardJpaDao;
import com.afrAsia.entities.jpa.ApplicationReference;
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

	public AverageProductivity getAvgProductivity() {

		AverageProductivity averageProductivity = new AverageProductivity();

		// AverageProductivity listOfAverageProductivity = new
		// AverageProductivity();

		List<ApplicationReference> listMonthlyRecords = new ArrayList<ApplicationReference>();

		List<ApplicationReference> listQuarterlyRecords = new ArrayList<ApplicationReference>();

		List<ApplicationReference> listHalfYearlyRecords = new ArrayList<ApplicationReference>();

		List<ApplicationReference> listYearlyRecords = new ArrayList<ApplicationReference>();

		// set quarterly average record

		listMonthlyRecords = (List<ApplicationReference>) dashBoardDao.getMonthly();

		double avgMonthly = ((listMonthlyRecords.size()) /*/ 30.0*/);
		System.out.println("#########avgMonthly " + avgMonthly);

		if (avgMonthly < 0.1) {
			averageProductivity.setAvgMonthly(0.0);
			// listOfAverageProductivity.setAvgMonthly(avgMonthly);
		} else {
			averageProductivity.setAvgMonthly(avgMonthly);
			// listOfAverageProductivity.setAvgMonthly(avgMonthly);
		}

		// set quarterly average record

		listQuarterlyRecords = (List<ApplicationReference>) dashBoardDao.getQuarterly();

		double avgQuarterly = ((listQuarterlyRecords.size()) /*/ 30.0*/) / 3;
		System.out.println("#########avgQuarterly " + avgQuarterly);

		if (avgQuarterly < 0.1) {
			averageProductivity.setAvgQuarterly(0.0);
			// listOfAverageProductivity.setAvgQuarterly(avgQuarterly);
		} else {
			averageProductivity.setAvgQuarterly(avgQuarterly);
			// listOfAverageProductivity.setAvgQuarterly(avgQuarterly);
		}

		// set Half Yearly average record

		listHalfYearlyRecords = (List<ApplicationReference>) dashBoardDao.getHalfYeary();

		double avgHalfYearly = ((listHalfYearlyRecords.size()) /*/ 30.0*/) / 6;
		System.out.println("#########avgHalfYearly " + avgHalfYearly);

		if (avgHalfYearly < 0.1) {
			averageProductivity.setAvgHalfYearly(0.0);
			// listOfAverageProductivity.add(averageProductivity);
		} else {
			averageProductivity.setAvgHalfYearly(avgHalfYearly);
			// listOfAverageProductivity.add(averageProductivity);
		}

		// set Yearly average record

		listYearlyRecords = (List<ApplicationReference>) dashBoardDao.getYearly();

		double avgYearly = ((listYearlyRecords.size()) /*/ 30.0*/) / 12;
		System.out.println("#########avgYearly " + avgYearly);

		if (avgYearly < 0.1) {
			averageProductivity.setAvgYearly(0.0);
			// listOfAverageProductivity.add(averageProductivity);
		} else {
			averageProductivity.setAvgYearly(avgYearly);
			// listOfAverageProductivity.add(averageProductivity);
		}
		System.out.println("##############listOfAverageProductivity " + averageProductivity);

		return averageProductivity;
	}

	public AppLoggedSummary getAppLoggedSummary() {

		AppLoggedSummary appLoggedSummary = new AppLoggedSummary();

		// List<AppLoggedSummary> listOfAppLoggedSummaries=new
		// ArrayList<AppLoggedSummary>();

		List<ApplicationReference> listOfLoggedUsers = new ArrayList<ApplicationReference>();

		List<ApplicationReference> listOfAccountsOpened = new ArrayList<ApplicationReference>();

		List<ApplicationReference> listOfAccountsUnderProcessing = new ArrayList<ApplicationReference>();

		List<ApplicationReference> listOfRejectedAccounts = new ArrayList<ApplicationReference>();

		// check number of logged users in last 30 days

		listOfLoggedUsers = (List<ApplicationReference>) dashBoardDao.getLogged();
		System.out.println("###########listOfLoggedUsers " + listOfLoggedUsers);

		int loggedUsers = listOfLoggedUsers.size();

		if (loggedUsers == 0) {
			appLoggedSummary.setLogged(0);
			// listOfAppLoggedSummaries.add(appLoggedSummary);
		} else {
			appLoggedSummary.setLogged(loggedUsers);
			// listOfAppLoggedSummaries.add(appLoggedSummary);
		}

		// check number of accounts opened in last 30 days

		listOfAccountsOpened = (List<ApplicationReference>) dashBoardDao.getOpened();
		System.out.println("###########listOfAccountsOpened " + listOfAccountsOpened);

		int numberOfOpenedAccount = listOfAccountsOpened.size();

		if (numberOfOpenedAccount == 0) {
			appLoggedSummary.setOpened(0);
			// listOfAppLoggedSummaries.add(appLoggedSummary);
		} else {
			appLoggedSummary.setOpened(numberOfOpenedAccount);
			// listOfAppLoggedSummaries.add(appLoggedSummary);
		}

		// check number of Accounts UnderProcessing in last 30 days

		listOfAccountsUnderProcessing = (List<ApplicationReference>) dashBoardDao.getUnderProcessing();
		System.out.println("###########listOfAccountsUnderProcessing " + listOfAccountsUnderProcessing);

		int numberOfAccountsUnderProcessing = listOfAccountsUnderProcessing.size();

		if (numberOfAccountsUnderProcessing == 0) {
			appLoggedSummary.setUnderProcessing(0);
			// listOfAppLoggedSummaries.add(appLoggedSummary);
		} else {
			appLoggedSummary.setUnderProcessing(numberOfAccountsUnderProcessing);
			// listOfAppLoggedSummaries.add(appLoggedSummary);
		}

		// check number of Accounts UnderProcessing in last 30 days

		listOfRejectedAccounts = (List<ApplicationReference>) dashBoardDao.getRejected();
		System.out.println("###########listOfRejectedAccounts " + listOfRejectedAccounts);

		int numberOfAccountsRejected = listOfRejectedAccounts.size();

		if (numberOfAccountsRejected == 0) {
			appLoggedSummary.setRejected(0);
			// listOfAppLoggedSummaries.add(appLoggedSummary);
		} else {
			appLoggedSummary.setRejected(numberOfAccountsRejected);
			// listOfAppLoggedSummaries.add(appLoggedSummary);
		}
		System.out.println("###########listOfAppLoggedSummaries " + appLoggedSummary);

		return appLoggedSummary;
	}
	
	

	public PendingAction getPendingAction() {

		PendingAction pendingAction = new PendingAction();

		List<Apps> listApps = new ArrayList<Apps>();
		
		Set<Apps> setOfApps = new HashSet<Apps>(listApps);

		//Apps apps=new Apps();

		List<Long> listOfReferenceNumber = new ArrayList<Long>();

		List<Object> listOfCustormerName = new ArrayList<Object>();

		List<Date> listOfPendingSinceStatus = new ArrayList<Date>();

		// get number of application reference number

		listOfReferenceNumber = (List<Long>) dashBoardDao.getRefNo();
		System.out.println("#########listOfReferenceNumber " + listOfReferenceNumber);

		for (Long id : listOfReferenceNumber) {
			Apps apps=new Apps();
			apps.setRefNo(id + "");
			System.out.println("##################### apps " + apps.getRefNo());
			listApps.add(apps);
			//setOfApps.add(apps);
		}

		// get all the customer names --------------- pending

		listOfCustormerName = (List<Object>) dashBoardDao.getCustermerName();
		System.out.println("#########listOfCustormerName " + listOfCustormerName);
		int i = 0;
		for (Object object : listOfCustormerName) {
			Apps apps = listApps.get(i);
			Object[] outputs = (Object[]) object;
			apps.setCustomerName(outputs[0].toString() + " " + outputs[1].toString() + " " + outputs[2].toString());
			//System.out.println("############### CustomerName :: " + apps.getCustomerName());
			//listApps.add(i, apps);
			listApps.add(apps);   
			//setOfApps.add(apps);
			i++;
		}

		// get number of pending dates

		listOfPendingSinceStatus = (List<Date>) dashBoardDao.getPendingSinceStatus();
		System.out.println("######### listOfPendingSinceStatus " + listOfPendingSinceStatus); 
		for (Date date : listOfPendingSinceStatus) {
			Apps apps = listApps.get(i);
			apps.setPendingSince(date);
			System.out.println("########### date :: " + apps.getPendingSince());
			//listApps.add(i, apps);
			listApps.add(apps);
			//setOfApps.add(apps);
			i++;
		}
		setOfApps.addAll(listApps);
		pendingAction.setApps(setOfApps);

		return pendingAction;
	}

	public DashboardResponse getDashBoardSummery() {

		DashboardResponse dashboardResponse = new DashboardResponse();

		dashboardResponse.setAvgProductivity(getAvgProductivity());

		dashboardResponse.setAppLoggedSummary(getAppLoggedSummary());

		dashboardResponse.setPendingAction(getPendingAction());

		dashboardResponse.setMessageHeader(null);

		return dashboardResponse;
	}

}
