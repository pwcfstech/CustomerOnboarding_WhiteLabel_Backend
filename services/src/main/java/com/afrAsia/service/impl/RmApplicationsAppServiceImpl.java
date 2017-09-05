package com.afrAsia.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.NoResultException;

import org.apache.log4j.Logger;

import com.afrAsia.customexception.DateDifferenceException;
import com.afrAsia.dao.jpa.RmApplicationsAppJpaDAO;
import com.afrAsia.entities.response.Apps;
import com.afrAsia.entities.response.MessageHeader;
import com.afrAsia.entities.response.RequestError;
import com.afrAsia.entities.response.RmApplicationAppResponse;
import com.afrAsia.service.RmApplicationsAppService;

public class RmApplicationsAppServiceImpl implements RmApplicationsAppService {

	final static Logger debugLog = Logger.getLogger("debugLogger");
	final static Logger infoLog = Logger.getLogger("infoLogger");
	final static Logger errorLog = Logger.getLogger("errorLogger");
	
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
	
	
	public RmApplicationAppResponse getDetailsByefault(String rmId) {

		RmApplicationAppResponse rmApplicationAppResponse = new RmApplicationAppResponse();

		List<Apps> listOfApps = new ArrayList<Apps>();

		List<Object> detailsByDefault = new ArrayList<Object>(listOfApps);

		// check whether the given RmId is present in DB or not 
		String rmUserIdFromDB=null;
		try{			
			//rmUserIdFromDB= rmApplicationsAppDao.getRmId(rmId);			
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
			requestError.setRsn("Provided Rm user id is not present");
			messageHeader.setError(requestError);
			rmApplicationAppResponse.setMessageHeader(messageHeader);
			return rmApplicationAppResponse;
		}
		
		int i=0;
		
		// get all the details of records by default		
		detailsByDefault = rmApplicationsAppDao.getDetailsByefault(rmId);
		infoLog.info(" records fetched from DB on the basis of RmId only : "+detailsByDefault.toString());
		
		for (Object object : detailsByDefault) {
			
			Apps apps = new Apps();
			
			Object[] outputs = (Object[]) object;

			apps.setRefNo(outputs[0].toString());
			
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.S");

			String dateStr = outputs[1].toString();

			Date date = new Date();
			try {
				date = dateFormat.parse(dateStr);
			} catch (ParseException e) {
				errorLog.error("  date coud not be parsed in getDetailsByefault method of RmApplicationsAppServiceImpl class ");
			}

			apps.setAppSubmittedDate(date.getTime());
			apps.setAppSubmittedDate(date.getTime());
			apps.setAppStatus(outputs[2].toString());

			apps.setCustomerName(outputs[3].toString()+" "+outputs[4].toString());
			listOfApps.add(i, apps);
			i++;
		}
		rmApplicationAppResponse.setApps(listOfApps);
		infoLog.info(" response on the basis of RmId only : "+rmApplicationAppResponse);
		
		return rmApplicationAppResponse;
	}

	public RmApplicationAppResponse getDetailsByName(String name, String rmId) {
		
		RmApplicationAppResponse rmApplicationAppResponse = new RmApplicationAppResponse();

		List<Apps> listOfApps = new ArrayList<Apps>();

		List<Object> detailsByName = new ArrayList<Object>(listOfApps);

		// check whether the given RmId is present in DB or not 
				String rmUserIdFromDB=null;
				try{			
					//rmUserIdFromDB= rmApplicationsAppDao.getRmId(rmId);			
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
					requestError.setRsn("Provided Rm user id is not present");
					messageHeader.setError(requestError);
					rmApplicationAppResponse.setMessageHeader(messageHeader);
					return rmApplicationAppResponse;
				}

		// get all records by name and Rm Id	
		detailsByName = (List<Object>) rmApplicationsAppDao.getDetailsByName(name, rmId);
		infoLog.info(" records fetched from DB on the basis basis of name,rmId is : "+detailsByName.toString());  
		int i = 0;
		for (Object object : detailsByName) {

			Apps apps = new Apps();
			Object[] outputs = (Object[]) object;

			apps.setRefNo(outputs[0].toString());

			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.S");

			String dateStr = outputs[1].toString();

			Date date = new Date();
			try {
				date = dateFormat.parse(dateStr);
			} catch (ParseException e) {
				errorLog.error("   date coud not be parsed in getDetailsByName method of RmApplicationsAppServiceImpl class ");
			}

			apps.setAppSubmittedDate(date.getTime());
			apps.setAppSubmittedDate(date.getTime());
			apps.setAppStatus(outputs[2].toString());
			apps.setCustomerName(outputs[3].toString()+" "+outputs[4].toString());
			listOfApps.add(i, apps);
			i++;
		}
		rmApplicationAppResponse.setApps(listOfApps);
		infoLog.info(" response on the basis of name,rmId is :: "+rmApplicationAppResponse);
		return rmApplicationAppResponse;
	}

