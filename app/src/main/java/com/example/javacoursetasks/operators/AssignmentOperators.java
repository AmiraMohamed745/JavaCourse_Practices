package com.example.javacoursetasks.operators;

public class AssignmentOperators {

	public static void main(String[] args) {
		
		int a = 36;
		int b, c, d, e;
		b = 10; c = 16; d = 25; e = 200;
		
		c += 2;
		a *= 25;
		b /= 8;
		d %= 4;
		e -= 100;
		
		
		System.out.println(a); // a = a * 25 → a = 36 * 25 = "900"
		System.out.println(b); // b = b / 8 → b =  10 / 8 = "1.25"
		System.out.println(c); // c = c + 2 → c =  16 + 2 = "18"
		System.out.println(d); // d = d % 4 → d = 25 % 4 = "6, remainder = 1"
		System.out.println(e); // e = e - 100 → e = 200 -100 = "100"
		

	}

}
