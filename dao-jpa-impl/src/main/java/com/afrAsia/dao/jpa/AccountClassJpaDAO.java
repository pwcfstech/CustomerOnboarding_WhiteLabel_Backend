package com.afrAsia.dao.jpa;

import java.util.List;

import com.afrAsia.dao.AccountClassDao;
import com.afrAsia.entities.masters.AccountClass;

public interface AccountClassJpaDAO extends AccountClassDao{

	public List<AccountClass> getAccountClass(); 

}
