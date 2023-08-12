package com.example.javacoursetasks.commanlinearguements;

public class PreincrementAndPastincrement {

	public static void main(String[] args) {
			
		int a = 20;
		int b = a++; // b= 20, a= 21 for next time use
		int c = ++a; // c= 22, a= 22 for next time use
		int d = a++; // d= 22, a= 23for next time use
		int e = ++a; // e= 24, a = 24 for next time use
		int f = a++; // f= 24, a= 25 for next time use
		int g = ++a; // g= 26, a= 26 for next time use
		int h = 2 * a++; // h= 52, a=27 for next time use
		int i = 2 * a++; // i= 54, a 28 for next time use
		int j = 2 * ++a; // j = 58, a = 29 for next time use
		
		System.out.println(b); 
		System.out.println(c); 
		System.out.println(d); 
		System.out.println(e); 
		System.out.println(f); 
		System.out.println(g); 
		System.out.println(h); 
		System.out.println(i); 
		System.out.println(j); 
		
		
		int k = 3 * ++j; // k= 177, j= 59
		int k2 = 3 * j++; // k2 = 177, j= 60
		int k3 = 3 * ++j; // k3= 183, j 61
		
		System.out.println(k);
		System.out.println(k2);
		System.out.println(k3);
		
		
		int x = 9;
		int y = 9 * ++x; // y= 90; x= 10 
		int z = 9 * x++; // z= 90; x= 11
		int w = 5 * ++x; // w= 60; x= 12
		
		System.out.println(y); 
		System.out.println(z); 
		System.out.println(w); 
		
		
	
	}
}
