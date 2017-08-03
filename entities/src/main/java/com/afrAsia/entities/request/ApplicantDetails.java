package com.afrAsia.entities.request;

import java.io.Serializable;
import java.util.Date;


public class ApplicantDetails implements Serializable {

	public ApplicantDetails() {
		super();
	}

	private static final long serialVersionUID = 1L;
	String residencyStatus;
	String otherBank1;
	String otherBank2;
	String otherBank3;
	Boolean isEmployee;
	String title;
	String firstName;
	String lastName;
	String maidenName;
	String nic;
	String passportNo;
	Date passportExpDate;
	String nationality;
	String email;
	Date dob;
	String countryBirth;
	Boolean isExistingCustomer;
	String customerCIF;
	String maritialStatus;
	String permAddr1;
	String permAddr2;
	String permAddr3;
	String permCity;
	String permCountry;
	Boolean isMailAddrSameAsPerm;
	String mailAddr1;
	String mailAddr2;
	String mailAddr3;
	String mailCity;
	String mailCountry;
	Long telNoOff;
	Long telOffCallingCode;
	Long telNoHome;
	Long telNoHomeCallingCode;
	Long mobNo;
	Long mobNoCountryCode;
	Long faxNo;
	Long faxNoCallingCode;
	String employmentStatus;
	String currentOccupation;
	String employerName;
	String employerAddr1;
	String employerAddr2;
	String employerAddr3;
	String employerCity;
	String employerCountry;
	Long noYearsService;
	String businessSector;
	Date dateStarted;
	Long netMonthlyIncome;
	Long annualDepositTurnover;
	Long annualCashDeposit;
	Long annualCashWithdrawl;
	String otherIncomeSource;
	String fundSources;
	Boolean iSUSCitizen;
	Boolean isIncomeTaxableinUSA;
	String usaSsn;
	String oAddr1;
	String oAddr2;
	String oAddr3;
	String oCity;
	String oCountry;
	Date workPermitExpDate;
	Boolean incomeOtherCountryTaxable;
	String crsTin1;
	String crsTin2;
	String crsTin3;
	String crsCountryResidence1;
	String crsCountryResidence2;
	String crsCountryResidence3;

