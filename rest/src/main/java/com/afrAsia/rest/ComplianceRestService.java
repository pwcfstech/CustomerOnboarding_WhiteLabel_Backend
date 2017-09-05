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

import com.afrAsia.entities.request.ComplianceReq;
import com.afrAsia.entities.response.ComplianceResponse;
import com.afrAsia.entities.response.MessageHeader;
import com.afrAsia.entities.response.RequestError;
import com.afrAsia.service.ComplianceService;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
@Path("{version}")
public class ComplianceRestService {

	final static Logger debugLog = Logger.getLogger("debugLogger");
	final static Logger infoLog = Logger.getLogger("infoLogger");
	final static Logger errorLog = Logger.getLogger("errorLogger");

	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
	Date startDate;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
	Date endDate;
	

	private ComplianceService complianceService;
	
	public ComplianceService getComplianceService() {
		return complianceService;
	}

	public void setComplianceService(ComplianceService complianceService) {
		this.complianceService = complianceService;
	}
	
	@POST
	@Path("/getComplianceApplications/")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response getDetailsByNameAndID(String jsonInput) {

		infoLog.info("jsonInput in getDetailsByNameAndID(),ComplianceRestService.java "+jsonInput);
		
		ComplianceReq complianceReq = new ComplianceReq();

		ObjectMapper mapper = new ObjectMapper();
		try {
			complianceReq = mapper.readValue(jsonInput, ComplianceReq.class);
		} catch (JsonParseException e) {
			e.printStackTrace();
			errorLog.error("   JsonParseException in getDetailsByNameAndID(),ComplianceRestService.java ",e);
		} catch (JsonMappingException e) {
			errorLog.error("   JsonMappingException in getDetailsByNameAndID(),ComplianceRestService.java ",e);
			e.printStackTrace();
		} catch (IOException e) {
			errorLog.error("   IOException in getDetailsByNameAndID(),ComplianceRestService.java "+e.getMessage());
			e.printStackTrace();
		}
		
		String custumerName=complianceReq.getSearchParameter().getCustName();
		
		this.startDate = complianceReq.getSearchParameter().getStartDate();
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
		
		this.endDate = complianceReq.getSearchParameter().getEndDate();
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
		
		String status=complianceReq.getSearchParameter().getAppStatus();
		
		
		if (custumerName.length() == 0 && this.startDate == null && this.endDate == null) {
			
			ComplianceResponse complianceResponseByDefault = 
					(ComplianceResponse) complianceService.getDetailsBydefault();
			infoLog.info("   complianceResponseByDefault in ComplianceRestService.java "+complianceResponseByDefault);
			return Response.ok(complianceResponseByDefault, MediaType.APPLICATION_JSON).build();
		}
		
		else if (custumerName.length() != 0 && this.startDate == null && this.endDate == null && status.length() != 0) {
			
			ComplianceResponse rmApplicationAppResponseByIdAndName = 
					(ComplianceResponse) complianceService
					.getDetailsByName(custumerName,status);
			infoLog.info("   rmApplicationAppResponseByIdAndName in ComplianceRestService.java "+rmApplicationAppResponseByIdAndName);
			return Response.ok(rmApplicationAppResponseByIdAndName, MediaType.APPLICATION_JSON).build();
		}

		else if (custumerName.length() == 0 && this.startDate != null && this.endDate != null && status.length() != 0) {
			
			ComplianceResponse rmApplicationAppResponseByDates=
					(ComplianceResponse) complianceService
					.getDetailsByDates(this.startDate, this.endDate, status);
			infoLog.info("   rmApplicationAppResponseByDates in ComplianceRestService.java "+rmApplicationAppResponseByDates);
			return Response.ok(rmApplicationAppResponseByDates, MediaType.APPLICATION_JSON).build();
		}

		else if (custumerName.length() != 0 && this.startDate != null && this.endDate != null && status.length() != 0) {
			
			ComplianceResponse rmApplicationAppResponseByIdAndName = 
					(ComplianceResponse) complianceService
					.getDetailsByAllCriteria(custumerName,startDate, endDate, status);
			infoLog.info("   rmApplicationAppResponseByIdAndName in ComplianceRestService.java "+rmApplicationAppResponseByIdAndName);
			return Response.ok(rmApplicationAppResponseByIdAndName, MediaType.APPLICATION_JSON).build();
		}

		else if((custumerName.length() != 0 && this.startDate == null && this.endDate == null && status.length() == 0)
				|| (custumerName.length() == 0 && this.startDate != null && this.endDate == null && status.length() == 0)
				|| (custumerName.length() == 0 && this.startDate == null && this.endDate != null && status.length() == 0)
				|| (custumerName.length() != 0 && this.startDate != null && this.endDate == null && status.length() == 0)
				|| (custumerName.length() != 0 && this.startDate == null && this.endDate != null && status.length() == 0)
				|| (custumerName.length() != 0 && this.startDate != null && this.endDate != null && status.length() == 0)){
			ComplianceResponse emptyComplianceResponse = new ComplianceResponse();
			MessageHeader messageHeader=new MessageHeader();
			RequestError requestError=new RequestError();
			requestError.setCustomCode("please pass status");
			messageHeader.setError(requestError);
			errorLog.error("status has not been passed in the request");
			errorLog.error(" emptyComplianceResponse in ComplianceRestService.java "+emptyComplianceResponse);
			return Response.ok(emptyComplianceResponse, MediaType.APPLICATION_JSON).build(); 
		}
		else{
			ComplianceResponse emptyComplianceResponse = new ComplianceResponse();
			MessageHeader messageHeader=new MessageHeader();
			RequestError requestError=new RequestError();
			requestError.setCustomCode("please pass proper request");
			messageHeader.setError(requestError);
			errorLog.error("please pass proper request");
			errorLog.error(" emptyComplianceResponse in ComplianceRestService.java "+emptyComplianceResponse);
			return Response.ok(emptyComplianceResponse, MediaType.APPLICATION_JSON).build();
		}
	}

}
