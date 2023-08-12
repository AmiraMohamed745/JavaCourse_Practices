package com.example.javacoursetasks.markerinterface.cloneable;

public class CloningObjects implements Cloneable {

	String type;
	String state;
	int age;

	public void display() {
		System.out.println("Type: " + type);
		System.out.println("Status: " + state);
		System.out.println("Age: " + age);
	}

	public static void main(String[] args) {

		CloningObjects obj1 = new CloningObjects();
		obj1.type = "German Sheperd";
		obj1.state = "Adpoted";
		obj1.age = 4;
		System.out.println("The first dog: ");
		obj1.display();
		System.out.println("\n");

		try {
			CloningObjects obj2 = (CloningObjects) obj1.clone();
			obj1.type = "Bulldog";
			obj1.state = "Adpoted";
			obj1.age = 5;
			System.out.println("The second dog: ");
			obj2.display();
		} catch (Exception c) {

		}

	}
}
