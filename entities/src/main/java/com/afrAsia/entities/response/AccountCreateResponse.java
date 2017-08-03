package com.afrAsia.entities.response;

import java.io.Serializable;

import com.afrAsia.entities.jpa.MsgHeader;


public class AccountCreateResponse implements Serializable {

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
		return "AccountCreateResponse [msgHeader=" + msgHeader + ", data=" + data + "]";
	}

	public class Data implements Serializable{
		static final long serialVersionUID = 1L;
		Long refNo;
		
		public Long getRefNo() {
			return refNo;
		}
		public void setRefNo(Long refNo) {
			this.refNo = refNo;
		}
		@Override
		public String toString() {
			return "Data [refNo=" + refNo + "]";
		}
	}
}
