
package com.afrAsia.service.impl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
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
import com.afrAsia.dao.jpa.DashBoardJpaDao;
import com.afrAsia.dao.jpa.UploadKYCJpaDAO;
import com.afrAsia.entities.jpa.ApplicationReference;
import com.afrAsia.entities.request.KYCDataRequest;
import com.afrAsia.entities.response.KYCDataResponse;
import com.afrAsia.entities.response.KYCResponse;
import com.afrAsia.entities.response.MessageHeader;
import com.afrAsia.entities.response.RequestError;
import com.afrAsia.entities.transactions.KycTableCompositePK;
import com.afrAsia.entities.transactions.MobApplicantKycDocuments;
import com.afrAsia.entities.transactions.MobApplicantPersonalDetail;
import com.afrAsia.service.KYCService;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;
import com.itextpdf.text.pdf.PdfWriter;

/**
 * @author mds012
 *
 */
public class KYCServiceImpl implements KYCService {
	private static final Logger logger = LoggerFactory.getLogger(KYCServiceImpl.class);

	private static final String SIGNATURE = "Signature";
	private static final String STATUS_UNDER_PROCESSING = "Under Processing";
	private static final String SIG_PATH = "C:/App_Share_IN/Afrasia_Docs/Signature/";
	private static final String DMSDOCS_PATH = "C:/App_Share_IN/Afrasia_Docs/dmsdocs/";
	private static final String SIG_SHARED_PATH = "C:/App_Share_IN/Afrasia_Docs/Signature/";
	private static final String DMSDOCS_SHARED_PATH = "C:/App_Share_IN/Afrasia_Docs/dmsdocs/";

	private UploadKYCJpaDAO uploadKYCDao;
	private ApplicationDetailsJpaDAO applicationDetailsDAO;
	private DashBoardJpaDao dashBoardDao;

	public void setDashBoardDao(DashBoardJpaDao dashBoardDao) {
		this.dashBoardDao = dashBoardDao;
	}

	public void setapplicationDetailsDAO(ApplicationDetailsJpaDAO applicationDetailsDAO) {
		this.applicationDetailsDAO = applicationDetailsDAO;
	}

