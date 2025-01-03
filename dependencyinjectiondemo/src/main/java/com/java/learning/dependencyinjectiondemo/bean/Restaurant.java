package com.java.learning.dependencyinjectiondemo.bean;

public class Restaurant {

	String name;
	String phone;
	String operatingHours;
	float ratings;
	// Reference Type and will hold the hashcode for some Address object in the Restaurant Object
	Address address; // HAS-A Relationship | 1 - 1 | A Restaurant has a Address
	
	public Restaurant() {
		System.out.println("[Restaurant] - Object Constructed");
	}
	
	// Parameterized Constructor with only one argument for Address
	// This is to fulfill the dependency Address
	// Constructor Injection
	public Restaurant(Address address) {
		System.out.println("[Restaurant] - Object Constructed - Paramterized Constructor with Address as an Input");
		System.out.println("[Restaurant] - Constructor Injection");
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getOperatingHours() {
		return operatingHours;
	}

	public void setOperatingHours(String operatingHours) {
		this.operatingHours = operatingHours;
	}

	public float getRatings() {
		return ratings;
	}

	public void setRatings(float ratings) {
		this.ratings = ratings;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Restaurant [name=" + name + ", phone=" + phone + ", operatingHours=" + operatingHours + ", ratings="
				+ ratings + ", address=" + address + "]";
	}
	
	
	
}
