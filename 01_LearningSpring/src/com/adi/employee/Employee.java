package com.adi.employee;

public class Employee {
	private int id;
	private String name;
	private int age;
	private String designation;
	private double salary;
	
	private static int count = 0;
	
	private Address address; 	// Reference type
	// Employee has a address
	// Containment - Composition 
	
	public Employee() {
		this("", 21, "Fresher", 38000);
	}
	
	public Employee(String name, int age) {
		this(name,age,"Fresher",38000);
	}

	public Employee(String name, int age, String designation, double salary) {
		this(name,age,designation,salary,null);
	}

	public Employee(String name, int age, String designation, double salary, Address address) {
		super();
		this.id = ++count;
		this.name = name;
		this.age = age;
		this.designation = designation;
		this.salary = salary;
		this.address = address;
		System.out.println("The employee with id "+ id + " created");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", designation=" + designation + ", salary="
				+ salary + ", address=" + address + "]";
	}
	
	
	
	
}
