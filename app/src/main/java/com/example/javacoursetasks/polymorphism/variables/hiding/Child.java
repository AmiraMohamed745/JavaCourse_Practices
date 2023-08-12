package com.example.javacoursetasks.polymorphism.variables.hiding;

public class Child extends Parent {

	int studentNum = 600;
	
	@Override
	void displayResult() {
		System.out.println(studentNum);	
		System.out.println(super.studentNum);

	}
}
