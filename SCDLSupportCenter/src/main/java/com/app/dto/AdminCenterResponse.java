package com.app.dto;

import com.app.model.Admin;

public class AdminCenterResponse {
	private Admin admin;
	private String status;
	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
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
		return "AdminCenterResponse [admin=" + admin + ", status=" + status + "]";
	}

}
