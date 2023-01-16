package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.EnquiryRequest;
import com.app.dto.NewEnquiryResponse;

import com.app.service.NewEnquiryService;






@RestController
@RequestMapping("/enquiry")
public class EnquiryController {
	@Autowired 
	NewEnquiryService newenquiryservice;
	
@GetMapping("/")
public ResponseEntity<String> Welcome(){
	
	return  new ResponseEntity<String>("Welcome To Application...!",HttpStatus.OK);
}
@PostMapping("/add")
public ResponseEntity<NewEnquiryResponse>addNewEnquiry(@RequestBody EnquiryRequest newenquiry){
	NewEnquiryResponse  response = newenquiryservice.addNewEnquiry(newenquiry);
	return new ResponseEntity<NewEnquiryResponse>(response,HttpStatus.CREATED);
}

}