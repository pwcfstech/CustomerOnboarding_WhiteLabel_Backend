package com.afrAsia.rest;

import java.io.File;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.core.StreamingOutput;

import org.springframework.stereotype.Component;

import com.afrAsia.service.KycDocDownloadService;
import com.afrAsia.entities.request.KycDocDownloadRequest;

/* Author : FS Tech/Neha Chandak */

@Component
@Path("{version}")
public class KycDocDownloadRestService {

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

		System.out.println("KYC Request:" + kycDocDownloadRequest);
		String filepath = kycDocDownloadService.getKycDocPath(kycDocDownloadRequest.getData().getRefNo(), kycDocDownloadRequest.getData().getApplicantRefNo(),kycDocDownloadRequest.getData().getDocId());

		//String filepath="C:/Users/nehac038/Documents/NehaDocsPersonal/ToPrint/Fitness.pdf";
		//String filepath="C:/Kabir/DSC_4212.JPG";
		String fileName=filepath.substring(filepath.lastIndexOf("/")+1, filepath.length());
		String downLoadfileName = "attachment; filename=" + fileName;

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
	                	System.out.println("Exception occoured in getKycMathod :"+e);
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
			return response.header("content-disposition",downLoadfileName)
					.build();
		}catch(Exception e){
			System.out.println("Exception occoured in getKycMathod :"+e);
			return Response.serverError().build();


		}	
	}
}
