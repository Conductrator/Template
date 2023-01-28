package com.conductrator.blueprint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class BlueprintApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlueprintApplication.class, args);
	}

}
