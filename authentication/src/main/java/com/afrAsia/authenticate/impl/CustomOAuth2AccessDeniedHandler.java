package com.afrAsia.authenticate.impl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.oauth2.provider.error.OAuth2AccessDeniedHandler;

/**
 * The Class CustomOAuth2AccessDeniedHandler.
 * 
 * @author shweta.sankhe
 * 
 */
public class CustomOAuth2AccessDeniedHandler extends OAuth2AccessDeniedHandler
{

    /** The custom o auth2 exception renderer. */
    private CustomOAuth2ExceptionRenderer customOAuth2ExceptionRenderer;

    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException authException) throws IOException, ServletException
    {
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
}
