package com.afrAsia.authenticate.impl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.oauth2.common.exceptions.OAuth2Exception;
import org.springframework.security.oauth2.provider.error.OAuth2AuthenticationEntryPoint;

/**
 * The Class CustomOAuth2AuthenticationEntryPoint.
 * 
 * @author shweta.sankhe
 */
public class CustomOAuth2AuthenticationEntryPoint extends OAuth2AuthenticationEntryPoint
{

    /** The custom o auth2 exception renderer. */
    private CustomOAuth2ExceptionRenderer customOAuth2ExceptionRenderer;

    /** The type name. */
    private String typeName;

    /** The realm name. */
    private String realmName;

    @Override
    protected ResponseEntity<OAuth2Exception> enhanceResponse(ResponseEntity<OAuth2Exception> response, Exception exception)
    {
        super.setRealmName(realmName);
        super.setTypeName(typeName);
        if (exception != null)
        {
            setExceptionRenderer(customOAuth2ExceptionRenderer);
        }
        return super.enhanceResponse(response, exception);
    }

    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException, ServletException
    {
        super.setRealmName(realmName);
        super.setTypeName(typeName);
        if (authException != null)
        {
            setExceptionRenderer(customOAuth2ExceptionRenderer);
        }
        doHandle(request, response, authException);
    }

    /**
     * Sets the custom o auth2 exception renderer.
     * 
     * @param customOAuth2ExceptionRenderer
     *            the new custom o auth2 exception renderer
     */
    public void setCustomOAuth2ExceptionRenderer(CustomOAuth2ExceptionRenderer customOAuth2ExceptionRenderer)
    {
        this.customOAuth2ExceptionRenderer = customOAuth2ExceptionRenderer;
    }

    public void setTypeName(String typeName)
    {
        this.typeName = typeName;
    }

    public void setRealmName(String realmName)
    {
        this.realmName = realmName;
    }

}
