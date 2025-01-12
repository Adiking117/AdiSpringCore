package com.adi.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Component
@RequestMapping("/hello")	
public class HelloController {
	// http://localhost:8000/SimpleSpringMVCWeb/mvc/hello
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView hello() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("message","Welcome to Adiking MVC");
		modelAndView.setViewName("hello");
		// request.setAttribute("message","Welcome to Adiking MVC");
		return modelAndView;
	}
	
	// http://localhost:8000/SimpleSpringMVCWeb/mvc/hello/requestParam?userName=Adi&age=22
	@GetMapping("requestParam")
	public ModelAndView helloRequestParam(@RequestParam String userName,@RequestParam int age) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("message","Welcome "+ userName + " your age is "+ age);
		modelAndView.setViewName("hello");
		return modelAndView;
	}
	
	// http://localhost:8000/SimpleSpringMVCWeb/mvc/hello/pathVariable/Adi/22
	@GetMapping("pathVariable/{userName}/{age}")
	public ModelAndView helloPathVariable(@PathVariable String userName,@PathVariable int age) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("message","Welcome "+ userName + " your age is "+ age);
		modelAndView.setViewName("hello");
		return modelAndView;
	}
	
}
