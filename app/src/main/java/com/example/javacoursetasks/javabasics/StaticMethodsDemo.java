package com.example.javacoursetasks.javabasics;

public class StaticMethodsDemo {
	
	
	public static void main(String[] args) {
		
		System.out.println("Welcom to Java!");
		
		method1 ();
		
		method2 ();
	}
	
	static void method1 () {
		
		System.out.println("I am method 1");
	}
	
	static void method2 () {
		
		System.out.println("I am method 2");
		
	}
	
	static {
		
		System.out.println("I am the static block");
		method2 ();
	}
	



}
