package com.mydata.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Homecontroller {
	@GetMapping("/home")
	public String showhome() {
		return "home.html";

	}

	
}
