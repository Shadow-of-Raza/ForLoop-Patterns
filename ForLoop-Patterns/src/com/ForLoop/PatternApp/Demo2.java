package com.ForLoop.PatternApp;

public class Demo2 
{
	 public static void main(String[] args) 
	 {

		    int n=5;   
		    
		    for (int i = 0; i < n; i++) // 1
		    {

		      for (int j = 0; j < n ; j++) // 4
		      {
		    	  if(i == 0 || i == n-1 || j==0 || j==n-1 )
		    	  {
		    		  System.out.print(" $");
		    	  }
		    	  else
		    	  {
		    		  System.out.print("  ");
		    	  }
		      }
		      System.out.println();
		    }
	}
}
