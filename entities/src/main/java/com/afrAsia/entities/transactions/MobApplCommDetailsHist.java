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
 * The persistent class for the MOB_APPL_COMM_DETAILS_HIST database table.
 * 
 */
@Entity
@Table(name = "MOB_APPL_COMM_DETAILS_HIST")
@NamedQuery(name = "MobApplCommDetailsHist.findAll", query = "SELECT m FROM MobApplCommDetailsHist m")
public class MobApplCommDetailsHist implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private HistTableCompositePK id;

	@Column(name = "CREATED_BY")
	private String createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name = "CREATED_DATE")
	private Date createdDate;

	@Column(name = "FAX_NO")
	private Long faxNo;

	@Column(name = "FAX_NO_CC")
	private Long faxNoCc;

	@Column(name = "MAIL_ADDR_1")
	private String mailAddr1;

	@Column(name = "MAIL_ADDR_2")
	private String mailAddr2;

	@Column(name = "MAIL_ADDR_3")
	private String mailAddr3;

	@Column(name = "MAIL_CITY")
	private String mailCity;

	@Column(name = "MAIL_COUNTRY")
	private String mailCountry;

	@Column(name = "MOB_NO")
	private Long mobNo;

	@Column(name = "MOB_NO_CC")
	private Long mobNoCc;

	@Column(name = "MODIFIED_BY")
	private String modifiedBy;

	@Temporal(TemporalType.DATE)
	@Column(name = "MODIFIED_DATE")
	private Date modifiedDate;

	@Column(name = "PERM_ADDR_1")
	private String permAddr1;

	@Column(name = "PERM_ADDR_2")
	private String permAddr2;

	@Column(name = "PERM_ADDR_3")
	private String permAddr3;

	@Column(name = "PERM_CITY")
	private String permCity;

	@Column(name = "PERM_COUNTRY")
	private String permCountry;

	@Column(name = "TEL_NO_HOME")
	private Long telNoHome;

	@Column(name = "TEL_NO_HOME_CC")
	private Long telNoHomeCc;

	@Column(name = "TEL_NO_OFF")
	private Long telNoOff;

	@Column(name = "TEL_NO_OFF_CC")
	private Long telNoOffCc;

	public HistTableCompositePK getId() {
		return id;
	}

	public void setId(HistTableCompositePK id) {
		this.id = id;
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

	public Long getFaxNo() {
		return faxNo;
	}

	public void setFaxNo(Long faxNo) {
		this.faxNo = faxNo;
	}

	public Long getFaxNoCc() {
		return faxNoCc;
	}

	public void setFaxNoCc(Long faxNoCc) {
		this.faxNoCc = faxNoCc;
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

	public Long getMobNo() {
		return mobNo;
	}

	public void setMobNo(Long mobNo) {
		this.mobNo = mobNo;
	}

	public Long getMobNoCc() {
		return mobNoCc;
	}

	public void setMobNoCc(Long mobNoCc) {
		this.mobNoCc = mobNoCc;
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

	public Long getTelNoHome() {
		return telNoHome;
	}

	public void setTelNoHome(Long telNoHome) {
		this.telNoHome = telNoHome;
	}

	public Long getTelNoHomeCc() {
		return telNoHomeCc;
	}

	public void setTelNoHomeCc(Long telNoHomeCc) {
		this.telNoHomeCc = telNoHomeCc;
	}

	public Long getTelNoOff() {
		return telNoOff;
	}

	public void setTelNoOff(Long telNoOff) {
		this.telNoOff = telNoOff;
	}

	public Long getTelNoOffCc() {
		return telNoOffCc;
	}

	public void setTelNoOffCc(Long telNoOffCc) {
		this.telNoOffCc = telNoOffCc;
	}

	@Override
	public String toString() {
		return "MobApplCommDetailsHist [id=" + id + ", createdBy=" + createdBy + ", createdDate=" + createdDate
				+ ", faxNo=" + faxNo + ", faxNoCc=" + faxNoCc + ", mailAddr1=" + mailAddr1 + ", mailAddr2=" + mailAddr2
				+ ", mailAddr3=" + mailAddr3 + ", mailCity=" + mailCity + ", mailCountry=" + mailCountry + ", mobNo="
				+ mobNo + ", mobNoCc=" + mobNoCc + ", modifiedBy=" + modifiedBy + ", modifiedDate=" + modifiedDate
				+ ", permAddr1=" + permAddr1 + ", permAddr2=" + permAddr2 + ", permAddr3=" + permAddr3 + ", permCity="
				+ permCity + ", permCountry=" + permCountry + ", telNoHome=" + telNoHome + ", telNoHomeCc="
				+ telNoHomeCc + ", telNoOff=" + telNoOff + ", telNoOffCc=" + telNoOffCc + "]";
	}

}