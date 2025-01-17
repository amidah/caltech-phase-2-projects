package com.learning.microservice.springbootmysql.respository;

import org.springframework.data.repository.CrudRepository;

import com.learning.microservice.springbootmysql.model.Product;

public interface ProductRepository extends CrudRepository<Product, Integer>{

}
