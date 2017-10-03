package com.afrAsia.entities.transactions;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the MOB_ACCOUNT_ADDN_DETAILS_HIST database table.
 * 
 */
@Entity
@Table(name = "MOB_ACCOUNT_ADDN_DETAILS_HIST")
@NamedQuery(name = "MobAccountAddnDetailsHist.findAll", query = "SELECT m FROM MobAccountAddnDetailsHist m")
public class MobAccountAddnDetailsHist implements Serializable {
	private static final long serialVersionUID = 1L;

	// @EmbeddedId changed by sameer
	// private HistTableCompositePK id; changed by sameer

	@Id
	@SequenceGenerator(name = "MOB_ACCOUNT_ADDN_DETAILS_HIST_ID_RECORDID_GENERATOR", sequenceName = "AA_ACC_DTLS_HIST_ID_SEQUENCE")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MOB_ACCOUNT_ADDN_DETAILS_HIST_ID_RECORDID_GENERATOR")
	@Column(name = "ID")
	private Long id; 

	@Column(name = "RECORD_ID")
	private long recordId;

	@Column(name = "AUTH_EMAIL_1")
	private String authEmail1;

	@Column(name = "AUTH_EMAIL_2")
	private String authEmail2;

	@Column(name = "AUTH_EMAIL_3")
	private String authEmail3;

	@Column(name = "COMM_EMAIL") // changed by sameer, string to boolean
	private Boolean commEmail;

	@Column(name = "COMM_SMS") // changed by sameer, string to boolean
	private Boolean commSms;

	@Column(name = "CREATED_BY")
	private String createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATED_DATE")
	private Date createdDate;

	@Column(name = "CREDIT_CARD") // changed by sameer
	private Boolean creditCard;

	@Column(name = "FOREX_BANKING") // changed by sameer
	private Boolean forexBanking;

	@Column(name = "GLOBAL_CUSTODY") // changed by sameer
	private Boolean globalCustody;

	@Column(name = "IB_USERNAME")
	private String ibUsername;

	@Column(name = "INTERNET_BANKING") // changed by sameer
	private Boolean internetBanking;

