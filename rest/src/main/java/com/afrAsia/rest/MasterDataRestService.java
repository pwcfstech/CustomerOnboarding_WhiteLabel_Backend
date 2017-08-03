package com.afrAsia.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Component;

import com.afrAsia.Utils.AfrAsiaLogger;
import com.afrAsia.entities.jpa.MsgHeader;
import com.afrAsia.entities.masters.AccountClass;
import com.afrAsia.entities.masters.AccountType;
import com.afrAsia.entities.masters.AfrAsiaFirst;
import com.afrAsia.entities.masters.CategoryMaster;
import com.afrAsia.entities.masters.Country;
import com.afrAsia.entities.masters.Employment;
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
	
	public  Response getMasters(){
		
		MastersDataResponse mastersDataResponse=new MastersDataResponse();
		MsgHeader msgHeader= new MsgHeader();
		Data data= new MastersDataResponse().new Data();
		List<MastersDataResponse.Data.AccountClass> accountClassResList =new ArrayList<>() ;
		List<MastersDataResponse.Data.Category> categoryResList =new ArrayList<>() ;
		List<MastersDataResponse.Data.Country> countryResList =new ArrayList<>() ;
		List<MastersDataResponse.Data.Employment> employmentResList =new ArrayList<>() ;
		List<MastersDataResponse.Data.MaritalStatus> maritalStatusResList =new ArrayList<>() ;
		List<MastersDataResponse.Data.RMDetails> rmDetailsResList =new ArrayList<>() ;
		List<MastersDataResponse.Data.Title> titlesResList =new ArrayList<>() ;
		List<MastersDataResponse.Data.UIDType> uidTypeResList =new ArrayList<>() ;
		List<MastersDataResponse.Data.AccountType> accountTypeList =new ArrayList<>() ;
		List<MastersDataResponse.Data.AfrAsiaFirst> afrAsiaFirstList =new ArrayList<>() ;
		
		try{
		
		List<Country> countryList=masterDataService.getCountryList();
		List<AccountClass> accountClassList=masterDataService.getAccountClass();
		List<CategoryMaster> catList=masterDataService.getCategoryList();
		List<Employment> employmentList=masterDataService.getEmployment();
		List<MaritalStatus> maritalStatusList=masterDataService.getMaritalStatus();
		List<Prefix> prefixList=masterDataService.getPrefix();
		List<RMDetails> rmDetailsList=masterDataService.getRMDetails();
		List<UIDType> uidTypeList=masterDataService.getUIDType();
		List<AccountType> accTypeList=masterDataService.getAccountType();
		List<AfrAsiaFirst> afrAsiaFstList=masterDataService.getAfrAsiaFirst();
		
		for( AfrAsiaFirst afrAsiaFirst : afrAsiaFstList){
			//System.out.println(rmDetails);
			com.afrAsia.entities.response.MastersDataResponse.Data.AfrAsiaFirst afrAsiaFrst= new MastersDataResponse().new Data().new AfrAsiaFirst(); 
			afrAsiaFrst.setId(afrAsiaFirst.getId());
			afrAsiaFrst.setDescription(afrAsiaFirst.getDescription());
			afrAsiaFrst.setAdditionalField(afrAsiaFirst.getAdditionalField());
			afrAsiaFirstList.add(afrAsiaFrst);
			
			}
		data.setAfrAsiaFirst(afrAsiaFirstList);
		
		for( AccountType accountType : accTypeList){
			//System.out.println(rmDetails);
			com.afrAsia.entities.response.MastersDataResponse.Data.AccountType accTypeRes= new MastersDataResponse().new Data().new AccountType();
			accTypeRes.setName(accountType.getName());
			accTypeRes.setResident(accountType.getResident());
			accTypeRes.setNonResident(accountType.getNonResident());
			accountTypeList.add(accTypeRes);
			
			}
		data.setAccountType(accountTypeList);
		
		for( Country country : countryList){
			System.out.println(country);
			com.afrAsia.entities.response.MastersDataResponse.Data.Country countryRes= new MastersDataResponse().new Data().new Country();
			countryRes.setCountryCode(country.getCountryCode());
			countryRes.setDescription(country.getDescription());
			countryRes.setCallingCode(country.getCallingCode());
			countryRes.setDialingCode(country.getDialingCode());
			countryResList.add(countryRes);
			
			}
		data.setCountry(countryResList);
		for( AccountClass accountClass : accountClassList){
			System.out.println(accountClass);
			com.afrAsia.entities.response.MastersDataResponse.Data.AccountClass accRes= new MastersDataResponse().new Data().new AccountClass();
			accRes.setAcClassType(accountClass.getAcClassType());
			accRes.setAccountClass(accountClass.getAccountClass());
			accRes.setDescription(accountClass.getDescription());
			accountClassResList.add(accRes);
			}
		data.setAccountClass(accountClassResList);
		for( CategoryMaster category : catList){
			System.out.println(category);
			com.afrAsia.entities.response.MastersDataResponse.Data.Category categoryRes= new MastersDataResponse().new Data().new Category();
			categoryRes.setCustCat(category.getCustCat());
			categoryRes.setCustCatDesc(category.getCustCatDesc());
			categoryResList.add(categoryRes);
			
			}
		data.setCategory(categoryResList);
		for( Employment employment : employmentList){
			System.out.println(employment);
			com.afrAsia.entities.response.MastersDataResponse.Data.Employment employmentRes= new MastersDataResponse().new Data().new Employment();
			employmentRes.setCode(employment.getCode());
			employmentRes.setDescription(employment.getDescription());
			employmentResList.add(employmentRes);
			}
		data.setEmployment(employmentResList);
		for( MaritalStatus maritalStatus : maritalStatusList){
			System.out.println(maritalStatus);
			com.afrAsia.entities.response.MastersDataResponse.Data.MaritalStatus maritalStatusRes= new MastersDataResponse().new Data().new MaritalStatus();
			maritalStatusRes.setCode(maritalStatus.getCode());
			maritalStatusRes.setDescription(maritalStatus.getDescription());
			maritalStatusResList.add(maritalStatusRes);
			}
		data.setMaritalStatus(maritalStatusResList);
		
		for( Prefix prefix : prefixList){
			System.out.println(prefix);
			com.afrAsia.entities.response.MastersDataResponse.Data.Title titleRes= new MastersDataResponse().new Data().new Title();
			titleRes.setBranchCode(prefix.getBranchCode());
			titleRes.setPrefix1(prefix.getPrefix1());
			titleRes.setPrefix2(prefix.getPrefix2());
			titleRes.setPrefix3(prefix.getPrefix3());
			titlesResList.add(titleRes);
			}
		data.setTitle(titlesResList);
		for( RMDetails rmDetails : rmDetailsList){
			System.out.println(rmDetails);
			com.afrAsia.entities.response.MastersDataResponse.Data.RMDetails rmDetailsRes= new MastersDataResponse().new Data().new RMDetails();
			rmDetailsRes.setRmId(rmDetails.getId());
			rmDetailsRes.setRmName(rmDetails.getRmName());
			rmDetailsResList.add(rmDetailsRes);
			
			}
		data.setRmDetails(rmDetailsResList);
		
		for( UIDType uidType : uidTypeList){
			System.out.println(uidType);
			com.afrAsia.entities.response.MastersDataResponse.Data.UIDType uidTypeRes= new MastersDataResponse().new Data().new UIDType();
			uidTypeRes.setTypeValue(uidType.getTypeValue());
			uidTypeResList.add(uidTypeRes);
			
			}
		data.setUidType(uidTypeResList);
		System.out.println(data);
		mastersDataResponse.setMsgHeader(msgHeader);
		mastersDataResponse.setData(data);
		
		
		
		}catch(Exception e){
			AfrAsiaLogger.errorLog("Exception in MasterRest Service", e);
			System.out.println(" Error");
			e.printStackTrace();
			/*Error error= new MsgHeader().new Error();
			error.setCd("404");
			error.setCustomCode("101");
			error.setRsn("Master data service failing");
			msgHeader.setError(error);*/
			mastersDataResponse.setMsgHeader(msgHeader);
			mastersDataResponse.setData(null);
			
		}
		
		
		return Response.ok(mastersDataResponse, MediaType.APPLICATION_JSON).build();
		
		
		
	}
	

}
