package com.afrAsia.entities.masters;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MOB_FLEX_MASTER_COUNTRY")
public class Country extends BaseMaster implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "COUNTRY_CODE")
	private String countryCode;

	@Column(name = "DESCRIPTION")
	private String description;

	@Column(name = "CALLING_CODE")
	private String callingCode;

	@Column(name = "DIALING_CODE")
	private String dialingCode;

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCallingCode() {
		return callingCode;
	}

	public void setCallingCode(String callingCode) {
		this.callingCode = callingCode;
	}

	public String getDialingCode() {
		return dialingCode;
	}

	public void setDialingCode(String dialingCode) {
		this.dialingCode = dialingCode;
	}

	@Override
	public String toString() {
		return "Country [countryCode=" + countryCode + ", description=" + description + ", callingCode=" + callingCode
				+ ", dialingCode=" + dialingCode + "]";
	}

}
