package com.example.javacoursetasks.abstraction.abstractclass;

public class Test {

	public static void main(String[] args) {
		
		SubClassA abstractObjA = new SubClassA();
		abstractObjA.funcAbstract1();
		abstractObjA.funcNonStatic2();
		System.out.println("\n");
		
		SubClassB abstractObjB = new SubClassB();
		abstractObjB.funcAbstract1();
		abstractObjB.funcNonStatic2();
		System.out.println("\n");
		
		SuperClass.funcStatic3();

	}

}
