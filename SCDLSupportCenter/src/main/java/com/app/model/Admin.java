package com.app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="admin")
public class Admin {
	//lol
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String centerName;
	private String state;
	private String district;
	private String clgName;
	private String clgAddress;
	private String clgEmail;
	private long contactNo;
	private String principleName;
	private long postalCode;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCenterName() {
		return centerName;
	}
	public void setCenterName(String centerName) {
		this.centerName = centerName;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getClgName() {
		return clgName;
	}
	public void setClgName(String clgName) {
		this.clgName = clgName;
	}
	public String getClgAddress() {
		return clgAddress;
	}
	public void setClgAddress(String clgAddress) {
		this.clgAddress = clgAddress;
	}
	public String getClgEmail() {
		return clgEmail;
	}
	public void setClgEmail(String clgEmail) {
		this.clgEmail = clgEmail;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	public String getPrincipleName() {
		return principleName;
	}
	public void setPrincipleName(String principleName) {
		this.principleName = principleName;
	}
	public long getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(long postalCode) {
		this.postalCode = postalCode;
	}
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Admin [id=" + id + ", centerName=" + centerName + ", state=" + state + ", district=" + district
				+ ", clgName=" + clgName + ", clgAddress=" + clgAddress + ", clgEmail=" + clgEmail + ", contactNo="
				+ contactNo + ", principleName=" + principleName + ", postalCode=" + postalCode + "]";
	}
	
	
	
}