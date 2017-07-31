package com.afrAsia.entities.request;

import java.io.Serializable;

public class RequestError implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String cd;
	private String rsn;
	private String customCode;
	
	public String getCd() {
		return cd;
	}
	public void setCd(String cd) {
		this.cd = cd;
	}
	public String getRsn() {
		return rsn;
	}
	public void setRsn(String rsn) {
		this.rsn = rsn;
	}
	public String getCustomCode() {
		return customCode;
	}
	public void setCustomCode(String customCode) {
		this.customCode = customCode;
	}
	@Override
	public String toString() {
		return "Error [cd=" + cd + ", rsn=" + rsn + ", customCode=" + customCode + "]";
	}
	
	
}