package com.example.javacoursetasks.abstraction.abstractclass;

public abstract class SuperClass {
	
	 abstract void funcAbstract1();
	
	void funcNonStatic2() {
		System.out.println("Inside superClass funcNonStatic()");
	}
	
	static void funcStatic3() {
		System.out.println("Inside superClass funcStatic()");
	}

	

}
