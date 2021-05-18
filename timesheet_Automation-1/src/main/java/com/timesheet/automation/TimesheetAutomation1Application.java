package com.timesheet.automation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TimesheetAutomation1Application {

	public static void main(String[] args) {
		SpringApplication.run(TimesheetAutomation1Application.class, args);
	}

}
