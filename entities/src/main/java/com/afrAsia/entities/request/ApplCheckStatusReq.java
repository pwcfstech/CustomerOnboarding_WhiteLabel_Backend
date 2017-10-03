package com.afrAsia.entities.request;

import java.io.Serializable;
import java.util.List;

public class ApplCheckStatusReq implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ApplCheckStatusReq.Data data;

	public ApplCheckStatusReq.Data getData() {
		return data;
	}

	public void setData(ApplCheckStatusReq.Data data) {
		this.data = data;
	}


	@Override
	public String toString() {
		return "ApplCheckStatusReq [data=" + data + "]";
	}



	public static class Data implements Serializable {

		private static final long serialVersionUID = -6145838904264249027L;

		private Long refId;

		private Long recordId;

		private String appStatus;

		private String compComment;

		private String compId;

		private List<Data.Checks> checks;

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

		public String getAppStatus() {
			return appStatus;
		}

		public void setAppStatus(String appStatus) {
			this.appStatus = appStatus;
		}

		public String getCompComment() {
			return compComment;
		}

		public void setCompComment(String compComment) {
			this.compComment = compComment;
		}

		public String getCompId() {
			return compId;
		}

		public void setCompId(String compId) {
			this.compId = compId;
		}

		public List<Data.Checks> getChecks() {
			return checks;
		}

		public void setChecks(List<Data.Checks> checks) {
			this.checks = checks;
		}

		@Override
		public String toString() {
			return "Data [refId=" + refId + ", recordId=" + recordId + ", appStatus=" + appStatus + ", compComment="
					+ compComment + ", compId=" + compId + ", checks=" + checks + "]";
		}

		public static class Checks implements Serializable{

			private static final long serialVersionUID = 1L;

			private String checkType;

			private String status;

			private String userId;

			private String comment;

			private List<String> screenshots;

			public String getCheckType() {
				return checkType;
			}

			public void setCheckType(String checkType) {
				this.checkType = checkType;
			}

			public String getStatus() {
				return status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getUserId() {
				return userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}

			public String getComment() {
				return comment;
			}

			public void setComment(String comment) {
				this.comment = comment;
			}

			public List<String> getScreenshots() {
				return screenshots;
			}

			public void setScreenshots(List<String> screenshots) {
				this.screenshots = screenshots;
			}

			@Override
			public String toString() {
				return "Checks [checkType=" + checkType + ", status=" + status + ", userId=" + userId + ", comment="
						+ comment + ", screenshots=" + screenshots + "]";
			}
		}
	}
}
