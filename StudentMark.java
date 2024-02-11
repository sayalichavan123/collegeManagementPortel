package com.mydata.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class StudentMark {
	@Id
	private String rollno;
	
	private String name;
	
    private String semester;
    
    private String cgpa;
    
    private String backlog;

	public String getRollno() {
		return rollno;
	}

	public void setRollno(String rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	public String getCgpa() {
		return cgpa;
	}

	public void setCgpa(String cgpa) {
		this.cgpa = cgpa;
	}

	public String getBacklog() {
		return backlog;
	}

	public void setBacklog(String backlog) {
		this.backlog = backlog;
	}

	public StudentMark(String rollno, String name, String semester, String cgpa, String backlog) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.semester = semester;
		this.cgpa = cgpa;
		this.backlog = backlog;
	}

	public StudentMark() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "StudentMark [rollno=" + rollno + ", name=" + name + ", semester=" + semester + ", cgpa=" + cgpa
				+ ", backlog=" + backlog + "]";
	}
    
    
    

}
