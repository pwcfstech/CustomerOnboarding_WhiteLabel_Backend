package com.afrAsia.entities.response;

import java.io.Serializable;
import java.util.List;

import com.afrAsia.entities.jpa.MsgHeader;
import com.afrAsia.entities.request.NomineeInfo;

public class ApplicationDetailsResponse implements Serializable {

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
		return "ApplicationDetailsResponse [msgHeader=" + msgHeader + ", data=" + data + "]";
	}

	public class Data implements Serializable {

		private static final long serialVersionUID = 1L;
		private Long refNo;
		private Long recordId;
		private String appStatus;
		private Long appSubDate;
		private Long pendingRMSince;
		private String rvwBy;
		List<Comments> comments;
		AccountDetails accountDetails;
		ApplicantDetailsResponse primaryApplicantDetails;
		ApplicantDetailsResponse guardianDetails;
		List<JointApplicantsResponse> jointApplicants;

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

		public String getAppStatus() {
			return appStatus;
		}

		public void setAppStatus(String appStatus) {
			this.appStatus = appStatus;
		}

		public Long getAppSubDate() {
			return appSubDate;
		}

		public void setAppSubDate(Long appSubDate) {
			this.appSubDate = appSubDate;
		}

		public Long getPendingRMSince() {
			return pendingRMSince;
		}

		public void setPendingRMSince(Long pendingRMSince) {
			this.pendingRMSince = pendingRMSince;
		}

		public String getRvwBy() {
			return rvwBy;
		}

		public void setRvwBy(String rvwBy) {
			this.rvwBy = rvwBy;
		}

		public List<Comments> getComments() {
			return comments;
		}

		public void setComments(List<Comments> comments) {
			this.comments = comments;
		}

		public AccountDetails getAccountDetails() {
			return accountDetails;
		}

		public void setAccountDetails(AccountDetails accountDetails) {
			this.accountDetails = accountDetails;
		}

		public ApplicantDetailsResponse getPrimaryApplicantDetails() {
			return primaryApplicantDetails;
		}

		public void setPrimaryApplicantDetails(ApplicantDetailsResponse primaryApplicantDetails) {
			this.primaryApplicantDetails = primaryApplicantDetails;
		}

		public ApplicantDetailsResponse getGuardianDetails() {
			return guardianDetails;
		}

		public void setGuardianDetails(ApplicantDetailsResponse guardianDetails) {
			this.guardianDetails = guardianDetails;
		}

		public List<JointApplicantsResponse> getJointApplicants() {
			return jointApplicants;
		}

		public void setJointApplicants(List<JointApplicantsResponse> jointApplicants) {
			this.jointApplicants = jointApplicants;
		}

		@Override
		public String toString() {
			return "Data [refNo=" + refNo + ", recordId=" + recordId + ", appStatus=" + appStatus + ", appSubDate="
					+ appSubDate + ", pendingRMSince=" + pendingRMSince + ", rvwBy=" + rvwBy + ", comments=" + comments
					+ ", accountDetails=" + accountDetails + ", primaryApplicantDetails=" + primaryApplicantDetails
					+ ", guardianDetails=" + guardianDetails + ", jointApplicants=" + jointApplicants + "]";
		}

		public class Comments implements Serializable {

			private static final long serialVersionUID = 1L;
			private String comment;
			private String commentAddedBy;
			private Long commentDate;
			private String userCat;

			public String getComment() {
				return comment;
			}

			public void setComment(String comment) {
				this.comment = comment;
			}

			public String getCommentAddedBy() {
				return commentAddedBy;
			}

			public void setCommentAddedBy(String commentAddedBy) {
				this.commentAddedBy = commentAddedBy;
			}

			public Long getCommentDate() {
				return commentDate;
			}

			public void setCommentDate(Long commentDate) {
				this.commentDate = commentDate;
			}

			public String getUserCat() {
				return userCat;
			}

			public void setUserCat(String userCat) {
				this.userCat = userCat;
			}

			@Override
			public String toString() {
				return "Comments [comment=" + comment + ", commentAddedBy=" + commentAddedBy + ", commentDate="
						+ commentDate + ", userCat=" + userCat + "]";
			}
		}

		public class AccountDetails implements Serializable {
			private static final long serialVersionUID = 1L;
			private String account;
			private String accountType;
			private String mop;
			Boolean stmtDeliveryPo;
			Boolean stmtDeliveryEstmt;
			private String stmtAddr1;
			private String stmtAddr2;
			private String stmtAddr3;
			private String stmtCity;
			private String stmtCountry;
			private Boolean needCreditCard;
			private Boolean needGlobalCustody;
			private Boolean needForexBanking;
			private Boolean needPrepaidCard;
			private Boolean needInternetBanking;
			private String internetBankingUn;
			private Boolean otpOverEmail;
			private Boolean otpOverSMS;
			private Boolean pinViaSMS;
			private Boolean pinViaPost;
			private String prefCommMode;
			private String whrDidYouHearAbtAfrAsia;
			private Boolean agreeCommEmail;
			private Boolean agreeCommSMS;
			private Boolean optTransactionsThruEmail;
			private String authEmail1;
			private String authEmail2;
			private String authEmail3;
			private Boolean optCallBackServices;
			List<NomineeInfo> nomineeInfo;

			private String afrasiaEventQues;
			private String afrasiaEventAns;
			private Long minNoSignatures;
			private String operatingInst;

			public String getAccount() {
				return account;
			}

			public void setAccount(String account) {
				this.account = account;
			}

			public String getAccountType() {
				return accountType;
			}

			public void setAccountType(String accountType) {
				this.accountType = accountType;
			}

			public String getMop() {
				return mop;
			}

			public void setMop(String mop) {
				this.mop = mop;
			}

			public Boolean getStmtDeliveryPo() {
				return stmtDeliveryPo;
			}

			public void setStmtDeliveryPo(Boolean stmtDeliveryPo) {
				this.stmtDeliveryPo = stmtDeliveryPo;
			}

			public Boolean getStmtDeliveryEstmt() {
				return stmtDeliveryEstmt;
			}

			public void setStmtDeliveryEstmt(Boolean stmtDeliveryEstmt) {
				this.stmtDeliveryEstmt = stmtDeliveryEstmt;
			}

			public String getStmtAddr1() {
				return stmtAddr1;
			}

			public void setStmtAddr1(String stmtAddr1) {
				this.stmtAddr1 = stmtAddr1;
			}

			public String getStmtAddr2() {
				return stmtAddr2;
			}

			public void setStmtAddr2(String stmtAddr2) {
				this.stmtAddr2 = stmtAddr2;
			}

			public String getStmtAddr3() {
				return stmtAddr3;
			}

			public void setStmtAddr3(String stmtAddr3) {
				this.stmtAddr3 = stmtAddr3;
			}

			public String getStmtCity() {
				return stmtCity;
			}

			public void setStmtCity(String stmtCity) {
				this.stmtCity = stmtCity;
			}

			public String getStmtCountry() {
				return stmtCountry;
			}

			public void setStmtCountry(String stmtCountry) {
				this.stmtCountry = stmtCountry;
			}

			public Boolean getNeedCreditCard() {
				return needCreditCard;
			}

			public void setNeedCreditCard(Boolean needCreditCard) {
				this.needCreditCard = needCreditCard;
			}

			public Boolean getNeedGlobalCustody() {
				return needGlobalCustody;
			}

			public void setNeedGlobalCustody(Boolean needGlobalCustody) {
				this.needGlobalCustody = needGlobalCustody;
			}

			public Boolean getNeedForexBanking() {
				return needForexBanking;
			}

			public void setNeedForexBanking(Boolean needForexBanking) {
				this.needForexBanking = needForexBanking;
			}

			public Boolean getNeedPrepaidCard() {
				return needPrepaidCard;
			}

			public void setNeedPrepaidCard(Boolean needPrepaidCard) {
				this.needPrepaidCard = needPrepaidCard;
			}

			public Boolean getNeedInternetBanking() {
				return needInternetBanking;
			}

			public void setNeedInternetBanking(Boolean needInternetBanking) {
				this.needInternetBanking = needInternetBanking;
			}

			public String getInternetBankingUn() {
				return internetBankingUn;
			}

			public void setInternetBankingUn(String internetBankingUn) {
				this.internetBankingUn = internetBankingUn;
			}

			public Boolean getOtpOverEmail() {
				return otpOverEmail;
			}

			public void setOtpOverEmail(Boolean otpOverEmail) {
				this.otpOverEmail = otpOverEmail;
			}

			public Boolean getOtpOverSMS() {
				return otpOverSMS;
			}

			public void setOtpOverSMS(Boolean otpOverSMS) {
				this.otpOverSMS = otpOverSMS;
			}

			public Boolean getPinViaSMS() {
				return pinViaSMS;
			}

			public void setPinViaSMS(Boolean pinViaSMS) {
				this.pinViaSMS = pinViaSMS;
			}

			public Boolean getPinViaPost() {
				return pinViaPost;
			}

			public void setPinViaPost(Boolean pinViaPost) {
				this.pinViaPost = pinViaPost;
			}

			public String getPrefCommMode() {
				return prefCommMode;
			}

			public void setPrefCommMode(String prefCommMode) {
				this.prefCommMode = prefCommMode;
			}

			public String getWhrDidYouHearAbtAfrAsia() {
				return whrDidYouHearAbtAfrAsia;
			}

			public void setWhrDidYouHearAbtAfrAsia(String whrDidYouHearAbtAfrAsia) {
				this.whrDidYouHearAbtAfrAsia = whrDidYouHearAbtAfrAsia;
			}

			public Boolean getAgreeCommEmail() {
				return agreeCommEmail;
			}

			public void setAgreeCommEmail(Boolean agreeCommEmail) {
				this.agreeCommEmail = agreeCommEmail;
			}

			public Boolean getAgreeCommSMS() {
				return agreeCommSMS;
			}

			public void setAgreeCommSMS(Boolean agreeCommSMS) {
				this.agreeCommSMS = agreeCommSMS;
			}

			public Boolean getOptTransactionsThruEmail() {
				return optTransactionsThruEmail;
			}

			public void setOptTransactionsThruEmail(Boolean optTransactionsThruEmail) {
				this.optTransactionsThruEmail = optTransactionsThruEmail;
			}

			public String getAuthEmail1() {
				return authEmail1;
			}

			public void setAuthEmail1(String authEmail1) {
				this.authEmail1 = authEmail1;
			}

			public String getAuthEmail2() {
				return authEmail2;
			}

			public void setAuthEmail2(String authEmail2) {
				this.authEmail2 = authEmail2;
			}

			public String getAuthEmail3() {
				return authEmail3;
			}

			public void setAuthEmail3(String authEmail3) {
				this.authEmail3 = authEmail3;
			}

			public Boolean getOptCallBackServices() {
				return optCallBackServices;
			}

			public void setOptCallBackServices(Boolean optCallBackServices) {
				this.optCallBackServices = optCallBackServices;
			}

			public List<NomineeInfo> getNomineeInfo() {
				return nomineeInfo;
			}

			public void setNomineeInfo(List<NomineeInfo> nomineeInfo) {
				this.nomineeInfo = nomineeInfo;
			}

			public String getAfrasiaEventQues() {
				return afrasiaEventQues;
			}

			public void setAfrasiaEventQues(String afrasiaEventQues) {
				this.afrasiaEventQues = afrasiaEventQues;
			}

			public String getAfrasiaEventAns() {
				return afrasiaEventAns;
			}

			public void setAfrasiaEventAns(String afrasiaEventAns) {
				this.afrasiaEventAns = afrasiaEventAns;
			}

			public Long getMinNoSignatures() {
				return minNoSignatures;
			}

			public void setMinNoSignatures(Long minNoSignatures) {
				this.minNoSignatures = minNoSignatures;
			}

			public String getOperatingInst() {
				return operatingInst;
			}

			public void setOperatingInst(String operatingInst) {
				this.operatingInst = operatingInst;
			}

			@Override
			public String toString() {
				return "AccountDetails [account=" + account + ", accountType=" + accountType + ", mop=" + mop
						+ ", stmtDeliveryPo=" + stmtDeliveryPo + ", stmtDeliveryEstmt=" + stmtDeliveryEstmt
						+ ", stmtAddr1=" + stmtAddr1 + ", stmtAddr2=" + stmtAddr2 + ", stmtAddr3=" + stmtAddr3
						+ ", stmtCity=" + stmtCity + ", stmtCountry=" + stmtCountry + ", needCreditCard="
						+ needCreditCard + ", needGlobalCustody=" + needGlobalCustody + ", needForexBanking="
						+ needForexBanking + ", needPrepaidCard=" + needPrepaidCard + ", needInternetBanking="
						+ needInternetBanking + ", internetBankingUn=" + internetBankingUn + ", otpOverEmail="
						+ otpOverEmail + ", otpOverSMS=" + otpOverSMS + ", pinViaSMS=" + pinViaSMS + ", pinViaPost="
						+ pinViaPost + ", prefCommMode=" + prefCommMode + ", whrDidYouHearAbtAfrAsia="
						+ whrDidYouHearAbtAfrAsia + ", agreeCommEmail=" + agreeCommEmail + ", agreeCommSMS="
						+ agreeCommSMS + ", optTransactionsThruEmail=" + optTransactionsThruEmail + ", authEmail1="
						+ authEmail1 + ", authEmail2=" + authEmail2 + ", authEmail3=" + authEmail3
						+ ", optCallBackServices=" + optCallBackServices + ", nomineeInfo=" + nomineeInfo
						+ ", afrasiaEventQues=" + afrasiaEventQues + ", afrasiaEventAns=" + afrasiaEventAns
						+ ", minNoSignatures=" + minNoSignatures + ", operatingInst=" + operatingInst + "]";
			}

		}
	}
}
