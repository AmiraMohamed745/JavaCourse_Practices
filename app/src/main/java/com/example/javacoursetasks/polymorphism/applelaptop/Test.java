package com.example.javacoursetasks.polymorphism.applelaptop;

public class Test {

	public static void main(String[] args) {
		
		MACBookPro proObj = new MACBookPro();
		MACBookAIR airOBJ = new MACBookAIR();
		
		proObj.start();
		proObj.shutdown();
		proObj.manufactureYear();
		
		airOBJ.start();
		airOBJ.shutdown();

	}

}
