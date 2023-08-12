package com.example.javacoursetasks.inheritance.methodoverriding.inheritance;

public class PhoneTest { 
	
	public static void main(String[] args) {
		
		Samsung samsung = new Samsung();
		System.out.println("Samsung's OS: " + samsung.operatingSysytem());
		
		Xiaomi xiaomi = new Xiaomi();
		System.out.println("Xiaomi OS: " + xiaomi.operatingSysytem());
	}
	

	
}
