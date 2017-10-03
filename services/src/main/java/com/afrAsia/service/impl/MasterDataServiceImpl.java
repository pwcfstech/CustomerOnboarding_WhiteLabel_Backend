package com.afrAsia.service.impl;

import java.util.Collections;
import java.util.List;

import org.apache.log4j.Logger;

import com.afrAsia.dao.AccountTypeDao;
import com.afrAsia.dao.AfrAsiaFirstDao;
import com.afrAsia.dao.BankDao;
import com.afrAsia.dao.HobbyDao;
import com.afrAsia.dao.jpa.AccountClassJpaDAO;
import com.afrAsia.dao.jpa.CategoryMasterJpaDAO;
import com.afrAsia.dao.jpa.CountryJpaDAO;
import com.afrAsia.dao.jpa.EmploymentJpaDAO;
import com.afrAsia.dao.jpa.MaritalStatusJpaDAO;
import com.afrAsia.dao.jpa.PrefixJpaDAO;
import com.afrAsia.dao.jpa.RMDetailsJpaDAO;
import com.afrAsia.dao.jpa.UIDTypeJpaDAO;
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
import com.afrAsia.service.MasterDataService;

public class MasterDataServiceImpl implements MasterDataService {

	final static Logger debugLog = Logger.getLogger("debugLogger");
	final static Logger infoLog = Logger.getLogger("infoLogger");
	final static Logger errorLog = Logger.getLogger("errorLogger");

	private AccountClassJpaDAO accountClassDAO;
	private CategoryMasterJpaDAO categoryMasterDAO;
	private CountryJpaDAO countryDAO;
	private EmploymentJpaDAO employmentDAO;
	private MaritalStatusJpaDAO maritalStatusDAO;
	private PrefixJpaDAO prefixDAO;
	private RMDetailsJpaDAO rmDetailsDAO;
	private UIDTypeJpaDAO uidTypeDAO;
	private AccountTypeDao accountTypeDAO;
	private AfrAsiaFirstDao afrAsiaFirstDAO;
	private BankDao bankDAO;
	private HobbyDao hobbyDAO;

	public AccountClassJpaDAO getAccountClassDAO() {
		return accountClassDAO;
	}

	public void setAccountClassDAO(AccountClassJpaDAO accountClassDAO) {
		this.accountClassDAO = accountClassDAO;
	}

	public CategoryMasterJpaDAO getCategoryMasterDAO() {
		return categoryMasterDAO;
	}

	public void setCategoryMasterDAO(CategoryMasterJpaDAO categoryMasterDAO) {
		this.categoryMasterDAO = categoryMasterDAO;
	}

	public CountryJpaDAO getCountryDAO() {
		return countryDAO;
	}

	public void setCountryDAO(CountryJpaDAO countryDAO) {
		this.countryDAO = countryDAO;
	}

	public EmploymentJpaDAO getEmploymentDAO() {
		return employmentDAO;
	}

	public void setEmploymentDAO(EmploymentJpaDAO employmentDAO) {
		this.employmentDAO = employmentDAO;
	}

	public MaritalStatusJpaDAO getMaritalStatusDAO() {
		return maritalStatusDAO;
	}

	public void setMaritalStatusDAO(MaritalStatusJpaDAO maritalStatusDAO) {
		this.maritalStatusDAO = maritalStatusDAO;
	}

	public PrefixJpaDAO getPrefixDAO() {
		return prefixDAO;
	}

	public void setPrefixDAO(PrefixJpaDAO prefixDAO) {
		this.prefixDAO = prefixDAO;
	}

	public RMDetailsJpaDAO getRmDetailsDAO() {
		return rmDetailsDAO;
	}

	public void setRmDetailsDAO(RMDetailsJpaDAO rmDetailsDAO) {
		this.rmDetailsDAO = rmDetailsDAO;
	}

	public UIDTypeJpaDAO getUidTypeDAO() {
		return uidTypeDAO;
	}

	public void setUidTypeDAO(UIDTypeJpaDAO uidTypeDAO) {
		this.uidTypeDAO = uidTypeDAO;
	}

	public AccountTypeDao getAccountTypeDAO() {
		return accountTypeDAO;
	}

	public void setAccountTypeDAO(AccountTypeDao accountTypeDAO) {
		this.accountTypeDAO = accountTypeDAO;
	}

	public AfrAsiaFirstDao getAfrAsiaFirstDAO() {
		return afrAsiaFirstDAO;
	}

	public void setAfrAsiaFirstDAO(AfrAsiaFirstDao afrAsiaFirstDAO) {
		this.afrAsiaFirstDAO = afrAsiaFirstDAO;
	}

	public HobbyDao getHobbyDAO() {
		return hobbyDAO;
	}

	public void setHobbyDAO(HobbyDao hobbyDAO) {
		this.hobbyDAO = hobbyDAO;
	}

	public List<AccountType> getAccountType() {
		return accountTypeDAO.getAccountType();
	}

	public List<AfrAsiaFirst> getAfrAsiaFirst() {
		return afrAsiaFirstDAO.getAfrAsiaFirst();
	}

	public BankDao getBankDAO() {
		return bankDAO;
	}

	public void setBankDAO(BankDao bankDAO) {
		this.bankDAO = bankDAO;
	}

	public List<AccountClass> getAccountClass() {
		debugLog.debug("accountClassDAO.getAccountClass()  " + accountClassDAO.getAccountClass());
		return accountClassDAO.getAccountClass();
	}

	public List<CategoryMaster> getCategoryList() {
		debugLog.debug("categoryMasterDAO.getCategoryList()  " + categoryMasterDAO.getCategoryList());
		return categoryMasterDAO.getCategoryList();
	}

	public List<Country> getCountryList() {
		debugLog.debug("(List<Country>) countryDAO.getCountry()  " + (List<Country>) countryDAO.getCountry());
		return (List<Country>) countryDAO.getCountry();
	}

	public List<Employment> getEmployment() {
		debugLog.debug("(List<Employment>) employmentDAO.getEmployment()  "
				+ (List<Employment>) employmentDAO.getEmployment());
		return (List<Employment>) employmentDAO.getEmployment();
	}

	public List<MaritalStatus> getMaritalStatus() {
		debugLog.debug("maritalStatusDAO.getMaritalStatus()  " + maritalStatusDAO.getMaritalStatus());
		return maritalStatusDAO.getMaritalStatus();
	}

	public List<Prefix> getPrefix() {
		debugLog.debug("prefixDAO.getPrefix()  " + prefixDAO.getPrefix());
		return prefixDAO.getPrefix();
	}

	public List<RMDetails> getRMDetails() {
		debugLog.debug("rmDetailsDAO.getRMDetails()  " + rmDetailsDAO.getRMDetails());
		return rmDetailsDAO.getRMDetails();
	}

	public List<UIDType> getUIDType() {
		debugLog.debug("uidTypeDAO.getUIDType()  " + uidTypeDAO.getUIDType());
		return uidTypeDAO.getUIDType();
	}

	public List<Bank> getBankList() {
		debugLog.debug("bankDAO.getBank()  " + bankDAO.getBank());
		List<Bank> bankList = (List<Bank>) bankDAO.getBank();
		Collections.sort(bankList);
		return bankList;
	}
	
	public List<Hobby> getHobbyList() {
		debugLog.debug("hobbyDAO.getHobby()  " + hobbyDAO.getHobby());
		return (List<Hobby>) hobbyDAO.getHobby();
	}

}
