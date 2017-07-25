package com.afrAsia.entities.request;

import java.io.Serializable;

public class MessageHeader implements Serializable {

	private static final long serialVersionUID = 1L;

	private String oAuthToken;

	/**
	 * @return the oAuthToken
	 */
	public String getoAuthToken() {
		return oAuthToken;
	}

	/**
	 * @param oAuthToken
	 *            the oAuthToken to set
	 */
	public void setoAuthToken(String oAuthToken) {
		this.oAuthToken = oAuthToken;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MessageHeader [oAuthToken=" + oAuthToken + "]";
	}

}
