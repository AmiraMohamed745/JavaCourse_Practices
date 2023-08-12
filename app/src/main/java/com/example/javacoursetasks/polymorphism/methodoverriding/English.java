package com.example.javacoursetasks.polymorphism.methodoverriding;

public class English implements Departments {

	@Override
	public void name() {
		System.out.println("Department: English ");
	}

	@Override
	public void deptHead() {
		System.out.println("Head: Aziz Khlaed ");
	}

	@Override
	public void deptStudentNum() {
		System.out.println("Number of Students: 460 ");
	}

	@Override
	public void deptCourseNames() {
		System.out.println("Courses: translation, conversation, poetry, essay, drama, novel, and linguistics ");

	}

}
