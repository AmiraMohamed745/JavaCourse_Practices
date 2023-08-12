package com.example.javacoursetasks.wrapperclasses;

public class ObjectsAndStrings {

	public static void main(String[] args) {
		
		Integer integer1 = 200;
		String stringObj = integer1.toString();
		System.out.println(stringObj);
		
		Integer integer2 = Integer.valueOf(stringObj);
		System.out.println(integer2);
		
		Double myDouble = 125.23;
		String stringObj2 = myDouble.toString();
		System.out.println(stringObj2);
		
		Double myDouble1 = Double.valueOf(stringObj2);
		System.out.println(myDouble1);
	}

}
