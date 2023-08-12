package com.example.javacoursetasks.accessmodifiers.userbankapp;

public class BasicUserInfo {
	
	public String name = "Amira";
	public int age = 20;
	protected String address = "Abdallah Gewidah st, Giza";
	int purchaseCounts = 20;

	public static void main(String[] args) {
		
		BasicUserInfo basicInfoObj = new BasicUserInfo();
		UserSensitiveInfo userSensInfoObj = new UserSensitiveInfo();
		System.out.println("Name: " + basicInfoObj.name);
		System.out.println("Age: " + basicInfoObj.age);
		System.out.println("Address: " + basicInfoObj.address);
		System.out.println("Account NO: " + userSensInfoObj.accountNum);
		System.out.println("Number of purchases: " + basicInfoObj.purchaseCounts);
		System.out.println("Balance: " + userSensInfoObj.balance);
		
		
		

	}

}
