package com.example.javacoursetasks.operators;

public class StringConcatenation2 {

	public static void main(String[] args) {
		
		String letters1= "abc", letters2 = "def";
		System.out.println(letters1 + letters2);
		System.out.println("\n");
		
		int int1 = 10, int2 = 70, int3 = 30;
		System.out.println(int1 + int2 + int3);
		System.out.println("\n");
		
		System.out.println(letters1 + int1 + int2);
		System.out.println("\n");
		
		System.out.println(int1 + int2 + letters2);
		System.out.println("\n");
		
		System.out.println(int1 + int3 + letters1 + int2 + int1);
		System.out.println("\n");
	}

}
