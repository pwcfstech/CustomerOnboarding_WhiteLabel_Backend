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
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
@Path("{version}")
public class MyTrackerRestService {

	private static final Logger logger = LoggerFactory.getLogger(MyTrackerRestService.class);

	private RmApplicationsAppService rmApplicationsAppService;

	public RmApplicationsAppService getRmApplicationsAppService() {
		return rmApplicationsAppService;
	}



	public void setRmApplicationsAppService(RmApplicationsAppService rmApplicationsAppService) {
		this.rmApplicationsAppService = rmApplicationsAppService;
	}


	/*@POST
	@Path("/getRmApplicationsApp")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response getRmApplicationsApp(String jsonInput) 
	{
		
		GenericRequest req = new GenericRequest();
		ObjectMapper mapper = new ObjectMapper();
		try {
			System.out.println("jsonInput is ============="+jsonInput);
			req = mapper.readValue(jsonInput, GenericRequest.class);
			System.out.println("ProductID from req============="+req.getData().getProductID());
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("ProductID is ==============");
		String id=req.getData().getProductID(); 
		System.out.println("ProductID=============="+id);
		DashboardResponse genericResponse=dashBoardService.getDashBoardSummery();
		return Response.ok(genericResponse, MediaType.APPLICATION_JSON).build();

	}*/


/*	@POST
	@Path("/getApplicationDetails/")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response getDetailsByNameAndID(String jsonInput){
		
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
		
		Long id=rmApplicationAppReq.getSearchParameter().getId(); 
		System.out.println("reference ID=============="+id);
		String name=rmApplicationAppReq.getSearchParameter().getCustName();
		System.out.println("CustName=============="+name);
		Date startDate=rmApplicationAppReq.getSearchParameter().getStartDate();
		System.out.println("StartDate=============="+startDate);
		Date endDate=rmApplicationAppReq.getSearchParameter().getEndDate();
		System.out.println("EndDate=============="+endDate);
		String status=rmApplicationAppReq.getSearchParameter().getAppStatus();
		
		if(id==null && name.length()==0 && startDate!=null && endDate!=null && status.length()==0){
		RmApplicationAppResponse rmApplicationAppResponseByDates=rmApplicationsAppService.getDetailsByDates(startDate, endDate);
		return Response.ok(rmApplicationAppResponseByDates, MediaType.APPLICATION_JSON).build();
		}
		else if(id!=null && name.length()==0 && startDate==null && endDate==null && status.length()==0){
		RmApplicationAppResponse rmApplicationAppResponseByAppRefId=rmApplicationsAppService.getDetailsById(id);
		return Response.ok(rmApplicationAppResponseByAppRefId, MediaType.APPLICATION_JSON).build();
		}
		else if(id!=null && name.length()!=0 && startDate==null && endDate==null && status.length()==0){
		RmApplicationAppResponse rmApplicationAppResponseByIdAndName=rmApplicationsAppService.getDetailsByNameAndID(id, name);
		return Response.ok(rmApplicationAppResponseByIdAndName, MediaType.APPLICATION_JSON).build();
		}
		else if(id==null && name.length()==0 && startDate==null && endDate==null && status.length()!=0){
		RmApplicationAppResponse rmApplicationAppResponseByStatus=rmApplicationsAppService.getDetailsByStatus(status);
		return Response.ok(rmApplicationAppResponseByStatus, MediaType.APPLICATION_JSON).build();
		}
		else{
			RmApplicationAppResponse emptyResponse=rmApplicationsAppService.getDetailsByStatus(status);
			emptyResponse.setMessageHeader(null);
			emptyResponse.setApps(null);
			System.out.println("please pass something in the request ........ ");
			return Response.ok(emptyResponse, MediaType.APPLICATION_JSON).build();			
		}
		
	}*/

	
	
	/*@POST
	@Path("/getRmApplicationsApp")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public RmApplicationAppResponse getDetailsByDates(Date startDate,Date endDate){
		return null;
	}*/
	
	
	
	/*@POST
	@Path("/getRmApplicationsApp")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public RmApplicationAppResponse getDetailsById(Long id){
		return null;
	}*/

	
	
	/*@POST
	@Path("/getRmApplicationsApp")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public RmApplicationAppResponse getDetailsByStatus(String status){
		return null;
	}*/
}
