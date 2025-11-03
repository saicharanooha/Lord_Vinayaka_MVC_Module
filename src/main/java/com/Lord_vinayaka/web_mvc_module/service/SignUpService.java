package com.Lord_vinayaka.web_mvc_module.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.Lord_vinayaka.web_mvc_module.dto.SignUp;
import com.Lord_vinayaka.web_mvc_module.entity.UserProfile;
import com.Lord_vinayaka.web_mvc_module.entity.UserSignUpCredentials;
import com.Lord_vinayaka.web_mvc_module.repository.SignupRepo;
import com.Lord_vinayaka.web_mvc_module.repository.SignupUserCred;
@Controller
public class SignUpService {
	@Autowired
	private SignupRepo signuprepo;
	
	@Autowired
	private SignupUserCred signupcred;
	public UserSignUpCredentials save(SignUp signup) {
		
		UserProfile  profile= new UserProfile();
		profile.setName(signup.getName());
		profile.setSurname(signup.getSurname());
		profile.setMotherName(signup.getMotherName());
		profile.setFatherName(signup.getFatherName());
		profile.setVillege(signup.getVillege());
		profile.setZipcode(signup.getZipcode());
		profile.setEmail(signup.getEmail());
		profile.setPhonenumber(signup.getPhonenumber());
		signuprepo.save(profile);
		UserSignUpCredentials cred= new UserSignUpCredentials();
		cred.setId(profile.getId());
		cred.setUsername(signup.getUsername());
		cred.setPassword(signup.getPassword());
		 return signupcred.save(cred);
		
		
		
		
		
		
	}

}
