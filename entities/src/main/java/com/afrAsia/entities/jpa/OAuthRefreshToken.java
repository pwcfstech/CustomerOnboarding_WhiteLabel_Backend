package com.afrAsia.entities.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.Table;

import com.afrAsia.entities.listener.EntityListener;

@Entity
@EntityListeners({ EntityListener.class })
@Table(name = "oauth_refresh_token")
public class OAuthRefreshToken {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "token_id")
	private String tokenId;

	@Column(name = "token", length = 6000)
	private byte[] token;

	@Column(name = "authentication", length = 6000)
	private byte[] authentication;

	public String getTokenId() {
		return tokenId;
	}

	public void setTokenId(String tokenId) {
		this.tokenId = tokenId;
	}

	public byte[] getToken() {
		return token;
	}

	public void setToken(byte[] token) {
		this.token = token;
	}

	public byte[] getAuthentication() {
		return authentication;
	}

	public void setAuthentication(byte[] authentication) {
		this.authentication = authentication;
	}

}
