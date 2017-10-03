package com.afrAsia.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.afrAsia.entities.jpa.MsgHeader;
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
import com.afrAsia.entities.response.MastersDataResponse;
import com.afrAsia.entities.response.MastersDataResponse.Data;
import com.afrAsia.service.MasterDataService;

@Component
@Path("{version}")
public class MasterDataRestService {

	final static Logger debugLog = Logger.getLogger("debugLogger");
	final static Logger infoLog = Logger.getLogger("infoLogger");
	final static Logger errorLog = Logger.getLogger("errorLogger");

	private MasterDataService masterDataService;

	public MasterDataService getMasterDataService() {
		return masterDataService;
	}

	public void setMasterDataService(MasterDataService masterDataService) {
		this.masterDataService = masterDataService;
	}

	@GET
	@Path("/getMasters")
	@Produces(MediaType.APPLICATION_JSON)

	public Response getMasters() {

		infoLog.info("Enter in getMasters service");

		MastersDataResponse mastersDataResponse = new MastersDataResponse();
		MsgHeader msgHeader = new MsgHeader();
		Data data = new MastersDataResponse().new Data();
		List<MastersDataResponse.Data.AccountClass> accountClassResList = new ArrayList<>();
		List<MastersDataResponse.Data.Category> categoryResList = new ArrayList<>();
		List<MastersDataResponse.Data.Country> countryResList = new ArrayList<>();
		List<MastersDataResponse.Data.Employment> employmentResList = new ArrayList<>();
		List<MastersDataResponse.Data.MaritalStatus> maritalStatusResList = new ArrayList<>();
		List<MastersDataResponse.Data.RMDetails> rmDetailsResList = new ArrayList<>();
		List<MastersDataResponse.Data.Title> titlesResList = new ArrayList<>();
		List<MastersDataResponse.Data.UIDType> uidTypeResList = new ArrayList<>();
		List<MastersDataResponse.Data.AccountType> accountTypeList = new ArrayList<>();
		List<MastersDataResponse.Data.AfrAsiaFirst> afrAsiaFirstList = new ArrayList<>();
		List<MastersDataResponse.Data.Bank> bankResList = new ArrayList<>();
		List<MastersDataResponse.Data.Hobby> hobbyResList = new ArrayList<>();

		try {

			List<Country> countryList = masterDataService.getCountryList();
			List<AccountClass> accountClassList = masterDataService.getAccountClass();
			List<CategoryMaster> catList = masterDataService.getCategoryList();
			List<Employment> employmentList = masterDataService.getEmployment();
			List<MaritalStatus> maritalStatusList = masterDataService.getMaritalStatus();
			List<Prefix> prefixList = masterDataService.getPrefix();
			List<RMDetails> rmDetailsList = masterDataService.getRMDetails();
			List<UIDType> uidTypeList = masterDataService.getUIDType();
			List<AccountType> accTypeList = masterDataService.getAccountType();
			List<AfrAsiaFirst> afrAsiaFstList = masterDataService.getAfrAsiaFirst();
			List<Bank> bankList = masterDataService.getBankList();
			List<Hobby> hobbyList = masterDataService.getHobbyList();

			for (AfrAsiaFirst afrAsiaFirst : afrAsiaFstList) {
				com.afrAsia.entities.response.MastersDataResponse.Data.AfrAsiaFirst afrAsiaFrst = new MastersDataResponse().new Data().new AfrAsiaFirst();
				afrAsiaFrst.setId(afrAsiaFirst.getId());
				afrAsiaFrst.setDescription(afrAsiaFirst.getDescription());
				afrAsiaFrst.setAdditionalField(afrAsiaFirst.getAdditionalField());
				afrAsiaFirstList.add(afrAsiaFrst);

			}
			data.setAfrAsiaFirst(afrAsiaFirstList);

			for (AccountType accountType : accTypeList) {
				com.afrAsia.entities.response.MastersDataResponse.Data.AccountType accTypeRes = new MastersDataResponse().new Data().new AccountType();
				accTypeRes.setName(accountType.getName());
				accTypeRes.setResident(accountType.getResident());
				accTypeRes.setNonResident(accountType.getNonResident());
				accountTypeList.add(accTypeRes);

			}
			data.setAccountType(accountTypeList);

			for (Country country : countryList) {
				com.afrAsia.entities.response.MastersDataResponse.Data.Country countryRes = new MastersDataResponse().new Data().new Country();
				countryRes.setCountryCode(country.getCountryCode());
				countryRes.setDescription(country.getDescription());
				countryRes.setCallingCode(country.getCallingCode());
				countryRes.setDialingCode(country.getDialingCode());
				countryResList.add(countryRes);

			}
			data.setCountry(countryResList);
			for (AccountClass accountClass : accountClassList) {
				com.afrAsia.entities.response.MastersDataResponse.Data.AccountClass accRes = new MastersDataResponse().new Data().new AccountClass();
				accRes.setAcClassType(accountClass.getAcClassType());
				accRes.setAccountClass(accountClass.getAccountClass());
				accRes.setDescription(accountClass.getDescription());
				accountClassResList.add(accRes);
			}
			data.setAccountClass(accountClassResList);
			for (CategoryMaster category : catList) {
				com.afrAsia.entities.response.MastersDataResponse.Data.Category categoryRes = new MastersDataResponse().new Data().new Category();
				categoryRes.setCustCat(category.getCustCat());
				categoryRes.setCustCatDesc(category.getCustCatDesc());
				categoryResList.add(categoryRes);

			}
			data.setCategory(categoryResList);
			for (Employment employment : employmentList) {
				com.afrAsia.entities.response.MastersDataResponse.Data.Employment employmentRes = new MastersDataResponse().new Data().new Employment();
				employmentRes.setCode(employment.getCode());
				employmentRes.setDescription(employment.getDescription());
				employmentResList.add(employmentRes);
			}
			data.setEmployment(employmentResList);
			for (MaritalStatus maritalStatus : maritalStatusList) {
				com.afrAsia.entities.response.MastersDataResponse.Data.MaritalStatus maritalStatusRes = new MastersDataResponse().new Data().new MaritalStatus();
				maritalStatusRes.setCode(maritalStatus.getCode());
				maritalStatusRes.setDescription(maritalStatus.getDescription());
				maritalStatusResList.add(maritalStatusRes);
			}
			data.setMaritalStatus(maritalStatusResList);

			for (Prefix prefix : prefixList) {
				com.afrAsia.entities.response.MastersDataResponse.Data.Title titleRes = new MastersDataResponse().new Data().new Title();
				titleRes.setBranchCode(prefix.getBranchCode());
				titleRes.setPrefix1(prefix.getPrefix1());
				titleRes.setPrefix2(prefix.getPrefix2());
				titleRes.setPrefix3(prefix.getPrefix3());
				titlesResList.add(titleRes);
			}
			data.setTitle(titlesResList);
			for (RMDetails rmDetails : rmDetailsList) {
				com.afrAsia.entities.response.MastersDataResponse.Data.RMDetails rmDetailsRes = new MastersDataResponse().new Data().new RMDetails();
				rmDetailsRes.setRmId(rmDetails.getId());
				rmDetailsRes.setRmName(rmDetails.getRmName());
				rmDetailsResList.add(rmDetailsRes);

			}
			data.setRmDetails(rmDetailsResList);

			for (UIDType uidType : uidTypeList) {
				com.afrAsia.entities.response.MastersDataResponse.Data.UIDType uidTypeRes = new MastersDataResponse().new Data().new UIDType();
				uidTypeRes.setTypeValue(uidType.getTypeValue());
				uidTypeResList.add(uidTypeRes);

			}
			data.setUidType(uidTypeResList);

			for (Bank bank : bankList) {
				com.afrAsia.entities.response.MastersDataResponse.Data.Bank bankRes = new MastersDataResponse().new Data().new Bank();
				bankRes.setBankCode(bank.getBankCode());
				bankRes.setBankName(bank.getBankName());
				bankResList.add(bankRes);

			}
			data.setBank(bankResList);

			for (Hobby hobby : hobbyList) {
				com.afrAsia.entities.response.MastersDataResponse.Data.Hobby hobbyRes = new MastersDataResponse().new Data().new Hobby();
				hobbyRes.setHobbyCode(hobby.getHobbyCode());
				hobbyRes.setHobbyName(hobby.getHobbyName());
				hobbyResList.add(hobbyRes);
			}
			data.setHobby(hobbyResList);

			
			mastersDataResponse.setMsgHeader(msgHeader);
			mastersDataResponse.setData(data);

			debugLog.debug("mastersDataResponse :: " + mastersDataResponse.toString());

		} catch (Exception e) {
			errorLog.error(" Exception in getMasters service is : ", e);
			MsgHeader msgHeader1 = new MsgHeader();
			MsgHeader.Error error = msgHeader1.new Error();
			error.setCd("404");
			error.setCustomCode("ERROR404");
			error.setRsn("Master data service failing");
			msgHeader1.setError(error);
			mastersDataResponse.setMsgHeader(msgHeader1);
			mastersDataResponse.setData(null);
		}
		infoLog.info("Exit from getMasters service");
		debugLog.debug(" mastersDataResponse in getMasters service :: " + mastersDataResponse);

		return Response.ok(mastersDataResponse, MediaType.APPLICATION_JSON).build();
	}
}
