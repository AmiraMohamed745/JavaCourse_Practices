package com.example.javacoursetasks.packages.userapp;
import uberdriverapp.UltraSensitiveInfoDriver;
public class UltraSensitiveInfoUser {

	public String bloodType = "AB"; // it has to be public so the classes of other packages can access it
	public String spuseName = "Amir";
	
	public static void main(String[] args) {

		UltraSensitiveInfoUser bloodTypeObjCus = new UltraSensitiveInfoUser();
		System.out.println("Blood type: " + bloodTypeObjCus.bloodType); // the objects names should differ from class to class
		UltraSensitiveInfoUser spouseNameObjCus = new UltraSensitiveInfoUser();
		System.out.println("Blood type: " + spouseNameObjCus.spuseName);
		
		UltraSensitiveInfoDriver bloodTypeObjDri = new UltraSensitiveInfoDriver();
		System.out.println("Blood type: " + bloodTypeObjDri.bloodType);
		UltraSensitiveInfoDriver spouseNameObjDri = new UltraSensitiveInfoDriver();
		System.out.println("Spouse name: " + spouseNameObjDri.spuoseName);
		
	}

}
