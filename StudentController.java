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
import com.mydata.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	private StudentService studentService;

	@GetMapping("/addstudent")
	public String openaddstudForm(Model model) {
		Student s = new Student();
		model.addAttribute("stud", s);
		return "addstudent.html";

	}

	@PostMapping("/addstudent")
	public String saveStudent(@ModelAttribute("stud") Student student) {
		studentService.saveStudent(student);
		return "home.html";

	}

	@GetMapping("/getallstudent")
	public String viewAllStudents(Model model) {
		List<Student> slist = studentService.viewallstudent();
		model.addAttribute("Stud", slist);
		Student s=new Student();
		model.addAttribute("employee", s);
		return "students.html";
	}

	@GetMapping("/student/{id}")
	public String deletestudentbyid(@PathVariable int id) {
		studentService.deleteStudentbyid(id);
		return "redirect:/getallstudent";

	}

	@GetMapping("/student/edit/{id}")
	public String openEditStudentForm(@PathVariable int id, Model model) {
		Student stubyid = studentService.getstudentbyid(id);
		model.addAttribute("Student", stubyid);
		return "Updatestudent.html";
	}

	@PostMapping("/student/{id}")
	public String editStudent(@PathVariable int id, @ModelAttribute("Student") Student student, Model model) {
		Student existingStudent = studentService.getstudentbyid(id);
		existingStudent.setName(student.getName());
		existingStudent.setMiddlename(student.getMiddlename());
		existingStudent.setLastname(student.getLastname());
		existingStudent.setAddress(student.getAddress());
		existingStudent.setAdharno(student.getAdharno());
		existingStudent.setBranch(student.getBranch());
		existingStudent.setClassxper(student.getClassxper());
		existingStudent.setClassxiiper(student.getClassxiiper());
		existingStudent.setCourse(student.getCourse());
		existingStudent.setEmail(student.getEmail());
		existingStudent.setPhone(student.getPhone());
		existingStudent.setDob(student.getDob());

		studentService.updateStudent(existingStudent);
		return "redirect:/getallstudent";
	}


}
