package com.example.javacoursetasks.polymorphism.methodoverloading;

public class SemestersResults {

	void semesterResult() {
		System.out.println("Semesters Result: ");
	}

	void semesterResult(float translation, float poetry, float liguistics, float arabic, float conversation,
			float drama) {
		System.out.println("First semester result is "
				+ ((translation + poetry + liguistics + arabic + conversation + drama) / 240) * 100);
	}

	void semesterResult(float translation, float poetry, float liguistics, float arabic, float essay, float drama,
			float secLang) {
		System.out.println("Second semester result is "
				+ ((translation + poetry + liguistics + arabic + essay + drama + secLang) / 300) * 100);
	}

	void semesterResult(String grade) {
		System.out.println("Grade: " + grade);
	}

	public static void main(String[] args) {

		SemestersResults mySemestersResults = new SemestersResults();
		mySemestersResults.semesterResult();
		mySemestersResults.semesterResult(35f, 38.5f, 37f, 40f, 29.5f, 38f);
		mySemestersResults.semesterResult("Very Good");
		mySemestersResults.semesterResult(40f, 37.4f, 38.5f, 39f, 40f, 39f, 58f);
		mySemestersResults.semesterResult("Excellent");

	}

}
