package com.project.fullstack.controller;

import com.project.fullstack.model.Student;
import com.project.fullstack.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("student")
@CrossOrigin
public class StudentController {
    @Autowired
    public StudentService studentService;

    @PostMapping("/add")
    public String addStudent(@RequestBody Student student){
        studentService.saveStudent(student);
        return "New student added";
    }

    @GetMapping("/list")
    public List<Student> listStudent(){
        return studentService.getAllStudent();
    }
}
