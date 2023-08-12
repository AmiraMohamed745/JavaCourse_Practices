package com.example.javacoursetasks.datatypes;

public class DataTypesDemo {

	public static void main(String[] args) {
		
		byte a = -128;
		short b = -32677;
		int c = 5000_000;
		long d = 5000_000_00;
		char e = 'Y';
		float f = 1234567.58f;
		double g = 1234567891011.56;
		
		byte h = 56;
		
		byte result = (byte) (a+h);
		short result2 = (short) ((b+a) - (a+h));

		System.out.println(result);
		System.out.println(result2);
		
	}

}
