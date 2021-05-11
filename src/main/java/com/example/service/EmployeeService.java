package com.example.service;

import java.util.List;

import com.example.model.Employee;

public interface EmployeeService {
	
	public List<Employee> getEmployees();
	
	public Employee postEmployee(Employee employee);
	
	public void deleteEmployee(long id);

}
