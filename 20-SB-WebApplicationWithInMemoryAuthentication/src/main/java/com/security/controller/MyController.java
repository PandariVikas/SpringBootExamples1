package com.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping("/home")
	public String home() {
		return "Welcome to Home page";
	}
	@GetMapping("/balance")
	public String balance() {
		return "Your current Bank balance is INR 10000";
	}
	@GetMapping("/statement")
	public String statement() {
		return "Statement generated and sent to you your email Id";
	}
	@GetMapping("/loan")
	public String loan() {
		return "Your loan Amount is INR 9000.00";
	}
	@GetMapping("/contact")
	public String contact() {
		return "Thank You for contacting customer care";
	}
}
