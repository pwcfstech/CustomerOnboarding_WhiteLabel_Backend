package com.afrAsia.rest;

import java.io.IOException;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.afrAsia.entities.request.DashboardRequest;
import com.afrAsia.entities.response.DashboardResponse;
import com.afrAsia.service.DashBoardService;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
@Path("{version}")
public class DashBoardSummaryRestService {

	final static Logger debugLog = Logger.getLogger("debugLogger");
	final static Logger infoLog = Logger.getLogger("infoLogger");
	final static Logger errorLog = Logger.getLogger("errorLogger");

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

		infoLog.info(" jsonInput from Request in DashBoardSummaryRestService is : " + jsonInput);

		DashboardRequest dashboardRequest = new DashboardRequest();

		ObjectMapper mapper = new ObjectMapper();
		try {
			dashboardRequest = mapper.readValue(jsonInput, DashboardRequest.class);
		} catch (JsonParseException e) {
			errorLog.error(" JsonParseException : " + e.getMessage());
			e.printStackTrace();
		} catch (JsonMappingException e) {
			errorLog.error(" JsonMappingException : " + e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			errorLog.error(" IOException : " + e.getMessage());
			e.printStackTrace();
		}

		String rmId = dashboardRequest.getRmId().toString();

		DashboardResponse dashboardResponse = null;

		if (dashBoardService.getDashBoardSummery(rmId) == null
				|| dashBoardService.getDashBoardSummery(rmId).equals(null)) {
			infoLog.info(" dashboardResponse is null : ");
			dashboardResponse = null;
		} else {
			dashboardResponse = dashBoardService.getDashBoardSummery(rmId);
		}
		infoLog.info(" dashboardResponse : " + dashboardResponse);
		return Response.ok(dashboardResponse, MediaType.APPLICATION_JSON).build();
	}
}
