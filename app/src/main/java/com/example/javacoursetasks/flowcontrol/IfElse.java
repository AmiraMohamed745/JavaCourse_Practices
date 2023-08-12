package com.example.javacoursetasks.flowcontrol;

public class IfElse {

	public static void main(String[] args) {
		
		int userAge = 19;
		String haveJoinedAdancedTrackBefore = "Yes";
		
		if (userAge < 18) {
			System.out.println("Sorry, you're not allowed.");
		}
		else {
			System.out.println("Welcome to FWD.");
		}
		System.out.println("\n");
		
		
		if ((userAge > 18) && (haveJoinedAdancedTrackBefore == "Yes")) {
			System.out.println("You can't join the advanced track again.");
		}
		else { 
			System.out.println("Welcome to FWD.");
		}
		System.out.println("\n");
		
		int num1 = 11, num2 = 10;
		if (num1 < num2) {
			System.out.println("Number 2 is greater.");
		}
		else if (num1 == num2) {
			System.out.println("Numbers are equal.");
		}
		else { 
			System.out.println("Number 1 is greater");
		}
		System.out.println("\n");

		
		
		int visitorNum = 1;

		if (visitorNum <= 3) {
			System.out.println("Your fees: " + 200);
		} else if (visitorNum <= 5) {
			System.out.println("Your fees: " + 310);
		} else if (visitorNum <= 15) {
			System.out.println("Your fees: " + 500);
		} else {
			System.out.println("Sorry, you can't book more than 15 seats.");
		}
		System.out.println("\n");

		switch (visitorNum) {
		case 1:
		case 2:
		case 3:
			System.out.println("Your fees: " + 200);
			break;
		case 4:
		case 5:
			System.out.println("Your fees: " + 310);
			break;
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
		case 11:
		case 12:
		case 13:
		case 14:
		case 15:
			System.out.println("Your fees: " + 500);
			break;
		default:
			System.out.println("Sorry, you can't book more than 15 seats.");
		}
		
		
	}

}
