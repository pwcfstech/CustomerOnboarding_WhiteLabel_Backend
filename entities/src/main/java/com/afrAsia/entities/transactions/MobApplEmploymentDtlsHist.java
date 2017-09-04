package com.afrAsia.entities.transactions;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the MOB_APPL_EMPLOYMENT_DTLS_HIST database table.
 * 
 */
@Entity
@Table(name = "MOB_APPL_EMPLOYMENT_DTLS_HIST")
@NamedQuery(name = "MobApplEmploymentDtlsHist.findAll", query = "SELECT m FROM MobApplEmploymentDtlsHist m")
public class MobApplEmploymentDtlsHist implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private HistTableCompositePK id;

	@Column(name = "ANN_CASH_DEPOSIT")
	private Long annCashDeposit; 

	@Column(name = "ANN_CASH_WITHDRAWL")
	private Long annCashWithdrawl;

	@Column(name = "ANN_DEPOSIT_TURNOVR")
	private Long annDepositTurnovr;

	@Column(name = "BUSINESS_SECTOR")
	private String businessSector;

	@Column(name = "CREATED_BY")
	private String createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATED_DATE")
	private Date createdDate;

	@Column(name = "CURR_OCCUPATION")
	private String currOccupation;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DATE_STARTED")
	private Date dateStarted;

	@Column(name = "EMPLOYER_ADDR_1")
	private String employerAddr1;

	@Column(name = "EMPLOYER_ADDR_2")
	private String employerAddr2;

	@Column(name = "EMPLOYER_ADDR_3")
	private String employerAddr3;

	@Column(name = "EMPLOYER_CITY")
	private String employerCity;

	@Column(name = "EMPLOYER_COUNTRY")
	private String employerCountry;

	@Column(name = "EMPLOYER_NAME")
	private String employerName;

	@Column(name = "EMPLOYMENT_STS")
	private String employmentSts;

	@Column(name = "FUND_SOURCES")
	private String fundSources;

	@Column(name = "MODIFIED_BY")
	private String modifiedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "MODIFIED_DATE")
	private Date modifiedDate;

	@Column(name = "NET_MONTHLY_INCOME")
	private Long netMonthlyIncome;

	@Column(name = "NO_OF_YEARS_SERVICE")
	private Long noOfYearsService;

	@Column(name = "OTHER_SOURCES_INCOME")
	private String otherSourcesIncome;

	public HistTableCompositePK getId() {
		return id;
	}

	public void setId(HistTableCompositePK id) {
		this.id = id;
	}

	public Long getAnnCashDeposit() {
		return annCashDeposit;
	}

	public void setAnnCashDeposit(Long annCashDeposit) {
		this.annCashDeposit = annCashDeposit;
	}

	public Long getAnnCashWithdrawl() {
		return annCashWithdrawl;
	}

	public void setAnnCashWithdrawl(Long annCashWithdrawl) {
		this.annCashWithdrawl = annCashWithdrawl;
	}

	public Long getAnnDepositTurnovr() {
		return annDepositTurnovr;
	}

	public void setAnnDepositTurnovr(Long annDepositTurnovr) {
		this.annDepositTurnovr = annDepositTurnovr;
	}

	public String getBusinessSector() {
		return businessSector;
	}

	public void setBusinessSector(String businessSector) {
		this.businessSector = businessSector;
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

	public String getCurrOccupation() {
		return currOccupation;
	}

	public void setCurrOccupation(String currOccupation) {
		this.currOccupation = currOccupation;
	}

	public Date getDateStarted() {
		return dateStarted;
	}

	public void setDateStarted(Date dateStarted) {
		this.dateStarted = dateStarted;
	}

	public String getEmployerAddr1() {
		return employerAddr1;
	}

	public void setEmployerAddr1(String employerAddr1) {
		this.employerAddr1 = employerAddr1;
	}

	public String getEmployerAddr2() {
		return employerAddr2;
	}

	public void setEmployerAddr2(String employerAddr2) {
		this.employerAddr2 = employerAddr2;
	}

	public String getEmployerAddr3() {
		return employerAddr3;
	}

	public void setEmployerAddr3(String employerAddr3) {
		this.employerAddr3 = employerAddr3;
	}

	public String getEmployerCity() {
		return employerCity;
	}

	public void setEmployerCity(String employerCity) {
		this.employerCity = employerCity;
	}

	public String getEmployerCountry() {
		return employerCountry;
	}

	public void setEmployerCountry(String employerCountry) {
		this.employerCountry = employerCountry;
	}

	public String getEmployerName() {
		return employerName;
	}

	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}

	public String getEmploymentSts() {
		return employmentSts;
	}

	public void setEmploymentSts(String employmentSts) {
		this.employmentSts = employmentSts;
	}

	public String getFundSources() {
		return fundSources;
	}

	public void setFundSources(String fundSources) {
		this.fundSources = fundSources;
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

	public Long getNetMonthlyIncome() {
		return netMonthlyIncome;
	}

	public void setNetMonthlyIncome(Long netMonthlyIncome) {
		this.netMonthlyIncome = netMonthlyIncome;
	}

	public Long getNoOfYearsService() {
		return noOfYearsService;
	}

	public void setNoOfYearsService(Long noOfYearsService) {
		this.noOfYearsService = noOfYearsService;
	}

	public String getOtherSourcesIncome() {
		return otherSourcesIncome;
	}

	public void setOtherSourcesIncome(String otherSourcesIncome) {
		this.otherSourcesIncome = otherSourcesIncome;
	}

	@Override
	public String toString() {
		return "MobApplEmploymentDtlsHist [id=" + id + ", annCashDeposit=" + annCashDeposit + ", annCashWithdrawl="
				+ annCashWithdrawl + ", annDepositTurnovr=" + annDepositTurnovr + ", businessSector=" + businessSector
				+ ", createdBy=" + createdBy + ", createdDate=" + createdDate + ", currOccupation=" + currOccupation
				+ ", dateStarted=" + dateStarted + ", employerAddr1=" + employerAddr1 + ", employerAddr2="
				+ employerAddr2 + ", employerAddr3=" + employerAddr3 + ", employerCity=" + employerCity
				+ ", employerCountry=" + employerCountry + ", employerName=" + employerName + ", employmentSts="
				+ employmentSts + ", fundSources=" + fundSources + ", modifiedBy=" + modifiedBy + ", modifiedDate="
				+ modifiedDate + ", netMonthlyIncome=" + netMonthlyIncome + ", noOfYearsService=" + noOfYearsService
				+ ", otherSourcesIncome=" + otherSourcesIncome + "]";
	}

}