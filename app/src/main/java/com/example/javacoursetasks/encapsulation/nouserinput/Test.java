package com.example.javacoursetasks.encapsulation.nouserinput;

public class Test {
	
	public static void main(String[] args) {
		
		Bank obj = new Bank();
		obj.setBankName("Banque Misr");
		obj.setBankBranches(100);
		obj.setBankCash(900000000);
		obj.setBankGold("2000 ounces");
		
		System.out.println("Bank: " + obj.getBankName());
		System.out.println("Branches: " + obj.getBankBranches());
		System.out.println("Cash available: " + obj.getBankCash());
		System.out.println("Gold: " + obj.getBankGold());
	}

}
