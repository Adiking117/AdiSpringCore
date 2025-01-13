package com.adi.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.adi.entity.Employee;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	@GetMapping
	public ModelAndView initializeEmployee() {
		ModelAndView modelAndView = new ModelAndView();
		Employee employee = new Employee();
		modelAndView.addObject("employee",employee);
		modelAndView.setViewName("emp");
		
		return modelAndView;
	}
	
}
