package com.mydata.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int rollno;

	private String name;

	private String middlename;

	private String lastname;

	private String address;

	private String phone;

	private String email;

	private String classxper;

	private String classxiiper;

	private String adharno;

	private String course;

	private String branch;

	private String dob;

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

	public String getMiddlename() {
		return middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getClassxper() {
		return classxper;
	}

	public void setClassxper(String classxper) {
		this.classxper = classxper;
	}

	public String getClassxiiper() {
		return classxiiper;
	}

	public void setClassxiiper(String classxiiper) {
		this.classxiiper = classxiiper;
	}

	public String getAdharno() {
		return adharno;
	}

	public void setAdharno(String adharno) {
		this.adharno = adharno;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public Student(int rollno, String name, String middlename, String lastname, String address, String phone,
			String email, String classxper, String classxiiper, String adharno, String course, String branch,
			String dob) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.middlename = middlename;
		this.lastname = lastname;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.classxper = classxper;
		this.classxiiper = classxiiper;
		this.adharno = adharno;
		this.course = course;
		this.branch = branch;
		this.dob = dob;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", middlename=" + middlename + ", lastname=" + lastname
				+ ", address=" + address + ", phone=" + phone + ", email=" + email + ", classxper=" + classxper
				+ ", classxiiper=" + classxiiper + ", adharno=" + adharno + ", course=" + course + ", branch=" + branch
				+ ", dob=" + dob + "]";
	}
	

	
	
}
