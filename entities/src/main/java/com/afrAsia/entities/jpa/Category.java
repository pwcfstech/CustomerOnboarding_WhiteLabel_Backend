package com.afrAsia.entities.jpa;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Table;

import com.afrAsia.entities.base.BaseEntity;
import com.afrAsia.entities.listener.EntityListener;

@Entity
@Table(name = "MOB_FLEX_MASTER_CUST_CATEGORY")
@EntityListeners(value = { EntityListener.class })
public class Category extends BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Column(name = "CATEGORY_NAME")
	private String categoryName;
	@Column(name = "CUST_CAT")
	private String custCat;
	@Column(name = "CUST_CAT_DESC")
	private String custCatDesc;

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

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
}
