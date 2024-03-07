package com.nik.eurekanaming;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaNamingApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaNamingApplication.class, args);
	}

}
