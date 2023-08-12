package com.example.javacoursetasks.packages.com.amira.inbuiltclasses;
import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		
		System.out.println("Please enter two numbers: ");
		Scanner scanner = new Scanner (System.in);
		String num1 = scanner.nextLine();
		int firstNum = Integer.parseInt(num1);
		int secondNum = Integer.parseInt(scanner.next());
		int result = firstNum + secondNum;
		
		System.out.println("The sum of the two numbers: " + result);
		scanner.close();
		
		

	}

}
