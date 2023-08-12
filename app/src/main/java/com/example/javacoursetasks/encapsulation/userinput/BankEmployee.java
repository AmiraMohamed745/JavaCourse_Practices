package com.example.javacoursetasks.encapsulation.userinput;

public class BankEmployee extends BankCustomerExtend {
	
	@Override
	public void setAccType(String accType) {
		super.setAccType(accType);
	}

	public static void main(String[] args) {
		
		BankEmployee bankEmployeeObj = new BankEmployee();
		System.out.println(bankEmployeeObj.bankName);
		bankEmployeeObj.setAccType("LOL");
		System.out.println(bankEmployeeObj.getAccType());

		
	}

}
