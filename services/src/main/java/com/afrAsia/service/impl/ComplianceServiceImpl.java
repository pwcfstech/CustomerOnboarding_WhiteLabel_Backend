package com.afrAsia.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.afrAsia.customexception.DateDifferenceException;
import com.afrAsia.dao.jpa.ComplianceJpaDao;
import com.afrAsia.entities.response.Apps;
import com.afrAsia.entities.response.MessageHeader;
import com.afrAsia.entities.response.RequestError;
import com.afrAsia.entities.response.RmApplicationAppResponse;
import com.afrAsia.service.ComplianceService;

public class ComplianceServiceImpl implements ComplianceService {

	private static final Logger logger = LoggerFactory.getLogger(ComplianceServiceImpl.class);

	private ComplianceJpaDao complianceDao;

	public ComplianceJpaDao getComplianceDao() {
		return complianceDao;
	}

	public void setComplianceDao(ComplianceJpaDao complianceDao) {
		this.complianceDao = complianceDao;
	}

	
	public RmApplicationAppResponse getDetailsByefault(String ststus) {
		
		System.out.println(" ################ in getDetailsByefault service impl ===== ");

		RmApplicationAppResponse rmApplicationAppResponse = new RmApplicationAppResponse();

		List<Apps> listOfApps = new ArrayList<Apps>();

		Set<Apps> setOfApps = new LinkedHashSet<Apps>(listOfApps);

		List<Object> detailsByDefaultByUnderProcessingStatus = new ArrayList<Object>(listOfApps);

		
		//get Details By UnderProcessing Status																				
		detailsByDefaultByUnderProcessingStatus = complianceDao.getDetailsByefaultByUnderProcessingStatus(ststus);
		
		int i=0;
				
		for (Object object : detailsByDefaultByUnderProcessingStatus) {
			
			Apps apps = new Apps();
			
			Object[] outputs = (Object[]) object;

			apps.setRefNo(outputs[0].toString());
			
			apps.setRecordId(outputs[1].toString());
			
			apps.setCustomerName(outputs[2].toString()+" "+outputs[3].toString());
			
			SimpleDateFormat dateFormatSubmittedDate = new SimpleDateFormat("yyyy-mm-dd");

			String dateSubmittedDate = outputs[4].toString();

			Date dateSubmitted = new Date();
			try {
				dateSubmitted = dateFormatSubmittedDate.parse(dateSubmittedDate);
			} catch (ParseException e) {
				System.out.println(" ==================== date coud not be parsed =========== ");
			}

			apps.setAppSubmittedDate(dateSubmitted);

			apps.setAppStatus(outputs[5].toString());
			
			apps.setAccountNumber(outputs[6].toString());
			
			SimpleDateFormat dateFormatCreationDate = new SimpleDateFormat("yyyy-mm-dd");

			String dateCreationDate = outputs[4].toString();

			Date dateCreated= new Date();
			try {
				dateCreated = dateFormatCreationDate.parse(dateCreationDate);
			} catch (ParseException e) {
				System.out.println(" ==================== date coud not be parsed =========== ");
			}
			
			apps.setAccountCreationDate(dateCreated);

			listOfApps.add(apps);
			i++;

		}
		System.out.println("list of apps 1================= "+listOfApps);
		
		setOfApps.addAll(listOfApps);
		
		System.out.println("set of apps 1 =================="+setOfApps);
		
		
		//get Details By AccOpened Or Rejected Status	
		List<Object> detailsByefaultByAccOpenedOrRejectedStatus = new ArrayList<Object>(listOfApps);

		detailsByefaultByAccOpenedOrRejectedStatus = complianceDao.getDetailsByefaultByAccOpenedOrRejectedStatus();
		
		for (Object object : detailsByefaultByAccOpenedOrRejectedStatus) {
			
			Apps apps = listOfApps.get(i);
			
			Object[] outputs = (Object[]) object;

			apps.setRefNo(outputs[0].toString());
			
			apps.setRecordId(outputs[1].toString());
			
			apps.setCustomerName(outputs[2].toString()+" "+outputs[3].toString());
			
			SimpleDateFormat dateFormatSubmittedDate = new SimpleDateFormat("yyyy-mm-dd");

			String dateSubmittedDate = outputs[4].toString();

			Date dateSubmitted = new Date();
			try {
				dateSubmitted = dateFormatSubmittedDate.parse(dateSubmittedDate);
			} catch (ParseException e) {
				System.out.println(" ==================== date coud not be parsed =========== ");
			}

			apps.setAppSubmittedDate(dateSubmitted);

			apps.setAppStatus(outputs[5].toString());
			
			apps.setAccountNumber(outputs[6].toString());
			
			SimpleDateFormat dateFormatCreationDate = new SimpleDateFormat("yyyy-mm-dd");

			String dateCreationDate = outputs[4].toString();

			Date dateCreated= new Date();
			try {
				dateCreated = dateFormatCreationDate.parse(dateCreationDate);
			} catch (ParseException e) {
				System.out.println(" ==================== date coud not be parsed =========== ");
			}
			
			apps.setAccountCreationDate(dateCreated);

			listOfApps.add(apps);
			i++;
		}
		
		System.out.println("listOfApps  2 =================" + listOfApps);
		setOfApps.addAll(listOfApps);
		System.out.println("setOfApps 2 =================" + setOfApps);

		rmApplicationAppResponse.setApps(listOfApps);

		return rmApplicationAppResponse;
	}

