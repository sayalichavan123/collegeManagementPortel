package com.mydata.service;

import java.util.List;

import com.mydata.model.TeacherLeave;

public interface TeacherLeaveService {
	
	TeacherLeave saveteacherleave(TeacherLeave teacherLeave);
	
	List<TeacherLeave>viewallTeacherLeave();

}
