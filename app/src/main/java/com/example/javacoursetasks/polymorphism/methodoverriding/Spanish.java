package com.example.javacoursetasks.polymorphism.methodoverriding;

public class Spanish implements Departments {

	@Override
	public void name() {
		System.out.println("Department: Spanish ");
	}

	@Override
	public void deptHead() {
		System.out.println("Head: Marwa Ahmed ");
	}

	@Override
	public void deptStudentNum() {
		System.out.println("Number of Students: 600 ");
	}

	@Override
	public void deptCourseNames() {
		System.out.println("Courses: translation, conversation, poetry, essay, drama, novel, and linguistics ");

	}

	void scholarships() {
		System.out.println("The Spanish department gives 10 scholarships a year.");
	}

}
