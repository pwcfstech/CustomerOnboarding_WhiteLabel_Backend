package com.afrAsia.entities.transactions;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the MOB_APPLICANT_COMM_DETAILS database table.
 * 
 */
@Entity
@Table(name="MOB_APPLICANT_COMM_DETAILS")
@NamedQuery(name="MobApplicantCommDetail.findAll", query="SELECT m FROM MobApplicantCommDetail m")
public class MobApplicantCommDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private MainTableCompositePK id;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_DATE")
	private Date createdDate;

	@Column(name="FAX_NO")
	private BigDecimal faxNo;

	@Column(name="FAX_NO_CC")
	private BigDecimal faxNoCc;

	@Column(name="MAIL_ADDR_1")
	private String mailAddr1;

	@Column(name="MAIL_ADDR_2")
	private String mailAddr2;

	@Column(name="MAIL_ADDR_3")
	private String mailAddr3;

	@Column(name="MAIL_CITY")
	private String mailCity;

	@Column(name="MAIL_COUNTRY")
	private String mailCountry;

	@Column(name="MOB_NO")
	private BigDecimal mobNo;

	@Column(name="MOB_NO_CC")
	private BigDecimal mobNoCc;

	@Column(name="MODIFIED_BY")
	private String modifiedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="MODIFIED_DATE")
	private Date modifiedDate;

	@Column(name="PERM_ADDR_1")
	private String permAddr1;

	@Column(name="PERM_ADDR_2")
	private String permAddr2;

	@Column(name="PERM_ADDR_3")
	private String permAddr3;

	@Column(name="PERM_CITY")
	private String permCity;

	@Column(name="PERM_COUNTRY")
	private String permCountry;

	@Column(name="RECORD_ID")
	private BigDecimal recordId;

	@Column(name="TEL_NO_HOME")
	private BigDecimal telNoHome;

	@Column(name="TEL_NO_HOME_CC")
	private BigDecimal telNoHomeCc;

	@Column(name="TEL_NO_OFF")
	private BigDecimal telNoOff;

	@Column(name="TEL_NO_OFF_CC")
	private BigDecimal telNoOffCc;

	public MobApplicantCommDetail() {
	}

	public MainTableCompositePK getId() {
		return this.id;
	}

	public void setId(MainTableCompositePK id) {
		this.id = id;
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

	public BigDecimal getFaxNo() {
		return this.faxNo;
	}

	public void setFaxNo(BigDecimal faxNo) {
		this.faxNo = faxNo;
	}

	public BigDecimal getFaxNoCc() {
		return this.faxNoCc;
	}

	public void setFaxNoCc(BigDecimal faxNoCc) {
		this.faxNoCc = faxNoCc;
	}

	public String getMailAddr1() {
		return this.mailAddr1;
	}

	public void setMailAddr1(String mailAddr1) {
		this.mailAddr1 = mailAddr1;
	}

	public String getMailAddr2() {
		return this.mailAddr2;
	}

	public void setMailAddr2(String mailAddr2) {
		this.mailAddr2 = mailAddr2;
	}

	public String getMailAddr3() {
		return this.mailAddr3;
	}

	public void setMailAddr3(String mailAddr3) {
		this.mailAddr3 = mailAddr3;
	}

	public String getMailCity() {
		return this.mailCity;
	}

	public void setMailCity(String mailCity) {
		this.mailCity = mailCity;
	}

	public String getMailCountry() {
		return this.mailCountry;
	}

	public void setMailCountry(String mailCountry) {
		this.mailCountry = mailCountry;
	}

	public BigDecimal getMobNo() {
		return this.mobNo;
	}

	public void setMobNo(BigDecimal mobNo) {
		this.mobNo = mobNo;
	}

	public BigDecimal getMobNoCc() {
		return this.mobNoCc;
	}

	public void setMobNoCc(BigDecimal mobNoCc) {
		this.mobNoCc = mobNoCc;
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

	public String getPermAddr1() {
		return this.permAddr1;
	}

	public void setPermAddr1(String permAddr1) {
		this.permAddr1 = permAddr1;
	}

	public String getPermAddr2() {
		return this.permAddr2;
	}

	public void setPermAddr2(String permAddr2) {
		this.permAddr2 = permAddr2;
	}

	public String getPermAddr3() {
		return this.permAddr3;
	}

	public void setPermAddr3(String permAddr3) {
		this.permAddr3 = permAddr3;
	}

	public String getPermCity() {
		return this.permCity;
	}

	public void setPermCity(String permCity) {
		this.permCity = permCity;
	}

	public String getPermCountry() {
		return this.permCountry;
	}

	public void setPermCountry(String permCountry) {
		this.permCountry = permCountry;
	}

	public BigDecimal getRecordId() {
		return this.recordId;
	}

	public void setRecordId(BigDecimal recordId) {
		this.recordId = recordId;
	}

	public BigDecimal getTelNoHome() {
		return this.telNoHome;
	}

	public void setTelNoHome(BigDecimal telNoHome) {
		this.telNoHome = telNoHome;
	}

	public BigDecimal getTelNoHomeCc() {
		return this.telNoHomeCc;
	}

	public void setTelNoHomeCc(BigDecimal telNoHomeCc) {
		this.telNoHomeCc = telNoHomeCc;
	}

	public BigDecimal getTelNoOff() {
		return this.telNoOff;
	}

	public void setTelNoOff(BigDecimal telNoOff) {
		this.telNoOff = telNoOff;
	}

	public BigDecimal getTelNoOffCc() {
		return this.telNoOffCc;
	}

	public void setTelNoOffCc(BigDecimal telNoOffCc) {
		this.telNoOffCc = telNoOffCc;
	}

	@Override
	public String toString() {
		return "MobApplicantCommDetail [id=" + id + ", createdBy=" + createdBy + ", createdDate=" + createdDate
				+ ", faxNo=" + faxNo + ", faxNoCc=" + faxNoCc + ", mailAddr1=" + mailAddr1 + ", mailAddr2=" + mailAddr2
				+ ", mailAddr3=" + mailAddr3 + ", mailCity=" + mailCity + ", mailCountry=" + mailCountry + ", mobNo="
				+ mobNo + ", mobNoCc=" + mobNoCc + ", modifiedBy=" + modifiedBy + ", modifiedDate=" + modifiedDate
				+ ", permAddr1=" + permAddr1 + ", permAddr2=" + permAddr2 + ", permAddr3=" + permAddr3 + ", permCity="
				+ permCity + ", permCountry=" + permCountry + ", recordId=" + recordId + ", telNoHome=" + telNoHome
				+ ", telNoHomeCc=" + telNoHomeCc + ", telNoOff=" + telNoOff + ", telNoOffCc=" + telNoOffCc + "]";
	}
	
}