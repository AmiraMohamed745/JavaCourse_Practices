package com.example.javacoursetasks.abstraction.finalkeyword;

import java.util.Scanner;

public class MainInfo {

	final String uni = "Ain Shams University";
	final String college = "Al-Alsun";
	final String dpt = "English";
	final String secLang = "Spanish";
	final int enrollYear = 2020;
	String name;
	int age;
	String email;
	long phoneNum;
	String address;

	public MainInfo(String name, int age, String email, long phoneNum, String address) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
		this.phoneNum = phoneNum;
		this.address = address;
	}

	protected void display() {
		System.out.println("University: " + uni);
		System.out.println("College: " + college);
		System.out.println("Department: " + dpt);
		System.out.println("Second Language: " + secLang);
		System.out.println("Enrollment Year: " + enrollYear);
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Email: " + email);
		System.out.println("Phone Number: " + phoneNum);
		System.out.println("Address: " + address);
	}

	public static void main(String[] args) {

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
		scanner.close();
		
		MainInfo mainInfoObj = new MainInfo(name, age, email, phoneNum, address);
		mainInfoObj.display();
	}
}
