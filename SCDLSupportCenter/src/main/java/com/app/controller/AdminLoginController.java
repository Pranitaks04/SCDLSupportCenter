package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.AdminLoginResponse;
import com.app.model.AdminLogin;
import com.app.service.AdminLoginService;
@RestController

public class AdminLoginController {
	
	
	
	@Autowired AdminLoginService adminloginservice;
	@PostMapping("/adminlogin")
	public ResponseEntity<AdminLoginResponse>adminLogin(@RequestBody AdminLogin adminlogin){
		AdminLoginResponse adminresponse = adminloginservice.adminLogin(adminlogin);
		return new ResponseEntity<AdminLoginResponse>(adminresponse,HttpStatus.CREATED);
	}
		
}
