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
import com.afrAsia.customexception.IdNotFoundException;
import com.afrAsia.dao.jpa.RmApplicationsAppJpaDAO;
import com.afrAsia.entities.jpa.ApplicationReference;
import com.afrAsia.entities.response.Apps;
import com.afrAsia.entities.response.MessageHeader;
import com.afrAsia.entities.response.RequestError;
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
	
	
	public RmApplicationAppResponse getDetailsByefault(String rmId) {
		
		System.out.println(" ################ in getDetailsByefault service impl ===== ");

		RmApplicationAppResponse rmApplicationAppResponse = new RmApplicationAppResponse();

		List<Apps> listOfApps = new ArrayList<Apps>();

		Set<Apps> setOfApps = new LinkedHashSet<Apps>(listOfApps);

		List<Object> detailsByDefault = new ArrayList<Object>(listOfApps);
		
		//Long id=Long.parseLong(rmId);

		List<String> id= rmApplicationsAppDao.getId(rmId);
		
		int i=0;
		
		ApplicationReference applicationReference=new ApplicationReference();
		for(String object:id){
			applicationReference.setRmUserId(object);
		}
		
		try{	
			if(applicationReference.getRmUserId() !=null && applicationReference.getRmUserId().equals(rmId)){ 
				/*System.out.println(" applicationReference.getRmUserId() ###########in if############# "+applicationReference.getRmUserId()); 
				System.out.println(" rmId ###########in if############# "+ rmId);*/
				detailsByDefault = rmApplicationsAppDao.getDetailsByefault(rmId);
		    }
			else{
				MessageHeader messageHeader=new MessageHeader();
				RequestError requestError=new RequestError();
				/*System.out.println(" applicationReference.getRmUserId() ###########in else ############# "+applicationReference.getRmUserId());
				System.out.println(" rmId ###########in else ############# "+ rmId);*/
				requestError.setCustomCode("requested RM user is not present for the given id , please pass another RM userid");
				messageHeader.setError(requestError);
				rmApplicationAppResponse.setMessageHeader(messageHeader);
				throw new IdNotFoundException("Provided Rm user id is not present, please pass another id");
			}
		}catch(IdNotFoundException exceptionMessage){
			System.out.println(" Exception got : "+exceptionMessage);
		}

		for (Object object : detailsByDefault) {
			
			Apps apps = new Apps();
			
			Object[] outputs = (Object[]) object;

			apps.setRefNo(outputs[0].toString());
			
			//System.out.println(" ====== ref id service impl is ========= " + apps.getRefNo());

			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");

			String dateStr = outputs[1].toString();

			Date date = new Date();
			try {
				date = dateFormat.parse(dateStr);
			} catch (ParseException e) {
				System.out.println(" ==================== date coud not be parsed =========== ");
			}

			apps.setAppSubmittedDate(date);

			apps.setAppStatus(outputs[2].toString());

			apps.setCustomerName(outputs[3].toString()+" "+outputs[4].toString());
			listOfApps.add(i, apps);
			i++;

		}
		System.out.println("listOfApps=================" + listOfApps);
		setOfApps.addAll(listOfApps);
		System.out.println("setOfApps=================" + setOfApps);

		
		rmApplicationAppResponse.setApps(listOfApps);

		return rmApplicationAppResponse;
	}

	public RmApplicationAppResponse getDetailsByName(String name, String rmId) {
		
		System.out.println(" ################ in getDetailsByName service impl ===== ");
		
		RmApplicationAppResponse rmApplicationAppResponse = new RmApplicationAppResponse();

		List<Apps> listOfApps = new ArrayList<Apps>();

		Set<Apps> setOfApps = new LinkedHashSet<Apps>(listOfApps);

		List<Object> detailsByName = new ArrayList<Object>(listOfApps);

		ApplicationReference applicationReference=new ApplicationReference();
		
		List<String> id= rmApplicationsAppDao.getId(rmId);
		
		for(String object:id){
			applicationReference.setRmUserId(object);
		}
		
		try{	
			if(applicationReference.getRmUserId() !=null && applicationReference.getRmUserId().equals(rmId)){
				/*System.out.println(" applicationReference.getRmUserId() ###########in if############# "+applicationReference.getRmUserId());
				System.out.println(" rmId ###########in if############# "+ rmId);*/
		detailsByName = (List<Object>) rmApplicationsAppDao.getDetailsByName(name, rmId);
		    }  
			else{
				/*System.out.println(" applicationReference.getRmUserId() ###########in else ############# "+applicationReference.getRmUserId());
				System.out.println(" rmId ###########in else ############# "+ rmId);*/
				MessageHeader messageHeader=new MessageHeader();
				RequestError requestError=new RequestError();
				requestError.setCustomCode("requested RM user is not present , please pass another RM userid");
				messageHeader.setError(requestError);
				rmApplicationAppResponse.setMessageHeader(messageHeader);
				System.out.println("rmApplicationAppResponse.getMessageHeader().getError().getCustomCode()========="
						+ rmApplicationAppResponse.getMessageHeader().getError().getCustomCode());
				throw new IdNotFoundException("Provided Rm user id is not present, please pass another id");
			}
		}catch(IdNotFoundException exceptionMessage){
			System.out.println(" Exception got : "+exceptionMessage);
		}
		
		int i = 0;
		for (Object object : detailsByName) {

			Apps apps = new Apps();
			Object[] outputs = (Object[]) object;

			apps.setRefNo(outputs[0].toString());
			//System.out.println(" ====== ref id service impl is ========= " + apps.getRefNo());

			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");

			String dateStr = outputs[1].toString();

			Date date = new Date();
			try {
				date = dateFormat.parse(dateStr);
			} catch (ParseException e) {
				// e.printStackTrace();
				//System.out.println(" ==================== date coud not be parsed =========== ");
			}

			apps.setAppSubmittedDate(date);
			//System.out.println(" ====== PendingSince service impl ========= " + apps.getPendingSince());

			apps.setAppStatus(outputs[2].toString());
			//System.out.println(" ====== app status service impl is ========= " + apps.getAppStatus());

			apps.setCustomerName(outputs[3].toString()+" "+outputs[4].toString());
			//System.out.println("############### CustomerName in service impl by date :: " + apps.getCustomerName());
			listOfApps.add(i, apps);
			i++;

		}
		//System.out.println("listOfApps=================" + listOfApps);
		setOfApps.addAll(listOfApps);
		System.out.println("setOfApps=================" + setOfApps);
		//rmApplicationAppResponse.setMessageHeader(null);
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
		System.out.println("==================== diffInDays ===================" +diffInDays);

		
		ApplicationReference applicationReference=new ApplicationReference();
		
		List<String> id= rmApplicationsAppDao.getId(rmId);
		
		for(String object:id){
			applicationReference.setRmUserId(object);
		}
		
		
		
		try{	
			if(applicationReference.getRmUserId() !=null && applicationReference.getRmUserId().equals(rmId)){
				/*System.out.println(" applicationReference.getRmUserId() ###########in if############# "+applicationReference.getRmUserId());
				System.out.println(" rmId ###########in if############# "+ rmId);*/
			if(diffInDays <= 30){
				System.out.println(" diffInDays in if "+ diffInDays);
				listOfCustormerName = (List<Object>) rmApplicationsAppDao.getDetailsByDates(startDate, endDate, rmId);
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
		else{
			/*System.out.println(" applicationReference.getRmUserId() ###########in else ############# "+applicationReference.getRmUserId());
			System.out.println(" rmId ###########in else ############# "+ rmId);*/
			MessageHeader messageHeader=new MessageHeader();
			RequestError requestError=new RequestError();
			requestError.setCustomCode("requested RM user is not present , please pass another RM userid");
			messageHeader.setError(requestError);
			rmApplicationAppResponse.setMessageHeader(messageHeader);
			throw new IdNotFoundException("Provided Rm user id is not present, please pass another id");
		}
		}catch(IdNotFoundException idNotFoundExceptionMessage){
			System.out.println(" Exception got due to unavailability of id :: "+idNotFoundExceptionMessage);
		}
		catch(DateDifferenceException dateDifferenceExceptionMessage){
			System.out.println(" Exception got due to larger difference betweenthe dates provided : "+dateDifferenceExceptionMessage);
		}
		
		
		int i = 0;
		for (Object object : listOfCustormerName) {

			Apps apps = new Apps();
			Object[] outputs = (Object[]) object;

			apps.setRefNo(outputs[0].toString());
			//System.out.println(" ====== ref id service impl is ========= " + apps.getRefNo());

			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");

			String dateStr = outputs[1].toString();

			Date date = new Date();
			try {
				date = dateFormat.parse(dateStr);
			} catch (ParseException e) {
				// e.printStackTrace();
				System.out.println(" ==================== date coud not be parsed =========== ");
			}

			apps.setAppSubmittedDate(date);
			//System.out.println(" ====== PendingSince service impl ========= " + apps.getPendingSince());

			apps.setAppStatus(outputs[2].toString());
			//System.out.println(" ====== app status service impl is ========= " + apps.getAppStatus());

			apps.setCustomerName(outputs[3].toString()+" "+outputs[4].toString());
			//System.out.println("############### CustomerName in service impl by date :: " + apps.getCustomerName());
			listOfApps.add(i, apps);
			i++;

		}
		System.out.println("listOfApps=================" + listOfApps);
		setOfApps.addAll(listOfApps);
		System.out.println("setOfApps=================" + setOfApps);
		////rmApplicationAppResponse.setMessageHeader(null);
		rmApplicationAppResponse.setApps(listOfApps);

		return rmApplicationAppResponse;
	}

	public RmApplicationAppResponse getDetailsByStatus(String status, String rmId) {
		
		System.out.println(" ################ in getDetailsByStatus service impl ===== ");
		
		RmApplicationAppResponse rmApplicationAppResponse = new RmApplicationAppResponse();

		List<Apps> listOfApps = new ArrayList<Apps>();

		Set<Apps> setOfApps = new LinkedHashSet<Apps>(listOfApps);

		List<Object> detailsByStatus = new ArrayList<Object>(listOfApps);

		ApplicationReference applicationReference=new ApplicationReference();
		
		List<String> id= rmApplicationsAppDao.getId(rmId);
		
		for(String object:id){
			applicationReference.setRmUserId(object);
		}
		
		try{	
			if(applicationReference.getRmUserId() !=null && applicationReference.getRmUserId().equals(rmId)){
				/*System.out.println(" applicationReference.getRmUserId() ###########in if############# "+applicationReference.getRmUserId());
				System.out.println(" rmId ###########in if############# "+ rmId);*/
		detailsByStatus = (List<Object>) rmApplicationsAppDao.getDetailsByStatus(status, rmId);
		    }
			else{
				/*System.out.println(" applicationReference.getRmUserId() ########### in else ############# "+applicationReference.getRmUserId());
				System.out.println(" rmId ########### in else ############# "+ rmId);*/
				MessageHeader messageHeader=new MessageHeader();
				RequestError requestError=new RequestError();
				requestError.setCustomCode("requested RM user is not present , please pass another RM userid");
				messageHeader.setError(requestError);
				rmApplicationAppResponse.setMessageHeader(messageHeader);
				throw new IdNotFoundException("Provided Rm user id is not present, please pass another id");
			}
		}catch(IdNotFoundException exceptionMessage){
			System.out.println(" Exception got : "+exceptionMessage);
		}

		
		int i = 0;
		for (Object object : detailsByStatus) {

			Apps apps = new Apps();
			Object[] outputs = (Object[]) object;

			apps.setRefNo(outputs[0].toString());
			//System.out.println(" ====== ref id service impl is ========= " + apps.getRefNo());

			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");

			String dateStr = outputs[1].toString();

			Date date = new Date();
			try {
				date = dateFormat.parse(dateStr);
			} catch (ParseException e) {
				// e.printStackTrace();
				//System.out.println(" ==================== date coud not be parsed =========== ");
			}

			apps.setAppSubmittedDate(date);
			//System.out.println(" ====== PendingSince service impl ========= " + apps.getPendingSince());

			apps.setAppStatus(outputs[2].toString());
			//System.out.println(" ====== app status service impl is ========= " + apps.getAppStatus());

			apps.setCustomerName(outputs[3].toString()+" "+outputs[4].toString());
			//System.out.println("############### CustomerName in service impl by date :: " + apps.getCustomerName());
			listOfApps.add(i, apps);
			i++;

		}
		//System.out.println("listOfApps=================" + listOfApps);
		setOfApps.addAll(listOfApps);
		System.out.println("setOfApps=================" + setOfApps);
		//rmApplicationAppResponse.setMessageHeader(null);
		rmApplicationAppResponse.setApps(listOfApps);

		return rmApplicationAppResponse;

	}

	public RmApplicationAppResponse getDetailsByAllCriteriaWithoutStatus(String name, Date startDate, Date endDate,
			String rmId) {
		//System.out.println(" ################ in getDetailsByAllCriteriaWithoutStatus service impl ===== ");
		RmApplicationAppResponse rmApplicationAppResponse = new RmApplicationAppResponse();

		List<Apps> listOfApps = new ArrayList<Apps>();

		Set<Apps> setOfApps = new LinkedHashSet<Apps>(listOfApps);

		List<Object> detailsByAllCriteriaWithoutStatus = new ArrayList<Object>(listOfApps);

		ApplicationReference applicationReference=new ApplicationReference();
		
		List<String> id= rmApplicationsAppDao.getId(rmId);
		
		for(String object:id){
			applicationReference.setRmUserId(object);
		}
		
		int diffInDays = (int) ((endDate.getTime()-(startDate.getTime())) / (1000 * 60 * 60 * 24));
		System.out.println("==================== diffInDays ====== before try =============" +diffInDays);
		
		try{	
			if(applicationReference.getRmUserId() !=null && applicationReference.getRmUserId().equals(rmId)){
				/*System.out.println(" applicationReference.getRmUserId() ###########in if############# "+applicationReference.getRmUserId());
				System.out.println(" rmId ###########in if############# "+ rmId);*/				
				if(diffInDays <= 30){
					//System.out.println("==================== diffInDays ======in if =============" +diffInDays);
					detailsByAllCriteriaWithoutStatus = (List<Object>) rmApplicationsAppDao.getDetailsByAllCriteriaWithoutStatus
							(name, startDate,endDate, rmId);
					}
					else{
						//System.out.println("==================== diffInDays ======in else =============" +diffInDays);
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
			else{
				/*System.out.println(" applicationReference.getRmUserId() ###########in else ############# "+applicationReference.getRmUserId());
				System.out.println(" rmId ###########in else ############# "+ rmId);*/
				MessageHeader messageHeader=new MessageHeader();
				RequestError requestError=new RequestError();
				requestError.setCustomCode("requested RM user is not present , please pass another RM userid");
				messageHeader.setError(requestError);
				rmApplicationAppResponse.setMessageHeader(messageHeader);
				throw new IdNotFoundException("Provided Rm user id is not present, please pass another id");
			}
		}catch(IdNotFoundException exceptionMessage){
			System.out.println(" Exception got : "+exceptionMessage);
		}
		catch(DateDifferenceException exceptionMessage){
			System.out.println(" Exception got : "+exceptionMessage);
		}
		
		System.out.println("################ listOfCustormerName in service impl "+detailsByAllCriteriaWithoutStatus);
		int i = 0;
		for (Object object : detailsByAllCriteriaWithoutStatus) {

			Apps apps = new Apps();
			Object[] outputs = (Object[]) object;

			apps.setRefNo(outputs[0].toString());
			//System.out.println(" ====== ref id service impl is ========= " + apps.getRefNo());

			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");

			String dateStr = outputs[1].toString();

			Date date = new Date();
			try {
				date = dateFormat.parse(dateStr);
			} catch (ParseException e) {
				//System.out.println(" ==================== date coud not be parsed =========== ");
			}

			apps.setAppSubmittedDate(date);
			//System.out.println(" ====== PendingSince service impl ========= " + apps.getPendingSince());

			apps.setAppStatus(outputs[2].toString());
			//System.out.println(" ====== app status service impl is ========= " + apps.getAppStatus());

			apps.setCustomerName(outputs[3].toString()+ " "+outputs[4].toString());
			//System.out.println("############### CustomerName in service impl by date :: " + apps.getCustomerName());
			listOfApps.add(i, apps);
			i++;

		}
		//System.out.println("listOfApps=================" + listOfApps);
		setOfApps.addAll(listOfApps);
		System.out.println("setOfApps=================" + setOfApps);
		//rmApplicationAppResponse.setMessageHeader(null);
		rmApplicationAppResponse.setApps(listOfApps);

		return rmApplicationAppResponse;
	}

	public RmApplicationAppResponse getDetailsByAllCriteriaWithStatus(String name, Date startDate, Date endDate, String status,
			String rmId) {
		
		//System.out.println(" ################ in getDetailsByAllCriteriaWithStatus service impl ===== ");
		
		RmApplicationAppResponse rmApplicationAppResponse = new RmApplicationAppResponse();

		List<Apps> listOfApps = new ArrayList<Apps>();

		Set<Apps> setOfApps = new LinkedHashSet<Apps>(listOfApps);

		List<Object> detailsByAllCriteriaWithStatus = new ArrayList<Object>(listOfApps);

		ApplicationReference applicationReference=new ApplicationReference();
		
		List<String> id= rmApplicationsAppDao.getId(rmId);
		
		for(String object:id){
			applicationReference.setRmUserId(object);
		}
		
		int diffInDays = (int) ((endDate.getTime()-(startDate.getTime())) / (1000 * 60 * 60 * 24));
		System.out.println("==================== diffInDays ====== before try =============" +diffInDays);
		
		try{	
			if(applicationReference.getRmUserId() !=null && applicationReference.getRmUserId().equals(rmId)){
				if(diffInDays <= 30){
					//System.out.println("==================== diffInDays ======in if =============" +diffInDays);
					detailsByAllCriteriaWithStatus = (List<Object>) rmApplicationsAppDao.getDetailsByAllCriteriaWithStatus(name, startDate,endDate, status, rmId);
					}
					else{
						//System.out.println("==================== diffInDays ======in else =============" +diffInDays);
						MessageHeader messageHeader=new MessageHeader();
						RequestError requestError=new RequestError();
						requestError.setCustomCode(" difference between start date and end date is more than 30 days,"
							+ "please pass dates such that difference should not exceed 30");
						messageHeader.setError(requestError);
						rmApplicationAppResponse.setMessageHeader(messageHeader);	
						throw new DateDifferenceException("difference between start date and end date is more than 30 days,"
							+ "please pass dates such that difference should not exceed 30");
					}
				/*System.out.println(" applicationReference.getRmUserId() ###########in if############# "+applicationReference.getRmUserId());
				System.out.println(" rmId ###########in if############# "+ rmId);*/
			
		    }
			else{
				/*System.out.println(" applicationReference.getRmUserId() ###########in else ############# "+applicationReference.getRmUserId());
				System.out.println(" rmId ###########in else ############# "+ rmId);*/
				MessageHeader messageHeader=new MessageHeader();
				RequestError requestError=new RequestError();

				requestError.setCustomCode("requested RM user is not present , please pass another RM userid");
				messageHeader.setError(requestError);
				rmApplicationAppResponse.setMessageHeader(messageHeader);
				throw new IdNotFoundException("Provided Rm user id is not present, please pass another id");
			}
		}catch(IdNotFoundException exceptionMessage){
			System.out.println(" Exception got : "+exceptionMessage);
		}
		catch(DateDifferenceException exceptionMessage){
			System.out.println(" Exception got : "+exceptionMessage);
		}
		
		int i = 0;
		for (Object object : detailsByAllCriteriaWithStatus) {

			Apps apps = new Apps();
			Object[] outputs = (Object[]) object;

			apps.setRefNo(outputs[0].toString());
			//System.out.println(" ====== ref id service impl is ========= " + apps.getRefNo());

			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");

			String dateStr = outputs[1].toString();

			Date date = new Date();
			try {
				date = dateFormat.parse(dateStr);
			} catch (ParseException e) {
				System.out.println(" ==================== date coud not be parsed =========== ");
			}

			apps.setAppSubmittedDate(date);

			apps.setAppStatus(outputs[2].toString());

			apps.setCustomerName(outputs[3].toString()+" "+outputs[4].toString());
			listOfApps.add(i, apps);
			i++;

		}
		//System.out.println("listOfApps=================" + listOfApps);
		setOfApps.addAll(listOfApps);
		System.out.println("setOfApps=================" + setOfApps);
		//rmApplicationAppResponse.setMessageHeader(null);
		rmApplicationAppResponse.setApps(listOfApps);

		return rmApplicationAppResponse;
	}

}
