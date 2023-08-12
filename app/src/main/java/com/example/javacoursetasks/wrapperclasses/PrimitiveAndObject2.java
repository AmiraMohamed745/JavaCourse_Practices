package com.example.javacoursetasks.wrapperclasses;

public class PrimitiveAndObject2 {

	public static void main(String[] args) {
		
		long c = 10_000; // primitive data type
		Long long1 = c; // converting it to wrapper class without the valueOf() method
		System.out.println(long1);
		
		long d = long1; // converting the wrapper class back to primitive without using longValue() method
		System.out.println(d);
		
		long f = long1.longValue(); // converting the wrapper class back to primitive  longValue() method
		System.out.println(f);
		
		char e = 'k';
		Character character1 = e;
		System.out.println(character1);
		
		

	}

}
