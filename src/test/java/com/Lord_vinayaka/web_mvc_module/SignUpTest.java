package com.Lord_vinayaka.web_mvc_module;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.Lord_vinayaka.web_mvc_module.controller.RegisterController;
import com.Lord_vinayaka.web_mvc_module.service.SignUpService;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;



@SpringBootTest
@AutoConfigureMockMvc
public class SignUpTest {
	
	@Autowired
	private MockMvc mvc;
	@MockBean
	private SignUpService signupservice;
	@Test
	public void test() throws Exception {
		mvc.perform(get("/signup"))
				.andExpect(status().isOk())
				.andExpect(view().name("signuppage"))
				.andExpect(model().attributeExists("key"));
				
	
		

	
	

	}
}
