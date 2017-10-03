package com.afrAsia.service;

import java.util.List;

import com.afrAsia.entities.masters.AccountClass;
import com.afrAsia.entities.masters.AccountType;
import com.afrAsia.entities.masters.AfrAsiaFirst;
import com.afrAsia.entities.masters.Bank;
import com.afrAsia.entities.masters.CategoryMaster;
import com.afrAsia.entities.masters.Country;
import com.afrAsia.entities.masters.Employment;
import com.afrAsia.entities.masters.Hobby;
import com.afrAsia.entities.masters.MaritalStatus;
import com.afrAsia.entities.masters.Prefix;
import com.afrAsia.entities.masters.RMDetails;
import com.afrAsia.entities.masters.UIDType;

public interface MasterDataService {
	
	public List<AccountClass> getAccountClass();

	public List<CategoryMaster> getCategoryList();

	public List<Country> getCountryList();

	public List<Employment> getEmployment();

	public List<MaritalStatus> getMaritalStatus();

	public List<Prefix> getPrefix();

	public List<RMDetails> getRMDetails();

	public List<UIDType> getUIDType();

	public List<AccountType> getAccountType();

	public List<AfrAsiaFirst> getAfrAsiaFirst();

	public List<Bank> getBankList();
	
	public List<Hobby> getHobbyList();
}
