package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
	
	// expose "/" that returns hello world
	
	//Github push test
	
	@GetMapping("/")
	public String sayHello(){
		return "Hello World";
	}
	
	//expose a new endpoint for "workout"
	
	@GetMapping("/workout")
	public String getDailyWorkout() {
		return "run a hard 5 k";
	}
	
	//expose a new endpoint for fortune
	
	@GetMapping("/fortune")
	public String getDailyFortune() {
		return "Today is your lucky day";
	}
	
	@GetMapping("/test")
	public String getDailyTest() {
		
		return "SHT";
	}
	

}
