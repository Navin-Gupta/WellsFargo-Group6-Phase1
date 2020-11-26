package com.wf.training.bootapprestfulcrud.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wf.training.bootapprestfulcrud.dto.EmployeeInputDto;
import com.wf.training.bootapprestfulcrud.dto.EmployeeOutputDto;

@RestController
@RequestMapping("/api")
public class EmployeeController {

	// fetch all records
	@GetMapping("/employees")
	public List<EmployeeOutputDto> fetchAll() {
		return null;
	}
	
	// fetch a record based on id
	@GetMapping("/employees/{id}")
	public EmployeeOutputDto fetchSingle(@PathVariable Long id) {
		return null;
	}
	
	// add a record
	@PostMapping("/employees")
	public EmployeeOutputDto save(@RequestBody EmployeeInputDto employeeInputDto) {
		return null;
	}
	
	// edit a record
	@PutMapping("/employees/{id}")
	public EmployeeOutputDto update(@PathVariable Long id, 
									@RequestBody EmployeeInputDto employeeInputDto) {
		return null;
	}
	
	// add a record
	@DeleteMapping("/employees/{id}")
	public EmployeeOutputDto delete(@PathVariable Long id) {
		return null;
	}
}













