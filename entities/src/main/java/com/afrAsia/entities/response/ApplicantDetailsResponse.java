package com.afrAsia.entities.response;

import java.io.Serializable;
import java.util.List;

import com.afrAsia.entities.request.KycInfo;

public class ApplicantDetailsResponse implements Serializable {

	public ApplicantDetailsResponse() {
		super();
	}

	private static final long serialVersionUID = 1L;

	private String residencyStatus;
	private String otherBank1;
	private String otherBank2;
	private String otherBank3;
	private Boolean isEmployee;
	private String title;
	private String firstName;
	private String lastName;
	private String middleName;
	private String maidenName;
	private String nic;
	private String passportNo;
	private Long passportExpDate;
	private Long passportIssDate;
	private String nationality;
	private String email;
	private Long dob;
	private String countryBirth;
	private Boolean isExistingCustomer;
	private String customerCIF;
	private String maritialStatus;
	private String permAddr1;
	private String permAddr2;
	private String permAddr3;
	private String permCity;
	private String permCountry;
	private Boolean isMailAddrSameAsPerm;
	private String mailAddr1;
	private String mailAddr2;
	private String mailAddr3;
	private String mailCity;
	private String mailCountry;
	private Long telNoOff;
	private Long telOffCallingCode;
	private Long telNoHome;
	private Long telNoHomeCallingCode;
	private Long mobNo;
	private Long mobNoCountryCode;
	private Long faxNo;
	private Long faxNoCallingCode;
	private String employmentStatus;
	private String currentOccupation;
	private String employerName;
	private String employerAddr1;
	private String employerAddr2;
	private String employerAddr3;
	private String employerCity;
	private String employerCountry;
	private Long noYearsService;
	private String businessSector;
	private Long dateStarted;
	private Long netMonthlyIncome;
	private Long annualDepositTurnover;
	private Long annualCashDeposit;
	private Long annualCashWithdrawl;
	private String otherIncomeSource;
	private String fundSources;
	private Boolean iSUSCitizen;
	private Boolean isIncomeTaxableinUSA;
	private String usaSsn;
	private String oAddr1;
	private String oAddr2;
	private String oAddr3;
	private String oCity;
	private String oCountry;
	private Long workPermitExpDate;
	private Boolean incomeOtherCountryTaxable;
	private String crsTin1;
	private String crsTin2;
	private String crsTin3;
	private String crsCountryResidence1;
	private String crsCountryResidence2;
	private String crsCountryResidence3;
	private String employmentSts;
	private Long applicantId;
	private Boolean isMinor;
	private List<KycInfo> kycInfo;
	private String sex;
	private Boolean isHnwi;
	private String signatoryType;

	/* These fields are applicable only for Joint Holders */
	private String relationshipMinor;
	private Boolean powerAttnGivenToUSPerson;
	private String powerAttnGoverningCountry;
	private Long powerAttnIssueDate;
	private String mop;
	private String mopInstruction;
	private Boolean isProxyHolder;//Added by Avisha on 25/09 for issues
	private String whrDidYouHearAbtAfrAsia;//Added by Avisha on 26/09 for issues
	private String hobbyCode1;//Added by Avisha on 26/09 for issues
	private String hobbyCode2;//Added by Avisha on 26/09 for issues
	private String hobbyCode3;//Added by Avisha on 26/09 for issues
	
	/*Start: Added by Avisha on 27/09 as asked by client*/
	private Boolean tinAvailable1;
	private Boolean tinAvailable2;
	private Boolean tinAvailable3;
	private String noTinOption1;
	private String noTinOption2;
	private String noTinOption3;
	private String noTinReason1;
	private String noTinReason2;
	private String noTinReason3;
	private String afrasiaEventQues;
	private String afrasiaEventAns;
	/*End: Added by Avisha on 27/09 as asked by client*/
	
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

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
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

	public Long getPassportExpDate() {
		return passportExpDate;
	}

