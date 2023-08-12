package com.example.javacoursetasks.packages.uberdriverapp;

public class BasicInfo {

	public static String getName () {
		 return ("Khaled");
	 }
	 public int getAge () {
		 return (32);
	 }
	public static void main(String[] args) {

		System.out.println("Driver name: " + BasicInfo.getName());
		BasicInfo getAgeObj = new BasicInfo();
		System.out.println("Driver age: " + getAgeObj.getAge());
		
		System.out.println("Customer name: " + userapp.BasicInfo.getName());
		userapp.BasicInfo getAgeObjCus = new userapp.BasicInfo();
		System.out.println("Customer age: " + getAgeObjCus.getAge());
	}

}
