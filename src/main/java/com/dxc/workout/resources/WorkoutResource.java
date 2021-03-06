package com.dxc.workout.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
import com.dxc.workout.model.Workout;

import com.dxc.workout.service.WorkoutService;

@CrossOrigin
@RestController
@RequestMapping("/api/v1")

public class WorkoutResource {
	@Autowired
	WorkoutService workoutService;

	@GetMapping("/all")
	public List<Workout> getAll() {
		return workoutService.getAllWorkout();
	}

	@PostMapping("/workout/add")
	public void addWorkout(@RequestBody Workout workout) {
		workoutService.addWorkout(workout);
	}

	@GetMapping("/workout/find/{_id}")
	public Workout findWorkoutById(@PathVariable("_id") int _id) {
		return workoutService.findId(_id);
	}

	@DeleteMapping("/workout/delete/{id}")
	public void deleteWorkoutById(@PathVariable("id") int id) {
		workoutService.deleteById(id);
	}

	@PutMapping("workout/update")
	public void updateWorkout(@RequestBody Workout workout) {
		workoutService.updateWorkout(workout);
	}

}
