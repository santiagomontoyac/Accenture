package com.accenture.model;

import java.io.Serializable;

public class ResponseDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer code;
	private String description; // description is a string that contains the name of the new state.
	private Integer idDescription; // idDescription is a integer that contains the id of the new state.


	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getIdDescription() {
		return idDescription;
	}

	public void setIdDescription(Integer idDescription) {
		this.idDescription = idDescription;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
