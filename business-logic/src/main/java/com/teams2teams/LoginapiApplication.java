package com.teams2teams;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.teams2teams.model.User;
import com.teams2teams.repositories.UserRepository;
import com.teams2teams.service.Userservice;
import com.teams2teams.controller.*;

@SpringBootApplication
public class LoginapiApplication implements CommandLineRunner{

	public static void main(String... args) {
		SpringApplication.run(LoginapiApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) {

		System.out.println("új userek felvétele");
		User admin = new User( "admin2", "titkos");
		User istvan = new User("István2", "iii");
		User attila = new User("Attila2", "aaa");
		User laci = new User("Laci", "lll");

		userRepository.saveAllAndFlush(List.of(admin, istvan, attila, laci));

	}
}