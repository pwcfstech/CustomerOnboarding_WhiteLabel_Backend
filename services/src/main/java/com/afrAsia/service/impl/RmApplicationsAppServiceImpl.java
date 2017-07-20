package com.afrAsia.service.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.afrAsia.dao.jpa.RmApplicationsAppJpaDAO;
import com.afrAsia.entities.jpa.ApplicationReference;
import com.afrAsia.entities.response.Apps;
import com.afrAsia.entities.response.RmApplicationAppResponse;
import com.afrAsia.service.RmApplicationsAppService;

public class RmApplicationsAppServiceImpl implements RmApplicationsAppService {

	private static final Logger logger = LoggerFactory.getLogger(RmApplicationsAppServiceImpl.class);

	private RmApplicationsAppJpaDAO rmApplicationsAppDao;

	/**
	 * @return the rmApplicationsAppDao
	 */
	public RmApplicationsAppJpaDAO getRmApplicationsAppDao() {
		return rmApplicationsAppDao;
	}

	/**
	 * @param rmApplicationsAppDao
	 *            the rmApplicationsAppDao to set
	 */

	public void setRmApplicationsAppDao(RmApplicationsAppJpaDAO rmApplicationsAppDao) {
		this.rmApplicationsAppDao = rmApplicationsAppDao;
	}


	
	
	
	
	public RmApplicationAppResponse getDetailsByNameAndID(Long id, String name) {

		RmApplicationAppResponse rmApplicationAppResponse = new RmApplicationAppResponse();

		List<Apps> listOfApps = new ArrayList<Apps>();

		List<ApplicationReference> listOfReferenceNumber = new ArrayList<ApplicationReference>();

		List<Object> listOfCustormerName = new ArrayList<Object>();

		Collection<ApplicationReference> listOfAppSubmittedDate = new ArrayList<ApplicationReference>();

		Collection<ApplicationReference> listOfAppStstus = new ArrayList<ApplicationReference>();

		if (id != null) {
			Long idfromDB = ((RmApplicationsAppJpaDAO) rmApplicationsAppDao).getIdFromDB(id);
			if (id == idfromDB) {
				listOfReferenceNumber = (List<ApplicationReference>) rmApplicationsAppDao.getAppStatus(id,name);
				System.out.println("######### listOfReferenceNumber in service impl by ID " + listOfReferenceNumber);

				for (ApplicationReference applicationReference : listOfReferenceNumber) {
					Apps apps = new Apps();
					apps.setRefNo(String.valueOf(applicationReference.getId()));
					System.out.println("##################### ref in service impl by ID" + apps.getRefNo());
					listOfApps.add(apps);
				}

				listOfCustormerName = rmApplicationsAppDao.getCustomerName(id,name);
				System.out.println("######### listOfCustormerName in service impl by ID " + listOfCustormerName);
				int i = 0;
				for (Object object : listOfCustormerName) {
					Apps apps = listOfApps.get(i);
					Object[] outputs = (Object[]) object;
					apps.setCustomerName(
							outputs[0].toString() + " " + outputs[1].toString() + " " + outputs[2].toString());
					System.out.println(
							"############### CustomerName in service impl by date :: " + apps.getCustomerName());
					listOfApps.add(i, apps);
					i++;
				}

				listOfAppSubmittedDate = rmApplicationsAppDao.getAppStatus(id,name);
				System.out.println("######### listOfAppSubmiIDDate in service impl by ID " + listOfAppSubmittedDate);

				for (ApplicationReference applicationReference : listOfAppSubmittedDate) {
					Apps apps = listOfApps.get(i);
					apps.setAppSubmittedDate(applicationReference.getCreatedTime());
					System.out.println("##################### AppSubmittedDate in service impl by ID"
							+ apps.getAppSubmittedDate());
					listOfApps.add(i, apps);
				}

				listOfAppStstus = rmApplicationsAppDao.getAppStatus(id,name);
				System.out.println("######### listOfAppStstus in service impl by ID " + listOfAppStstus);

				for (ApplicationReference applicationReference : listOfAppStstus) {
					Apps apps = listOfApps.get(i);
					apps.setAppStatus(applicationReference.getAppStatus());
					System.out.println("##################### App Status in service impl by ID" + apps.getAppStatus());
					listOfApps.add(i, apps);
				}

				rmApplicationAppResponse.setMessageHeader(null);
				rmApplicationAppResponse.setApps(listOfApps);
				return rmApplicationAppResponse;
			}

			else {
				System.out.println("########### given id is not present in DB ----------------");
				return null;
			}

		}

		else {
			System.out.println("########### please pass some id ---------------");
			return null;
		}

	}
	
	
	
	

