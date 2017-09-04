package com.afrAsia.rest;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.afrAsia.entities.request.RmApplicationAppReq;
import com.afrAsia.entities.response.MessageHeader;
import com.afrAsia.entities.response.RequestError;
import com.afrAsia.entities.response.RmApplicationAppResponse;
import com.afrAsia.service.RmApplicationsAppService;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
@Path("{version}")
public class MyTrackerRestService {

	
	final static Logger debugLog = Logger.getLogger("debugLogger");
	final static Logger infoLog = Logger.getLogger("infoLogger");
	final static Logger errorLog = Logger.getLogger("errorLogger");
    
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
	Date startDate;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
	Date endDate;
	

	private RmApplicationsAppService rmApplicationsAppService;
	
	public RmApplicationsAppService getRmApplicationsAppService() {
		return rmApplicationsAppService;
	}

	public void setRmApplicationsAppService(RmApplicationsAppService rmApplicationsAppService) {
		this.rmApplicationsAppService = rmApplicationsAppService;
	}

	static{
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
	}
	
	@POST
	@Path("/getRmApplicationsApp/")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response getDetailsByNameAndID(String jsonInput) {

		infoLog.info(" id from Request in getDetailsByNameAndID(),MyTrackerRestService.java is : "+jsonInput);
		
		RmApplicationAppReq rmApplicationAppReq = new RmApplicationAppReq();

		ObjectMapper mapper = new ObjectMapper();
		try {
			rmApplicationAppReq = mapper.readValue(jsonInput, RmApplicationAppReq.class);
		} catch (JsonParseException e) {
			errorLog.error(" JsonParseException : ",e);
			e.printStackTrace();
		} catch (JsonMappingException e) {
			errorLog.error(" JsonMappingException : ",e);
			e.printStackTrace();
		} catch (IOException e) {
			errorLog.error(" IOException : ",e);
			e.printStackTrace();
		}
		
		// RmId from request	
		String idFromRequest=rmApplicationAppReq.getSearchParameter().getRmId();

		// customer name from request	
		String custumerName=rmApplicationAppReq.getSearchParameter().getCustName();
		
		// start date from request 	
		this.startDate = rmApplicationAppReq.getSearchParameter().getStartDate();
		
		if(this.startDate!=null){
		SimpleDateFormat simpleDateFormatStartDate = new SimpleDateFormat("dd-MM-yyyy");			
		String formattedStartDate = simpleDateFormatStartDate.format(this.startDate);
		
		Date dateSt1 = new Date();

		try {
			dateSt1 = simpleDateFormatStartDate.parse(formattedStartDate);
		} catch (ParseException e1) {
			errorLog.error("   date coud not be parsed in getDetailsByNameAndID method of MyTrackerRestService class ",e1);
		}
		this.startDate=dateSt1;
		}
		
		// end date from request 
		this.endDate = rmApplicationAppReq.getSearchParameter().getEndDate();
		
		if(this.endDate!=null){
		SimpleDateFormat simpleDateFormatStartEnd = new SimpleDateFormat("dd-MM-yyyy");
		String formattedStartEnd = simpleDateFormatStartEnd.format(this.endDate);
		
		Date dateEd1 = new Date();
		try {
			dateEd1 = simpleDateFormatStartEnd.parse(formattedStartEnd);
		} catch (ParseException e) {
			errorLog.error("   date can not be parsed in ");
		}
		
		Long miliSecs=dateEd1.getTime();
		dateEd1 = new Date(miliSecs+86399000L);
		this.endDate=dateEd1;
		}
		
		//	status from request 	
		String status=rmApplicationAppReq.getSearchParameter().getAppStatus();

		if (idFromRequest.length() != 0 && custumerName.length() == 0 && this.startDate != null && this.endDate != null && status.length() == 0) {
			infoLog.info(" Data will be fetched by RmId,startdate and end date ");
			RmApplicationAppResponse rmApplicationAppResponseByDates=
					(RmApplicationAppResponse) rmApplicationsAppService
					.getDetailsByDates(this.startDate, this.endDate, idFromRequest);
			infoLog.info(" rmApplicationAppResponseByDates in MyTrackerRestService.java is : "+rmApplicationAppResponseByDates);
			return Response.ok(rmApplicationAppResponseByDates, MediaType.APPLICATION_JSON).build();
		}

		else if (idFromRequest.length() != 0 && custumerName.length() != 0 && this.startDate == null && this.endDate == null && status.length() == 0) {
			infoLog.info(" Data will be fetched by RmId,customer name ");
			RmApplicationAppResponse rmApplicationAppResponseByIdAndName = 
					(RmApplicationAppResponse) rmApplicationsAppService
					.getDetailsByName(custumerName,idFromRequest);
			infoLog.info(" rmApplicationAppResponseByDates in MyTrackerRestService.java is : "+rmApplicationAppResponseByIdAndName);
			return Response.ok(rmApplicationAppResponseByIdAndName, MediaType.APPLICATION_JSON).build();
		}

		else if (idFromRequest.length() != 0 && custumerName.length() == 0 && this.startDate == null && this.endDate == null && status.length() != 0) {
			infoLog.info(" Data will be fetched by RmId,status ");
			RmApplicationAppResponse rmApplicationAppResponseByStatus = (
					RmApplicationAppResponse) rmApplicationsAppService
					.getDetailsByStatus(status,idFromRequest); 
			infoLog.info(" rmApplicationAppResponseByStatus in MyTrackerRestService.java is : "+rmApplicationAppResponseByStatus);
			return Response.ok(rmApplicationAppResponseByStatus, MediaType.APPLICATION_JSON).build();
		}

		else if (idFromRequest.length() != 0 && custumerName.length() == 0 && this.startDate == null && this.endDate == null && status.length() == 0) {
			infoLog.info(" Data will be fetched by RmId, default search ");
			RmApplicationAppResponse rmApplicationAppResponseByStatus = 
					(RmApplicationAppResponse) rmApplicationsAppService.getDetailsByefault(idFromRequest);
			infoLog.info(" rmApplicationAppResponseByStatus in MyTrackerRestService.java is : "+rmApplicationAppResponseByStatus);
			return Response.ok(rmApplicationAppResponseByStatus, MediaType.APPLICATION_JSON).build();
		}
		
		else if (idFromRequest.length() != 0 && custumerName.length() != 0 && this.startDate != null && this.endDate != null && status.length() == 0) {
			infoLog.info(" Data will be fetched by RmId, custumerName, startDate, endDate ");
			RmApplicationAppResponse rmApplicationAppResponseByIdAndName = 
					(RmApplicationAppResponse) rmApplicationsAppService
					.getDetailsByAllCriteriaWithoutStatus(custumerName,this.startDate, this.endDate, idFromRequest);
			infoLog.info(" rmApplicationAppResponseByIdAndName in MyTrackerRestService.java is : "+rmApplicationAppResponseByIdAndName);
			return Response.ok(rmApplicationAppResponseByIdAndName, MediaType.APPLICATION_JSON).build();
		}

		else if (idFromRequest.length() != 0 && custumerName.length() != 0 && this.startDate != null && this.endDate != null && status.length() != 0) {
			infoLog.info(" Data will be fetched by RmId, custumerName, startDate, endDate,status ");
			RmApplicationAppResponse rmApplicationAppResponseByIdAndName = 
					(RmApplicationAppResponse) rmApplicationsAppService
					.getDetailsByAllCriteriaWithStatus(custumerName,this.startDate, this.endDate, idFromRequest, status);
			infoLog.info(" rmApplicationAppResponseByIdAndName in MyTrackerRestService.java is : "+rmApplicationAppResponseByIdAndName);
			return Response.ok(rmApplicationAppResponseByIdAndName, MediaType.APPLICATION_JSON).build();
		}

		else {
			infoLog.info(" RmId is not provided in the request ");
			RmApplicationAppResponse emptyResponse = new RmApplicationAppResponse();
			MessageHeader messageHeader=new MessageHeader();
			RequestError requestError=new RequestError();
			requestError.setRsn("RmId is not provided in the request");
			messageHeader.setError(requestError); 
			emptyResponse.setMessageHeader(messageHeader);
			infoLog.info(" emptyResponse in MyTrackerRestService.java is : "+emptyResponse);
			return Response.ok(emptyResponse, MediaType.APPLICATION_JSON).build(); 
		}

	}

}
