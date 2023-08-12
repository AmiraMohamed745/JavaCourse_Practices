package com.example.javacoursetasks.inheritance.superkeyword.inheritence;

public class Laptops extends ElectronicDevices {

	String battery;
	
	public Laptops(String name, String manufacturer, String os, String battery, int lifespan, boolean isUsed) {
		super(name, manufacturer, os, lifespan, isUsed);
		this.battery = battery;
	}

	@Override
	public void display() {
		super.display();
		System.out.println("Battery: " + battery);
	}

}
