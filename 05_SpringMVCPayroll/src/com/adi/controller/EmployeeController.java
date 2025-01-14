package com.adi.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.adi.dao.EmployeeDAO;
import com.adi.entity.Employee;
import com.adi.service.EmployeeService;

@Controller
@RequestMapping("/employee")
@ComponentScan(basePackages = "com.adi.*")
public class EmployeeController {
//	@Autowired
//	EmployeeDAO employeeDAO;
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping
	public ModelAndView initializeEmployee() {
		ModelAndView modelAndView = new ModelAndView();
		Employee employee = new Employee();
		
//		employee.setId(1);
//        employee.setName("John Doe");
//        employee.setEmail("john.doe@example.com");
        
		modelAndView.addObject("employee",employee);
		modelAndView.setViewName("emp");
		
		return modelAndView;
	}
	
	@PostMapping
	public ModelAndView saveEmployeeData(@ModelAttribute Employee employee) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("emp");
		employeeService.saveEmployee(employee);
		modelAndView.addObject("message","Employee Saved Succes");
		
		return modelAndView;
	}
	
//	@ExceptionHandler
//	public ModelAndView handleApplicationException(HttpServletRequest request,Exception e) {
//		ModelAndView modelAndView = new ModelAndView();
//		modelAndView.setViewName("error");
//		
//		modelAndView.addObject("errorMessage",e.getMessage());
//		modelAndView.addObject("url",request.getRequestURI());
//		
//		return modelAndView;
//	}
	
}
