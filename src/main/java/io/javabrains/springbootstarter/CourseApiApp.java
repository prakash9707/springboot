package io.javabrains.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


// we are telling this application is a spring boot application for that we are given as annotation
@SpringBootApplication
public class CourseApiApp {

	public static void main(String[] args) {
		
		/**
		 * args is parameter that you can pass to main method
		 * The class which u annotated by @SpringBootApplication u need to pass 
		 * ,that class to the main method
		 */
		SpringApplication.run(CourseApiApp.class, args);
		//SpringApplication is a class that has default method called run
		
		//things that do by above line
		/*
		 * 1.This starts the tomcat server by default
		 * 2.start spring application context
		 * 3.performs class path scan
		 * 
		 */
	}

}
