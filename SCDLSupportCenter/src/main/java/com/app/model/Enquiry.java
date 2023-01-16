package com.app.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="enquiry")
public class Enquiry {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
private String firstname;
private String lastname;
private String password;
private String email;
private long mobileno;
private LocalDate enquiryDate;
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
public LocalDate getEnquiryDate() {
	return enquiryDate;
}
public void setEnquiryDate(LocalDate enquiryDate) {
	this.enquiryDate = enquiryDate;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
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
public Enquiry(int id, String firstname, String lastname, String password, String email, long mobileno,
		LocalDate enquiryDate, String address, int pinCode) {
	super();
	this.id = id;
	this.firstname = firstname;
	this.lastname = lastname;
	this.password = password;
	this.email = email;
	this.mobileno = mobileno;
	this.enquiryDate = enquiryDate;
	this.address = address;
	this.pinCode = pinCode;
}
public Enquiry() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Enquiry [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", password=" + password
			+ ", email=" + email + ", mobileno=" + mobileno + ", enquiryDate=" + enquiryDate + ", address=" + address
			+ ", pinCode=" + pinCode + "]";
}

}
