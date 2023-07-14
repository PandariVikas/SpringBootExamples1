package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
	@GetMapping("/home")
	public String homePage() {
		return "homepage";
	}
	@GetMapping("/welcome")
	public String welcomePage() {
		return "welcomepage";
	}
	@GetMapping("/admin")
	public String adminPage() {
		return "adminpage";
	}
	@GetMapping("/employee")
	public String empPage() {
		return "emppage";
	}
	@GetMapping("/mgr")
	public String mgrPage() {
		return "mgrpage";
	}
	@GetMapping("/common")
	public String commonPage() {
		return "commonpage";
	}
	@GetMapping("logout")
	public String logoutPage() {
		return "logoutpage";
	}
}
