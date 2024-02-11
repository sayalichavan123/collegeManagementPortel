package com.mydata.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.mydata.model.Student;
import com.mydata.model.Teacher;
import com.mydata.service.TeacherService;

@Controller
public class TeacherController {
	@Autowired
	TeacherService teacherService;

	@GetMapping("/addteacher")
	public String openaddteacherform(Model model) {
		Teacher t = new Teacher();
		model.addAttribute("Teacher", t);
		return "addteacher.html";

	}

	@PostMapping("/addteacher")
	public String saveTeacher(@ModelAttribute("Teacher") Teacher teacher) {
		teacherService.saveteacher(teacher);
		return "addteacher.html";

	}

	@GetMapping("/getteacher")
	public String viewallTeacher(Model model) {
		List<Teacher> teacherlist = teacherService.viewallteacher();
		model.addAttribute("allteachers", teacherlist);
		return "Teachers.html";

	}

	@GetMapping("/deleteteacher/{id}")
	public String deleteTeacherbyid(@PathVariable int id) {
		teacherService.deleteTeacherbyid(id);
		return "redirect:/getteacher";

	}

	@GetMapping("teacher/edit/{id}")
	public String UpdateTeacher(@PathVariable int id, Model model) {
		Teacher tech = teacherService.getteacherbyid(id);
		model.addAttribute("teacher", tech);
		return "editteacher.html";

	}

	@PostMapping("/teacher/edit/{id}")

	public String editStudent(@PathVariable int id, @ModelAttribute("teacher") Teacher t, Model model) {
		Teacher existingteacher = teacherService.getteacherbyid(id);
		existingteacher.setFirstName(t.getFirstName());
		existingteacher.setMiddleName(t.getMiddleName());
		existingteacher.setLastName(t.getLastName());
		existingteacher.setAddress(t.getAddress());
		existingteacher.setPhone(t.getPhone());
		existingteacher.setEmail(t.getEmail());
		existingteacher.setClassXper(t.getClassXper());
		existingteacher.setClassXiiper(t.getClassXiiper());
		existingteacher.setDob(t.getDob());
		existingteacher.setAdharNo(t.getAdharNo());
		existingteacher.setEducation(t.getEducation());
		existingteacher.setDepartment(t.getDepartment());

		teacherService.updateTeacher(existingteacher);
		return "redirect:/getteacher";
	}
	

}