package com.adi.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.adi.dao.EmployeeDAO;
import com.adi.entity.Employee;

@Component
public class EmployeeService {
	@Autowired 
	private EmployeeDAO employeeDAO;
	
	public void saveEmployee(Employee employee) {
	    if (employee.getId() < 0) {
	        throw new IllegalArgumentException("Employee ID must be positive");
	    }
	    if (employee.getName() == null || employee.getName().isEmpty()) {
	        throw new IllegalArgumentException("Employee name cannot be null or empty");
	    }
	    if (employee.getEmail() == null || !employee.getEmail().contains("@")) {
	        throw new IllegalArgumentException("Invalid email address");
	    }
	    employeeDAO.saveEmployee(employee);
	}
	
	public Collection<Employee> getAllEmployees(){
		return employeeDAO.getAllEmployees();
	}

}
