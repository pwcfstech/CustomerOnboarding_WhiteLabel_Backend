package com.afrAsia.rest;

import java.io.IOException;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.afrAsia.entities.request.DashboardRequest;
import com.afrAsia.entities.request.RmApplicationAppReq;
import com.afrAsia.entities.response.DashboardResponse;
import com.afrAsia.service.DashBoardService;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
@Path("{version}")
public class DashBoardSummaryRestService {

	private static final Logger logger = LoggerFactory.getLogger(DashBoardSummaryRestService.class);

	private DashBoardService dashBoardService;

	public DashBoardService getDashBoardService() {
		return dashBoardService; 
	}

	public void setDashBoardService(DashBoardService dashBoardService) {
		this.dashBoardService = dashBoardService;
	}

	@POST
	@Path("/getRmDashboardSummaryApp")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAppversion(String jsonInput) {
		
		DashboardRequest dashboardRequest=new DashboardRequest();
		
		ObjectMapper mapper = new ObjectMapper();
		try {
			dashboardRequest = mapper.readValue(jsonInput, DashboardRequest.class);
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String rmId=dashboardRequest.getRmId().toString();
		
		System.out.println("rmID is ===================== "+rmId);
		
		DashboardResponse dashboardResponse = null;

		if (dashBoardService.getDashBoardSummery(rmId) == null || dashBoardService.getDashBoardSummery(rmId).equals(null)) {

			dashboardResponse = null;
		} else {
			dashboardResponse = dashBoardService.getDashBoardSummery(rmId);
		}
		return Response.ok(dashboardResponse, MediaType.APPLICATION_JSON).build();

	}

}
