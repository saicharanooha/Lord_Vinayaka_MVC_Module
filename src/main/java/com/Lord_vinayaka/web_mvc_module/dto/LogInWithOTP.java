package com.Lord_vinayaka.web_mvc_module.dto;

public class LogInWithOTP {
	
	public String Username;

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public LogInWithOTP(String username) {
		super();
		Username = username;
	}

	public LogInWithOTP() {
		super();
		// TODO Auto-generated constructor stub
	}

}
