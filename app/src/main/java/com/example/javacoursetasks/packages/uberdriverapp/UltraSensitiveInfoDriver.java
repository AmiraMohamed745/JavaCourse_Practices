package com.example.javacoursetasks.packages.uberdriverapp;
import userapp.UltraSensitiveInfoUser;
public class UltraSensitiveInfoDriver {

	public String bloodType = "O";
	public String spuoseName = "Sara";
	
	public static void main(String[] args) {
		
		UltraSensitiveInfoDriver bloodTypeObjDri = new UltraSensitiveInfoDriver();
		System.out.println("Blood type: " + bloodTypeObjDri.bloodType);
		UltraSensitiveInfoDriver spouseNameObjDri = new UltraSensitiveInfoDriver();
		System.out.println("Spouse name: " + spouseNameObjDri.spuoseName);
		
		UltraSensitiveInfoUser bloodTypeObjCus = new UltraSensitiveInfoUser();
		System.out.println("Blood type: " + bloodTypeObjCus.bloodType);
		UltraSensitiveInfoUser spouseNameObjCus = new UltraSensitiveInfoUser();
		System.out.println("Blood type: " + spouseNameObjCus.spuseName);
		
		
		
		

	}

}
