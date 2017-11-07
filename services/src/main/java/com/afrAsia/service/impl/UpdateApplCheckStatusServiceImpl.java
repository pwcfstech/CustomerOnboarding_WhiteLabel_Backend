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
import org.apache.pdfbox.multipdf.PDFMergerUtility;
import org.springframework.transaction.annotation.Transactional;

import com.afrAsia.dao.RMDetailsDao;
import com.afrAsia.dao.UpdateApplCheckStatusDAO;
import com.afrAsia.dao.jpa.ApplicationDetailsJpaDAO;
import com.afrAsia.entities.jpa.MsgHeader;
import com.afrAsia.entities.jpa.MsgHeader.Error;
import com.afrAsia.entities.masters.RMDetails;
import com.afrAsia.entities.request.ApplCheckStatusReq;
import com.afrAsia.entities.request.ApplCheckStatusReq.Data;
import com.afrAsia.entities.request.ApplCheckStatusReq.Data.Checks;
import com.afrAsia.entities.response.ApplCheckStatusResponse;
import com.afrAsia.entities.transactions.MobAccountDetail;
import com.afrAsia.entities.transactions.MobApplCheck;
import com.afrAsia.entities.transactions.MobApplCheckComments;
import com.afrAsia.entities.transactions.MobApplicantPersonalDetail;
import com.afrAsia.entities.transactions.MobRmAppRefId;
import com.afrAsia.service.UpdateApplCheckStatusService;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class UpdateApplCheckStatusServiceImpl implements UpdateApplCheckStatusService {
	
	final static Logger debugLog = Logger.getLogger("debugLogger");
	final static Logger infoLog = Logger.getLogger("infoLogger");
	final static Logger errorLog = Logger.getLogger("errorLogger");

	private static final String COMPDOCS_CC_PATH = "./Afrasia_Docs/complianceDocs/CC/";
	private static final String COMPDOCS_IC_PATH = "./Afrasia_Docs/complianceDocs/IC/";
	private static final String COMPDOCS_WC_PATH = "./Afrasia_Docs/complianceDocs/WC/";
	private static final String COMPDOCS_KYC_PATH = "./Afrasia_Docs/complianceDocs/KYC/";
	private static final String COMPDOCS_PATH = "./Afrasia_Docs/complianceDocs/";
	
	private UpdateApplCheckStatusDAO updateApplCheckStatusDAO;
	private RMDetailsDao rmDetailsDAO;
	private ApplicationDetailsJpaDAO applicationDetailsDAO;
	
	public UpdateApplCheckStatusDAO getUpdateApplCheckStatusDAO() {
		return updateApplCheckStatusDAO;
	}

	public void setUpdateApplCheckStatusDAO(UpdateApplCheckStatusDAO updateApplCheckStatusDAO) {
		this.updateApplCheckStatusDAO = updateApplCheckStatusDAO;
	}

	public ApplicationDetailsJpaDAO getApplicationDetailsDAO() {
		return applicationDetailsDAO;
	}

	public void setApplicationDetailsDAO(ApplicationDetailsJpaDAO applicationDetailsDAO) {
		this.applicationDetailsDAO = applicationDetailsDAO;
	}

	public RMDetailsDao getRmDetailsDAO() {
		return rmDetailsDAO;
	}

	public void setRmDetailsDAO(RMDetailsDao rmDetailsDAO) {
		this.rmDetailsDAO = rmDetailsDAO;
	}
	
	@Transactional(readOnly = false, rollbackFor = {Exception.class})
	public ApplCheckStatusResponse updateApplCheckStatus(ApplCheckStatusReq applCheckStatusReq) {
		
		ApplCheckStatusResponse.Data data = new ApplCheckStatusResponse().new Data();
		ApplCheckStatusResponse applCheckStatusResponse = new ApplCheckStatusResponse();
		Data applCheckStatusReqData = applCheckStatusReq.getData();
		
		/*mobApplCheckComments.setId(applCheckStatusReqData.getRefId());
		mobApplCheckComments.setRecordId(applCheckStatusReqData.getRecordId());*/

		String directory = null;
		String filename = null;
		String finalPath = null;
		StringBuffer directoryBuffer = new StringBuffer();
		StringBuffer filenameBuffer = new StringBuffer();
		StringBuffer finalBuffer = new StringBuffer();
		String date = new SimpleDateFormat("dd-MM-yyyy_hh-mm").format(new Date());
		//mobApplCheck.setCcDone(false);
		//mobApplCheck.setIcDone(false);
		//mobApplCheck.setWcDone(false);
		//mobApplCheck.setKycDone(false);
		MobRmAppRefId mobRmAppRefId = updateApplCheckStatusDAO.getMobAppRefId(applCheckStatusReqData.getRefId());
		//mobRmAppRefId.setId(applCheckStatusReqData.getRefId());
		if(applCheckStatusReqData.getAppStatus()!=null && !"".equals(applCheckStatusReqData.getAppStatus()))
		{
			mobRmAppRefId.setAppStatus(applCheckStatusReqData.getAppStatus());
			updateApplCheckStatusDAO.updateAppStatus(mobRmAppRefId);
		}
		List<Checks> checkList = applCheckStatusReqData.getChecks();
		try{
			MobApplCheck mobApplCheck=updateApplCheckStatusDAO.getApplCheckStatus(applCheckStatusReqData.getRecordId());
			
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
						/*mobApplCheckComments.setCcComment(checks.getComment());
						mobApplCheckComments.setCcCommentBy(checks.getUserId());
						mobApplCheckComments.setCcDate(new Date());*/
						directory = directoryBuffer.append(COMPDOCS_CC_PATH).append(applCheckStatusReqData.getRefId()).append("_").append(applCheckStatusReqData.getRecordId().toString()).toString();
						filename = filenameBuffer.append("CC_").append(date).append(".pdf").toString();
						finalPath = finalBuffer.append(COMPDOCS_PATH).append(applCheckStatusReqData.getRefId()).append("_").append("CC.pdf").toString();
						if (checks.getScreenshots()!=null && checks.getScreenshots().size()>0)
						{
							mobApplCheck.setCcUrl(finalPath);
						}
					}
					if("IC".equals(checks.getCheckType()))
					{
						mobApplCheck.setIcStatus(checks.getStatus());
						mobApplCheck.setIcDone(true);
						mobApplCheck.setIcDoneBy(checks.getUserId());
						mobApplCheck.setIcDate(new Date());
						/*mobApplCheckComments.setIcComment(checks.getComment());
						mobApplCheckComments.setIcCommentBy(checks.getUserId());
						mobApplCheckComments.setIcDate(new Date());*/
						directory = directoryBuffer.append(COMPDOCS_IC_PATH).append(applCheckStatusReqData.getRefId()).append("_").append(applCheckStatusReqData.getRecordId().toString()).toString();
						filename = filenameBuffer.append("IC_").append(date).append(".pdf").toString();
						finalPath = finalBuffer.append(COMPDOCS_PATH).append(applCheckStatusReqData.getRefId()).append("_").append("IC.pdf").toString();
						if (checks.getScreenshots()!=null && checks.getScreenshots().size()>0)
						{
							mobApplCheck.setIcUrl(finalPath);
						}
					}
					if("WC".equals(checks.getCheckType()))
					{
						mobApplCheck.setWcStatus(checks.getStatus());
						mobApplCheck.setWcDone(true);
						mobApplCheck.setWcDoneBy(checks.getUserId());
						mobApplCheck.setWcDate(new Date());
						/*mobApplCheckComments.setWcComment(checks.getComment());
						mobApplCheckComments.setWcCommentBy(checks.getUserId());
						mobApplCheckComments.setWcDate(new Date());*/
						directory = directoryBuffer.append(COMPDOCS_WC_PATH).append(applCheckStatusReqData.getRefId()).append("_").append(applCheckStatusReqData.getRecordId().toString()).toString();
						filename = filenameBuffer.append("WC_").append(date).append(".pdf").toString();
						finalPath = finalBuffer.append(COMPDOCS_PATH).append(applCheckStatusReqData.getRefId()).append("_").append("WC.pdf").toString();
						if (checks.getScreenshots()!=null && checks.getScreenshots().size()>0)
						{
							mobApplCheck.setWcUrl(finalPath);
						}
					}
					if("KYC".equals(checks.getCheckType()))
					{
						mobApplCheck.setKycStatus(checks.getStatus());
						mobApplCheck.setKycDone(true);
						mobApplCheck.setKycDoneBy(checks.getUserId());
						mobApplCheck.setKycDate(new Date());
						/*mobApplCheckComments.setKycComment(checks.getComment());
						mobApplCheckComments.setKycCommentBy(checks.getUserId());
						mobApplCheckComments.setKycDate(new Date());*/
						directory = directoryBuffer.append(COMPDOCS_KYC_PATH).append(applCheckStatusReqData.getRefId()).append("_").append(applCheckStatusReqData.getRecordId().toString()).toString();
						filename = filenameBuffer.append("KYC_").append(date).append(".pdf").toString();
						finalPath = finalBuffer.append(COMPDOCS_PATH).append(applCheckStatusReqData.getRefId()).append("_").append("KYC.pdf").toString();
						if (checks.getScreenshots()!=null && checks.getScreenshots().size()>0)
						{
							mobApplCheck.setKycUrl(finalPath);
						}
					}
					
					if (checks.getScreenshots()!=null && checks.getScreenshots().size()>0)
					{
						try {
							createPdf(directory,filename,checks.getScreenshots(),finalPath);
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
			}
			
			mobApplCheck.setModifiedBy(applCheckStatusReqData.getCompId());
			mobApplCheck.setModifiedDate(new Date());
			updateApplCheckStatusDAO.updateApplCheckStatus(mobApplCheck);
			data.setCcUrl(mobApplCheck.getCcUrl());
			data.setIcUrl(mobApplCheck.getIcUrl());
			data.setWcUrl(mobApplCheck.getWcUrl());
			data.setKycUrl(mobApplCheck.getKycUrl());
			
			try{
				MobApplCheckComments mobApplCheckComments = updateApplCheckStatusDAO.getApplCheckComm(applCheckStatusReqData.getRefId(),applCheckStatusReqData.getRecordId());
				mobApplCheckComments.setCompId(applCheckStatusReqData.getCompId());
				mobApplCheckComments.setCompComment(applCheckStatusReqData.getCompComment());
				mobApplCheckComments.setCompDate(new Date());
				mobApplCheckComments.setModifiedBy(applCheckStatusReqData.getCompId());
				mobApplCheckComments.setModifiedDate(new Date());
				if(checkList!=null && checkList.size()>0)
				{
					for(Checks checks:checkList)
					{
						if("CC".equals(checks.getCheckType()))
						{
							mobApplCheckComments.setCcComment(checks.getComment());
							mobApplCheckComments.setCcCommentBy(checks.getUserId());
							mobApplCheckComments.setCcDate(new Date());
						}
						if("IC".equals(checks.getCheckType()))
						{
							mobApplCheckComments.setIcComment(checks.getComment());
							mobApplCheckComments.setIcCommentBy(checks.getUserId());
							mobApplCheckComments.setIcDate(new Date());
						}
						if("WC".equals(checks.getCheckType()))
						{
							mobApplCheckComments.setWcComment(checks.getComment());
							mobApplCheckComments.setWcCommentBy(checks.getUserId());
							mobApplCheckComments.setWcDate(new Date());
						}
						if("KYC".equals(checks.getCheckType()))
						{
							mobApplCheckComments.setKycComment(checks.getComment());
							mobApplCheckComments.setKycCommentBy(checks.getUserId());
							mobApplCheckComments.setKycDate(new Date());
						}
					}
				}
				updateApplCheckStatusDAO.updateMobApplCheckComm(mobApplCheckComments);
			}
			catch(NoResultException e)
			{
				MobApplCheckComments mobApplCheckComments = new MobApplCheckComments();
				mobApplCheckComments.setId(applCheckStatusReqData.getRefId());
				mobApplCheckComments.setRecordId(applCheckStatusReqData.getRecordId());
				mobApplCheckComments.setCreatedBy(applCheckStatusReqData.getCompId());
				mobApplCheckComments.setCreatedDate(new Date());
				mobApplCheckComments.setCompId(applCheckStatusReqData.getCompId());
				mobApplCheckComments.setCompComment(applCheckStatusReqData.getCompComment());
				mobApplCheckComments.setCompDate(new Date());
				mobApplCheckComments.setModifiedBy(applCheckStatusReqData.getCompId());
				mobApplCheckComments.setModifiedDate(new Date());
				if(checkList!=null && checkList.size()>0)
				{
					for(Checks checks:checkList)
					{
						if("CC".equals(checks.getCheckType()))
						{
							mobApplCheckComments.setCcComment(checks.getComment());
							mobApplCheckComments.setCcCommentBy(checks.getUserId());
							mobApplCheckComments.setCcDate(new Date());
						}
						if("IC".equals(checks.getCheckType()))
						{
							mobApplCheckComments.setIcComment(checks.getComment());
							mobApplCheckComments.setIcCommentBy(checks.getUserId());
							mobApplCheckComments.setIcDate(new Date());
						}
						if("WC".equals(checks.getCheckType()))
						{
							mobApplCheckComments.setWcComment(checks.getComment());
							mobApplCheckComments.setWcCommentBy(checks.getUserId());
							mobApplCheckComments.setWcDate(new Date());
						}
						if("KYC".equals(checks.getCheckType()))
						{
							mobApplCheckComments.setKycComment(checks.getComment());
							mobApplCheckComments.setKycCommentBy(checks.getUserId());
							mobApplCheckComments.setKycDate(new Date());
						}
					}
				}
				updateApplCheckStatusDAO.storeApplCheckComm(mobApplCheckComments);
			}
		}
		catch(NoResultException e)
		{
			errorLog.error("No record exists for RecordId:"+applCheckStatusReqData.getRecordId()+"in MobApplCheck");
			MsgHeader msgHdr = new MsgHeader();
			Error err = new MsgHeader().new Error();
			err.setRsn("No record exists for RecordId:"+applCheckStatusReqData.getRecordId()+"in MobApplCheck");
			err.setCd("404");
			err.setCustomCode("NoResultException");
			msgHdr.setError(err);
			applCheckStatusResponse.setMsgHeader(msgHdr);
			return applCheckStatusResponse;
		}
		
		data.setSuccess("1");
		applCheckStatusResponse.setData(data);
		return applCheckStatusResponse;
	}
	
	
	public void createPdf(String dest, String fileName, List<String> IMAGES, String finalPath) throws IOException, DocumentException {
		File directoryObj = new File(dest);
		if (!directoryObj.exists()) {
			directoryObj.mkdirs();
		}
		byte[] imageBytes = DatatypeConverter.parseBase64Binary(IMAGES.get(0));
		InputStream imageStream = new ByteArrayInputStream(imageBytes);
	    Image img = Image.getInstance(ImageIO.read(imageStream),null);
	    Document document = new Document();
	    PdfWriter.getInstance(document, new FileOutputStream(dest + "/" + fileName));
	    document.open();
	    for (String image : IMAGES) {
	    	imageBytes = DatatypeConverter.parseBase64Binary(image);
	    	imageStream = new ByteArrayInputStream(imageBytes);
	    	img = Image.getInstance(ImageIO.read(imageStream),null);
	        //document.setPageSize(img);
	        document.newPage();
	        //img.setAbsolutePosition(0, 0);
	        Font f=new Font(FontFamily.TIMES_ROMAN,10.0f);
	        Paragraph p=new Paragraph(new Date().toString(),f);
	        document.add(p);
	        document.add(img);
	    }
	    document.close();
		    PDFMergerUtility mergePdf = new PDFMergerUtility(); 
		    //String folder ="pdf"; 
		    File _folder = new File(dest); 
		    File[] filesInFolder; filesInFolder = _folder.listFiles(); 
		    for (File string : filesInFolder) 
		    { 
		    	mergePdf.addSource(string);	
		    } 
		    mergePdf.setDestinationFileName(finalPath); 
		    mergePdf.mergeDocuments(null); 
	}
	
	@Transactional(readOnly = false, rollbackFor = {Exception.class}) 
	public RMDetails getRMDetails(Long refId){
		MobRmAppRefId mobRmAppRefId = updateApplCheckStatusDAO.getMobAppRefId(refId);
		RMDetails rmDetails=null;
		try{
    	rmDetails = rmDetailsDAO.getRMDetailByRMId(mobRmAppRefId.getRmUsedId());
    	debugLog.debug(" rmDetails ::  "+rmDetails);
		}catch(NullPointerException e){
		errorLog.error(" rmDetails is null ",e);	
		}
    	return rmDetails;
    }
	
	@Transactional(readOnly = false, rollbackFor = {Exception.class}) 
	public MobApplicantPersonalDetail getApplPersonalDetails(Long refId){
		MobAccountDetail mobAccountDetail = applicationDetailsDAO.getMobAccountDetails(refId);
		MobApplicantPersonalDetail mobApplicantPersonalDetail = null;
		if(mobAccountDetail!=null)
		{
			mobApplicantPersonalDetail=applicationDetailsDAO.getMobApplicantPersonalDetails(refId, mobAccountDetail.getIndvApplicantRefNo());
		}
		return mobApplicantPersonalDetail;
    }
}