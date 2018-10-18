package com.keiko.manytomany.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.keiko.manytomany.models.Category;

@Repository
public interface CategoryRepo extends CrudRepository<Category, Long>{

	Category findOne(Long id);

}
