package com.Lord_vinayaka.web_mvc_module.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class HomePageController {
	
	@GetMapping("/")
	public String homepageDisplay() {
		return "homepage";
	}

}
