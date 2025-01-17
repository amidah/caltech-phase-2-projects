package com.learning.microservice.springbootmysql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.learning.microservice.springbootmysql.model.Product;
import com.learning.microservice.springbootmysql.model.Response;
import com.learning.microservice.springbootmysql.respository.ProductRepository;

@RestController
@RequestMapping(path="/products")
public class ProductController {

	@Autowired
	ProductRepository productRepository;
	
	@PostMapping(path="/add")
	public ResponseEntity<Response> addProduct(@RequestParam String name, @RequestParam String brandName, @RequestParam Integer price) {
	
		Product product = new Product(null, name, brandName, price);
		System.out.println(product);
		
		try {
		
			productRepository.save(product);
			
			Response response = new Response(101, "Product-" + name + " saved successfully.");
		
		    return new ResponseEntity<Response>(response, HttpStatus.OK);
		}
		catch (Exception e) {
			Response response = new Response(701, "Product-" + name + " not saved successfully.");
					
			return new ResponseEntity<Response>(response, HttpStatus.OK);
		}
	}
	
	@GetMapping
	public List<Product> getAllProducts(){
		return (List<Product>) productRepository.findAll();
	}
	
	@GetMapping(path="/{id}")
	public ResponseEntity<Product> getProductById(@PathVariable Integer id) {
		
		Product product = productRepository.findById(id).orElse(null); 
		
		return product != null ? ResponseEntity.ok(product) : ResponseEntity.notFound().build();  
	}
	
	@PutMapping(path="/{id}")
	public ResponseEntity<Response> updateProduct(@PathVariable Integer id, @RequestBody Product product){
		
		Product existingProduct = productRepository.findById(id).orElse(null);
		
		if(existingProduct != null) {
			existingProduct.setName(product.getName());
			existingProduct.setBrandName(product.getBrandName());
			existingProduct.setPrice(product.getPrice());
			
			productRepository.save(existingProduct);
			
			Response response = new Response(102, "Product-" + id + " updated successfully.");
			
		    return new ResponseEntity<Response>(response, HttpStatus.OK);
		}
		else {
			Response response = new Response(702, "Product-" + product.getPid() + " not updated successfully.");
			
		    return new ResponseEntity<Response>(response, HttpStatus.OK);
		}
	}
	
	@DeleteMapping(path="/{id}")
	public ResponseEntity<Response> deleteUser(@PathVariable Integer id){
	
		productRepository.deleteById(id);
		
		Response response = new Response(103, "Product-" + id + " deleted successfully.");
		
	    return new ResponseEntity<Response>(response, HttpStatus.OK);
	
	}
}
