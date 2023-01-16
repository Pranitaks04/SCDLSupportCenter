package com.app.dto;

import com.app.model.AdminLogin;

public class AdminLoginResponse {
	private AdminLogin admin;
	private String status;
	public AdminLogin getAdmin() {
		return admin;
	}
	public void setAdmin(AdminLogin admin) {
		this.admin = admin;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "AdminLoginResponse [admin=" + admin + ", status=" + status + "]";
	}
	
	
	
	
	
	

}
