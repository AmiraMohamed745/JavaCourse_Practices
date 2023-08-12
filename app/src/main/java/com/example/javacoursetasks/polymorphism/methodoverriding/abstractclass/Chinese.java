package com.example.javacoursetasks.polymorphism.methodoverriding.abstractclass;

public class Chinese extends Departments {

	@Override
	void name() {
		System.out.println("Department: Chinese ");
	}

	@Override
	void deptHead() {
		System.out.println("Head: Jung Woo ");
	}

	@Override
	void deptStudentNum() {
		System.out.println("Number of Students: 350 ");
	}

	@Override
	void deptCourseNames() {
		System.out.println("Courses: translation, conversation, poetry, essay, drama, novel, and linguistics ");
	}

	void eventsParticipation() {
		System.out.println("The Chinese department participates in 3 events a semester.");
	}
}
