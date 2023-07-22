package com.springboot.assignmenttwo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BankController {
	@RequestMapping("/getBranches")

	public String getBankBranches() {
		return "Branches.html";
	}

	@RequestMapping("/getServices")
	public String getBankServices() {
		return "Services.html";
	}
}
