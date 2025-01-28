package com.learning.springbooteurekaclientdemo.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.springbooteurekaclientdemo.model.Product;
import com.learning.springbooteurekaclientdemo.model.Response;

@RestController
@RequestMapping(path = "/app")
public class AppController {

	@GetMapping(path="/products")
	public Response getProducts() {
		
		Product p1 = new Product("Apple Iphone", 90000);
		Product p2 = new Product("Apple Watch", 70000);
		Product p3 = new Product("Apple Pods", 50000);
		Product p4 = new Product("Apple Macbook", 100000);
		Product p5 = new Product("Google Phone", 40000);
		
		ArrayList<Product> products = new ArrayList<Product>();
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		products.add(p5);
		
		Response response = new Response(101, "Products Fetched Successfully", products);
		
		return response;
	}
}
