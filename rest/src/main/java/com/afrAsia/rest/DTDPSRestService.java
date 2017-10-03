package com.afrAsia.rest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
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

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.afrAsia.entities.response.DailyTxnDataListResponse;
import com.afrAsia.entities.response.DailyTxnDataResponse;
import com.afrAsia.service.DTDPSService;

@Component
@Path("DigitalTransaction")
public class DTDPSRestService
{
	
	final static Logger debugLog = Logger.getLogger("debugLogger");
	final static Logger infoLog = Logger.getLogger("infoLogger");
	final static Logger errorLog = Logger.getLogger("errorLogger");
	
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
    	infoLog.info("Entered in getDigitalTransactions(),DTDPSRestService");
    	debugLog.debug(" uriInfo :: "+uriInfo+" ,"+"httpHeader :: "+httpHeader);
        
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
        			errorLog.error(" USERNAME not entered");
        			throw new IllegalStateException("USERNAME not entered");
        		}
        		else
        		{
        			username = userList.get(0);
        		}
        		
        		if (passwordList == null || passwordList.isEmpty() || !passwordList.get(0).equals("uB1s3rv1c3"))
        		{
        			errorCode = -2;
        			errorLog.error(" PASSWORD not entered");
        			throw new IllegalStateException("PASSWORD not entered");
        		}
        		else
        		{
        			password = passwordList.get(0);
        		}
        		
        		if (dateList == null || dateList.isEmpty())
        		{
        			errorCode = -1;
        			errorLog.error(" TRANSACTION_DATE not parsable!");
        			throw new IllegalStateException("TRANSACTION_DATE not parsable!");
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
        				errorLog.error(" TRANSACTION_DATE not parsable!"+pe.getMessage());
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
        				errorLog.error(" ON_US_IND not parsable! ",e);
        			}
        		}
        	}
        	
            List<DailyTxnDataResponse> response = dtdpsService.fetchTransactions(date, onUsInd);
            listResponse.setTransactions(response);
            debugLog.debug("listResponse :: "+listResponse);
        } 
        catch (Exception e)
        {
        	errorLog.error(" Exception in getDigitalTransactions(),DTDPSRestService is : ",e);
            listResponse.setErrorCode(errorCode);
            debugLog.debug("ErrorCode in listResponse :: "+listResponse.getErrorCode());
        }
        infoLog.info("Exit from getDigitalTransactions(),DTDPSRestService");
        debugLog.debug("listResponse in getDigitalTransactions(),DTDPSRestService is : "+listResponse);
        return listResponse;
    }
}
