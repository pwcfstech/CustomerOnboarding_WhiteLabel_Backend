package com.afrAsia.rest;

import java.util.Date;

import javax.persistence.Column;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Component;

import com.afrAsia.CommonUtils;
import com.afrAsia.entities.jpa.RmApplication;
import com.afrAsia.entities.jpa.MsgHeader;
import com.afrAsia.service.ApplicationDetailsService;
import com.afrAsia.entities.request.ApplicationDetailsReq;
import com.afrAsia.entities.response.ApplicationDetailsResponse;
import com.afrAsia.entities.response.ApplicationDetailsResponse.Data;

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
		ApplicationDetailsResponse applicationDetailsResponse= new ApplicationDetailsResponse();
		MsgHeader msgHeader= new MsgHeader();
		Data data= new ApplicationDetailsResponse().new Data();
		System.out.println(applicationDetailsReq.toString());
		System.out.println("here in rest Service");
		try{
			if (validateRequest(applicationDetailsReq)) {
				
				Integer appRefNo = applicationDetailsReq.getData().getRefNo();
				RmApplication rmApplication = applicationDetailsService.getApplicationDetails(appRefNo);
				
				if (rmApplication!=null) {
					System.out.println("Data received from Rm Application table ");
					data.setRmId(rmApplication.getRmUserId());
					data.setRefNo(rmApplication.getApplicationId());
					data.setAppStatus(rmApplication.getAppStatus());
					data.setAppSubDate(rmApplication.getCreatedDate());
					data.setPendingRMSince(rmApplication.getModifiedDate());
					System.out.println(data.toString());
					
					applicationDetailsResponse.setData(data);
					
					return Response.ok(applicationDetailsResponse, MediaType.APPLICATION_JSON).build();
				}
				else{
					System.out.println("No data from rmApplication ");
				}
			}
			else{
				System.out.println("Invalid request");
				/*MsgHeader msgHeader= new MsgHeader();
				com.afrAsia.entities.MsgHeader.Error error = new MsgHeader().new Error();
				error.setCd("404");
				error.setRsn("invaild Request");
				msgHeader.setError(error);*/
				
				
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		//AppVersion appVersion = appVersionService.getLatestVersion("Android");
		//System.out.println(appVersion.toString());
		return Response.ok(applicationDetailsResponse, MediaType.APPLICATION_JSON).build();

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
