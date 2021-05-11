package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Employee;
import com.example.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	
	public List<Employee> getEmployees(){
		return employeeRepository.findAll();
	}
	
	public Employee postEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}
	
	public void deleteEmployee(long id) {
		 employeeRepository.deleteById(id);;
	}

}
