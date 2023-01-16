package com.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Grievance;


public interface GrievanceRepository extends JpaRepository<Grievance,Integer>{

}
