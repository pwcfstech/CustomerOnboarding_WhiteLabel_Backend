package com.afrAsia.rest;

import java.io.IOException;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.afrAsia.entities.request.GenericRequest;
import com.afrAsia.entities.response.GenericResponse;
import com.afrAsia.service.ProductService;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
@Path("{version}")
public class ProductRestService 
{

	final static Logger debugLog = Logger.getLogger("debugLogger");
	final static Logger infoLog = Logger.getLogger("infoLogger");
	final static Logger errorLog = Logger.getLogger("errorLogger");
	
	private ProductService productService;

	public ProductService getProductService() {
		return productService;
	}

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

	@GET
	@Path("/getProdCatListApp")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getProdList() 
	{
		infoLog.info("Enter in getProdCatListApp service");
		GenericResponse genericResponse=null;
		if(productService.getProducts()==null){
			debugLog.debug("genericResponse is null");
		genericResponse=null;
		}
		else{
		genericResponse=productService.getProducts();
		}
		debugLog.debug(" genericResponse : getProdCatListApp Service :: "+genericResponse);
		infoLog.info("Exit from getProdCatListApp service");
		return Response.ok(genericResponse, MediaType.APPLICATION_JSON).build();

	}
	
	@POST
	@Path("/getProductDetailsApp")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response getProdDetails(String jsonInput) 
	{
		infoLog.info("Enter in getProdDetails service");
		debugLog.debug(" jsonInput from Request in getProdDetails Service :: "+jsonInput);
		GenericRequest req = new GenericRequest();
		ObjectMapper mapper = new ObjectMapper();
		try {
			req = mapper.readValue(jsonInput, GenericRequest.class);
		} catch (JsonParseException e) {
			errorLog.error(" JsonParseException : ",e);
		} catch (JsonMappingException e) {
			errorLog.error(" JsonMappingException : ",e);
		} catch (IOException e) {
			errorLog.error(" IOException : ",e);
		}
		String id=req.getData().getProductID(); 
		GenericResponse genericResponse=productService.getProductById(Long.parseLong(id));
		debugLog.debug(" genericResponse : getProdDetails Service :: "+genericResponse);
		infoLog.info("Exit from getProdDetails service");
		return Response.ok(genericResponse, MediaType.APPLICATION_JSON).build();
	}
}
