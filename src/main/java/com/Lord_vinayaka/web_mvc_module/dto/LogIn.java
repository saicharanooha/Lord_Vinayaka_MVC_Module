package com.Lord_vinayaka.web_mvc_module.dto;

public class LogIn {
	
	public long id; ;
	public String password;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LogIn(long id, String password) {
		super();
		this.id = id;
		this.password = password;
	}
	public LogIn() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	

}
