package com.afrAsia.entities.response;

import java.io.Serializable;
import java.util.List;

import com.afrAsia.entities.jpa.MsgHeader;
import com.afrAsia.entities.masters.BaseMaster;

public class MastersDataResponse implements Serializable {

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

		private List<Country> country;

		private List<Category> category;

		private List<AccountClass> accountClass;

		private List<Title> title;

		private List<UIDType> uidType;

		private List<MaritalStatus> maritalStatus;

		private List<Employment> employment;

		private List<RMDetails> rmDetails;

		private List<AccountType> accountType;

		private List<AfrAsiaFirst> afrAsiaFirst;

		private List<Bank> bank;

		public List<Country> getCountry() {
			return country;
		}

		public void setCountry(List<Country> country) {
			this.country = country;
		}

		public List<Category> getCategory() {
			return category;
		}

		public void setCategory(List<Category> category) {
			this.category = category;
		}

		public List<AccountClass> getAccountClass() {
			return accountClass;
		}

		public void setAccountClass(List<AccountClass> accountClass) {
			this.accountClass = accountClass;
		}

		public List<Title> getTitle() {
			return title;
		}

		public void setTitle(List<Title> title) {
			this.title = title;
		}

		public List<UIDType> getUidType() {
			return uidType;
		}

		public void setUidType(List<UIDType> uidType) {
			this.uidType = uidType;
		}

		public List<MaritalStatus> getMaritalStatus() {
			return maritalStatus;
		}

		public void setMaritalStatus(List<MaritalStatus> maritalStatus) {
			this.maritalStatus = maritalStatus;
		}

		public List<Employment> getEmployment() {
			return employment;
		}

		public void setEmployment(List<Employment> employment) {
			this.employment = employment;
		}

		public List<RMDetails> getRmDetails() {
			return rmDetails;
		}

		public void setRmDetails(List<RMDetails> rmDetails) {
			this.rmDetails = rmDetails;
		}

		public List<AccountType> getAccountType() {
			return accountType;
		}

		public void setAccountType(List<AccountType> accountType) {
			this.accountType = accountType;
		}

		public List<AfrAsiaFirst> getAfrAsiaFirst() {
			return afrAsiaFirst;
		}

		public void setAfrAsiaFirst(List<AfrAsiaFirst> afrAsiaFirst) {
			this.afrAsiaFirst = afrAsiaFirst;
		}

		public List<Bank> getBank() {
			return bank;
		}

		public void setBank(List<Bank> bank) {
			this.bank = bank;
		}

		@Override
		public String toString() {
			return "Data [country=" + country + ", category=" + category + ", accountClass=" + accountClass + ", title="
					+ title + ", uidType=" + uidType + ", maritalStatus=" + maritalStatus + ", employment=" + employment
					+ ", rmDetails=" + rmDetails + ", accountType=" + accountType + ", afrAsiaFirst=" + afrAsiaFirst
					+ ", bank=" + bank + "]";
		}

		public class Country implements Serializable {

			private static final long serialVersionUID = 1L;
			private String countryCode;
			private String description;
			private String callingCode;
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
				return "Country [countryCode=" + countryCode + ", description=" + description + ", callingCode="
						+ callingCode + ", dialingCode=" + dialingCode + "]";
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

			@Override
			public String toString() {
				return "Category [custCat=" + custCat + ", custCatDesc=" + custCatDesc + "]";
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

			@Override
			public String toString() {
				return "AccountClass [accountClass=" + accountClass + ", acClassType=" + acClassType + ", description="
						+ description + "]";
			}

		}

		public class Title implements Serializable {

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

			@Override
			public String toString() {
				return "Title [branchCode=" + branchCode + ", prefix1=" + prefix1 + ", prefix2=" + prefix2
						+ ", prefix3=" + prefix3 + "]";
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

			@Override
			public String toString() {
				return "UIDType [typeValue=" + typeValue + "]";
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

			@Override
			public String toString() {
				return "MaritalStatus [code=" + code + ", description=" + description + "]";
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

			@Override
			public String toString() {
				return "Employment [description=" + description + ", code=" + code + "]";
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

			@Override
			public String toString() {
				return "RMDetails [rmId=" + rmId + ", rmName=" + rmName + "]";
			}

		}

		public class AccountType extends BaseMaster implements Serializable {

			private static final long serialVersionUID = 1L;

			private String id;

			private String name;

			private String nonResident;

			private String resident;

			public String getId() {
				return id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getNonResident() {
				return nonResident;
			}

			public void setNonResident(String nonResident) {
				this.nonResident = nonResident;
			}

			public String getResident() {
				return resident;
			}

			public void setResident(String resident) {
				this.resident = resident;
			}

			@Override
			public String toString() {
				return "AccountType [id=" + id + ", name=" + name + ", nonResident=" + nonResident + ", resident="
						+ resident + "]";
			}
		}

		public class AfrAsiaFirst extends BaseMaster implements Serializable {

			private static final long serialVersionUID = 1L;

			private String id;

			private String description;

			private String additionalField;

			public String getId() {
				return id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getDescription() {
				return description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getAdditionalField() {
				return additionalField;
			}

			public void setAdditionalField(String additionalField) {
				this.additionalField = additionalField;
			}

			@Override
			public String toString() {
				return "AfrAsiaFirst [id=" + id + ", description=" + description + ", additionalField="
						+ additionalField + "]";
			}
		}

		public class Bank implements Serializable {

			private static final long serialVersionUID = 1L;

			private String bankCode;
			private String bankName;

			public String getBankCode() {
				return bankCode;
			}

			public void setBankCode(String bankCode) {
				this.bankCode = bankCode;
			}

			public String getBankName() {
				return bankName;
			}

			public void setBankName(String bankName) {
				this.bankName = bankName;
			}

			@Override
			public String toString() {
				return "Bank [bankCode=" + bankCode + ", bankName=" + bankName + "]";
			}

		}
	}
}
