package com.example.javacoursetasks.operators;

public class ShortcircuitOperators2 {

	public static void main(String[] args) {
		
		// && #1
		int num1 = 15, num2 = 27, num3 = 100, num4 = 100;
		
		
		if ((num1 < num2) && (num3 == num4)) { 
			int num5 = num1 + num2; 
			System.out.println(num5);
		}
		
		else {
			System.out.println("Sorry, the and operator doesn't work");
		}
		System.out.println("\n");
		
		// && #2
		
		int num6= 100, num7 = 200, num8 = 300;
		if ((num7 > num6) && (num8 == num7)) {
			int num9 = num6 + num7;
			System.out.println(num9);
		}
		
		else {
			System.out.println("Sorry, cann't do it");
		}
		System.out.println("\n");
		
		// || #1
		
		int numb1 = 100, numb2 = 200, numb3 = 100;
		if ((numb1 == numb3) || (num1 > numb2)) {
			int numb4 = numb2 + numb3;
			System.out.println(numb4);
		}
		else { 
			System.out.println("Sorry, cann't do it");
		}
		System.out.println("\n");
		
		// || #2
		
		int numb5 = 100, numb6 = 200, numb7 = 100;
		if ((numb5 != numb7) || (numb5 > numb6)) {
			int numb8 = numb5 + numb7;
			System.out.println(numb8);
		}
		else { 
			System.out.println("Sorry, cann't do it");
		}
		
		
			
	}}


