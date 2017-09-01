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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.afrAsia.entities.request.ComplianceReq;
import com.afrAsia.entities.response.ComplianceResponse;
import com.afrAsia.entities.response.MessageHeader;
import com.afrAsia.entities.response.RequestError;
import com.afrAsia.entities.response.RmApplicationAppResponse;
import com.afrAsia.service.ComplianceService;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
@Path("{version}")
public class ComplianceRestService {

	private static final Logger logger = LoggerFactory.getLogger(ComplianceRestService.class);

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
	
	static{
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		System.setProperty("currentDate", dateFormat.format(new Date()));
	}

	@POST
	@Path("/getComplianceApplications/")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response getDetailsByNameAndID(String jsonInput) {

		logger.info("############   jsonInput in getDetailsByNameAndID(),ComplianceRestService.java "+jsonInput);
		
		ComplianceReq complianceReq = new ComplianceReq();

		ObjectMapper mapper = new ObjectMapper();
		try {
			complianceReq = mapper.readValue(jsonInput, ComplianceReq.class);
		} catch (JsonParseException e) {
			e.printStackTrace();
			logger.error("############   JsonParseException in getDetailsByNameAndID(),ComplianceRestService.java ",e);
		} catch (JsonMappingException e) {
			logger.error("############   JsonMappingException in getDetailsByNameAndID(),ComplianceRestService.java ",e);
			e.printStackTrace();
		} catch (IOException e) {
			logger.error("############   IOException in getDetailsByNameAndID(),ComplianceRestService.java "+e.getMessage());
			e.printStackTrace();
		}
		
		String custumerName=complianceReq.getSearchParameter().getCustName();
		
		this.startDate = complianceReq.getSearchParameter().getStartDate();
		if(this.startDate!=null){
			System.out.println("############# this.startDate is not null "+this.startDate);
			SimpleDateFormat simpleDateFormatStartDate = new SimpleDateFormat("dd-MM-yyyy");			
			String formattedStartDate = simpleDateFormatStartDate.format(this.startDate);
			System.out.println("########## formattedStartDate : "+formattedStartDate);
			
			Date dateSt1 = new Date();

			try {
				dateSt1 = simpleDateFormatStartDate.parse(formattedStartDate);
				System.out.println("########## dateSt1 : "+dateSt1);
			} catch (ParseException e1) {
				System.out.println("date coud not be parsed in getDetailsByNameAndID method of MyTrackerRestService class");
				logger.error("############   date coud not be parsed in getDetailsByNameAndID method of MyTrackerRestService class ",e1);
			}
			this.startDate=dateSt1;
			System.out.println("################### this.startDate after parsing : "+this.startDate);
			}
		
		this.endDate = complianceReq.getSearchParameter().getEndDate();
		if(this.endDate!=null){
			System.out.println("############# this.endDate is not null "+this.endDate);
			SimpleDateFormat simpleDateFormatStartEnd = new SimpleDateFormat("dd-MM-yyyy");
			String formattedStartEnd = simpleDateFormatStartEnd.format(this.endDate);
			System.out.println("############ formattedStartEnd : "+formattedStartEnd);
			Date dateEd1 = new Date();
			try {
				dateEd1 = simpleDateFormatStartEnd.parse(formattedStartEnd);
				System.out.println("################ dateEd1 : "+dateEd1);
			} catch (ParseException e) {
				System.out.println("date can not be parsed");
				logger.error("############   date can not be parsed in ");
			}
			
			Long miliSecs=dateEd1.getTime();
			dateEd1 = new Date(miliSecs+86399000L);
			this.endDate=dateEd1;
			System.out.println("################### this.endDate after parsing : "+this.endDate);
			}
		
		String status=complianceReq.getSearchParameter().getAppStatus();
		System.out.println("################## status : "+status);
		
		
		if (custumerName.length() == 0 && this.startDate == null && this.endDate == null) {
			
			System.out.println("status : "+status);
			System.out.println("fetching datas by default ...............");
			
			ComplianceResponse complianceResponseByDefault = 
					(ComplianceResponse) complianceService.getDetailsBydefault();
			return Response.ok(complianceResponseByDefault, MediaType.APPLICATION_JSON).build();
		}
		
		else if (custumerName.length() != 0 && this.startDate == null && this.endDate == null && status.length() != 0) {
			
			System.out.println(" cusomerName : "+custumerName+"status : "+status);
			System.out.println("fetching datas by cusomerName ...............");
			ComplianceResponse rmApplicationAppResponseByIdAndName = 
					(ComplianceResponse) complianceService
					.getDetailsByName(custumerName,status);
			return Response.ok(rmApplicationAppResponseByIdAndName, MediaType.APPLICATION_JSON).build();
		}

		else if (custumerName.length() == 0 && this.startDate != null && this.endDate != null && status.length() != 0) {
			
			System.out.println("StartDate : "+this.startDate+"endDate : "+this.endDate+"status : "+status);
			System.out.println("fetching datas by dates ...............");
			
			ComplianceResponse rmApplicationAppResponseByDates=
					(ComplianceResponse) complianceService
					.getDetailsByDates(this.startDate, this.endDate, status);
			return Response.ok(rmApplicationAppResponseByDates, MediaType.APPLICATION_JSON).build();
		}

		else if (custumerName.length() != 0 && this.startDate != null && this.endDate != null && status.length() != 0) {
			
			System.out.println(" AllCriteria , ........................");
			System.out.println("custumerName : "+custumerName+"startDate : "+this.startDate+""
								+ "endDate : "+this.endDate+"status : "+status );
			
			ComplianceResponse rmApplicationAppResponseByIdAndName = 
					(ComplianceResponse) complianceService
					.getDetailsByAllCriteria(custumerName,startDate, endDate, status);
			return Response.ok(rmApplicationAppResponseByIdAndName, MediaType.APPLICATION_JSON).build();
		}

		else {
			System.out.println("in error ====== ");
			ComplianceResponse emptyComplianceResponse = new ComplianceResponse();
			MessageHeader messageHeader=new MessageHeader();
			RequestError requestError=new RequestError();
			requestError.setCustomCode("please pass proper values in the request");
			messageHeader.setError(requestError);
			return Response.ok(emptyComplianceResponse, MediaType.APPLICATION_JSON).build(); 
		}

	}

}
