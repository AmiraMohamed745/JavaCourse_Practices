package com.example.javacoursetasks.operators;

public class BMICalculator {

	public static void main(String[] args) {
		
		double weight = 60;
		double height = 1.5; 
		
		double BMI = weight / (height * height);
		System.out.println(BMI);
		
		double weight2 = 85;
		double heightInFeet2 = 6.2;
		double heightInMeters2 = heightInFeet2 * 0.3048;
		double BMI2 = weight2 / (heightInMeters2 * heightInMeters2);
		System.out.println(BMI2);
				
		

	}

}
