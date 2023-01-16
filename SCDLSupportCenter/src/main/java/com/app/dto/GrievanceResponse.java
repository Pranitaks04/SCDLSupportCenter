package com.app.dto;

import com.app.model.Grievance;

public class GrievanceResponse {
	
	private Grievance grievance;
	private String Status;
	public Grievance getGrievance() {
		return grievance;
	}
	public void setGrievance(Grievance grievance) {
		this.grievance = grievance;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	@Override
	public String toString() {
		return "GrievanceResponse [grievance=" + grievance + ", Status=" + Status + "]";
	}
	
	
	

}
