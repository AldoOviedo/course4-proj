package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
	
	@GetMapping(value = "/")
	public String sayHello() {
		
		
		return "Welcome to spring boot with rest api developed in EC2 using JEnkins by Aldo";
	}

}
