package com.example.javacoursetasks.polymorphism.methodoverriding.abstractclass;

public class Test {

	public static void main(String[] args) {

		Portuguese portuguese = new Portuguese();
		Chinese chinese = new Chinese();
		
		System.out.println("Departments information: ");
		portuguese.dptsNum();
		System.out.println("\n");
		
		portuguese.name();
		portuguese.deptHead();
		portuguese.deptStudentNum();
		portuguese.deptCourseNames();
		portuguese.scholarships();
		System.out.println("\n");
		
		chinese.name();
		chinese.deptHead();
		chinese.deptStudentNum();
		chinese.deptCourseNames();
		chinese.eventsParticipation();
		





	}

}