	@Column(name = "MODIFIED_BY")
	private String modifiedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "MODIFIED_DATE")
	private Date modifiedDate;

	@Column(name = "NOMINEE_CALLBK_NUM1")
	private Long nomineeCallbkNum1; // changed by sameer

	@Column(name = "NOMINEE_CALLBK_NUM2")
	private Long nomineeCallbkNum2; // changed by sameer

	@Column(name = "NOMINEE_ID1")
	private String nomineeId1;

	@Column(name = "NOMINEE_ID2")
	private String nomineeId2;

	@Column(name = "NOMINEE_NAME1")
	private String nomineeName1;

	@Column(name = "NOMINEE_NAME2")
	private String nomineeName2;

	@Column(name = "OPT_CALLBK_SERVICES")
	private Boolean optCallbkServices; // string to boolean

	@Column(name = "OPT_TRAN_EMAIL") // string to boolean
	private Boolean optTranEmail;

	@Column(name = "OTP_EMAIL") // string to boolean
	private Boolean otpEmail;

	@Column(name = "OTP_SMS") // string to boolean
	private Boolean otpSms;

	@Column(name = "PIN_VIA_POST") // string to boolean
	private Boolean pinViaPost;

	@Column(name = "PIN_VIA_SMS") // string to boolean
	private Boolean pinViaSms;

	@Column(name = "PREF_COMM_MODE")
	private String prefCommMode;

	@Column(name = "PREPAID_CARDS") // string to boolean
	private Boolean prepaidCards;

	@Column(name = "STMT_ADDR_1")
	private String stmtAddr1;

	@Column(name = "STMT_ADDR_2")
	private String stmtAddr2;

	@Column(name = "STMT_ADDR_3")
	private String stmtAddr3;

	@Column(name = "STMT_CITY")
	private String stmtCity;

	@Column(name = "STMT_COUNTRY")
	private String stmtCountry;

	@Column(name = "STMT_DELIVERY_PO")
	private Boolean stmtDeliveryPo;
	
	@Column(name = "STMT_DELIVERY_ESTMT")
	private Boolean stmtDeliveryEstmt;

	@Column(name = "REQUIRE_CHQ_BOOK")
	private Boolean requireChqBook;

	@Column(name = "NOMINEE_EMAIL1")
	private String nomineeEmail1;

	@Column(name = "NOMINEE_EMAIL2")
	private String nomineeEmail2;
	
	@Column(name = "NOMINEE_CC1")
	private Long nomineeCc1;
	
	@Column(name = "NOMINEE_CC2")
	private Long nomineeCc2;
	
	@Column(name = "RM_COMMENT")
	private String rmComment;//Added by Avisha on 26/09 as asked by client
	
	@Column(name = "IB_OPTION")
	private String ibOption;//Added by Avisha on 27/09 as asked by client

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public long getRecordId() {
		return recordId;
	}

	public void setRecordId(long recordId) {
		this.recordId = recordId;
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

	public Boolean getCommEmail() {
		return commEmail;
	}

	public void setCommEmail(Boolean commEmail) {
		this.commEmail = commEmail;
	}

	public Boolean getCommSms() {
		return commSms;
	}

	public void setCommSms(Boolean commSms) {
		this.commSms = commSms;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Boolean getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(Boolean creditCard) {
		this.creditCard = creditCard;
	}

	public Boolean getForexBanking() {
		return forexBanking;
	}

	public void setForexBanking(Boolean forexBanking) {
		this.forexBanking = forexBanking;
	}

	public Boolean getGlobalCustody() {
		return globalCustody;
	}

	public void setGlobalCustody(Boolean globalCustody) {
		this.globalCustody = globalCustody;
	}

	public String getIbUsername() {
		return ibUsername;
	}

	public void setIbUsername(String ibUsername) {
		this.ibUsername = ibUsername;
	}

	public Boolean getInternetBanking() {
		return internetBanking;
	}

	public void setInternetBanking(Boolean internetBanking) {
		this.internetBanking = internetBanking;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public Long getNomineeCallbkNum1() {
		return nomineeCallbkNum1;
	}

	public void setNomineeCallbkNum1(Long nomineeCallbkNum1) {
		this.nomineeCallbkNum1 = nomineeCallbkNum1;
	}

	public Long getNomineeCallbkNum2() {
		return nomineeCallbkNum2;
	}

	public void setNomineeCallbkNum2(Long nomineeCallbkNum2) {
		this.nomineeCallbkNum2 = nomineeCallbkNum2;
	}

	public String getNomineeId1() {
		return nomineeId1;
	}

	public void setNomineeId1(String nomineeId1) {
		this.nomineeId1 = nomineeId1;
	}

	public String getNomineeId2() {
		return nomineeId2;
	}

	public void setNomineeId2(String nomineeId2) {
		this.nomineeId2 = nomineeId2;
	}

	public String getNomineeName1() {
		return nomineeName1;
	}

	public void setNomineeName1(String nomineeName1) {
		this.nomineeName1 = nomineeName1;
	}

	public String getNomineeName2() {
		return nomineeName2;
	}

	public void setNomineeName2(String nomineeName2) {
		this.nomineeName2 = nomineeName2;
	}

	public Boolean getOptCallbkServices() {
		return optCallbkServices;
	}

	public void setOptCallbkServices(Boolean optCallbkServices) {
		this.optCallbkServices = optCallbkServices;
	}

	public Boolean getOptTranEmail() {
		return optTranEmail;
	}

	public void setOptTranEmail(Boolean optTranEmail) {
		this.optTranEmail = optTranEmail;
	}

	public Boolean getOtpEmail() {
		return otpEmail;
	}

	public void setOtpEmail(Boolean otpEmail) {
		this.otpEmail = otpEmail;
	}

	public Boolean getOtpSms() {
		return otpSms;
	}

	public void setOtpSms(Boolean otpSms) {
		this.otpSms = otpSms;
	}

	public Boolean getPinViaPost() {
		return pinViaPost;
	}

	public void setPinViaPost(Boolean pinViaPost) {
		this.pinViaPost = pinViaPost;
	}

	public Boolean getPinViaSms() {
		return pinViaSms;
	}

	public void setPinViaSms(Boolean pinViaSms) {
		this.pinViaSms = pinViaSms;
	}

	public String getPrefCommMode() {
		return prefCommMode;
	}

	public void setPrefCommMode(String prefCommMode) {
		this.prefCommMode = prefCommMode;
	}

	public Boolean getPrepaidCards() {
		return prepaidCards;
	}

	public void setPrepaidCards(Boolean prepaidCards) {
		this.prepaidCards = prepaidCards;
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

	public Boolean getRequireChqBook() {
		return requireChqBook;
	}

	public void setRequireChqBook(Boolean requireChqBook) {
		this.requireChqBook = requireChqBook;
	}

	public String getNomineeEmail1() {
		return nomineeEmail1;
	}

	public void setNomineeEmail1(String nomineeEmail1) {
		this.nomineeEmail1 = nomineeEmail1;
	}

	public String getNomineeEmail2() {
		return nomineeEmail2;
	}

	public void setNomineeEmail2(String nomineeEmail2) {
		this.nomineeEmail2 = nomineeEmail2;
	}

	public Long getNomineeCc1() {
		return nomineeCc1;
	}

	public void setNomineeCc1(Long nomineeCc1) {
		this.nomineeCc1 = nomineeCc1;
	}

	public Long getNomineeCc2() {
		return nomineeCc2;
	}

	public void setNomineeCc2(Long nomineeCc2) {
		this.nomineeCc2 = nomineeCc2;
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
		return "MobAccountAddnDetailsHist [id=" + id + ", recordId=" + recordId + ", authEmail1=" + authEmail1
				+ ", authEmail2=" + authEmail2 + ", authEmail3=" + authEmail3 + ", commEmail=" + commEmail
				+ ", commSms=" + commSms + ", createdBy=" + createdBy + ", createdDate=" + createdDate + ", creditCard="
				+ creditCard + ", forexBanking=" + forexBanking + ", globalCustody=" + globalCustody + ", ibUsername="
				+ ibUsername + ", internetBanking=" + internetBanking + ", modifiedBy=" + modifiedBy + ", modifiedDate="
				+ modifiedDate + ", nomineeCallbkNum1=" + nomineeCallbkNum1 + ", nomineeCallbkNum2=" + nomineeCallbkNum2
				+ ", nomineeId1=" + nomineeId1 + ", nomineeId2=" + nomineeId2 + ", nomineeName1=" + nomineeName1
				+ ", nomineeName2=" + nomineeName2 + ", optCallbkServices=" + optCallbkServices + ", optTranEmail="
				+ optTranEmail + ", otpEmail=" + otpEmail + ", otpSms=" + otpSms + ", pinViaPost=" + pinViaPost
				+ ", pinViaSms=" + pinViaSms + ", prefCommMode=" + prefCommMode + ", prepaidCards=" + prepaidCards
				+ ", stmtAddr1=" + stmtAddr1 + ", stmtAddr2=" + stmtAddr2 + ", stmtAddr3=" + stmtAddr3 + ", stmtCity="
				+ stmtCity + ", stmtCountry=" + stmtCountry + ", stmtDeliveryPo=" + stmtDeliveryPo
				+ ", stmtDeliveryEstmt=" + stmtDeliveryEstmt + ", requireChqBook=" + requireChqBook
				+ ", nomineeEmail1=" + nomineeEmail1 + ", nomineeEmail2=" + nomineeEmail2 + ", nomineeCc1=" + nomineeCc1 + ", nomineeCc2="
				+ nomineeCc2 + ", rmComment=" + rmComment + ", ibOption=" + ibOption + "]";
	}

}