package com.example.javacoursetasks.inheritance.com.etsy.homefurniture;

public class Lamps extends FurnitureSuperclass {

	String bulbType;

	public Lamps(String name, String manufacturer, int yearOfManufacturing, String price, String deliveryFees,
			String bulbType) {
		super(name, manufacturer, yearOfManufacturing, price, deliveryFees);
		this.bulbType = bulbType;
	}

	@Override
	protected void display() {
		super.display();
		System.out.println("Bulb type: " + bulbType);
	}
}
