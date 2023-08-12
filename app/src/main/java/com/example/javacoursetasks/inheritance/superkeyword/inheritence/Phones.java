package com.example.javacoursetasks.inheritance.superkeyword.inheritence;

public class Phones extends ElectronicDevices {

	public Phones(String name, String manufacturer, String os, int lifespan, boolean isUsed) {
		super(name, manufacturer, os, lifespan, isUsed);
	}

	@Override
	public void display() {
		super.display();
	}

}
