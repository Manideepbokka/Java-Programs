package com.manideep.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/showForm")
	public String showForm(Model them)
	{
		Student s=new Student();
		
		them.addAttribute("student", s);
		
		return "student-form";
	}
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student ts) {
		System.out.println("theStudent: "+ts.getFirstname()+"  "+ts.getLastname());
		return "student-confirmation";
	}
	
}
