package com.example.javacoursetasks.flowcontrol;

import java.util.Scanner;

public class SquareAndSquareroot {

	public static void main(String[] args) {
			
		double numToSquare;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		numToSquare = sc.nextDouble();

		double square = numToSquare * numToSquare;
		System.out.println("The square of the number is " + square);
		System.out.println("\n");
		
		double numToSquare2;
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter a number: ");
		numToSquare2 = sc2.nextDouble();

		double square2 = Math.pow(numToSquare2, 2);
		System.out.println("The square of the number is " + square2);
		System.out.println("\n");
		
		double numToSquareRoot;
		Scanner sc3 = new Scanner(System.in);
		System.out.println("Enter a number: ");
		numToSquareRoot = sc3.nextDouble();

		double squareRoot = Math.sqrt(numToSquareRoot);
		System.out.println("The square of the number is " + squareRoot);
		System.out.println("\n");
		
		double numToSquareRoot2;
		Scanner sc4 = new Scanner(System.in);
		System.out.println("Enter a number: ");
		numToSquareRoot2 = sc4.nextDouble();

		double squareRoot2 = Math.pow(numToSquareRoot2, 0.5);
		System.out.println("The square of the number is " + squareRoot2);
		System.out.println("\n");
		
		

	
		
		
		
		
	}

}
