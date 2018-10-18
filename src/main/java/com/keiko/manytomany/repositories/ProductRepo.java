package com.keiko.manytomany.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.keiko.manytomany.models.Product;

@Repository
public interface ProductRepo extends CrudRepository<Product, Long>{

	Product findOne(Long productId);
	
}
