package com.app.dto;

import org.hibernate.annotations.Comment;
import org.springframework.stereotype.Component;

@Component
public class EnquiryRequest {
	private String firstname;
	private String lastname;
	private String password;
	private String email;
	private long mobileno;
	private String  courseId;
	private String address;
	private int pinCode;
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	@Override
	public String toString() {
		return "EnquiryRequest [firstname=" + firstname + ", lastname=" + lastname + ", password=" + password
				+ ", email=" + email + ", mobileno=" + mobileno + ", courseId=" + courseId + ", address=" + address
				+ ", pinCode=" + pinCode + "]";
	}
	
	

}
