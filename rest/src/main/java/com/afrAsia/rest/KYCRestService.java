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

import org.apache.log4j.Logger;
import org.glassfish.jersey.media.multipart.FormDataParam;
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
	
	final static Logger debugLog = Logger.getLogger("debugLogger");
	final static Logger infoLog = Logger.getLogger("infoLogger");
	final static Logger errorLog = Logger.getLogger("errorLogger");
	
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
		infoLog.info("request in uploadKYC1(),KYCRestService is : "+request);
		KYCResponse response = null;
		try {
			KYCDataRequest kycDataRequest = CommonUtils.jsonStringToObject(request, KYCDataRequest.class);
			if (debugLog.isDebugEnabled()) {
				debugLog.debug("Enter : uploadKYC()");
			}
			debugLog.debug("Enter : uploadKYC()");
			response = kycService.uploadKYC(kycDataRequest, image);
		} catch (Exception e) {
			errorLog.error("Error : uploadKYC()", e);
			MessageHeader msgHeader = new MessageHeader();
			RequestError error = new RequestError();
			error.setCd("401");
			error.setCustomCode("ERR401");
			error.setRsn("KYC upload failed.");
			msgHeader.setError(error);

			response = new KYCResponse();
			response.setMsgHeader(msgHeader);
			response.setData(null);
			if (debugLog.isDebugEnabled()) {
				infoLog.info("Exit : uploadKYC()");
			}
			infoLog.info("Exit : uploadKYC()");
			return Response.status(Status.FORBIDDEN).entity(response).build();
		}
		if (debugLog.isDebugEnabled()) {
			infoLog.info("Exit : uploadKYC()");
		}
		infoLog.info("Exit : uploadKYC()");
		return Response.ok(response).build();
	}

	@POST
	@Path("/uploadKYC2")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response uploadKYC2(KYCRequest kycRequest) {
		KYCResponse response = null;
		try {
			if (debugLog.isDebugEnabled()) {
				debugLog.debug("Enter : uploadKYC()");
			}
			debugLog.debug("Enter : uploadKYC()");
			if (null != kycRequest) {
				byte[] imageBytes = DatatypeConverter.parseBase64Binary(kycRequest.getData().getImage());
				InputStream image = new ByteArrayInputStream(imageBytes);
				response = kycService.uploadKYC(kycRequest.getData(), image);
			} else {
				response = new KYCResponse();
				KYCDataResponse data = new KYCDataResponse();
				data.setSuccess("0");
				response.setData(data);
				errorLog.error("Invalid request for KYC upload.");
				MessageHeader msgHeader = new MessageHeader();
				RequestError error = new RequestError();
				error.setCd("001");
				error.setCustomCode("ERR001");
				error.setRsn("Invalid request for KYC upload.");
				msgHeader.setError(error);
				response.setMsgHeader(msgHeader);
			}

		} catch (Exception e) {
			errorLog.error("Error : uploadKYC()", e);
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
			if (debugLog.isDebugEnabled()) {
				debugLog.debug("Exit : uploadKYC()");
			}
			debugLog.debug("Exit : uploadKYC()");
			return Response.status(Status.FORBIDDEN).entity(response).build();
		}
		if (debugLog.isDebugEnabled()) {
			debugLog.debug("Exit : uploadKYC()");
		}
		debugLog.debug("Exit : uploadKYC()");
		return Response.ok(response).build();
	}

	
