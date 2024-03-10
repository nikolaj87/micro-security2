package com.nik.microservicestudent.service;

import com.nik.microservicestudent.dto.StudentJson;
import com.nik.microservicestudent.dto.StudentResponse;
import com.nik.microservicestudent.entity.Student;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface StudentService {
    @Transactional(readOnly = true)
    Student getStudent(Long id);
    @Transactional
    List<Student> getAllStudents();
    @Transactional
    Student createStudent(StudentJson studentJson);
    @Transactional
    void deleteStudent(Long id);
    @Transactional
    StudentResponse getBestStudent();
}
