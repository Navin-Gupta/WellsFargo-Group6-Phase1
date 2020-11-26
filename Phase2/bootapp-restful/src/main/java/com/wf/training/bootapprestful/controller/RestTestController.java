package com.wf.training.bootapprestful.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wf.training.bootapprestful.model.Employee;

@RestController
@RequestMapping("/api")
public class RestTestController {

	// REST ENDPOINTS (url) /api/test
	@RequestMapping("/test")
	public String test() {
		// business logic
		return "Hello All";
	}
	
	// REST ENDPOINTS (url) /api/employee
	@RequestMapping("/employee")
	public Employee employee() {
		// business logic
		Employee employee = new Employee("Second", "second@mail.com", "12345678890");
		return employee;
	}
	
}



