package com.Lord_vinayaka.web_mvc_module.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.Lord_vinayaka.web_mvc_module.dto.LogIn;
import com.Lord_vinayaka.web_mvc_module.repository.SignupUserCred;
import com.Lord_vinayaka.web_mvc_module.service.LoginService;

@Controller
public class LogInController {
	@Autowired
	private LoginService loginservice;
	@Autowired
	private LoginService login;
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
	public ModelAndView loginWithUsernameAndPassword(@ModelAttribute("key") LogIn login){
		boolean status=loginservice.validateLogIn(login);
		if(status) {
			ModelAndView view=	 new ModelAndView();
			view.addObject("result", "Hii user welcome to your account");
			view.setViewName("user_account");
			return view;
		}
		else {
			return new ModelAndView();
		}
		

			
		
	
		
	}
	

}
