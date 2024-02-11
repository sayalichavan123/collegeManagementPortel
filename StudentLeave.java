package com.mydata.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class StudentLeave {
	@Id
	private int rollno;
	
	private String name;
	
	private String date;
	
	private String day;

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public StudentLeave(int rollno, String name, String date, String day) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.date = date;
		this.day = day;
	}

	public StudentLeave() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "StudentLeave [rollno=" + rollno + ", name=" + name + ", date=" + date + ", day=" + day + "]";
	}

	
}
