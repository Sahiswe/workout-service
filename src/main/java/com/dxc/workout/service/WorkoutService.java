package com.dxc.workout.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.workout.model.Category;
import com.dxc.workout.model.Workout;
import com.dxc.workout.repo.WorkoutRepo;

@Service
public class WorkoutService {
	@Autowired
	WorkoutRepo workoutRepo;
	public List<Workout> getAllWorkout(){
		return workoutRepo.findAll();
		
	}
	public boolean addWorkout(Workout workout) {
		if(findId(workout.get_id())!=null) {
		
			return false;
			
		}else {
			workoutRepo.save(workout);
			return true;
		}
	
	}
	public Workout findWorkout(String workout_title) {
		return workoutRepo.findByWorkoutTitle(workout_title);
		
	}
	public Workout findId(int _id) {
		return workoutRepo.findBy_id(_id);
		
	}
	
	public boolean deleteById(int id) {
		if(findId(id)!=null) {
			workoutRepo.deleteById(id);
			return true;
			
		}else
			return false;
		
	}
	public boolean updateWorkout(Workout workout) {
		
		if(findId(workout.get_id()) !=null){
			return true;
		}else {
				workoutRepo.save(workout);
				return false;
			}
	}
	
}
	//private Object findId(int get_id) {
		// TODO Auto-generated method stub
		//return null;
	//}