	public void setPassportExpDate(Long passportExpDate) {
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

	public Long getDob() {
		return dob;
	}

	public void setDob(Long dob) {
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

	public Long getDateStarted() {
		return dateStarted;
	}

	public void setDateStarted(Long dateStarted) {
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

	public Long getWorkPermitExpDate() {
		return workPermitExpDate;
	}

	public void setWorkPermitExpDate(Long workPermitExpDate) {
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

	public String getEmploymentSts() {
		return employmentSts;
	}

	public void setEmploymentSts(String employmentSts) {
		this.employmentSts = employmentSts;
	}

	public Long getApplicantId() {
		return applicantId;
	}

	public void setApplicantId(Long applicantId) {
		this.applicantId = applicantId;
	}

	public Boolean getIsMinor() {
		return isMinor;
	}

	public void setIsMinor(Boolean isMinor) {
		this.isMinor = isMinor;
	}

	public List<KycInfo> getKycInfo() {
		return kycInfo;
	}

	public void setKycInfo(List<KycInfo> kycInfo) {
		this.kycInfo = kycInfo;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Boolean getIsHnwi() {
		return isHnwi;
	}

	public void setIsHnwi(Boolean isHnwi) {
		this.isHnwi = isHnwi;
	}

	public String getSignatoryType() {
		return signatoryType;
	}

	public void setSignatoryType(String signatoryType) {
		this.signatoryType = signatoryType;
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

	public Long getPowerAttnIssueDate() {
		return powerAttnIssueDate;
	}

	public void setPowerAttnIssueDate(Long powerAttnIssueDate) {
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

	public Long getPassportIssDate() {
		return passportIssDate;
	}

	public void setPassportIssDate(Long passportIssDate) {
		this.passportIssDate = passportIssDate;
	}

	public Boolean getIsProxyHolder() {
		return isProxyHolder;
	}

	public void setIsProxyHolder(Boolean isProxyHolder) {
		this.isProxyHolder = isProxyHolder;
	}

	public String getWhrDidYouHearAbtAfrAsia() {
		return whrDidYouHearAbtAfrAsia;
	}

	public void setWhrDidYouHearAbtAfrAsia(String whrDidYouHearAbtAfrAsia) {
		this.whrDidYouHearAbtAfrAsia = whrDidYouHearAbtAfrAsia;
	}

	public Boolean getTinAvailable1() {
		return tinAvailable1;
	}

	public void setTinAvailable1(Boolean tinAvailable1) {
		this.tinAvailable1 = tinAvailable1;
	}

	public Boolean getTinAvailable2() {
		return tinAvailable2;
	}

	public void setTinAvailable2(Boolean tinAvailable2) {
		this.tinAvailable2 = tinAvailable2;
	}

	public Boolean getTinAvailable3() {
		return tinAvailable3;
	}

	public void setTinAvailable3(Boolean tinAvailable3) {
		this.tinAvailable3 = tinAvailable3;
	}

	public String getNoTinOption1() {
		return noTinOption1;
	}

	public void setNoTinOption1(String noTinOption1) {
		this.noTinOption1 = noTinOption1;
	}

	public String getNoTinOption2() {
		return noTinOption2;
	}

	public void setNoTinOption2(String noTinOption2) {
		this.noTinOption2 = noTinOption2;
	}

	public String getNoTinOption3() {
		return noTinOption3;
	}

	public void setNoTinOption3(String noTinOption3) {
		this.noTinOption3 = noTinOption3;
	}

	public String getNoTinReason1() {
		return noTinReason1;
	}

	public void setNoTinReason1(String noTinReason1) {
		this.noTinReason1 = noTinReason1;
	}

	public String getNoTinReason2() {
		return noTinReason2;
	}

	public void setNoTinReason2(String noTinReason2) {
		this.noTinReason2 = noTinReason2;
	}

	public String getNoTinReason3() {
		return noTinReason3;
	}

	public void setNoTinReason3(String noTinReason3) {
		this.noTinReason3 = noTinReason3;
	}

	public String getHobbyCode1() {
		return hobbyCode1;
	}

	public void setHobbyCode1(String hobbyCode1) {
		this.hobbyCode1 = hobbyCode1;
	}

	public String getHobbyCode2() {
		return hobbyCode2;
	}

	public void setHobbyCode2(String hobbyCode2) {
		this.hobbyCode2 = hobbyCode2;
	}

	public String getHobbyCode3() {
		return hobbyCode3;
	}

	public void setHobbyCode3(String hobbyCode3) {
		this.hobbyCode3 = hobbyCode3;
	}

	public String getAfrasiaEventQues() {
		return afrasiaEventQues;
	}

	public void setAfrasiaEventQues(String afrasiaEventQues) {
		this.afrasiaEventQues = afrasiaEventQues;
	}

	public String getAfrasiaEventAns() {
		return afrasiaEventAns;
	}

	public void setAfrasiaEventAns(String afrasiaEventAns) {
		this.afrasiaEventAns = afrasiaEventAns;
	}

	@Override
	public String toString() {
		return "ApplicantDetailsResponse [residencyStatus=" + residencyStatus + ", otherBank1=" + otherBank1
				+ ", otherBank2=" + otherBank2 + ", otherBank3=" + otherBank3 + ", isEmployee=" + isEmployee
				+ ", title=" + title + ", firstName=" + firstName + ", lastName=" + lastName + ", middleName="
				+ middleName + ", maidenName=" + maidenName + ", nic=" + nic + ", passportNo=" + passportNo
				+ ", passportExpDate=" + passportExpDate + ", passportIssDate=" + passportIssDate + ", nationality="
				+ nationality + ", email=" + email + ", dob=" + dob + ", countryBirth=" + countryBirth
				+ ", isExistingCustomer=" + isExistingCustomer + ", customerCIF=" + customerCIF + ", maritialStatus="
				+ maritialStatus + ", permAddr1=" + permAddr1 + ", permAddr2=" + permAddr2 + ", permAddr3=" + permAddr3
				+ ", permCity=" + permCity + ", permCountry=" + permCountry + ", isMailAddrSameAsPerm="
				+ isMailAddrSameAsPerm + ", mailAddr1=" + mailAddr1 + ", mailAddr2=" + mailAddr2 + ", mailAddr3="
				+ mailAddr3 + ", mailCity=" + mailCity + ", mailCountry=" + mailCountry + ", telNoOff=" + telNoOff
				+ ", telOffCallingCode=" + telOffCallingCode + ", telNoHome=" + telNoHome + ", telNoHomeCallingCode="
				+ telNoHomeCallingCode + ", mobNo=" + mobNo + ", mobNoCountryCode=" + mobNoCountryCode + ", faxNo="
				+ faxNo + ", faxNoCallingCode=" + faxNoCallingCode + ", employmentStatus=" + employmentStatus
				+ ", currentOccupation=" + currentOccupation + ", employerName=" + employerName + ", employerAddr1="
				+ employerAddr1 + ", employerAddr2=" + employerAddr2 + ", employerAddr3=" + employerAddr3
				+ ", employerCity=" + employerCity + ", employerCountry=" + employerCountry + ", noYearsService="
				+ noYearsService + ", businessSector=" + businessSector + ", dateStarted=" + dateStarted
				+ ", netMonthlyIncome=" + netMonthlyIncome + ", annualDepositTurnover=" + annualDepositTurnover
				+ ", annualCashDeposit=" + annualCashDeposit + ", annualCashWithdrawl=" + annualCashWithdrawl
				+ ", otherIncomeSource=" + otherIncomeSource + ", fundSources=" + fundSources + ", iSUSCitizen="
				+ iSUSCitizen + ", isIncomeTaxableinUSA=" + isIncomeTaxableinUSA + ", usaSsn=" + usaSsn + ", oAddr1="
				+ oAddr1 + ", oAddr2=" + oAddr2 + ", oAddr3=" + oAddr3 + ", oCity=" + oCity + ", oCountry=" + oCountry
				+ ", workPermitExpDate=" + workPermitExpDate + ", incomeOtherCountryTaxable="
				+ incomeOtherCountryTaxable + ", crsTin1=" + crsTin1 + ", crsTin2=" + crsTin2 + ", crsTin3=" + crsTin3
				+ ", crsCountryResidence1=" + crsCountryResidence1 + ", crsCountryResidence2=" + crsCountryResidence2
				+ ", crsCountryResidence3=" + crsCountryResidence3 + ", employmentSts=" + employmentSts
				+ ", applicantId=" + applicantId + ", isMinor=" + isMinor + ", kycInfo=" + kycInfo + ", sex=" + sex
				+ ", isHnwi=" + isHnwi + ", signatoryType=" + signatoryType + ", relationshipMinor=" + relationshipMinor
				+ ", powerAttnGivenToUSPerson=" + powerAttnGivenToUSPerson + ", powerAttnGoverningCountry="
				+ powerAttnGoverningCountry + ", powerAttnIssueDate=" + powerAttnIssueDate + ", mop=" + mop
				+ ", mopInstruction=" + mopInstruction + ", isProxyHolder=" + isProxyHolder
				+ ", whrDidYouHearAbtAfrAsia=" + whrDidYouHearAbtAfrAsia + ", hobbyCode1=" + hobbyCode1
				+ ", hobbyCode2=" + hobbyCode2 + ", hobbyCode3=" + hobbyCode3 + ", tinAvailable1=" + tinAvailable1
				+ ", tinAvailable2=" + tinAvailable2 + ", tinAvailable3=" + tinAvailable3 + ", noTinOption1="
				+ noTinOption1 + ", noTinOption2=" + noTinOption2 + ", noTinOption3=" + noTinOption3 + ", noTinReason1="
				+ noTinReason1 + ", noTinReason2=" + noTinReason2 + ", noTinReason3=" + noTinReason3
				+ ", afrasiaEventQues=" + afrasiaEventQues + ", afrasiaEventAns=" + afrasiaEventAns + "]";
	}

}
