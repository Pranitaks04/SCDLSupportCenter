package com.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.model.Courses;
@Repository
public interface CourseRepo extends JpaRepository<Courses, Integer> {

}
