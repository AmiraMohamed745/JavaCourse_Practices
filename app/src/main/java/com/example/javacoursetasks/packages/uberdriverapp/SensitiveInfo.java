package com.example.javacoursetasks.packages.uberdriverapp;
public class SensitiveInfo {
	
	private static String password() {
		return ("AM_1234_BM");
	}
	static String accountNo() {
		return ("1234567812345678");
	}
	protected String profits () {
		return ("2755EGP");
	}

	public static void main(String[] args) {

		System.out.println("Name: " + BasicInfo.getName());
		BasicInfo getAgeObj = new BasicInfo();
		System.out.println("Age: " + getAgeObj.getAge());
		
		System.out.println("Password: " + SensitiveInfo.password());
		System.out.println("Account NO: " + SensitiveInfo.accountNo());
		
		userapp.SensitiveInfo adressObjCus = new userapp.SensitiveInfo();
		System.out.println("Customer address: " + adressObjCus.address() );
		
		SensitiveInfo profitsObj = new SensitiveInfo();
		System.out.println("Profits: " + profitsObj.profits());
	}

}
