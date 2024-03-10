package com.nik.jobmicroservice.repository;

import com.nik.jobmicroservice.entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job, Long> {
}
