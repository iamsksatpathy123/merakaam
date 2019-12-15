package com.bloodDoner.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class BloodDoner1Application {

	public static void main(String[] args) {
		SpringApplication.run(BloodDoner1Application.class, args);
	}

}
