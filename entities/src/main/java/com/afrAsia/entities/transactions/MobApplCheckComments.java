package com.afrAsia.entities.transactions;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;

/**
 * The persistent class for the MOB_APPLICATION_COMP_STATUS database table.
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
	private Boolean kycComment;

	@Column(name = "KYC_COMMENT_BY")
	private String kycCommentBy;

	@Column(name = "KYC_DATE")
	private Boolean kycDate;

	@Column(name = "WC_COMMENT")
	private String wcComment;

	@Column(name = "WC_COMMENT_BY")
	private String wcCommentBy;

	@Column(name = "WC_DATE")
	private String wcDate;

	@Column(name = "CC_COMMENT")
	private Date ccComment;

	@Column(name = "CC_COMMENT_BY")
	private Boolean ccCommentBy;

	@Column(name = "CC_DATE")
	private String ccDate;

	@Column(name = "IC_COMMENT")
	private String icComment;

	@Column(name = "IC_COMMENT_BY")
	private String icCommentBy;

	@Column(name = "IC_DATE")
	private Date icDate;

	@Column(name = "COMP_COMMENT")
	private Boolean compComment;

	@Column(name = "COMP_ID")
	private String compId;

	@Column(name = "RM_COMMENT")
	private String rmComment;

	@Column(name = "RM_ID")
	private String rmId;

	@Column(name = "FLEX_ERROR_CODE")
	private Date flexErrorCode;

	@Column(name = "FLEX_ERROR_MESSAGE")
	private Boolean flexErrorMessage;

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

	public MobApplCheckComments() {
	}

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

	public Boolean getKycComment() {
		return kycComment;
	}

	public void setKycComment(Boolean kycComment) {
		this.kycComment = kycComment;
	}

	public String getKycCommentBy() {
		return kycCommentBy;
	}

	public void setKycCommentBy(String kycCommentBy) {
		this.kycCommentBy = kycCommentBy;
	}

	public Boolean getKycDate() {
		return kycDate;
	}

	public void setKycDate(Boolean kycDate) {
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

	public String getWcDate() {
		return wcDate;
	}

	public void setWcDate(String wcDate) {
		this.wcDate = wcDate;
	}

	public Date getCcComment() {
		return ccComment;
	}

	public void setCcComment(Date ccComment) {
		this.ccComment = ccComment;
	}

	public Boolean getCcCommentBy() {
		return ccCommentBy;
	}

	public void setCcCommentBy(Boolean ccCommentBy) {
		this.ccCommentBy = ccCommentBy;
	}

	public String getCcDate() {
		return ccDate;
	}

	public void setCcDate(String ccDate) {
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

	public Boolean getCompComment() {
		return compComment;
	}

	public void setCompComment(Boolean compComment) {
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

	public Date getFlexErrorCode() {
		return flexErrorCode;
	}

	public void setFlexErrorCode(Date flexErrorCode) {
		this.flexErrorCode = flexErrorCode;
	}

	public Boolean getFlexErrorMessage() {
		return flexErrorMessage;
	}

	public void setFlexErrorMessage(Boolean flexErrorMessage) {
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

	@Override
	public String toString() {
		return "MobApplCheckComments [id=" + id + ", recordId=" + recordId + ", kycComment=" + kycComment
				+ ", kycCommentBy=" + kycCommentBy + ", kycDate=" + kycDate + ", wcComment=" + wcComment
				+ ", wcCommentBy=" + wcCommentBy + ", wcDate=" + wcDate + ", ccComment=" + ccComment + ", ccCommentBy="
				+ ccCommentBy + ", ccDate=" + ccDate + ", icComment=" + icComment + ", icCommentBy=" + icCommentBy
				+ ", icDate=" + icDate + ", compComment=" + compComment + ", compId=" + compId + ", rmComment="
				+ rmComment + ", rmId=" + rmId + ", flexErrorCode=" + flexErrorCode + ", flexErrorMessage="
				+ flexErrorMessage + ", createdBy=" + createdBy + ", createdDate=" + createdDate + ", modifiedBy="
				+ modifiedBy + ", modifiedDate=" + modifiedDate + "]";
	}

}