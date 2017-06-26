package com.afrAsia.entities;

import java.io.Serializable;

public class MsgHeader implements Serializable {
	private Error error;
	
	
	public Error getError() {
		return error;
	}


	public void setError(Error error) {
		this.error = error;
	}


	@Override
	public String toString() {
		return "MsgHeader [error=" + error + "]";
	}


	public class Error implements Serializable{
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

}