	public RmApplicationAppResponse getDetailsByDates(Date startDate, Date endDate) {

		int diffInDays = (int) ((startDate.getTime() - endDate.getTime()) / (1000 * 60 * 60 * 24));

		if (diffInDays < 30) {

			// get all the customer names --------------- by start and end dates

			RmApplicationAppResponse rmApplicationAppResponse = new RmApplicationAppResponse();

			List<Apps> listOfApps = new ArrayList<Apps>();

			List<ApplicationReference> listOfReferenceNumber = new ArrayList<ApplicationReference>();

			List<Object> listOfCustormerName = new ArrayList<Object>();

			Collection<ApplicationReference> listOfAppSubmittedDate = new ArrayList<ApplicationReference>();

			Collection<ApplicationReference> listOfAppStstus = new ArrayList<ApplicationReference>();

			listOfReferenceNumber = (List<ApplicationReference>) rmApplicationsAppDao.getAppStatus(startDate, endDate);
			System.out.println("######### listOfReferenceNumber in service impl by date " + listOfReferenceNumber);

			for (ApplicationReference applicationReference : listOfReferenceNumber) {
				Apps apps = new Apps();
				apps.setRefNo(String.valueOf(applicationReference.getId()));
				System.out.println("##################### ref in service impl by date" + apps.getRefNo());
				listOfApps.add(apps);
			}

			listOfCustormerName = rmApplicationsAppDao.getCustomerName(startDate, endDate);
			System.out.println("######### listOfCustormerName in service impl by date " + listOfCustormerName);
			int i = 0;
			for (Object object : listOfCustormerName) {
				Apps apps = listOfApps.get(i);
				Object[] outputs = (Object[]) object;
				apps.setCustomerName(outputs[0].toString() + " " + outputs[1].toString() + " " + outputs[2].toString());
				System.out.println("############### CustomerName in service impl by date :: " + apps.getCustomerName());
				listOfApps.add(i, apps);
				i++;
			}

			listOfAppSubmittedDate = rmApplicationsAppDao.getAppStatus(startDate, endDate);
			System.out.println("######### listOfAppSubmittedDate in service impl by date " + listOfAppSubmittedDate);

			for (ApplicationReference applicationReference : listOfAppSubmittedDate) {
				Apps apps = listOfApps.get(i);
				apps.setAppSubmittedDate(applicationReference.getCreatedTime());
				System.out.println(
						"##################### AppSubmittedDate in service impl by date" + apps.getAppSubmittedDate());
				listOfApps.add(i, apps);
			}

			listOfAppStstus = rmApplicationsAppDao.getAppStatus(startDate, endDate);
			System.out.println("######### listOfAppStstus in service impl by date " + listOfAppStstus);

			for (ApplicationReference applicationReference : listOfAppStstus) {
				Apps apps = listOfApps.get(i);
				apps.setAppStatus(applicationReference.getAppStatus());
				System.out.println("##################### App Status in service impl by date" + apps.getAppStatus());
				listOfApps.add(i, apps);
			}

			rmApplicationAppResponse.setMessageHeader(null);
			rmApplicationAppResponse.setApps(listOfApps);

			return rmApplicationAppResponse;
		}

		else {
			return null;
		}

	}
	
	
	

