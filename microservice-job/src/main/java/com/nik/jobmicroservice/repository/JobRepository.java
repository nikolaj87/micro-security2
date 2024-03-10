package com.nik.jobmicroservice.repository;

import com.nik.jobmicroservice.entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface JobRepository extends JpaRepository<Job, Long> {
    @Query(value = "SELECT * FROM job ORDER BY RAND() LIMIT 1;", nativeQuery = true)
    Job getRandomJob();
}
