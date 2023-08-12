package com.example.javacoursetasks.flowcontrol;

public class GradingApplicationEnDep {

	public static void main(String[] args) {

		float translationintoAr = 30, novel = 36, linguistics = 37, essay = 31, arEssay = 36, secondLang = 52,
				culture = 17;

		float avrg = ((translationintoAr + novel + linguistics + essay + arEssay + secondLang + culture) / 3);

		 // translation into arabic
			if (translationintoAr <= 15) {
				System.out.println("Grade TansintoAr: راسب");
			} else if ((translationintoAr <= 24) && (translationintoAr >= 16)) {
				System.out.println("Grade TansintoAr: مقبول");
			} else if ((translationintoAr <= 34) && (translationintoAr >= 25)) {
				System.out.println("Grade TansintoAr: جيد");
			} else if ((translationintoAr <= 35) && (translationintoAr >= 34)) {
				System.out.println("Grade TansintoAr: جيدجدًا");
			} else {
				System.out.println("Grade TansintoAr: امتياز");
			}
		
		// novel
		if (novel <= 15) {
			System.out.println("Grade Novel: راسب");
		} else if ((novel <= 24) && (novel >= 16)) {
			System.out.println("Grade Novel: مقبول");
		} else if ((novel <= 34) && (novel >= 25)) {
			System.out.println("Grade Novel: جيد");
		} else if ((novel <= 35) && (novel >= 34)) {
			System.out.println("Grade Novel: جيدجدًا");
		} else {
			System.out.println("Grade Novel: امتياز");
		}
		
		// translation into arabic
		if (translationintoAr <= 15) {
			System.out.println("Grade TansintoAr: راسب");
		} else if ((translationintoAr <= 24) && (translationintoAr >= 16)) {
			System.out.println("Grade TansintoAr: مقبول");
		} else if ((translationintoAr <= 34) && (translationintoAr >= 25)) {
			System.out.println("Grade TansintoAr: جيد");
		} else if ((translationintoAr <= 35) && (translationintoAr >= 34)) {
			System.out.println("Grade TansintoAr: جيدجدًا");
		} else {
			System.out.println("Grade TansintoAr: امتياز");
		
		// average 
		
		if (avrg <= 239) {
			System.out.println("التقدير: جيدجدًا");
		}
		
		
}}}
