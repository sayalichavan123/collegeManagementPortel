package com.mydata.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mydata.Repository.StudentLeaveRepository;
import com.mydata.model.StudentLeave;

@Service
public class StudentLeaveServiceimpl implements StudentLeaveService {
	@Autowired
	StudentLeaveRepository sl;

	@Override
	public StudentLeave savestudentleave(StudentLeave s) {
		return sl.save(s);
	}

	@Override
	public List<StudentLeave> viewallstudentleave() {
		return sl.findAll();
	}

	

}
