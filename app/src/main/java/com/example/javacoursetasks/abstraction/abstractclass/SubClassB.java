package com.example.javacoursetasks.abstraction.abstractclass;

public class SubClassB extends SuperClass {

	@Override
	void funcAbstract1() {
		System.out.println("Inside the funcAbstract B ");
	}
	
	@Override
	void funcNonStatic2() {
		super.funcNonStatic2();
		System.out.println("Inside the funcNonStatic B");
	}

}
