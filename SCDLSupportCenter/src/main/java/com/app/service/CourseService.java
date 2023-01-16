package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dto.CourseRequest;
import com.app.model.Courses;
import com.app.repo.CourseRepo;


@Service
public class CourseService {

	@Autowired
	private CourseRepo repo;

	public Courses addCourse(Courses course) {
		// TODO Auto-generated method stub
		Courses courses=repo.save(course);
		return courses;
	}

}
