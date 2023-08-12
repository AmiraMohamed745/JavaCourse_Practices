package com.example.javacoursetasks.userinput;

import java.util.Scanner;

public class UserInputWithParsing {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your name: ");
		String name = scanner.nextLine();
		System.out.println("Please enter your age: ");
		String age = scanner.nextLine();
		System.out.println("Please enter your size: ");
		String size = scanner.nextLine();
		System.out.println("Please enter your expected price: ");
		String expectedPrice = scanner.nextLine();
		System.out.println("Please enter your shipping address: ");
		String shippingAddress = scanner.nextLine();

		int intAge = Integer.parseInt(age);
		float floatSize = Float.parseFloat(size);
		float floatExpectedPrice = Float.parseFloat(expectedPrice);

		System.out.println("Name: " + name);
		System.out.println("Age: " + intAge);
		System.out.println("Size: " + floatSize);
		System.out.println("Expected price: " + floatExpectedPrice);
		System.out.println("Shipping address: " + shippingAddress);

		scanner.close();
	}

}
