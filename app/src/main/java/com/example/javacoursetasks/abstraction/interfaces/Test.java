package com.example.javacoursetasks.abstraction.interfaces;

public class Test {

	public static void main(String[] args) {

		SuperClass interfaceObj = new SubClassA();
		interfaceObj.func1();
		interfaceObj.func2();
		interfaceObj.func3();
		System.out.println("\n");
		
		interfaceObj = new SubClassB();
		interfaceObj.func1();
		interfaceObj.func2();
		interfaceObj.func3();

	}

}
