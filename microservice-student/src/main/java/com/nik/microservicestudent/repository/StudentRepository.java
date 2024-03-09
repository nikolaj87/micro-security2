package com.nik.microservicestudent.repository;

import com.nik.microservicestudent.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
