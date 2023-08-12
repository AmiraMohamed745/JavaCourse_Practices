package com.example.javacoursetasks.commanlinearguements;

public class ForLoop {

	public static void main(String[] args) {
		
		for (int pokemonNum = 11; pokemonNum < 20; pokemonNum = pokemonNum + 2 ) {
			System.out.println("Pokemon Number = " + pokemonNum);
			System.out.println("\n");
	}

		for (int studentNum = 5; studentNum < 15; ++studentNum) {
			System.out.println("Student Number: " + studentNum);
			System.out.println("\n");
		}
		
		
		for (int studentNum = 5; studentNum < 15; studentNum++) {
			System.out.println("Student Number: " + studentNum);
			System.out.println("\n");
		}
	}

}
