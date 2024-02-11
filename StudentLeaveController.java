package com.mydata.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.mydata.model.StudentLeave;
import com.mydata.service.StudentLeaveService;

@Controller
public class StudentLeaveController {
	@Autowired
	StudentLeaveService sleavesevice;

	@GetMapping("/addsleave")
	public String openStudentLeaveForm(Model model) {
		StudentLeave s = new StudentLeave();
		model.addAttribute("Studentleave", s);
		return "studentleave.html";

	}

	@PostMapping("/addsleave")
	public String saveStudentLeave(@ModelAttribute("Studentleave") StudentLeave sleave) {
		sleavesevice.savestudentleave(sleave);
		return "home.html";

	}

	@GetMapping("/viewallstudentleaves")
	public String viewallleave(Model model) {
		List<StudentLeave> slive = sleavesevice.viewallstudentleave();
		model.addAttribute("studentleave", slive);
		return "allstudentleaves.html";

	}
	
}
