package com.Lord_vinayaka.web_mvc_module.dto;

import org.antlr.v4.runtime.misc.NotNull;

public class SignUp {
	
	public String name;
	public String surname;
	public String motherName;
	public String fatherName;
	public String villege;
	public String zipcode;
	public String email;
	public long phonenumber;
	public String username;
	public String password;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getVillege() {
		return villege;
	}
	public void setVillege(String villege) {
		this.villege = villege;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
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
	public SignUp(String name, String surname, String motherName, String fatherName, String villege, String zipcode,
			String email, long phonenumber, String username, String password) {
		super();
		this.name = name;
		this.surname = surname;
		this.motherName = motherName;
		this.fatherName = fatherName;
		this.villege = villege;
		this.zipcode = zipcode;
		this.email = email;
		this.phonenumber = phonenumber;
		this.username = username;
		this.password = password;
	}
	public SignUp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
