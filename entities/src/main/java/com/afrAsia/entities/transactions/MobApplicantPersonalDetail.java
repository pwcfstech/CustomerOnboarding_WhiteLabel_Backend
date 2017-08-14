package com.afrAsia.entities.transactions;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the MOB_APPLICANT_PERSONAL_DETAILS database table.
 * 
 */
@Entity
@Table(name="MOB_APPLICANT_PERSONAL_DETAILS")

public class MobApplicantPersonalDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private MainTableCompositePK id;

	@Column(name="COUNTRY_BIRTH")
	private String countryBirth;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_DATE")
	private Date createdDate;

	@Column(name="CUST_CIF")
	private String custCif;   

	@Temporal(TemporalType.DATE)
	private Date dob;
	
	@Column(name="EMAIL")
	private String email;

	@Column(name="EXISTING_CUSTOMER")
	private boolean existingCustomer;

	@Column(name="FIRST_NAME")
	private String firstName;

	@Column(name="IS_EMPLOYEE")
	private boolean isEmployee;

	@Column(name="LAST_NAME")
	private String lastName;

	@Column(name="MAIDEN_NAME")
	private String maidenName;

	@Column(name="MARITAL_STATUS")
	private String maritalStatus;

	@Column(name="MIDDLE_NAME")
	private String middleName;

	@Column(name="MODIFIED_BY")
	private String modifiedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="MODIFIED_DATE")
	private Date modifiedDate;

	@Column(name="NATIONALITY")
	private String nationality;
	
	@Column(name="nic")
	private String nic;

	@Column(name="OTHER_BANK1")
	private String otherBank1;

	@Column(name="OTHER_BANK2")
	private String otherBank2;

	@Column(name="OTHER_BANK3")
	private String otherBank3;

	@Temporal(TemporalType.DATE)
	@Column(name="PASSPORT_EXPIRY_DATE")
	private Date passportExpiryDate;

	@Column(name="PASSPORT_NO")
	private String passportNo;

	@Column(name="RECORD_ID")
	private Long recordId;

	@Column(name="RESIDENCY_STATUS")
	private String residencyStatus;
	
	@Column(name="TITLE")
	private String title;
	
	@Column(name="CUSTOMER_TYPE")
	private String customerType;
	
	@Column(name="IS_MINOR")
	private Boolean isMinor;

	public MobApplicantPersonalDetail() {
	}

	public MainTableCompositePK getId() {
		return this.id;
	}

	public void setId(MainTableCompositePK id) {
		this.id = id;
	}

	public String getCountryBirth() {
		return this.countryBirth;
	}

	public void setCountryBirth(String countryBirth) {
		this.countryBirth = countryBirth;
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

	public String getCustCif() {
		return this.custCif;
	}

	public void setCustCif(String custCif) {
		this.custCif = custCif;
	}

	public Date getDob() {
		return this.dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean getExistingCustomer() {
		return this.existingCustomer;
	}

	public void setExistingCustomer(boolean existingCustomer) {
		this.existingCustomer = existingCustomer;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public boolean getIsEmployee() {
		return this.isEmployee;
	}

	public void setIsEmployee(boolean isEmployee) {
		this.isEmployee = isEmployee;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMaidenName() {
		return this.maidenName;
	}

	public void setMaidenName(String maidenName) {
		this.maidenName = maidenName;
	}

	public String getMaritalStatus() {
		return this.maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getMiddleName() {
		return this.middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
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

	public String getNationality() {
		return this.nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getNic() {
		return this.nic;
	}

	public void setNic(String nic) {
		this.nic = nic;
	}

	public String getOtherBank1() {
		return this.otherBank1;
	}

	public void setOtherBank1(String otherBank1) {
		this.otherBank1 = otherBank1;
	}

	public String getOtherBank2() {
		return this.otherBank2;
	}

	public void setOtherBank2(String otherBank2) {
		this.otherBank2 = otherBank2;
	}

	public String getOtherBank3() {
		return this.otherBank3;
	}

	public void setOtherBank3(String otherBank3) {
		this.otherBank3 = otherBank3;
	}

	public Date getPassportExpiryDate() {
		return this.passportExpiryDate;
	}

	public void setPassportExpiryDate(Date passportExpiryDate) {
		this.passportExpiryDate = passportExpiryDate;
	}

	public String getPassportNo() {
		return this.passportNo;
	}

	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}

	public Long getRecordId() {
		return this.recordId;
	}

	public void setRecordId(Long recordId) {
		this.recordId = recordId;
	}

	public String getResidencyStatus() {
		return this.residencyStatus;
	}

	public void setResidencyStatus(String residencyStatus) {
		this.residencyStatus = residencyStatus;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setCustomerType(String customerType){
		this.customerType = customerType;
	}
	
	public String getCustomerType(){
		return customerType;
	}
	
	public Boolean getIsMinor(){
		return isMinor;
	}
	
	public void setIsMinor(boolean isMinor){
		this.isMinor = isMinor;
	}

	@Override
	public String toString() {
		return "MobApplicantPersonalDetail [id=" + id + ", countryBirth=" + countryBirth + ", createdBy=" + createdBy
				+ ", createdDate=" + createdDate + ", custCif=" + custCif + ", dob=" + dob + ", email=" + email
				+ ", existingCustomer=" + existingCustomer + ", firstName=" + firstName + ", isEmployee=" + isEmployee
				+ ", lastName=" + lastName + ", maidenName=" + maidenName + ", maritalStatus=" + maritalStatus
				+ ", middleName=" + middleName + ", modifiedBy=" + modifiedBy + ", modifiedDate=" + modifiedDate
				+ ", nationality=" + nationality + ", nic=" + nic + ", otherBank1=" + otherBank1 + ", otherBank2="
				+ otherBank2 + ", otherBank3=" + otherBank3 + ", passportExpiryDate=" + passportExpiryDate
				+ ", passportNo=" + passportNo + ", recordId=" + recordId + ", residencyStatus=" + residencyStatus
				+ ", title=" + title + ", customerType=" + customerType +  ", isMinor=" + isMinor + "]";
	}
}
