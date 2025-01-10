package com.adi.employee;

public class Address {
	private String id;
	private String city;
	private String country;
	
	private static int count = 0;

	public Address() {
		this("Mumbai", "India");
	}
	
	public Address(String city, String country) {
		super();
		this.id = "A" + ++count;
		this.city = city;
		this.country = country;
		System.out.println("The address with id "+id+" created");
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", city=" + city + ", country=" + country + "]";
	}
	
	
	
	
}
