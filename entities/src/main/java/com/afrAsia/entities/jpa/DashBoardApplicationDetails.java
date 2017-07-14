package com.afrAsia.entities.jpa;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Table;

import com.afrAsia.entities.base.BaseEntity;
import com.afrAsia.entities.listener.EntityListener;

@Entity
@Table(name = "MOB_ACCOUNT_DETAILS")
@EntityListeners(value = { EntityListener.class })
public class DashBoardApplicationDetails extends BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "RECORD_ID")
	private int recordId;

	@Column(name = "ACCOUNT_TYPE")
	private String accountType;

	@Column(name = "ACCOUNT_CATEGORY")
	private String accountCategory;

	@Column(name = "MOP")
	private String mop;

	@Column(name = "INDV_APPLICANT_REF_NO")
	private int indvApplicantRefNo;

	@Column(name = "INDV_GUARDIAN_REF_NO")
	private int indvGuardianRefNo;

	@Column(name = "JOINT1_APPLICANT_REF_NO")
	private int joint1ApplicantRefNo;

	@Column(name = "JOINT1_GUARDIAN_REF_NO")
	private int joint1GuandianRefNo;

	@Column(name = "JOINT2_APPLICANT_REF_NO")
	private int joint2ApplicantRefNo;

	@Column(name = "JOINT2_GUARDIAN_REF_NO")
	private int joint2GuandianRefNo;

	@Column(name = "JOINT3_APPLICANT_REF_NO")
	private int joint3ApplicantRefNo;

	@Column(name = "JOINT3_GUARDIAN_REF_NO")
	private int joint3GuandianRefNo;

	@Column(name = "JOINT4_APPLICANT_REF_NO")
	private int joint4ApplicantRefNo;

	@Column(name = "JOINT4_GUARDIAN_REF_NO")
	private int joint4GuandianRefNo;

	@Column(name = "RELATIONSHIP_MINOR_1")
	private String relationshipMinor1;

	@Column(name = "POWER_ATTN_US_1")
	private char powerAttnUS1;

	@Column(name = "POWER_ATTN_GOV_COUNTRY_1")
	private String powerAttnGovCountry1;

	@Column(name = "POWER_ATTN_ISSUE_DATE_1")
	private Date powerAttnIssueDate1;

	@Column(name = "MOP_1")
	private String mop1;

	@Column(name = "MOP_INSTRUCTION_1")
	private String mopInstruction1;

	@Column(name = "RELATIONSHIP_MINOR_2")
	private String relationshipMinor2;

	@Column(name = "POWER_ATTN_US_2")
	private char powerAttnUs2;

	@Column(name = "POWER_ATTN_GOV_COUNTRY_2")
	private String powerAttnIssueGovCountry2;

	@Column(name = "POWER_ATTN_ISSUE_DATE_2")
	private Date powerAttnIssueDate2;

	@Column(name = "MOP_2")
	private String mop2;

	@Column(name = "MOP_INSTRUCTION_2")
	private String mopInstruction2;

	@Column(name = "RELATIONSHIP_MINOR_3")
	private String relationshipMinor3;

	@Column(name = "POWER_ATTN_US_3")
	private char powerAttnUS3;

	@Column(name = "POWER_ATTN_GOV_COUNTRY_3")
	private String powerAttnGovCountry3;

	@Column(name = "POWER_ATTN_ISSUE_DATE_3")
	private Date powerAttnIssueDate3;

	@Column(name = "MOP_3")
	private String mop3;

	@Column(name = "MOP_INSTRUCTION_3")
	private String mopInstruction3;

	@Column(name = "RELATIONSHIP_MINOR_4")
	private String relationshipMinor4;

	@Column(name = "POWER_ATTN_US_4")
	private char powerAttnUS4;

	@Column(name = "POWER_ATTN_GOV_COUNTRY_4")
	private String powerAttnGovCountry4;

	@Column(name = "POWER_ATTN_ISSUE_DATE_4")
	private Date powerAttnIssueDate4;

	@Column(name = "MOP_4")
	private String mop4;

	@Column(name = "MOP_INSTRUCTION_4")
	private String mopInstruction4;

	public int getRecordId() {
		return recordId;
	}

	public void setRecordId(int recordId) {
		this.recordId = recordId;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getAccountCategory() {
		return accountCategory;
	}

	public void setAccountCategory(String accountCategory) {
		this.accountCategory = accountCategory;
	}

	public String getMop() {
		return mop;
	}

	public void setMop(String mop) {
		this.mop = mop;
	}

	public int getIndvApplicantRefNo() {
		return indvApplicantRefNo;
	}

	public void setIndvApplicantRefNo(int indvApplicantRefNo) {
		this.indvApplicantRefNo = indvApplicantRefNo;
	}

	public int getIndvGuardianRefNo() {
		return indvGuardianRefNo;
	}

	public void setIndvGuardianRefNo(int indvGuardianRefNo) {
		this.indvGuardianRefNo = indvGuardianRefNo;
	}

	public int getJoint1ApplicantRefNo() {
		return joint1ApplicantRefNo;
	}

	public void setJoint1ApplicantRefNo(int joint1ApplicantRefNo) {
		this.joint1ApplicantRefNo = joint1ApplicantRefNo;
	}

	public int getJoint1GuandianRefNo() {
		return joint1GuandianRefNo;
	}

	public void setJoint1GuandianRefNo(int joint1GuandianRefNo) {
		this.joint1GuandianRefNo = joint1GuandianRefNo;
	}

	public int getJoint2ApplicantRefNo() {
		return joint2ApplicantRefNo;
	}

	public void setJoint2ApplicantRefNo(int joint2ApplicantRefNo) {
		this.joint2ApplicantRefNo = joint2ApplicantRefNo;
	}

	public int getJoint2GuandianRefNo() {
		return joint2GuandianRefNo;
	}

	public void setJoint2GuandianRefNo(int joint2GuandianRefNo) {
		this.joint2GuandianRefNo = joint2GuandianRefNo;
	}

	public int getJoint3ApplicantRefNo() {
		return joint3ApplicantRefNo;
	}

	public void setJoint3ApplicantRefNo(int joint3ApplicantRefNo) {
		this.joint3ApplicantRefNo = joint3ApplicantRefNo;
	}

	public int getJoint3GuandianRefNo() {
		return joint3GuandianRefNo;
	}

	public void setJoint3GuandianRefNo(int joint3GuandianRefNo) {
		this.joint3GuandianRefNo = joint3GuandianRefNo;
	}

	public int getJoint4ApplicantRefNo() {
		return joint4ApplicantRefNo;
	}

	public void setJoint4ApplicantRefNo(int joint4ApplicantRefNo) {
		this.joint4ApplicantRefNo = joint4ApplicantRefNo;
	}

	public int getJoint4GuandianRefNo() {
		return joint4GuandianRefNo;
	}

	public void setJoint4GuandianRefNo(int joint4GuandianRefNo) {
		this.joint4GuandianRefNo = joint4GuandianRefNo;
	}

	public String getRelationshipMinor1() {
		return relationshipMinor1;
	}

	public void setRelationshipMinor1(String relationshipMinor1) {
		this.relationshipMinor1 = relationshipMinor1;
	}

	public char getPowerAttnUS1() {
		return powerAttnUS1;
	}

	public void setPowerAttnUS1(char powerAttnUS1) {
		this.powerAttnUS1 = powerAttnUS1;
	}

	public String getPowerAttnGovCountry1() {
		return powerAttnGovCountry1;
	}

	public void setPowerAttnGovCountry1(String powerAttnGovCountry1) {
		this.powerAttnGovCountry1 = powerAttnGovCountry1;
	}

	public Date getPowerAttnIssueDate1() {
		return powerAttnIssueDate1;
	}

	public void setPowerAttnIssueDate1(Date powerAttnIssueDate1) {
		this.powerAttnIssueDate1 = powerAttnIssueDate1;
	}

	public String getMop1() {
		return mop1;
	}

	public void setMop1(String mop1) {
		this.mop1 = mop1;
	}

	public String getMopInstruction1() {
		return mopInstruction1;
	}

	public void setMopInstruction1(String mopInstruction1) {
		this.mopInstruction1 = mopInstruction1;
	}

	public String getRelationshipMinor2() {
		return relationshipMinor2;
	}

	public void setRelationshipMinor2(String relationshipMinor2) {
		this.relationshipMinor2 = relationshipMinor2;
	}

	public char getPowerAttnUs2() {
		return powerAttnUs2;
	}

	public void setPowerAttnUs2(char powerAttnUs2) {
		this.powerAttnUs2 = powerAttnUs2;
	}

	public String getPowerAttnIssueGovCountry2() {
		return powerAttnIssueGovCountry2;
	}

	public void setPowerAttnIssueGovCountry2(String powerAttnIssueGovCountry2) {
		this.powerAttnIssueGovCountry2 = powerAttnIssueGovCountry2;
	}

	public Date getPowerAttnIssueDate2() {
		return powerAttnIssueDate2;
	}

	public void setPowerAttnIssueDate2(Date powerAttnIssueDate2) {
		this.powerAttnIssueDate2 = powerAttnIssueDate2;
	}

	public String getMop2() {
		return mop2;
	}

	public void setMop2(String mop2) {
		this.mop2 = mop2;
	}

	public String getMopInstruction2() {
		return mopInstruction2;
	}

	public void setMopInstruction2(String mopInstruction2) {
		this.mopInstruction2 = mopInstruction2;
	}

	public String getRelationshipMinor3() {
		return relationshipMinor3;
	}

	public void setRelationshipMinor3(String relationshipMinor3) {
		this.relationshipMinor3 = relationshipMinor3;
	}

	public char getPowerAttnUS3() {
		return powerAttnUS3;
	}

	public void setPowerAttnUS3(char powerAttnUS3) {
		this.powerAttnUS3 = powerAttnUS3;
	}

	public String getPowerAttnGovCountry3() {
		return powerAttnGovCountry3;
	}

	public void setPowerAttnGovCountry3(String powerAttnGovCountry3) {
		this.powerAttnGovCountry3 = powerAttnGovCountry3;
	}

	public Date getPowerAttnIssueDate3() {
		return powerAttnIssueDate3;
	}

	public void setPowerAttnIssueDate3(Date powerAttnIssueDate3) {
		this.powerAttnIssueDate3 = powerAttnIssueDate3;
	}

	public String getMop3() {
		return mop3;
	}

	public void setMop3(String mop3) {
		this.mop3 = mop3;
	}

	public String getMopInstruction3() {
		return mopInstruction3;
	}

	public void setMopInstruction3(String mopInstruction3) {
		this.mopInstruction3 = mopInstruction3;
	}

	public String getRelationshipMinor4() {
		return relationshipMinor4;
	}

	public void setRelationshipMinor4(String relationshipMinor4) {
		this.relationshipMinor4 = relationshipMinor4;
	}

	public char getPowerAttnUS4() {
		return powerAttnUS4;
	}

	public void setPowerAttnUS4(char powerAttnUS4) {
		this.powerAttnUS4 = powerAttnUS4;
	}

	public String getPowerAttnGovCountry4() {
		return powerAttnGovCountry4;
	}

	public void setPowerAttnGovCountry4(String powerAttnGovCountry4) {
		this.powerAttnGovCountry4 = powerAttnGovCountry4;
	}

	public Date getPowerAttnIssueDate4() {
		return powerAttnIssueDate4;
	}

	public void setPowerAttnIssueDate4(Date powerAttnIssueDate4) {
		this.powerAttnIssueDate4 = powerAttnIssueDate4;
	}

	public String getMop4() {
		return mop4;
	}

	public void setMop4(String mop4) {
		this.mop4 = mop4;
	}

	public String getMopInstruction4() {
		return mopInstruction4;
	}

	public void setMopInstruction4(String mopInstruction4) {
		this.mopInstruction4 = mopInstruction4;
	}

	@Override
	public String toString() {
		return "DashBoardApplicationDetails [recordId=" + recordId + ", accountType=" + accountType
				+ ", accountCategory=" + accountCategory + ", mop=" + mop + ", indvApplicantRefNo=" + indvApplicantRefNo
				+ ", indvGuardianRefNo=" + indvGuardianRefNo + ", joint1ApplicantRefNo=" + joint1ApplicantRefNo
				+ ", joint1GuandianRefNo=" + joint1GuandianRefNo + ", joint2ApplicantRefNo=" + joint2ApplicantRefNo
				+ ", joint2GuandianRefNo=" + joint2GuandianRefNo + ", joint3ApplicantRefNo=" + joint3ApplicantRefNo
				+ ", joint3GuandianRefNo=" + joint3GuandianRefNo + ", joint4ApplicantRefNo=" + joint4ApplicantRefNo
				+ ", joint4GuandianRefNo=" + joint4GuandianRefNo + ", relationshipMinor1=" + relationshipMinor1
				+ ", powerAttnUS1=" + powerAttnUS1 + ", powerAttnGovCountry1=" + powerAttnGovCountry1
				+ ", powerAttnIssueDate1=" + powerAttnIssueDate1 + ", mop1=" + mop1 + ", mopInstruction1="
				+ mopInstruction1 + ", relationshipMinor2=" + relationshipMinor2 + ", powerAttnUs2=" + powerAttnUs2
				+ ", powerAttnIssueGovCountry2=" + powerAttnIssueGovCountry2 + ", powerAttnIssueDate2="
				+ powerAttnIssueDate2 + ", mop2=" + mop2 + ", mopInstruction2=" + mopInstruction2
				+ ", relationshipMinor3=" + relationshipMinor3 + ", powerAttnUS3=" + powerAttnUS3
				+ ", powerAttnGovCountry3=" + powerAttnGovCountry3 + ", powerAttnIssueDate3=" + powerAttnIssueDate3
				+ ", mop3=" + mop3 + ", mopInstruction3=" + mopInstruction3 + ", relationshipMinor4="
				+ relationshipMinor4 + ", powerAttnUS4=" + powerAttnUS4 + ", powerAttnGovCountry4="
				+ powerAttnGovCountry4 + ", powerAttnIssueDate4=" + powerAttnIssueDate4 + ", mop4=" + mop4
				+ ", mopInstruction4=" + mopInstruction4 + "]";
	}

}
