package com.example.javacoursetasks.operators;

public class ModularOperatorPalindromeNum {

	public static void main(String[] args) {
		
		// reverse string #1
		
		String words1 = "Madam", reverseStr = "";
		int strLength = words1.length();
		
		for (int i = strLength - 1; i >= 0; --i) {
			reverseStr = reverseStr + words1.charAt(i);
		}
		   if (words1.toLowerCase().equals(reverseStr.toLowerCase())) {
			   System.out.println(words1);
		   }
		   else {
			   System.out.println("No palindrome string found");
		   }
		   System.out.println("\n");
		   
		// reverse string #2
		   
		   String words2 = "Never" +  "odd" +  "or"  + "even", reverseStr2 = "";
		   int strLength2 = words2.length();
		   
		   for (int i = strLength2 - 1; i >= 0; --i) {
			   reverseStr2 = reverseStr2 + words2.charAt(i);
		   }
		   
		   if (words2.toLowerCase().equals(reverseStr2.toLowerCase())) {
			   System.out.println("The palindrome sentence is " + words2 + "" );
			   System.out.println("\b");
		   }
		   else {
			   System.out.println("Sorry! No palindrome sentence found");
		   }
		   System.out.println("\n");
		   
		   
		// reverse number #1
		   
		   int num = 454, reverse = 0;
		   int reversedNum = num;
		   while (num != 0) {
			   int remainder = num % 10;
			   reverse = reverse * 10 + remainder;
			   num = num / 10;
		   }
		   if (reversedNum == reverse) {
			   System.out.println("The palindrome number is " + reversedNum);
		   }
		   else {
			   System.out.println("Sorry! No palindrome number found");
		   }
		   System.out.println("\n");
		   
           // reverse number #2 (normal reverse without the palindrome 😉
		   
		   int num1 = 4554, reverse1 = 0;
		   while (num1 != 0) {
			   int remainder1 = num1 % 10;
			   reverse1 = reverse1 * 10 + remainder1;
			   num1 = num1 / 10;
		   }
		  
		   System.out.println("The palindrome number is " + reverse1);
		   
              System.out.println("\n");
		   
           // reverse number #3 
		   
		   int num3 = 7887, reverse3 = 0;
		   int reversedNum3 = num3;
		   while (num3 != 0) {
			   int remainder3 = num3 % 10;
			   reverse3 = reverse3 * 10 + remainder3;
			   num3 = num3 / 10;
		   }
		   
		   if (reversedNum3 == reverse3) {
			   System.out.println(reversedNum3 + "is a palindrome number");
		   }
		   
		   else {
			   System.out.println("Sorry! No palindrome number found");
		   }
		   
		   
		   
	
	
		

	}}


