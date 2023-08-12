package com.example.javacoursetasks.wrapperclasses;

public class PrimitivesAndStrings {

	public static void main(String[] args) {
		
		byte a = 25;
		String string1 = Byte.toString(a); // converting primitive to string mentioning the primitive
		System.out.println(string1);
		
		byte b = Byte.parseByte(string1);
		System.out.println(b);
		
		String string2 = Long.toString(10_000); // converting primitive to string without mentioning the primitive
		System.out.println(string2);

		long c = Long.parseLong(string2);
		System.out.println(c);
		
		short d = 32_000;
		String string3 = Short.toString(d);
		System.out.println(string3);
		
		short e = Short.parseShort(string3);
		System.out.println(e);
		
	}

}
