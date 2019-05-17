package com.dxc.workout.model;



import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Details {
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date startDate;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date endDate;
	
	@JsonFormat(pattern="yyyy-MM-dd MM:mm:ss")
	private Date startTime;
	
	@JsonFormat(pattern="yyyy-MM-dd MM:mm:ss")
	private Date endTime;
	private float caloriesBurn;
	
	private boolean status;
	

	

	public Details(Date startDate, Date endDate, Date startTime, Date endTime, float caloriesBurn, boolean status) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
		this.startTime = startTime;
		this.endTime = endTime;
		this.caloriesBurn = caloriesBurn;
		this.status = status;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public float getCaloriesBurn() {
		return caloriesBurn;
	}

	public void setCaloriesBurn(float caloriesBurn) {
		this.caloriesBurn = caloriesBurn;
	}

	

	

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	

	
}
