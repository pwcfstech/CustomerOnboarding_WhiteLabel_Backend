package com.afrAsia.entities.request;

import java.io.Serializable;

import com.afrAsia.entities.jpa.MsgHeader;

public class AccountCreationRequest implements Serializable {
	private MsgHeader msgHeader;
	private Data data;
	
	public class Data implements Serializable{
		String rmId;
		

		public String getRmId() {
			return rmId;
		}

		public void setRmId(String rmId) {
			this.rmId = rmId;
		}

		
	}
}
	
