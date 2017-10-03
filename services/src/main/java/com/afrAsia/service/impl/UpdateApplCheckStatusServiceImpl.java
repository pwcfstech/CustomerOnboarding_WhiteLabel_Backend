package com.afrAsia.service.impl;


import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.imageio.ImageIO;
import javax.persistence.NoResultException;
import javax.xml.bind.DatatypeConverter;

import org.apache.log4j.Logger;
import org.springframework.transaction.annotation.Transactional;

import com.afrAsia.dao.UpdateApplCheckStatusDAO;
import com.afrAsia.entities.jpa.MsgHeader;
import com.afrAsia.entities.jpa.MsgHeader.Error;
import com.afrAsia.entities.request.ApplCheckStatusReq;
import com.afrAsia.entities.request.ApplCheckStatusReq.Data;
import com.afrAsia.entities.request.ApplCheckStatusReq.Data.Checks;
import com.afrAsia.entities.response.ApplCheckStatusResponse;
import com.afrAsia.entities.transactions.MobApplCheck;
import com.afrAsia.entities.transactions.MobApplCheckComments;
import com.afrAsia.entities.transactions.MobRmAppRefId;
import com.afrAsia.service.UpdateApplCheckStatusService;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.pdf.PdfWriter;

public class UpdateApplCheckStatusServiceImpl implements UpdateApplCheckStatusService {
	
	final static Logger debugLog = Logger.getLogger("debugLogger");
	final static Logger infoLog = Logger.getLogger("infoLogger");
	final static Logger errorLog = Logger.getLogger("errorLogger");

	private static final String COMPDOCS_PATH = "./Afrasia_Docs/complianceDocs/";
	
	UpdateApplCheckStatusDAO updateApplCheckStatusDAO;

	public UpdateApplCheckStatusDAO getUpdateApplCheckStatusDAO() {
		return updateApplCheckStatusDAO;
	}


	public void setUpdateApplCheckStatusDAO(UpdateApplCheckStatusDAO updateApplCheckStatusDAO) {
		this.updateApplCheckStatusDAO = updateApplCheckStatusDAO;
	}


