package com.example.javacoursetasks.flowcontrol;

import java.util.Scanner;

public class PrimeNumbersSpecifyingHowmanyPrimes {

	public static void main(String[] args) {
		
		// output of an exact number of primes, like the first 50 primes between the limits

		System.out.println("Input the first number to check: ");
		int firstNumCheck;
		Scanner sc1 = new Scanner(System.in);
		firstNumCheck = sc1.nextInt();

		System.out.println("Input the last number to check: ");
		int lastNumCheck;
		Scanner sc2 = new Scanner(System.in);
		lastNumCheck = sc2.nextInt();

		int count = 0; // the count of the number of result starts at 0 (5)
		int countLimit = 12; // the programme is allowed to check only 12 numbers starting with the
								// firstNumCheck

		while (true) {
			boolean isPrime = true;
			for (int factor = 2; factor <= firstNumCheck / 2; factor++) {
				if (firstNumCheck % factor == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.println(firstNumCheck + " " + "is a prime number");
			}
			count++; // to increment the count from 0
			if (count >= countLimit) { // the programme will only check 11 numbers starting from firstNumCheck
				break;
			}
			firstNumCheck++; // the firstNumCheck will be increment by 1 till exceeds the count trials
		}
			
		
	}

}

