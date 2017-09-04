package com.afrAsia.service.impl;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.persistence.NoResultException;

import org.apache.log4j.Logger;
import org.springframework.transaction.annotation.Transactional;

import com.afrAsia.customexception.IdNotFoundException;
import com.afrAsia.dao.jpa.AddCommentJpaDao;
import com.afrAsia.entities.jpa.ApplicationReference;
import com.afrAsia.entities.response.GenericResponse;
import com.afrAsia.entities.response.MessageHeader;
import com.afrAsia.entities.response.RequestError;
import com.afrAsia.entities.transactions.MobComments;
import com.afrAsia.service.AddCommentService;

public class AddCommentServiceImpl implements AddCommentService {

	final static Logger debugLog = Logger.getLogger("debugLogger");
	final static Logger infoLog = Logger.getLogger("infoLogger");
	final static Logger errorLog = Logger.getLogger("errorLogger");
	
	private AddCommentJpaDao addCommentDao;

	public AddCommentJpaDao getAddCommentDao() {
		return addCommentDao;
	}

	public void setAddCommentDao(AddCommentJpaDao addCommentDao) {
		this.addCommentDao = addCommentDao;
	}

	@Transactional(readOnly = false, rollbackFor = { Exception.class })
	public GenericResponse addComments(Long appId, String comments, String rmId, String userCat) {

		Calendar createdDate1 = Calendar.getInstance();
		String input = createdDate1.toString();
		DateFormat inputFormatter = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.S");
		Date createdDate = new Date();
		try {
			createdDate = inputFormatter.parse(input);
		} catch (ParseException e1) {
			errorLog.error(" ParseException : "+e1.getMessage());
		}

		String modifiedBy = null;
		Calendar modifiedDate1 = Calendar.getInstance();
		String input1 = modifiedDate1.toString();
		Date modifiedDate = new Date();
		try {
			modifiedDate = inputFormatter.parse(input1);
		} catch (ParseException e) {
			infoLog.info(" ParseException : "+e.getMessage());
		}

		GenericResponse genericResponse = new GenericResponse();

		MobComments mobComments = new MobComments();
		mobComments.setAppId(appId);
		mobComments.setComment(comments);
		mobComments.setCommentDate(createdDate);
		mobComments.setUserCat(userCat);
		mobComments.setCommentedAddedBy(rmId);

		List<Long> appids = addCommentDao.getAppId(appId);
		ApplicationReference applicationReference1 = new ApplicationReference();

		for (Long object : appids) {
			applicationReference1.setId(object);
		}
		/*List<String> rmUserIds = addCommentDao.getRmUserId(userId);

		ApplicationReference applicationReference1 = new ApplicationReference();

		for (Long object : appids) {
			applicationReference1.setId(object);
		}*/
		// check whether the given RmId is present in DB or not 
				String rmUserIdFromDB=null;
				try{			
					//rmUserIdFromDB= addCommentDao.getRmId(rmId);			
					/*if(rmUserIdFromDB==null){
						throw new IdNotFoundException("Provided RM user id is not present, please pass proper value");
					}*/

				}  
				/*catch(IdNotFoundException exceptionMessage){
					MessageHeader messageHeader = new MessageHeader();
					RequestError requestError = new RequestError();
					requestError.setRsn("requested app id is not present , please pass another id");
					requestError.setCustomCode("ERR404");
					requestError.setCd("404");
					messageHeader.setError(requestError);
					genericResponse.setMsgHeader(messageHeader);
					return genericResponse;
				}	*/
				catch(NoResultException excpMessage){
					MessageHeader messageHeader = new MessageHeader();
					RequestError requestError = new RequestError();
					requestError.setRsn("requested app id is not present , please pass another id");
					requestError.setCustomCode("ERR404");
					requestError.setCd("404");
					messageHeader.setError(requestError);
					genericResponse.setMsgHeader(messageHeader);
					return genericResponse;
				}


		/*ApplicationReference applicationReference2 = new ApplicationReference();
		for (String object : rmUserIds) {
			applicationReference2.setRmUserId(object);
		}*/

				try {
					//if (applicationReference2.getRmUserId() != null && applicationReference2.getRmUserId().equals(userId)) {
					if (applicationReference1.getId() == appId){
						// add comments 
						addCommentDao.addComments(mobComments);
						infoLog.info(" comment added : ");
					}
					else {
						MessageHeader messageHeader = new MessageHeader();
						RequestError requestError = new RequestError();
						requestError.setRsn("requested app id is not present");
						requestError.setCustomCode("ERR404");
						requestError.setCd("404");
						messageHeader.setError(requestError);
						genericResponse.setMsgHeader(messageHeader);
						throw new IdNotFoundException("requested app id is not present");
					}}
				catch (IdNotFoundException exceptionMessage) {
					errorLog.error(" Exception got : " + exceptionMessage);
					System.out.println(" Exception got : " + exceptionMessage);
				}
				/*}} else {
				MessageHeader messageHeader = new MessageHeader();
				RequestError requestError = new RequestError();
				requestError
						.setRsn("requested RM user is not present for the given id , please pass another RM userid");
				requestError.setCustomCode("ERR404");
				requestError.setCd("404");
				messageHeader.setError(requestError);
				genericResponse.setMsgHeader(messageHeader);
				throw new IdNotFoundException("Provided Rm user id is not present, please pass another Rm user id");
			}
		} catch (IdNotFoundException exceptionMessage) {
			System.out.println(" Exception got : " + exceptionMessage);
		} catch (RMIdNotFoundException exceptionMessage) {
			System.out.println(" Exception got : " + exceptionMessage);
		}*/
		return genericResponse;
	}
}