	public void setUploadKYCDao(UploadKYCJpaDAO uploadKYCDao) {
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

				StringBuffer sharedPathBuffer = new StringBuffer();
				StringBuffer directoryBuffer = new StringBuffer();
				StringBuffer filenameBuffer = new StringBuffer();
				String date = new SimpleDateFormat("dd-MM-yyyy_hh-mm").format(new Date());
				String sharedPath = null;
				String directory = null;
				String startsWith = null;
				String filename = null;

				if (SIGNATURE.equals(docId)) {
					sharedPath = sharedPathBuffer.append(SIG_SHARED_PATH).append(applicantId).toString();
					directory = directoryBuffer.append(SIG_PATH).append(applicantId).toString();
					startsWith = filenameBuffer.append(appId).append("_").append(applicantId).append("_").append(firstName).append("_").append(lastName).append("_").append(docId).append("_").toString();
					filename = filenameBuffer.append(date).append(".jpg").toString();
					
					this.cleanDirectory(ignorePrevious, directory);
					this.writeImage(image, directory, filename, "jpg", startsWith);
				} else {
					sharedPath = sharedPathBuffer.append(DMSDOCS_SHARED_PATH).append(applicantId).toString();
					directory = directoryBuffer.append(DMSDOCS_PATH).append(applicantId).toString();
					startsWith = filenameBuffer.append(appId).append("_").append(applicantId).append("_").append(firstName).append("_").append(lastName).append("_").append(docId).append("_").toString();
					filename = filenameBuffer.append(date).append(".pdf").toString();

					this.cleanDirectory(ignorePrevious, directory);
					this.writePDF(image, directory, filename, startsWith, isLastPage, noOfPages, currentPageNo,ignorePrevious);
				}

				MobApplicantKycDocuments kycDocs = new MobApplicantKycDocuments();
				kycDocs.setId(new KycTableCompositePK());
				kycDocs.getId().setId(appId);
				kycDocs.getId().setApplicantId(applicantId);
				kycDocs.getId().setDocId(docId);

				kycDocs.setRecordId(recordNo);
				kycDocs.setDocUrl(sharedPath + "/" + filename);

				kycDocs.setCreatedBy(rmId);
				Date now = new Date(); 
				kycDocs.setCreatedDate(now);
				kycDocs.setModifiedBy(rmId);
				kycDocs.setModifiedDate(now);
				
				uploadKYCDao.saveKYCDocLocation(kycDocs);
				if(kycDataRequest.getIsLastPage()) {
					ApplicationReference appRef = new ApplicationReference();
					appRef.setId(appId);
					appRef.setAppStatus(STATUS_UNDER_PROCESSING); 
					appRef.setUpdatedBy(rmId);
					appRef.setUpdatedTime(now); 
					dashBoardDao.updateAppStatus(appRef);
				}
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
	 * @param ignorePrevious
	 * @param directory
	 * @throws IOException
	 */
	private void cleanDirectory(Boolean ignorePrevious, String directory) throws IOException {
		File fileDirectory = new File(directory);
		if (ignorePrevious && fileDirectory.exists()) {
			FileUtils.cleanDirectory(fileDirectory);
		}
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
				&& isInteger(kycDataRequest.getCurrentPageNo())
				&& null != kycDataRequest.getNoOfPages()
				&& isInteger(kycDataRequest.getNoOfPages())
				&& null != kycDataRequest.getIsLastPage() 
				&& null != kycDataRequest.getRecordNo()
				&& null != kycDataRequest.getRmId() 
				&& !kycDataRequest.getRmId().isEmpty()) {
			
			int currentPageNo = Integer.parseInt(kycDataRequest.getCurrentPageNo());
			int noOfPages = Integer.parseInt(kycDataRequest.getNoOfPages());
			
			if (((kycDataRequest.getIsLastPage() && noOfPages == currentPageNo)
					|| (!kycDataRequest.getIsLastPage() && noOfPages > currentPageNo))
					&& ((kycDataRequest.getIgnorePrevious() && currentPageNo == 1)
							|| (!kycDataRequest.getIgnorePrevious()))) {
				isValid = true;
			}
			
		}
		System.out.println("isValid : " + isValid + " kycDataRequest : " + kycDataRequest + " image : " + image);
		System.out.println("Exit : validateKycRequest()");
		return isValid;
	}
	
