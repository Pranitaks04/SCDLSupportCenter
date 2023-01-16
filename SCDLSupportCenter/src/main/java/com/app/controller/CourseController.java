package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Courses;
import com.app.service.CourseService;

@RestController
@RequestMapping("/course")
public class CourseController {
	@Autowired 
	private CourseService courseservice;
	

@PostMapping("/add")
public ResponseEntity<Courses>addNewEnquiry(@RequestBody Courses course){
	Courses  response = courseservice.addCourse(course);
	return new ResponseEntity<Courses>(response,HttpStatus.CREATED);
}

}