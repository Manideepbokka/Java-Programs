package com.manideep.springboot.demo.mycoolapplication.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

	@GetMapping("/")
	public String sayHello()
	{
		return "Hello World! Time on server is "+LocalDateTime.now();
	}
	
	@GetMapping("/workout")
	public String getDailyWorkout()
	{
		return "Run a hard 5k";
	}
}
