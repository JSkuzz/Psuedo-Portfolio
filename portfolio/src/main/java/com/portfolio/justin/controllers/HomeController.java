package com.portfolio.justin.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String landing() {
		return "portfolio.jsp";
	}
	
}