	public RmApplicationAppResponse getDetailsByDates(Date startDate, Date endDate, String rmId) {
		
		RmApplicationAppResponse rmApplicationAppResponse = new RmApplicationAppResponse();

		List<Apps> listOfApps = new ArrayList<Apps>();

		List<Object> listOfCustormerName = new ArrayList<Object>(listOfApps);

		
		int diffInDays = (int) ((endDate.getTime()-(startDate.getTime())) / (1000 * 60 * 60 * 24)+1);
		
		// check whether the given RmId is present in DB or not 
		String rmUserIdFromDB=null;
		try{			
			//rmUserIdFromDB= rmApplicationsAppDao.getRmId(rmId);			
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
			requestError.setRsn("Provided Rm user id is not present");
			messageHeader.setError(requestError);
			rmApplicationAppResponse.setMessageHeader(messageHeader);
			return rmApplicationAppResponse;
		}
		
		// get all the records by dates and rm id	
		try{	
			if(endDate.getTime()>=startDate.getTime()){
				if(diffInDays <= 31 && diffInDays > 0){
					listOfCustormerName = (List<Object>) rmApplicationsAppDao.getDetailsByDates(startDate, endDate, rmId);
					infoLog.info(" records fetched from DB on the basis basis of startDate,endDate,rmId is : "+listOfCustormerName.toString());
				}
				else{
					MessageHeader messageHeader=new MessageHeader();
					RequestError requestError=new RequestError();
					requestError.setRsn("difference between start date and end date is more than 30 days");
					messageHeader.setError(requestError); 
					rmApplicationAppResponse.setMessageHeader(messageHeader);	
					throw new DateDifferenceException("difference between start date and end date is more than 30 days");
				}
			}
			else{
				MessageHeader messageHeader=new MessageHeader();
				RequestError requestError=new RequestError();
				requestError.setRsn("start date is greater than end date");
				messageHeader.setError(requestError); 
				rmApplicationAppResponse.setMessageHeader(messageHeader);	
				throw new DateDifferenceException("start date is greater than end date");
			}
		}catch(DateDifferenceException dateDifferenceExceptionMessage){
			errorLog.error(" Exception got due to : "+dateDifferenceExceptionMessage);
		}
		
		int i = 0;
		for (Object object : listOfCustormerName) {

			Apps apps = new Apps();
			Object[] outputs = (Object[]) object;

			apps.setRefNo(outputs[0].toString());

			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.S");

			String dateStr = outputs[1].toString();

			Date date = new Date();
			try {
				date = dateFormat.parse(dateStr);
			} catch (ParseException e) {
				errorLog.error("   date coud not be parsed in getDetailsByDates method of RmApplicationsAppServiceImpl class ");
			}

			apps.setAppSubmittedDate(date.getTime());
			apps.setAppSubmittedDate(date.getTime());
			apps.setAppStatus(outputs[2].toString());
			apps.setCustomerName(outputs[3].toString()+" "+outputs[4].toString());
			listOfApps.add(i, apps);
			i++;
		}
		rmApplicationAppResponse.setApps(listOfApps);
		infoLog.info(" response on the basis of startDate,endDate,rmId is :: "+rmApplicationAppResponse);
		return rmApplicationAppResponse;
	}

