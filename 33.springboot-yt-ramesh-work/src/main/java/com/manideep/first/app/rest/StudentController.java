package com.manideep.first.app.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manideep.first.app.entity.Student;

@RestController
public class StudentController {

	@GetMapping("/student")
	public Student getStudent()
	{
		return new Student("Bokka","Sai Manideep");
	}
}
