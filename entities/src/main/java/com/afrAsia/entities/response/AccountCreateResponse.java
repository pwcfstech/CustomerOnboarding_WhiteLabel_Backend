package com.afrAsia.entities.response;

import java.io.Serializable;
import java.util.List;

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
		private Long refNo;
		private Long recordId;
		private Long primaryApplicantRefNo;
		private Long guardianRefNo;
		List<JointApplicantsData> jointApplicants;

		public Long getRefNo() {
			return refNo;
		}
		public void setRefNo(Long refNo) {
			this.refNo = refNo;
		}
		public Long getRecordId() {
			return recordId;
		}
		public void setRecordId(Long recordId) {
			this.recordId = recordId;
		}
		public Long getPrimaryApplicantRefNo() {
			return primaryApplicantRefNo;
		}
		public void setPrimaryApplicantRefNo(Long primaryApplicantRefNo) {
			this.primaryApplicantRefNo = primaryApplicantRefNo;
		}
		public Long getGuardianRefNo() {
			return guardianRefNo;
		}
		public void setGuardianRefNo(Long guardianRefNo) {
			this.guardianRefNo = guardianRefNo;
		}
		public List<JointApplicantsData> getJointApplicants() {
			return jointApplicants;
		}
		public void setJointApplicants(List<JointApplicantsData> jointApplicants) {
			this.jointApplicants = jointApplicants;
		}

		@Override
		public String toString() {
			return "Data [refNo=" + refNo + ", recordId=" + recordId + ", primaryApplicantRefNo="
					+ primaryApplicantRefNo + ", guardianRefNo=" + guardianRefNo + ", jointApplicants="
					+ jointApplicants + "]";
		}

		public class JointApplicantsData implements Serializable{
			static final long serialVersionUID = 1L;
			private Long guardianRefNo;
			private Long jointAppRefNo;
			
			public Long getGuardianRefNo() {
				return guardianRefNo;
			}
			public void setGuardianRefNo(Long guardianRefNo) {
				this.guardianRefNo = guardianRefNo;
			}
			public Long getJointAppRefNo() {
				return jointAppRefNo;
			}
			public void setJointAppRefNo(Long jointAppRefNo) {
				this.jointAppRefNo = jointAppRefNo;
			}
			@Override
			public String toString() {
				return "JointApplicantsData [guardianRefNo=" + guardianRefNo + ", jointAppRefNo=" + jointAppRefNo + "]";
			}
		}
	}
}
