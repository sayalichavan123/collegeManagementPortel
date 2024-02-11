package com.mydata.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.mydata.model.StudentMark;
import com.mydata.service.Studentmarkservice;

@Controller
public class StudentmarkController {
	@Autowired
	Studentmarkservice studentmarkservice;

	@GetMapping("/openaddmark")
	private String oppenaddmarkform(Model model) {
		StudentMark s = new StudentMark();
		model.addAttribute("smark", s);
		return "Addmarks.html";

	}

	@PostMapping("/openaddmark")
	public String addmarks(@ModelAttribute("smark") StudentMark studentMark) {
		studentmarkservice.addmarks(studentMark);
		return "Addmarks.html";

	}
	@GetMapping("/allmarks")
	public String showviewallmarks(Model model) {
		List<StudentMark>smark=studentmarkservice.viewallstudentmark();
		model.addAttribute("allmark", smark);
		return "allmarks.html";
		
	}

}
