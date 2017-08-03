package com.afrAsia.entities.response;

import java.io.Serializable;


public class MessageHeader implements Serializable {

	private static final long serialVersionUID = 1L;

	private RequestError error;
	
	private RequestSuccess success;

	public RequestError getError() {
		return error;
	}

	public void setError(RequestError error) {
		this.error = error;
	}

	public RequestSuccess getSuccess() {
		return success;
	}

	public void setSuccess(RequestSuccess success) {
		this.success = success;
	}

	@Override
	public String toString() {
		return "MessageHeader [error=" + error + ", success=" + success + "]";
	}

}
