package com.example.javacoursetasks.abstraction.interfaces;

public class SubClassA implements SuperClass, SuperClassTwo {

	@Override
	public void func1() {
		System.out.println("Inside interface SubClassA func1");
		System.out.println(SuperClassTwo.num);
	}

	@Override
	public void func2() {
		System.out.println("Inside interface SubClassA func2");
	}

	@Override
	public void func3() {
		System.out.println("Inside interface SubClassA func3");
	}

	@Override
	public void func4() {

	}

	@Override
	public void func4(String name) {

	}

}
