package com.afrAsia.service.impl;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;

import com.afrAsia.dao.jpa.ApplicationDetailsJpaDAO;
import com.afrAsia.dao.jpa.UploadKYCDao;
import com.afrAsia.entities.request.KYCDataRequest;
import com.afrAsia.entities.response.KYCDataResponse;
import com.afrAsia.entities.response.KYCResponse;
import com.afrAsia.entities.response.MessageHeader;
import com.afrAsia.entities.response.RequestError;
import com.afrAsia.entities.transactions.KycTableCompositePK;
import com.afrAsia.entities.transactions.MobApplicantKycDocuments;
import com.afrAsia.entities.transactions.MobApplicantPersonalDetail;
import com.afrAsia.service.KYCService;

/**
 * @author mds012
 *
 */
public class KYCServiceImpl implements KYCService {
	private static final Logger logger = LoggerFactory.getLogger(KYCServiceImpl.class);

	private final String SIGNATURE = "Signature";
	
	private final String SIG_SHARED_PATH = "C:/Users/mds012/Desktop/Signature/";
	
	private final String DMSDOCS_SHARED_PATH = "C:/Users/mds012/Desktop/dmsdocs/";

	private UploadKYCDao uploadKYCDao;

	private ApplicationDetailsJpaDAO applicationDetailsDAO;

	public ApplicationDetailsJpaDAO getApplicationDetailsDAO() {
		return applicationDetailsDAO;
	}

	public void setapplicationDetailsDAO(ApplicationDetailsJpaDAO applicationDetailsDAO) {
		this.applicationDetailsDAO = applicationDetailsDAO;
	}

	public UploadKYCDao getUploadKYCDao() {
		return uploadKYCDao;
	}

	public void setUploadKYCDao(UploadKYCDao uploadKYCDao) {
		this.uploadKYCDao = uploadKYCDao;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.afrAsia.service.KYCService#uploadKYC(com.afrAsia.entities.request.
	 * KYCDataRequest, java.io.InputStream)
	 */
	@Transactional(readOnly = false, rollbackFor = {Exception.class})
	public KYCResponse uploadKYC(KYCDataRequest kycDataRequest, InputStream image) {
		if (logger.isDebugEnabled()) {
			logger.info("Enter : KYCService#uploadKYC()");
		}
		System.out.println("Enter : KYCService#uploadKYC()");
		KYCResponse response = new KYCResponse();
		KYCDataResponse data = new KYCDataResponse();
		if (this.validateKycRequest(kycDataRequest, image)) {
			try {
				Long appId = kycDataRequest.getAppId();
				Long applicantId = kycDataRequest.getApplicantId();
				String docId = kycDataRequest.getDocId();
				Boolean ignorePrevious = kycDataRequest.getIgnorePrevious();
				Boolean isLastPage = kycDataRequest.getIsLastPage();
				String noOfPages = kycDataRequest.getNoOfPages();
				String currentPageNo = kycDataRequest.getCurrentPageNo();
				String rmId = kycDataRequest.getRmId();
				Long recordNo = kycDataRequest.getRecordNo();
				String firstName = null;
				String lastName = null;
				System.out.println("appId : " + appId + ", applicantId : " + applicantId);
				
				MobApplicantPersonalDetail mobApplicantPersonalDetail =  applicationDetailsDAO.getMobApplicantPersonalDetails(appId,applicantId);
				System.out.println("mobApplicantPersonalDetail : " + mobApplicantPersonalDetail);
				if(null != mobApplicantPersonalDetail) {
					firstName = mobApplicantPersonalDetail.getFirstName();
					lastName = mobApplicantPersonalDetail.getLastName();
				}
				
				System.out.println("appId : " + appId + ", applicantId : " + applicantId + ", docId : " + docId
						+ ", ignorePrevious : " + ignorePrevious + ", isLastPage : " + isLastPage + ", noOfPages : "
						+ noOfPages + ", currentPageNo : " + currentPageNo+", firstName : "+firstName+", lastName : "+lastName);
				
				// Signature file format :
				// AppId_ApplicantId_FN_LN_DocumentId_Date(DD-MM-YYY)_Time(HH-MM).jpg
				// Path : /Signature/ApplicantId
				// PDF Document file format :
				// AppId_ApplicantId_FN_LN_DocumentId_Date(DD-MM-YYY)_Time(HH-MM).pdf
				// Path : /dmsdocs/ApplicantId

				StringBuffer directoryBuffer = new StringBuffer();
				StringBuffer filenameBuffer = new StringBuffer();
				String date = new SimpleDateFormat("dd-MM-yyyy_hh-mm").format(new Date());
				String directory = null;
				String startsWith = null;
				String filename = null;

				if (SIGNATURE.equals(docId)) {
					directory = directoryBuffer.append(SIG_SHARED_PATH).append(applicantId).toString();
					startsWith = filenameBuffer.append(appId).append("_").append(applicantId).append("_").append(firstName).append("_").append(lastName).append("_").append(docId).append("_").toString();
					filename = filenameBuffer.append(date).append(".jpg").toString();
					File fileDirectory = new File(directory);
					if (ignorePrevious && fileDirectory.exists()) {
						FileUtils.cleanDirectory(fileDirectory);
					}
					this.writeImage(image, directory, filename, "jpg", startsWith);
				} else {
					directory = directoryBuffer.append(DMSDOCS_SHARED_PATH).append(applicantId)
							.toString();
					startsWith = filenameBuffer.append(appId).append("_").append(applicantId).append("_").append(firstName)
							.append("_").append(lastName).append("_").append(docId).append("_").toString();
					filename = filenameBuffer.append(date).append(".jpg").toString(); // Need to remove later
					// .append(".pdf").toString();

					File fileDirectory = new File(directory);
					if (ignorePrevious && fileDirectory.exists()) {
						FileUtils.cleanDirectory(fileDirectory);
					}

					this.writePDF(image, directory, filename, startsWith, isLastPage, noOfPages, currentPageNo);
				}

				MobApplicantKycDocuments kycDocs = new MobApplicantKycDocuments();
				kycDocs.setId(new KycTableCompositePK());
				kycDocs.getId().setId(appId);
				kycDocs.getId().setApplicantId(applicantId);
				kycDocs.getId().setDocId(docId);
				kycDocs.setRecordId(recordNo.toString());
				kycDocs.setDocUrl(directory + "/" + filename);
				kycDocs.setCreatedBy(rmId);
				Date now = new Date(); 
				kycDocs.setCreatedDate(now);
				kycDocs.setModifiedBy(rmId);
				kycDocs.setModifiedDate(now);
				
				uploadKYCDao.saveKYCDocLocation(kycDocs);
				data.setSuccess("1");
			} catch (Exception e) {
				logger.error("Error : KYCService#uploadKYC()", e);
				e.printStackTrace();
				System.out.println("Error : KYCService#uploadKYC() "+ e);
				MessageHeader msgHeader = new MessageHeader();
				RequestError error = new RequestError();
				error.setCd("002");
				error.setCustomCode("ERR002");
				error.setRsn("Server error : "+e);
				msgHeader.setError(error);
				response.setMsgHeader(msgHeader);
				data.setSuccess("0");
			}
		} else {
			MessageHeader msgHeader = new MessageHeader();
			RequestError error = new RequestError();
			error.setCd("001");
			error.setCustomCode("ERR001");
			error.setRsn("Invalid request for KYC upload.");
			msgHeader.setError(error);
			response.setMsgHeader(msgHeader);
			data.setSuccess("0");
			if (logger.isDebugEnabled()) {
				logger.info("Invalid input data in uploadKYC()");
			}
		}

		response.setData(data);
		if (logger.isDebugEnabled()) {
			logger.info("Exit : KYCService#uploadKYC()");
		}
		return response;
	}

