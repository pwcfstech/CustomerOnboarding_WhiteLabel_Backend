package com.afrAsia.entities.request;

import java.io.Serializable;
import java.util.List;
import com.afrAsia.entities.request.JointApplicants;
import com.afrAsia.entities.request.ApplicantDetails;
import com.afrAsia.entities.request.NomineeInfo;

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

	public class Data implements Serializable{
		
		public Data() {
			super();
			// TODO Auto-generated constructor stub
		}

		private static final long serialVersionUID = 1L;
		String rmId;
		AccountDetails accountDetails;
		ApplicantDetails primaryApplicantDetail;
		ApplicantDetails guardianDetail;
		List<JointApplicants> jointApplicants;
	
		public String getRmId() {
			return rmId;
		}

		public void setRmId(String rmId) {
			this.rmId = rmId;
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
			return "Data [rmId=" + rmId + ", accountDetails=" + accountDetails + ", primaryApplicantDetail="
					+ primaryApplicantDetail + ", guardianDetail=" + guardianDetail + ", jointApplicants="
					+ jointApplicants + "]";
		}



		public class AccountDetails implements Serializable{
			private static final long serialVersionUID = 1L;
			String account;
			String accountType;
			String mop;
			String stmtDelivery;
			String stmtAddr1;
			String stmtAddr2;
			String stmtAddr3;
			String stmtCity;
			String stmtCountry;
			Boolean needCreditCard;
			Boolean needGlobalCustody;
			Boolean needForexBanking;
			Boolean needPrepaidCard;
			Boolean needInternetBanking;
			String internetBankingUn;
			Boolean otpOverEmail;
			Boolean otpOverSMS;
			Boolean pinViaSMS;
			Boolean pinViaPost;
			String prefCommMode;
			String whrDidYouHearAbtAfrAsia;
			Boolean agreeCommEmail;
			Boolean agreeCommSMS;
			Boolean optTransactionsThruEmail;
			String authEmail1;
			String authEmail2;
			String authEmail3;
			Boolean optCallBackServices;
	        String afrasiaEventQues;
	        String afrasiaEventAns;
	        Boolean requireChequeBook;

			
			List<NomineeInfo> nomineeInfo;
			
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
			public String getStmtDelivery() {
				return stmtDelivery;
			}
			public void setStmtDelivery(String stmtDelivery) {
				this.stmtDelivery = stmtDelivery;
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
			public boolean getOptTransactionsThruEmail() {
				return optTransactionsThruEmail;
			}
			public void setOptTransactionsThruEmail(boolean optTransactionsThruEmail) {
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
			public Boolean getRequireChequeBook() {
				return requireChequeBook;
			}
			public void setRequireChequeBook(Boolean requireChequeBook) {
				this.requireChequeBook = requireChequeBook;
			}
			@Override
			public String toString() {
				return "AccountDetails [account=" + account + ", accountType=" + accountType + ", mop=" + mop
						+ ", stmtDelivery=" + stmtDelivery + ", stmtAddr1=" + stmtAddr1 + ", stmtAddr2=" + stmtAddr2
						+ ", stmtAddr3=" + stmtAddr3 + ", stmtCity=" + stmtCity + ", stmtCountry=" + stmtCountry
						+ ", needCreditCard=" + needCreditCard + ", needGlobalCustody=" + needGlobalCustody
						+ ", needForexBanking=" + needForexBanking + ", needPrepaidCard=" + needPrepaidCard
						+ ", needInternetBanking=" + needInternetBanking + ", internetBankingUn=" + internetBankingUn
						+ ", otpOverEmail=" + otpOverEmail + ", otpOverSMS=" + otpOverSMS + ", pinViaSMS=" + pinViaSMS
						+ ", pinViaPost=" + pinViaPost + ", prefCommMode=" + prefCommMode + ", whrDidYouHearAbtAfrAsia="
						+ whrDidYouHearAbtAfrAsia + ", agreeCommEmail=" + agreeCommEmail + ", agreeCommSMS="
						+ agreeCommSMS + ", optTransactionsThruEmail=" + optTransactionsThruEmail + ", authEmail1="
						+ authEmail1 + ", authEmail2=" + authEmail2 + ", authEmail3=" + authEmail3
						+ ", optCallBackServices=" + optCallBackServices + ", afrasiaEventQues=" + afrasiaEventQues
						+ ", afrasiaEventAns=" + afrasiaEventAns + ", requireChequeBook=" + requireChequeBook
						+ ", nomineeInfo=" + nomineeInfo + "]";
			}
		}
	}
}
	
