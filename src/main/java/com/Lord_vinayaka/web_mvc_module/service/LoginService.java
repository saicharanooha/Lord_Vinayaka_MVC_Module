package com.Lord_vinayaka.web_mvc_module.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.Lord_vinayaka.web_mvc_module.dto.LogIn;
import com.Lord_vinayaka.web_mvc_module.entity.UserSignUpCredentials;
import com.Lord_vinayaka.web_mvc_module.repository.SignupUserCred;
@Controller
public class LoginService {
	@Autowired
	private SignupUserCred creds;
	public boolean validateLogIn(LogIn login) {
		UserSignUpCredentials cred=creds.findByEmail(login.getUsername());
     if (login.getUsername().equals(cred.getUsername()) && login.getPassword().equals(cred.getPassword())) {
    	 
		 return true;    
	} 
     else {
		  return false;
		}
		
		
		
		
	}

}
