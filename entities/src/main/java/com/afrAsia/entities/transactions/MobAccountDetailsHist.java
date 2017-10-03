package com.afrAsia.entities.transactions;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;

/**
 * The persistent class for the MOB_ACCOUNT_DETAILS_HIST database table.
 * 
 */
@Entity
@Table(name = "MOB_ACCOUNT_DETAILS_HIST")

public class MobAccountDetailsHist implements Serializable {
	private static final long serialVersionUID = 1L;

	/*
	 * @Id
	 * 
	 * @Column(name = "ID")
	 * 
	 * @SequenceGenerator(name="MOB_ACCOUNT_DETAILS_HIST_ID_RECORDID_GENERATOR",
	 * sequenceName="AA_ACCNT_DTLS_HIST_ID_SEQUENCE")
	 * 
	 * @GeneratedValue(strategy=GenerationType.SEQUENCE,
	 * generator="MOB_ACCOUNT_DETAILS_HIST_ID_RECORDID_GENERATOR") private Long
	 * id;
	 */

	@Id
	@Column(name = "RECORD_ID")
	private Long recordId;

	@Column(name = "ACCOUNT_CATEGORY")
	private String accountCategory;

	@Column(name = "ACCOUNT_TYPE")
	private String accountType;

	@Column(name = "CREATED_BY")
	private String createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATED_DATE")
	private Date createdDate;

	@Column(name = "INDV_APPLICANT_REF_NO")
	private Long indvApplicantRefNo;

	@Column(name = "INDV_GUARDIAN_REF_NO")
	private Long indvGuardianRefNo;

	@Column(name = "JOINT1_APPLICANT_REF_NO")
	private Long joint1ApplicantRefNo;

	@Column(name = "JOINT1_GUARDIAN_REF_NO")
	private Long joint1GuardianRefNo;

	@Column(name = "JOINT2_APPLICANT_REF_NO")
	private Long joint2ApplicantRefNo;

	@Column(name = "JOINT2_GUARDIAN_REF_NO")
	private Long joint2GuardianRefNo;

	@Column(name = "JOINT3_APPLICANT_REF_NO")
	private Long joint3ApplicantRefNo;

	@Column(name = "JOINT3_GUARDIAN_REF_NO")
	private Long joint3GuardianRefNo;

	@Column(name = "JOINT4_APPLICANT_REF_NO")
	private Long joint4ApplicantRefNo;

	@Column(name = "JOINT4_GUARDIAN_REF_NO")
	private Long joint4GuardianRefNo;

	@Column(name = "JOINT5_APPLICANT_REF_NO")
	private Long joint5ApplicantRefNo;

	@Column(name = "JOINT5_GUARDIAN_REF_NO")
	private Long joint5GuardianRefNo;

