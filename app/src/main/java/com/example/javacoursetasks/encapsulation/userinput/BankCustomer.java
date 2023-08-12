package com.example.javacoursetasks.encapsulation.userinput;

import java.util.Scanner;

public class BankCustomer {

	final String bankName = "EG Bank";
	public String custName;
	private String accType;
	private long cardNum;
	private double balance;

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public long getCardNum() {
		return cardNum;
	}

	public void setCardNum(long cardNum) {
		this.cardNum = cardNum;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		if (balance <= 300) {
			System.out.println("Invalid balance");
		}
		this.balance = balance;
	}

	public static void main(String[] args) {

		BankCustomer bankCustomerObj = new BankCustomer();
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Name: ");
		bankCustomerObj.setCustName(scanner.nextLine());
		System.out.println("\n");

		System.out.println("Account Type: ");
		bankCustomerObj.setAccType(scanner.nextLine());
		System.out.println("\n");

		System.out.println("Card Number: ");
		bankCustomerObj.setCardNum(scanner.nextLong());
		System.out.println("\n");

		System.out.println("Balance: ");
		bankCustomerObj.setBalance(scanner.nextDouble());
		System.out.println("\n");

		System.out.println("Bank: " + bankCustomerObj.bankName + "\n");
		System.out.println("Name: " + bankCustomerObj.getCustName() + "\n");
		System.out.println("Account: " + bankCustomerObj.getAccType() + "\n");
		System.out.println("Card Number: " + bankCustomerObj.getCardNum() + "\n");
		System.out.println("Balance: " + bankCustomerObj.getBalance() + "\n");

		scanner.close();
	}

}
