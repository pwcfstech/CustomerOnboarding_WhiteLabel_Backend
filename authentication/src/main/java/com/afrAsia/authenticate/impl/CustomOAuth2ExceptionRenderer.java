package com.afrAsia.authenticate.impl;

import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.ResponseEntity;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.http.server.ServletServerHttpResponse;
import org.springframework.security.oauth2.provider.error.OAuth2ExceptionRenderer;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.context.request.ServletWebRequest;

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
        HttpOutputMessage outputMessage = createHttpOutputMessage(webRequest);
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
//        else
//        {
//            ((ServerHttpResponse) outputMessage).getHeaders().setContentType(MediaType.APPLICATION_JSON);
//            OneGroupExceptionCode moveInExceptionCode = null;
//            if (responseEntity.getBody().toString().contains(OAuth2Exception.ACCESS_DENIED))
//            {
//                moveInExceptionCode = AuthorizationExceptionCode.USER_ACCESS_DENIED;
//            }
//            else if (responseEntity.getBody().toString().contains(OAuth2Exception.INVALID_TOKEN))
//            {
//                moveInExceptionCode = AuthorizationExceptionCode.INVALID_TOKEN;
//            }
//            else if (responseEntity.getBody().toString().contains(OAuth2Exception.INSUFFICIENT_SCOPE))
//            {
//                moveInExceptionCode = AuthorizationExceptionCode.INSUFFICIENT_SCOPE;
//            }
//            else if (responseEntity.getBody().toString().contains(OAuth2Exception.INVALID_CLIENT))
//            {
//                moveInExceptionCode = AuthorizationExceptionCode.INVALID_CLIENT;
//            }
//            else if (responseEntity.getBody().toString().contains(OAuth2Exception.INVALID_GRANT))
//            {
//                moveInExceptionCode = AuthorizationExceptionCode.INVALID_GRANT;
//            }
//            else if (responseEntity.getBody().toString().contains(OAuth2Exception.INVALID_REQUEST))
//            {
//                moveInExceptionCode = AuthorizationExceptionCode.INVALID_REQUEST;
//            }
//            else if (responseEntity.getBody().toString().contains(OAuth2Exception.INVALID_SCOPE))
//            {
//                moveInExceptionCode = AuthorizationExceptionCode.INVALID_SCOPE;
//            }
//            else if (responseEntity.getBody().toString().contains(OAuth2Exception.REDIRECT_URI_MISMATCH))
//            {
//                moveInExceptionCode = AuthorizationExceptionCode.REDIRECT_URI_MISMATCH;
//            }
//            else if (responseEntity.getBody().toString().contains(OAuth2Exception.UNAUTHORIZED_CLIENT))
//            {
//                moveInExceptionCode = AuthorizationExceptionCode.UNAUTHORIZED_CLIENT;
//            }
//            else if (responseEntity.getBody().toString().contains(OAuth2Exception.UNSUPPORTED_GRANT_TYPE))
//            {
//                moveInExceptionCode = AuthorizationExceptionCode.UNSUPPORTED_GRANT_TYPE;
//            }
//            else if (responseEntity.getBody().toString().contains(OAuth2Exception.UNSUPPORTED_RESPONSE_TYPE))
//            {
//                moveInExceptionCode = AuthorizationExceptionCode.UNSUPPORTED_RESPONSE_TYPE;
//            }
//            else if (responseEntity.getBody().toString().contains(UNAUTHORIZED))
//            {
//                moveInExceptionCode = AuthorizationExceptionCode.UNAUTHORIZED_CLIENT;
//            }
//            else if (responseEntity.getBody().toString().contains("authentication_unavailable"))
//            {
//                moveInExceptionCode = GeneralExceptionCode.SERVICE_UNAVAILABLE;
//            }
//            else
//            {
//                moveInExceptionCode = AuthorizationExceptionCode.AUTHORIZATION_ERROR;
//            }
//            generateOutputMessage(responseEntity, moveInExceptionCode, outputMessage);
//        }

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
    private HttpOutputMessage createHttpOutputMessage(NativeWebRequest webRequest) throws Exception
    {
        HttpServletResponse servletResponse = (HttpServletResponse) webRequest.getNativeResponse();
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
//    private void generateOutputMessage(HttpEntity<?> responseEntity, OneGroupExceptionCode moveInExceptionCode, HttpOutputMessage outputMessage) throws UnsupportedEncodingException, IOException
//    {
//        WSResult result = new WSResult(String.valueOf(moveInExceptionCode.getCode()), moveInExceptionCode.getExceptionMessage(), true);
//        WSResponse response = new WSResponse(result);
//        String jsonOutput = Utils.getJsonString(response);
//        ((ServerHttpResponse) outputMessage).setStatusCode(((ResponseEntity<?>) responseEntity).getStatusCode());
//        ((ServerHttpResponse) outputMessage).getBody().write(jsonOutput.getBytes("UTF8"));
//    }

}