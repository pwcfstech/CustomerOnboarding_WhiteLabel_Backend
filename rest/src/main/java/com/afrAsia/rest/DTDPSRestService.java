package com.afrAsia.rest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.UriInfo;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.springframework.stereotype.Component;

import com.afrAsia.entities.response.DailyTxnDataListResponse;
import com.afrAsia.entities.response.DailyTxnDataResponse;
import com.afrAsia.service.DTDPSService;

@Component
@Path("DigitalTransaction")
public class DTDPSRestService
{
    private DTDPSService dtdpsService;

    public DTDPSService getDtdpsService()
    {
        return dtdpsService;
    }

    public void setDtdpsService(DTDPSService dtdpsService)
    {
        this.dtdpsService = dtdpsService;
    }

    @GET
    @Produces(MediaType.APPLICATION_XML)
    public DailyTxnDataListResponse getDigitalTransactions(@Context UriInfo uriInfo, @Context HttpHeaders httpHeader)
    {
        DailyTxnDataListResponse listResponse = new DailyTxnDataListResponse();
        int errorCode = -3;

        try
        {
        	MultivaluedMap<String, String> queryParams = uriInfo.getQueryParameters();
        	String username = null, password = null, dateString = null, onUsIndString = "1";
        	Integer onUsInd = 1;
        	
        	Date date = null;
        	SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy");
        	if (queryParams != null)
        	{
        		List<String> dateList = queryParams.get("TRANSACTION_DATE");
        		List<String> userList = queryParams.get("USERNAME");
        		List<String> passwordList = queryParams.get("PASSWORD");
        		List<String> onUsIndList = queryParams.get("ON_US_IND");
        		
        		if (userList == null || userList.isEmpty() || !userList.get(0).equals("UBI"))
        		{
        			errorCode = -2;
        			throw new IllegalStateException("USERNAME not entered");
        		}
        		else
        		{
        			username = userList.get(0);
        		}
        		
        		if (passwordList == null || passwordList.isEmpty() || !passwordList.get(0).equals("uB1s3rv1c3"))
        		{
        			errorCode = -2;
        			throw new IllegalStateException("PASSWORD not entered");
        		}
        		else
        		{
        			password = passwordList.get(0);
        		}
        		
        		if (dateList == null || dateList.isEmpty())
        		{
        			errorCode = -1;
        			throw new IllegalStateException("TRANSACTION_DATE not entered!");
        		}
        		{
        			try
        			{
        				dateString = dateList.get(0);
        				date = sdf.parse(dateString);
        			}
        			catch (ParseException pe)
        			{
        				errorCode = -1;
        				throw new IllegalStateException("TRANSACTION_DATE not parsable!");
        			}
        		}
        		
        		if (onUsIndList != null && !onUsIndList.isEmpty())
        		{
        			try
        			{
        				onUsIndString = onUsIndList.get(0).trim();
        				onUsInd = Integer.parseInt(onUsIndString);
        			}
        			catch(Exception e)
        			{
        				e.printStackTrace();
        				System.out.println("ON_US_IND not parsable!");
        			}
        		}
        	}
        	
        	System.out.println("Username : " + username);
        	System.out.println("Password : " + password);
        	System.out.println("Date : " + date);
        	
            List<DailyTxnDataResponse> response = dtdpsService.fetchTransactions(date, onUsInd);
            listResponse.setTransactions(response);
            
//            System.out.println("Response size: " + listResponse);
        } 
        catch (Exception e)
        {
        	System.out.println(e.getMessage());
            e.printStackTrace();
            listResponse.setErrorCode(errorCode);
        }

        return listResponse;
    }
}
