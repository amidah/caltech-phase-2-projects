package com.java.learning.inheritancedemo.bean;

public class FoodItem {
	
	String name;
	int price;

	public FoodItem() {
		System.out.println("[FoodItem] - Object created " + hashCode());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "FoodItem [name=" + name + ", price=" + price + "]";
	}
	
}

