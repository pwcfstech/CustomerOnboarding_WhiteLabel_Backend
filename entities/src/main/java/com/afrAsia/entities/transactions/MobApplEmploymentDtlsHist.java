package com.afrAsia.entities.transactions;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the MOB_APPL_EMPLOYMENT_DTLS_HIST database table.
 * 
 */
@Entity
@Table(name="MOB_APPL_EMPLOYMENT_DTLS_HIST")
@NamedQuery(name="MobApplEmploymentDtlsHist.findAll", query="SELECT m FROM MobApplEmploymentDtlsHist m")
public class MobApplEmploymentDtlsHist implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private HistTableCompositePK id;

	@Column(name="ANN_CASH_DEPOSIT")
	private BigDecimal annCashDeposit;

	@Column(name="ANN_CASH_WITHDRAWL")
	private BigDecimal annCashWithdrawl;

	@Column(name="ANN_DEPOSIT_TURNOVR")
	private BigDecimal annDepositTurnovr;

	@Column(name="BUSINESS_SECTOR")
	private String businessSector;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_BY")
	private Date createdBy;

	@Column(name="CREATED_DATE")
	private String createdDate;

	@Column(name="CURR_OCCUPATION")
	private String currOccupation;

	@Temporal(TemporalType.DATE)
	@Column(name="DATE_STARTED")
	private Date dateStarted;

	@Column(name="EMPLOYER_ADDR_1")
	private String employerAddr1;

	@Column(name="EMPLOYER_ADDR_2")
	private String employerAddr2;

	@Column(name="EMPLOYER_ADDR_3")
	private String employerAddr3;

	@Column(name="EMPLOYER_CITY")
	private String employerCity;

	@Column(name="EMPLOYER_COUNTRY")
	private String employerCountry;

	@Column(name="EMPLOYER_NAME")
	private String employerName;

	@Column(name="EMPLOYMENT_STS")
	private String employmentSts;

	@Column(name="FUND_SOURCES")
	private String fundSources;

	@Temporal(TemporalType.DATE)
	@Column(name="MODIFIED_BY")
	private Date modifiedBy;

	@Column(name="MODIFIED_DATE")
	private String modifiedDate;

	@Column(name="NET_MONTHLY_INCOME")
	private BigDecimal netMonthlyIncome;

	@Column(name="NO_OF_YEARS_SERVICE")
	private BigDecimal noOfYearsService;

	@Column(name="OTHER_SOURCES_INCOME")
	private String otherSourcesIncome;

	public MobApplEmploymentDtlsHist() {
	}

	public HistTableCompositePK getId() {
		return this.id;
	}

	public void setId(HistTableCompositePK id) {
		this.id = id;
	}

	public BigDecimal getAnnCashDeposit() {
		return this.annCashDeposit;
	}

	public void setAnnCashDeposit(BigDecimal annCashDeposit) {
		this.annCashDeposit = annCashDeposit;
	}

	public BigDecimal getAnnCashWithdrawl() {
		return this.annCashWithdrawl;
	}

	public void setAnnCashWithdrawl(BigDecimal annCashWithdrawl) {
		this.annCashWithdrawl = annCashWithdrawl;
	}

	public BigDecimal getAnnDepositTurnovr() {
		return this.annDepositTurnovr;
	}

	public void setAnnDepositTurnovr(BigDecimal annDepositTurnovr) {
		this.annDepositTurnovr = annDepositTurnovr;
	}

	public String getBusinessSector() {
		return this.businessSector;
	}

	public void setBusinessSector(String businessSector) {
		this.businessSector = businessSector;
	}

	public Date getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(Date createdBy) {
		this.createdBy = createdBy;
	}

	public String getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public String getCurrOccupation() {
		return this.currOccupation;
	}

	public void setCurrOccupation(String currOccupation) {
		this.currOccupation = currOccupation;
	}

	public Date getDateStarted() {
		return this.dateStarted;
	}

	public void setDateStarted(Date dateStarted) {
		this.dateStarted = dateStarted;
	}

	public String getEmployerAddr1() {
		return this.employerAddr1;
	}

	public void setEmployerAddr1(String employerAddr1) {
		this.employerAddr1 = employerAddr1;
	}

	public String getEmployerAddr2() {
		return this.employerAddr2;
	}

	public void setEmployerAddr2(String employerAddr2) {
		this.employerAddr2 = employerAddr2;
	}

	public String getEmployerAddr3() {
		return this.employerAddr3;
	}

	public void setEmployerAddr3(String employerAddr3) {
		this.employerAddr3 = employerAddr3;
	}

	public String getEmployerCity() {
		return this.employerCity;
	}

	public void setEmployerCity(String employerCity) {
		this.employerCity = employerCity;
	}

	public String getEmployerCountry() {
		return this.employerCountry;
	}

	public void setEmployerCountry(String employerCountry) {
		this.employerCountry = employerCountry;
	}

	public String getEmployerName() {
		return this.employerName;
	}

	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}

	public String getEmploymentSts() {
		return this.employmentSts;
	}

	public void setEmploymentSts(String employmentSts) {
		this.employmentSts = employmentSts;
	}

	public String getFundSources() {
		return this.fundSources;
	}

	public void setFundSources(String fundSources) {
		this.fundSources = fundSources;
	}

	public Date getModifiedBy() {
		return this.modifiedBy;
	}

	public void setModifiedBy(Date modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public String getModifiedDate() {
		return this.modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public BigDecimal getNetMonthlyIncome() {
		return this.netMonthlyIncome;
	}

	public void setNetMonthlyIncome(BigDecimal netMonthlyIncome) {
		this.netMonthlyIncome = netMonthlyIncome;
	}

	public BigDecimal getNoOfYearsService() {
		return this.noOfYearsService;
	}

	public void setNoOfYearsService(BigDecimal noOfYearsService) {
		this.noOfYearsService = noOfYearsService;
	}

	public String getOtherSourcesIncome() {
		return this.otherSourcesIncome;
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