	public RmApplicationAppResponse getDetailsByStatus(String status, String rmId) {
		
		RmApplicationAppResponse rmApplicationAppResponse = new RmApplicationAppResponse();

		List<Apps> listOfApps = new ArrayList<Apps>();

		List<Object> detailsByStatus = new ArrayList<Object>(listOfApps);

		// check whether the given RmId is present in DB or not 
		String rmUserIdFromDB=null;
		try{			
			//rmUserIdFromDB= rmApplicationsAppDao.getRmId(rmId);			
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
			requestError.setRsn("Provided Rm user id is not present");
			messageHeader.setError(requestError);
			rmApplicationAppResponse.setMessageHeader(messageHeader);
			return rmApplicationAppResponse;
		}
		
		// get all the records by status and rm id 	
		detailsByStatus = (List<Object>) rmApplicationsAppDao.getDetailsByStatus(status, rmId);
		infoLog.info(" records fetched from DB on the basis basis of Status,rmId is : "+detailsByStatus.toString());
		int i = 0;
		for (Object object : detailsByStatus) {

			Apps apps = new Apps();
			Object[] outputs = (Object[]) object;

			apps.setRefNo(outputs[0].toString());

			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.S");

			String dateStr = outputs[1].toString();

			Date date = new Date();
			try {
				date = dateFormat.parse(dateStr);
			} catch (ParseException e) {
				errorLog.error("  date coud not be parsed in detailsByStatus method of RmApplicationsAppServiceImpl class ");
			}
			apps.setAppSubmittedDate(date.getTime());
			apps.setAppSubmittedDate(date.getTime());
			apps.setAppStatus(outputs[2].toString());
			apps.setCustomerName(outputs[3].toString()+" "+outputs[4].toString());
			listOfApps.add(i, apps);
			i++;
		}
		rmApplicationAppResponse.setApps(listOfApps);
		infoLog.info(" response on the basis of status and rmId is :: "+rmApplicationAppResponse);
		return rmApplicationAppResponse;
	}

	public RmApplicationAppResponse getDetailsByAllCriteriaWithoutStatus(String name, Date startDate, Date endDate,
			String rmId) {
		
		RmApplicationAppResponse rmApplicationAppResponse = new RmApplicationAppResponse();

		List<Apps> listOfApps = new ArrayList<Apps>();

		List<Object> detailsByAllCriteriaWithoutStatus = new ArrayList<Object>(listOfApps);

		/*List<String> id= rmApplicationsAppDao.getId(rmId);
		
		for(String object:id){
			applicationReference.setRmUserId(object);
		}*/
		
		// check whether the given RmId is present in DB or not 
		String rmUserIdFromDB=null;
		try{			
			//rmUserIdFromDB= rmApplicationsAppDao.getRmId(rmId);			
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
			requestError.setRsn("Provided Rm user id is not present");
			messageHeader.setError(requestError);
			rmApplicationAppResponse.setMessageHeader(messageHeader);
			return rmApplicationAppResponse;
		}
		
		int diffInDays = (int) ((endDate.getTime()-(startDate.getTime())) / (1000 * 60 * 60 * 24)+1);
		
		try{	
			if(endDate.getTime()>=startDate.getTime()){
				if(diffInDays <= 30 && diffInDays > 0){
					detailsByAllCriteriaWithoutStatus = (List<Object>) rmApplicationsAppDao.getDetailsByAllCriteriaWithoutStatus
							(name, startDate,endDate, rmId);
					infoLog.info(" records fetched from DB on the basis basis of name,startDate,endDate,rmId is : "
							+detailsByAllCriteriaWithoutStatus.toString());
				}
				else{
					MessageHeader messageHeader=new MessageHeader();
					RequestError requestError=new RequestError();
					requestError.setRsn("difference between start date and end date is more than 30 days");
					messageHeader.setError(requestError); 
					rmApplicationAppResponse.setMessageHeader(messageHeader);	
					throw new DateDifferenceException("difference between start date and end date is more than 30 days");
				}
			}
			else{
				MessageHeader messageHeader=new MessageHeader();
				RequestError requestError=new RequestError();
				requestError.setRsn("start date is greater than end date");
				messageHeader.setError(requestError); 
				rmApplicationAppResponse.setMessageHeader(messageHeader);	
				throw new DateDifferenceException("start date is greater than end date");
			}
		}catch(DateDifferenceException dateDifferenceExceptionMessage){
			errorLog.error(" Exception got due to : "+dateDifferenceExceptionMessage);
		}
		
		int i = 0;
		for (Object object : detailsByAllCriteriaWithoutStatus) {

			Apps apps = new Apps();
			Object[] outputs = (Object[]) object;

			apps.setRefNo(outputs[0].toString());
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.S");

			String dateStr = outputs[1].toString();

			Date date = new Date();
			try {
				date = dateFormat.parse(dateStr);
			} catch (ParseException e) {
				errorLog.error("  date coud not be parsed in getDetailsByAllCriteriaWithoutStatus method of RmApplicationsAppServiceImpl class ");
			}

			apps.setAppSubmittedDate(date.getTime());
			apps.setAppSubmittedDate(date.getTime());
			apps.setAppStatus(outputs[2].toString());

			apps.setCustomerName(outputs[3].toString()+ " "+outputs[4].toString());
			listOfApps.add(i, apps);
			i++;
		}
		rmApplicationAppResponse.setApps(listOfApps);
		infoLog.info(" response on the basis of name,startDate,endDate,rmId is :: "+rmApplicationAppResponse);
		return rmApplicationAppResponse;
	}

