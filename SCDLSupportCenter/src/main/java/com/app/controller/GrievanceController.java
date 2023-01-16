package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.GrievanceRequest;
import com.app.dto.GrievanceResponse;
import com.app.model.Grievance;
import com.app.service.GrievanceService;



@RestController
@RequestMapping("/grievance")
public class GrievanceController {
	@Autowired GrievanceService grievanceservice;
	
	@GetMapping("add_grievance")
	public String showSignUpForm(Grievance grievance) {
		return "add-grievance";
	}
	
	@PostMapping("/add") 
	public ResponseEntity<GrievanceResponse>addGrievance(@RequestBody GrievanceRequest grievance){
	
	     GrievanceResponse response = grievanceservice.addGrievance(grievance);
	    return new ResponseEntity<GrievanceResponse>(response,HttpStatus.CREATED);
	}

}
