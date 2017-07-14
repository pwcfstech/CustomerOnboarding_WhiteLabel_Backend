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
		String accountReferenceNo;

		public String getAccountReferenceNo() {
			return accountReferenceNo;
		}

		public void setAccountReferenceNo(String accountReferenceNo) {
			this.accountReferenceNo = accountReferenceNo;
		}

		@Override
		public String toString() {
			return "Data [accountReferenceNo=" + accountReferenceNo + "]";
		}
		
		
		
	}

}
