package com.example.javacoursetasks.packages.com.amira.staticimports;
import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Float.*;

public class StaticImportsandImmediateParsing {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(in);
		out.println("Please enter your name: ");
		String getName = scanner.next();
		out.println("Please enter your size: ");
		float getSize = parseFloat (scanner.next());
		out.println("Please enter your age: ");
		int getAge = parseInt (scanner.next());
	    out.println("Please enter your expected price: ");
		int getExpectedPrice = parseInt (scanner.next());
		out.println("\n");

		out.println("Name: " + getName);
		out.println("Age: " + getAge);
		out.println("Size: " + getSize);
		out.println("Expected Price: " + getExpectedPrice);

		scanner.close();

	}

}
