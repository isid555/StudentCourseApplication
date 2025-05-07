package com.example.studentcourse.models;

import jakarta.persistence.*;

import java.util.List;


@Entity
public class Student {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String email;

    @ManyToMany
    @JoinTable(
            name = "student_course",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "course_id")
    )
    private List<Course> courses;
}
