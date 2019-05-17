package com.dxc.workout.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Workout {
	@Id
	private int _id;
	private String workoutTitle;
	private float caloriesBurnPerMin;
	private List<Category> categories;
	private List<Details> details;
	
	
	public List<Details> getDetails() {
		return details;
	}
	public void setDetails(List<Details> details) {
		this.details = details;
	}
	private String note;

	public Workout(int _id, String workoutTitle, float caloriesBurnPerMin, List<Category> categories,
			List<Details> details, String note) {
		super();
		this._id = _id;
		this.workoutTitle = workoutTitle;
		this.caloriesBurnPerMin = caloriesBurnPerMin;
		this.categories = categories;
		this.details = details;
		this.note = note;
	}
	public int get_id() {
		return _id;
	}
	public void set_id(int _id) {
		this._id = _id;
	}
	public String getWorkoutTitle() {
		return workoutTitle;
	}
	public void setWorkoutTitle(String workoutTitle) {
		this.workoutTitle = workoutTitle;
	}
	public float getCaloriesBurnPerMin() {
		return caloriesBurnPerMin;
	}
	public void setCaloriesBurn(float caloriesBurnPerMin) {
		this.caloriesBurnPerMin = caloriesBurnPerMin;
	}
	public List<Category> getCategories() {
		return categories;
	}
	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	
}