 package com.afrAsia.service.impl;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;

import com.afrAsia.customexception.IdNotFoundException;
import com.afrAsia.customexception.RMIdNotFoundException;
import com.afrAsia.dao.jpa.AddCommentJpaDao;
import com.afrAsia.entities.jpa.ApplicationReference;
import com.afrAsia.entities.response.GenericResponse;
import com.afrAsia.entities.response.MessageHeader;
import com.afrAsia.entities.response.RequestError;
import com.afrAsia.entities.response.RequestSuccess;
import com.afrAsia.entities.transactions.MobComments;
import com.afrAsia.service.AddCommentService;

public class AddCommentServiceImpl implements AddCommentService {
	
	private AddCommentJpaDao addCommentDao;
	
	public AddCommentJpaDao getAddCommentDao() {
		return addCommentDao;
	}

	public void setAddCommentDao(AddCommentJpaDao addCommentDao) {
		this.addCommentDao = addCommentDao;
	}

	private static final Logger logger = LoggerFactory.getLogger(AddCommentServiceImpl.class);

	@Transactional(readOnly = false, rollbackFor = {Exception.class})
	public GenericResponse addComments(Long appId,String comments,String userId,String userCat) {
		
		System.out.println("appid is in service impl ====== :: "+appId);
		System.out.println("comments is in service impl ====== :: "+comments);
		System.out.println("userId is in service impl ====== :: "+userId);
		System.out.println("userCat is in service impl ====== :: "+userCat);
		
		/*Long id1=1L; 
		int id2 = new Integer(id1.intValue() + 1);
		String id3=String.valueOf(id2);
		Long id=Long.parseLong(id3);*/
		
		Calendar createdDate1 = Calendar.getInstance(); 
		String input = createdDate1.toString();
		DateFormat inputFormatter = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.S");
		Date createdDate=new Date();
		try {
			createdDate = inputFormatter.parse(input);
			System.out.println("created date in service impl ============ : "+createdDate);
		} catch (ParseException e1) {
			//e1.printStackTrace();
			System.out.println("can not parse date for createdDate");
		}
		
		String modifiedBy=null; 
		Calendar modifiedDate1 = Calendar.getInstance(); 
		String input1 = modifiedDate1.toString();
		Date modifiedDate=new Date();
		try {
			modifiedDate = inputFormatter.parse(input1);
			System.out.println("modifiedDate in service impl ============ : "+modifiedDate);
		} catch (ParseException e) {
			//e.printStackTrace();
			System.out.println("can not parse date for modifiedDate");
		}
		
		GenericResponse genericResponse=new GenericResponse();
		
		
		MobComments mobComments=new MobComments();
		//mobComments.setId(id);
		System.out.println("id in mobComments in service impl ====== "+mobComments.getId());
		mobComments.setAppId(appId);
		System.out.println("AppId in mobComments in service impl ====== "+mobComments.getAppId());
		mobComments.setComment(comments);
		System.out.println("Comment in mobComments in service impl ====== "+mobComments.getComment());
		mobComments.setCommentDate(createdDate);
		System.out.println("CommentDate in mobComments in service impl ====== "+mobComments.getCommentDate());
		mobComments.setUserCat(userCat);
		System.out.println("UserCat in mobComments in service impl ====== "+mobComments.getUserCat());
		mobComments.setCommentedAddedBy(userId);
		System.out.println("UserCat in mobComments in service impl ====== "+mobComments.getCommentedAddedBy());
		
		List<Long> appids= addCommentDao.getAppId(appId);
		
		List<String> rmUserIds= addCommentDao.getRmUserId(userId);
		
		ApplicationReference applicationReference1=new ApplicationReference();
		for(Long object:appids){
			applicationReference1.setId(object);		}
		
		ApplicationReference applicationReference2=new ApplicationReference();
		for(String object:rmUserIds){
			applicationReference2.setRmUserId(object);
		}
		
		try{	
		if(applicationReference2.getRmUserId() !=null && applicationReference2.getRmUserId().equals(userId)){
				if(applicationReference1.getId()==appId){ 
			addCommentDao.addComments(mobComments);
			MessageHeader messageHeader=new MessageHeader();
			RequestSuccess requestSuccess=new RequestSuccess();
			requestSuccess.setRsn("Data got inserted into DataBase");
			requestSuccess.setCustomCode("200");
			messageHeader.setSuccess(requestSuccess);
			genericResponse.setMsgHeader(messageHeader);
	    }
				else{
					MessageHeader messageHeader=new MessageHeader();
					RequestError requestError=new RequestError();
					requestError.setRsn("requested app id is not present , please pass another id");
					requestError.setCustomCode("ERR404");
					requestError.setCd("404");
					messageHeader.setError(requestError);
					genericResponse.setMsgHeader(messageHeader);
					throw new RMIdNotFoundException("requested app id is not present , please pass another id");
				}
		}
		else{
			MessageHeader messageHeader=new MessageHeader();
			RequestError requestError=new RequestError();
			requestError.setRsn("requested RM user is not present for the given id , please pass another RM userid");
			requestError.setCustomCode("ERR404");
			requestError.setCd("404");
			messageHeader.setError(requestError);
			genericResponse.setMsgHeader(messageHeader);
			throw new IdNotFoundException("Provided Rm user id is not present, please pass another Rm user id");
		}
	}catch(IdNotFoundException exceptionMessage){
		System.out.println(" Exception got : "+exceptionMessage);
	}
		catch(RMIdNotFoundException exceptionMessage){
			System.out.println(" Exception got : "+exceptionMessage);
		}
		return genericResponse;
	}
}
