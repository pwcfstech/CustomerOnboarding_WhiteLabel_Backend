package com.afrAsia.entities.request;

import java.io.Serializable;
import java.util.List;

public class AccountCreationRequest implements Serializable {
	private static final long serialVersionUID = 1L;

	public AccountCreationRequest() {
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

		private String rmId;
		private Long appRefNo;
		private Long recordId;
		private String comment;
		private AccountDetails accountDetails;
		private ApplicantDetails primaryApplicantDetail;
		private ApplicantDetails guardianDetail;
		private List<JointApplicants> jointApplicants;

		public String getRmId() {
			return rmId;
		}

		public void setRmId(String rmId) {
			this.rmId = rmId;
		}

		public Long getAppRefNo() {
			return appRefNo;
		}

		public void setAppRefNo(Long appRefNo) {
			this.appRefNo = appRefNo;
		}

		public Long getRecordId() {
			return recordId;
		}

		public void setRecordId(Long recordId) {
			this.recordId = recordId;
		}

		public String getComment() {
			return comment;
		}

		public void setComment(String comment) {
			this.comment = comment;
		}

		public AccountDetails getAccountDetails() {
			return accountDetails;
		}

		public void setAccountDetails(AccountDetails accountDetails) {
			this.accountDetails = accountDetails;
		}

		public ApplicantDetails getPrimaryApplicantDetail() {
			return primaryApplicantDetail;
		}

		public void setPrimaryApplicantDetail(ApplicantDetails primaryApplicantDetail) {
			this.primaryApplicantDetail = primaryApplicantDetail;
		}

		public ApplicantDetails getGuardianDetail() {
			return guardianDetail;
		}

		public void setGuardianDetail(ApplicantDetails guardianDetail) {
			this.guardianDetail = guardianDetail;
		}

		public List<JointApplicants> getJointApplicants() {
			return jointApplicants;
		}

		public void setJointApplicants(List<JointApplicants> jointApplicants) {
			this.jointApplicants = jointApplicants;
		}

		@Override
		public String toString() {
			return "Data [rmId=" + rmId + ", appRefNo=" + appRefNo + ", recordId=" + recordId + ", comment=" + comment
					+ ", accountDetails=" + accountDetails + ", primaryApplicantDetail=" + primaryApplicantDetail
					+ ", guardianDetail=" + guardianDetail + ", jointApplicants=" + jointApplicants + "]";
		}

	}

	public static class AccountDetails implements Serializable {
		private static final long serialVersionUID = 1L;

		private String account;
		private String accountType;
		private String mop;
		private Boolean stmtDeliveryPo;
		private Boolean stmtDeliveryEstmt;
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
		private Boolean agreeCommEmail;
		private Boolean agreeCommSMS;
		private Boolean optTransactionsThruEmail;
		private String authEmail1;
		private String authEmail2;
		private String authEmail3;
		private Boolean optCallBackServices;
		private Boolean requireChequeBook;
		private Long minNoSignatures;							
		private String operatingInst;
		private List<NomineeInfo> nomineeInfo;
		private Boolean isProxyRequired;//Added by Avisha on 25/09 for issues
		private String rmComment;//Added by Avisha on 26/09 as asked by client
		private String ibOption;//Added by Avisha on 27/09 as asked by client
		
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
		public Boolean getRequireChequeBook() {
			return requireChequeBook;
		}
		public void setRequireChequeBook(Boolean requireChequeBook) {
			this.requireChequeBook = requireChequeBook;
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
		public List<NomineeInfo> getNomineeInfo() {
			return nomineeInfo;
		}
		public void setNomineeInfo(List<NomineeInfo> nomineeInfo) {
			this.nomineeInfo = nomineeInfo;
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
		public Boolean getIsProxyRequired() {
			return isProxyRequired;
		}
		public void setIsProxyRequired(Boolean isProxyRequired) {
			this.isProxyRequired = isProxyRequired;
		}
		public String getRmComment() {
			return rmComment;
		}
		public void setRmComment(String rmComment) {
			this.rmComment = rmComment;
		}
		public String getIbOption() {
			return ibOption;
		}
		public void setIbOption(String ibOption) {
			this.ibOption = ibOption;
		}
		@Override
		public String toString() {
			return "AccountDetails [account=" + account + ", accountType=" + accountType + ", mop=" + mop
					+ ", stmtDeliveryPo=" + stmtDeliveryPo + ", stmtDeliveryEstmt=" + stmtDeliveryEstmt + ", stmtAddr1="
					+ stmtAddr1 + ", stmtAddr2=" + stmtAddr2 + ", stmtAddr3=" + stmtAddr3 + ", stmtCity=" + stmtCity
					+ ", stmtCountry=" + stmtCountry + ", needCreditCard=" + needCreditCard + ", needGlobalCustody="
					+ needGlobalCustody + ", needForexBanking=" + needForexBanking + ", needPrepaidCard="
					+ needPrepaidCard + ", needInternetBanking=" + needInternetBanking + ", internetBankingUn="
					+ internetBankingUn + ", otpOverEmail=" + otpOverEmail + ", otpOverSMS=" + otpOverSMS
					+ ", pinViaSMS=" + pinViaSMS + ", pinViaPost=" + pinViaPost + ", prefCommMode=" + prefCommMode
					+ ", agreeCommEmail=" + agreeCommEmail + ", agreeCommSMS=" + agreeCommSMS
					+ ", optTransactionsThruEmail=" + optTransactionsThruEmail + ", authEmail1=" + authEmail1
					+ ", authEmail2=" + authEmail2 + ", authEmail3=" + authEmail3 + ", optCallBackServices="
					+ optCallBackServices + ", requireChequeBook=" + requireChequeBook + ", minNoSignatures="
					+ minNoSignatures + ", operatingInst=" + operatingInst + ", nomineeInfo=" + nomineeInfo
					+ ", isProxyRequired=" + isProxyRequired + ", rmComment=" + rmComment + ", ibOption=" + ibOption
					+ "]";
		}
	}
}

