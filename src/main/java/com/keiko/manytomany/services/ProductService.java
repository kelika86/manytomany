package com.keiko.manytomany.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.keiko.manytomany.models.Product;
import com.keiko.manytomany.repositories.CategoryRepo;
import com.keiko.manytomany.repositories.ProductRepo;

@Service
public class ProductService {
	private final ProductRepo productRepo;
	
	private final CategoryRepo categoryRepo;
	
	public ProductService(ProductRepo productRepo, CategoryRepo categoryRepo) {
		this.productRepo=productRepo;
		this.categoryRepo=categoryRepo;
	}
	
	public void addProduct(Product product) {
		productRepo.save(product);
	}
	
	public List<Product> getAll(){
		return (List<Product>) productRepo.findAll();
	}
	
	public Product getOne(Long id) {
		return productRepo.findOne(id);
	}
	
	public void update(Product product) {
		productRepo.save(product);
	}
	
	public List<Product> getAllExcept(Long categoryId){
		List <Product> products=this.getAll();
		List <Product> categoryProducts=categoryRepo.findOne(categoryId).getProducts();
		products.removeAll(categoryProducts);
		return products;
	}
}
