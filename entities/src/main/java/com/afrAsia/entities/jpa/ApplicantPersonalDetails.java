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
@Table(name = "MOB_APPLICANT_PERSONAL_DETAILS")
@EntityListeners(value = { EntityListener.class })
public class ApplicantPersonalDetails extends BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "RECORD_ID")
	private int recordId;

	@Column(name = "APPLICANT_ID")
	private Long applicantId;

	@Column(name = "RESIDENCY_STATUS")
	private String recidencyStatus;

	@Column(name = "OTHER_BANK1")
	private String otherBank1;

	@Column(name = "OTHER_BANK2")
	private String otherBank2;

	@Column(name = "OTHER_BANK3")
	private String otherBank3;

	@Column(name = "IS_EMPLOYEE")
	private char isEmployee;

	@Column(name = "TITLE")
	private String title;

	@Column(name = "FIRST_NAME")
	private String firstName;

	@Column(name = "LAST_NAME")
	private String lastName;

	@Column(name = "MAIDEN_NAME")
	private String maidenName;

	@Column(name = "MIDDLE_NAME")
	private String middleName;

	@Column(name = "NIC")
	private String nic;

	@Column(name = "PASSPORT_NO")
	private String passportNo;

	@Column(name = "PASSPORT_EXPIRY_DATE")
	private Date passportExpiryDate;

	@Column(name = "NATIONALITY")
	private String nationality;

	@Column(name = "EMAIL")
	private String email;

	@Column(name = "DOB")
	private Date dob;

	@Column(name = "COUNTRY_BIRTH")
	private String countryBirth;

	@Column(name = "EXISTING_CUSTOMER")
	private char existingCustomer;

	@Column(name = "CUST_CIF")
	private String custCif;

	@Column(name = "MARITAL_STATUS")
	private char maritalStatus;

	public int getRecordId() {
		return recordId;
	}

	public void setRecordId(int recordId) {
		this.recordId = recordId;
	}

	public Long getApplicantId() {
		return applicantId;
	}

	public void setApplicantId(Long applicantId) {
		this.applicantId = applicantId;
	}

	public String getRecidencyStatus() {
		return recidencyStatus;
	}

	public void setRecidencyStatus(String recidencyStatus) {
		this.recidencyStatus = recidencyStatus;
	}

	public String getOtherBank1() {
		return otherBank1;
	}

	public void setOtherBank1(String otherBank1) {
		this.otherBank1 = otherBank1;
	}

	public String getOtherBank2() {
		return otherBank2;
	}

	public void setOtherBank2(String otherBank2) {
		this.otherBank2 = otherBank2;
	}

	public String getOtherBank3() {
		return otherBank3;
	}

	public void setOtherBank3(String otherBank3) {
		this.otherBank3 = otherBank3;
	}

	public char getIsEmployee() {
		return isEmployee;
	}

	public void setIsEmployee(char isEmployee) {
		this.isEmployee = isEmployee;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMaidenName() {
		return maidenName;
	}

	public void setMaidenName(String maidenName) {
		this.maidenName = maidenName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getNic() {
		return nic;
	}

	public void setNic(String nic) {
		this.nic = nic;
	}

	public String getPassportNo() {
		return passportNo;
	}

	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}

	public Date getPassportExpiryDate() {
		return passportExpiryDate;
	}

	public void setPassportExpiryDate(Date passportExpiryDate) {
		this.passportExpiryDate = passportExpiryDate;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getCountryBirth() {
		return countryBirth;
	}

	public void setCountryBirth(String countryBirth) {
		this.countryBirth = countryBirth;
	}

	public char getExistingCustomer() {
		return existingCustomer;
	}

	public void setExistingCustomer(char existingCustomer) {
		this.existingCustomer = existingCustomer;
	}

	public String getCustCif() {
		return custCif;
	}

	public void setCustCif(String custCif) {
		this.custCif = custCif;
	}

	public char getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(char maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	@Override
	public String toString() {
		return "ApplicantPersonalDetails [recordId=" + recordId + ", applicantId=" + applicantId + ", recidencyStatus="
				+ recidencyStatus + ", otherBank1=" + otherBank1 + ", otherBank2=" + otherBank2 + ", otherBank3="
				+ otherBank3 + ", isEmployee=" + isEmployee + ", title=" + title + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", maidenName=" + maidenName + ", middleName=" + middleName + ", nic="
				+ nic + ", passportNo=" + passportNo + ", passportExpiryDate=" + passportExpiryDate + ", nationality="
				+ nationality + ", email=" + email + ", dob=" + dob + ", countryBirth=" + countryBirth
				+ ", existingCustomer=" + existingCustomer + ", custCif=" + custCif + ", maritalStatus=" + maritalStatus
				+ "]";
	}

}
