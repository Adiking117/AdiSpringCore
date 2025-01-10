package com.adi.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.adi.employee.Employee;
import com.adi.employee.Stage;

public class SpringTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("payroll.xml");
		System.out.println("-------------Spring Context Loaded--------------");
		
		Employee emp1 = context.getBean("emp1",Employee.class);
		System.out.println(emp1);
		
		Employee emp2 = context.getBean("emp2",Employee.class);
		System.out.println(emp2);
		
		Employee emp2_1 = context.getBean("emp2", Employee.class);
		Employee emp2_2 = context.getBean("emp2", Employee.class);
		System.out.println("emp2_1 == emp2_2: " + (emp2_1 == emp2_2)); 
		// False, new instance each time

		Employee emp3 = context.getBean("emp3",Employee.class);
		System.out.println(emp3);
		
		Employee emp4 = context.getBean("emp4",Employee.class);
		System.out.println(emp4);
		
		Employee emp4_1 = context.getBean("emp4", Employee.class);
		Employee emp4_2 = context.getBean("emp4", Employee.class);
		System.out.println("emp4_1 == emp4_2: " + (emp4_1 == emp4_2)); 
		// True, same instance
		
		/*
		 * Aspect	lazy-init="true"																	scope="prototype"
Instance Creation	A single instance is created only when the bean is accessed for the first time.		A new instance is created every time the bean is requested.
Singleton Nature	Still a singleton by default, but the instantiation is deferred.					Always creates a new instance, no matter how many times it is accessed.
		 */
		Stage s1 = context.getBean("stage1",Stage.class);
		Stage s2 = context.getBean("stage2",Stage.class);
		System.out.println(s1 == s2);
		
		Employee emp5 = context.getBean("emp5",Employee.class);
		System.out.println(emp5);

	}
}
