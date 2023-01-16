package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dto.GrievanceRequest;
import com.app.dto.GrievanceResponse;
import com.app.model.Grievance;
import com.app.repo.GrievanceRepository;

@Service

public class GrievanceService {
	@Autowired GrievanceRepository repo;

	public GrievanceResponse addGrievance(GrievanceRequest grievance) {
		// TODO Auto-generated method stub
		
		
			GrievanceResponse response = new GrievanceResponse();
			Grievance g1 = new Grievance();
			
			g1.setStudentname(grievance.getStudentname());
			g1.setRegistrationno(grievance.getRegistrationno());
			g1.setEmailaddress(grievance.getEmailaddress());
			g1.setMobileno(grievance.getMobileno());
			g1.setGender(grievance.getGender());
			g1.setDepartment(grievance.getDepartment());
			g1.setYear(grievance.getYear());
			
			
			
			Grievance pro = repo.save(g1);
			
			if(pro!=null) {
				response.setGrievance(pro);
				response.setStatus("Success");
				
			}
			else {
				response.setGrievance(g1);
				response.setStatus("Fail");
				
		       }
				
					return response;
					}

}
