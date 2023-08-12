package com.example.javacoursetasks.operators;

public class StringConcatenation {

	public static void main(String[] args) {
		
		// concatenation #1
		
		String word1 = "I'm";
		String word2 = "Amira";
		System.out.println(word1 + " " + word2);
		System.out.println("\n");
		
		// concatenation #2
		
		String word3 = "I'm";
		String word4 = "Amira";
		String word5 = word3 + " " + word4;
		System.out.println(word5);
		System.out.println("\n");
		
		// concatenation #3
		
		String word6 = "I'm";
		String word7 = "Amira";
		String word8 = word6 + " ".concat(word7);
		System.out.println(word8);
		System.out.println("\n");
		
		// concatenation #3
		
		String word9 = "I'm";
		String word10 = "Amira";
		System.out.println(word9 + " ".concat(word10));
		
		

	}

}
