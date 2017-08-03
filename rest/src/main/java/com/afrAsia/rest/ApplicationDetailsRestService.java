package com.afrAsia.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Component;

import com.afrAsia.entities.jpa.MsgHeader;
import com.afrAsia.entities.jpa.MsgHeader.Error;
import com.afrAsia.service.ApplicationDetailsService;
import com.afrAsia.entities.request.ApplicationDetailsReq;
import com.afrAsia.entities.response.ApplicationDetailsResponse;


//import com.afrAsia.entities.jpa.AppVersion;
//import com.afrAsia.entities.jpa.DeviceFootPrint;
//import com.afrAsia.entities.jpa.MsgHeader;
//import com.afrAsia.entities.request.DeviceFootPrintReq;
//import com.afrAsia.entities.response.DeviceFootPrintResponse;
//import com.afrAsia.entities.response.DeviceFootPrintResponse.Data;
//import com.afrAsia.service.AppVersionService;

@Component

@Path("{version}")
public class ApplicationDetailsRestService {
	private ApplicationDetailsService applicationDetailsService;

	public ApplicationDetailsService getApplicationDetailsService() {
		return applicationDetailsService;
	}

	public void setApplicationDetailsService(ApplicationDetailsService applicationDetailsService) {
		this.applicationDetailsService = applicationDetailsService;
	}

	@POST
	@Path("/getApplicationDetails")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response getApplicationDetails(ApplicationDetailsReq applicationDetailsReq) {
		ApplicationDetailsResponse applicationDetailsResponse = new ApplicationDetailsResponse();
		MsgHeader msgHeader= new MsgHeader();
		System.out.println(applicationDetailsReq.toString());
		System.out.println("here in rest Service");
		try{
			if (validateRequest(applicationDetailsReq)) {
				applicationDetailsResponse = applicationDetailsService.getApplicationDetails(applicationDetailsReq);
				
				if (applicationDetailsResponse!=null) {
					return Response.ok(applicationDetailsResponse, MediaType.APPLICATION_JSON).build();
				}
				else{
					Error error = new MsgHeader(). new Error();
					error.setCd("404");
					error.setRsn("No data for this application reference no.");
					msgHeader.setError(error);
					applicationDetailsResponse = new ApplicationDetailsResponse();
					applicationDetailsResponse.setMsgHeader(msgHeader);
					return Response.ok(applicationDetailsResponse, MediaType.APPLICATION_JSON).build();
				}
			}
			else{
				System.out.println("Invalid request");
				Error error = new MsgHeader(). new Error();
				error.setCd("404");
				error.setRsn("Invalid Request");
				msgHeader.setError(error);
				applicationDetailsResponse.setMsgHeader(msgHeader);
				return Response.ok(applicationDetailsResponse, MediaType.APPLICATION_JSON).build();	
			}
		}catch(Exception e){
			e.printStackTrace();
			Error error = new MsgHeader(). new Error();
			error.setCd("404");
			error.setRsn("Sorry, there was an error while getting application details. Please try again later.");
			msgHeader.setError(error);
			applicationDetailsResponse.setMsgHeader(msgHeader);
			return Response.ok(applicationDetailsResponse, MediaType.APPLICATION_JSON).build();
		}
	}
	

	private boolean validateRequest(ApplicationDetailsReq applicationDetailsReq) {
		if (applicationDetailsReq != null && applicationDetailsReq.getData() != null){
			return true;
		} else {
			System.out.println("Invalid Request from Get Application Details ");
			return false;
		}
	}
}
