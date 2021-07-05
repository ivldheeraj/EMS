package com.ems.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ems.model.Employee;

@Service
public interface EmployeeService {
	
	List<Employee> getAllEmployees();

	public Employee saveEmployee(Employee employee);
	
	public Employee getEmployeeById(Long id);
	
	public void deleteEmployeeById(Long id);
}
