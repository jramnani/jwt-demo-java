package com.example.jwtdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JwtDemoApplication {

	@RequestMapping("/")
	public String hello() {
		return "hello world";
	}

	public static void main(String[] args) {
		SpringApplication.run(JwtDemoApplication.class, args);
	}
}
