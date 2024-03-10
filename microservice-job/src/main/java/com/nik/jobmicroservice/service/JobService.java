package com.nik.jobmicroservice.service;

import com.nik.jobmicroservice.dto.JobJson;
import com.nik.jobmicroservice.dto.JobResponse;
import com.nik.jobmicroservice.entity.Job;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface JobService {

    @Transactional(readOnly = true)
    Job getJob(Long id);

    @Transactional(readOnly = true)
    List<Job> getAllJobs();

    @Transactional
    Job createJob(JobJson studentJson);

    @Transactional
    void deleteJob(Long id);

    @Transactional
    JobResponse assignStudent(String token);
}