	public RmApplicationAppResponse getDetailsByName(String name, String appStatus) {
		
		System.out.println(" ################ in getDetailsByName service impl ===== ");
		
		RmApplicationAppResponse rmApplicationAppResponse = new RmApplicationAppResponse();

		List<Apps> listOfApps = new ArrayList<Apps>();

		Set<Apps> setOfApps = new LinkedHashSet<Apps>(listOfApps);

		List<Object> detailsByName = new ArrayList<Object>(listOfApps);

		detailsByName = (List<Object>) complianceDao.getDetailsByName(name, appStatus);
		
		for (Object object : detailsByName) {
			
			Apps apps = new Apps();
			
			Object[] outputs = (Object[]) object;

			apps.setRefNo(outputs[0].toString());
			
			apps.setRecordId(outputs[1].toString());
			
			apps.setCustomerName(outputs[2].toString()+" "+outputs[3].toString());
			
			SimpleDateFormat dateFormatSubmittedDate = new SimpleDateFormat("yyyy-mm-dd");

			String dateSubmittedDate = outputs[4].toString();

			Date dateSubmitted = new Date();
			try {
				dateSubmitted = dateFormatSubmittedDate.parse(dateSubmittedDate);
			} catch (ParseException e) {
				System.out.println(" ==================== date coud not be parsed =========== ");
			}

			apps.setAppSubmittedDate(dateSubmitted);

			apps.setAppStatus(outputs[5].toString());
			
			apps.setAccountNumber(outputs[6].toString());
			
			SimpleDateFormat dateFormatCreationDate = new SimpleDateFormat("yyyy-mm-dd");

			String dateCreationDate = outputs[4].toString();

			Date dateCreation= new Date();
			try {
				dateCreation = dateFormatCreationDate.parse(dateCreationDate);
			} catch (ParseException e) {
				System.out.println(" ==================== date coud not be parsed =========== ");
			}
			
			apps.setAccountCreationDate(dateCreation);

			listOfApps.add(apps);
		}
		System.out.println("listOfApps=================" + listOfApps);
		setOfApps.addAll(listOfApps);
		System.out.println("setOfApps=================" + setOfApps);
		rmApplicationAppResponse.setApps(listOfApps);

		return rmApplicationAppResponse;
	}

