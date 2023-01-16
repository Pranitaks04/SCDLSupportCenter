package com.app.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dto.EnquiryRequest;
import com.app.dto.NewEnquiryResponse;
import com.app.model.Enquiry;
import com.app.repo.NewEnquiryRepo;


@Service
public class NewEnquiryService {

	@Autowired
	private NewEnquiryRepo repo;

	public NewEnquiryResponse addNewEnquiry(EnquiryRequest newenquiry) {
		
	NewEnquiryResponse response = new NewEnquiryResponse();
	Enquiry enquiry=new Enquiry();
	
	enquiry.setEmail(newenquiry.getEmail());
	enquiry.setEnquiryDate(LocalDate.now());
	enquiry.setFirstname(newenquiry.getFirstname());
	enquiry.setLastname(newenquiry.getLastname());
	enquiry.setMobileno(newenquiry.getMobileno());
	enquiry.setAddress(newenquiry.getAddress());
	enquiry.setPinCode(newenquiry.getPinCode());
	
	Enquiry res=repo.save(enquiry);
	if(enquiry!=null) {
		response.setNewenquiry(res);
		response.setStatus("Success");
	}else {
		response.setNewenquiry(enquiry);
		response.setStatus("Fail");
	}
	
		
	// TODO Auto-generated method stub
	return response;
}
}


