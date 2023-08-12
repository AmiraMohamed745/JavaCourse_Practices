package com.example.javacoursetasks.packages.userapp;
public class SensitiveInfo {
	
	private static String password() {
		return ("AM_1234_BM");
	}
	static String accountNo() {
		return ("1234567812345678");
	}
	public String address() {
		return ("Abdallah Gewidah st, Giza");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Name: " + BasicInfo.getName());
		BasicInfo getAgeObj = new BasicInfo();
		System.out.println("Age: " + getAgeObj.getAge());
		
		System.out.println("Password: " + SensitiveInfo.password());
		System.out.println("Account NO: " + SensitiveInfo.accountNo());
		SensitiveInfo adressObj = new SensitiveInfo();
		System.out.println("Address: " + adressObj.address());

		
		

	}

}
