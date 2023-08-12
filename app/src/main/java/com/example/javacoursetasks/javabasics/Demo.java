package com.example.javacoursetasks.javabasics;

public class Demo {
	
	static Demo obj = new Demo(); 
	
	static {
		
		System.out.println(Demo.obj);
		Demo.obj = new Demo();
		
		 	}
	
		public static void main(String[] args) {
		
			System.out.println(Demo.obj);

	}
		
		static Demo init () {
			
			 return new Demo (); 
		}
		
	
	

	
}
