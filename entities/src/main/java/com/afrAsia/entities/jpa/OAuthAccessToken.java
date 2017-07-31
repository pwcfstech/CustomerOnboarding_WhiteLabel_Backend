package com.afrAsia.entities.jpa;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.afrAsia.entities.listener.EntityListener;
import com.afrAsia.entities.masters.RMDetails;


@Entity
@EntityListeners({ EntityListener.class })
@Table(name = "oauth_access_token")
public class OAuthAccessToken implements Serializable
{
	private static final long serialVersionUID = 1L;

	@Id
    @Column(name = "token_id")
    private String tokenId;

    @Column(name = "token", length=6000)
    private byte[] token;

    @Column(name = "authentication_id")
    private String authenticationId;

    @Column(name = "authentication", length=6000)
    private byte[] authentication;

    @Id
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    private RMDetails client;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "refresh_token")
    private String refreshToken;

    protected OAuthAccessToken()
    {
    }

    public String getTokenId()
    {
        return tokenId;
    }

    public void setTokenId(String tokenId)
    {
        this.tokenId = tokenId;
    }

    public byte[] getToken()
    {
        return token;
    }

    public void setToken(byte[] token)
    {
        this.token = token;
    }

    public String getAuthenticationId()
    {
        return authenticationId;
    }

    public void setAuthenticationId(String authenticationId)
    {
        this.authenticationId = authenticationId;
    }

    public byte[] getAuthentication()
    {
        return authentication;
    }

    public void setAuthentication(byte[] authentication)
    {
        this.authentication = authentication;
    }

    public RMDetails getClient()
    {
        return client;
    }

    public void setClient(RMDetails client)
    {
        this.client = client;
    }

    public String getRefreshToken()
    {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken)
    {
        this.refreshToken = refreshToken;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

}
