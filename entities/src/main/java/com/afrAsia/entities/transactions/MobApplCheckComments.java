package com.afrAsia.entities.transactions;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;

/**
 * The persistent class for the MOB_APPL_CHECK_COMMENTS database table.
 * 
 */
@Entity
@Table(name = "MOB_APPL_CHECK_COMMENTS")
@NamedQuery(name = "MobApplCheckComments.findAll", query = "SELECT m FROM MobApplCheckComments m")
public class MobApplCheckComments implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID")
	private Long id;

	@Id
	@Column(name = "RECORD_ID")
	private Long recordId;

	@Column(name = "KYC_COMMENT")
	private String kycComment;

	@Column(name = "KYC_COMMENT_BY")
	private String kycCommentBy;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "KYC_DATE")
	private Date kycDate;

	@Column(name = "WC_COMMENT")
	private String wcComment;

	@Column(name = "WC_COMMENT_BY")
	private String wcCommentBy;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "WC_DATE")
	private Date wcDate;

	@Column(name = "CC_COMMENT")
	private String ccComment;

	@Column(name = "CC_COMMENT_BY")
	private String ccCommentBy;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CC_DATE")
	private Date ccDate;

	@Column(name = "IC_COMMENT")
	private String icComment;

	@Column(name = "IC_COMMENT_BY")
	private String icCommentBy;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "IC_DATE")
	private Date icDate;

	@Column(name = "COMP_COMMENT")
	private String compComment;

	@Column(name = "COMP_ID")
	private String compId;

	@Column(name = "RM_COMMENT")
	private String rmComment;

	@Column(name = "RM_ID")
	private String rmId;

	@Column(name = "FLEX_ERROR_CODE")
	private String flexErrorCode;

	@Column(name = "FLEX_ERROR_MESSAGE")
	private String flexErrorMessage;

	@Column(name = "CREATED_BY")
	private String createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATED_DATE")
	private Date createdDate;

	@Column(name = "MODIFIED_BY")
	private String modifiedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "MODIFIED_DATE")
	private Date modifiedDate;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "COMP_DATE")
	private Date compDate;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "RM_DATE")
	private Date rmDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getRecordId() {
		return recordId;
	}

	public void setRecordId(Long recordId) {
		this.recordId = recordId;
	}

	public String getKycComment() {
		return kycComment;
	}

	public void setKycComment(String kycComment) {
		this.kycComment = kycComment;
	}

	public String getKycCommentBy() {
		return kycCommentBy;
	}

	public void setKycCommentBy(String kycCommentBy) {
		this.kycCommentBy = kycCommentBy;
	}

	public Date getKycDate() {
		return kycDate;
	}

	public void setKycDate(Date kycDate) {
		this.kycDate = kycDate;
	}

	public String getWcComment() {
		return wcComment;
	}

	public void setWcComment(String wcComment) {
		this.wcComment = wcComment;
	}

	public String getWcCommentBy() {
		return wcCommentBy;
	}

	public void setWcCommentBy(String wcCommentBy) {
		this.wcCommentBy = wcCommentBy;
	}

	public Date getWcDate() {
		return wcDate;
	}

	public void setWcDate(Date wcDate) {
		this.wcDate = wcDate;
	}

	public String getCcComment() {
		return ccComment;
	}

	public void setCcComment(String ccComment) {
		this.ccComment = ccComment;
	}

	public String getCcCommentBy() {
		return ccCommentBy;
	}

	public void setCcCommentBy(String ccCommentBy) {
		this.ccCommentBy = ccCommentBy;
	}

	public Date getCcDate() {
		return ccDate;
	}

	public void setCcDate(Date ccDate) {
		this.ccDate = ccDate;
	}

	public String getIcComment() {
		return icComment;
	}

	public void setIcComment(String icComment) {
		this.icComment = icComment;
	}

	public String getIcCommentBy() {
		return icCommentBy;
	}

	public void setIcCommentBy(String icCommentBy) {
		this.icCommentBy = icCommentBy;
	}

	public Date getIcDate() {
		return icDate;
	}

	public void setIcDate(Date icDate) {
		this.icDate = icDate;
	}

	public String getCompComment() {
		return compComment;
	}

	public void setCompComment(String compComment) {
		this.compComment = compComment;
	}

	public String getCompId() {
		return compId;
	}

	public void setCompId(String compId) {
		this.compId = compId;
	}

	public String getRmComment() {
		return rmComment;
	}

	public void setRmComment(String rmComment) {
		this.rmComment = rmComment;
	}

	public String getRmId() {
		return rmId;
	}

	public void setRmId(String rmId) {
		this.rmId = rmId;
	}

	public String getFlexErrorCode() {
		return flexErrorCode;
	}

	public void setFlexErrorCode(String flexErrorCode) {
		this.flexErrorCode = flexErrorCode;
	}

	public String getFlexErrorMessage() {
		return flexErrorMessage;
	}

	public void setFlexErrorMessage(String flexErrorMessage) {
		this.flexErrorMessage = flexErrorMessage;
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

	public Date getCompDate() {
		return compDate;
	}

	public void setCompDate(Date compDate) {
		this.compDate = compDate;
	}

	public Date getRmDate() {
		return rmDate;
	}

	public void setRmDate(Date rmDate) {
		this.rmDate = rmDate;
	}

	@Override
	public String toString() {
		return "MobApplCheckComments [id=" + id + ", recordId=" + recordId + ", kycComment=" + kycComment
				+ ", kycCommentBy=" + kycCommentBy + ", kycDate=" + kycDate + ", wcComment=" + wcComment
				+ ", wcCommentBy=" + wcCommentBy + ", wcDate=" + wcDate + ", ccComment=" + ccComment + ", ccCommentBy="
				+ ccCommentBy + ", ccDate=" + ccDate + ", icComment=" + icComment + ", icCommentBy=" + icCommentBy
				+ ", icDate=" + icDate + ", compComment=" + compComment + ", compId=" + compId + ", rmComment="
				+ rmComment + ", rmId=" + rmId + ", flexErrorCode=" + flexErrorCode + ", flexErrorMessage="
				+ flexErrorMessage + ", createdBy=" + createdBy + ", createdDate=" + createdDate + ", modifiedBy="
				+ modifiedBy + ", modifiedDate=" + modifiedDate + ", compDate=" + compDate + ", rmDate=" + rmDate + "]";
	}
	
	
	
}