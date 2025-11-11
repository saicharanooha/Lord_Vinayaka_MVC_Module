package com.Lord_vinayaka.web_mvc_module.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
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
	private JavaMailSender sender;
	
	@Autowired
	private SignupUserCred signupcred;
	public UserSignUpCredentials save(SignUp signup ) {
		
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
	@Async
	public void sendMessage(SignUp signup,UserSignUpCredentials result) {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo(signup.getEmail());
		message.setSubject("Welcome to GokulKrishna Youth Team — Sign-Up Successful!");

		message.setText(
		    "Dear " + signup.getName() + ",\n\n" +
		    "Congratulations! Your registration with the GokulKrishna Youth Team was successful.\n\n" +
		    "Here are your account details:\n\n" +
		    "   •  User ID: " + result.getId() + "\n" +
		    "   •  Temporary Password: " + result.getPassword() + "\n\n" +
		    "Please keep this information secure and do not share it with anyone.\n" +
		    "You can now log in to your account and start exploring the features available to you.\n\n" +
		    "If you have any questions or need assistance, feel free to contact our support team.\n\n" +
		    "Warm regards,\n" +
		    "GokulKrishna Youth Team\n" +
		    "--------------------------------------------\n" +
		    "This is an automated message. Please do not reply to this email."
		);


			sender.send(message);
	}

}
