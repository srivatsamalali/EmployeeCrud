package com.timesheet.login;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class LoginandsignupApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginandsignupApplication.class, args);
	}

}
