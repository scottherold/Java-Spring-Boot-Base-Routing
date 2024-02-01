package com.sherold.baserouting;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//This annotation allows for this file to be used as a 'controller'
@RestController

// Class annotation to serve the '/coding' route
@RequestMapping("/coding")
public class CodingController {
	// This annotation will return a response to the route '/coding'
	@RequestMapping("")
	public String hello() {
		return "Hello Coding Dojo!";
	}
	
	// This annotation will return a response to the route '/coding/python'
	@RequestMapping("/python")
	public String python() {
		return "Python/Django was awesom!";
	}
	
	// This annotation will return a response to the route '/coding/java'
		@RequestMapping("/java")
		public String java() {
			return "Java/Spring is better!";
		}
}
