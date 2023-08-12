package com.example.javacoursetasks.nonstaticmembers;

public class ObjectReferencesDemo {
	
	int x = 10;
	
	public static void main(String[] args) {
		
		ObjectReferencesDemo ord = new ObjectReferencesDemo();
		System.out.println(ord.x);
	}

}
