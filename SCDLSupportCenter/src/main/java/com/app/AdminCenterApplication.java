package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AdminCenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminCenterApplication.class, args);
		System.out.println("Server Up...");
	}

}
