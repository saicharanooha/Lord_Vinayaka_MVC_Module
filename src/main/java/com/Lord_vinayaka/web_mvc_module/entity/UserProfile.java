package com.Lord_vinayaka.web_mvc_module.entity;

import java.util.Random;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
public class UserProfile {
	@Id
	public int id;
	public Random random;
	public String name;
	public String surname;
	public String motherName;
	public String fatherName;
	public String villege;
	public String zipcode;
	public String email;
	public long phonenumber;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Random getRandom() {
		return random;
	}
	public void setRandom(Random random) {
		this.random = random;
	}
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
	public UserProfile(int id, Random random, String name, String surname, String motherName, String fatherName,
			String villege, String zipcode, String email, long phonenumber) {
		super();
		this.id = random.nextInt(70000, 79999);
		this.random = random;
		this.name = name;
		this.surname = surname;
		this.motherName = motherName;
		this.fatherName = fatherName;
		this.villege = villege;
		this.zipcode = zipcode;
		this.email = email;
		this.phonenumber = phonenumber;
	}
	public UserProfile() {
		super();
		this.random= new Random();
		this.id=random.nextInt(70000, 79999);
		
		// TODO Auto-generated constructor stub
	}
	
	
}

	


