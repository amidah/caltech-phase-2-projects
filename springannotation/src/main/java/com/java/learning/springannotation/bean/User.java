package com.java.learning.springannotation.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class User {
	
	String name;
	String email;
	
	Order order; // 1 to 1 relationship mapping
	
	public User() {
		System.out.println("[User] - Object Created");
	}
	
	// here the dependency is satisfied with the help of autowired annotation
	@Autowired
	public User(Order order) {
		System.out.println("[User] - Constructor Injection - Object created with the Parameterized Constructor having order as an Input");
		this.order = order;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", order=" + order + "]";
	}
	

}
