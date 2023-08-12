package com.example.javacoursetasks.flowcontrol;

public class Switch {

	public static void main(String[] args) {
		
		int periodDays = 6;
		double carbonFootprint;

		switch (periodDays) {

		case 1:
			carbonFootprint = 123_000;
			break;
		case 2:
			carbonFootprint = 130_000;
			break;
		case 3:
			carbonFootprint = 135_000;
			break;
		case 4:
			carbonFootprint = 140_000;
			break;
		case 5:
			carbonFootprint = 150_000;
			break;
		case 6:
			carbonFootprint = 160_000;
			break;
		default:
			carbonFootprint = 0;
		}
		System.out.println("Your period carbon footprint is " + carbonFootprint);
		System.out.println("\n");
		
		
		
		int periodDays2 = 3;
		double carbonFootprint2;

		switch (periodDays2) {

		case 1:
		case 2:
		case 3:
		case 4:
		case 5: // 6 results will be applied to all the above which is called a common logic
		case 6:
			carbonFootprint2 = 160_000;
			break;
		default:
			carbonFootprint2 = 0;
		}
		System.out.println("Your period carbon footprint is " + carbonFootprint2);
		System.out.println("\n");

		
		int classNum = 4;
		int studentNum;

		switch (classNum) {

		case 1: // 32
		case 3: // 32 
		case 6: // 32
			studentNum = 32;
			break;
		case 2: // 35
		case 4: // 35
		case 5:
			studentNum = 35;
			break;
		default:
			studentNum = 0;
		}
		
		System.out.println("Class student number: " + studentNum);
		System.out.println("\n");
		
		// final key word
		
		final int dayNum = 1;
		String dayName;

		switch (dayNum) {

		case dayNum: // using a constant by declaring the final keyword
			dayName = "Saturday";
			break;
		case dayNum + 1:
			dayName = "Sunday";
			break;
		default:
			dayName = "No day specified";
		}
		System.out.println(dayName);
		
		
		}

	}


