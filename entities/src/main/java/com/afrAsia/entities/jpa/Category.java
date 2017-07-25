package com.afrAsia.entities.jpa;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Table;

import com.afrAsia.entities.base.BaseEntity;
import com.afrAsia.entities.listener.EntityListener;

@Entity
@Table(name = "MOB_PROD_CATEGORY_MASTER")
@EntityListeners(value = { EntityListener.class })
public class Category extends BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "CATEGORY_NAME")
	private String categoryName;
	@Column(name = "CATEGORY_DESCRIPTION")
	private String categoryDescription;

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCategoryDescription() {
		return categoryDescription;
	}

	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}

	@Override
	public String toString() {
		return "Category [categoryName=" + categoryName + ", categoryDescription=" + categoryDescription + "]";
	}

}
