package com.example.javacoursetasks.abstraction.abstractclass;

public class SubClassA extends SuperClass {

	@Override
	void funcAbstract1() {
		System.out.println("Inside the funcAbstract A ");
	}
	
	@Override
	void funcNonStatic2() {
		super.funcNonStatic2();
		System.out.println("Inside the funcNonStatic A ");
	}
	
	

}
