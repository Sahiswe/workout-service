package com.dxc.workout.repo;

import org.springframework.data.mongodb.repository.MongoRepository;


import com.dxc.workout.model.Workout;

public interface WorkoutRepo extends MongoRepository<Workout, Integer> {
	public Workout findBy_id(int _id);
	public Workout findByWorkoutTitle(String workoutTitle);
	
	

}
