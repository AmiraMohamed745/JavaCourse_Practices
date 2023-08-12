package com.example.javacoursetasks.inheritance.superkeyword.inheritence;

public class Tablets extends ElectronicDevices {

	public Tablets(String name, String manufacturer, String os, int lifespan, boolean isUsed) {
		super(name, manufacturer, os, lifespan, isUsed);
	}

	@Override
	public void display() {
		super.display();
	}

}
