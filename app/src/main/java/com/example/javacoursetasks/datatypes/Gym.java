package com.example.javacoursetasks.datatypes;

public class Gym {

	static String gymName = "Let's Get Fit!";
	String traineeName;
	int traineeId;
	boolean active;
	
	public static void main(String[] args) {
		
		int sessionsNum = 4;
		
		Gym gymMember = new Gym();
		gymMember.traineeName = "Laila";
		gymMember.traineeId = 1153;
		gymMember.active = true;
		
		System.out.println("Gym: " + Gym.gymName);
		System.out.println("Trainee Name: " + gymMember.traineeName);
		System.out.println("Trainee ID: " + gymMember.traineeId);
		System.out.println("Sessions: " + sessionsNum);
		System.out.println("Trainee State: " + gymMember.active);
		
		
				
		
		

	}

}
