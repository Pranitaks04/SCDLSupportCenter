package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dto.AdminCenterResponse;
import com.app.model.Admin;
import com.app.repo.AdminRepo;

@Service
public class AdminCenterService {
	@Autowired
	private AdminRepo repo;
	public AdminCenterResponse addCenter(Admin admin) {
		AdminCenterResponse response=new AdminCenterResponse();
		Admin adminservice=repo.save(admin);
		if(adminservice!=null) {
			response.setAdmin(adminservice);
			response.setStatus("Success");
		}else {
			response.setAdmin(admin);
			response.setStatus("Fail");
		}
		return response;
	}

}
