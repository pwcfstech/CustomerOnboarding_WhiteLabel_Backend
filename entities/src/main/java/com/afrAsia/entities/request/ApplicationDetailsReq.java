package com.afrAsia.entities.request;

import java.io.Serializable;

public class ApplicationDetailsReq implements Serializable {
	
	private static final long serialVersionUID = 4664162572844447756L;
	private ApplicationDetailsReq.Data data;

	public ApplicationDetailsReq.Data getData() {
		return data;
	}

	public void setData(ApplicationDetailsReq.Data data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "ClassPojo [data = " + data + "]";
	}
	
	public static class Data implements Serializable {
		
		private static final long serialVersionUID = -6145838904264249027L;

		private Long refNo;
		private String userId;
		private String recordId;
		
		public Long getRefNo() {
			return refNo;
		}

		public void setRefNo(Long refNo) {
			this.refNo = refNo;
		}

		
		public String getUserId() {
			return userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getRecordId() {
			return recordId;
		}

		public void setRecordId(String recordId) {
			this.recordId = recordId;
		}

		@Override
		public String toString() {
			return "Data [refNo=" + refNo + ", userId=" + userId + ", recordId=" + recordId + "]";
		}
		
		
	}
		
}
