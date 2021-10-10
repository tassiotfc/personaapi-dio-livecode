package com.person;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class PersonaapiApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(PersonaapiApplication.class, args);
	}
}