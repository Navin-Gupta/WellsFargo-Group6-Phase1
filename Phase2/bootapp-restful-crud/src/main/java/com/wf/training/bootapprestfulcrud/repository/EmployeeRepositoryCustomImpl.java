package com.wf.training.bootapprestfulcrud.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;

import com.wf.training.bootapprestfulcrud.entity.Employee;

public class EmployeeRepositoryCustomImpl implements EmployeeRepositoryCustom{

	// special bean exposed by JPA
	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<Employee> veryComplexBusinessLogicRequirement(String email) {
		// TODO Auto-generated method stub
		
		return null;
	}

}
