package com.afrAsia.rest;

import java.io.File;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.afrAsia.entities.request.KycDocDownloadRequest;
import com.afrAsia.service.KycDocDownloadService;

/* Author : FS Tech/Neha Chandak */

@Component
@Path("{version}")
public class KycDocDownloadRestService {
	
	final static Logger debugLog = Logger.getLogger("debugLogger");
	final static Logger infoLog = Logger.getLogger("infoLogger");
	final static Logger errorLog = Logger.getLogger("errorLogger");

	private KycDocDownloadService kycDocDownloadService;

	public KycDocDownloadService getKycDocDownloadService() {
		return kycDocDownloadService;
	}
	public void setKycDocDownloadService(KycDocDownloadService kycDocDownloadService) {
		this.kycDocDownloadService = kycDocDownloadService;
	}

	@Override
	public String toString() {
		return "KycDocDownloadRestService [toString()=" + super.toString() + "]";
	}

	@POST
	@Path("/getKycDoc")
	@Consumes(MediaType.APPLICATION_JSON)

	/* for octet stream
	@Produces(MediaType.APPLICATION_OCTET_STREAM)
	 */
	// for direct file download as type
	@Produces({"application/pdf","image/jpeg"})
	public Response getKyCDoc(KycDocDownloadRequest kycDocDownloadRequest) {
		// write model in the and user getter method extract the key e.g model.getkey()
		// user service.getDocument( pass the key) path and set the path in filePath variable
		
		infoLog.info("Entered in getKyCDoc Service");
		debugLog.debug(" kycDocDownloadRequest in getKyCDoc Service is : "+kycDocDownloadRequest);
		
		String filepath = kycDocDownloadService.getKycDocPath(kycDocDownloadRequest.getData().getRefNo(), kycDocDownloadRequest.getData().getApplicantRefNo(),kycDocDownloadRequest.getData().getDocId());

		//String filepath="C:/Users/nehac038/Documents/NehaDocsPersonal/ToPrint/Fitness.pdf";
		//String filepath="C:/Kabir/DSC_4212.JPG";
		String fileName=filepath.substring(filepath.lastIndexOf("/")+1, filepath.length());
		String downLoadfileName = "attachment; filename=" + fileName;

		debugLog.debug("filepath :: "+filepath+", "+"fileName :: "+fileName+","+"downLoadfileName :: "+downLoadfileName);
		// way 1 :  using octet stream
		/*StreamingOutput rsFileStream= new StreamingOutput() {

			@Override
			public void write(OutputStream outputStream) throws IOException, WebApplicationException {
				 try
	                {
	                    java.nio.file.Path path = Paths.get(filepath);
	                    byte[] fileByte= Files.readAllBytes(path);
	                    outputStream.write(fileByte);
	                    outputStream.flush();
	                } 
	                catch (Exception e) 
	                {
	                    throw new WebApplicationException("Invalid file Path");
	                    return Response.serverError().build();
	                }

			}
		};

		 return Response
	                .ok(rsFileStream, MediaType.APPLICATION_OCTET_STREAM)
	                .header("content-disposition",downLoadfileName)
	                .build();*/

		// way 2 : using target file type
		try{
			File targetFile=new File(filepath);
			ResponseBuilder response = Response.ok((Object) targetFile);
			infoLog.info("Exit from getKyCDoc(),KycDocDownloadRestService");
			return response.header("content-disposition",downLoadfileName)
					.build();
		}catch(Exception e){
			errorLog.error(" Exception occoured in getKyCDoc(),KycDocDownloadRestService ",e);
			return Response.serverError().build();
		}	
	}
}
