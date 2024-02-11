package com.mydata.service;

import java.util.List;

import com.mydata.model.Student;

public interface StudentService {
	
	Student saveStudent(Student student);

	Student getstudentbyid(int id);
	
	Student updatestudent(Student student);
	
	List<Student>viewallstudent();
	
	void deleteStudentbyid(int id);
	
	Student updateStudent(Student student);
}
