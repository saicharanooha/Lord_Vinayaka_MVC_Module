package com.Lord_vinayaka.web_mvc_module.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.Lord_vinayaka.web_mvc_module.dto.SignUp;
import com.Lord_vinayaka.web_mvc_module.entity.UserSignUpCredentials;
import com.Lord_vinayaka.web_mvc_module.service.SignUpService;
@Controller
public class RegisterController {
	@Autowired
	private SignUpService signupservice;
	
	@GetMapping("/signup")
	public ModelAndView signUpRequest() {
		ModelAndView view = new ModelAndView();
		view.addObject("key", new SignUp());
		view.setViewName("signuppage");
		return view;
	}
	@PostMapping("/signup")
	public ModelAndView signUpRequest(@ModelAttribute("key") SignUp signup) {
		
		UserSignUpCredentials result= signupservice.save(signup);
		ModelAndView view = new ModelAndView();
		view.addObject("key", result);
		view.setViewName("signupresult");
		return view;
		
		
		
		
		
		
	}
	
	

}
