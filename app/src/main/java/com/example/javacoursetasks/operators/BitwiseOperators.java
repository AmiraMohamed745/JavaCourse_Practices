package com.example.javacoursetasks.operators;

public class BitwiseOperators {

	public static void main(String[] args) {
		
		Boolean a = true;
		Boolean b = false; 
		int c = 7; // 0111
		int d = 11; // 1011
		int e = 10; 
		int f = 20;
		int g =  100;
		
		System.out.println(a & b); // false
		System.out.println(a | b); // true
		System.out.println(a ^ b); // true
		System.out.println(! a); // false
		System.out.println("\n");
		
		System.out.println(c & d); // 0011 3
		System.out.println(c | d); // 1111 15
		System.out.println(c ^ d); // 1100 12
		System.out.println(! (c < d)); // false
		System.out.println(! (e < c)); // true
		System.out.println(~ d ); // -12
		System.out.println(~ e); // -11
		System.out.println(~ f ); // -21
		System.out.println(~ g); // -101
		
		
		

	}

}
