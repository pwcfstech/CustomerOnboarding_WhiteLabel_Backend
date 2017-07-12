package com.afrAsia.entities.masters;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MOB_FLEX_MASTER_CUST_CATEGORY")
public class CategoryMaster extends BaseMaster  implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "CUST_CAT")
	private String custCat;
	@Column(name = "CUST_CAT_DESC")
	private String custCatDesc;

	public String getCustCatDesc() {
		return custCatDesc;
	}

	public void setCustCatDesc(String custCatDesc) {
		this.custCatDesc = custCatDesc;
	}

	public String getCustCat() {
		return custCat;
	}

	public void setCustCat(String custCat) {
		this.custCat = custCat;
	}

	@Override
	public String toString() {
		return "Category [custCat=" + custCat + ", custCatDesc=" + custCatDesc + "]";
	}
	
}
