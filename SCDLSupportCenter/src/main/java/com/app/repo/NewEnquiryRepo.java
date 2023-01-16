package com.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Enquiry;



public interface NewEnquiryRepo  extends JpaRepository<Enquiry ,Integer>{

}
