package com.afrAsia.entities.response;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.afrAsia.entities.jpa.MsgHeader;

public class ApplicationDetailsResp implements Serializable {
	
	private static final long serialVersionUID = 4664162572844447756L;
	
	private MsgHeader msgHeader;
	private ApplicationDetailsResp.Data data;
	
	private List<ApplicationDetailsResp.Applicant> applicants;
	private ApplicationDetailsResp.ApplicantAccount applicantAccount;
	
	
	
	public MsgHeader getMsgHeader() {
		return msgHeader;
	}
	public void setMsgHeader(MsgHeader msgHeader) {
		this.msgHeader = msgHeader;
	}

	public ApplicationDetailsResp.ApplicantAccount getApplicantAccount() {
		return applicantAccount;
	}

	public void setApplicantAccount(ApplicationDetailsResp.ApplicantAccount applicantAccount) {
		this.applicantAccount = applicantAccount;
	}

	public ApplicationDetailsResp.Data getData() {
		return data;
	}

	public void setData(ApplicationDetailsResp.Data data) {
		this.data = data;
	}

	public List<ApplicationDetailsResp.Applicant> getApplicants() {
		if (applicants == null) {
			applicants = new ArrayList<ApplicationDetailsResp.Applicant>();
        }
        return this.applicants;
	}
	
	@Override
	public String toString() {
		return "ApplicationDetailsResp [data=" + data + ", applicants=" + applicants + "]";
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
		
	public static class Applicant implements Serializable {
		
		private static final long serialVersionUID = 1804526338945845278L;
		
		private long applicantRefNo;
		private String applicantType;
		private boolean isCifExist = false; 
		private String cif;
		private Object soapErrorMsg;
		private Object otherErrorMsg;
		
		
		public long getApplicantRefNo() {
			return applicantRefNo;
		}
		public void setApplicantRefNo(long applicantRefNo) {
			this.applicantRefNo = applicantRefNo;
		}
		public String getApplicantType() {
			return applicantType;
		}
		public void setApplicantType(String applicantType) {
			this.applicantType = applicantType;
		}
		public boolean isCifExist() {
			return isCifExist;
		}
		public void setCifExist(boolean isCifExist) {
			this.isCifExist = isCifExist;
		}
		public String getCif() {
			return cif;
		}
		public void setCif(String cif) {
			this.cif = cif;
		}
		public Object getSoapErrorMsg() {
			return soapErrorMsg;
		}
		public void setSoapErrorMsg(Object soapErrorMsg) {
			this.soapErrorMsg = soapErrorMsg;
		}
		public Object getOtherErrorMsg() {
			return otherErrorMsg;
		}
		public void setOtherErrorMsg(Object otherErrorMsg) {
			this.otherErrorMsg = otherErrorMsg;
		}
		
	}
	
	public static class ApplicantAccount implements Serializable {

		private static final long serialVersionUID = -5870823821648987058L;
		
		private boolean isAccountCreated;
		private String accNo;
		private Object soapErrorMsg;
		private Object otherErrorMsg;

		boolean isAccountCreated() {
			return isAccountCreated;
		}
		public void setAccountCreated(boolean isAccountCreated) {
			this.isAccountCreated = isAccountCreated;
		}
		public String getAccNo() {
			return accNo;
		}
		public void setAccNo(String accNo) {
			this.accNo = accNo;
		}
		public Object getSoapErrorMsg() {
			return soapErrorMsg;
		}
		public void setSoapErrorMsg(Object soapErrorMsg) {
			this.soapErrorMsg = soapErrorMsg;
		}
		public Object getOtherErrorMsg() {
			return otherErrorMsg;
		}
		public void setOtherErrorMsg(Object otherErrorMsg) {
			this.otherErrorMsg = otherErrorMsg;
		}
		
	}

	

}

