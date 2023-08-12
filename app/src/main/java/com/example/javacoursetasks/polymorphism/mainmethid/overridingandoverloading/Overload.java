package com.example.javacoursetasks.polymorphism.mainmethid.overridingandoverloading;

public class Overload {
	
	final int age;
	
	public Overload(int age) {
		this.age = age;
	}

	public static void main(String[] args) {

		System.out.println("This is the default main method");
		main('a');
		Overload obj = new Overload(10);
		System.out.println(obj.age);
	}
	
	public static void main(char args) {
		System.out.println("This is the overloaded main method");
		
	}

}
