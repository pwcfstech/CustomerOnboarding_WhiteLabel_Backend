package com.afrAsia.entities.response;

import java.io.Serializable;

import com.afrAsia.entities.jpa.MsgHeader;

public class MastersResponse implements Serializable {

	private static final long serialVersionUID = 1L;

	private MsgHeader msgHeader;

	private Data data;

	public MsgHeader getMsgHeader() {
		return msgHeader;
	}

	public void setMsgHeader(MsgHeader msgHeader) {
		this.msgHeader = msgHeader;
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "MastersResponse [msgHeader=" + msgHeader + ", data=" + data + "]";
	}

	public class Data implements Serializable {

		private static final long serialVersionUID = 1L;

		private Country country;

		private Category category;

		private AccountClass accountClass;

		private Prefix prefix;

		private UIDType uidType;

		private MaritalStatus maritalStatus;

		private Employment employment;

		private RMDetails rmDetails;

		public Country getCountry() {
			return country;
		}

		public void setCountry(Country country) {
			this.country = country;
		}

		public Category getCategory() {
			return category;
		}

		public void setCategory(Category category) {
			this.category = category;
		}

		public AccountClass getAccountClass() {
			return accountClass;
		}

		public void setAccountClass(AccountClass accountClass) {
			this.accountClass = accountClass;
		}

		public Prefix getPrefix() {
			return prefix;
		}

		public void setPrefix(Prefix prefix) {
			this.prefix = prefix;
		}

		public UIDType getUidType() {
			return uidType;
		}

		public void setUidType(UIDType uidType) {
			this.uidType = uidType;
		}

		public MaritalStatus getMaritalStatus() {
			return maritalStatus;
		}

		public void setMaritalStatus(MaritalStatus maritalStatus) {
			this.maritalStatus = maritalStatus;
		}

		public Employment getEmployment() {
			return employment;
		}

		public void setEmployment(Employment employment) {
			this.employment = employment;
		}

		public RMDetails getRmDetails() {
			return rmDetails;
		}

		public void setRmDetails(RMDetails rmDetails) {
			this.rmDetails = rmDetails;
		}

		@Override
		public String toString() {
			return "Data [country=" + country + ", category=" + category + ", accountClass=" + accountClass
					+ ", prefix=" + prefix + ", uidType=" + uidType + ", maritalStatus=" + maritalStatus
					+ ", employment=" + employment + ", rmDetails=" + rmDetails + "]";
		}

	}

	public class Country implements Serializable {

		private static final long serialVersionUID = 1L;
		private String countryCode;
		private String description;

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
	}

	public class Category implements Serializable {

		private static final long serialVersionUID = 1L;
		private String custCat;
		private String custCatDesc;

		public String getCustCatDesc() {
			return custCatDesc;
		}

		public void setCustCatDesc(String custCatDesc) {
			this.custCatDesc = custCatDesc;
		}

		public String getCustCat() {
			return custCat;
		}

		public void setCustCat(String custCat) {
			this.custCat = custCat;
		}
	}

	public class AccountClass implements Serializable {

		private static final long serialVersionUID = 1L;
		private String accountClass;
		private String acClassType;
		private String description;

		public String getAccountClass() {
			return accountClass;
		}

		public void setAccountClass(String accountClass) {
			this.accountClass = accountClass;
		}

		public String getAcClassType() {
			return acClassType;
		}

		public void setAcClassType(String acClassType) {
			this.acClassType = acClassType;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

	}

	public class Prefix implements Serializable {

		private static final long serialVersionUID = 1L;
		private String branchCode;
		private String prefix1;
		private String prefix2;
		private String prefix3;

		public String getBranchCode() {
			return branchCode;
		}

		public void setBranchCode(String branchCode) {
			this.branchCode = branchCode;
		}

		public String getPrefix1() {
			return prefix1;
		}

		public void setPrefix1(String prefix1) {
			this.prefix1 = prefix1;
		}

		public String getPrefix2() {
			return prefix2;
		}

		public void setPrefix2(String prefix2) {
			this.prefix2 = prefix2;
		}

		public String getPrefix3() {
			return prefix3;
		}

		public void setPrefix3(String prefix3) {
			this.prefix3 = prefix3;
		}

	}

	public class UIDType implements Serializable {

		private static final long serialVersionUID = 1L;
		private String typeValue;

		public String getTypeValue() {
			return typeValue;
		}

		public void setTypeValue(String typeValue) {
			this.typeValue = typeValue;
		}

	}

	public class MaritalStatus implements Serializable {

		private static final long serialVersionUID = 1L;
		private String code;
		private String description;

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

	}

	public class Employment implements Serializable {

		private static final long serialVersionUID = 1L;
		private String description;
		private String code;

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}

	}

	public class RMDetails implements Serializable {

		private static final long serialVersionUID = 1L;
		private String rmId;
		private String rmName;

		public String getRmId() {
			return rmId;
		}

		public void setRmId(String rmId) {
			this.rmId = rmId;
		}

		public String getRmName() {
			return rmName;
		}

		public void setRmName(String rmName) {
			this.rmName = rmName;
		}
	}
}
