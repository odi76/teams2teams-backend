package com.teams2teams.backend;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.teams2teams.backend.loginapi.User;
import com.teams2teams.backend.loginapi.UserRepository;


@SpringBootApplication
public class Teams2TeamsBackendApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Teams2TeamsBackendApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) {

		// a system kiírás törölhető
		System.out.println("Új userek létrehozása");

		

		
		User admin = new User( "admin2@a.hu", "titkos222");
		//egy kiírása: userRepository.save(admin);
		User istvan = new User("istvan2@i.hu", "iii");
		User attila = new User("attila2@a.hu", "aaa");
		User laci = new User("laci@l.hu", "lll");

		//Több kiírása
		userRepository.saveAll(List.of(admin, istvan, attila, laci));

	}



	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/ping").allowedOrigins("http://localhost:3000");
				registry.addMapping("/login").allowedOrigins("http://localhost:3000");
				registry.addMapping("/logout").allowedOrigins("http://localhost:3000");
				registry.addMapping("/registrate").allowedOrigins("http://localhost:3000");
			}
		};
	}

}
