package com.afrAsia.entities.masters;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MOB_FLEX_MASTER_RM")
public class RMDetails extends BaseMaster  implements Serializable{
	 
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "ID")
	private String id;
	
	@Column(name = "RM_NAME")
	private String rmName;
	
	@Column(name = "USER_GROUP")
	private String userGroup;
	
	@Column(name = "RM_EMAIL_ID")
	private String rmEmailId;
	
	@Column(name = "RM_MOB_NO")
	private Integer rmMobNo;
	
	@Column(name = "FLEX_ID")
	private String flex_Id;
	
	@Column(name = "RM_CODE")
	private String rmCode;

	@Column(name = "CREATED_BY")
	private String createdBy;
	
	@Column(name = "CREATED_DATE")
	private Date createdDate;
	
	@Column(name = "MODIFIED_BY")
	private String modifiedBy;
	
	@Column(name = "MODIFIED_DATE")
	private Date modifiedDate;
	
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

	public String getId() {
		return id;
	}

	public void setId(String rmId) {
		this.id = rmId;
	}

	public String getRmName() {
		return rmName;
	}

	public void setRmName(String rmName) {
		this.rmName = rmName;
	}
	
	public String getUserGroup() {
		return userGroup;
	}

	public void setUserGroup(String userGroup) {
		this.userGroup = userGroup;
	}

	public String getRmEmailId() {
		return rmEmailId;
	}

	public void setRmEmailId(String rmEmailId) {
		this.rmEmailId = rmEmailId;
	}

	public Integer getRmMobNo() {
		return rmMobNo;
	}

	public void setRmMobNo(Integer rmMobNo) {
		this.rmMobNo = rmMobNo;
	}

	public String getFlex_Id() {
		return flex_Id;
	}

	public void setFlex_Id(String flex_Id) {
		this.flex_Id = flex_Id;
	}

	public String getRmCode() {
		return rmCode;
	}

	public void setRmCode(String rmCode) {
		this.rmCode = rmCode;
	}

	@Override
	public String toString() {
		return "RMDetails [id=" + id + ", rmName=" + rmName + ", userGroup=" + userGroup + ", rmEmailId=" + rmEmailId
				+ ", rmMobNo=" + rmMobNo + ", flex_Id=" + flex_Id + ", createdBy=" + createdBy + ", createdDate="
				+ createdDate + ", modifiedBy=" + modifiedBy + ", modifiedDate=" + modifiedDate + "]";
	}
	
}
