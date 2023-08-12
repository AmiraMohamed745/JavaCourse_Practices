package com.example.javacoursetasks.packages.userapp;

public class BasicInfo {
	
	public static String getName () {
		 return ("Amira");
	 }
	 public int getAge () {
		 return (20);
	 }

	public static void main(String[] args) {
		System.out.println("Name: " + BasicInfo.getName());
		BasicInfo getAgeObj = new BasicInfo();
		System.out.println("Age: " + getAgeObj.getAge());
		SensitiveInfo adressObj = new SensitiveInfo();
		System.out.println("Address: " + adressObj.address());
		System.out.println("Account NO: " + SensitiveInfo.accountNo());
		
		System.out.println("Driver name: " + uberdriverapp.BasicInfo.getName());
		uberdriverapp.BasicInfo getAgeObjDriver = new uberdriverapp.BasicInfo();
		System.out.println("Driver age: " + getAgeObjDriver.getAge());

	}

}
