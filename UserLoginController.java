package com.mydata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.mydata.model.User;
import com.mydata.service.UserService;

@Controller
public class UserLoginController {
	@Autowired
	private UserService userService;

	@GetMapping("/login")
	public String showLoginPage(Model model) {
		User u = new User();

		model.addAttribute("user", u);

		return "Login.html";

	}

	@PostMapping("/login")
	public String LoginUser(@ModelAttribute("user") User user, Model model) {
		if (userService.isValidUser(user)) {
			return "redirect:/home";
		} else {

			model.addAttribute("error", "Invalid Username/Password");
			return "Login.html";
		}

	}
}
