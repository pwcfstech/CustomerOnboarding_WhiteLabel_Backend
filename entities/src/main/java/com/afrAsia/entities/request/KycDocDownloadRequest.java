package com.afrAsia.entities.request;

import java.io.Serializable;

public class KycDocDownloadRequest implements Serializable {
	private static final long serialVersionUID = -614583890426L;
	private KycDocDownloadRequest.Data data;

	public KycDocDownloadRequest.Data getData() {
		return data;
	}

	public void setData(KycDocDownloadRequest.Data data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "ClassPojo [data = " + data + "]";
	}
	
	public static class Data implements Serializable {
		
		private static final long serialVersionUID = -6145838904264249027L;

		private Long refNo;
		private Long applicantRefNo;
		private String docId;
		public Long getRefNo() {
			return refNo;
		}
		public void setRefNo(Long refNo) {
			this.refNo = refNo;
		}
		public Long getApplicantRefNo() {
			return applicantRefNo;
		}
		public void setApplicantRefNo(Long applicantRefNo) {
			this.applicantRefNo = applicantRefNo;
		}
		public String getDocId() {
			return docId;
		}
		public void setDocId(String docId) {
			this.docId = docId;
		}
		@Override
		public String toString() {
			return "Data [refNo=" + refNo + ", applicantRefNo=" + applicantRefNo + ", docId=" + docId + "]";
		}
	}
}
