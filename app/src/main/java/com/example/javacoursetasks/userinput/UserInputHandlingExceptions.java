package com.example.javacoursetasks.userinput;

import java.util.Scanner;

public class UserInputHandlingExceptions {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter your name: ");
		String name = scanner.nextLine();

		int intAge = 0;
		boolean validAge = false;
		do {
			System.out.println("Please enter your age: ");
			String age = scanner.nextLine();
			try {
				intAge = Integer.parseInt(age);
				validAge = true;
			} catch (NumberFormatException nfe) {
				System.out.println("Please enter a valid age");
			}
		} while (validAge == false);

		float floatSize = 0.0f;
		boolean validSize = false;
		do {
			System.out.println("Please enter your size: ");
			String size = scanner.nextLine();
			try {
				floatSize = Float.parseFloat(size);
				validSize = true;
			} catch (NumberFormatException nfe) {
				System.out.println("Please enter a valid size");
			}
		} while (validSize == false);

		float floatExpectedPrice = 0.0f;
		boolean validExpectedPrice = false;
		do {
			System.out.println("Please enter your expected price: ");
			String expectedPrice = scanner.nextLine();
			try {
				floatExpectedPrice = Float.parseFloat(expectedPrice);
				validExpectedPrice = true;
			} catch (NumberFormatException nfe) {
				System.out.println("Please enter a valid price");
			}
		} while (validExpectedPrice == false);

		System.out.println("Please enter your address: ");
		String address = scanner.nextLine();
		System.out.println("\n");

		System.out.println("Name: " + name);
		System.out.println("Age: " + intAge);
		System.out.println("Size: " + floatSize);
		System.out.println("Expected Price: " + floatExpectedPrice);
		System.out.println("Address: " + address);

		scanner.close();

	}

}
