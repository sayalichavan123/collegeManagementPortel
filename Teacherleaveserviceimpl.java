package com.mydata.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mydata.Repository.TeacherleveRepository;
import com.mydata.model.TeacherLeave;

@Service
public class Teacherleaveserviceimpl implements TeacherLeaveService {
	@Autowired
	TeacherleveRepository tr;

	@Override
	public TeacherLeave saveteacherleave(TeacherLeave teacherLeave) {
		return tr.save(teacherLeave);
	}

	@Override
	public List<TeacherLeave> viewallTeacherLeave() {
		return tr.findAll();
	}

}
