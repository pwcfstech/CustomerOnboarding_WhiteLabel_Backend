package com.afrAsia.entities.masters;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MOB_FLEX_MASTER_HOBBY")
public class Hobby extends BaseMaster implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "HOBBY_CODE")
	private String hobbyCode;												

	@Column(name = "HOBBY_NAME")
	private String hobbyName;

	public String getHobbyCode() {
		return hobbyCode;
	}

	public void setHobbyCode(String hobbyCode) {
		this.hobbyCode = hobbyCode;
	}

	public String getHobbyName() {
		return hobbyName;
	}

	public void setHobbyName(String hobbyName) {
		this.hobbyName = hobbyName;
	}

	@Override
	public String toString() {
		return "Hobby [hobbyCode=" + hobbyCode + ", hobbyName=" + hobbyName + "]";
	}

}
