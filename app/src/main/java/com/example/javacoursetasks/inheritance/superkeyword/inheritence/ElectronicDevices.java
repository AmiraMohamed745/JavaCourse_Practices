package com.example.javacoursetasks.inheritance.superkeyword.inheritence;

public class ElectronicDevices {

	String name;
	String manufacturer;
	String os;
	int lifespan;
	boolean isUsed;

	public ElectronicDevices(String name, String manufacturer, String os, int lifespan, boolean isUsed) {
		this.name = name;
		this.manufacturer = manufacturer;
		this.os = os;
		this.lifespan = lifespan;
		this.isUsed = isUsed;
	}

	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Manufacturer: " + manufacturer);
		System.out.println("Operating System: " + os);
		System.out.println("Maximum years of use: " + lifespan);
		System.out.println("Has the device been used before " + isUsed);
	}

}
