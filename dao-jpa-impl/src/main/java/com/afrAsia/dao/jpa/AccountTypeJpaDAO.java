package com.afrAsia.dao.jpa;

import java.util.List;

import com.afrAsia.dao.AccountTypeDao;
import com.afrAsia.entities.masters.AccountType;

public interface AccountTypeJpaDAO extends AccountTypeDao{

	public List<AccountType> getAccountType();

}
