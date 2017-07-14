package com.afrAsia.entities.transactions;
import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the MOB_ACCOUNT_ADDN_DETAILS_HIST database table.
 * 
 */
@Entity
@Table(name="MOB_ACCOUNT_ADDN_DETAILS_HIST")
@NamedQuery(name="MobAccountAddnDetailsHist.findAll", query="SELECT m FROM MobAccountAddnDetailsHist m")
public class MobAccountAddnDetailsHist implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private HistTableCompositePK id;
	@Column(name="RECORD_ID")
	private long recordId;

	@Column(name="AUTH_EMAIL_1")
	private String authEmail1;

	@Column(name="AUTH_EMAIL_2")
	private String authEmail2;

	@Column(name="AUTH_EMAIL_3")
	private String authEmail3;

	@Column(name="COMM_EMAIL")
	private String commEmail;

	@Column(name="COMM_SMS")
	private String commSms;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_DATE")
	private Date createdDate;

	@Column(name="CREDIT_CARD")
	private String creditCard;

	@Column(name="FOREX_BANKING")
	private String forexBanking;

	@Column(name="GLOBAL_CUSTODY")
	private String globalCustody;

	@Column(name="HEAR_ABOUT_AFRASIA")
	private String hearAboutAfrasia;

	@Column(name="IB_USERNAME")
	private String ibUsername;

	@Column(name="INTERNET_BANKING")
	private String internetBanking;

	@Column(name="MODIFIED_BY")
	private String modifiedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="MODIFIED_DATE")
	private Date modifiedDate;

	@Column(name="NOMINEE_CALLBK_NUM")
	private BigDecimal nomineeCallbkNum;

	@Column(name="NOMINEE_CALLBK_NUM1")
	private BigDecimal nomineeCallbkNum1;

	@Column(name="NOMINEE_CALLBK_NUM2")
	private BigDecimal nomineeCallbkNum2;

	@Column(name="NOMINEE_ID")
	private String nomineeId;

	@Column(name="NOMINEE_ID1")
	private String nomineeId1;

	@Column(name="NOMINEE_ID2")
	private String nomineeId2;

	@Column(name="NOMINEE_NAME")
	private String nomineeName;

	@Column(name="NOMINEE_NAME1")
	private String nomineeName1;

	@Column(name="NOMINEE_NAME2")
	private String nomineeName2;

	@Column(name="OPT_CALLBK_SERVICES")
	private String optCallbkServices;

	@Column(name="OPT_TRAN_EMAIL")
	private String optTranEmail;

	@Column(name="OTP_EMAIL")
	private String otpEmail;

	@Column(name="OTP_SMS")
	private String otpSms;

	@Column(name="PIN_VIA_POST")
	private String pinViaPost;

	@Column(name="PIN_VIA_SMS")
	private String pinViaSms;

	@Column(name="PREF_COMM_MODE")
	private String prefCommMode;

	@Column(name="PREPAID_CARDS")
	private String prepaidCards;

	@Column(name="STMT_ADDR_1")
	private String stmtAddr1;

	@Column(name="STMT_ADDR_2")
	private String stmtAddr2;

	@Column(name="STMT_ADDR_3")
	private String stmtAddr3;

	@Column(name="STMT_CITY")
	private String stmtCity;

	@Column(name="STMT_COUNTRY")
	private String stmtCountry;

	@Column(name="STMT_DELIVERY")
	private String stmtDelivery;

	public MobAccountAddnDetailsHist() {
	}
	
	
	public HistTableCompositePK getId() {
		return id;
	}


	public void setId(HistTableCompositePK id) {
		this.id = id;
	}


	public long getRecordId() {
		return this.recordId;
	}

	public void setRecordId(long recordId) {
		this.recordId = recordId;
	}

	public String getAuthEmail1() {
		return this.authEmail1;
	}

	public void setAuthEmail1(String authEmail1) {
		this.authEmail1 = authEmail1;
	}

	public String getAuthEmail2() {
		return this.authEmail2;
	}

	public void setAuthEmail2(String authEmail2) {
		this.authEmail2 = authEmail2;
	}

	public String getAuthEmail3() {
		return this.authEmail3;
	}

	public void setAuthEmail3(String authEmail3) {
		this.authEmail3 = authEmail3;
	}

	public String getCommEmail() {
		return this.commEmail;
	}

	public void setCommEmail(String commEmail) {
		this.commEmail = commEmail;
	}

	public String getCommSms() {
		return this.commSms;
	}

	public void setCommSms(String commSms) {
		this.commSms = commSms;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getCreditCard() {
		return this.creditCard;
	}

	public void setCreditCard(String creditCard) {
		this.creditCard = creditCard;
	}

	public String getForexBanking() {
		return this.forexBanking;
	}

	public void setForexBanking(String forexBanking) {
		this.forexBanking = forexBanking;
	}

	public String getGlobalCustody() {
		return this.globalCustody;
	}

	public void setGlobalCustody(String globalCustody) {
		this.globalCustody = globalCustody;
	}

	public String getHearAboutAfrasia() {
		return this.hearAboutAfrasia;
	}

	public void setHearAboutAfrasia(String hearAboutAfrasia) {
		this.hearAboutAfrasia = hearAboutAfrasia;
	}

	public String getIbUsername() {
		return this.ibUsername;
	}

	public void setIbUsername(String ibUsername) {
		this.ibUsername = ibUsername;
	}

	public String getInternetBanking() {
		return this.internetBanking;
	}

	public void setInternetBanking(String internetBanking) {
		this.internetBanking = internetBanking;
	}

	public String getModifiedBy() {
		return this.modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Date getModifiedDate() {
		return this.modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public BigDecimal getNomineeCallbkNum() {
		return this.nomineeCallbkNum;
	}

	public void setNomineeCallbkNum(BigDecimal nomineeCallbkNum) {
		this.nomineeCallbkNum = nomineeCallbkNum;
	}

	public BigDecimal getNomineeCallbkNum1() {
		return this.nomineeCallbkNum1;
	}

	public void setNomineeCallbkNum1(BigDecimal nomineeCallbkNum1) {
		this.nomineeCallbkNum1 = nomineeCallbkNum1;
	}

	public BigDecimal getNomineeCallbkNum2() {
		return this.nomineeCallbkNum2;
	}

	public void setNomineeCallbkNum2(BigDecimal nomineeCallbkNum2) {
		this.nomineeCallbkNum2 = nomineeCallbkNum2;
	}

	public String getNomineeId() {
		return this.nomineeId;
	}

	public void setNomineeId(String nomineeId) {
		this.nomineeId = nomineeId;
	}

	public String getNomineeId1() {
		return this.nomineeId1;
	}

	public void setNomineeId1(String nomineeId1) {
		this.nomineeId1 = nomineeId1;
	}

	public String getNomineeId2() {
		return this.nomineeId2;
	}

	public void setNomineeId2(String nomineeId2) {
		this.nomineeId2 = nomineeId2;
	}

	public String getNomineeName() {
		return this.nomineeName;
	}

	public void setNomineeName(String nomineeName) {
		this.nomineeName = nomineeName;
	}

	public String getNomineeName1() {
		return this.nomineeName1;
	}

	public void setNomineeName1(String nomineeName1) {
		this.nomineeName1 = nomineeName1;
	}

	public String getNomineeName2() {
		return this.nomineeName2;
	}

	public void setNomineeName2(String nomineeName2) {
		this.nomineeName2 = nomineeName2;
	}

	public String getOptCallbkServices() {
		return this.optCallbkServices;
	}

	public void setOptCallbkServices(String optCallbkServices) {
		this.optCallbkServices = optCallbkServices;
	}

	public String getOptTranEmail() {
		return this.optTranEmail;
	}

	public void setOptTranEmail(String optTranEmail) {
		this.optTranEmail = optTranEmail;
	}

	public String getOtpEmail() {
		return this.otpEmail;
	}

	public void setOtpEmail(String otpEmail) {
		this.otpEmail = otpEmail;
	}

	public String getOtpSms() {
		return this.otpSms;
	}

	public void setOtpSms(String otpSms) {
		this.otpSms = otpSms;
	}

	public String getPinViaPost() {
		return this.pinViaPost;
	}

	public void setPinViaPost(String pinViaPost) {
		this.pinViaPost = pinViaPost;
	}

	public String getPinViaSms() {
		return this.pinViaSms;
	}

	public void setPinViaSms(String pinViaSms) {
		this.pinViaSms = pinViaSms;
	}

	public String getPrefCommMode() {
		return this.prefCommMode;
	}

	public void setPrefCommMode(String prefCommMode) {
		this.prefCommMode = prefCommMode;
	}

	public String getPrepaidCards() {
		return this.prepaidCards;
	}

	public void setPrepaidCards(String prepaidCards) {
		this.prepaidCards = prepaidCards;
	}

	public String getStmtAddr1() {
		return this.stmtAddr1;
	}

	public void setStmtAddr1(String stmtAddr1) {
		this.stmtAddr1 = stmtAddr1;
	}

	public String getStmtAddr2() {
		return this.stmtAddr2;
	}

	public void setStmtAddr2(String stmtAddr2) {
		this.stmtAddr2 = stmtAddr2;
	}

	public String getStmtAddr3() {
		return this.stmtAddr3;
	}

	public void setStmtAddr3(String stmtAddr3) {
		this.stmtAddr3 = stmtAddr3;
	}

	public String getStmtCity() {
		return this.stmtCity;
	}

	public void setStmtCity(String stmtCity) {
		this.stmtCity = stmtCity;
	}

	public String getStmtCountry() {
		return this.stmtCountry;
	}

	public void setStmtCountry(String stmtCountry) {
		this.stmtCountry = stmtCountry;
	}

	public String getStmtDelivery() {
		return this.stmtDelivery;
	}

	public void setStmtDelivery(String stmtDelivery) {
		this.stmtDelivery = stmtDelivery;
	}


	@Override
	public String toString() {
		return "MobAccountAddnDetailsHist [id=" + id + ", recordId=" + recordId + ", authEmail1=" + authEmail1
				+ ", authEmail2=" + authEmail2 + ", authEmail3=" + authEmail3 + ", commEmail=" + commEmail
				+ ", commSms=" + commSms + ", createdBy=" + createdBy + ", createdDate=" + createdDate + ", creditCard="
				+ creditCard + ", forexBanking=" + forexBanking + ", globalCustody=" + globalCustody
				+ ", hearAboutAfrasia=" + hearAboutAfrasia + ", ibUsername=" + ibUsername + ", internetBanking="
				+ internetBanking + ", modifiedBy=" + modifiedBy + ", modifiedDate=" + modifiedDate
				+ ", nomineeCallbkNum=" + nomineeCallbkNum + ", nomineeCallbkNum1=" + nomineeCallbkNum1
				+ ", nomineeCallbkNum2=" + nomineeCallbkNum2 + ", nomineeId=" + nomineeId + ", nomineeId1=" + nomineeId1
				+ ", nomineeId2=" + nomineeId2 + ", nomineeName=" + nomineeName + ", nomineeName1=" + nomineeName1
				+ ", nomineeName2=" + nomineeName2 + ", optCallbkServices=" + optCallbkServices + ", optTranEmail="
				+ optTranEmail + ", otpEmail=" + otpEmail + ", otpSms=" + otpSms + ", pinViaPost=" + pinViaPost
				+ ", pinViaSms=" + pinViaSms + ", prefCommMode=" + prefCommMode + ", prepaidCards=" + prepaidCards
				+ ", stmtAddr1=" + stmtAddr1 + ", stmtAddr2=" + stmtAddr2 + ", stmtAddr3=" + stmtAddr3 + ", stmtCity="
				+ stmtCity + ", stmtCountry=" + stmtCountry + ", stmtDelivery=" + stmtDelivery + "]";
	}
	
}