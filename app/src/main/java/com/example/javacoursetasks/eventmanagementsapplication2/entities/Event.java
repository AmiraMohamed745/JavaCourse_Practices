package com.example.javacoursetasks.eventmanagementsapplication2.entities;

public class Event {
	
	public String name;
	public String description;
	public String startTime;
	public String endTime;
	public Boolean isStarted;
	
	public Event (String name, String description, String startTime, String endTime, Boolean isStarted) {
		this.name = name;
		this.description = description;
		this.startTime = startTime;
		this.endTime = endTime;
		this.isStarted = isStarted;

}
}