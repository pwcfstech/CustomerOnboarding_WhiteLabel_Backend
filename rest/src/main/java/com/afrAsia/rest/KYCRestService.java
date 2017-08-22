package com.afrAsia.rest;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.xml.bind.DatatypeConverter;

import org.glassfish.jersey.media.multipart.FormDataParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.afrAsia.CommonUtils;
import com.afrAsia.entities.request.KYCDataRequest;
import com.afrAsia.entities.request.KYCRequest;
import com.afrAsia.entities.response.KYCDataResponse;
import com.afrAsia.entities.response.KYCResponse;
import com.afrAsia.entities.response.MessageHeader;
import com.afrAsia.entities.response.RequestError;
import com.afrAsia.service.KYCService;

/**
 * Defines the skeleton for upload KYC service
 * 
 * @author mds012
 *
 */
@Component
@Path("{version}")
public class KYCRestService {
	private static final Logger logger = LoggerFactory.getLogger(KYCRestService.class);

	private KYCService kycService;

	public KYCService getKycService() {
		return kycService;
	}

	public void setKycService(KYCService kycService) {
		this.kycService = kycService;
	}

	@POST
	@Path("/uploadKYC1")
	@Consumes(MediaType.MULTIPART_FORM_DATA)
	@Produces(MediaType.APPLICATION_JSON)
	public Response uploadKYC1(@FormDataParam("data") String request, @FormDataParam("file") InputStream image) {
		KYCResponse response = null;
		try {
			KYCDataRequest kycDataRequest = CommonUtils.jsonStringToObject(request, KYCDataRequest.class);
			if (logger.isDebugEnabled()) {
				logger.debug("Enter : uploadKYC()");
			}
			System.out.println("Enter : uploadKYC()"); 
			response = kycService.uploadKYC(kycDataRequest, image);
		} catch (Exception e) {
			logger.error("Error : uploadKYC()", e);
			MessageHeader msgHeader = new MessageHeader();
			RequestError error = new RequestError();
			error.setCd("401");
			error.setCustomCode("ERR401");
			error.setRsn("KYC upload failed.");
			msgHeader.setError(error);

			response = new KYCResponse();
			response.setMsgHeader(msgHeader);
			response.setData(null);
			if (logger.isDebugEnabled()) {
				logger.info("Exit : uploadKYC()");
			}
			System.out.println("Error : uploadKYC()"+ e); 
			return Response.status(Status.FORBIDDEN).entity(response).build();
		}
		if (logger.isDebugEnabled()) {
			logger.info("Exit : uploadKYC()");
		}
		System.out.println("Exit : uploadKYC()"); 
		return Response.ok(response).build();
	}
	
	@POST
	@Path("/uploadKYC2")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response uploadKYC2(KYCRequest kycRequest) {
		KYCResponse response = null;
		try {
			if (logger.isDebugEnabled()) {
				logger.debug("Enter : uploadKYC()");
			}
			System.out.println("Enter : uploadKYC()");
			if (null != kycRequest) {
				byte[] imageBytes = DatatypeConverter.parseBase64Binary(kycRequest.getData().getImage());
				InputStream image = new ByteArrayInputStream(imageBytes);
				System.out.println("kycService : " + kycService);
				response = kycService.uploadKYC(kycRequest.getData(), image);
			} else {
				response = new KYCResponse();
				KYCDataResponse data = new KYCDataResponse();
				data.setSuccess("0");
				response.setData(data);

				MessageHeader msgHeader = new MessageHeader();
				RequestError error = new RequestError();
				error.setCd("001");
				error.setCustomCode("ERR001");
				error.setRsn("Invalid request for KYC upload.");
				msgHeader.setError(error);
				response.setMsgHeader(msgHeader);
			}

		} catch (Exception e) {
			logger.error("Error : uploadKYC()", e);
			e.printStackTrace();
			MessageHeader msgHeader = new MessageHeader();
			RequestError error = new RequestError();
			error.setCd("401");
			error.setCustomCode("ERR401");
			error.setRsn("KYC upload failed.");
			msgHeader.setError(error);

			response = new KYCResponse();
			response.setMsgHeader(msgHeader);
			response.setData(null);
			if (logger.isDebugEnabled()) {
				logger.info("Exit : uploadKYC()");
			}
			System.out.println("Error : uploadKYC()" + e);
			return Response.status(Status.FORBIDDEN).entity(response).build();
		}
		if (logger.isDebugEnabled()) {
			logger.info("Exit : uploadKYC()");
		}
		System.out.println("Exit : uploadKYC()");
		return Response.ok(response).build();
	}
	
}