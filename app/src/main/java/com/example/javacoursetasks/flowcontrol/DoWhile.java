package com.example.javacoursetasks.flowcontrol;

public class DoWhile {

	public static void main(String[] args) {
		
		int num1 = 5;
		do {
			System.out.println("Iteration: " + num1++); // 5
			System.out.println("Iteration: " + num1++); // 6
		} while (num1 <= 11);

		
		int num2 = 3;
		do {
			if (num2 % 2 != 0) {
				System.out.println(num2);
			}
			++num2;
		} while (num2 < 13);
		
		int donationAmount = 5000;
		do {
			if (donationAmount <= 5000) {
				System.out.println("Donation amount is: " + donationAmount);
			}
			donationAmount += 5000;
			System.out.println("Donation amount is: " + donationAmount); // without this ← sysout line, nothing will come out
		} while (donationAmount < 20000);

	}

}
