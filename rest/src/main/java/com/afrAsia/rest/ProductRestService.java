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
		System.out.println("productService.getProducts().......1.....there's no product");
		genericResponse=null;
		}
		else{
		genericResponse=productService.getProducts();
		}
		return Response.ok(genericResponse, MediaType.APPLICATION_JSON).build();

	}
	
	@POST
	@Path("/getProductDetailsApp")
	//@Consumes(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response getProdDetails(String jsonInput) 
	{
		/*String productId = "";
		logger.info(jsonInput);
		System.out.println(jsonInput);*/
		
		GenericRequest req = new GenericRequest();
		ObjectMapper mapper = new ObjectMapper();
		try {
			System.out.println("jsonInput is ============="+jsonInput);
			req = mapper.readValue(jsonInput, GenericRequest.class);
			System.out.println("ProductID from req============="+req.getData().getProductID());
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("ProductID is ==============");
		String id=req.getData().getProductID(); 
		System.out.println("ProductID=============="+id);
		GenericResponse genericResponse=productService.getProductById(Long.parseLong(id));
		return Response.ok(genericResponse, MediaType.APPLICATION_JSON).build();

	}
	/*public static void main(String[] args) throws Exception
	{
		GenericRequest req = new GenericRequest();
		req.setMsgHeader(null);
		Data data = new Data();
		data.setProductID("prod1");
		req.setData(data);
		ObjectMapper mapper = new ObjectMapper();
		String jsonInput = mapper.writeValueAsString(req);
		System.out.println(mapper.writeValueAsString(req));
		
		GenericRequest req1 = mapper.readValue(jsonInput, GenericRequest.class);
		System.out.println(req1.getData().getProductID());
		
	}*/

}
