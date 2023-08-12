package com.example.javacoursetasks.polymorphism.methodoverriding;

public class German implements Departments {

	@Override
	public void name() {
		System.out.println("Department: German ");
	}

	@Override
	public void deptHead() {
		System.out.println("Head: Mohamed Hammad ");
	}

	@Override
	public void deptStudentNum() {
		System.out.println("Number of Students: 350 ");
	}

	@Override
	public void deptCourseNames() {
		System.out.println("Courses: translation, conversation, poetry, essay, drama, novel, and linguistics ");
	}

	void eventsParticipation() {
		System.out.println("The German department participates in 3 events a semester.");
	}

}
