package com.Lord_vinayaka.web_mvc_module.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
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
	@Autowired
	private JavaMailSender sender;
	
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
		SimpleMailMessage message = new SimpleMailMessage();
		ModelAndView view = new ModelAndView();
		view.addObject("key", result);
		view.setViewName("signupresult");
		message.setTo(signup.getEmail());
		message.setSubject("SignUp_Sucesss");
		message.setText(
			    "Hello " + signup.getName() + ",\n\n" +
			    "Thank you for signing up!\n\n" +
			    "Here are your account details:\n" +
			    "• Username: " + signup.getUsername() + "\n" +
			    "• Password: " + signup.getPassword() + "\n\n" +
			    "Please keep this information confidential.\n\n" +
			    "Regards,\n" +
			    "GokulKrishna Youth Team"
			);

			sender.send(message);
		
		return view;
		
		
		
		
		
		
		
	}
	
	

}