	/* These fields are applicable only for Joint Holders */
	String relationshipMinor;
	Boolean powerAttnGivenToUSPerson;
	String powerAttnGoverningCountry;
	Date powerAttnIssueDate;
	String mop;
	String mopInstruction;
	
	
	public String getResidencyStatus() {
		return residencyStatus;
	}
	public void setResidencyStatus(String residencyStatus) {
		this.residencyStatus = residencyStatus;
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
	public Boolean getIsEmployee() {
		return isEmployee;
	}
	public void setIsEmployee(Boolean isEmployee) {

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
	public Date getPassportExpDate() {
		return passportExpDate;
	}
	public void setPassportExpDate(Date passportExpDate) {
		this.passportExpDate = passportExpDate;
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
	public Boolean getIsExistingCustomer() {
		return isExistingCustomer;
	}
	public void setIsExistingCustomer(Boolean isExistingCustomer) {
		this.isExistingCustomer = isExistingCustomer;
	}
	public String getCustomerCIF() {
		return customerCIF;
	}
	public void setCustomerCIF(String customerCIF) {
		this.customerCIF = customerCIF;
	}
	public String getMaritialStatus() {
		return maritialStatus;
	}
	public void setMaritialStatus(String maritialStatus) {
		this.maritialStatus = maritialStatus;
	}
	public String getPermAddr1() {
		return permAddr1;
	}
	public void setPermAddr1(String permAddr1) {
		this.permAddr1 = permAddr1;
	}
	public String getPermAddr2() {
		return permAddr2;
	}
	public void setPermAddr2(String permAddr2) {
		this.permAddr2 = permAddr2;
	}
	public String getPermAddr3() {
		return permAddr3;
	}
	public void setPermAddr3(String permAddr3) {
		this.permAddr3 = permAddr3;
	}
	public String getPermCity() {
		return permCity;
	}
	public void setPermCity(String permCity) {
		this.permCity = permCity;
	}
	public String getPermCountry() {
		return permCountry;
	}
	public void setPermCountry(String permCountry) {
		this.permCountry = permCountry;
	}
	public Boolean getIsMailAddrSameAsPerm() {
		return isMailAddrSameAsPerm;
	}
	public void setIsMailAddrSameAsPerm(Boolean isMailAddrSameAsPerm) {
		this.isMailAddrSameAsPerm = isMailAddrSameAsPerm;
	}
	public String getMailAddr1() {
		return mailAddr1;
	}
	public void setMailAddr1(String mailAddr1) {
		this.mailAddr1 = mailAddr1;
	}
	public String getMailAddr2() {
		return mailAddr2;
	}
	public void setMailAddr2(String mailAddr2) {
		this.mailAddr2 = mailAddr2;
	}
	public String getMailAddr3() {
		return mailAddr3;
	}
	public void setMailAddr3(String mailAddr3) {
		this.mailAddr3 = mailAddr3;
	}
	public String getMailCity() {
		return mailCity;
	}
	public void setMailCity(String mailCity) {
		this.mailCity = mailCity;
	}
	public String getMailCountry() {
		return mailCountry;
	}
	public void setMailCountry(String mailCountry) {
		this.mailCountry = mailCountry;
	}
	public Long getTelNoOff() {
		return telNoOff;
	}
	public void setTelNoOff(Long telNoOff) {
		this.telNoOff = telNoOff;
	}
	public Long getTelOffCallingCode() {
		return telOffCallingCode;
	}
	public void setTelOffCallingCode(Long telOffCallingCode) {
		this.telOffCallingCode = telOffCallingCode;
	}
	public Long getTelNoHome() {
		return telNoHome;
	}
	public void setTelNoHome(Long telNoHome) {
		this.telNoHome = telNoHome;
	}
	public Long getTelNoHomeCallingCode() {
		return telNoHomeCallingCode;
	}
	public void setTelNoHomeCallingCode(Long telNoHomeCallingCode) {
		this.telNoHomeCallingCode = telNoHomeCallingCode;
	}
	public Long getMobNo() {
		return mobNo;
	}
	public void setMobNo(Long mobNo) {
		this.mobNo = mobNo;
	}
	public Long getMobNoCountryCode() {
		return mobNoCountryCode;
	}
	public void setMobNoCountryCode(Long mobNoCountryCode) {
		this.mobNoCountryCode = mobNoCountryCode;
	}
	public Long getFaxNo() {
		return faxNo;
	}
	public void setFaxNo(Long faxNo) {
		this.faxNo = faxNo;
	}
	public Long getFaxNoCallingCode() {
		return faxNoCallingCode;
	}
	public void setFaxNoCallingCode(Long faxNoCallingCode) {
		this.faxNoCallingCode = faxNoCallingCode;
	}
	public String getEmploymentStatus() {
		return employmentStatus;
	}
	public void setEmploymentStatus(String employmentStatus) {
		this.employmentStatus = employmentStatus;
	}
	public String getCurrentOccupation() {
		return currentOccupation;
	}
	public void setCurrentOccupation(String currentOccupation) {
		this.currentOccupation = currentOccupation;
	}
	public String getEmployerName() {
		return employerName;
	}
	public void setEmployerName(String employerName) {
		this.employerName = employerName;
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
	public Long getNoYearsService() {
		return noYearsService;
	}
	public void setNoYearsService(Long noYearsService) {
		this.noYearsService = noYearsService;
	}
	public String getBusinessSector() {
		return businessSector;
	}
	public void setBusinessSector(String businessSector) {
		this.businessSector = businessSector;
	}
	public Date getDateStarted() {
		return dateStarted;
	}
	public void setDateStarted(Date dateStarted) {
		this.dateStarted = dateStarted;
	}
	public Long getNetMonthlyIncome() {
		return netMonthlyIncome;
	}
	public void setNetMonthlyIncome(Long netMonthlyIncome) {
		this.netMonthlyIncome = netMonthlyIncome;
	}
	public Long getAnnualDepositTurnover() {
		return annualDepositTurnover;
	}
	public void setAnnualDepositTurnover(Long annualDepositTurnover) {
		this.annualDepositTurnover = annualDepositTurnover;
	}
	public Long getAnnualCashDeposit() {
		return annualCashDeposit;
	}
	public void setAnnualCashDeposit(Long annualCashDeposit) {
		this.annualCashDeposit = annualCashDeposit;
	}
	public Long getAnnualCashWithdrawl() {
		return annualCashWithdrawl;
	}
	public void setAnnualCashWithdrawl(Long annualCashWithdrawl) {
		this.annualCashWithdrawl = annualCashWithdrawl;
	}
	public String getOtherIncomeSource() {
		return otherIncomeSource;
	}
	public void setOtherIncomeSource(String otherIncomeSource) {
		this.otherIncomeSource = otherIncomeSource;
	}
	public String getFundSources() {
		return fundSources;
	}
	public void setFundSources(String fundSources) {
		this.fundSources = fundSources;
	}
	public Boolean getiSUSCitizen() {
		return iSUSCitizen;
	}
	public void setiSUSCitizen(Boolean iSUSCitizen) {
		this.iSUSCitizen = iSUSCitizen;
	}
	public Boolean getIsIncomeTaxableinUSA() {
		return isIncomeTaxableinUSA;
	}
	public void setIsIncomeTaxableinUSA(Boolean isIncomeTaxableinUSA) {
		this.isIncomeTaxableinUSA = isIncomeTaxableinUSA;
	}
	public String getUsaSsn() {
		return usaSsn;
	}
	public void setUsaSsn(String usaSsn) {
		this.usaSsn = usaSsn;
	}
	public String getoAddr1() {
		return oAddr1;
	}
	public void setoAddr1(String oAddr1) {
		this.oAddr1 = oAddr1;
	}
	public String getoAddr2() {
		return oAddr2;
	}
	public void setoAddr2(String oAddr2) {
		this.oAddr2 = oAddr2;
	}
	public String getoAddr3() {
		return oAddr3;
	}
	public void setoAddr3(String oAddr3) {
		this.oAddr3 = oAddr3;
	}
	public String getoCity() {
		return oCity;
	}
	public void setoCity(String oCity) {
		this.oCity = oCity;
	}
	public String getoCountry() {
		return oCountry;
	}
	public void setoCountry(String oCountry) {
		this.oCountry = oCountry;
	}
	public Date getWorkPermitExpDate() {
		return workPermitExpDate;
	}
	public void setWorkPermitExpDate(Date workPermitExpDate) {
		this.workPermitExpDate = workPermitExpDate;
	}
	public Boolean getIncomeOtherCountryTaxable() {
		return incomeOtherCountryTaxable;
	}
	public void setIncomeOtherCountryTaxable(Boolean incomeOtherCountryTaxable) {
		this.incomeOtherCountryTaxable = incomeOtherCountryTaxable;
	}
	public String getCrsTin1() {
		return crsTin1;
	}
	public void setCrsTin1(String crsTin1) {
		this.crsTin1 = crsTin1;
	}
	public String getCrsTin2() {
		return crsTin2;
	}
	public void setCrsTin2(String crsTin2) {
		this.crsTin2 = crsTin2;
	}
	public String getCrsTin3() {
		return crsTin3;
	}
	public void setCrsTin3(String crsTin3) {
		this.crsTin3 = crsTin3;
	}
	public String getCrsCountryResidence1() {
		return crsCountryResidence1;
	}
	public void setCrsCountryResidence1(String crsCountryResidence1) {
		this.crsCountryResidence1 = crsCountryResidence1;
	}
	public String getCrsCountryResidence2() {
		return crsCountryResidence2;
	}
	public void setCrsCountryResidence2(String crsCountryResidence2) {
		this.crsCountryResidence2 = crsCountryResidence2;
	}
	public String getCrsCountryResidence3() {
		return crsCountryResidence3;
	}
	public void setCrsCountryResidence3(String crsCountryResidence3) {
		this.crsCountryResidence3 = crsCountryResidence3;
	}
	public String getRelationshipMinor() {
		return relationshipMinor;
	}
	public void setRelationshipMinor(String relationshipMinor) {
		this.relationshipMinor = relationshipMinor;
	}
	public Boolean getPowerAttnGivenToUSPerson() {
		return powerAttnGivenToUSPerson;
	}
	public void setPowerAttnGivenToUSPerson(Boolean powerAttnGivenToUSPerson) {
		this.powerAttnGivenToUSPerson = powerAttnGivenToUSPerson;
	}
	public String getPowerAttnGoverningCountry() {
		return powerAttnGoverningCountry;
	}
	public void setPowerAttnGoverningCountry(String powerAttnGoverningCountry) {
		this.powerAttnGoverningCountry = powerAttnGoverningCountry;
	}
	public Date getPowerAttnIssueDate() {
		return powerAttnIssueDate;
	}
	public void setPowerAttnIssueDate(Date powerAttnIssueDate) {
		this.powerAttnIssueDate = powerAttnIssueDate;
	}
	public String getMop() {
		return mop;
	}
	public void setMop(String mop) {
		this.mop = mop;
	}
	public String getMopInstruction() {
		return mopInstruction;
	}
	public void setMopInstruction(String mopInstruction) {
		this.mopInstruction = mopInstruction;
	}
	@Override
	public String toString() {
		return "ApplicantDetails [residencyStatus=" + residencyStatus + ", otherBank1=" + otherBank1
				+ ", otherBank2=" + otherBank2 + ", otherBank3=" + otherBank3 + ", isEmployee=" + isEmployee
				+ ", title=" + title + ", firstName=" + firstName + ", lastName=" + lastName + ", maidenName="
				+ maidenName + ", nic=" + nic + ", passportNo=" + passportNo + ", passportExpDate="
				+ passportExpDate + ", nationality=" + nationality + ", email=" + email + ", dob=" + dob
				+ ", countryBirth=" + countryBirth + ", isExistingCustomer=" + isExistingCustomer
				+ ", customerCIF=" + customerCIF + ", maritialStatus=" + maritialStatus + ", permAddr1="
				+ permAddr1 + ", permAddr2=" + permAddr2 + ", permAddr3=" + permAddr3 + ", permCity=" + permCity
				+ ", permCountry=" + permCountry + ", isMailAddrSameAsPerm=" + isMailAddrSameAsPerm
				+ ", mailAddr1=" + mailAddr1 + ", mailAddr2=" + mailAddr2 + ", mailAddr3=" + mailAddr3
				+ ", mailCity=" + mailCity + ", mailCountry=" + mailCountry + ", telNoOff=" + telNoOff
				+ ", telOffCallingCode=" + telOffCallingCode + ", telNoHome=" + telNoHome
				+ ", telNoHomeCallingCode=" + telNoHomeCallingCode + ", mobNo=" + mobNo + ", mobNoCountryCode="
				+ mobNoCountryCode + ", faxNo=" + faxNo + ", faxNoCallingCode=" + faxNoCallingCode
				+ ", employmentStatus=" + employmentStatus + ", currentOccupation=" + currentOccupation
				+ ", employerName=" + employerName + ", employerAddr1=" + employerAddr1 + ", employerAddr2="
				+ employerAddr2 + ", employerAddr3=" + employerAddr3 + ", employerCity=" + employerCity
				+ ", employerCountry=" + employerCountry + ", noYearsService=" + noYearsService
				+ ", businessSector=" + businessSector + ", dateStarted=" + dateStarted + ", netMonthlyIncome="
				+ netMonthlyIncome + ", annualDepositTurnover=" + annualDepositTurnover + ", annualCashDeposit="
				+ annualCashDeposit + ", annualCashWithdrawl=" + annualCashWithdrawl + ", otherIncomeSource="
				+ otherIncomeSource + ", fundSources=" + fundSources + ", iSUSCitizen=" + iSUSCitizen
				+ ", isIncomeTaxableinUSA=" + isIncomeTaxableinUSA + ", usaSsn=" + usaSsn + ", oAddr1=" + oAddr1
				+ ", oAddr2=" + oAddr2 + ", oAddr3=" + oAddr3 + ", oCity=" + oCity + ", oCountry=" + oCountry
				+ ", workPermitExpDate=" + workPermitExpDate + ", incomeOtherCountryTaxable="
				+ incomeOtherCountryTaxable + ", crsTin1=" + crsTin1 + ", crsTin2=" + crsTin2 + ", crsTin3="
				+ crsTin3 + ", crsCountryResidence1=" + crsCountryResidence1 + ", crsCountryResidence2="
				+ crsCountryResidence2 + ", crsCountryResidence3=" + crsCountryResidence3
				+ ", relationshipMinor=" + relationshipMinor + ", powerAttnGivenToUSPerson="
				+ powerAttnGivenToUSPerson + ", powerAttnGoverningCountry=" + powerAttnGoverningCountry
				+ ", powerAttnIssueDate=" + powerAttnIssueDate + ", mop=" + mop + ", mopInstruction="
				+ mopInstruction + "]";
	}	        
}		


