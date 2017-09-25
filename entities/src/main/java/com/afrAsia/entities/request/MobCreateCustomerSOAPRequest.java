package com.afrAsia.entities.request;

import java.io.Serializable;

import com.afrAsia.entities.transactions.MobAccountAdditionalDetail;
import com.afrAsia.entities.transactions.MobAccountDetail;
import com.afrAsia.entities.transactions.MobApplicantAdditionalDtl;
import com.afrAsia.entities.transactions.MobApplicantCommDetail;
import com.afrAsia.entities.transactions.MobApplicantEmploymentDtl;
import com.afrAsia.entities.transactions.MobApplicantPersonalDetail;
import com.afrAsia.entities.transactions.MobRmAppRefId;

public class MobCreateCustomerSOAPRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3684569426977859505L;
	
	private MobRmAppRefId mobRmAppRefId;
	private MobApplicantPersonalDetail mobApplicantPersonalDetail;
	private MobApplicantCommDetail	   mobApplicantCommDetail;
	private MobApplicantAdditionalDtl  mobApplicantAdditionalDtl;
	private MobApplicantEmploymentDtl  mobApplicantEmploymentDtl;
	private MobAccountDetail		   mobAccountDetail;
	private MobAccountAdditionalDetail mobAccountAdditionalDetail;
	
	
		
	public MobRmAppRefId getMobRmAppRefId() {
		return mobRmAppRefId;
	}
	public void setMobRmAppRefId(MobRmAppRefId mobRmAppRefId) {
		this.mobRmAppRefId = mobRmAppRefId;
	}
	
	public MobApplicantPersonalDetail getMobApplicantPersonalDetail() {
		return mobApplicantPersonalDetail;
	}
	public void setMobApplicantPersonalDetail(MobApplicantPersonalDetail mobApplicantPersonalDetail) {
		this.mobApplicantPersonalDetail = mobApplicantPersonalDetail;
	}
	public MobApplicantCommDetail getMobApplicantCommDetail() {
		return mobApplicantCommDetail;
	}
	public void setMobApplicantCommDetail(MobApplicantCommDetail mobApplicantCommDetail) {
		this.mobApplicantCommDetail = mobApplicantCommDetail;
	}
	public MobApplicantAdditionalDtl getMobApplicantAdditionalDtl() {
		return mobApplicantAdditionalDtl;
	}
	public void setMobApplicantAdditionalDtl(MobApplicantAdditionalDtl mobApplicantAdditionalDtl) {
		this.mobApplicantAdditionalDtl = mobApplicantAdditionalDtl;
	}
	public MobApplicantEmploymentDtl getMobApplicantEmploymentDtl() {
		return mobApplicantEmploymentDtl;
	}
	public void setMobApplicantEmploymentDtl(MobApplicantEmploymentDtl mobApplicantEmploymentDtl) {
		this.mobApplicantEmploymentDtl = mobApplicantEmploymentDtl;
	}
	public MobAccountDetail getMobAccountDetail() {
		return mobAccountDetail;
	}
	public void setMobAccountDetail(MobAccountDetail mobAccountDetail) {
		this.mobAccountDetail = mobAccountDetail;
	}
	public MobAccountAdditionalDetail getMobAccountAdditionalDetail() {
		return mobAccountAdditionalDetail;
	}
	public void setMobAccountAdditionalDetail(MobAccountAdditionalDetail mobAccountAdditionalDetail) {
		this.mobAccountAdditionalDetail = mobAccountAdditionalDetail;
	}
	
	
	
	

	

}
