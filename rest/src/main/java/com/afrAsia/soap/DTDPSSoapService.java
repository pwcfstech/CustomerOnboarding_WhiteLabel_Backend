package com.afrAsia.soap;

import java.io.IOException;
import java.io.StringWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamWriter;

import org.apache.log4j.Logger;

import com.afrAsia.entities.response.DailyTxnDataListResponse;
import com.afrAsia.entities.response.DailyTxnDataResponse;
import com.afrAsia.service.DTDPSService;

@WebService(name="DigitalTxs", targetNamespace="https://digitalonline.unitedbank.co.in")
@SOAPBinding(style=Style.RPC, use=Use.LITERAL, parameterStyle=ParameterStyle.WRAPPED)
public class DTDPSSoapService implements IDTDPSSoapService
{
	final static Logger debugLog = Logger.getLogger("debugLogger");
	final static Logger infoLog = Logger.getLogger("infoLogger");
	final static Logger errorLog = Logger.getLogger("errorLogger");
	
    private DTDPSService dtdpsService;

    @WebMethod(exclude = true)
    public DTDPSService getDtdpsService()
    {
        return dtdpsService;
    }

    @WebMethod(exclude = true)
    public void setDtdpsService(DTDPSService dtdpsService)
    {
        this.dtdpsService = dtdpsService;
    }

    @WebMethod(operationName = "getDigitalTransaction")
    public String getDigitalTransaction(String username, String password, String transactionDate, String onUsIndString)
    {
        DailyTxnDataListResponse listResponse = new DailyTxnDataListResponse();
        int errorCode = -3;
        StringWriter writer = null;
        XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();
        XMLStreamWriter xmlWriter = null;
        String output = "";

        try
        {
        	
        	if (onUsIndString == null || onUsIndString.trim().isEmpty())
        	{
        		onUsIndString = "1";
        	}
        	
        	Integer onUsInd = 1;
        	
        	Date date = null;
        	SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy");
        	
        		
        		if (username == null || username.trim().isEmpty() || !username.trim().equals("UBI"))
        		{
        			errorCode = -2;
        			errorLog.error("'username' not entered or incorrect.");
        			throw new IllegalStateException("'username' not entered or incorrect.");
        		}
        		
        		
        		if (password == null || password.trim().isEmpty() || !password.trim().equals("uB1s3rv1c3"))
        		{
        			errorCode = -2;
        			errorLog.error("'password' not entered");        			
        			throw new IllegalStateException("'password' not entered");
        		}
        		
        		if (transactionDate == null || transactionDate.trim().isEmpty())
        		{
        			errorCode = -1;
        			errorLog.error("'transactionDate' not entered!");
        			throw new IllegalStateException("'transactionDate' not entered!");
        		}
        		{
        			try
        			{
        				date = sdf.parse(transactionDate);
        			}
        			catch (ParseException pe)
        			{
        				errorCode = -1;
        				errorLog.error("'transactionDate' not parsable!");
        				throw new IllegalStateException("'transactionDate' not parsable!");
        			}
        		}
        		
        		if (onUsIndString != null && !onUsIndString.isEmpty())
        		{
        			try
        			{
        				onUsIndString = onUsIndString.trim();
        				onUsInd = Integer.parseInt(onUsIndString);
        			}
        			catch(Exception e)
        			{
        				e.printStackTrace();
        				errorLog.error("ON_US_IND not parsable!");
        			}
        		}
        	
            List<DailyTxnDataResponse> response = dtdpsService.fetchTransactions(date, onUsInd);
            listResponse.setTransactions(response);
            
            JAXBContext context = JAXBContext.newInstance(DailyTxnDataListResponse.class);
    		Marshaller m = context.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            
            writer = new StringWriter();
            xmlWriter = outputFactory.createXMLStreamWriter(writer);
            
            m.marshal(listResponse, writer);
            
            output = writer.getBuffer().toString();
        } 
        catch (Exception e)
        {
        	errorLog.error("Exception in getDigitalTransaction : "+e.getMessage());
            e.printStackTrace();
            listResponse.setErrorCode(errorCode);
        }
        finally
        {
        	if (writer != null)
        	{
        		try {writer.close();} catch (IOException ioe) {};
        	}
        }
        
        infoLog.info("output : "+output);
        return output;
        
    }
    
    @Override
    @WebMethod(operationName = "DigitalTransaction")
    public String getDigitalTransaction(@WebParam(name = "USERNAME") String username, @WebParam(name = "PASSWORD") String password, @WebParam(name = "TRANSACTION_DATE") String transactionDate)
    {
    	return getDigitalTransaction(username, password, transactionDate, "1");
    }
    
}
