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

		public String getSuccess() {
			return success;
		}

		public void setSuccess(String success) {
			this.success = success;
		}

		@Override
		public String toString() {
			return "Data [success=" + success + "]";
		}
		
	}
}
