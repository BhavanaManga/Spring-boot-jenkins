package com.verizon.docker.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.verizon.docker.entity.ProductService;

@Repository
public interface ProductRepository extends CrudRepository<ProductService, Integer> {

	Object save(Integer productId);

}
