package com.example.javacoursetasks.userinput;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String getName, getSize;
		int getAge, getExpectedPrice;

		System.out.println("Please enter your name: "); // is put before the nextLine method
		getName = scanner.nextLine();

		System.out.println("Please enter your size: ");
		getSize = scanner.nextLine();

		System.out.println("Please enter your age: ");
		getAge = scanner.nextInt();

		System.out.println("Please enter your expected price: ");
		getExpectedPrice = scanner.nextInt();
		System.out.println("\n");

		System.out.println("Name: " + getName);
		System.out.println("Age: " + getAge);
		System.out.println("Size: " + getSize);
		System.out.println("Expected Price: " + getExpectedPrice);

		scanner.close();

	}

}
