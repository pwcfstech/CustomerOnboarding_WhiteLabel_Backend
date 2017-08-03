package com.afrAsia.entities.masters;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MOB_FLEX_MASTER_AFRASIA_FIRST")
public class AfrAsiaFirst extends BaseMaster implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID")
	private String id;

	@Column(name = "DESCRIPTION")
	private String description;

	@Column(name = "ADDN_FIELD")
	private String additionalField;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAdditionalField() {
		return additionalField;
	}

	public void setAdditionalField(String additionalField) {
		this.additionalField = additionalField;
	}

	@Override
	public String toString() {
		return "AfrAsiaFirst [id=" + id + ", description=" + description + ", additionalField=" + additionalField + "]";
	}

}
