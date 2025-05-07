package com.example.studentcourse.services;



import com.example.studentcourse.models.Course;
import com.example.studentcourse.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;


    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }


    public Course saveCourse(Course course) {
        return courseRepository.save(course);
    }

    public Course getCourseById(Long id) {
        Optional<Course> course = courseRepository.findById(id);
        return course.orElseThrow(() -> new RuntimeException("Course not found"));
    }




    public void deleteCourse(Long id) {
        courseRepository.deleteById(id);
    }


}

