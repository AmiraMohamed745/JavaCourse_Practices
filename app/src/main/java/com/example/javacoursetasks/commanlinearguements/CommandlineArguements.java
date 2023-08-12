package com.example.javacoursetasks.commanlinearguements;

public class CommandlineArguements {

	public static void main(String[] args) {
		
		int length = args.length;
		
		if (length > 1) {
			System.out.println("Valid input");
		}
		
		else {
			System.out.println("Invalid input");
		}
		
		for (int x = 1; x < length; x++) {
			
			System.out.println(args[x]);
		}
		
		System.out.println(length);
		
		
		
		
}
}