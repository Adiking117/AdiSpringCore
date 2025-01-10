package com.adi.test;

import com.adi.employee.Address;
import com.adi.employee.Employee;

public class NonSpringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address address1 = new Address("Hyderabad","India");
		Employee employee1 = new Employee("Adi",22,"Tester",39262,address1);
		
		System.out.println(employee1);
		
		// this is hardcoded 
		// for new employee new address and new details
		// changes need to be done in this file
		// to avoid changes to be done use spring
		
	}

}
