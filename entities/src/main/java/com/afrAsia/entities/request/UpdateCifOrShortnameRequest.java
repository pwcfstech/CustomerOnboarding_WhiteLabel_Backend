package com.afrAsia.entities.request;

import java.io.Serializable;

public class UpdateCifOrShortnameRequest implements Serializable {
	private static final long serialVersionUID = 1L;

	public UpdateCifOrShortnameRequest() {
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
		private Long applicantId;
		private String cif;
		private String shortname;
		public Long getRefId() {
			return refId;
		}
		public void setRefId(Long refId) {
			this.refId = refId;
		}
		
		public String getCif() {
			return cif;
		}
		public void setCif(String cif) {
			this.cif = cif;
		}
		public String getShortname() {
			return shortname;
		}
		public void setShortname(String shortname) {
			this.shortname = shortname;
		}
		public Long getApplicantId() {
			return applicantId;
		}
		public void setApplicantId(Long applicantId) {
			this.applicantId = applicantId;
		}
		@Override
		public String toString() {
			return "Data [refId=" + refId + ", applicantId=" + applicantId + ", cif=" + cif + ", shortname=" + shortname
					+ "]";
		}
		
	}
}

