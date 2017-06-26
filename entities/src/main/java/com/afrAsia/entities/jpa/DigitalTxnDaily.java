package com.afrAsia.entities.jpa;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.afrAsia.entities.base.BaseEntity;
import com.afrAsia.entities.listener.EntityListener;

/**
 * 
 * @author nyalfernandes
 *
 */
@Entity
@Table(name = "fct_digital_txn_daily")
@EntityListeners(value = { EntityListener.class })
@NamedQueries
({
		@NamedQuery(name = DigitalTxnDaily.QUERY_FETCH_BY_TXN_DATE, query = "SELECT t FROM DigitalTxnDaily t WHERE t.txnDate = :txnDate AND t.onUsInd = :onUsInd")
})

@NamedStoredProcedureQuery
(
		name = DigitalTxnDaily.QUERY_SP_FETCH_BY_TXN_DATE, procedureName = "PROC_GET_DIGITAL_TXN_DAILY", resultClasses = DigitalTxnDaily.class,
		parameters = 
		{
				@StoredProcedureParameter(name = "REF_DIGITAL_TXN", mode = ParameterMode.REF_CURSOR, type = void.class),
				@StoredProcedureParameter(name = "V_TXN_DATE", mode = ParameterMode.IN, type = Date.class) 
		}
)

public class DigitalTxnDaily extends BaseEntity {

	private static final long serialVersionUID = 1L;

	public static final String QUERY_FETCH_BY_TXN_DATE = "fetchDigitalDataByTxnDate";
	public static final String QUERY_SP_FETCH_BY_TXN_DATE = "spFetchDigitalDataByTxnDate";

	@Column(name = "REMITTER_IFSC_CODE")
	private String remitterIFSCCode;

	@Column(name = "RECIPIENT_IFSC_CODE")
	private String recipientIFSCCode;

	@Column(name = "TXN_VALUE")
	private BigDecimal txnValue;

	@Column(name = "TXN_STATUS")
	private String txnStatus;

	@Column(name = "TXN_MODE")
	private Integer txnMode;

	@Column(name = "TXN_MODE_DESC")
	private String txnModeDesc;

	@Column(name = "MERCHANT_TYPE_CODE")
	private Integer merchantTypeCode;

	@Column(name = "TXN_TYPE")
	private String txtType;

	@Column(name = "TXN_DATE")
	@Temporal(TemporalType.DATE)
	private Date txnDate;

	@Column(name = "CURRENT_FLAG")
	private Integer currentFlag;

	@Column(name = "TRAN_ID")
	private String txnId;

	@Column(name = "PART_TRAN_SRL_NUM")
	private String partTxnSerialNo;

	@Column(name = "ERROR_CODE")
	private String errorCode;

	@Column(name = "RESPONSE_CODE")
	private String responseCode;
	
	@Column(name = "ON_US_IND")
	private Integer onUsInd;
	
	public Integer getOnUsInd() {
		return onUsInd;
	}
	
	public void setOnUsInd(Integer onUsInd) {
		this.onUsInd = onUsInd;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

	public String getTxnModeDesc() {
		return txnModeDesc;
	}

	public void setTxnModeDesc(String txnModeDesc) {
		this.txnModeDesc = txnModeDesc;
	}

	public Integer getCurrentFlag() {
		return currentFlag;
	}

	public void setCurrentFlag(Integer currentFlag) {
		this.currentFlag = currentFlag;
	}

	public String getTxnId() {
		return txnId;
	}

	public void setTxnId(String txnId) {
		this.txnId = txnId;
	}

	public String getPartTxnSerialNo() {
		return partTxnSerialNo;
	}

	public void setPartTxnSerialNo(String partTxnSerialNo) {
		this.partTxnSerialNo = partTxnSerialNo;
	}

	public String getRemitterIFSCCode() {
		return remitterIFSCCode;
	}

	public void setRemitterIFSCCode(String remitterIFSCCode) {
		this.remitterIFSCCode = remitterIFSCCode;
	}

	public String getRecipientIFSCCode() {
		return recipientIFSCCode;
	}

	public void setRecipientIFSCCode(String recipientIFSCCode) {
		this.recipientIFSCCode = recipientIFSCCode;
	}

	public BigDecimal getTxnValue() {
		return txnValue;
	}

	public void setTxnValue(BigDecimal txnValue) {
		this.txnValue = txnValue;
	}

	public String getTxnStatus() {
		return txnStatus;
	}

	public void setTxnStatus(String txnStatus) {
		this.txnStatus = txnStatus;
	}

	public Integer getTxnMode() {
		return txnMode;
	}

	public void setTxnMode(Integer txnMode) {
		this.txnMode = txnMode;
	}

	public Integer getMerchantTypeCode() {
		return merchantTypeCode;
	}

	public void setMerchantTypeCode(Integer merchantTypeCode) {
		this.merchantTypeCode = merchantTypeCode;
	}

	public String getTxtType() {
		return txtType;
	}

	public void setTxtType(String txtType) {
		this.txtType = txtType;
	}

	public Date getTxnDate() {
		return txnDate;
	}

	public void setTxnDate(Date txnDate) {
		this.txnDate = txnDate;
	}

	@Override
	public String toString() {
		return "DigitalTxnDaily [remitterIFSCCode=" + remitterIFSCCode + ", recipientIFSCCode=" + recipientIFSCCode
				+ ", txnValue=" + txnValue + ", txnStatus=" + txnStatus + ", txnMode=" + txnMode + ", txnModeDesc="
				+ txnModeDesc + ", merchantTypeCode=" + merchantTypeCode + ", txtType=" + txtType + ", txnDate="
				+ txnDate + ", currentFlag=" + currentFlag + ", txnId=" + txnId + ", partTxnSerialNo=" + partTxnSerialNo
				+ ", errorCode=" + errorCode + ", responseCode=" + responseCode + "]";
	}

}
