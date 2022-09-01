package com.manideep.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	@RequestMapping("/showForm")
	public String showForm()
	{
		return "helloworld-from";
	}
	@RequestMapping("/processForm")
	public String processForm()
	{
		return "helloworld";
	}
	@RequestMapping("/processFormVersion2")
	public String lsd(HttpServletRequest req,Model model)
	{
		String thename=req.getParameter("studentName");
		
		thename=thename.toUpperCase();
		
		String res="Yo! "+thename;
		
		model.addAttribute("message", res);
		
		return "helloworld";
	}
	@RequestMapping("/processFormVersion3")
	public String lsd3(@RequestParam("studentName") String thename,Model model)
	{
		
		
		thename=thename.toUpperCase();
		
		String res="Hey My Friend From V3! "+thename;
		
		model.addAttribute("message", res);
		
		return "helloworld";
	}
	
}
