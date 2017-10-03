package com.afrAsia.entities.request;

import java.io.Serializable;

public class LockApplicationRequest implements Serializable {
	private static final long serialVersionUID = 1L;

	public LockApplicationRequest() {
		super();
	}

	private Data data;

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public class Data implements Serializable {

		public Data() {
			super();
		}

		private static final long serialVersionUID = 1L;

		private Long refId;
		private Long recordId;
		private String userId;
		private Boolean lockApp;
		public Long getRefId() {
			return refId;
		}
		public void setRefId(Long refId) {
			this.refId = refId;
		}
		public Long getRecordId() {
			return recordId;
		}
		public void setRecordId(Long recordId) {
			this.recordId = recordId;
		}
		public String getUserId() {
			return userId;
		}
		public void setUserId(String userId) {
			this.userId = userId;
		}
		public Boolean getLockApp() {
			return lockApp;
		}
		public void setLockApp(Boolean lockApp) {
			this.lockApp = lockApp;
		}
		@Override
		public String toString() {
			return "Data [refId=" + refId + ", recordId=" + recordId + ", userId=" + userId + ", lockApp=" + lockApp
					+ "]";
		}
	}
}

