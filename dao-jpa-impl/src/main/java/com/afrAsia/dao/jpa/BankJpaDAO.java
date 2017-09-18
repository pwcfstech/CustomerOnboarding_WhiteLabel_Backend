package com.afrAsia.dao.jpa;

import java.util.Collection;

import com.afrAsia.dao.BankDao;
import com.afrAsia.entities.masters.Bank;

public interface BankJpaDAO extends BankDao {

	public Collection<Bank> getBank();

}
