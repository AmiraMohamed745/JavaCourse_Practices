package com.example.javacoursetasks.flowcontrol;

public class Break {
	
	public static void main(String[] args) {
		
		for (int donationAmount = 5000; donationAmount <= 20000; donationAmount += 5000) {
			if (donationAmount > 19000) {
				break;
			}
			System.out.println("Your donation: " + donationAmount);
		}

		for (int plantsNum = 2; plantsNum <= 30; ++plantsNum) {
			if (plantsNum >= 10) {
				break;
			}
			System.out.println("You have " + plantsNum + " plants.");
		}
		
		int studentAge = 19;

		StudentAge: {
			System.out.println("Enter your age: ");
			if (studentAge < 18) {
				break StudentAge;
			}
			System.out.println("Welcome on board!");
		}
		

}}
