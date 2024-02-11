package com.mydata.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int employeeId;
    private String firstName;
    private String middleName;
    private String lastName;
    private String address;
    private String phone;
    private String email;
    private String classXper;
    private String classXiiper;
    private String dob;
    private String adharNo;
    private String education;
    private String department;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
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
	public String getClassXper() {
		return classXper;
	}
	public void setClassXper(String classXper) {
		this.classXper = classXper;
	}
	public String getClassXiiper() {
		return classXiiper;
	}
	public void setClassXiiper(String classXiiper) {
		this.classXiiper = classXiiper;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getAdharNo() {
		return adharNo;
	}
	public void setAdharNo(String adharNo) {
		this.adharNo = adharNo;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Teacher(int employeeId, String firstName, String middleName, String lastName, String address, String phone,
			String email, String classXper, String classXiiper, String dob, String adharNo, String education,
			String department) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.classXper = classXper;
		this.classXiiper = classXiiper;
		this.dob = dob;
		this.adharNo = adharNo;
		this.education = education;
		this.department = department;
	}
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Teacher [employeeId=" + employeeId + ", firstName=" + firstName + ", middleName=" + middleName
				+ ", lastName=" + lastName + ", address=" + address + ", phone=" + phone + ", email=" + email
				+ ", classXper=" + classXper + ", classXiiper=" + classXiiper + ", dob=" + dob + ", adharNo=" + adharNo
				+ ", education=" + education + ", department=" + department + "]";
	}

    
}
