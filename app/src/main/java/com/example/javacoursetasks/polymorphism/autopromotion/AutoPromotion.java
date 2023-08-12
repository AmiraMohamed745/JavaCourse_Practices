package com.example.javacoursetasks.polymorphism.autopromotion;

public class AutoPromotion {

	public void display(char year) {
		System.out.println("Year: " + year);
	}

	
	
	public void display(Object country) {
		System.out.println("Country: " + country);
	}
	
	

	public static void main(String[] args) {

		AutoPromotion apObj = new AutoPromotion();
		apObj.display(2022);
		apObj.display(123);
	}

}
