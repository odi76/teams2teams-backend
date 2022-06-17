package com.teams2teams;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.teams2teams.model.User;
import com.teams2teams.repositories.UserRepository;
import com.teams2teams.service.UserService;
import com.teams2teams.controller.*;

@SpringBootApplication
public class LoginapiApplication implements CommandLineRunner{

	private static final Logger logger = LoggerFactory.getLogger(LoginapiApplication.class);


	public static void main(String... args) {

		// demo log kiírás:
		logger.info("this is a T2T info message");

		SpringApplication.run(LoginapiApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) {

		// a system kiírás törölhető
		System.out.println("új userek felvétele");

		logger.info("Create default users");
		User admin = new User( "admin2@a.hu", "titkos");
		User istvan = new User("istvan2@i.hu", "iii");
		User attila = new User("attila2@a.hu", "aaa");
		User laci = new User("laci@l.hu", "lll");

		userRepository.saveAllAndFlush(List.of(admin, istvan, attila, laci));
		logger.info("Default users saved into database");

	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/ping").allowedOrigins("http://localhost:3000");
				registry.addMapping("/login").allowedOrigins("http://localhost:3000");
				registry.addMapping("/logout").allowedOrigins("http://localhost:3000");
			}
		};
	}
}