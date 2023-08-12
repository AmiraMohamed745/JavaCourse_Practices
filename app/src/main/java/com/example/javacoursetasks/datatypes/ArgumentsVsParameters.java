package com.example.javacoursetasks.datatypes;

public class ArgumentsVsParameters {
	
	static void myMethod (String fname, int age) {
		System.out.println(fname + " is " + age);
	}

	public static void main(String[] args) {
		
		myMethod ("Amira" , 20);

	}

}
