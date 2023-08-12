package com.example.javacoursetasks.inheritance.com.etsy.homefurniture;

public class FurnitureTest {

	public static void main(String[] args) {

		System.out.println("Beds Section");
		System.out.println("\n");

		FurnitureSuperclass beds = new Beds("GÖRSNYGG", "IKEA of Sweden", 2019, "Akasa Wood", true, "EGP2000", "EGP100.50");
		beds.display();
		System.out.println("\n");

		System.out.println("Sofas Section");
		System.out.println("\n");

		FurnitureSuperclass sofas = new Sofas("EKTORP", "IKEA of Sweden", 2017, "EGP1500", "EGP50.50", "Blue", false);
		sofas.display();
		System.out.println("\n");

		System.out.println("Lamps Section");
		System.out.println("\n");

		FurnitureSuperclass lamps = new Lamps("LAMPAN", "IKEA of Sweden", 2017, "EGP90", "EGP20.50", "Fluorescent");
		lamps.display();
		System.out.println("\n");
	}

}
