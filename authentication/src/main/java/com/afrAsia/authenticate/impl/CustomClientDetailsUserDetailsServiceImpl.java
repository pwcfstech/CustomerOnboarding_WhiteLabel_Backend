package com.afrAsia.authenticate.impl;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.NoSuchClientException;

/**
 * The Class CustomClientDetailsUserDetailsServiceImpl provides custom
 * implementation for UserDetails which load user specific data.
 * 
 * @author shweta.sankhe
 * 
 */
public class CustomClientDetailsUserDetailsServiceImpl implements UserDetailsService
{

    /** The client details service. */
    private CustomClientDetailsServiceImpl clientDetailsService;

    /** The empty password. */
    private String emptyPassword = "";

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException
    {
        ClientDetails clientDetails;
        try
        {
            clientDetails = clientDetailsService.loadClientByClientId(username);
        }
        catch (NoSuchClientException e)
        {
            throw new UsernameNotFoundException(e.getMessage(), e);
        }
        String clientSecret = clientDetails.getClientSecret();
        if (clientSecret == null || clientSecret.trim().length() == 0)
        {
            clientSecret = emptyPassword;
        }
        return new User(username, clientSecret, clientDetails.getAuthorities());
    }

    public void setClientDetailsService(CustomClientDetailsServiceImpl clientDetailsService)
    {
        this.clientDetailsService = clientDetailsService;
    }

}
