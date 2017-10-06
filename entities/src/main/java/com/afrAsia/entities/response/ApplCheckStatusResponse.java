package com.afrAsia.entities.response;

import java.io.Serializable;

import com.afrAsia.entities.jpa.MsgHeader;


public class ApplCheckStatusResponse implements Serializable {

	private static final long serialVersionUID = 1L;
	private MsgHeader msgHeader;
	private Data data;

	public MsgHeader getMsgHeader() {
		return msgHeader;
	}

	public void setMsgHeader(MsgHeader msgHeader) {
		this.msgHeader = msgHeader;
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "ApplCheckStatusResponse [msgHeader=" + msgHeader + ", data=" + data + "]";
	}

	public class Data implements Serializable {
		
		private static final long serialVersionUID = 1L;
		private String success;
		private String kycUrl;
		private String icUrl;
		private String ccUrl;
		private String wcUrl;

		public String getSuccess() {
			return success;
		}

		public void setSuccess(String success) {
			this.success = success;
		}

		public String getKycUrl() {
			return kycUrl;
		}

		public void setKycUrl(String kycUrl) {
			this.kycUrl = kycUrl;
		}

		public String getIcUrl() {
			return icUrl;
		}

		public void setIcUrl(String icUrl) {
			this.icUrl = icUrl;
		}

		public String getCcUrl() {
			return ccUrl;
		}

		public void setCcUrl(String ccUrl) {
			this.ccUrl = ccUrl;
		}

		public String getWcUrl() {
			return wcUrl;
		}

		public void setWcUrl(String wcUrl) {
			this.wcUrl = wcUrl;
		}

		@Override
		public String toString() {
			return "Data [success=" + success + ", kycUrl=" + kycUrl + ", icUrl=" + icUrl + ", ccUrl=" + ccUrl
					+ ", wcUrl=" + wcUrl + "]";
		}
	}
}
