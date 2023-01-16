package com.app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
 
@Entity
@Table(name="admin_login")
public class AdminLogin {
	@Id
	private int id;
	private String gmail;
	private String password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGmail() {
		return gmail;
	}
	public void setGmail(String gmail) {
		this.gmail = gmail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public AdminLogin(int id, String gmail, String password) {
		super();
		this.id = id;
		this.gmail = gmail;
		this.password = password;
	}
	public AdminLogin() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "AdminLogin [id=" + id + ", gmail=" + gmail + ", password=" + password + "]";
	}
	
	
}
