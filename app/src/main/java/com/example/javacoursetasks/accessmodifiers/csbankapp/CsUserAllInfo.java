package com.example.javacoursetasks.accessmodifiers.csbankapp;


import com.example.javacoursetasks.accessmodifiers.userbankapp.BasicUserInfo;
import com.example.javacoursetasks.accessmodifiers.userbankapp.UserSensitiveInfo;

public class CsUserAllInfo extends BasicUserInfo {

	public String eligibiltyLoans = "Yes";
	public String internationalOnlineUsages = "Amazon" + " " + "and" + " " + "Etsy";
	
	public static void main(String[] args) {
		
		UserSensitiveInfo userSensInfoObj = new UserSensitiveInfo();
		CsUserAllInfo csUserInfoObj = new CsUserAllInfo();
		System.out.println("Name: " + csUserInfoObj.name);
		System.out.println("Age: " + csUserInfoObj.age);
		System.out.println("Balance: " + userSensInfoObj.balance);
		System.out.println("Address: " + csUserInfoObj.address);
		System.out.println("Customer's eligibility for loans: " + csUserInfoObj.eligibiltyLoans);
		System.out.println("International Online Websites Purchases: " + csUserInfoObj.internationalOnlineUsages);
	}

}
