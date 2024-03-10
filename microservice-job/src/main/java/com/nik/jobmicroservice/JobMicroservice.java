package com.nik.jobmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class JobMicroservice {

	public static void main(String[] args) {
		SpringApplication.run(JobMicroservice.class, args);
	}

}
