package com.example.javacoursetasks.inheritance.com.etsy.homefurniture;

public class Sofas extends FurnitureSuperclass {

	String color;
	boolean isFoldable;

	public Sofas(String name, String manufacturer, int yearOfManufacturing, String price, String deliveryFees,
			String color, boolean isFoldable) {
		super(name, manufacturer, yearOfManufacturing, price, deliveryFees);
		this.color = color;
		this.isFoldable = isFoldable;
	}

	@Override
	protected void display() {
		super.display();
		System.out.println("Color: " + color);
		System.out.println("Foldability status: " + isFoldable);

	}
}
