package com.example.javacoursetasks.operators;

public class ShortcircuitOperators {

	public static void main(String[] args) {
		
		boolean a = true; 
		boolean b = false; 
		
		if (a && b) { 
		System.out.println("Short-circuit operator apllied.");
	}
		else {
			System.out.println("Can't apply short-circuit operator.");
		}
		System.out.println("\n");
		
		if (a || b) { // b will not be evaluated since a is true
			System.out.println("Short-circuit operator apllied.");
		}
			else {
				System.out.println("Can't apply short-circuit operator.");
			}
		
		

}
}
