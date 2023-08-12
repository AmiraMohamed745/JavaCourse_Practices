package com.example.javacoursetasks.packages.com.amira.staticimports;
import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Integer.*;


public class StaticImports {

	public static void main(String[] args) {
		
		out.println("Please enter two numbers: ");
		Scanner scanner = new Scanner (in);
		int num1 = parseInt(scanner.next());
		int num2 = parseInt(scanner.next());
		int result = num1 + num2;
		
		System.out.println("The sum of the two numbers: " + result);
		scanner.close();
		

	}

}