	@Transactional(readOnly = false, rollbackFor = {Exception.class})
	public ApplCheckStatusResponse updateApplCheckStatus(ApplCheckStatusReq applCheckStatusReq) {
		
		ApplCheckStatusResponse.Data data = new ApplCheckStatusResponse().new Data();
		ApplCheckStatusResponse applCheckStatusResponse = new ApplCheckStatusResponse();
		Data applCheckStatusReqData = applCheckStatusReq.getData();

		MobApplCheck mobApplCheck = new MobApplCheck();
		mobApplCheck.setRecordId(applCheckStatusReqData.getRecordId());
		mobApplCheck.setId(applCheckStatusReqData.getRefId());
		
		MobApplCheckComments mobApplCheckComments = new MobApplCheckComments();

		String directory = null;
		String filename = null;
		StringBuffer directoryBuffer = new StringBuffer();
		StringBuffer filenameBuffer = new StringBuffer();
		String date = new SimpleDateFormat("dd-MM-yyyy_hh-mm").format(new Date());
		mobApplCheck.setCcDone(false);
		mobApplCheck.setIcDone(false);
		mobApplCheck.setWcDone(false);
		mobApplCheck.setKycDone(false);
		List<Checks> checkList = applCheckStatusReqData.getChecks();
		if(checkList!=null && checkList.size()>0)
		{
			for(Checks checks:checkList)
			{
				if("CC".equals(checks.getCheckType()))
				{
					mobApplCheck.setCcStatus(checks.getStatus());
					mobApplCheck.setCcDone(true);
					mobApplCheck.setCcDoneBy(checks.getUserId());
					mobApplCheck.setCcDate(new Date());
					mobApplCheckComments.setCcComment(checks.getComment());
					directory = directoryBuffer.append(COMPDOCS_PATH).append(applCheckStatusReqData.getRefId())+"_"+applCheckStatusReqData.getRecordId().toString();
					filename = filenameBuffer.append("CC_"+date+".pdf").toString();
					mobApplCheck.setCcUrl(directory + "/" + filename);
				}
				if("IC".equals(checks.getCheckType()))
				{
					mobApplCheck.setIcStatus(checks.getStatus());
					mobApplCheck.setIcDone(true);
					mobApplCheck.setIcDoneBy(checks.getUserId());
					mobApplCheck.setIcDate(new Date());
					mobApplCheckComments.setIcComment(checks.getComment());
					directory = directoryBuffer.append(COMPDOCS_PATH).append(applCheckStatusReqData.getRefId())+"_"+applCheckStatusReqData.getRecordId().toString();
					filename = filenameBuffer.append("IC_"+date+".pdf").toString();
					mobApplCheck.setIcUrl(directory + "/" + filename);
				}
				if("WC".equals(checks.getCheckType()))
				{
					mobApplCheck.setWcStatus(checks.getStatus());
					mobApplCheck.setWcDone(true);
					mobApplCheck.setWcDoneBy(checks.getUserId());
					mobApplCheck.setWcDate(new Date());
					mobApplCheckComments.setWcComment(checks.getComment());
					directory = directoryBuffer.append(COMPDOCS_PATH).append(applCheckStatusReqData.getRefId())+"_"+applCheckStatusReqData.getRecordId().toString();
					filename = filenameBuffer.append("WC_"+date+".pdf").toString();
					mobApplCheck.setWcUrl(directory + "/" + filename);
				}
				if("KYC".equals(checks.getCheckType()))
				{
					mobApplCheck.setKycStatus(checks.getStatus());
					mobApplCheck.setKycDone(true);
					mobApplCheck.setKycDoneBy(checks.getUserId());
					mobApplCheck.setKycDate(new Date());
					mobApplCheckComments.setKycComment(checks.getComment());
					directory = directoryBuffer.append(COMPDOCS_PATH).append(applCheckStatusReqData.getRefId()+"_"+applCheckStatusReqData.getRecordId()).toString();
					filename = filenameBuffer.append("KYC_"+date+".pdf").toString();
					mobApplCheck.setKycUrl(directory + "/" + filename);
				}
				
				try {
					createPdf(directory,filename,checks.getScreenshots());
				} catch (IOException e) {
					errorLog.error("IOException in uploading comments screenshots", e);
					MsgHeader msgHeader = new MsgHeader();
					Error error = new MsgHeader().new Error();
					error.setCd("002");
					error.setCustomCode("ERR002");
					error.setRsn("Server error : "+e);
					msgHeader.setError(error);
					applCheckStatusResponse.setMsgHeader(msgHeader);
					data.setSuccess("0");
					applCheckStatusResponse.setData(data);
				} catch (DocumentException e) {
					errorLog.error("DocumentException in uploading comments screenshots", e);
					MsgHeader msgHeader = new MsgHeader();
					Error error = new MsgHeader().new Error();
					error.setCd("002");
					error.setCustomCode("ERR002");
					error.setRsn("Server error : "+e);
					msgHeader.setError(error);
					applCheckStatusResponse.setMsgHeader(msgHeader);
					data.setSuccess("0");
					applCheckStatusResponse.setData(data);
				}
			}
		}
		MobRmAppRefId mobRmAppRefId = new MobRmAppRefId();
		mobRmAppRefId.setId(applCheckStatusReqData.getRefId());
		mobRmAppRefId.setAppStatus(applCheckStatusReqData.getAppStatus());
		
		mobApplCheckComments.setCompId(applCheckStatusReqData.getCompId());
		mobApplCheckComments.setCompComment(applCheckStatusReqData.getCompComment());
		mobApplCheck.setModifiedBy(applCheckStatusReqData.getCompId());
		mobApplCheck.setModifiedDate(new Date());
		try{
			updateApplCheckStatusDAO.getApplCheckStatus(applCheckStatusReqData.getRecordId());
			updateApplCheckStatusDAO.updateApplCheckStatus(mobApplCheck);
		}
		catch(NoResultException e)
		{
			mobApplCheck.setCreatedBy(applCheckStatusReqData.getCompId());
			mobApplCheck.setCreatedDate(new Date());
			updateApplCheckStatusDAO.storeApplCheckStatus(mobApplCheck);
		}
		
		updateApplCheckStatusDAO.updateAppStatus(mobRmAppRefId);
		updateApplCheckStatusDAO.updateMobApplCheckComm(mobApplCheckComments);
		
		data.setSuccess("1");
		applCheckStatusResponse.setData(data);
		return applCheckStatusResponse;
	}
	
	
	public void createPdf(String dest, String fileName, List<String> IMAGES) throws IOException, DocumentException {
		File directoryObj = new File(dest);
		if (!directoryObj.exists()) {
			directoryObj.mkdirs();
		}
		byte[] imageBytes = DatatypeConverter.parseBase64Binary(IMAGES.get(0));
		InputStream imageStream = new ByteArrayInputStream(imageBytes);
	    Image img = Image.getInstance(ImageIO.read(imageStream),null);
	    Document document = new Document(img);
	    PdfWriter.getInstance(document, new FileOutputStream(dest + "/" + fileName));
	    document.open();
	    for (String image : IMAGES) {
	    	imageBytes = DatatypeConverter.parseBase64Binary(image);
	    	imageStream = new ByteArrayInputStream(imageBytes);
	    	img = Image.getInstance(ImageIO.read(imageStream),null);
	        document.setPageSize(img);
	        document.newPage();
	        img.setAbsolutePosition(0, 0);
	        document.add(img);
	    }
	    document.close();
	}
}