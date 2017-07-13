package com.afrAsia.dao;

import java.util.List;

import com.afrAsia.entities.masters.AccountClass;
import com.afrAsia.entities.masters.Country;
import com.afrAsia.entities.masters.Employment;
import com.afrAsia.entities.masters.MaritalStatus;
import com.afrAsia.entities.masters.Prefix;
import com.afrAsia.entities.masters.RMDetails;
import com.afrAsia.entities.masters.UIDType;

public interface AccountClassDao {

	public List<AccountClass> getAccountClass(); 

}
