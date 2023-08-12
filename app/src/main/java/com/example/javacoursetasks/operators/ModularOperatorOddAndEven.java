package com.example.javacoursetasks.operators;

public class ModularOperatorOddAndEven {

	public static void main(String[] args) {
		
		int y[] = {40, 45, 46, 59, 71};
		System.out.println("The odd numbers are: ");
		for (int i = 0; i < y.length; ++i ) {
			if (y[i] % 2 != 0) {
				System.out.println(y[i]);
			}
		}
		
		System.out.println("\n");
		System.out.println("The even numbers are: ");
		for (int i = 0; i < y.length; ++i) {
			if (y[i] % 2 == 0) {
				System.out.println(y[i]);
			}
		}
		
}
}
