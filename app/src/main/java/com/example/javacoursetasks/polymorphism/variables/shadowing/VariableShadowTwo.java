package com.example.javacoursetasks.polymorphism.variables.shadowing;

public class VariableShadowTwo {

	int publicationYear = 2020;

	public void getOtherRepublicationYear(int publicationYear) {
		System.out.println(publicationYear);
		System.out.println(this.publicationYear);
	}

	public static void main(String[] args) {

		VariableShadowTwo obj = new VariableShadowTwo();
		obj.getOtherRepublicationYear(2021);
		obj.getOtherRepublicationYear(2020);


	}

}
