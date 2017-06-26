package com.afrAsia.authenticate.impl;

import org.springframework.security.core.GrantedAuthority;

/**
 * The Class <Code> CustomGrantedAuthority </Code>  represents an authority granted to an
 * 
 * @author shweta.sankhe
 *
 */
public class CustomGrantedAuthority implements GrantedAuthority{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The authority. */
	private String authority ;
	
    public String getAuthority()
    {
        return authority;
    }

	public void setAuthority(String authority) {
		this.authority = authority;
	}

}