	public RmApplicationAppResponse getDetailsByDates(Date startDate, Date endDate, String rmId) {
		
		System.out.println(" ################ in getDetailsByDates service impl ===== ");
		
		RmApplicationAppResponse rmApplicationAppResponse = new RmApplicationAppResponse();

		List<Apps> listOfApps = new ArrayList<Apps>();

		Set<Apps> setOfApps = new LinkedHashSet<Apps>(listOfApps);

		List<Object> listOfCustormerName = new ArrayList<Object>(listOfApps);

		
		int diffInDays = (int) ((endDate.getTime()-(startDate.getTime())) / (1000 * 60 * 60 * 24));

		try{	
			if(diffInDays <= 30){
				System.out.println(" diffInDays in if "+ diffInDays);
				listOfCustormerName = (List<Object>) complianceDao.getDetailsByDates(startDate, endDate, rmId);
				}
				else{
					//System.out.println(" diffInDays in else "+ diffInDays);
					MessageHeader messageHeader=new MessageHeader();
					RequestError requestError=new RequestError();
					requestError.setCustomCode(" difference between start date and end date is more than 30 days,"
						+ "please pass dates such that difference should not exceed 30");
					messageHeader.setError(requestError); 
					rmApplicationAppResponse.setMessageHeader(messageHeader);	
					throw new DateDifferenceException("difference between start date and end date is more than 30 days,"
						+ "please pass dates such that difference should not exceed 30");
				}
		}
		catch(DateDifferenceException dateDifferenceExceptionMessage){
			System.out.println(" Exception got due to larger difference betweenthe dates provided : "+dateDifferenceExceptionMessage);
		}
		
		
		for (Object object : listOfCustormerName) {
			
			Apps apps = new Apps();
			
			Object[] outputs = (Object[]) object;

			apps.setRefNo(outputs[0].toString());
			
			apps.setRecordId(outputs[1].toString());
			
			apps.setCustomerName(outputs[2].toString()+" "+outputs[3].toString());
			
			SimpleDateFormat dateFormatSubmittedDate = new SimpleDateFormat("yyyy-mm-dd");

			String dateSubmittedDate = outputs[4].toString();

			Date dateSubmitted = new Date();
			try {
				dateSubmitted = dateFormatSubmittedDate.parse(dateSubmittedDate);
			} catch (ParseException e) {
				System.out.println(" ==================== date coud not be parsed =========== ");
			}

			apps.setAppSubmittedDate(dateSubmitted);

			apps.setAppStatus(outputs[5].toString());
			
			apps.setAccountNumber(outputs[6].toString());
			
			SimpleDateFormat dateFormatCreationDate = new SimpleDateFormat("yyyy-mm-dd");

			String dateCreationDate = outputs[4].toString();

			Date dateCreation= new Date();
			try {
				dateCreation = dateFormatCreationDate.parse(dateCreationDate);
			} catch (ParseException e) {
				System.out.println(" ==================== date coud not be parsed =========== ");
			}
			
			apps.setAccountCreationDate(dateCreation);

			listOfApps.add(apps);
		}
		System.out.println("listOfApps=================" + listOfApps);
		setOfApps.addAll(listOfApps);
		System.out.println("setOfApps=================" + setOfApps);
		rmApplicationAppResponse.setApps(listOfApps);

		return rmApplicationAppResponse;
	}

	
	public RmApplicationAppResponse getDetailsByAllCriteria(String name, Date startDate, Date endDate,
			String rmId) {
		RmApplicationAppResponse rmApplicationAppResponse = new RmApplicationAppResponse();

		List<Apps> listOfApps = new ArrayList<Apps>();

		Set<Apps> setOfApps = new LinkedHashSet<Apps>(listOfApps);

		List<Object> detailsByAllCriteriaWithoutStatus = new ArrayList<Object>(listOfApps);
		
		int diffInDays = (int) ((endDate.getTime()-(startDate.getTime())) / (1000 * 60 * 60 * 24));
		
		try{	
				if(diffInDays <= 30){
					detailsByAllCriteriaWithoutStatus = (List<Object>) complianceDao.getDetailsByAllCriteria
							(name, startDate,endDate, rmId);
					}
					else{
						MessageHeader messageHeader=new MessageHeader();
						RequestError requestError=new RequestError();
						requestError.setCustomCode(" difference between start date and end date is more than 30 days,"
							+ "please pass dates such that difference should not exceed 30");
						messageHeader.setError(requestError);
						rmApplicationAppResponse.setMessageHeader(messageHeader);	
						throw new DateDifferenceException("difference between start date and end date is more than 30 days,"
							+ "please pass dates such that difference should not exceed 30");
					}
		    }
		catch(DateDifferenceException exceptionMessage){
			System.out.println(" Exception got : "+exceptionMessage);
		}
		
		for (Object object : detailsByAllCriteriaWithoutStatus) {
			
			Apps apps = new Apps();
			
			Object[] outputs = (Object[]) object;

			apps.setRefNo(outputs[0].toString());
			
			apps.setRecordId(outputs[1].toString());
			
			apps.setCustomerName(outputs[2].toString()+" "+outputs[3].toString());
			
			SimpleDateFormat dateFormatSubmittedDate = new SimpleDateFormat("yyyy-mm-dd");

			String dateSubmittedDate = outputs[4].toString();

			Date dateSubmitted = new Date();
			try {
				dateSubmitted = dateFormatSubmittedDate.parse(dateSubmittedDate);
			} catch (ParseException e) {
				System.out.println(" ==================== date coud not be parsed =========== ");
			}

			apps.setAppSubmittedDate(dateSubmitted);

			apps.setAppStatus(outputs[5].toString());
			
			apps.setAccountNumber(outputs[6].toString());
			
			SimpleDateFormat dateFormatCreationDate = new SimpleDateFormat("yyyy-mm-dd");

			String dateCreationDate = outputs[4].toString();

			Date dateCreation= new Date();
			try {
				dateCreation = dateFormatCreationDate.parse(dateCreationDate);
			} catch (ParseException e) {
				System.out.println(" ==================== date coud not be parsed =========== ");
			}
			
			apps.setAccountCreationDate(dateCreation);

			listOfApps.add(apps);

		}
		System.out.println("listOfApps=================" + listOfApps);
		setOfApps.addAll(listOfApps);
		System.out.println("setOfApps=================" + setOfApps);
		rmApplicationAppResponse.setApps(listOfApps);

		return rmApplicationAppResponse;
	}

}
