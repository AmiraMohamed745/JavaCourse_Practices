package com.example.javacoursetasks.encapsulation.userinput;

public class BankCustomerExtend {

	final String bankName = "EG Bank";
	public String custName;
	private int custAge;
	private String accType;
	private long cardNum;
	private double balance;

	public String getCustName() {
		return custName;
	}

	public void setCustName(String newcustName) {
		custName = newcustName;
	}

	public int getCustAge() {
		if (custAge < 16) {
			System.out.println("Invalid age");
		}
		return custAge;
	}

	public void setCustAge(int custAge) {
		this.custAge = custAge;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String newaccType) {
		accType = newaccType;
	}

	public long getCardNum() {
		return cardNum;
	}

	public void setCardNum(long newcardNum) {
		cardNum = newcardNum;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public static void main(String[] args) {

		BankCustomerExtend bankCustomerObj = new BankCustomerExtend();

		bankCustomerObj.setCustName("Amira");
		bankCustomerObj.setCustAge(15);
		bankCustomerObj.setAccType("Deposit account");
		bankCustomerObj.setCardNum(1234567891);
		bankCustomerObj.setBalance(200);

		System.out.println("Bank: " + bankCustomerObj.bankName + "\n");
		System.out.println("Name: " + bankCustomerObj.getCustName() + "\n");
		System.out.println("Age: " + bankCustomerObj.getCustAge() + "\n");
		System.out.println("Account: " + bankCustomerObj.getAccType() + "\n");
		System.out.println("Card Number: " + bankCustomerObj.getCardNum() + "\n");
		System.out.println("Balance: " + bankCustomerObj.getBalance() + "\n");

	}

}
