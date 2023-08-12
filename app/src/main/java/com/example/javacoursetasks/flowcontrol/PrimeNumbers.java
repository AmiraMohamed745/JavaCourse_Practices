package com.example.javacoursetasks.flowcontrol;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {

		// input provided 
		
		for (int numPrimeCheck = 2; numPrimeCheck <= 60; numPrimeCheck++) {
			boolean primeOrNot = true;
			for (int factor = 2; factor <= Math.sqrt(numPrimeCheck); factor++) {
				if (numPrimeCheck % factor == 0) {
					primeOrNot = false;
					break; // because once the number accepts the evenly division on one of its
							// factors, there is no meaning in checking all its other factors
							// it make the performance better
				}
			} // take care there are two curly braces after the break statement
			if (primeOrNot) { // the  last if statement is written inside the first for loop
				System.out.println(numPrimeCheck + " " + "is a prime number.");
			}
		}
		System.out.println("\n");
		
		
		// input 2 numbers 
		
		System.out.println("Input the first number to check: ");
		int firstNumCheck;
		Scanner sc1 = new Scanner(System.in);
		firstNumCheck = sc1.nextInt();

		System.out.println("Input the last number to check: ");
		int lastNumCheck;
		Scanner sc2 = new Scanner(System.in);
		lastNumCheck = sc2.nextInt();

		for (; firstNumCheck <= lastNumCheck; firstNumCheck++) {
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
		}

		
		// output of an exact number of primes, like the first 50 primes between the limits
		
		}
	}


