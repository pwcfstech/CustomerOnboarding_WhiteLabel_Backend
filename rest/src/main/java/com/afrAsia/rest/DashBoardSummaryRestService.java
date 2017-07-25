package com.afrAsia.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.afrAsia.entities.response.DashboardResponse;
import com.afrAsia.service.DashBoardService;

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

	@GET
	@Path("/getRmDashboardSummaryApp")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAppversion() {
		DashboardResponse dashboardResponse = null;

		if (dashBoardService.getDashBoardSummery() == null) {

			dashboardResponse = null;
		} else {
			dashboardResponse = dashBoardService.getDashBoardSummery();
		}
		return Response.ok(dashboardResponse, MediaType.APPLICATION_JSON).build();

	}

}
