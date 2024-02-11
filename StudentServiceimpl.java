package com.mydata.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mydata.Repository.StudentRepository;
import com.mydata.model.Student;

@Service
public class StudentServiceimpl implements StudentService {
	@Autowired
	StudentRepository studentrepository;

	@Override
	public Student saveStudent(Student student) {
		return studentrepository.save(student);
	}

	@Override
	public Student getstudentbyid(int id) {
		return studentrepository.findById(id).get();
	}

	@Override
	public Student updatestudent(Student student) {
		return studentrepository.save(student);
	}

	@Override
	public List<Student> viewallstudent() {
		return studentrepository.findAll();
	}

	@Override
	public void deleteStudentbyid(int id) {
		studentrepository.deleteById(id);
	}

	@Override
	public Student updateStudent(Student student) {
		return studentrepository.save(student);
	}

}
