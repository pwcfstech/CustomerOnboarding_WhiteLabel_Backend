package com.afrAsia.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;

import com.afrAsia.customexception.DateDifferenceException;
import com.afrAsia.dao.jpa.ComplianceJpaDao;
import com.afrAsia.entities.response.ComplianceApps;
import com.afrAsia.entities.response.ComplianceResponse;
import com.afrAsia.entities.response.MessageHeader;
import com.afrAsia.entities.response.RequestError;
import com.afrAsia.service.ComplianceService;

public class ComplianceServiceImpl implements ComplianceService {

	final static Logger debugLog = Logger.getLogger("debugLogger");
	final static Logger infoLog = Logger.getLogger("infoLogger");
	final static Logger errorLog = Logger.getLogger("errorLogger");
	
	private ComplianceJpaDao complianceDao;

	public ComplianceJpaDao getComplianceDao() {
		return complianceDao;
	}

	public void setComplianceDao(ComplianceJpaDao complianceDao) {
		this.complianceDao = complianceDao;
	}

	
	public ComplianceResponse getDetailsBydefault() {
		
		ComplianceResponse complianceResponse = new ComplianceResponse();

		List<ComplianceApps> listOfApps = new ArrayList<ComplianceApps>();

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
				errorLog.error("dateSubmitted coud not be parsed in getDetailsBydefault(),ComplianceServiceImpl");
			}

			complianceApps.setAppSubmittedDate(dateSubmitted);

			complianceApps.setAppStatus(outputs[5].toString());
			
			try{
				if(outputs[6].toString()!=null){
					complianceApps.setAccountNumber(outputs[6].toString());
				}
				else{
					complianceApps.setAccountNumber(null);
				}
			}catch(NullPointerException e){
				errorLog.error("AccountNumber is null in getDetailsBydefault(),ComplianceServiceImpl");
			}
			
			SimpleDateFormat dateFormatCreationDate = new SimpleDateFormat("yyyy-MM-dd");

			String dateCreationDate = outputs[7].toString();

			Date dateCreated= new Date();
			try {
				dateCreated = dateFormatCreationDate.parse(dateCreationDate);
			} catch (ParseException e) {
				errorLog.error("dateCreated coud not be parsed in getDetailsBydefault(),ComplianceServiceImpl");
			}
			
			complianceApps.setAccountCreationDate(dateCreated);