	public RmApplicationAppResponse getDetailsById(Long id) {

		RmApplicationAppResponse rmApplicationAppResponse = new RmApplicationAppResponse();

		List<Apps> listOfApps = new ArrayList<Apps>();

		List<ApplicationReference> listOfReferenceNumber = new ArrayList<ApplicationReference>();

		List<Object> listOfCustormerName = new ArrayList<Object>();

		Collection<ApplicationReference> listOfAppSubmittedDate = new ArrayList<ApplicationReference>();

		Collection<ApplicationReference> listOfAppStstus = new ArrayList<ApplicationReference>();

		if (id != null) {
			Long idfromDB = ((RmApplicationsAppJpaDAO) rmApplicationsAppDao).getIdFromDB(id);
			if (id == idfromDB) {
				listOfReferenceNumber = (List<ApplicationReference>) rmApplicationsAppDao.getAppStatus(id);
				System.out.println("######### listOfReferenceNumber in service impl by ID " + listOfReferenceNumber);

				for (ApplicationReference applicationReference : listOfReferenceNumber) {
					Apps apps = new Apps();
					apps.setRefNo(String.valueOf(applicationReference.getId()));
					System.out.println("##################### ref in service impl by ID" + apps.getRefNo());
					listOfApps.add(apps);
				}

				listOfCustormerName = rmApplicationsAppDao.getCustomerName(id);
				System.out.println("######### listOfCustormerName in service impl by ID " + listOfCustormerName);
				int i = 0;
				for (Object object : listOfCustormerName) {
					Apps apps = listOfApps.get(i);
					Object[] outputs = (Object[]) object;
					apps.setCustomerName(
							outputs[0].toString() + " " + outputs[1].toString() + " " + outputs[2].toString());
					System.out.println(
							"############### CustomerName in service impl by date :: " + apps.getCustomerName());
					listOfApps.add(i, apps);
					i++;
				}

				listOfAppSubmittedDate = rmApplicationsAppDao.getAppStatus(id);
				System.out.println("######### listOfAppSubmiIDDate in service impl by ID " + listOfAppSubmittedDate);

				for (ApplicationReference applicationReference : listOfAppSubmittedDate) {
					Apps apps = listOfApps.get(i);
					apps.setAppSubmittedDate(applicationReference.getCreatedTime());
					System.out.println("##################### AppSubmittedDate in service impl by ID"
							+ apps.getAppSubmittedDate());
					listOfApps.add(i, apps);
				}

				listOfAppStstus = rmApplicationsAppDao.getAppStatus(id);
				System.out.println("######### listOfAppStstus in service impl by ID " + listOfAppStstus);

				for (ApplicationReference applicationReference : listOfAppStstus) {
					Apps apps = listOfApps.get(i);
					apps.setAppStatus(applicationReference.getAppStatus());
					System.out.println("##################### App Status in service impl by ID" + apps.getAppStatus());
					listOfApps.add(i, apps);
				}

				rmApplicationAppResponse.setMessageHeader(null);
				rmApplicationAppResponse.setApps(listOfApps);
				return rmApplicationAppResponse;
			}

			else {
				System.out.println("########### given id is not present in DB ----------------");
				return null;
			}

		}

		else {
			System.out.println("########### please pass some id ---------------");
			return null;
		}

	}

	public RmApplicationAppResponse getDetailsByStatus(String status) {

		RmApplicationAppResponse rmApplicationAppResponse = new RmApplicationAppResponse();

		List<Apps> listOfApps = new ArrayList<Apps>();

		List<ApplicationReference> listOfReferenceNumber = new ArrayList<ApplicationReference>();

		List<Object> listOfCustormerName = new ArrayList<Object>();

		Collection<ApplicationReference> listOfAppSubmittedDate = new ArrayList<ApplicationReference>();

		Collection<ApplicationReference> listOfAppStstus = new ArrayList<ApplicationReference>();

		listOfReferenceNumber = (List<ApplicationReference>) rmApplicationsAppDao.getAppStatus(status);
		System.out.println("######### listOfReferenceNumber in service impl by status " + listOfReferenceNumber);

		for (ApplicationReference applicationReference : listOfReferenceNumber) {
			Apps apps = new Apps();
			apps.setRefNo(String.valueOf(applicationReference.getId()));
			System.out.println("##################### ref in service impl by status" + apps.getRefNo());
			listOfApps.add(apps);
		}

		listOfCustormerName = rmApplicationsAppDao.getCustomerName(status);
		System.out.println("######### listOfCustormerName in service impl by status " + listOfCustormerName);
		int i = 0;
		for (Object object : listOfCustormerName) {
			Apps apps = listOfApps.get(i);
			Object[] outputs = (Object[]) object;
			apps.setCustomerName(outputs[0].toString() + " " + outputs[1].toString() + " " + outputs[2].toString());
			System.out.println("############### CustomerName in service impl by date :: " + apps.getCustomerName());
			listOfApps.add(i, apps);
			i++;
		}

		listOfAppSubmittedDate = rmApplicationsAppDao.getAppStatus(status);
		System.out.println("######### listOfAppSubmiIDDate in service impl by status " + listOfAppSubmittedDate);

		for (ApplicationReference applicationReference : listOfAppSubmittedDate) {
			Apps apps = listOfApps.get(i);
			apps.setAppSubmittedDate(applicationReference.getCreatedTime());
			System.out.println(
					"##################### AppSubmittedDate in service impl by status" + apps.getAppSubmittedDate());
			listOfApps.add(i, apps);
		}

		listOfAppStstus = rmApplicationsAppDao.getAppStatus(status);
		System.out.println("######### listOfAppStstus in service impl by status " + listOfAppStstus);

		for (ApplicationReference applicationReference : listOfAppStstus) {
			Apps apps = listOfApps.get(i);
			apps.setAppStatus(applicationReference.getAppStatus());
			System.out.println("##################### App Status in service impl by status" + apps.getAppStatus());
			listOfApps.add(i, apps);
		}

		rmApplicationAppResponse.setMessageHeader(null);
		rmApplicationAppResponse.setApps(listOfApps);
		return rmApplicationAppResponse;
	}

}