	public RmApplicationAppResponse getDetailsByAllCriteriaWithStatus(String name, Date startDate, Date endDate, String status,
			String rmId) {
		RmApplicationAppResponse rmApplicationAppResponse = new RmApplicationAppResponse();

		List<Apps> listOfApps = new ArrayList<Apps>();

		List<Object> detailsByAllCriteriaWithStatus = new ArrayList<Object>(listOfApps);

		/*ApplicationReference applicationReference=new ApplicationReference();
		
		List<String> id= rmApplicationsAppDao.getId(rmId);
		
		for(String object:id){
			applicationReference.setRmUserId(object);
		}*/
		// check whether the given RmId is present in DB or not 
		String rmUserIdFromDB=null;
		try{			
			//rmUserIdFromDB= rmApplicationsAppDao.getRmId(rmId);			
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
			requestError.setRsn("Provided Rm user id is not present");
			messageHeader.setError(requestError);
			rmApplicationAppResponse.setMessageHeader(messageHeader);
			return rmApplicationAppResponse;
		}
		
		int diffInDays = (int) ((endDate.getTime()-(startDate.getTime())) / (1000 * 60 * 60 * 24)+1);
		
		try{	
			if(endDate.getTime()>=startDate.getTime()){
				if(diffInDays <= 30 && diffInDays > 0){
					detailsByAllCriteriaWithStatus = (List<Object>) rmApplicationsAppDao.getDetailsByAllCriteriaWithStatus(name, 
							startDate,endDate, status, rmId);
					infoLog.info(" records fetched from DB on the basis basis of name,startDate,endDate,status,rmId is : "
							+detailsByAllCriteriaWithStatus.toString());
				}
				else{
					MessageHeader messageHeader=new MessageHeader();
					RequestError requestError=new RequestError();
					requestError.setRsn("difference between start date and end date is more than 30 days");
					messageHeader.setError(requestError); 
					rmApplicationAppResponse.setMessageHeader(messageHeader);	
					throw new DateDifferenceException("difference between start date and end date is more than 30 days");
				}
			}
			else{
				MessageHeader messageHeader=new MessageHeader();
				RequestError requestError=new RequestError();
				requestError.setRsn("start date is greater than end date");
				messageHeader.setError(requestError); 
				rmApplicationAppResponse.setMessageHeader(messageHeader);	
				throw new DateDifferenceException("start date is greater than end date");
			}
		}catch(DateDifferenceException dateDifferenceExceptionMessage){
			errorLog.error(" Exception got due to : "+dateDifferenceExceptionMessage);
		}
		
		int i = 0;
		for (Object object : detailsByAllCriteriaWithStatus) {

			Apps apps = new Apps();
			Object[] outputs = (Object[]) object;

			apps.setRefNo(outputs[0].toString());

			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.S");

			String dateStr = outputs[1].toString();

			Date date = new Date();
			try {
				date = dateFormat.parse(dateStr);
			} catch (ParseException e) {
				errorLog.error("  date coud not be parsed in getDetailsByAllCriteriaWithStatus method of RmApplicationsAppServiceImpl class ");
			}

			apps.setAppSubmittedDate(date.getTime());
			apps.setAppSubmittedDate(date.getTime());
			apps.setAppStatus(outputs[2].toString());

			apps.setCustomerName(outputs[3].toString()+" "+outputs[4].toString());
			listOfApps.add(i, apps);
			i++;
		}
		rmApplicationAppResponse.setApps(listOfApps);
		infoLog.info(" response on the basis of name,startDate,endDate,status,rmId is : "+rmApplicationAppResponse);
		return rmApplicationAppResponse;
	}
}
