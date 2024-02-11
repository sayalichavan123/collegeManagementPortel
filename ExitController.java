package com.mydata.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExitController {
	@GetMapping("/exit")
	public String ExitfromSession() {
		return "Login.html";

	}
}
