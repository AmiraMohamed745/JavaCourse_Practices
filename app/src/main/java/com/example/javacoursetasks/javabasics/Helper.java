package com.example.javacoursetasks.javabasics;

class Helper {
	 
	   
	    public int sum(int a, int b)
	    {
	      
	        return a + b;
	    }
	}
	 

	class GFG {
	 
	  
	    public static void main(String[] args)
	    {
	       
	        int n = 3, m = 6;
	 
	       
	        Helper g = new Helper();
	 
	       
	        int s = g.sum(n, m);
	 
	       
	        System.out.print("sum is = " + s);
	    }
	}

