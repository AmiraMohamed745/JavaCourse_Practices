package com.example.javacoursetasks.nonstaticmembers;

public class NonStaticMembersDemo {

	int num;
	
		{
		System.out.println("Inside the non-static block1");
	}
	
	{
		System.out.println("Inside the non-static block");
	}
	
	
	
	public static void main(String[] args) {
		
		System.out.println("Inside the main method");
		NonStaticMembersDemo obj = new NonStaticMembersDemo();
		new NonStaticMembersDemo();
		obj.doSomething();
		
		
	    }
	
	static {
		
		System.out.println("Inside the static block");
	}
	
	void doSomething() {
		
		System.out.println("Inside doSomething");
	}
}