	/**
	 * @param kycDataRequest
	 * @param image
	 * @return
	 */
	private boolean validateKycRequest(KYCDataRequest kycDataRequest, InputStream image) {
		System.out.println("Enter : validateKycRequest()");
		boolean isValid = false;
		if (null != kycDataRequest 
				&& null != image 
				&& null != kycDataRequest.getAppId()
				&& null != kycDataRequest.getApplicantId() 
				&& null != kycDataRequest.getDocId()
				&& null != kycDataRequest.getIgnorePrevious() 
				&& null != kycDataRequest.getCurrentPageNo()
				&& !kycDataRequest.getCurrentPageNo().isEmpty() 
				&& null != kycDataRequest.getNoOfPages()
				&& null != kycDataRequest.getIsLastPage() 
				&& null != kycDataRequest.getRecordNo()
				&& null != kycDataRequest.getRmId() 
				&& !kycDataRequest.getRmId().isEmpty()) {
			isValid = true;
		}
		System.out.println("isValid : " + isValid + " kycDataRequest : " + kycDataRequest + " image : " + image);
		System.out.println("Exit : validateKycRequest()");
		return isValid;
	}

	/**
	 * @param image
	 * @param directory
	 * @param filename
	 * @param type
	 * @param startsWith
	 * @throws IOException
	 */
	private void writeImage(InputStream image, String directory, String filename, String type, final String startsWith)
			throws IOException {
		System.out.println(
				"Enter : writeImage() --> directory : " + directory + " filename : " + filename + " type : " + type);
		File directoryObj = new File(directory);
		if (!directoryObj.exists()) {
			directoryObj.mkdirs();
		} else {
			FilenameFilter beginswithm = new FilenameFilter() {
				public boolean accept(File directory, String filename) {
					return filename.startsWith(startsWith);
				}
			};
			File[] files = directoryObj.listFiles(beginswithm);
			for (File f : files) {
				System.out.println("File name to delete : " + f.getName());
				f.delete();

			}
		}
		File outputfile = new File(directory + "/" + filename);
		ImageIO.write(ImageIO.read(image), type, outputfile);
		System.out.println("Exit : writeImage()");
	}

	/**
	 * @param image
	 * @param directory
	 * @param filename
	 * @param startsWith
	 * @param isLastPage
	 * @param noOfPages
	 * @param currentPageNo
	 * @throws IOException
	 */
	private void writePDF(InputStream image, String directory, String filename, final String startsWith,
			Boolean isLastPage, String noOfPages, String currentPageNo) throws IOException {
		System.out.println("Enter : writePDF() --> directory : " + directory + " filename : " + filename
				+ " isLastPage : " + isLastPage + " noOfPages : " + noOfPages + " currentPageNo : " + currentPageNo);
		// Need to modify later
		File directoryObj = new File(directory);
		if (!directoryObj.exists()) {
			directoryObj.mkdirs();
		} else {
			FilenameFilter beginswithm = new FilenameFilter() {
				public boolean accept(File directory, String filename) {
					return filename.startsWith(startsWith);
				}
			};
			File[] files = directoryObj.listFiles(beginswithm);
			for (File f : files) {
				System.out.println("File name to delete : " + f.getName());
				f.delete();
			}
		}
		File outputfile = new File(directory + "/" + filename);
		ImageIO.write(ImageIO.read(image), "jpg", outputfile);
		System.out.println("Exit : writePDF()");
	}

}
