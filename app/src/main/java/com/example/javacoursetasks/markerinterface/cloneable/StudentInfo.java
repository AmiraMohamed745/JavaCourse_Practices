package com.example.javacoursetasks.markerinterface.cloneable;

import java.util.Scanner;

public class StudentInfo implements Cloneable {

	String name;
	int age;
	String email;
	long phoneNum;
	String address;

	public StudentInfo(String name, int age, String email, long phoneNum, String address) {
		this.name = name;
		this.age = age;
		this.email = email;
		this.phoneNum = phoneNum;
		this.address = address;
	}

	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Email: " + email);
		System.out.println("Phone Number: " + phoneNum);
		System.out.println("Address: " + address);
	}

	public static void main(String[] args) throws CloneNotSupportedException {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Name: ");
		String name = scanner.next();
		System.out.println("Age: ");
		int age = Integer.parseInt(scanner.next());
		System.out.println("Email: ");
		String email = scanner.next();
		System.out.println("Phone Number: ");
		long phoneNum = Long.parseLong(scanner.next());
		System.out.println("Adress: ");
		String address = scanner.next();

		StudentInfo studentInfoObj = new StudentInfo(name, age, email, phoneNum, address);
		studentInfoObj.clone();
		studentInfoObj.display();
		
		scanner.close();

	}

}
