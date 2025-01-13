package com.adi;

public class Student {
	String email;
	String name;
	
	
	public Student(String email, String name) {
		this.email = email;
		this.name = name;
	}


	public String getemail() {
		return email;
	}


	public void setemail(String email) {
		this.email = email;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String toString() {
		return "Student [email=" + email + ", name=" + name + "]";
	}
	
	
	
}
