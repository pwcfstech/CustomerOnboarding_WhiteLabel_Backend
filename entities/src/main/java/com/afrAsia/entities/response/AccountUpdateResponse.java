package com.afrAsia.entities.response;

import java.io.Serializable;
import java.util.List;

import com.afrAsia.entities.jpa.MsgHeader;


public class AccountUpdateResponse implements Serializable {

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
		
		private List<Long> refNo;
		
		public List<Long> getRefNo() {
			return refNo;
		}
		public void setRefNo(List<Long> refNo) {
			this.refNo = refNo;
		}
		
		
	}
}
