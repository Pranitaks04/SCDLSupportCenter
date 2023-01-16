package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dto.AdminLoginResponse;
import com.app.model.AdminLogin;
import com.app.repo.AdminLoginRepo;



@Service
public class AdminLoginService {
	@Autowired
	private AdminLoginRepo adminloginrepo;
	public AdminLoginResponse adminLogin(AdminLogin adminlogin) {
		// TODO Auto-generated method stub
		AdminLoginResponse adminresponse=new AdminLoginResponse();
		AdminLogin adminloginservice=adminloginrepo.save(adminlogin);
		if(adminloginservice!=null) {
			adminresponse.setAdmin(adminloginservice);
			adminresponse.setStatus("Success");
		}else {
			adminresponse.setAdmin(adminlogin);
			adminresponse.setStatus("Fail");
		}
		return adminresponse;
	}


}
