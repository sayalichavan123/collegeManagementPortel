package com.mydata.service;

import java.util.List;

import com.mydata.model.Teacher;

public interface TeacherService {
	
	Teacher saveteacher(Teacher teacher);
	
	List<Teacher> viewallteacher();

	Teacher getteacherbyid(int id);
	
	void deleteTeacherbyid(int id);
	

	Teacher updateTeacher(Teacher teacher);
	
	
}
