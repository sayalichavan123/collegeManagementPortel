package com.mydata.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mydata.Repository.TeacherRepository;
import com.mydata.model.Teacher;

@Service
public class TeacherServiceimpl implements TeacherService {
	@Autowired
	TeacherRepository teacherRepository;

	@Override
	public Teacher saveteacher(Teacher teacher) {
		return teacherRepository.save(teacher);
	}

	@Override
	public List<Teacher> viewallteacher() {
		return teacherRepository.findAll();
	}

	@Override
	public Teacher getteacherbyid(int id) {
		return teacherRepository.findById(id).get();
	}

	@Override
	public void deleteTeacherbyid(int id) {

		teacherRepository.deleteById(id);
	}

	@Override
	public Teacher updateTeacher(Teacher teacher) {
		return teacherRepository.save(teacher);
	}

	

	
	}



	