			listOfApps.add(complianceApps);
			i++;
		}
		
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
				errorLog.error("dateSubmitted coud not be parsed in getDetailsBydefault(),ComplianceServiceImpl");
			}

			complianceApps.setAppSubmittedDate(dateSubmitted);

			complianceApps.setAppStatus(outputs[5].toString());
			
			try{
				if(outputs[6].toString()!=null){
					complianceApps.setAccountNumber(outputs[6].toString());
				}
				else{
					complianceApps.setAccountNumber(null);
				}
			}catch(NullPointerException e){
				errorLog.error("Account Number is null in getDetailsBydefault(),ComplianceServiceImpl");
			}
			
			SimpleDateFormat dateFormatCreationDate = new SimpleDateFormat("yyyy-MM-dd");

			String dateCreationDate = outputs[7].toString();

			Date dateCreated= new Date();
			try {
				dateCreated = dateFormatCreationDate.parse(dateCreationDate);
			} catch (ParseException e) {
				errorLog.error("dateCreated coud not be parsed in getDetailsBydefault(),ComplianceServiceImpl");
			}
			
			complianceApps.setAccountCreationDate(dateCreated);

			listOfApps.add(complianceApps);
			i++;
		}
		
		complianceResponse.setApps(listOfApps);
		infoLog.info("complianceResponse in getDetailsBydefault(),ComplianceServiceImpl : "+complianceResponse.toString());
		return complianceResponse;
	}

	public ComplianceResponse getDetailsByName(String name, String appStatus) {
		
		ComplianceResponse complianceResponse = new ComplianceResponse();

		List<ComplianceApps> listOfApps = new ArrayList<ComplianceApps>();

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
				errorLog.error("dateSubmitted coud not be parsed in getDetailsByName(),ComplianceServiceImpl");
			}

			complianceApps.setAppSubmittedDate(dateSubmitted);

			complianceApps.setAppStatus(outputs[5].toString());
			
			try{
				if(outputs[6].toString()!=null){
					complianceApps.setAccountNumber(outputs[6].toString());
				}
				else{
					complianceApps.setAccountNumber(null);
				}
			}catch(NullPointerException e){
				errorLog.error("Account Number is null in getDetailsByName(),ComplianceServiceImpl");
			}
			
			SimpleDateFormat dateFormatCreationDate = new SimpleDateFormat("yyyy-MM-dd");

			String dateCreationDate = outputs[7].toString();

			Date dateCreation= new Date();
			try {
				dateCreation = dateFormatCreationDate.parse(dateCreationDate);
			} catch (ParseException e) {
				errorLog.error("dateCreation coud not be parsed in getDetailsByName() ComplianceServiceImpl");
			}
			
			complianceApps.setAccountCreationDate(dateCreation);

			listOfApps.add(complianceApps);
		}
		complianceResponse.setApps(listOfApps);
		infoLog.info("complianceResponse in getDetailsByName() ComplianceServiceImpl : "+complianceResponse.toString());
		return complianceResponse;
	}

	public ComplianceResponse getDetailsByDates(Date startDate, Date endDate, String rmId) {
		
		ComplianceResponse complianceResponse = new ComplianceResponse();

		List<ComplianceApps> listOfApps = new ArrayList<ComplianceApps>();

		List<Object> listOfCustormerName = new ArrayList<Object>(listOfApps);

		
		int diffInDays = (int) ((endDate.getTime()-(startDate.getTime())) / (1000 * 60 * 60 * 24)+1);

		try{	
			if(endDate.getTime()>=startDate.getTime()){
				if(diffInDays <= 30 && diffInDays>0){
					listOfCustormerName = (List<Object>) complianceDao.getDetailsByDates(startDate, endDate, rmId);
				}
				else{
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
			errorLog.error(" Exception got in getDetailsByDates(),ComplianceServiceImpl is : "+dateDifferenceExceptionMessage);
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
				errorLog.error("dateSubmitted coud not be parsed in getDetailsByDates(),ComplianceServiceImpl");
			}

			complianceApps.setAppSubmittedDate(dateSubmitted);

			complianceApps.setAppStatus(outputs[5].toString());
			
			try{
				if(outputs[6].toString()!=null){
					complianceApps.setAccountNumber(outputs[6].toString());
				}
				else{
					complianceApps.setAccountNumber(null);
				}
			}catch(NullPointerException e){
				complianceApps.setAccountNumber(null);
				errorLog.error("Account Number is null in getDetailsByDates(),ComplianceServiceImpl");
			}
			
			SimpleDateFormat dateFormatCreationDate = new SimpleDateFormat("yyyy-MM-dd");

			String dateCreationDate = outputs[7].toString();

			Date dateCreation= new Date();
			try {
				dateCreation = dateFormatCreationDate.parse(dateCreationDate);
			} catch (ParseException e) {
				errorLog.error("dateCreation coud not be parsed in getDetailsByDates(),ComplianceServiceImpl");
			}
			
			complianceApps.setAccountCreationDate(dateCreation);

			listOfApps.add(complianceApps);
		}
		complianceResponse.setApps(listOfApps);
		infoLog.info("complianceResponse in getDetailsByDates() ,ComplianceServiceImpl : "+complianceResponse.toString());
		return complianceResponse;
	}

	
	public ComplianceResponse getDetailsByAllCriteria(String name, Date startDate, Date endDate,
			String rmId) {
		ComplianceResponse complianceResponse = new ComplianceResponse();

		List<ComplianceApps> listOfApps = new ArrayList<ComplianceApps>();

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
			errorLog.error(" Exception got in getDetailsByAllCriteria(),ComplianceServiceImpl is : "+exceptionMessage);
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
				errorLog.error("dateSubmitted coud not be parsed in getDetailsByAllCriteria(),ComplianceServiceImpl");
			}

			complianceApps.setAppSubmittedDate(dateSubmitted);

			complianceApps.setAppStatus(outputs[5].toString());
			
			try{
				if(outputs[6].toString()!=null){
					complianceApps.setAccountNumber(outputs[6].toString());
				}
				else{
					complianceApps.setAccountNumber(null);
				}
			}catch(NullPointerException e){
				errorLog.error("Account Number is null in getDetailsByAllCriteria(),ComplianceServiceImpl");
			}
			
			SimpleDateFormat dateFormatCreationDate = new SimpleDateFormat("yyyy-MM-dd");

			String dateCreationDate = outputs[7].toString();

			Date dateCreation= new Date();
			try {
				dateCreation = dateFormatCreationDate.parse(dateCreationDate);
			} catch (ParseException e) {
				errorLog.error("dateCreation coud not be parsed in getDetailsByAllCriteria(),ComplianceServiceImpl");
			}
			
			complianceApps.setAccountCreationDate(dateCreation);

			listOfApps.add(complianceApps);

		}
		complianceResponse.setApps(listOfApps);
		infoLog.info("complianceResponse in getDetailsByAllCriteria() ,ComplianceServiceImpl : "+complianceResponse.toString());
		return complianceResponse;
	}

}
