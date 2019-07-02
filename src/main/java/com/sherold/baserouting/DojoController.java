package com.sherold.baserouting;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//This annotation allows for this file to be used as a 'controller'
@RestController
public class DojoController {
	// This annotation allows for PathVariable mapping
	@RequestMapping("/{location}")
	// @PathVariable allows the dynamic paths in the curly brackets from the route to be used as parameters in a function
	public String dojo(@PathVariable("location") String location) {
		// Event handler for location
		if (location.equals("dojo")) {
			return "The dojo is awesome!";
		} else if (location.equals("burbank-dojo")) {
			return "Burbank dojo is located in Southern California";
		} else if (location.equals("san-jose")) {
			return "SJ dojo is the headquarters";
		} else {
			return "No location detected";
		}
	}
}
