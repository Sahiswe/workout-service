package com.dxc.workout.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.workout.model.Category;
import com.dxc.workout.service.CategoryService;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/workout")
public class CategoryResources {
	
	@Autowired
	CategoryService categoryService;
	@GetMapping("/all")
	public List<Category> getAll(){
		return categoryService.getAllCategories();
	}
	
	@PostMapping("/category/add")
	public void addCategory(@RequestBody Category category) {
		categoryService.addCategory(category);
	}
	
	@GetMapping("/category/find/{category}")
	public Category findCategoryByName(@PathVariable("category") String categoryName) {
		return categoryService.findCategory(categoryName);
	
	}
	@GetMapping("/category/find/{_id}")
	public Category findCategoryById(@PathVariable("_id") int _id) {
		return categoryService.find_id(_id);
	}
	
	@DeleteMapping("/category/delete/{id}")
	public void deleteCategoryById(@PathVariable("id") int id) {
		categoryService.deleteById(id);
	}
	@PutMapping("/category/update")
	public void updateCategory(@RequestBody Category category) {
		categoryService.updateCategory(category);
	}
	
	
}
