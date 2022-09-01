package com.manideep.first.app.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
@Controller
public class HelloWorldController 
{
	
	@GetMapping("/helloworld")
	public String helloworld()
	{
		return "Hello World! I am Manideep";
	}
	
}
