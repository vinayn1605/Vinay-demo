package com.firstproject.vinaydemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class VinayDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(VinayDemoApplication.class, args);
	}

}
