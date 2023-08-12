package com.example.javacoursetasks.wrapperclasses;

public class PrimitiveAndObject {

	public static void main(String[] args) {
		
		int a = 200; // primitive data type
		Integer int1 = Integer.valueOf(a); // converting it to wrapper class using valueOf() method
		System.out.println(int1);
		
		int c = int1.intValue(); // converting the wrapper class back to primitive using intValue() method
		System.out.println(c);
		
		byte b = 25;
		Byte byte1 = Byte.valueOf(b);
		System.out.println(byte1);
		
		boolean h = true;
		Boolean boolean1 = Boolean.valueOf(h);
		System.out.println(boolean1);
		
		
	     
	}
		
}
