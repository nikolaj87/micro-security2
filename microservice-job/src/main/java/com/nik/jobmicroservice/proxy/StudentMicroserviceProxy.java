package com.nik.jobmicroservice.proxy;

import com.nik.jobmicroservice.dto.StudentDto;
import feign.Headers;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "microservice-student")
public interface StudentMicroserviceProxy {

    String AUTH_TOKEN = "Authorization";

    @GetMapping("/student/best-student")
    @Headers("Content-Type: application/json")
    public StudentDto getStudent (@RequestHeader(AUTH_TOKEN) String bearerToken);
}
