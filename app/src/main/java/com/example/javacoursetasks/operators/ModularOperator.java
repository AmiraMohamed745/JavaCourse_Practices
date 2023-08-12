package com.example.javacoursetasks.operators;

public class ModularOperator {

	public static void main(String[] args) {
		
		// reverse with while loop
		
		int number1 = 9876, reverse1 = 0;
		while (number1 != 0) {
			
			int remainder1 = number1 % 10;
			reverse1 = reverse1 * 10 + remainder1;
			number1 = number1 / 10;
		}
		
		System.out.println(reverse1);
		System.out.println("\n");
		
		// reverse with for loop
		
		int number2 = 123456, reverse2 = 0;
		for (; number2 != 0; number2 = number2 / 10) {
			
			int remainder2 = number2 % 10;
			reverse2 = reverse2 * 10 + remainder2;
		}
		
		System.out.println(reverse2);
		System.out.println("\n");
		
		// reverse with for loop 2
		
		int number3 = 123456, reverse3 = 0;
		for (; number3 != 0;) {
			
			int remainder3 = number3 % 10;
			reverse3 = reverse3 * 10 + remainder3;
			number3 = number3 / 10;
	}
		System.out.println(reverse3);
		System.out.println("\n");
		
		// reverse with while loop 2nd
		
		int number4 = 369852, reverse4 = 0;
		while (number4 != 0) {
			
			int remainder4 = number4 % 10;
			reverse4 = reverse4 * 10 + remainder4;
			number4 = number4 / 10;
		}
		
		System.out.println(reverse4);
		System.out.println("\n");
		
		// reverse with for loop 2nd
		
		int number5 = 124578, reverse5 = 0;
		for (; number5 != 0; number5 = number5 /10) {
			
			int remainder5 = number5 % 10; 
			reverse5 = reverse5 * 10 + remainder5;
		}
		System.out.println(reverse5);
		System.out.println("\n");
		
		// reverse with for loop 2nd 2
		
		int number6 = 147852, reverse6 = 0;
		for(; number6 != 0;) {
			
			int remainder6 = number6 % 10;
			reverse6 = reverse6 * 10 + remainder6;
			number6 = number6 / 10;
		}
		System.out.println(reverse6);
		
		

}
}