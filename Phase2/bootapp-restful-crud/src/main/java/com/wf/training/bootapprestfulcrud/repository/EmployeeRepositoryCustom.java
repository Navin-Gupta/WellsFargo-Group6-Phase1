package com.wf.training.bootapprestfulcrud.repository;

import java.util.List;

import com.wf.training.bootapprestfulcrud.entity.Employee;

public interface EmployeeRepositoryCustom {

	List<Employee> veryComplexBusinessLogicRequirement(String email);
}
