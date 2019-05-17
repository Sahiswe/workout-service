package com.dxc.workout.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.dxc.workout.model.Category;

public interface CategoryRepo extends MongoRepository<Category, Integer>{
	public Category findByCategoryName(String categoryName);
	public Category findBy_id(int _id);
	//public void deleteBy_id(int id);

	

}
