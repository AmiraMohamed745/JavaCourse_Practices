package com.example.javacoursetasks.polymorphism.methodoverriding.abstractclass;

public class Portuguese extends Departments {

	@Override
	void name() {
		System.out.println("Department: Portuguese ");
	}

	@Override
	void deptHead() {
		System.out.println("Head: Khlaed Hassan ");
	}

	@Override
	void deptStudentNum() {
		System.out.println("Number of Students: 200 ");
	}

	@Override
	void deptCourseNames() {
		System.out.println("Courses: translation, conversation, poetry, essay, drama, novel, and linguistics ");
	}

	void scholarships() {
		System.out.println("The Portuguese department gives 30 scholarships a year.");	}
}
