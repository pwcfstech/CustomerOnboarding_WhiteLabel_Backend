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
	
	@Column(name = "HOBBY_CODE_1")//Added by Avisha on 26/09.. for issues
	private String hobbyCode1;
	
	@Column(name = "HOBBY_CODE_2")//Added by Avisha on 26/09.. for issues
	private String hobbyCode2;
	
	@Column(name = "HOBBY_CODE_3")//Added by Avisha on 26/09.. for issues
	private String hobbyCode3;
	
	@Column(name = "HEAR_ABOUT_AFRASIA")//Added by Avisha on 26/09.. for issues
	private String hearAboutAfrasia;
	
	@Column(name = "AFRASIA_EVENT_QUES")//Added by Avisha on 27/09.. for issues
	private String afrasiaEventQues;

	@Column(name = "AFRASIA_EVENT_ANS")//Added by Avisha on 27/09.. for issues
	private String afrasiaEventAns;
	
	@Column(name = "TIN_AVAILABLE_1")//Added by Avisha on 27/09 as asked by client
	private Boolean tinAvailable1;
	
	@Column(name = "TIN_AVAILABLE_2")//Added by Avisha on 27/09 as asked by client
	private Boolean tinAvailable2;
	
	@Column(name = "TIN_AVAILABLE_3")//Added by Avisha on 27/09 as asked by client
	private Boolean tinAvailable3;
	
	@Column(name = "NO_TIN_OPTION_1")//Added by Avisha on 27/09 as asked by client
	private String noTinOption1;
	
	@Column(name = "NO_TIN_OPTION_2")//Added by Avisha on 27/09 as asked by client
	private String noTinOption2;
	
	@Column(name = "NO_TIN_OPTION_3")//Added by Avisha on 27/09 as asked by client
	private String noTinOption3;
	
	@Column(name = "NO_TIN_REASON_1")//Added by Avisha on 27/09 as asked by client
	private String noTinReason1;
	
	@Column(name = "NO_TIN_REASON_2")//Added by Avisha on 27/09 as asked by client
	private String noTinReason2;
	
	@Column(name = "NO_TIN_REASON_3")//Added by Avisha on 27/09 as asked by client
	private String noTinReason3;

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

	public String getHearAboutAfrasia() {
		return hearAboutAfrasia;
	}

	public void setHearAboutAfrasia(String hearAboutAfrasia) {
		this.hearAboutAfrasia = hearAboutAfrasia;
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
		return "MobApplAdditionalDtlsHist [id=" + id + ", country1=" + country1 + ", country2=" + country2
				+ ", country3=" + country3 + ", createdBy=" + createdBy + ", createdDate=" + createdDate
				+ ", incomeOtherCountryTax=" + incomeOtherCountryTax + ", incomeUsTaxable=" + incomeUsTaxable
				+ ", modifiedBy=" + modifiedBy + ", modifiedDate=" + modifiedDate + ", oseasAddr1=" + oseasAddr1
				+ ", oseasAddr2=" + oseasAddr2 + ", oseasAddr3=" + oseasAddr3 + ", oseasCity=" + oseasCity
				+ ", oseasCountry=" + oseasCountry + ", tin1=" + tin1 + ", tin2=" + tin2 + ", tin3=" + tin3
				+ ", usCitizen=" + usCitizen + ", usSsn=" + usSsn + ", workPermitExpDate=" + workPermitExpDate
				+ ", hobbyCode1=" + hobbyCode1 + ", hobbyCode2=" + hobbyCode2 + ", hobbyCode3=" + hobbyCode3
				+ ", hearAboutAfrasia=" + hearAboutAfrasia + ", afrasiaEventQues=" + afrasiaEventQues
				+ ", afrasiaEventAns=" + afrasiaEventAns + ", tinAvailable1=" + tinAvailable1 + ", tinAvailable2="
				+ tinAvailable2 + ", tinAvailable3=" + tinAvailable3 + ", noTinOption1=" + noTinOption1
				+ ", noTinOption2=" + noTinOption2 + ", noTinOption3=" + noTinOption3 + ", noTinReason1=" + noTinReason1
				+ ", noTinReason2=" + noTinReason2 + ", noTinReason3=" + noTinReason3 + "]";
	}


}