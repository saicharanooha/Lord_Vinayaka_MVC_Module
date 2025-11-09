package com.Lord_vinayaka.web_mvc_module.controller;

import java.util.List;

import javax.security.auth.login.AccountNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.Lord_vinayaka.web_mvc_module.dto.LogIn;
import com.Lord_vinayaka.web_mvc_module.exceptions.UserNotFoundException;
import com.Lord_vinayaka.web_mvc_module.repository.SignupUserCred;
import com.Lord_vinayaka.web_mvc_module.service.LogInService;

@Controller
public class LogInController {
	@Autowired
	private LogInService loginService;
	@GetMapping("/loginpwd")
	public ModelAndView loginWithUsernameAndPassword() {
		ModelAndView view= new ModelAndView();
		view.addObject("key", new LogIn());
		view.setViewName("loginwithpwd");
		return view;
	}
	@GetMapping("/loginwithotp")
	public ModelAndView LogInWithOtp() {
		ModelAndView view = new ModelAndView();
		view.addObject("key", new com.Lord_vinayaka.web_mvc_module.dto.LogInWithOTP());
		view.setViewName("loginwithotp");
		return view;
		
	}
	@PostMapping("/loginwithpwd")
	public ModelAndView loginWithPwd(@ModelAttribute("key")LogIn login) throws AccountNotFoundException  {
		
		boolean status=loginService.validateAccount(login);//  checks account exists or not 
		
		if(status) { // if account exists
			boolean check=loginService.checkPwd(login);// checks password 
			if(check){ //if password is correct
		    ModelAndView view=  new ModelAndView();
		    view.addObject("key", "Welcome"+login.getId());
		    view.setViewName("welcome_login_page");
		    return view;
			}
			else {// if password is incorrect
				
				ModelAndView view=  new ModelAndView();
			    view.addObject("key", "Please EnterValid id and password");
			    view.setViewName("try_again_login");
			    return view;
			}
		   }
		
		else {
			throw new UserNotFoundException("User Credentials not found");
		}
		
		
		
		
		
		
		
	}
		

}
