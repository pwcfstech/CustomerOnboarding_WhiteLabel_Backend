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
import com.afrAsia.entities.response.ComplianceApps;
import com.afrAsia.entities.response.ComplianceResponse;
import com.afrAsia.entities.response.MessageHeader;
import com.afrAsia.entities.response.RequestError;
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

	
	public ComplianceResponse getDetailsBydefault() {
		
		System.out.println(" ################ in getDetailsByefault service impl ===== ");

		ComplianceResponse complianceResponse = new ComplianceResponse();

		List<ComplianceApps> listOfApps = new ArrayList<ComplianceApps>();

		Set<ComplianceApps> setOfApps = new LinkedHashSet<ComplianceApps>(listOfApps);
		
		Set<ComplianceApps> setOfComplianceApps = new LinkedHashSet<ComplianceApps>();

		List<Object> detailsByDefaultByUnderProcessingStatus = new ArrayList<Object>(listOfApps);

		
		//get Details By UnderProcessing Status																				
		detailsByDefaultByUnderProcessingStatus = complianceDao.getDetailsByDefaultByUnderProcessingStatus();
		
		int i=0;
				
		for (Object object : detailsByDefaultByUnderProcessingStatus) {
			
			ComplianceApps complianceApps = new ComplianceApps();
			
			Object[] outputs = (Object[]) object;

			complianceApps.setRefNo(outputs[0].toString());
			
			complianceApps.setRecordId(outputs[1].toString());
			
			complianceApps.setCustomerName(outputs[2].toString()+" "+outputs[3].toString());
			
			SimpleDateFormat dateFormatSubmittedDate = new SimpleDateFormat("yyyy-MM-dd");

			String dateSubmittedDate = outputs[4].toString();

			Date dateSubmitted = new Date();
			try {
				dateSubmitted = dateFormatSubmittedDate.parse(dateSubmittedDate);
			} catch (ParseException e) {
				System.out.println(" ==================== date coud not be parsed =========== ");
			}

			complianceApps.setAppSubmittedDate(dateSubmitted);

			complianceApps.setAppStatus(outputs[5].toString());
			
			try{
				if(outputs[6].toString()!=null){
					System.out.println("outputs[6].toString() in try  =========== "+outputs[6].toString());
					complianceApps.setAccountNumber(outputs[6].toString());
				}
				else{
					complianceApps.setAccountNumber(null);
				}
			}catch(NullPointerException e){
				System.out.println("outputs[6].toString() in catch =========== ");
			}
			
			SimpleDateFormat dateFormatCreationDate = new SimpleDateFormat("yyyy-MM-dd");

			String dateCreationDate = outputs[7].toString();

			Date dateCreated= new Date();
			try {
				dateCreated = dateFormatCreationDate.parse(dateCreationDate);
			} catch (ParseException e) {
				System.out.println(" ==================== date coud not be parsed =========== ");
			}
			
			complianceApps.setAccountCreationDate(dateCreated);

			listOfApps.add(complianceApps);
			setOfComplianceApps.add(complianceApps);
			i++;

		}
		System.out.println("list of complianceApps 1================= "+listOfApps);
		
		setOfApps.addAll(listOfApps);
		
		System.out.println("setOfApps 1 =================="+setOfApps);
		
		System.out.println("setOfComplianceApps 1 =================="+setOfComplianceApps);
		
		//get Details By AccOpened Or Rejected Status	
		List<Object> detailsByefaultByAccOpenedOrRejectedStatus = new ArrayList<Object>(listOfApps);

		detailsByefaultByAccOpenedOrRejectedStatus = complianceDao.getDetailsByDefaultByAccOpenedOrRejectedStatus();
		
		for (Object object : detailsByefaultByAccOpenedOrRejectedStatus) {
			
			ComplianceApps complianceApps = new ComplianceApps();
			
			Object[] outputs = (Object[]) object;

			complianceApps.setRefNo(outputs[0].toString());
			
			complianceApps.setRecordId(outputs[1].toString());
			
			complianceApps.setCustomerName(outputs[2].toString()+" "+outputs[3].toString());
			
			SimpleDateFormat dateFormatSubmittedDate = new SimpleDateFormat("yyyy-MM-dd");

			String dateSubmittedDate = outputs[4].toString();

			Date dateSubmitted = new Date();
			try {
				dateSubmitted = dateFormatSubmittedDate.parse(dateSubmittedDate);
			} catch (ParseException e) {
				System.out.println(" ==================== date coud not be parsed =========== ");
			}

			complianceApps.setAppSubmittedDate(dateSubmitted);

			complianceApps.setAppStatus(outputs[5].toString());
			
			try{
				if(outputs[6].toString()!=null){
					System.out.println("outputs[6].toString() in try  =========== "+outputs[6].toString());
					complianceApps.setAccountNumber(outputs[6].toString());
				}
				else{
					complianceApps.setAccountNumber(null);
				}
			}catch(NullPointerException e){
				System.out.println("outputs[6].toString() in catch =========== ");
			}
			
			SimpleDateFormat dateFormatCreationDate = new SimpleDateFormat("yyyy-MM-dd");

			String dateCreationDate = outputs[7].toString();

			Date dateCreated= new Date();
			try {
				dateCreated = dateFormatCreationDate.parse(dateCreationDate);
			} catch (ParseException e) {
				System.out.println(" ==================== date coud not be parsed =========== ");
			}
			
			complianceApps.setAccountCreationDate(dateCreated);

			listOfApps.add(complianceApps);
			setOfComplianceApps.add(complianceApps);
			i++;
		}
		
		System.out.println("listOfApps  2 =================" + listOfApps);
		setOfApps.addAll(listOfApps);
		System.out.println("setOfApps 2 =================" + setOfApps);
		System.out.println("setOfComplianceApps 2 =================" + setOfComplianceApps);

		complianceResponse.setApps(listOfApps);

		return complianceResponse;
	}

	public ComplianceResponse getDetailsByName(String name, String appStatus) {
		
		System.out.println(" ################ in getDetailsByName service impl ===== ");
		
		ComplianceResponse complianceResponse = new ComplianceResponse();

		List<ComplianceApps> listOfApps = new ArrayList<ComplianceApps>();

		Set<ComplianceApps> setOfApps = new LinkedHashSet<ComplianceApps>(listOfApps);

		List<Object> detailsByName = new ArrayList<Object>(listOfApps);

		detailsByName = (List<Object>) complianceDao.getDetailsByName(name, appStatus);
		
		for (Object object : detailsByName) {
			
			ComplianceApps complianceApps = new ComplianceApps();
			
			Object[] outputs = (Object[]) object;

			complianceApps.setRefNo(outputs[0].toString());
			
			complianceApps.setRecordId(outputs[1].toString());
			
			complianceApps.setCustomerName(outputs[2].toString()+" "+outputs[3].toString());
			
			SimpleDateFormat dateFormatSubmittedDate = new SimpleDateFormat("yyyy-MM-dd");

			String dateSubmittedDate = outputs[4].toString();

			Date dateSubmitted = new Date();
			try {
				dateSubmitted = dateFormatSubmittedDate.parse(dateSubmittedDate);
			} catch (ParseException e) {
				System.out.println(" ==================== date coud not be parsed =========== ");
			}

			complianceApps.setAppSubmittedDate(dateSubmitted);

			complianceApps.setAppStatus(outputs[5].toString());
			
			try{
				if(outputs[6].toString()!=null){
					System.out.println("outputs[6].toString() in try  =========== "+outputs[6].toString());
					complianceApps.setAccountNumber(outputs[6].toString());
				}
				else{
					complianceApps.setAccountNumber(null);
				}
			}catch(NullPointerException e){
				System.out.println("outputs[6].toString() in catch =========== ");
			}
			
			SimpleDateFormat dateFormatCreationDate = new SimpleDateFormat("yyyy-MM-dd");

			String dateCreationDate = outputs[7].toString();

			Date dateCreation= new Date();
			try {
				dateCreation = dateFormatCreationDate.parse(dateCreationDate);
			} catch (ParseException e) {
				System.out.println(" ==================== date coud not be parsed =========== ");
			}
			
			complianceApps.setAccountCreationDate(dateCreation);

			listOfApps.add(complianceApps);
		}
		System.out.println("listOfApps=================" + listOfApps);
		setOfApps.addAll(listOfApps);
		System.out.println("setOfApps=================" + setOfApps);
		complianceResponse.setApps(listOfApps);

		return complianceResponse;
	}

	public ComplianceResponse getDetailsByDates(Date startDate, Date endDate, String rmId) {
		
		System.out.println(" ################ in getDetailsByDates service impl ===== ");
		
		ComplianceResponse complianceResponse = new ComplianceResponse();

		List<ComplianceApps> listOfApps = new ArrayList<ComplianceApps>();

		Set<ComplianceApps> setOfApps = new LinkedHashSet<ComplianceApps>(listOfApps);

		List<Object> listOfCustormerName = new ArrayList<Object>(listOfApps);

		
		int diffInDays = (int) ((endDate.getTime()-(startDate.getTime())) / (1000 * 60 * 60 * 24)+1);

		try{	
			if(endDate.getTime()>=startDate.getTime()){
				if(diffInDays <= 30 && diffInDays>0){
					System.out.println(" diffInDays in if "+ diffInDays);
					listOfCustormerName = (List<Object>) complianceDao.getDetailsByDates(startDate, endDate, rmId);
				}
				else{
					//System.out.println(" diffInDays in else "+ diffInDays);
					MessageHeader messageHeader=new MessageHeader();
					RequestError requestError=new RequestError();
					requestError.setCustomCode(" difference between start date and end date is more than 30 days");
					messageHeader.setError(requestError); 
					complianceResponse.setMessageHeader(messageHeader);	
					throw new DateDifferenceException("difference between start date and end date is more than 30 days");
				}
			}
			else{
				MessageHeader messageHeader=new MessageHeader();
				RequestError requestError=new RequestError();
				requestError.setRsn("start date is greater than end date");
				messageHeader.setError(requestError); 
				complianceResponse.setMessageHeader(messageHeader);	
				throw new DateDifferenceException("start date is greater than end date");
			}
		}
		catch(DateDifferenceException dateDifferenceExceptionMessage){
			System.out.println(" Exception got due to : "+dateDifferenceExceptionMessage);
		}

		
		for (Object object : listOfCustormerName) {
			
			ComplianceApps complianceApps = new ComplianceApps();
			
			Object[] outputs = (Object[]) object;

			complianceApps.setRefNo(outputs[0].toString());
			
			complianceApps.setRecordId(outputs[1].toString());
			
			complianceApps.setCustomerName(outputs[2].toString()+" "+outputs[3].toString());
			
			SimpleDateFormat dateFormatSubmittedDate = new SimpleDateFormat("yyyy-MM-dd");

			String dateSubmittedDate = outputs[4].toString();

			Date dateSubmitted = new Date();
			try {
				dateSubmitted = dateFormatSubmittedDate.parse(dateSubmittedDate);
			} catch (ParseException e) {
				System.out.println(" ==================== date coud not be parsed =========== ");
			}

			complianceApps.setAppSubmittedDate(dateSubmitted);

			complianceApps.setAppStatus(outputs[5].toString());
			
			try{
				if(outputs[6].toString()!=null){
					System.out.println("outputs[6].toString() in try  =========== "+outputs[6].toString());
					complianceApps.setAccountNumber(outputs[6].toString());
				}
				else{
					complianceApps.setAccountNumber(null);
					System.out.println("outputs[6].toString() in else , having null value =========== ");
				}
			}catch(NullPointerException e){
				System.out.println("outputs[6].toString() in catch =========== ");
				complianceApps.setAccountNumber(null);
				System.out.println("################ complianceApps.getAccountNumber() : "+complianceApps.getAccountNumber());
			}
			
			SimpleDateFormat dateFormatCreationDate = new SimpleDateFormat("yyyy-MM-dd");

			String dateCreationDate = outputs[7].toString();

			Date dateCreation= new Date();
			try {
				dateCreation = dateFormatCreationDate.parse(dateCreationDate);
			} catch (ParseException e) {
				System.out.println(" ==================== date coud not be parsed =========== ");
			}
			
			complianceApps.setAccountCreationDate(dateCreation);

			listOfApps.add(complianceApps);
		}
		System.out.println("listOfApps=================" + listOfApps);
		setOfApps.addAll(listOfApps);
		System.out.println("setOfApps=================" + setOfApps);
		complianceResponse.setApps(listOfApps);

		return complianceResponse;
	}

	
	public ComplianceResponse getDetailsByAllCriteria(String name, Date startDate, Date endDate,
			String rmId) {
		ComplianceResponse complianceResponse = new ComplianceResponse();

		List<ComplianceApps> listOfApps = new ArrayList<ComplianceApps>();

		Set<ComplianceApps> setOfApps = new LinkedHashSet<ComplianceApps>(listOfApps);

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
						complianceResponse.setMessageHeader(messageHeader);	
						throw new DateDifferenceException("difference between start date and end date is more than 30 days,"
							+ "please pass dates such that difference should not exceed 30");
					}
		    }
		catch(DateDifferenceException exceptionMessage){
			System.out.println(" Exception got : "+exceptionMessage);
		}
		
		for (Object object : detailsByAllCriteriaWithoutStatus) {
			
			ComplianceApps complianceApps = new ComplianceApps();
			
			Object[] outputs = (Object[]) object;

			complianceApps.setRefNo(outputs[0].toString());
			
			complianceApps.setRecordId(outputs[1].toString());
			
			complianceApps.setCustomerName(outputs[2].toString()+" "+outputs[3].toString());
			
			SimpleDateFormat dateFormatSubmittedDate = new SimpleDateFormat("yyyy-MM-dd");

			String dateSubmittedDate = outputs[4].toString();

			Date dateSubmitted = new Date();
			try {
				dateSubmitted = dateFormatSubmittedDate.parse(dateSubmittedDate);
			} catch (ParseException e) {
				System.out.println(" ==================== date coud not be parsed =========== ");
			}

			complianceApps.setAppSubmittedDate(dateSubmitted);

			complianceApps.setAppStatus(outputs[5].toString());
			
			try{
				if(outputs[6].toString()!=null){
					System.out.println("outputs[6].toString() in try  =========== "+outputs[6].toString());
					complianceApps.setAccountNumber(outputs[6].toString());
				}
				else{
					complianceApps.setAccountNumber(null);
				}
			}catch(NullPointerException e){
				System.out.println("outputs[6].toString() in catch =========== ");
			}
			
			SimpleDateFormat dateFormatCreationDate = new SimpleDateFormat("yyyy-MM-dd");

			String dateCreationDate = outputs[7].toString();

			Date dateCreation= new Date();
			try {
				dateCreation = dateFormatCreationDate.parse(dateCreationDate);
			} catch (ParseException e) {
				System.out.println(" ==================== date coud not be parsed =========== ");
			}
			
			complianceApps.setAccountCreationDate(dateCreation);

			listOfApps.add(complianceApps);

		}
		System.out.println("listOfApps=================" + listOfApps);
		setOfApps.addAll(listOfApps);
		System.out.println("setOfApps=================" + setOfApps);
		complianceResponse.setApps(listOfApps);

		return complianceResponse;
	}

}
