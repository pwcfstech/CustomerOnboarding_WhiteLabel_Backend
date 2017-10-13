
package com.afrAsia.service.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
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

	final static Logger debugLog = Logger.getLogger("debugLogger");
	final static Logger infoLog = Logger.getLogger("infoLogger");
	final static Logger errorLog = Logger.getLogger("errorLogger");
	
	
	private static final String SIGNATURE = "Signature";
	private static final String STATUS_UNDER_PROCESSING = "Under Processing";
	private static final String SIG_PATH = "./Afrasia_Docs/Signature/";
	private static final String DMSDOCS_PATH = "./Afrasia_Docs/dmsdocs/";
	private static final String SIG_DEST_PATH = "./Afrasia_Docs_Flex/Signature/";
	private static final String DMSDOCS_DEST_PATH = "./Afrasia_Docs_Flex/dmsdocs/";
	
	/*private static final String SIG_PATH = "./Afrasia_Docs_RmApp/Signature/";
	private static final String DMSDOCS_PATH = "./Afrasia_Docs_RmApp/dmsdocs/";
	private static final String SIG_DEST_PATH = "./Afrasia_Docs/Signature/";
	private static final String DMSDOCS_DEST_PATH = "./Afrasia_Docs/dmsdocs/";*/
	

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
	 * com.afrAsia.service.KYCServiceuploadKYC(com.afrAsia.entities.request.
	 * KYCDataRequest, java.io.InputStream)
	 */
	@Transactional(readOnly = false, rollbackFor = {Exception.class})
	public KYCResponse uploadKYC(KYCDataRequest kycDataRequest, InputStream image) {
		
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
				
				MobApplicantPersonalDetail mobApplicantPersonalDetail =  applicationDetailsDAO.getMobApplicantPersonalDetails(appId,applicantId);
				if(null != mobApplicantPersonalDetail) {
					firstName = mobApplicantPersonalDetail.getFirstName();
					lastName = mobApplicantPersonalDetail.getLastName();
				}
				
				debugLog.debug("appId : " + appId + ", applicantId : " + applicantId + ", docId : " + docId
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
					sharedPath = sharedPathBuffer.append(SIG_PATH).append(applicantId).toString();
					directory = directoryBuffer.append(SIG_PATH).append(applicantId).toString();
					startsWith = filenameBuffer.append(appId).append("_").append(applicantId).append("_").append(firstName).append("_").append(lastName).append("_").append(docId).append("_").toString();
					filename = filenameBuffer.append(date).append(".jpg").toString();
					
					this.cleanDirectory(ignorePrevious, directory);
					this.writeImage(image, directory, filename, "jpg", startsWith);
				} else {
					sharedPath = sharedPathBuffer.append(DMSDOCS_PATH).append(applicantId).toString();
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
				errorLog.error("Error : KYCServiceuploadKYC()", e);
				e.printStackTrace();
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
			errorLog.error("Invalid input data in uploadKYC()");
		}

		response.setData(data);
		debugLog.debug("response : "+response);
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
					|| (!kycDataRequest.getIsLastPage() && noOfPages >= currentPageNo))
					&& ((kycDataRequest.getIgnorePrevious() && currentPageNo == 1)
							|| (!kycDataRequest.getIgnorePrevious()))) {
				isValid = true;
			}
			
		}
		debugLog.debug("isValid : " + isValid + " kycDataRequest : " + kycDataRequest + " image : " + image);
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
		File directoryObj = new File(directory);
		if (!directoryObj.exists()) {
			directoryObj.mkdirs();
		} else {
			File[] files = this.findExistingFiles(startsWith, directoryObj);
			this.deleteFiles(files);
		}
		File outputfile = new File(directory + "/" + filename);
		ImageIO.write(ImageIO.read(image), type, outputfile);
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

		File directoryObj = new File(directory);
		boolean isNew = false;
		if (!directoryObj.exists()) {
			directoryObj.mkdirs();
			isNew = true;
		} else {
			File[] files = this.findExistingFiles(startsWith, directoryObj);
			int currentPage = Integer.valueOf(currentPageNo);

			if (!ignorePrevious && currentPage > 1 && files.length >= 1) {
				PdfReader reader = null;
				PdfStamper stamper = null;
				File f = files[0];

				try {
					reader = new PdfReader(f.getCanonicalPath());
					stamper = new PdfStamper(reader, new FileOutputStream(directory + "/tmp" + filename));
					Image img = Image.getInstance(ImageIO.read(image), null);

					if (reader.getNumberOfPages() >= currentPage) {
						/*PdfContentByte under = stamper.getUnderContent(currentPage);
						under.reset();
						this.addImagetoCurrentPage(img, under);*/
						errorLog.error("Page : " + currentPage + " is already added in pdf.");
						throw new Exception("Page : " + currentPage + " is already added in pdf.");
						
					} else if (reader.getNumberOfPages() + 1 == currentPage) {
						stamper.insertPage(reader.getNumberOfPages() + 1,  reader.getPageSizeWithRotation(1));
						PdfContentByte under = stamper.getUnderContent(currentPage);
						this.addImagetoCurrentPage(img, under);
						
					} else {
						errorLog.error("'currentPageNo' should be " + (reader.getNumberOfPages() + 1));
						throw new Exception("'currentPageNo' should be " + (reader.getNumberOfPages() + 1));
					}
				} finally {
					if (null != stamper) stamper.close();
					if (null != reader) reader.close();
				}
				//this.deleteFiles(files);
				if(!("/tmp" + filename).equals(f.getName())) {
					f.delete();
				}
				new File(directory + "/tmp" + filename).renameTo(new File(directory + "/" + filename));
			
			} else if (!ignorePrevious && currentPage == 1 && files.length >= 1) {
				this.deleteFiles(files);
				isNew = true;
			} else if (!ignorePrevious && currentPage > 1 && files.length < 1) {
				errorLog.error("No file exist! 'currentPageNo' should be 1 (one).");
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
		for (File f : files) {
			debugLog.debug("Deleted File name : " + f.getName());
			f.delete();
		}
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
		Document document = null;
		try {
			document = new Document(PageSize.A4);
			PdfWriter.getInstance(document, new FileOutputStream(directory + "/" + filename));
			Image img = Image.getInstance(ImageIO.read(image), null);
			
			if (img.getWidth() > PageSize.A4.getWidth() - 100) {
				float scaler = ((PageSize.A4.getWidth() - 100) / img.getWidth()) * 100;
				img.scalePercent(scaler);
				img.setAbsolutePosition(50, PageSize.A4.getHeight() - 50 - (img.getHeight() * scaler / 100));
			} else {
				img.setAbsolutePosition(50, PageSize.A4.getHeight() - 50 - img.getHeight());
			}
			debugLog.debug("img.getHeight() : " + img.getHeight() + "img.getWidth() : " + img.getWidth());
			document.open();
			document.add(img);
		} finally {
			if(null != document) {
				document.close();
			}
		}
	}
	
	
	
	/**
	 * @param appId
	 * @param applicantId
	 * @param cif
	 * @param recordNo
	 * @param rmId
	 * @throws IOException
	 */
	@Transactional(readOnly = false, rollbackFor = {Exception.class})
	public void copyKYCFiles(Long appId, Long applicantId, Long cif, Long recordNo, String rmId, Boolean isMinor) throws IOException {
		debugLog.debug("appId : " + appId + ", applicantId : " + applicantId);
		
		StringBuffer dmsdocsDirectoryBuffer = new StringBuffer();
		StringBuffer sigDirectoryBuffer = new StringBuffer();
		StringBuffer dmsdocSsharedPathBuffer = new StringBuffer();
		StringBuffer sigSharedPathBuffer = new StringBuffer();

		String sourceDmsdocsDirectoryName = dmsdocsDirectoryBuffer.append(DMSDOCS_PATH).append(applicantId).toString();
		String sourceSigDirectoryName = sigDirectoryBuffer.append(SIG_PATH).append(applicantId).toString();
		
		dmsdocsDirectoryBuffer = new StringBuffer();
		sigDirectoryBuffer =  new StringBuffer();
		String destDmsdocsDirectoryName = dmsdocsDirectoryBuffer.append(DMSDOCS_PATH).append(cif).toString();
		String desteSigDirectoryName = sigDirectoryBuffer.append(SIG_PATH).append(cif).toString();
		String dmsdocsSharedPath = dmsdocSsharedPathBuffer.append(DMSDOCS_DEST_PATH).append(cif).toString();
		String sigSharedPath = sigSharedPathBuffer.append(SIG_DEST_PATH).append(cif).toString();
		
		
		File destDmsdocsDirectory = new File(destDmsdocsDirectoryName);
		if (!destDmsdocsDirectory.exists()) {
			destDmsdocsDirectory.mkdirs();
		}
		
		File desteSigDirectory = new File(desteSigDirectoryName);
		if (!desteSigDirectory.exists()) {
			desteSigDirectory.mkdirs();
		}

		File dmsdocsDirectory = new File(sourceDmsdocsDirectoryName);
		File[] dmsdocsfList = dmsdocsDirectory.listFiles();
		
		File sigDirectory = new File(sourceSigDirectoryName);
		File[] sigfList = sigDirectory.listFiles();
		Date now = new Date(); 
		String date = new SimpleDateFormat("ddMMyyyy").format(now);
		MobApplicantKycDocuments kycDocs = null;
		File destFile = null;
		String filename = null;
		String docId = null;

		if(dmsdocsfList!=null && dmsdocsfList.length>0)
		{
			for (File dmsdocsFile : dmsdocsfList) {
				debugLog.debug("dmsdocsFileName: "+dmsdocsFile.getName());
				// AppId_ApplicantId_FN_LN_DocumentId_Date(DD-MM-YYY)_Time(HH-MM).pdf
				// <DocumentId>_<Date in DDMMYYYY>
				docId = dmsdocsFile.getName().split("_")[4];
				filename = new StringBuffer().append(docId).append("_").append(date).append(".pdf").toString();
				destFile = new File(destDmsdocsDirectoryName + "/" + filename);
				this.copyFile(dmsdocsFile, destFile);
	
				kycDocs = new MobApplicantKycDocuments();
				kycDocs.setId(new KycTableCompositePK());
				kycDocs.getId().setId(appId);
				kycDocs.getId().setApplicantId(applicantId);
				kycDocs.getId().setDocId(docId);
				kycDocs.setRecordId(recordNo);
				kycDocs.setDocUrl(dmsdocsSharedPath + "/" + filename);
				kycDocs.setCreatedBy(rmId);
				kycDocs.setCreatedDate(now);
				kycDocs.setModifiedBy(rmId);
				kycDocs.setModifiedDate(now);
	
				uploadKYCDao.saveKYCDocLocation(kycDocs);
			}
		}
				
		if(!isMinor || (sigfList!=null && sigfList.length>0))
		{
			for (File sigFile : sigfList) {
				// AppId_ApplicantId_FN_LN_DocumentId_Date(DD-MM-YYY)_Time(HH-MM).jpg
				// CIF_Sig_<Date in DDMMYYY>
				filename = new StringBuffer().append(cif).append("_Sig_").append(date).append(".jpg").toString();
				destFile = new File(desteSigDirectoryName + "/" + filename);
				this.copyFile(sigFile, destFile);
	
				kycDocs = new MobApplicantKycDocuments();
				kycDocs.setId(new KycTableCompositePK());
				kycDocs.getId().setId(appId);
				kycDocs.getId().setApplicantId(applicantId);
				kycDocs.getId().setDocId(SIGNATURE);
				kycDocs.setRecordId(recordNo);
				kycDocs.setDocUrl(sigSharedPath + "/" + filename);
				kycDocs.setCreatedBy(rmId);
				kycDocs.setCreatedDate(now);
				kycDocs.setModifiedBy(rmId);
				kycDocs.setModifiedDate(now);
	
				uploadKYCDao.saveKYCDocLocation(kycDocs);
			}
		}
	}
	
	/**
	 * @param sourceFile
	 * @param destFile
	 * @throws IOException
	 */
	private void copyFile(File sourceFile, File destFile) throws IOException {
		InputStream inStream = null;
		OutputStream outStream = null;
		debugLog.debug("Enter : copyFile() sourceFile : "+sourceFile.getName()+", destFile : "+destFile.getName());
		try {
			inStream = new FileInputStream(sourceFile);
			outStream = new FileOutputStream(destFile);

			byte[] buffer = new byte[1024];
			int length;
			while ((length = inStream.read(buffer)) > 0) {
				outStream.write(buffer, 0, length);
			}
			infoLog.info("File is copied successful!");
		} finally {
			if (null != inStream) inStream.close();
			if (null != outStream) outStream.close();
		}
		infoLog.info("Exit copyFile()");
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
//	 * com.afrAsia.service.KYCServiceuploadKYC(com.afrAsia.entities.request.
//	 * KYCDataRequest, java.io.InputStream)
//	 */
//	@Transactional(readOnly = false, rollbackFor = {Exception.class})
//	public KYCResponse uploadKYC(KYCDataRequest kycDataRequest, InputStream image) {
//		if (logger.isDebugEnabled()) {
//			logger.info("Enter : KYCServiceuploadKYC()");
//		}
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
//				
//				MobApplicantPersonalDetail mobApplicantPersonalDetail =  applicationDetailsDAO.getMobApplicantPersonalDetails(appId,applicantId);
//				if(null != mobApplicantPersonalDetail) {
//					firstName = mobApplicantPersonalDetail.getFirstName();
//					lastName = mobApplicantPersonalDetail.getLastName();
//				}
//				
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
//				logger.error("Error : KYCServiceuploadKYC()", e);
//				e.printStackTrace();
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
//			logger.info("Exit : KYCServiceuploadKYC()");
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
//				f.delete();
//
//			}
//		}
//		File outputfile = new File(directory + "/" + filename);
//		ImageIO.write(ImageIO.read(image), type, outputfile);
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
//				f.delete();
//			}
//		}
//		File outputfile = new File(directory + "/" + filename);
//		ImageIO.write(ImageIO.read(image), "jpg", outputfile);
//	}
//
//}

