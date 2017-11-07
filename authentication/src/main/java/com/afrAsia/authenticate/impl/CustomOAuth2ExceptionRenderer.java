package com.afrAsia.authenticate.impl;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.http.server.ServletServerHttpResponse;
import org.springframework.security.oauth2.provider.error.OAuth2ExceptionRenderer;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.context.request.ServletWebRequest;

import com.afrAsia.entities.jpa.MsgHeader;
import com.afrAsia.entities.response.Data;
import com.fasterxml.jackson.databind.ObjectMapper;

// TODO: Auto-generated Javadoc
/**
 * The Class CustomOAuth2ExceptionRenderer.
 * 
 * @author shweta.sankhe
 */
public class CustomOAuth2ExceptionRenderer implements OAuth2ExceptionRenderer
{

    /** The Constant UNAUTHORIZED. */
    public static final String UNAUTHORIZED = "error=\"unauthorized\"";
    
    final static Logger debugLog = Logger.getLogger("debugLogger");
	final static Logger infoLog = Logger.getLogger("infoLogger");
	final static Logger errorLog = Logger.getLogger("errorLogger");

    public void handleHttpEntityResponse(HttpEntity<?> responseEntity, ServletWebRequest webRequest) throws Exception
    {
        if (responseEntity == null)
        {
            return;
        }
        ServletServerHttpResponse outputMessage = createHttpOutputMessage(webRequest);
        if (responseEntity instanceof ResponseEntity && outputMessage instanceof ServerHttpResponse)
        {
            ((ServerHttpResponse) outputMessage).setStatusCode(((ResponseEntity<?>) responseEntity).getStatusCode());
        }
        Object body = responseEntity.getBody();
        if (body == null)
        {
            // flush headers
            outputMessage.getBody();
        }
        else
        {
        	MsgHeader hdr = new MsgHeader();
        	MsgHeader.Error error = hdr.new Error();
        	hdr.setError(error);
        	Data data = new Data();
        	
        	String errorDescription = null;
        	
        		errorDescription = body.toString();
        		((ServerHttpResponse) outputMessage).getHeaders().setContentType(MediaType.APPLICATION_JSON);
        		
        		if (errorDescription.contains("Access token expired"))
        		{
        			error.setCd("401");
        			error.setCustomCode("401");
        			error.setRsn("token_expired");
        		}
        		else if(errorDescription.contains("Invalid access token"))
        		{
        			error.setCd("401");
        			error.setCustomCode("401");
        			error.setRsn("invalid_token");
        		}
        		else
        		{
        			error.setCd("401");
        			error.setCustomCode("401");
        			error.setRsn("oauth_exception");
        		}
        		
        		HashMap<String, Object> response = new HashMap<String, Object>();
        		response.put("msgHdr", hdr);
        		response.put("data", data);
        		
        		ObjectMapper mapper = new ObjectMapper();
        		String responseString = mapper.writeValueAsString(response);
        		
        		outputMessage.getBody().write(responseString.getBytes("UTF-8"));
        		
        	
           
           
//            generateOutputMessage(responseEntity, outputMessage);
        }
        
        System.out.println(body.getClass());

    }

    /**
     * Creates the http output message.
     * 
     * @param webRequest
     *            the web request
     * @return the http output message
     * @throws Exception
     *             the exception
     */
    private ServletServerHttpResponse createHttpOutputMessage(NativeWebRequest webRequest) throws Exception
    {
        HttpServletResponse servletResponse = (HttpServletResponse) webRequest.getNativeResponse();
        servletResponse.addHeader("Access-Control-Allow-Origin", "*");
        servletResponse.addHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, PUT, DELETE, HEAD");
        servletResponse.addHeader("Access-Control-Allow-Headers", "Authorization, Content-Type, Accept");
        servletResponse.addHeader("Access-Control-Max-Age", "1728000");
        debugLog.debug("servletResponse :: "+servletResponse);
        return new ServletServerHttpResponse(servletResponse);
    }

    /**
     * Generate output message.
     * 
     * @param responseEntity
     *            the response entity
     * @param moveInExceptionCode
     *            the move in exception code
     * @param outputMessage
     *            the output message
     * @throws UnsupportedEncodingException
     *             the unsupported encoding exception
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    private void generateOutputMessage(HttpEntity<?> responseEntity, HttpOutputMessage outputMessage) throws UnsupportedEncodingException, IOException
    {
        ((ServerHttpResponse) outputMessage).setStatusCode(((ResponseEntity<?>) responseEntity).getStatusCode());
    }

}