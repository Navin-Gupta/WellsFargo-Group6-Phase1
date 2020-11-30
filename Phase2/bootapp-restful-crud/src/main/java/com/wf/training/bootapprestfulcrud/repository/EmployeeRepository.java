package com.wf.training.bootapprestfulcrud.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.wf.training.bootapprestfulcrud.entity.Employee;

// @Component
@Repository
public interface EmployeeRepository 
			extends JpaRepository<Employee, Long>, EmployeeRepositoryCustom{
    // nothing to add
	List<Employee> findByEmail(String email);
	List<Employee> findByBasicSalaryGreaterThan(Double basicPay);
	
	// JPQL : almost same as SQL
	// Employee : entity name
	// placeholder   :<variable name>
	@Query("select e from Employee e where e.basicSalary >:pay and e.email=:email")
	List<Employee> findByComplexRequirement(@Param("pay")Double pay, @Param("email")String email);
	
	
}

/*
 * Custom DAO implementation
 * 
 * 1. Naming Convention : add a appropriately named method, implementation would be provided
 * 2. Query Implementation
 * 3. Custom interface with implementation which can be plugged with existing interface
 */

