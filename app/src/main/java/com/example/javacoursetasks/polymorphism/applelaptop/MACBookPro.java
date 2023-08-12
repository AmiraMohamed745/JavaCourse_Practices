package com.example.javacoursetasks.polymorphism.applelaptop;

public class MACBookPro implements AppleLaptop {

	@Override
	public void start() {
		System.out.println("Inside MACBookPro start() ");
	}

	@Override
	public void shutdown() {
		System.out.println("Inside MACBookPro shutdown() ");
	}
	
	void manufactureYear() {
		System.out.println("Inside MACBookPro manufactureYear() ");
	}

}
