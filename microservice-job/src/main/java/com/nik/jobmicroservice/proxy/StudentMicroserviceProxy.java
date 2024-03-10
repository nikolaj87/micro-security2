package com.nik.jobmicroservice.proxy;

import com.nik.jobmicroservice.dto.StudentDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "microservice-student")
public interface StudentMicroserviceProxy {
    @GetMapping("/student/1")
    public StudentDto getStudent ();
}
