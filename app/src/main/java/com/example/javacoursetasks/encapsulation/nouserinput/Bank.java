package com.example.javacoursetasks.encapsulation.nouserinput;

public class Bank {

	String bankName;
	int bankBranches;
	private long bankCash;
	private String bankGold;

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public int getBankBranches() {
		return bankBranches;
	}

	public void setBankBranches(int bankBranches) {
		this.bankBranches = bankBranches;
	}

	public long getBankCash() {
		return bankCash;
	}

	public void setBankCash(long bankCash) {
		this.bankCash = bankCash;
	}

	public String getBankGold() {
		return bankGold;
	}

	public void setBankGold(String bankGold) {
		this.bankGold = bankGold;
	}

}
