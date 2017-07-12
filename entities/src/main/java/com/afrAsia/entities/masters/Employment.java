package com.afrAsia.entities.masters;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.Table;

import com.afrAsia.entities.listener.EntityListener;

@Entity
@Table(name = "MOB_FLEX_MASTER_EMPLOYMENT")
public class Employment extends BaseMaster implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Column(name = "Description")
	private String description;
	@Id
	@Column(name = "Code")
	private String code;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "Employment [description=" + description + ", code=" + code + "]";
	}
	
}
