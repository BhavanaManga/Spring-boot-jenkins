package com.verizon.docker.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.verizon.docker.entity.ProductService;
import com.verizon.docker.repository.ProductRepository;

@Service
public class ProductServiceServices {
	
	@Autowired
	ProductRepository repository;
	
	public Iterable<ProductService> getAllProducts() {
		return repository.findAll();
	}
	
   public Optional<ProductService> getProductById(Integer productId) {
		return repository.findById(productId);
	}

	public void addNewProduct(ProductService product) {
		repository.save(product);
	}
	
	public Object updateProductById(Integer productId) {
		return repository.save(productId);
	}
	
	public void deleteProductById(Integer productId) {
		 repository.deleteById(productId);
	}
}
