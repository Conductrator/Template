package com.conductrator.blueprint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class BlueprintApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlueprintApplication.class, args);
	}

}
