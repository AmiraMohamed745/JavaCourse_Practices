package com.example.javacoursetasks.encapsulation.userinput;

import java.util.Scanner;

public class UniversityStudent {

	final String uniName = "Ain Shams University";
	final String collegeName = "Al-Alsun";
	public String studentName;
	private int studentAge;
	private long studentNationalId;

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

	public void setStudentId(long studentNationalId) {
		this.studentNationalId = studentNationalId;
	}

	public static void main(String[] args) {

		UniversityStudent obj = new UniversityStudent();
		System.out.println("University: " + obj.uniName + "\n");
		System.out.println("College: " + obj.collegeName + "\n");

		Scanner scanner = new Scanner(System.in);
		System.out.println("Name: ");
		obj.setStudentName(scanner.next());
		System.out.println("\n");

		System.out.println("Age: ");
		obj.setStudentAge(scanner.nextInt());
		System.out.println("\n");

		System.out.println("Email: ");
		obj.setStudentId(scanner.nextLong());
		System.out.println("\n");

		scanner.close();
	}
}