	@Column(name = "MODIFIED_BY")
	private String modifiedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "MODIFIED_DATE")
	private Date modifiedDate;

	@Column(name = "MOP")
	private String mop;

	@Column(name = "MOP_1")
	private String mop1;

	@Column(name = "MOP_2")
	private String mop2;

	@Column(name = "MOP_3")
	private String mop3;

	@Column(name = "MOP_4")
	private String mop4;

	@Column(name = "MOP_5")
	private String mop5;

	@Column(name = "MOP_INSTRUCTION_1")
	private String mopInstruction1;

	@Column(name = "MOP_INSTRUCTION_2")
	private String mopInstruction2;

	@Column(name = "MOP_INSTRUCTION_3")
	private String mopInstruction3;

	@Column(name = "MOP_INSTRUCTION_4")
	private String mopInstruction4;

	@Column(name = "MOP_INSTRUCTION_5")
	private String mopInstruction5;

	@Column(name = "POWER_ATTN_GOV_COUNTRY_1")
	private String powerAttnGovCountry1;

	@Column(name = "POWER_ATTN_GOV_COUNTRY_2")
	private String powerAttnGovCountry2;

	@Column(name = "POWER_ATTN_GOV_COUNTRY_3")
	private String powerAttnGovCountry3;

	@Column(name = "POWER_ATTN_GOV_COUNTRY_4")
	private String powerAttnGovCountry4;

	@Column(name = "POWER_ATTN_GOV_COUNTRY_5")
	private String powerAttnGovCountry5;

	@Temporal(TemporalType.DATE)
	@Column(name = "POWER_ATTN_ISSUE_DATE_1")
	private Date powerAttnIssueDate1;

	@Temporal(TemporalType.DATE)
	@Column(name = "POWER_ATTN_ISSUE_DATE_2")
	private Date powerAttnIssueDate2;

	@Temporal(TemporalType.DATE)
	@Column(name = "POWER_ATTN_ISSUE_DATE_3")
	private Date powerAttnIssueDate3;

	@Temporal(TemporalType.DATE)
	@Column(name = "POWER_ATTN_ISSUE_DATE_4")
	private Date powerAttnIssueDate4;

	@Temporal(TemporalType.DATE)
	@Column(name = "POWER_ATTN_ISSUE_DATE_5")
	private Date powerAttnIssueDate5;

	@Column(name = "POWER_ATTN_US_1")
	private boolean powerAttnUs1;

	@Column(name = "POWER_ATTN_US_2")
	private boolean powerAttnUs2;

	@Column(name = "POWER_ATTN_US_3")
	private boolean powerAttnUs3;

	@Column(name = "POWER_ATTN_US_4")
	private boolean powerAttnUs4;

	@Column(name = "POWER_ATTN_US_5")
	private boolean powerAttnUs5;

	@Column(name = "RELATIONSHIP_MINOR_1")
	private String relationshipMinor1;

	@Column(name = "RELATIONSHIP_MINOR_2")
	private String relationshipMinor2;

	@Column(name = "RELATIONSHIP_MINOR_3")
	private String relationshipMinor3;

	@Column(name = "RELATIONSHIP_MINOR_4")
	private String relationshipMinor4;

	@Column(name = "RELATIONSHIP_MINOR_5")
	private String relationshipMinor5;

	@Column(name = "MIN_NO_SIGNATURES")
	private Long minNoSignatures;

	@Column(name = "OPERATING_INST")
	private String operatingInst;
	
	@Column(name = "IS_PROXY_REQUIRED")
	private Boolean isProxyRequired;//Added by Avisha on 25/09 for issues

	public Long getRecordId() {
		return recordId;
	}

	public void setRecordId(Long recordId) {
		this.recordId = recordId;
	}

	public String getAccountCategory() {
		return accountCategory;
	}

	public void setAccountCategory(String accountCategory) {
		this.accountCategory = accountCategory;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
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

	public Long getIndvApplicantRefNo() {
		return indvApplicantRefNo;
	}

	public void setIndvApplicantRefNo(Long indvApplicantRefNo) {
		this.indvApplicantRefNo = indvApplicantRefNo;
	}

	public Long getIndvGuardianRefNo() {
		return indvGuardianRefNo;
	}

	public void setIndvGuardianRefNo(Long indvGuardianRefNo) {
		this.indvGuardianRefNo = indvGuardianRefNo;
	}

	public Long getJoint1ApplicantRefNo() {
		return joint1ApplicantRefNo;
	}

	public void setJoint1ApplicantRefNo(Long joint1ApplicantRefNo) {
		this.joint1ApplicantRefNo = joint1ApplicantRefNo;
	}

	public Long getJoint1GuardianRefNo() {
		return joint1GuardianRefNo;
	}

	public void setJoint1GuardianRefNo(Long joint1GuardianRefNo) {
		this.joint1GuardianRefNo = joint1GuardianRefNo;
	}

	public Long getJoint2ApplicantRefNo() {
		return joint2ApplicantRefNo;
	}

	public void setJoint2ApplicantRefNo(Long joint2ApplicantRefNo) {
		this.joint2ApplicantRefNo = joint2ApplicantRefNo;
	}

	public Long getJoint2GuardianRefNo() {
		return joint2GuardianRefNo;
	}

	public void setJoint2GuardianRefNo(Long joint2GuardianRefNo) {
		this.joint2GuardianRefNo = joint2GuardianRefNo;
	}

	public Long getJoint3ApplicantRefNo() {
		return joint3ApplicantRefNo;
	}

	public void setJoint3ApplicantRefNo(Long joint3ApplicantRefNo) {
		this.joint3ApplicantRefNo = joint3ApplicantRefNo;
	}

	public Long getJoint3GuardianRefNo() {
		return joint3GuardianRefNo;
	}

	public void setJoint3GuardianRefNo(Long joint3GuardianRefNo) {
		this.joint3GuardianRefNo = joint3GuardianRefNo;
	}

	public Long getJoint4ApplicantRefNo() {
		return joint4ApplicantRefNo;
	}

	public void setJoint4ApplicantRefNo(Long joint4ApplicantRefNo) {
		this.joint4ApplicantRefNo = joint4ApplicantRefNo;
	}

	public Long getJoint4GuardianRefNo() {
		return joint4GuardianRefNo;
	}

	public void setJoint4GuardianRefNo(Long joint4GuardianRefNo) {
		this.joint4GuardianRefNo = joint4GuardianRefNo;
	}

	public Long getJoint5ApplicantRefNo() {
		return joint5ApplicantRefNo;
	}

	public void setJoint5ApplicantRefNo(Long joint5ApplicantRefNo) {
		this.joint5ApplicantRefNo = joint5ApplicantRefNo;
	}

	public Long getJoint5GuardianRefNo() {
		return joint5GuardianRefNo;
	}

	public void setJoint5GuardianRefNo(Long joint5GuardianRefNo) {
		this.joint5GuardianRefNo = joint5GuardianRefNo;
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

	public String getMop() {
		return mop;
	}

	public void setMop(String mop) {
		this.mop = mop;
	}

	public String getMop1() {
		return mop1;
	}

	public void setMop1(String mop1) {
		this.mop1 = mop1;
	}

	public String getMop2() {
		return mop2;
	}

	public void setMop2(String mop2) {
		this.mop2 = mop2;
	}

	public String getMop3() {
		return mop3;
	}

	public void setMop3(String mop3) {
		this.mop3 = mop3;
	}

	public String getMop4() {
		return mop4;
	}

	public void setMop4(String mop4) {
		this.mop4 = mop4;
	}

	public String getMop5() {
		return mop5;
	}

	public void setMop5(String mop5) {
		this.mop5 = mop5;
	}

	public String getMopInstruction1() {
		return mopInstruction1;
	}

	public void setMopInstruction1(String mopInstruction1) {
		this.mopInstruction1 = mopInstruction1;
	}

	public String getMopInstruction2() {
		return mopInstruction2;
	}

	public void setMopInstruction2(String mopInstruction2) {
		this.mopInstruction2 = mopInstruction2;
	}

	public String getMopInstruction3() {
		return mopInstruction3;
	}

	public void setMopInstruction3(String mopInstruction3) {
		this.mopInstruction3 = mopInstruction3;
	}

	public String getMopInstruction4() {
		return mopInstruction4;
	}

	public void setMopInstruction4(String mopInstruction4) {
		this.mopInstruction4 = mopInstruction4;
	}

	public String getMopInstruction5() {
		return mopInstruction5;
	}

	public void setMopInstruction5(String mopInstruction5) {
		this.mopInstruction5 = mopInstruction5;
	}

	public String getPowerAttnGovCountry1() {
		return powerAttnGovCountry1;
	}

	public void setPowerAttnGovCountry1(String powerAttnGovCountry1) {
		this.powerAttnGovCountry1 = powerAttnGovCountry1;
	}

	public String getPowerAttnGovCountry2() {
		return powerAttnGovCountry2;
	}

	public void setPowerAttnGovCountry2(String powerAttnGovCountry2) {
		this.powerAttnGovCountry2 = powerAttnGovCountry2;
	}

	public String getPowerAttnGovCountry3() {
		return powerAttnGovCountry3;
	}

	public void setPowerAttnGovCountry3(String powerAttnGovCountry3) {
		this.powerAttnGovCountry3 = powerAttnGovCountry3;
	}

	public String getPowerAttnGovCountry4() {
		return powerAttnGovCountry4;
	}

	public void setPowerAttnGovCountry4(String powerAttnGovCountry4) {
		this.powerAttnGovCountry4 = powerAttnGovCountry4;
	}

	public String getPowerAttnGovCountry5() {
		return powerAttnGovCountry5;
	}

	public void setPowerAttnGovCountry5(String powerAttnGovCountry5) {
		this.powerAttnGovCountry5 = powerAttnGovCountry5;
	}

	public Date getPowerAttnIssueDate1() {
		return powerAttnIssueDate1;
	}

	public void setPowerAttnIssueDate1(Date powerAttnIssueDate1) {
		this.powerAttnIssueDate1 = powerAttnIssueDate1;
	}

	public Date getPowerAttnIssueDate2() {
		return powerAttnIssueDate2;
	}

	public void setPowerAttnIssueDate2(Date powerAttnIssueDate2) {
		this.powerAttnIssueDate2 = powerAttnIssueDate2;
	}

	public Date getPowerAttnIssueDate3() {
		return powerAttnIssueDate3;
	}

	public void setPowerAttnIssueDate3(Date powerAttnIssueDate3) {
		this.powerAttnIssueDate3 = powerAttnIssueDate3;
	}

	public Date getPowerAttnIssueDate4() {
		return powerAttnIssueDate4;
	}

	public void setPowerAttnIssueDate4(Date powerAttnIssueDate4) {
		this.powerAttnIssueDate4 = powerAttnIssueDate4;
	}

	public Date getPowerAttnIssueDate5() {
		return powerAttnIssueDate5;
	}

	public void setPowerAttnIssueDate5(Date powerAttnIssueDate5) {
		this.powerAttnIssueDate5 = powerAttnIssueDate5;
	}

	public boolean isPowerAttnUs1() {
		return powerAttnUs1;
	}

	public void setPowerAttnUs1(boolean powerAttnUs1) {
		this.powerAttnUs1 = powerAttnUs1;
	}

	public boolean isPowerAttnUs2() {
		return powerAttnUs2;
	}

	public void setPowerAttnUs2(boolean powerAttnUs2) {
		this.powerAttnUs2 = powerAttnUs2;
	}

	public boolean isPowerAttnUs3() {
		return powerAttnUs3;
	}

	public void setPowerAttnUs3(boolean powerAttnUs3) {
		this.powerAttnUs3 = powerAttnUs3;
	}

	public boolean isPowerAttnUs4() {
		return powerAttnUs4;
	}

	public void setPowerAttnUs4(boolean powerAttnUs4) {
		this.powerAttnUs4 = powerAttnUs4;
	}

	public boolean isPowerAttnUs5() {
		return powerAttnUs5;
	}

	public void setPowerAttnUs5(boolean powerAttnUs5) {
		this.powerAttnUs5 = powerAttnUs5;
	}

	public String getRelationshipMinor1() {
		return relationshipMinor1;
	}

	public void setRelationshipMinor1(String relationshipMinor1) {
		this.relationshipMinor1 = relationshipMinor1;
	}

	public String getRelationshipMinor2() {
		return relationshipMinor2;
	}

	public void setRelationshipMinor2(String relationshipMinor2) {
		this.relationshipMinor2 = relationshipMinor2;
	}

	public String getRelationshipMinor3() {
		return relationshipMinor3;
	}

	public void setRelationshipMinor3(String relationshipMinor3) {
		this.relationshipMinor3 = relationshipMinor3;
	}

	public String getRelationshipMinor4() {
		return relationshipMinor4;
	}

	public void setRelationshipMinor4(String relationshipMinor4) {
		this.relationshipMinor4 = relationshipMinor4;
	}

	public String getRelationshipMinor5() {
		return relationshipMinor5;
	}

	public void setRelationshipMinor5(String relationshipMinor5) {
		this.relationshipMinor5 = relationshipMinor5;
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

	public Boolean getIsProxyRequired() {
		return isProxyRequired;
	}

	public void setIsProxyRequired(Boolean isProxyRequired) {
		this.isProxyRequired = isProxyRequired;
	}

	@Override
	public String toString() {
		return "MobAccountDetailsHist [recordId=" + recordId + ", accountCategory=" + accountCategory + ", accountType="
				+ accountType + ", createdBy=" + createdBy + ", createdDate=" + createdDate + ", indvApplicantRefNo="
				+ indvApplicantRefNo + ", indvGuardianRefNo=" + indvGuardianRefNo + ", joint1ApplicantRefNo="
				+ joint1ApplicantRefNo + ", joint1GuardianRefNo=" + joint1GuardianRefNo + ", joint2ApplicantRefNo="
				+ joint2ApplicantRefNo + ", joint2GuardianRefNo=" + joint2GuardianRefNo + ", joint3ApplicantRefNo="
				+ joint3ApplicantRefNo + ", joint3GuardianRefNo=" + joint3GuardianRefNo + ", joint4ApplicantRefNo="
				+ joint4ApplicantRefNo + ", joint4GuardianRefNo=" + joint4GuardianRefNo + ", joint5ApplicantRefNo="
				+ joint5ApplicantRefNo + ", joint5GuardianRefNo=" + joint5GuardianRefNo + ", modifiedBy=" + modifiedBy
				+ ", modifiedDate=" + modifiedDate + ", mop=" + mop + ", mop1=" + mop1 + ", mop2=" + mop2 + ", mop3="
				+ mop3 + ", mop4=" + mop4 + ", mop5=" + mop5 + ", mopInstruction1=" + mopInstruction1
				+ ", mopInstruction2=" + mopInstruction2 + ", mopInstruction3=" + mopInstruction3 + ", mopInstruction4="
				+ mopInstruction4 + ", mopInstruction5=" + mopInstruction5 + ", powerAttnGovCountry1="
				+ powerAttnGovCountry1 + ", powerAttnGovCountry2=" + powerAttnGovCountry2 + ", powerAttnGovCountry3="
				+ powerAttnGovCountry3 + ", powerAttnGovCountry4=" + powerAttnGovCountry4 + ", powerAttnGovCountry5="
				+ powerAttnGovCountry5 + ", powerAttnIssueDate1=" + powerAttnIssueDate1 + ", powerAttnIssueDate2="
				+ powerAttnIssueDate2 + ", powerAttnIssueDate3=" + powerAttnIssueDate3 + ", powerAttnIssueDate4="
				+ powerAttnIssueDate4 + ", powerAttnIssueDate5=" + powerAttnIssueDate5 + ", powerAttnUs1="
				+ powerAttnUs1 + ", powerAttnUs2=" + powerAttnUs2 + ", powerAttnUs3=" + powerAttnUs3 + ", powerAttnUs4="
				+ powerAttnUs4 + ", powerAttnUs5=" + powerAttnUs5 + ", relationshipMinor1=" + relationshipMinor1
				+ ", relationshipMinor2=" + relationshipMinor2 + ", relationshipMinor3=" + relationshipMinor3
				+ ", relationshipMinor4=" + relationshipMinor4 + ", relationshipMinor5=" + relationshipMinor5
				+ ", minNoSignatures=" + minNoSignatures + ", operatingInst=" + operatingInst + ", isProxyRequired="
				+ isProxyRequired + "]";
	}

}