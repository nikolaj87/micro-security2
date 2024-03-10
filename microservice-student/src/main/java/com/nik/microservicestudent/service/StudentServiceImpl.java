package com.nik.microservicestudent.service;

import com.nik.microservicestudent.dto.StudentJson;
import com.nik.microservicestudent.dto.StudentResponse;
import com.nik.microservicestudent.entity.Student;
import com.nik.microservicestudent.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository repository;

    @Autowired
    private ServerProperties properties;

    @Override
    public StudentResponse getBestStudent() {
        Student bestStudent = repository.getBestStudent();
        return new StudentResponse(bestStudent.getId(), bestStudent.getName(),
                bestStudent.getMark(), properties.getPort().toString());
    }

    @Override
    public Student getStudent(Long id) {
        Optional<Student> studentOpt = repository.findById(id);
        if (studentOpt.isEmpty()) {
            throw new NoSuchElementException();
        }
        return studentOpt.get();
    }

    @Override
    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    @Override
    public Student createStudent(StudentJson studentJson) {
        Student student = new Student(0L, studentJson.getName(), studentJson.getMark());
        student = repository.save(student);
        return student;
    }

    @Override
    public void deleteStudent(Long id) {
        repository.deleteById(id);
    }
}
