package com.Lord_vinayaka.web_mvc_module.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import com.Lord_vinayaka.web_mvc_module.exceptions.UserNotFoundException;

@ControllerAdvice
public class GlobalException {
	@ExceptionHandler(UserNotFoundException.class)
	public ModelAndView logInException(UserNotFoundException ex) {
		
		ModelAndView view= new ModelAndView();
		view.addObject("key", ex);
		view.setViewName("loginexception");
		return view;
	}

}
