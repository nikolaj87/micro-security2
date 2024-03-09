package com.nik.microservicestudent.controller;

import com.nik.microservicestudent.dto.StudentJson;
import com.nik.microservicestudent.entity.Student;
import com.nik.microservicestudent.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/{id}")
    public Student getStudent(@PathVariable Long id) {
        return studentService.getStudent(id);
    }

    @GetMapping
    public List<Student> allStudent() {
        return studentService.getAllStudents();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Student addStudent(@RequestBody StudentJson studentJson) {
        return studentService.createStudent(studentJson);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
    }
}
