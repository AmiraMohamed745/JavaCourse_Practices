package com.example.javacoursetasks.accessmodifiers.userbankapp;

public class UserSensitiveInfo {
	
	public float balance = 2700.85f;
	protected String accountNum = "1234";
	private String password = "MNL_123_CVl";
	private int cvvNum = 123;

	public static void main(String[] args) {
		
		BasicUserInfo basicInfoObj = new BasicUserInfo();
		UserSensitiveInfo userSensInfoObj = new UserSensitiveInfo();
		System.out.println("Name: " + basicInfoObj.name);
		System.out.println("Address: " + basicInfoObj.address);
		System.out.println("Balance: " + userSensInfoObj.balance);
		System.out.println("Number of purchases: " + basicInfoObj.purchaseCounts);
		System.out.println("Password: " + userSensInfoObj.password);
		System.out.println("Account NO: " + userSensInfoObj.accountNum);
		System.out.println("CVV Number: " + userSensInfoObj.cvvNum);
		
		
		

	}

}
