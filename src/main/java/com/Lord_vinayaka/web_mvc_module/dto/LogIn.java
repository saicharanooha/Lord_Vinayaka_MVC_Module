package com.Lord_vinayaka.web_mvc_module.dto;

public class LogIn {
	
	public String username;
	public String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LogIn(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public LogIn() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
