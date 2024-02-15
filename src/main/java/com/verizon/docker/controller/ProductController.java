package com.verizon.docker.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.verizon.docker.entity.ProductService;
import com.verizon.docker.service.ProductServiceServices;


@RestController
@RequestMapping
public class ProductController {

	@Autowired
	ProductServiceServices service;
	
	
	@GetMapping("/products")
	public Iterable<ProductService> getAllProducts() {
		return service.getAllProducts();
	}

	@GetMapping("/products/{productId}")
	   public Optional<ProductService> getProductById(@PathVariable Integer productId) {
			return service.getProductById(productId);
		}
	   
	@PostMapping("/products")
	public void addNewProduct(@RequestBody ProductService product) {
		service.addNewProduct(product);
	}
	
	@PutMapping("/product/{id}")
	public Object updateProductById(@PathVariable Integer productId) {
		return service.updateProductById(productId);
	}
	
	@DeleteMapping("/product/{id}")
	public void deleteProductById(@PathVariable Integer productId) {
		service.deleteProductById(productId);
	}
}
