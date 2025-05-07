package com.example.studentcourse.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity
public class Course {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String description;

    @ManyToMany(mappedBy = "courses")
    private List<Student> students;
}

