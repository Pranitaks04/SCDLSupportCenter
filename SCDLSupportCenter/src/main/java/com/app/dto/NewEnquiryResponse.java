package com.app.dto;

import com.app.model.Enquiry;

public class NewEnquiryResponse {
	private  Enquiry  newenquiry;
	private String Status;
	public Enquiry getNewenquiry() {
		return newenquiry;
	}
	public void setNewenquiry(Enquiry newenquiry) {
		this.newenquiry = newenquiry;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	@Override
	public String toString() {
		return "NewEnquiryResponse [newenquiry=" + newenquiry + ", Status=" + Status + "]";
	}
	
}