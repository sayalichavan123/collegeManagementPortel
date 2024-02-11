package com.mydata.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class TeacherLeave {
	@Id
	private int empid;
	
	private String date;
	
	private String day;

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public TeacherLeave(int empid, String date, String day) {
		super();
		this.empid = empid;
		this.date = date;
		this.day = day;
	}

	public TeacherLeave() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "TeacherLeave [empid=" + empid + ", date=" + date + ", day=" + day + "]";
	}
	
	

}
