package com.example.javacoursetasks.polymorphism.methodoverriding;

public class Test {

	public static void main(String[] args) {

		Departments english = new English();
		Departments spanish = new Spanish();
		Departments german = new German();
		Spanish spanishDownCast = (Spanish) spanish;
		German germanDownCast = (German) german;

		System.out.println("Departments information: ");
		System.out.println("\n");

		english.name();
		english.deptHead();
		english.deptStudentNum();
		english.deptCourseNames();
		System.out.println("\n");

		spanish.name();
		spanish.deptHead();
		spanish.deptStudentNum();
		spanish.deptCourseNames();
		spanishDownCast.scholarships();
		System.out.println("\n");

		german.name();
		german.deptHead();
		german.deptStudentNum();
		german.deptCourseNames();
		germanDownCast.eventsParticipation();

	}

}
