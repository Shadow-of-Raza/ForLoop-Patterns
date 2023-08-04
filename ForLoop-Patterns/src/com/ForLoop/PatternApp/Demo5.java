package com.ForLoop.PatternApp;

public class Demo5 {
	public static void main(String[] args) {

    int n=5;
    for (int i = 0; i < n; i++) // 0 i++ 
    {
    	
      for (int j = n ; j > i; j--) // 4
      {
    	  System.out.print("*");
      }

      for(int k=0; k<=i; k++)
      {
    	  System.out.print(" ");
      }
	  System.out.println(i);
    }
   
    
  }
}
