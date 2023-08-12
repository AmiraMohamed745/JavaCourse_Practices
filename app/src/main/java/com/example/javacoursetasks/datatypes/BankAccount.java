package com.example.javacoursetasks.datatypes;

public class BankAccount {
	
	static String bankName = "EG Bank";
	
	String accountName;
	String accountNumber;
	float accountBalance;

	public static void main(String[] args) {
		
		float interestRate = 8.6f;
		
		BankAccount bankaccount= new BankAccount();
		
		bankaccount.accountName = "Amira";
		bankaccount.accountNumber = "1234567891011123";
		bankaccount.accountBalance = 2846.05f;
		
		System.out.println("Bank: " + BankAccount.bankName);
		System.out.println("User: " + bankaccount.accountName);
		System.out.println("Account Number: " + bankaccount.accountNumber);
		System.out.println("Balance: " + bankaccount.accountBalance);
		System.out.println("Interest Rate: " + interestRate);
		
	
		

		
		

		
		
		
		
	}

}
