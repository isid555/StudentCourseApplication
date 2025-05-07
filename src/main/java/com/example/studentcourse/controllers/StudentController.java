package com.example.studentcourse.controllers;

import com.example.studentcourse.models.Student;
import com.example.studentcourse.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public String listStudents(Model model) {
        model.addAttribute("students", studentService.getAllStudents());
        return "students";  // Name of the JSP view
    }

    @GetMapping("/students/add")
    public String addStudentForm(Model model) {
        model.addAttribute("student", new Student());
        return "add-student";
    }

    @PostMapping("/students/save")
    public String saveStudent(Student student) {
        studentService.saveStudent(student);
        return "redirect:/students";
    }

    @PostMapping("/students/update")
    public String updateStudent(Student student) {
        studentService.updateStudent(student);
        return "redirect:/students";
    }
}
