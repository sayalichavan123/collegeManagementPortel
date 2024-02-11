package com.mydata.service;

import java.util.List;

import com.mydata.model.StudentMark;

public interface Studentmarkservice {

	StudentMark addmarks(StudentMark studentMark);
	
	List<StudentMark> viewallstudentmark();
}
