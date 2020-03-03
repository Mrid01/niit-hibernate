package com.niit.models;

import java.io.Serializable;
import java.util.Date;

public class Student implements Serializable{
	private String uId;
	private String fName;
	private String lName;
	private String gender;
	private Date dob ;
	private String address;
	private String mobileNo;
	private String email;
	private String pwd;
	
	public Student() {
		
	}
	public Student(String UId) {
		this.uId = uId;
	}
	public Student(String UId, String fName, String lName, String gender, Date dob, String address, String mobileNo, String email, String pwd) {
		this.uId = uId;
		this.fName = fName;
		this.lName = lName;
		this.gender = gender;
		this.dob = dob;
		this.address = address;
		this.mobileNo = mobileNo;
		this.email = email;
		this.pwd = pwd;
	}
	
	public String getuId() {
		return this.uId;
	}
	public void setuId(String uId) {
		this.uId = uId;
	}
	

	public String getfName() {
		return this.fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	
	public String getlName() {
		return this.lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	
	public String getgender() {
		return this.gender;
	}
	public void setgender(String gender) {
		this.gender = gender;
	}
	
	public Date getdob() {
		return this.dob;
	}
	public void setdob(Date dob) {
		this.dob = dob;
	}
	
	public String getaddress() {
		return this.address;
	}
	public void setaddress(String address) {
		this.address = address;
	}
	
	public String getemail() {
		return this.email;
	}
	public void setemail(String email) {
		this.email = email;
	}
	
	public String getpwd() {
		return this.pwd;
	}
	public void setpwd(String pwd) {
		this.pwd = pwd;
	}
	
	public String getmobileNo() {
		return this.mobileNo;
	}
	public void setmobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
}
