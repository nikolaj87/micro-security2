package com.nik.microservicestudent.repository;

import com.nik.microservicestudent.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface StudentRepository extends JpaRepository<Student, Long> {

    @Query(value = "SELECT * FROM student ORDER BY RAND() LIMIT 1", nativeQuery = true)
    Student getBestStudent();
}
