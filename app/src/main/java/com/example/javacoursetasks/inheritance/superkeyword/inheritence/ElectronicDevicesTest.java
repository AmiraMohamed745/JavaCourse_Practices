package com.example.javacoursetasks.inheritance.superkeyword.inheritence;

public class ElectronicDevicesTest {

	public static void main(String[] args) {

		System.out.println("Phones Section: ");
		System.out.println("\n");

		ElectronicDevices phones1 = new Phones("OPPO CH9", "OPPO", "Android", 5, false);
		phones1.display();
		System.out.println("\n");

		ElectronicDevices phones2 = new Phones("iPhone Pro 10", "Apple.inc", "iOS", 3, true);
		phones2.display();
		System.out.println("\n");

		System.out.println("Laptops Section: ");
		System.out.println("\n");

		ElectronicDevices laptops = new Laptops("Lenovo 8", "Lenovo", "Windows", "Litheium", 6, false);
		laptops.display();
		System.out.println("\n");

		System.out.println("Tablets Section: ");
		System.out.println("\n");

		ElectronicDevices tablets = new Tablets("Samsung X2", "Samsung", "Android", 6, true);
		tablets.display();
		System.out.println("\n");

	}
}
