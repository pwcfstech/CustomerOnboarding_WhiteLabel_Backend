package com.afrAsia.entities.transactions;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the MOB_ACCOUNT_DETAILS database table.
 * 
 */
@Entity
@Table(name="MOB_ACCOUNT_DETAILS")
@NamedQuery(name="MobAccountDetail.findAll", query="SELECT m FROM MobAccountDetail m")
public class MobAccountDetail implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="ID")
	private Long id;

	@Column(name="ACCOUNT_CATEGORY")
	private String accountCategory;

	@Column(name="ACCOUNT_TYPE")
	private String accountType;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_DATE")
	private Date createdDate;

	@Column(name="INDV_APPLICANT_REF_NO")
	private Long indvApplicantRefNo;

	@Column(name="INDV_GUARDIAN_REF_NO")
	private Long indvGuardianRefNo;

	@Column(name="JOINT1_APPLICANT_REF_NO")
	private Long joint1ApplicantRefNo;

	@Column(name="JOINT1_GUARDIAN_REF_NO")
	private Long joint1GuardianRefNo;

	@Column(name="JOINT2_APPLICANT_REF_NO")
	private Long joint2ApplicantRefNo;

	@Column(name="JOINT2_GUARDIAN_REF_NO")
	private Long joint2GuardianRefNo;

	@Column(name="JOINT3_APPLICANT_REF_NO")
	private Long joint3ApplicantRefNo;

	@Column(name="JOINT3_GUARDIAN_REF_NO")
	private Long joint3GuardianRefNo;

	@Column(name="JOINT4_APPLICANT_REF_NO")
	private Long joint4ApplicantRefNo;

	@Column(name="JOINT4_GUARDIAN_REF_NO")
	private Long joint4GuardianRefNo;

	@Column(name="MODIFIED_BY")
	private String modifiedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="MODIFIED_DATE")
	private Date modifiedDate;

	@Column(name="MOP")
	private String mop;

	@Column(name="MOP_1")
	private String mop1;

	@Column(name="MOP_2")
	private String mop2;

	@Column(name="MOP_3")
	private String mop3;

	@Column(name="MOP_4")
	private String mop4;

	@Column(name="MOP_INSTRUCTION_1")
	private String mopInstruction1;

	@Column(name="MOP_INSTRUCTION_2")
	private String mopInstruction2;

	@Column(name="MOP_INSTRUCTION_3")
	private String mopInstruction3;

	@Column(name="MOP_INSTRUCTION_4")
	private String mopInstruction4;

	@Column(name="POWER_ATTN_GOV_COUNTRY_1")
	private String powerAttnGovCountry1;

	@Column(name="POWER_ATTN_GOV_COUNTRY_2")
	private String powerAttnGovCountry2;

	@Column(name="POWER_ATTN_GOV_COUNTRY_3")
	private String powerAttnGovCountry3;

	@Column(name="POWER_ATTN_GOV_COUNTRY_4")
	private String powerAttnGovCountry4;

	@Temporal(TemporalType.DATE)
	@Column(name="POWER_ATTN_ISSUE_DATE_1")
	private Date powerAttnIssueDate1;

	@Temporal(TemporalType.DATE)
	@Column(name="POWER_ATTN_ISSUE_DATE_2")
	private Date powerAttnIssueDate2;

	@Temporal(TemporalType.DATE)
	@Column(name="POWER_ATTN_ISSUE_DATE_3")
	private Date powerAttnIssueDate3;

	@Temporal(TemporalType.DATE)
	@Column(name="POWER_ATTN_ISSUE_DATE_4")
	private Date powerAttnIssueDate4;

	@Column(name="POWER_ATTN_US_1")
	private boolean powerAttnUs1;

	@Column(name="POWER_ATTN_US_2")
	private boolean powerAttnUs2;

	@Column(name="POWER_ATTN_US_3")
	private boolean powerAttnUs3;

	@Column(name="POWER_ATTN_US_4")
	private boolean powerAttnUs4;

	@Column(name="RECORD_ID")
	private Long recordId;

	@Column(name="RELATIONSHIP_MINOR_1")
	private String relationshipMinor1;

	@Column(name="RELATIONSHIP_MINOR_2")
	private String relationshipMinor2;

	@Column(name="RELATIONSHIP_MINOR_3")
	private String relationshipMinor3;

	@Column(name="RELATIONSHIP_MINOR_4")
	private String relationshipMinor4;

	public MobAccountDetail() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAccountCategory() {
		return this.accountCategory;
	}

	public void setAccountCategory(String accountCategory) {
		this.accountCategory = accountCategory;
	}

	public String getAccountType() {
		return this.accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
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

	public Long getIndvApplicantRefNo() {
		return this.indvApplicantRefNo;
	}

	public void setIndvApplicantRefNo(Long indvApplicantRefNo) {
		this.indvApplicantRefNo = indvApplicantRefNo;
	}

	public Long getIndvGuardianRefNo() {
		return this.indvGuardianRefNo;
	}

	public void setIndvGuardianRefNo(Long indvGuardianRefNo) {
		this.indvGuardianRefNo = indvGuardianRefNo;
	}

	public Long getJoint1ApplicantRefNo() {
		return this.joint1ApplicantRefNo;
	}

	public void setJoint1ApplicantRefNo(Long joint1ApplicantRefNo) {
		this.joint1ApplicantRefNo = joint1ApplicantRefNo;
	}

	public Long getJoint1GuardianRefNo() {
		return this.joint1GuardianRefNo;
	}

	public void setJoint1GuardianRefNo(Long joint1GuardianRefNo) {
		this.joint1GuardianRefNo = joint1GuardianRefNo;
	}

	public Long getJoint2ApplicantRefNo() {
		return this.joint2ApplicantRefNo;
	}

	public void setJoint2ApplicantRefNo(Long joint2ApplicantRefNo) {
		this.joint2ApplicantRefNo = joint2ApplicantRefNo;
	}

	public Long getJoint2GuardianRefNo() {
		return this.joint2GuardianRefNo;
	}

	public void setJoint2GuardianRefNo(Long joint2GuardianRefNo) {
		this.joint2GuardianRefNo = joint2GuardianRefNo;
	}

	public Long getJoint3ApplicantRefNo() {
		return this.joint3ApplicantRefNo;
	}

	public void setJoint3ApplicantRefNo(Long joint3ApplicantRefNo) {
		this.joint3ApplicantRefNo = joint3ApplicantRefNo;
	}

	public Long getJoint3GuardianRefNo() {
		return this.joint3GuardianRefNo;
	}

	public void setJoint3GuardianRefNo(Long joint3GuardianRefNo) {
		this.joint3GuardianRefNo = joint3GuardianRefNo;
	}

	public Long getJoint4ApplicantRefNo() {
		return this.joint4ApplicantRefNo;
	}

	public void setJoint4ApplicantRefNo(Long joint4ApplicantRefNo) {
		this.joint4ApplicantRefNo = joint4ApplicantRefNo;
	}

	public Long getJoint4GuardianRefNo() {
		return this.joint4GuardianRefNo;
	}

	public void setJoint4GuardianRefNo(Long joint4GuardianRefNo) {
		this.joint4GuardianRefNo = joint4GuardianRefNo;
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

	public String getMop() {
		return this.mop;
	}

	public void setMop(String mop) {
		this.mop = mop;
	}

	public String getMop1() {
		return this.mop1;
	}

	public void setMop1(String mop1) {
		this.mop1 = mop1;
	}

	public String getMop2() {
		return this.mop2;
	}

	public void setMop2(String mop2) {
		this.mop2 = mop2;
	}

	public String getMop3() {
		return this.mop3;
	}

	public void setMop3(String mop3) {
		this.mop3 = mop3;
	}

	public String getMop4() {
		return this.mop4;
	}

	public void setMop4(String mop4) {
		this.mop4 = mop4;
	}

	public String getMopInstruction1() {
		return this.mopInstruction1;
	}

	public void setMopInstruction1(String mopInstruction1) {
		this.mopInstruction1 = mopInstruction1;
	}

	public String getMopInstruction2() {
		return this.mopInstruction2;
	}

	public void setMopInstruction2(String mopInstruction2) {
		this.mopInstruction2 = mopInstruction2;
	}

	public String getMopInstruction3() {
		return this.mopInstruction3;
	}

	public void setMopInstruction3(String mopInstruction3) {
		this.mopInstruction3 = mopInstruction3;
	}

	public String getMopInstruction4() {
		return this.mopInstruction4;
	}

	public void setMopInstruction4(String mopInstruction4) {
		this.mopInstruction4 = mopInstruction4;
	}

	public String getPowerAttnGovCountry1() {
		return this.powerAttnGovCountry1;
	}

	public void setPowerAttnGovCountry1(String powerAttnGovCountry1) {
		this.powerAttnGovCountry1 = powerAttnGovCountry1;
	}

	public String getPowerAttnGovCountry2() {
		return this.powerAttnGovCountry2;
	}

	public void setPowerAttnGovCountry2(String powerAttnGovCountry2) {
		this.powerAttnGovCountry2 = powerAttnGovCountry2;
	}

	public String getPowerAttnGovCountry3() {
		return this.powerAttnGovCountry3;
	}

	public void setPowerAttnGovCountry3(String powerAttnGovCountry3) {
		this.powerAttnGovCountry3 = powerAttnGovCountry3;
	}

	public String getPowerAttnGovCountry4() {
		return this.powerAttnGovCountry4;
	}

	public void setPowerAttnGovCountry4(String powerAttnGovCountry4) {
		this.powerAttnGovCountry4 = powerAttnGovCountry4;
	}

	public Date getPowerAttnIssueDate1() {
		return this.powerAttnIssueDate1;
	}

	public void setPowerAttnIssueDate1(Date powerAttnIssueDate1) {
		this.powerAttnIssueDate1 = powerAttnIssueDate1;
	}

	public Date getPowerAttnIssueDate2() {
		return this.powerAttnIssueDate2;
	}

	public void setPowerAttnIssueDate2(Date powerAttnIssueDate2) {
		this.powerAttnIssueDate2 = powerAttnIssueDate2;
	}

	public Date getPowerAttnIssueDate3() {
		return this.powerAttnIssueDate3;
	}

	public void setPowerAttnIssueDate3(Date powerAttnIssueDate3) {
		this.powerAttnIssueDate3 = powerAttnIssueDate3;
	}

	public Date getPowerAttnIssueDate4() {
		return this.powerAttnIssueDate4;
	}

	public void setPowerAttnIssueDate4(Date powerAttnIssueDate4) {
		this.powerAttnIssueDate4 = powerAttnIssueDate4;
	}

	public boolean getPowerAttnUs1() {
		return this.powerAttnUs1;
	}

	public void setPowerAttnUs1(boolean powerAttnUs1) {
		this.powerAttnUs1 = powerAttnUs1;
	}

	public boolean getPowerAttnUs2() {
		return this.powerAttnUs2;
	}

	public void setPowerAttnUs2(boolean powerAttnUs2) {
		this.powerAttnUs2 = powerAttnUs2;
	}

	public boolean getPowerAttnUs3() {
		return this.powerAttnUs3;
	}

	public void setPowerAttnUs3(boolean powerAttnUs3) {
		this.powerAttnUs3 = powerAttnUs3;
	}

	public boolean getPowerAttnUs4() {
		return this.powerAttnUs4;
	}

	public void setPowerAttnUs4(boolean powerAttnUs4) {
		this.powerAttnUs4 = powerAttnUs4;
	}

	public Long getRecordId() {
		return this.recordId;
	}

	public void setRecordId(Long recordId) {
		this.recordId = recordId;
	}

	public String getRelationshipMinor1() {
		return this.relationshipMinor1;
	}

	public void setRelationshipMinor1(String relationshipMinor1) {
		this.relationshipMinor1 = relationshipMinor1;
	}

	public String getRelationshipMinor2() {
		return this.relationshipMinor2;
	}

	public void setRelationshipMinor2(String relationshipMinor2) {
		this.relationshipMinor2 = relationshipMinor2;
	}

	public String getRelationshipMinor3() {
		return this.relationshipMinor3;
	}

	public void setRelationshipMinor3(String relationshipMinor3) {
		this.relationshipMinor3 = relationshipMinor3;
	}

	public String getRelationshipMinor4() {
		return this.relationshipMinor4;
	}

	public void setRelationshipMinor4(String relationshipMinor4) {
		this.relationshipMinor4 = relationshipMinor4;
	}



	@Override
	public String toString() {
		return "MobAccountDetail [id=" + id + ", accountCategory=" + accountCategory + ", accountType=" + accountType
				+ ", createdBy=" + createdBy + ", createdDate=" + createdDate + ", indvApplicantRefNo="
				+ indvApplicantRefNo + ", indvGuardianRefNo=" + indvGuardianRefNo + ", joint1ApplicantRefNo="
				+ joint1ApplicantRefNo + ", joint1GuardianRefNo=" + joint1GuardianRefNo + ", joint2ApplicantRefNo="
				+ joint2ApplicantRefNo + ", joint2GuardianRefNo=" + joint2GuardianRefNo + ", joint3ApplicantRefNo="
				+ joint3ApplicantRefNo + ", joint3GuardianRefNo=" + joint3GuardianRefNo + ", joint4ApplicantRefNo="
				+ joint4ApplicantRefNo + ", joint4GuardianRefNo=" + joint4GuardianRefNo + ", modifiedBy=" + modifiedBy
				+ ", modifiedDate=" + modifiedDate + ", mop=" + mop + ", mop1=" + mop1 + ", mop2=" + mop2 + ", mop3="
				+ mop3 + ", mop4=" + mop4 + ", mopInstruction1=" + mopInstruction1 + ", mopInstruction2="
				+ mopInstruction2 + ", mopInstruction3=" + mopInstruction3 + ", mopInstruction4=" + mopInstruction4
				+ ", powerAttnGovCountry1=" + powerAttnGovCountry1 + ", powerAttnGovCountry2=" + powerAttnGovCountry2
				+ ", powerAttnGovCountry3=" + powerAttnGovCountry3 + ", powerAttnGovCountry4=" + powerAttnGovCountry4
				+ ", powerAttnIssueDate1=" + powerAttnIssueDate1 + ", powerAttnIssueDate2=" + powerAttnIssueDate2
				+ ", powerAttnIssueDate3=" + powerAttnIssueDate3 + ", powerAttnIssueDate4=" + powerAttnIssueDate4
				+ ", powerAttnUs1=" + powerAttnUs1 + ", powerAttnUs2=" + powerAttnUs2 + ", powerAttnUs3=" + powerAttnUs3
				+ ", powerAttnUs4=" + powerAttnUs4 + ", recordId=" + recordId + ", relationshipMinor1="
				+ relationshipMinor1 + ", relationshipMinor2=" + relationshipMinor2 + ", relationshipMinor3="
				+ relationshipMinor3 + ", relationshipMinor4=" + relationshipMinor4 + "]";
	}
	

}