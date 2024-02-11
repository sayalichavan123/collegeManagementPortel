package com.mydata.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Fee {
    @Id
    private int RollNo;
    private String Name;
    private String Catagory; 
    private String TotalFee; 
    private String PaidFee; 
    private String RemainingFee; 
    private String Status;
	public int getRollNo() {
		return RollNo;
	}
	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCatagory() {
		return Catagory;
	}
	public void setCatagory(String catagory) {
		Catagory = catagory;
	}
	public String getTotalFee() {
		return TotalFee;
	}
	public void setTotalFee(String totalFee) {
		TotalFee = totalFee;
	}
	public String getPaidFee() {
		return PaidFee;
	}
	public void setPaidFee(String paidFee) {
		PaidFee = paidFee;
	}
	public String getRemainingFee() {
		return RemainingFee;
	}
	public void setRemainingFee(String remainingFee) {
		RemainingFee = remainingFee;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public Fee(int rollNo, String name, String catagory, String totalFee, String paidFee, String remainingFee,
			String status) {
		super();
		RollNo = rollNo;
		Name = name;
		Catagory = catagory;
		TotalFee = totalFee;
		PaidFee = paidFee;
		RemainingFee = remainingFee;
		Status = status;
	}
	public Fee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Fee [RollNo=" + RollNo + ", Name=" + Name + ", Catagory=" + Catagory + ", TotalFee=" + TotalFee
				+ ", PaidFee=" + PaidFee + ", RemainingFee=" + RemainingFee + ", Status=" + Status + "]";
	}
    
	
}
