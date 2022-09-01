package com.manideep.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeContoller {

	@RequestMapping("/")
	public String Showpage()
	{
		return "main-menu";
	}
}
