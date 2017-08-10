package com.afrAsia.entities.request;

import java.io.Serializable;


public class KycInfo implements Serializable {

	public KycInfo() {
		super();
	}
	
	String docId;
	String docUrl;
	public String getDocId() {
		return docId;
	}
	public void setDocId(String docId) {
		this.docId = docId;
	}
	public String getDocUrl() {
		return docUrl;
	}
	public void setDocUrl(String docUrl) {
		this.docUrl = docUrl;
	}
	@Override
	public String toString() {
		return "KycInfo [docId=" + docId + ", docUrl=" + docUrl + "]";
	}
	
	
	
	
}

