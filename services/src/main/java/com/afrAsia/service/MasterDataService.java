package com.afrAsia.service;

import java.util.List;

import com.afrAsia.entities.masters.AccountClass;
import com.afrAsia.entities.masters.CategoryMaster;
import com.afrAsia.entities.masters.Country;
import com.afrAsia.entities.masters.Employment;
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
	
	
	

}
