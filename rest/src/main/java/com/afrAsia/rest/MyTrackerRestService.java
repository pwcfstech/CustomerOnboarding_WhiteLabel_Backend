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

import com.afrAsia.entities.request.RmApplicationAppReq;
import com.afrAsia.entities.response.RmApplicationAppResponse;
import com.afrAsia.service.RmApplicationsAppService;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
@Path("{version}")
public class MyTrackerRestService {

	private static final Logger logger = LoggerFactory.getLogger(MyTrackerRestService.class);

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

	@POST
	@Path("/getRmApplicationsApp/")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response getDetailsByNameAndID(String jsonInput) {

		RmApplicationAppReq rmApplicationAppReq = new RmApplicationAppReq();

		ObjectMapper mapper = new ObjectMapper();
		try {
			rmApplicationAppReq = mapper.readValue(jsonInput, RmApplicationAppReq.class);
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String idFromRequest=rmApplicationAppReq.getSearchParameter().getRmId();
		
		String custumerName=rmApplicationAppReq.getSearchParameter().getCustName();
		
		this.startDate = rmApplicationAppReq.getSearchParameter().getStartDate();
		System.out.println("start date in rest ======"+this.startDate);
		this.endDate = rmApplicationAppReq.getSearchParameter().getEndDate();
		System.out.println(" end date in rest ------"+this.endDate);
		String status=rmApplicationAppReq.getSearchParameter().getAppStatus();
		
		
		

		if (idFromRequest.length() != 0 && custumerName.length() == 0 && this.startDate != null && this.endDate != null && status.length() == 0) {
			
			System.out.println(" start and end dates are not null........................");
			System.out.println("fetching datas by dates ...............");
			
			RmApplicationAppResponse rmApplicationAppResponseByDates=
					(RmApplicationAppResponse) rmApplicationsAppService
					.getDetailsByDates(this.startDate, this.endDate, idFromRequest);
			return Response.ok(rmApplicationAppResponseByDates, MediaType.APPLICATION_JSON).build();
		}

		else if (idFromRequest.length() != 0 && custumerName.length() != 0 && this.startDate == null && this.endDate == null && status.length() == 0) {
			
			System.out.println(" cusomerName is not null........................");
			System.out.println("fetching datas by cusomerName ...............");
			RmApplicationAppResponse rmApplicationAppResponseByIdAndName = 
					(RmApplicationAppResponse) rmApplicationsAppService
					.getDetailsByName(custumerName,idFromRequest);
			return Response.ok(rmApplicationAppResponseByIdAndName, MediaType.APPLICATION_JSON).build();
		}

		else if (idFromRequest.length() != 0 && custumerName.length() == 0 && this.startDate == null && this.endDate == null && status.length() != 0) {
			
			System.out.println(" only status is not null........................");
			System.out.println("fetching datas by status ...............");
			RmApplicationAppResponse rmApplicationAppResponseByStatus = (
					RmApplicationAppResponse) rmApplicationsAppService
					.getDetailsByStatus(status,idFromRequest); 
			return Response.ok(rmApplicationAppResponseByStatus, MediaType.APPLICATION_JSON).build();
		}

		else if (idFromRequest.length() != 0 && custumerName.length() == 0 && this.startDate == null && this.endDate == null && status.length() == 0) {
			
			System.out.println(" all inputs are null........................");
			System.out.println("fetching datas by default 10 entries ...............");
			
			RmApplicationAppResponse rmApplicationAppResponseByStatus = 
					(RmApplicationAppResponse) rmApplicationsAppService.getDetailsByefault(idFromRequest);
			return Response.ok(rmApplicationAppResponseByStatus, MediaType.APPLICATION_JSON).build();
		}
		
		else if (idFromRequest.length() != 0 && custumerName.length() != 0 && this.startDate != null && this.endDate != null && status.length() == 0) {
			
			System.out.println(" AllCriteriaWithoutStatus , only status null ........................");

			RmApplicationAppResponse rmApplicationAppResponseByIdAndName = 
					(RmApplicationAppResponse) rmApplicationsAppService
					.getDetailsByAllCriteriaWithoutStatus(custumerName,startDate, endDate, idFromRequest);
			return Response.ok(rmApplicationAppResponseByIdAndName, MediaType.APPLICATION_JSON).build();
		}

		else if (idFromRequest.length() != 0 && custumerName.length() != 0 && this.startDate != null && this.endDate != null && status.length() != 0) {
			
			System.out.println(" cusomerName is not null........................");
			System.out.println("fetching datas by cusomerName ...............");
			RmApplicationAppResponse rmApplicationAppResponseByIdAndName = 
					(RmApplicationAppResponse) rmApplicationsAppService
					.getDetailsByAllCriteriaWithStatus(custumerName,startDate, endDate, idFromRequest, status);
			return Response.ok(rmApplicationAppResponseByIdAndName, MediaType.APPLICATION_JSON).build();
		}


		else {
			RmApplicationAppResponse emptyResponse = new RmApplicationAppResponse();
			emptyResponse.setMessageHeader(null);
			emptyResponse.setApps(null);
			System.out.println("please pass something in the request ........ ");
			return Response.ok(emptyResponse, MediaType.APPLICATION_JSON).build(); 
		}

	}

}