	/**
	 * @param str
	 * @return
	 */
	public static boolean isInteger(String str) {
		if (str == null) {
			return false;
		}
		int length = str.length();
		if (length == 0) {
			return false;
		}
		int i = 0;
		if (str.charAt(0) == '-') {
			if (length == 1) {
				return false;
			}
			i = 1;
		}
		for (; i < length; i++) {
			char c = str.charAt(i);
			if (c < '0' || c > '9') {
				return false;
			}
		}
		return true;
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
			File[] files = this.findExistingFiles(startsWith, directoryObj);
			this.deleteFiles(files);
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
	 * @param ignorePrevious
	 * @throws Exception
	 */
	private void writePDF(InputStream image, String directory, String filename, final String startsWith,
			Boolean isLastPage, String noOfPages, String currentPageNo, Boolean ignorePrevious) throws Exception {
		System.out.println("Enter : writePDF() --> directory : " + directory + " filename : " + filename
				+ " isLastPage : " + isLastPage + " noOfPages : " + noOfPages + " currentPageNo : " + currentPageNo);

		File directoryObj = new File(directory);
		boolean isNew = false;
		if (!directoryObj.exists()) {
			directoryObj.mkdirs();
			isNew = true;
		} else {
			File[] files = this.findExistingFiles(startsWith, directoryObj);
			int currentPage = Integer.valueOf(currentPageNo);

			System.out.println("files.length : " + files.length);

			if (!ignorePrevious && currentPage > 1 && files.length >= 1) {
				PdfReader reader = null;
				PdfStamper stamper = null;
				File f = files[0];

				try {
					System.out.println("Existing File name : " + f.getName());
					reader = new PdfReader(f.getCanonicalPath());
					stamper = new PdfStamper(reader, new FileOutputStream(directory + "/" + filename));
					Image img = Image.getInstance(ImageIO.read(image), null);

					if (reader.getNumberOfPages() >= currentPage) {
						System.out.println("myPage : " + currentPage);
						PdfContentByte under = stamper.getUnderContent(currentPage);
						under.reset();
						this.addImagetoCurrentPage(img, under);
						
					} else if (reader.getNumberOfPages() + 1 == currentPage) {
						System.out.println("add new page to reader : " + currentPage);
						stamper.insertPage(reader.getNumberOfPages() + 1, reader.getPageSizeWithRotation(1));
						PdfContentByte under = stamper.getUnderContent(currentPage);
						this.addImagetoCurrentPage(img, under);
						
					} else {
						throw new Exception("'currentPageNo' should be " + reader.getNumberOfPages() + 1);
					}
					System.out.println("NumberOfPages : " + reader.getNumberOfPages());
				} finally {
					if (null != stamper) {
						stamper.close();
					}
				}
				this.deleteFiles(files);
			
			} else if (!ignorePrevious && currentPage == 1 && files.length >= 1) {
				this.deleteFiles(files);
				isNew = true;
			} else if (!ignorePrevious && currentPage > 1 && files.length < 1) {
				throw new Exception("No file exist! 'currentPageNo' should be 1 (one).");
			} else if (!ignorePrevious && currentPage == 1 && files.length < 1) {
				isNew = true;
			} else if (ignorePrevious) {
				isNew = true;
			}

		}

		if (isNew) {
			this.createNewPDF(image, directory, filename);
		}

		System.out.println("Exit : writePDF()");
	}

	/**
	 * @param img
	 * @param under
	 * @throws DocumentException
	 */
	private void addImagetoCurrentPage(Image img, PdfContentByte under) throws DocumentException {
		if (img.getWidth() > PageSize.A4.getWidth() - 100) {
			float scaler = ((PageSize.A4.getWidth() - 100) / img.getWidth()) * 100;
			img.scalePercent(scaler);
			img.setAbsolutePosition(50, PageSize.A4.getHeight() - 50 - (img.getHeight() * scaler / 100));
		} else {
			img.setAbsolutePosition(50, PageSize.A4.getHeight() - 50 - img.getHeight());
		}
		under.addImage(img);
	}

	/**
	 * @param startsWith
	 * @param directoryObj
	 * @return
	 */
	private File[] findExistingFiles(final String startsWith, File directoryObj) {
		FilenameFilter beginswithm = new FilenameFilter() {
			public boolean accept(File directory, String filename) {
				return filename.startsWith(startsWith);
			}
		};
		File[] files = directoryObj.listFiles(beginswithm);
		return files;
	}

	/**
	 * @param files
	 */
	private void deleteFiles(File[] files) {
		System.out.println("Enter : deleteFiles()");
		for (File f : files) {
			System.out.println("Deleted File name : " + f.getName());
			f.delete();
		}
		System.out.println("Exit : deleteFiles()");
	}

	/**
	 * @param image
	 * @param directory
	 * @param filename
	 * @throws DocumentException
	 * @throws FileNotFoundException
	 * @throws BadElementException
	 * @throws IOException
	 */
	private void createNewPDF(InputStream image, String directory, String filename)	throws DocumentException, FileNotFoundException, BadElementException, IOException {
		System.out.println("Enter : createNewPDF()");
		Document document = null;
		try {
			document = new Document(PageSize.A4);
			PdfWriter.getInstance(document, new FileOutputStream(directory + "/" + filename));
			Image img = Image.getInstance(ImageIO.read(image), null);
			System.out.println("img.getHeight() : " + img.getHeight() + "img.getWidth() : " + img.getWidth());
			if (img.getWidth() > PageSize.A4.getWidth() - 100) {
				float scaler = ((PageSize.A4.getWidth() - 100) / img.getWidth()) * 100;
				img.scalePercent(scaler);
				img.setAbsolutePosition(50, PageSize.A4.getHeight() - 50 - (img.getHeight() * scaler / 100));
			} else {
				img.setAbsolutePosition(50, PageSize.A4.getHeight() - 50 - img.getHeight());
			}
			System.out.println("img.getHeight() : " + img.getHeight() + "img.getWidth() : " + img.getWidth());
			document.open();
			document.add(img);
		} finally {
			if(null != document) {
				document.close();
			}
		}
		System.out.println("Exit : createNewPDF()");
	}

}
//=======
//package com.afrAsia.service.impl;
//
//import java.io.File;
//import java.io.FilenameFilter;
//import java.io.IOException;
//import java.io.InputStream;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
//import javax.imageio.ImageIO;
//
//import org.apache.commons.io.FileUtils;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.transaction.annotation.Transactional;
//
//import com.afrAsia.dao.jpa.ApplicationDetailsJpaDAO;
//import com.afrAsia.dao.jpa.UploadKYCDao;
//import com.afrAsia.entities.request.KYCDataRequest;
//import com.afrAsia.entities.response.KYCDataResponse;
//import com.afrAsia.entities.response.KYCResponse;
//import com.afrAsia.entities.response.MessageHeader;
//import com.afrAsia.entities.response.RequestError;
//import com.afrAsia.entities.transactions.KycTableCompositePK;
//import com.afrAsia.entities.transactions.MobApplicantKycDocuments;
//import com.afrAsia.entities.transactions.MobApplicantPersonalDetail;
//import com.afrAsia.service.KYCService;
//
///**
// * @author mds012
// *
// */
//public class KYCServiceImpl implements KYCService {
//	private static final Logger logger = LoggerFactory.getLogger(KYCServiceImpl.class);
//
//	private final String SIGNATURE = "Signature";
////	private final String SIG_SHARED_PATH = "/Signature/";
////	private final String DMSDOCS_SHARED_PATH = "/dmsdocs/";
//	
//	/*private final String SIG_SHARED_PATH = "C:/Signature/";
//	private final String DMSDOCS_SHARED_PATH = "C:/dmsdocs/";*/
//	
//	private final String SIG_SHARED_PATH = "C:/App_Share_IN/Afrasia_Docs/Signature/";
//	private final String DMSDOCS_SHARED_PATH = "C:/App_Share_IN/Afrasia_Docs/dmsdocs/"; 
//
//	private UploadKYCDao uploadKYCDao;
//
//	private ApplicationDetailsJpaDAO applicationDetailsDAO;
//
//	public ApplicationDetailsJpaDAO getApplicationDetailsDAO() {
//		return applicationDetailsDAO;
//	}
//
//	public void setapplicationDetailsDAO(ApplicationDetailsJpaDAO applicationDetailsDAO) {
//		this.applicationDetailsDAO = applicationDetailsDAO;
//	}
//
//	public UploadKYCDao getUploadKYCDao() {
//		return uploadKYCDao;
//	}
//
//	public void setUploadKYCDao(UploadKYCDao uploadKYCDao) {
//		this.uploadKYCDao = uploadKYCDao;
//	}
//
//	/*
//	 * (non-Javadoc)
//	 * 
//	 * @see
//	 * com.afrAsia.service.KYCService#uploadKYC(com.afrAsia.entities.request.
//	 * KYCDataRequest, java.io.InputStream)
//	 */
//	@Transactional(readOnly = false, rollbackFor = {Exception.class})
//	public KYCResponse uploadKYC(KYCDataRequest kycDataRequest, InputStream image) {
//		if (logger.isDebugEnabled()) {
//			logger.info("Enter : KYCService#uploadKYC()");
//		}
//		System.out.println("Enter : KYCService#uploadKYC()");
//		KYCResponse response = new KYCResponse();
//		KYCDataResponse data = new KYCDataResponse();
//		if (this.validateKycRequest(kycDataRequest, image)) {
//			try {
//				Long appId = kycDataRequest.getAppId();
//				Long applicantId = kycDataRequest.getApplicantId();
//				String docId = kycDataRequest.getDocId();
//				Boolean ignorePrevious = kycDataRequest.getIgnorePrevious();
//				Boolean isLastPage = kycDataRequest.getIsLastPage();
//				String noOfPages = kycDataRequest.getNoOfPages();
//				String currentPageNo = kycDataRequest.getCurrentPageNo();
//				String rmId = kycDataRequest.getRmId();
//				Long recordNo = kycDataRequest.getRecordNo();
//				String firstName = null;
//				String lastName = null;
//				System.out.println("appId : " + appId + ", applicantId : " + applicantId);
//				
//				MobApplicantPersonalDetail mobApplicantPersonalDetail =  applicationDetailsDAO.getMobApplicantPersonalDetails(appId,applicantId);
//				System.out.println("mobApplicantPersonalDetail : " + mobApplicantPersonalDetail);
//				if(null != mobApplicantPersonalDetail) {
//					firstName = mobApplicantPersonalDetail.getFirstName();
//					lastName = mobApplicantPersonalDetail.getLastName();
//				}
//				
//				System.out.println("appId : " + appId + ", applicantId : " + applicantId + ", docId : " + docId
//						+ ", ignorePrevious : " + ignorePrevious + ", isLastPage : " + isLastPage + ", noOfPages : "
//						+ noOfPages + ", currentPageNo : " + currentPageNo+", firstName : "+firstName+", lastName : "+lastName);
//				
//				// Signature file format :
//				// AppId_ApplicantId_FN_LN_DocumentId_Date(DD-MM-YYY)_Time(HH-MM).jpg
//				// Path : /Signature/ApplicantId
//				// PDF Document file format :
//				// AppId_ApplicantId_FN_LN_DocumentId_Date(DD-MM-YYY)_Time(HH-MM).pdf
//				// Path : /dmsdocs/ApplicantId
//
//				StringBuffer directoryBuffer = new StringBuffer();
//				StringBuffer filenameBuffer = new StringBuffer();
//				String date = new SimpleDateFormat("dd-MM-yyyy_hh-mm").format(new Date());
//				String directory = null;
//				String startsWith = null;
//				String filename = null;
//
//				if (SIGNATURE.equals(docId)) {
//					directory = directoryBuffer.append(SIG_SHARED_PATH).append(applicantId).toString();
//					startsWith = filenameBuffer.append(appId).append("_").append(applicantId).append("_").append(firstName).append("_").append(lastName).append("_").append(docId).append("_").toString();
//					filename = filenameBuffer.append(date).append(".jpg").toString();
//					File fileDirectory = new File(directory);
//					if (ignorePrevious && fileDirectory.exists()) {
//						FileUtils.cleanDirectory(fileDirectory);
//					}
//					this.writeImage(image, directory, filename, "jpg", startsWith);
//				} else {
//					directory = directoryBuffer.append(DMSDOCS_SHARED_PATH).append(applicantId)
//							.toString();
//					startsWith = filenameBuffer.append(appId).append("_").append(applicantId).append("_").append(firstName)
//							.append("_").append(lastName).append("_").append(docId).append("_").toString();
//					filename = filenameBuffer.append(date).append(".jpg").toString(); // Need to remove later
//					// .append(".pdf").toString();
//
//					File fileDirectory = new File(directory);
//					if (ignorePrevious && fileDirectory.exists()) {
//						FileUtils.cleanDirectory(fileDirectory);
//					}
//
//					this.writePDF(image, directory, filename, startsWith, isLastPage, noOfPages, currentPageNo);
//				}
//
//				MobApplicantKycDocuments kycDocs = new MobApplicantKycDocuments();
//				kycDocs.setId(new KycTableCompositePK());
//				kycDocs.getId().setId(appId);
//				kycDocs.getId().setApplicantId(applicantId);
//				kycDocs.getId().setDocId(docId);
//				kycDocs.setRecordId(recordNo);
//				kycDocs.setDocUrl(directory + "/" + filename);
//				kycDocs.setCreatedBy(rmId);
//				Date now = new Date(); 
//				kycDocs.setCreatedDate(now);
//				kycDocs.setModifiedBy(rmId);
//				kycDocs.setModifiedDate(now);
//				
//				uploadKYCDao.saveKYCDocLocation(kycDocs);
//				data.setSuccess("1");
//			} catch (Exception e) {
//				logger.error("Error : KYCService#uploadKYC()", e);
//				e.printStackTrace();
//				System.out.println("Error : KYCService#uploadKYC() "+ e);
//				MessageHeader msgHeader = new MessageHeader();
//				RequestError error = new RequestError();
//				error.setCd("002");
//				error.setCustomCode("ERR002");
//				error.setRsn("Server error : "+e);
//				msgHeader.setError(error);
//				response.setMsgHeader(msgHeader);
//				data.setSuccess("0");
//			}
//		} else {
//			MessageHeader msgHeader = new MessageHeader();
//			RequestError error = new RequestError();
//			error.setCd("001");
//			error.setCustomCode("ERR001");
//			error.setRsn("Invalid request for KYC upload.");
//			msgHeader.setError(error);
//			response.setMsgHeader(msgHeader);
//			data.setSuccess("0");
//			if (logger.isDebugEnabled()) {
//				logger.info("Invalid input data in uploadKYC()");
//			}
//		}
//
//		response.setData(data);
//		if (logger.isDebugEnabled()) {
//			logger.info("Exit : KYCService#uploadKYC()");
//		}
//		return response;
//	}
//
//	/**
//	 * @param kycDataRequest
//	 * @param image
//	 * @return
//	 */
//	private boolean validateKycRequest(KYCDataRequest kycDataRequest, InputStream image) {
//		System.out.println("Enter : validateKycRequest()");
//		boolean isValid = false;
//		if (null != kycDataRequest 
//				&& null != image 
//				&& null != kycDataRequest.getAppId()
//				&& null != kycDataRequest.getApplicantId() 
//				&& null != kycDataRequest.getDocId()
//				&& null != kycDataRequest.getIgnorePrevious() 
//				&& null != kycDataRequest.getCurrentPageNo()
//				&& !kycDataRequest.getCurrentPageNo().isEmpty() 
//				&& null != kycDataRequest.getNoOfPages()
//				&& null != kycDataRequest.getIsLastPage() 
//				&& null != kycDataRequest.getRecordNo()
//				&& null != kycDataRequest.getRmId() 
//				&& !kycDataRequest.getRmId().isEmpty()) {
//			isValid = true;
//		}
//		System.out.println("isValid : " + isValid + " kycDataRequest : " + kycDataRequest + " image : " + image);
//		System.out.println("Exit : validateKycRequest()");
//		return isValid;
//	}
//
//	/**
//	 * @param image
//	 * @param directory
//	 * @param filename
//	 * @param type
//	 * @param startsWith
//	 * @throws IOException
//	 */
//	private void writeImage(InputStream image, String directory, String filename, String type, final String startsWith)
//			throws IOException {
//		System.out.println(
//				"Enter : writeImage() --> directory : " + directory + " filename : " + filename + " type : " + type);
//		File directoryObj = new File(directory);
//		if (!directoryObj.exists()) {
//			directoryObj.mkdirs();
//		} else {
//			FilenameFilter beginswithm = new FilenameFilter() {
//				public boolean accept(File directory, String filename) {
//					return filename.startsWith(startsWith);
//				}
//			};
//			File[] files = directoryObj.listFiles(beginswithm);
//			for (File f : files) {
//				System.out.println("File name to delete : " + f.getName());
//				f.delete();
//
//			}
//		}
//		File outputfile = new File(directory + "/" + filename);
//		ImageIO.write(ImageIO.read(image), type, outputfile);
//		System.out.println("Exit : writeImage()");
//	}
//
//	/**
//	 * @param image
//	 * @param directory
//	 * @param filename
//	 * @param startsWith
//	 * @param isLastPage
//	 * @param noOfPages
//	 * @param currentPageNo
//	 * @throws IOException
//	 */
//	private void writePDF(InputStream image, String directory, String filename, final String startsWith,
//			Boolean isLastPage, String noOfPages, String currentPageNo) throws IOException {
//		System.out.println("Enter : writePDF() --> directory : " + directory + " filename : " + filename
//				+ " isLastPage : " + isLastPage + " noOfPages : " + noOfPages + " currentPageNo : " + currentPageNo);
//		// Need to modify later
//		File directoryObj = new File(directory);
//		if (!directoryObj.exists()) {
//			directoryObj.mkdirs();
//		} else {
//			FilenameFilter beginswithm = new FilenameFilter() {
//				public boolean accept(File directory, String filename) {
//					return filename.startsWith(startsWith);
//				}
//			};
//			File[] files = directoryObj.listFiles(beginswithm);
//			for (File f : files) {
//				System.out.println("File name to delete : " + f.getName());
//				f.delete();
//			}
//		}
//		File outputfile = new File(directory + "/" + filename);
//		ImageIO.write(ImageIO.read(image), "jpg", outputfile);
//		System.out.println("Exit : writePDF()");
//	}
//
//}

