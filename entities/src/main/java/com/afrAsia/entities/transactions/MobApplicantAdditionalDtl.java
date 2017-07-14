package com.afrAsia.entities.transactions;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the MOB_APPLICANT_ADDITIONAL_DTLS database table.
 * 
 */
@Entity
@Table(name="MOB_APPLICANT_ADDITIONAL_DTLS")
@NamedQuery(name="MobApplicantAdditionalDtl.findAll", query="SELECT m FROM MobApplicantAdditionalDtl m")
public class MobApplicantAdditionalDtl implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	MainTableCompositePK id;

	@Column(name="COUNTRY_1")
	private String country1;

	@Column(name="COUNTRY_2")
	private String country2;

	@Column(name="COUNTRY_3")
	private String country3;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_DATE")
	private Date createdDate;

	@Column(name="INCOME_OTHER_COUNTRY_TAX")
	private String incomeOtherCountryTax;

	@Column(name="INCOME_US_TAXABLE")
	private String incomeUsTaxable;

	@Column(name="MODIFIED_BY")
	private String modifiedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="MODIFIED_DATE")
	private Date modifiedDate;

	@Column(name="OSEAS_ADDR_1")
	private String oseasAddr1;

	@Column(name="OSEAS_ADDR_2")
	private String oseasAddr2;

	@Column(name="OSEAS_ADDR_3")
	private String oseasAddr3;

	@Column(name="OSEAS_CITY")
	private String oseasCity;

	@Column(name="OSEAS_COUNTRY")
	private String oseasCountry;

	@Column(name="RECORD_ID")
	private java.math.BigDecimal recordId;

	@Column(name="TIN_1")
	private String tin1;

	@Column(name="TIN_2")
	private String tin2;

	@Column(name="TIN_3")
	private String tin3;

	@Column(name="US_CITIZEN")
	private String usCitizen;

	@Column(name="US_SSN")
	private String usSsn;

	@Temporal(TemporalType.DATE)
	@Column(name="WORK_PERMIT_EXP_DATE")
	private Date workPermitExpDate;

	public MobApplicantAdditionalDtl() {
	}

	public MainTableCompositePK getId() {
		return this.id;
	}

	public void setId(MainTableCompositePK id) {
		this.id = id;
	}

	public String getCountry1() {
		return this.country1;
	}

	public void setCountry1(String country1) {
		this.country1 = country1;
	}

	public String getCountry2() {
		return this.country2;
	}

	public void setCountry2(String country2) {
		this.country2 = country2;
	}

	public String getCountry3() {
		return this.country3;
	}

	public void setCountry3(String country3) {
		this.country3 = country3;
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

	public String getIncomeOtherCountryTax() {
		return this.incomeOtherCountryTax;
	}

	public void setIncomeOtherCountryTax(String incomeOtherCountryTax) {
		this.incomeOtherCountryTax = incomeOtherCountryTax;
	}

	public String getIncomeUsTaxable() {
		return this.incomeUsTaxable;
	}

	public void setIncomeUsTaxable(String incomeUsTaxable) {
		this.incomeUsTaxable = incomeUsTaxable;
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

	public String getOseasAddr1() {
		return this.oseasAddr1;
	}

	public void setOseasAddr1(String oseasAddr1) {
		this.oseasAddr1 = oseasAddr1;
	}

	public String getOseasAddr2() {
		return this.oseasAddr2;
	}

	public void setOseasAddr2(String oseasAddr2) {
		this.oseasAddr2 = oseasAddr2;
	}

	public String getOseasAddr3() {
		return this.oseasAddr3;
	}

	public void setOseasAddr3(String oseasAddr3) {
		this.oseasAddr3 = oseasAddr3;
	}

	public String getOseasCity() {
		return this.oseasCity;
	}

	public void setOseasCity(String oseasCity) {
		this.oseasCity = oseasCity;
	}

	public String getOseasCountry() {
		return this.oseasCountry;
	}

	public void setOseasCountry(String oseasCountry) {
		this.oseasCountry = oseasCountry;
	}

	public java.math.BigDecimal getRecordId() {
		return this.recordId;
	}

	public void setRecordId(java.math.BigDecimal recordId) {
		this.recordId = recordId;
	}

	public String getTin1() {
		return this.tin1;
	}

	public void setTin1(String tin1) {
		this.tin1 = tin1;
	}

	public String getTin2() {
		return this.tin2;
	}

	public void setTin2(String tin2) {
		this.tin2 = tin2;
	}

	public String getTin3() {
		return this.tin3;
	}

	public void setTin3(String tin3) {
		this.tin3 = tin3;
	}

	public String getUsCitizen() {
		return this.usCitizen;
	}

	public void setUsCitizen(String usCitizen) {
		this.usCitizen = usCitizen;
	}

	public String getUsSsn() {
		return this.usSsn;
	}

	public void setUsSsn(String usSsn) {
		this.usSsn = usSsn;
	}

	public Date getWorkPermitExpDate() {
		return this.workPermitExpDate;
	}

	public void setWorkPermitExpDate(Date workPermitExpDate) {
		this.workPermitExpDate = workPermitExpDate;
	}

	@Override
	public String toString() {
		return "MobApplicantAdditionalDtl [id=" + id + ", country1=" + country1 + ", country2=" + country2
				+ ", country3=" + country3 + ", createdBy=" + createdBy + ", createdDate=" + createdDate
				+ ", incomeOtherCountryTax=" + incomeOtherCountryTax + ", incomeUsTaxable=" + incomeUsTaxable
				+ ", modifiedBy=" + modifiedBy + ", modifiedDate=" + modifiedDate + ", oseasAddr1=" + oseasAddr1
				+ ", oseasAddr2=" + oseasAddr2 + ", oseasAddr3=" + oseasAddr3 + ", oseasCity=" + oseasCity
				+ ", oseasCountry=" + oseasCountry + ", recordId=" + recordId + ", tin1=" + tin1 + ", tin2=" + tin2
				+ ", tin3=" + tin3 + ", usCitizen=" + usCitizen + ", usSsn=" + usSsn + ", workPermitExpDate="
				+ workPermitExpDate + "]";
	}
	
}