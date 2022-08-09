package io.javabrains.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourseApiApp {
// The above annotation tells Spring Boot that this class is the starting point for our app
	public static void main(String[] args) {
		
		SpringApplication.run(CourseApiApp.class, args);
		// A static method which tells SpringBoot to create a servlet container and
		// host this app in it. The first arg is the class with the main method

	}

}
