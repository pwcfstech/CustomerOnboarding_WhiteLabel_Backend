package com.afrAsia.rest;

import java.io.IOException;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

	private static final Logger logger = LoggerFactory.getLogger(ProductRestService.class);
	
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
		GenericResponse genericResponse=null;
		if(productService.getProducts()==null){
		genericResponse=null;
		}
		else{
		genericResponse=productService.getProducts();
		}
		logger.info("############ genericResponse in getProdList is : "+genericResponse);
		return Response.ok(genericResponse, MediaType.APPLICATION_JSON).build();

	}
	
	@POST
	@Path("/getProductDetailsApp")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response getProdDetails(String jsonInput) 
	{
		logger.info("############ jsonInput from Request in getProdDetails is : "+jsonInput);
		GenericRequest req = new GenericRequest();
		ObjectMapper mapper = new ObjectMapper();
		try {
			req = mapper.readValue(jsonInput, GenericRequest.class);
		} catch (JsonParseException e) {
			logger.error("############ JsonParseException : "+e.getMessage());
			e.printStackTrace();
		} catch (JsonMappingException e) {
			logger.error("############ JsonMappingException : "+e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			logger.error("############ IOException : "+e.getMessage());
			e.printStackTrace();
		}
		String id=req.getData().getProductID(); 
		GenericResponse genericResponse=productService.getProductById(Long.parseLong(id));
		logger.info("############ genericResponse in getProdDetails is : "+genericResponse);
		return Response.ok(genericResponse, MediaType.APPLICATION_JSON).build();
	}
}
