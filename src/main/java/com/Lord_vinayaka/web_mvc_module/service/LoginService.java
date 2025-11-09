package com.Lord_vinayaka.web_mvc_module.service;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.Lord_vinayaka.web_mvc_module.*;
import com.Lord_vinayaka.web_mvc_module.dto.LogIn;
import com.Lord_vinayaka.web_mvc_module.entity.UserSignUpCredentials;
import com.Lord_vinayaka.web_mvc_module.exceptions.UserNotFoundException;
import com.Lord_vinayaka.web_mvc_module.repository.SignupUserCred;
@Controller
public class LoginService {
	@Autowired
	private SignupUserCred cred;
	public boolean validateAccount(LogIn login) {// checks account exists or not
		
		if(cred.existsById(login.getId())) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	
	public boolean checkPwd(LogIn login) {
		
		Optional<UserSignUpCredentials> check=cred.findById(login.getId());
		if(check.isPresent()) {
			
		
			if(check.get().getPassword().equals(login.getPassword())) {
				return true;
			}
			
	      }
			
		return false;
			
		

}
}