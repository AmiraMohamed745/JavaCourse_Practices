package com.example.javacoursetasks.inheritance.com.etsy.homefurniture;

public class FurnitureSuperclass {

	String name;
	String manufacturer;
	int yearOfManufacturing;
	String price;
	String deliveryFees;

	public FurnitureSuperclass(String name, String manufacturer, int yearOfManufacturing, String price,
			String deliveryFees) {
		this.name = name;
		this.manufacturer = manufacturer;
		this.yearOfManufacturing = yearOfManufacturing;
		this.price = price;
		this.deliveryFees = deliveryFees;
	}

	protected void display() {
		System.out.println("Name: " + name);
		System.out.println("Manufacturer: " + manufacturer);
		System.out.println("Year of Manufacturing: " + yearOfManufacturing);
		System.out.println("Price: " + price);
		System.out.println("Delivery Fees: " + deliveryFees);

	}

}
