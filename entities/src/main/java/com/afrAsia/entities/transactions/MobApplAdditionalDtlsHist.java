package com.afrAsia.entities.transactions;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;

/**
 * The persistent class for the MOB_APPL_ADDITIONAL_DTLS_HIST database table.
 * 
 */
@Entity
@Table(name = "MOB_APPL_ADDITIONAL_DTLS_HIST")
@NamedQuery(name = "MobApplAdditionalDtlsHist.findAll", query = "SELECT m FROM MobApplAdditionalDtlsHist m")
public class MobApplAdditionalDtlsHist implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private HistTableCompositePK id;

	@Column(name = "COUNTRY_1")
	private String country1;

	@Column(name = "COUNTRY_2")
	private String country2; 

	@Column(name = "COUNTRY_3")
	private String country3;

	@Column(name = "CREATED_BY")
	private String createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATED_DATE")
	private Date createdDate;

	@Column(name = "INCOME_OTHER_COUNTRY_TAX")
	private Boolean incomeOtherCountryTax; // ===== changed

	@Column(name = "INCOME_US_TAXABLE")
	private Boolean incomeUsTaxable; // ===== changed

	@Column(name = "MODIFIED_BY")
	private String modifiedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "MODIFIED_DATE")
	private Date modifiedDate;

	@Column(name = "OSEAS_ADDR_1")
	private String oseasAddr1;

	@Column(name = "OSEAS_ADDR_2")
	private String oseasAddr2;

	@Column(name = "OSEAS_ADDR_3")
	private String oseasAddr3;

	@Column(name = "OSEAS_CITY")
	private String oseasCity;

	@Column(name = "OSEAS_COUNTRY")
	private String oseasCountry;

	@Column(name = "TIN_1")
	private String tin1;

	@Column(name = "TIN_2")
	private String tin2;

	@Column(name = "TIN_3")
	private String tin3;

	@Column(name = "US_CITIZEN")
	private Boolean usCitizen; // changed

	@Column(name = "US_SSN")
	private String usSsn;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "WORK_PERMIT_EXP_DATE")
	private Date workPermitExpDate;

	public HistTableCompositePK getId() {
		return id;
	}

	public void setId(HistTableCompositePK id) {
		this.id = id;
	}

	public String getCountry1() {
		return country1;
	}

	public void setCountry1(String country1) {
		this.country1 = country1;
	}

	public String getCountry2() {
		return country2;
	}

	public void setCountry2(String country2) {
		this.country2 = country2;
	}

	public String getCountry3() {
		return country3;
	}

	public void setCountry3(String country3) {
		this.country3 = country3;
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

	public Boolean getIncomeOtherCountryTax() {
		return incomeOtherCountryTax;
	}

	public void setIncomeOtherCountryTax(Boolean incomeOtherCountryTax) {
		this.incomeOtherCountryTax = incomeOtherCountryTax;
	}

	public Boolean getIncomeUsTaxable() {
		return incomeUsTaxable;
	}

	public void setIncomeUsTaxable(Boolean incomeUsTaxable) {
		this.incomeUsTaxable = incomeUsTaxable;
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

	public String getOseasAddr1() {
		return oseasAddr1;
	}

	public void setOseasAddr1(String oseasAddr1) {
		this.oseasAddr1 = oseasAddr1;
	}

	public String getOseasAddr2() {
		return oseasAddr2;
	}

	public void setOseasAddr2(String oseasAddr2) {
		this.oseasAddr2 = oseasAddr2;
	}

	public String getOseasAddr3() {
		return oseasAddr3;
	}

	public void setOseasAddr3(String oseasAddr3) {
		this.oseasAddr3 = oseasAddr3;
	}

	public String getOseasCity() {
		return oseasCity;
	}

	public void setOseasCity(String oseasCity) {
		this.oseasCity = oseasCity;
	}

	public String getOseasCountry() {
		return oseasCountry;
	}

	public void setOseasCountry(String oseasCountry) {
		this.oseasCountry = oseasCountry;
	}

	public String getTin1() {
		return tin1;
	}

	public void setTin1(String tin1) {
		this.tin1 = tin1;
	}

	public String getTin2() {
		return tin2;
	}

	public void setTin2(String tin2) {
		this.tin2 = tin2;
	}

	public String getTin3() {
		return tin3;
	}

	public void setTin3(String tin3) {
		this.tin3 = tin3;
	}

	public Boolean getUsCitizen() {
		return usCitizen;
	}

	public void setUsCitizen(Boolean usCitizen) {
		this.usCitizen = usCitizen;
	}

	public String getUsSsn() {
		return usSsn;
	}

	public void setUsSsn(String usSsn) {
		this.usSsn = usSsn;
	}

	public Date getWorkPermitExpDate() {
		return workPermitExpDate;
	}

	public void setWorkPermitExpDate(Date workPermitExpDate) {
		this.workPermitExpDate = workPermitExpDate;
	}

	@Override
	public String toString() {
		return "MobApplAdditionalDtlsHist [id=" + id + ", country1=" + country1 + ", country2=" + country2
				+ ", country3=" + country3 + ", createdBy=" + createdBy + ", createdDate=" + createdDate
				+ ", incomeOtherCountryTax=" + incomeOtherCountryTax + ", incomeUsTaxable=" + incomeUsTaxable
				+ ", modifiedBy=" + modifiedBy + ", modifiedDate=" + modifiedDate + ", oseasAddr1=" + oseasAddr1
				+ ", oseasAddr2=" + oseasAddr2 + ", oseasAddr3=" + oseasAddr3 + ", oseasCity=" + oseasCity
				+ ", oseasCountry=" + oseasCountry + ", tin1=" + tin1 + ", tin2=" + tin2 + ", tin3=" + tin3
				+ ", usCitizen=" + usCitizen + ", usSsn=" + usSsn + ", workPermitExpDate=" + workPermitExpDate + "]";
	}

}