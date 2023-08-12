package com.example.javacoursetasks.flowcontrol;

public class IfElseConvertedToSwitch {

	public static void main(String[] args) {
		
		String choice = "Withdraw cash";
		String result;

		switch (choice) {

		case "Check Balance":
			result = "2700";
			break;
		case "Chand PIN":
			result = "Enter the new PIN";
			break;
		case "Withdraw cash":
			result = "Enter the amount you want to withdraw";
			break;
		case "Deposit check":
			result = "Enter the amount";
			break;
		default:
			result = "Time out";
		}
		System.out.println(result);

	}

}
