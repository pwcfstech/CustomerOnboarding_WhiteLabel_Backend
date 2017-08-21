package com.afrAsia.rest;

import java.io.IOException;
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


	@POST
	@Path("/getComplianceApplications/")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response getDetailsByNameAndID(String jsonInput) {

		ComplianceReq complianceReq = new ComplianceReq();

		ObjectMapper mapper = new ObjectMapper();
		try {
			complianceReq = mapper.readValue(jsonInput, ComplianceReq.class);
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String custumerName=complianceReq.getSearchParameter().getCustName();
		System.out.println("customer name is ========== "+custumerName);
		this.startDate = complianceReq.getSearchParameter().getStartDate();
		System.out.println("start date in rest ======"+this.startDate);
		this.endDate = complianceReq.getSearchParameter().getEndDate();
		System.out.println(" end date in rest ------"+this.endDate);
		String status=complianceReq.getSearchParameter().getAppStatus();
		
		
		
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
			
			System.out.println("StartDate : "+startDate+"endDate : "+endDate+"status : "+status);
			System.out.println("fetching datas by dates ...............");
			
			ComplianceResponse rmApplicationAppResponseByDates=
					(ComplianceResponse) complianceService
					.getDetailsByDates(startDate, endDate, status);
			return Response.ok(rmApplicationAppResponseByDates, MediaType.APPLICATION_JSON).build();
		}

		else if (custumerName.length() != 0 && this.startDate != null && this.endDate != null && status.length() != 0) {
			
			System.out.println(" AllCriteria , ........................");
			System.out.println("custumerName : "+custumerName+"startDate : "+startDate+""
								+ "endDate : "+endDate+"status : "+status );
			
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
