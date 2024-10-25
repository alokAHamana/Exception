package com.springboot.app.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ApiErrorModel {

	@Id
	private Integer errorCode;
	private String errorDes;
	private Date date;

	
	public ApiErrorModel(int i, String string, Date date2) {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Integer getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorDes() {
		return errorDes;
	}
	public void setErrorDes(String errorDes) {
		this.errorDes = errorDes;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
