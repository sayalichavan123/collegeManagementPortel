package com.mydata.service;

import java.util.List;

import com.mydata.model.StudentLeave;

public interface StudentLeaveService {
	
	StudentLeave savestudentleave(StudentLeave s);
	
	List<StudentLeave>viewallstudentleave();
	
	
	    

}
