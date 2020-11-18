package com.wf.training.spring.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	//dashboard for employee
	// @RequestMapping("/home")  // /employee/home
	// multiple url can be mapped
	@RequestMapping(value= {"/home","/dashboard","/index"})  // /employee/home
	public String home() {
		// business logic
		
		return "employee-home";
	}
	
	// default mapping for parent url
	@RequestMapping()
	public String defaultResponse() {
		// return "employee-base";
		return "redirect:/employee/home";// ~sendRedirect()
	}
	
	// fallback url mapping
	@RequestMapping("*")
	public String fallback() {
		// return "employee-error";
		return "redirect:/employee/home";// ~sendRedirect()
	}
	
	
}
