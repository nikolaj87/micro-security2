package com.nik.jobmicroservice.service;

import com.nik.jobmicroservice.dto.JobJson;
import com.nik.jobmicroservice.dto.JobResponse;
import com.nik.jobmicroservice.dto.StudentDto;
import com.nik.jobmicroservice.entity.Job;
import com.nik.jobmicroservice.proxy.StudentMicroserviceProxy;
import com.nik.jobmicroservice.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class JobServiceImpl implements JobService {

    @Autowired
    private StudentMicroserviceProxy studentProxy;

    @Autowired
    private JobRepository repository;

    @Override
    public JobResponse assignStudent(String token) {
        Job job = repository.getRandomJob();
        StudentDto studentDto = studentProxy.getStudent(token);
        return new JobResponse(job.getName(), job.getPositionDescription(),
                studentDto.getName(),studentDto.getMark(), studentDto.getPort());
    }

    @Override
    public Job getJob(Long id) {
        Optional<Job> jobOpt = repository.findById(id);
        if (jobOpt.isEmpty()) {
            throw new NoSuchElementException();
        }
        return jobOpt.get();
    }

    @Override
    public List<Job> getAllJobs() {
        return repository.findAll();
    }

    @Override
    public Job createJob(JobJson jobJson) {
        Job Job = new Job(0L, jobJson.getName(), jobJson.getPositionDescription());
        Job = repository.save(Job);
        return Job;
    }

    @Override
    public void deleteJob(Long id) {
        repository.deleteById(id);
    }
}