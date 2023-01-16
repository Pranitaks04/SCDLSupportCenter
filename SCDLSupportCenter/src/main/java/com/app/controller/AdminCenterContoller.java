package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.app.dto.AdminCenterResponse;
import com.app.model.Admin;
import com.app.model.AdminLogin;
import com.app.service.AdminCenterService;
import com.app.service.AdminLoginService;

@RestController
@RequestMapping("/admin")
public class AdminCenterContoller {

@Autowired AdminCenterService admincenterservice;

@GetMapping("/")
public ResponseEntity<String>admin(){
return new ResponseEntity<String>("Welcome to admin page...!",HttpStatus.OK);
	
}

@PostMapping("/addcenter")

public ResponseEntity<AdminCenterResponse>addCenter(@RequestBody Admin admin){
	AdminCenterResponse response = admincenterservice.addCenter(admin);
	return new ResponseEntity<AdminCenterResponse>(response,HttpStatus.CREATED);
	}

}
