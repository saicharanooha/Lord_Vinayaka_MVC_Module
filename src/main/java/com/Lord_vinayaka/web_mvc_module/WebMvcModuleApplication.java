package com.Lord_vinayaka.web_mvc_module;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class WebMvcModuleApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebMvcModuleApplication.class, args);
	}

}
