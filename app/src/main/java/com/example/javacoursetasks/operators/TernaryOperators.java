package com.example.javacoursetasks.operators;

public class TernaryOperators {

	public static void main(String[] args) {
		
		int num1 = 500, num2 = 400;
		String ternaryResult = (num1 >= num2)? "True":"False";
		System.out.println(ternaryResult);
		System.out.println("\n");
		
		String bankName = "EG Bank", myBank = "EG Bank";
		String whatMyBank = (bankName == myBank)? "EG Bank": "Another Bank";
		System.out.println(whatMyBank);
		System.out.println("\n");
		
		String bankName1 = "EG Bank", myBank1 = "Banque Misr";
		String whatMyBank1 = (bankName1 == myBank1)? "EG Bank": "Another Bank";
		System.out.println(whatMyBank1);
		System.out.println("\n");
		
		int requiredUserAge = 21, currentUserAge = 18;
		String ageMessage = (currentUserAge < requiredUserAge)? "Not allowed! under21": "Login successful!";
			System.out.println(ageMessage);
		

	}

}
