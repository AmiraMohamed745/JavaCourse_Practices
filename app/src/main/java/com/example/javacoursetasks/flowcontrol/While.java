package com.example.javacoursetasks.flowcontrol;

public class While {

	public static void main(String[] args) {
		
		int num1 = 20;

		while (num1 <= 31) {
			System.out.println(num1); // 20, 21...31
			num1++; // you have to add it or else it will never stop looping
		}
		
		int num2 = 20;

		while (num2 <= 21) {
			System.out.println(num2); // 20
			break;
		}
		while (num2 >= 20) {
			System.out.println(num2); // 20
			num2++;
			System.out.println(num2); // 21
			num2++;
			System.out.println(num2); // 22
			num2++;
			System.out.println(num2); // 23
			num2++;
			System.out.println(num2); // 24
			num2++;
			System.out.println(num2); // 25
			++num2;
			System.out.println(num2); // 26
			++num2;
			System.out.println(num2); // 27
			++num2;
			break;
		}
		
		int studentNum = 30;

		while (studentNum <= 30) {
			System.out.println("Class A1 student number: " + studentNum);
			studentNum += 5;
			System.out.println("Class A2 student number: " + studentNum);
			studentNum += 5;
			System.out.println("Class B1 student number: " + studentNum);
			studentNum += 5;
			System.out.println("Class B2 student number: " + studentNum);
			studentNum += 5;
			System.out.println("Class C student number: " + studentNum);
			break;
		}
		

	}

}
