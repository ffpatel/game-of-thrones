package com.gameOfThrones.got;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.gameOfThrones.got")
public class ApplicationFile {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationFile.class, args);
	}

}