//			package com.afrAsia.rest;
//
//	import java.io.ByteArrayInputStream;
//	import java.io.InputStream;
//
//	import javax.ws.rs.Consumes;
//	import javax.ws.rs.POST;
//	import javax.ws.rs.Path;
//	import javax.ws.rs.Produces;
//	import javax.ws.rs.core.MediaType;
//	import javax.ws.rs.core.Response;
//	import javax.ws.rs.core.Response.Status;
//	import javax.xml.bind.DatatypeConverter;
//
//	import org.glassfish.jersey.media.multipart.FormDataParam;
//	import org.slf4j.Logger;
//	import org.slf4j.LoggerFactory;
//	import org.springframework.stereotype.Component;
//
//	import com.afrAsia.CommonUtils;
//	import com.afrAsia.entities.request.KYCDataRequest;
//	import com.afrAsia.entities.request.KYCRequest;
//	import com.afrAsia.entities.response.KYCDataResponse;
//	import com.afrAsia.entities.response.KYCResponse;
//	import com.afrAsia.entities.response.MessageHeader;
//	import com.afrAsia.entities.response.RequestError;
//	import com.afrAsia.service.KYCService;
//
//	/**
//	 * Defines the skeleton for upload KYC service
//	 * 
//	 * @author mds012
//	 *
//	 */
//	@Component
//	@Path("{version}")
//	public class KYCRestService {
//		private static final Logger logger = LoggerFactory.getLogger(KYCRestService.class);
//
//		private KYCService kycService;
//
//		public KYCService getKycService() {
//			return kycService;
//		}
//
//		public void setKycService(KYCService kycService) {
//			this.kycService = kycService;
//		}
//
//		@POST
//		@Path("/uploadKYC1")
//		@Consumes(MediaType.MULTIPART_FORM_DATA)
//		@Produces(MediaType.APPLICATION_JSON)
//		public Response uploadKYC1(@FormDataParam("data") String request, @FormDataParam("file") InputStream image) {
//			KYCResponse response = null;
//			try {
//				KYCDataRequest kycDataRequest = CommonUtils.jsonStringToObject(request, KYCDataRequest.class);
//				if (logger.isDebugEnabled()) {
//					logger.debug("Enter : uploadKYC()");
//				}
//				response = kycService.uploadKYC(kycDataRequest, image);
//			} catch (Exception e) {
//				logger.error("Error : uploadKYC()", e);
//				MessageHeader msgHeader = new MessageHeader();
//				RequestError error = new RequestError();
//				error.setCd("401");
//				error.setCustomCode("ERR401");
//				error.setRsn("KYC upload failed.");
//				msgHeader.setError(error);
//
//				response = new KYCResponse();
//				response.setMsgHeader(msgHeader);
//				response.setData(null);
//				if (logger.isDebugEnabled()) {
//					logger.info("Exit : uploadKYC()");
//				}
//				System.out.println("Error : uploadKYC()"+ e); 
//				return Response.status(Status.FORBIDDEN).entity(response).build();
//			}
//			if (logger.isDebugEnabled()) {
//				logger.info("Exit : uploadKYC()");
//			}
//			System.out.println("Exit : uploadKYC()"); 
//			return Response.ok(response).build();
//		}
//
//		@POST
//		@Path("/uploadKYC2")
//		@Consumes(MediaType.APPLICATION_JSON)
//		@Produces(MediaType.APPLICATION_JSON)
//		public Response uploadKYC2(KYCRequest kycRequest) {
//			KYCResponse response = null;
//			try {
//				if (logger.isDebugEnabled()) {
//					logger.debug("Enter : uploadKYC()");
//				}
//				System.out.println("Enter : uploadKYC()");
//				if (null != kycRequest) {
//					byte[] imageBytes = DatatypeConverter.parseBase64Binary(kycRequest.getData().getImage());
//					InputStream image = new ByteArrayInputStream(imageBytes);
//					response = kycService.uploadKYC(kycRequest.getData(), image);
//				} else {
//					response = new KYCResponse();
//					KYCDataResponse data = new KYCDataResponse();
//					data.setSuccess("0");
//					response.setData(data);
//
//					MessageHeader msgHeader = new MessageHeader();
//					RequestError error = new RequestError();
//					error.setCd("001");
//					error.setCustomCode("ERR001");
//					error.setRsn("Invalid request for KYC upload.");
//					msgHeader.setError(error);
//					response.setMsgHeader(msgHeader);
//				}
//
//			} catch (Exception e) {
//				logger.error("Error : uploadKYC()", e);
//				MessageHeader msgHeader = new MessageHeader();
//				RequestError error = new RequestError();
//				error.setCd("401");
//				error.setCustomCode("ERR401");
//				error.setRsn("KYC upload failed.");
//				msgHeader.setError(error);
//
//				response = new KYCResponse();
//				response.setMsgHeader(msgHeader);
//				response.setData(null);
//				if (logger.isDebugEnabled()) {
//					logger.info("Exit : uploadKYC()");
//				}
//				System.out.println("Error : uploadKYC()" + e);
//				return Response.status(Status.FORBIDDEN).entity(response).build();
//			}
//			if (logger.isDebugEnabled()) {
//				logger.info("Exit : uploadKYC()");
//			}
//			System.out.println("Exit : uploadKYC()");
//			return Response.ok(response).build();
//		}

		/*public static void main(String[] args) {
		KYCRequest kycRequest = new KYCRequest();
		KYCDataRequest data = new KYCDataRequest();

		Long appId = (long) 12345678;
		Long applicantId = (long) 1234567;
		String currentPageNo = "1";
		String docId ="Signature";
		Boolean ignorePrevious = false;
		String image ="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";
		Boolean isLastPage = true;
		String noOfPages = "1";
		Long recordNo = (long)123;
		String rmId = "mds012";

		data.setAppId(appId);
		data.setApplicantId(applicantId);
		data.setCurrentPageNo(currentPageNo);
		data.setDocId(docId);
		data.setIgnorePrevious(ignorePrevious);
		data.setImage(image);
		data.setIsLastPage(isLastPage);
		data.setNoOfPages(noOfPages);

		data.setRecordNo(recordNo);
		data.setRmId(rmId);
		kycRequest.setData(data );
		kycService = new KYCServiceImpl();
		Response result = new KYCRestService().uploadKYC2(kycRequest);
		System.out.println("Response : "+result.getEntity());
	}*/

	}