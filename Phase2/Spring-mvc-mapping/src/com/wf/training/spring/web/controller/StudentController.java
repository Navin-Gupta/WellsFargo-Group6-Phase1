package com.wf.training.spring.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	// url mapping for student dashboard
	@RequestMapping("/home") // /student/home
	public String home() {
		return "student-home";
	}
}
