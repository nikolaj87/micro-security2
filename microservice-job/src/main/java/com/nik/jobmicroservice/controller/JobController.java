package com.nik.jobmicroservice.controller;

import com.nik.jobmicroservice.dto.JobJson;
import com.nik.jobmicroservice.dto.JobResponse;
import com.nik.jobmicroservice.entity.Job;
import com.nik.jobmicroservice.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/job")
public class JobController {

    @Autowired
    private JobService jobService;

    @GetMapping("/assign-job-for-student")
    public JobResponse assignStudentJob (@RequestHeader("Authorization") String token) {
        return jobService.assignStudent(token);
    }

    @GetMapping("/{id}")
    public Job getJob(@PathVariable Long id) {
        return jobService.getJob(id);
    }

    @GetMapping
    public List<Job> allJobs() {
        return jobService.getAllJobs();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Job addJob(@RequestBody JobJson jobJson) {
        return jobService.createJob(jobJson);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void deleteJob(@PathVariable Long id) {
        jobService.deleteJob(id);
    }
}



