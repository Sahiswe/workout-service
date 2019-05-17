package com.dxc.workout.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.workout.model.Category;
import com.dxc.workout.repo.CategoryRepo;

@Service
public class CategoryService {
	
	@Autowired
	CategoryRepo categoryRepo;
	
	public List<Category> getAllCategories(){
		return categoryRepo.findAll();
		
	}
	public boolean addCategory(Category category) {
		if(find_id(category.get_id())!=null) {
			//categoryRepo.deleteById(id);
			return false;
			
		}else {
			categoryRepo.save(category);
			return true;
		}
		
	}
	
	public Category findCategory(String categoryName) {
		return categoryRepo.findByCategoryName(categoryName);
		
	}
	public Category find_id(int _id) {
		return categoryRepo.findBy_id(_id);
	}
	
	public boolean deleteById(int id) {
		if(find_id(id)!=null) {
			categoryRepo.deleteById(id);
			return true;
			
		}else
			return false;
		
	}
	public boolean updateCategory(Category category) {
		
			if(find_id(category.get_id()) !=null){
				return true;
			}else {
					categoryRepo.save(category);
					return false;
				}
		}
	}
	
	

	

