package com.mobisoftinfotech.k8demo.controllers;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class GreetingController {

	@GetMapping("/")
	public String greet() {
		return "Greetings from Spring Boot! on " + new Date();
	}

}