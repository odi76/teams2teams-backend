package com.teams2teams.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication



public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("Hello Teams2teams app started");
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("Hello Teams2teams app finished");
	}

}
