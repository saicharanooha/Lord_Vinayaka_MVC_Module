package com.Lord_vinayaka.web_mvc_module.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "user_sign_up_credentials")
public class UserSignUpCredentials {
	@Id
	public long id;
	@Column(name = "user_name") 
	public String username;
	@Column(name = "email")
	public String password;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
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
	public UserSignUpCredentials(long id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}
	public UserSignUpCredentials() {
		super();
		// TODO Auto-generated constructor stub
	}
		

}
