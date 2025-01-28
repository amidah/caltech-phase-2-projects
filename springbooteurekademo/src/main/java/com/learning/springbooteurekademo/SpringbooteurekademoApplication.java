package com.learning.springbooteurekademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringbooteurekademoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbooteurekademoApplication.class, args);
	}

}
