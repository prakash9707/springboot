package io.javabrains.springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	
	/**
	 * The controller is a class which is used for mapping the url to the server
	 * This decides what to happen when /endpoint is being hitted
	 * We are also annotating the as @RestController which mapps the url request
	 * 
	 */
	
	
	
//	@RequestMapping("/")
//	public String homePage() {
//		return "I am home page";
//	}

	/**
	 * By default @RequestMapping is used for GET method
	 * If u want it by any POST, PUT, DELETE then u should method there
	 */
	

}
