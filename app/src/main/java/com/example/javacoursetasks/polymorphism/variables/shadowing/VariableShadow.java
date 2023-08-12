package com.example.javacoursetasks.polymorphism.variables.shadowing;

public class VariableShadow {

	String programmingLang = "Java";

	public void getProgrammingLangName() {
		String programmingLang = "Kotlin";
		System.out.println(programmingLang);
		System.out.println(this.programmingLang);
	}

	public static void main(String[] args) {

		VariableShadow obj = new VariableShadow();
		obj.getProgrammingLangName();

	}

}
