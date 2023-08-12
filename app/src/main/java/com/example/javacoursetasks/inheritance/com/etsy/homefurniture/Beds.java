package com.example.javacoursetasks.inheritance.com.etsy.homefurniture;

public class Beds extends FurnitureSuperclass {

	String woodType;
	boolean comesWithMatress;

	public Beds(String name, String manufacturer, int yearOfManufacturing, String woodType, boolean comesWithMatress,
			String price, String deliveryFees) {
		super(name, manufacturer, yearOfManufacturing, price, deliveryFees);
		this.woodType = woodType;
		this.comesWithMatress = comesWithMatress;
	}
	
	@Override
	protected void display() {
		super.display();
		System.out.println("Wood: " + woodType);
		System.out.println("Comes with a matress: " + comesWithMatress);
	}

}
