package com.example.javacoursetasks.wrapperclasses;

public class PrimitiveAndObject3 {

	public static void main(String[] args) {
		
		Short short1 = 32_000; // autoboxing; declaring a wrapper class immediately without mentioning the primitive data type or valueOf() method
		System.out.println(short1);
		
		Float float1 = new Float (12.36f); // the constructor is deprecated and thus java doesn't accept it
		System.out.println(float1);
		
		Double double1 = Double.valueOf(1234.569); // converting primitive to wrapper class without mentioning the primitive
		System.out.println(double1);

	}

}
