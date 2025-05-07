package com.example.studentcourse.repository;

import com.example.studentcourse.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

// CourseRepository.java
public interface CourseRepository extends JpaRepository<Course, Long> {}
