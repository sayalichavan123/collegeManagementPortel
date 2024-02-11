package com.mydata.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mydata.Repository.StudentMarkRepository;
import com.mydata.model.StudentMark;

@Service
public class StudentMarkserviceimpl implements Studentmarkservice {
	@Autowired
	StudentMarkRepository studentMarkRepository;

	@Override
	public StudentMark addmarks(StudentMark studentMark) {
		return studentMarkRepository.save(studentMark);
	}

	@Override
	public List<StudentMark> viewallstudentmark() {
		return studentMarkRepository.findAll();
	}

}
