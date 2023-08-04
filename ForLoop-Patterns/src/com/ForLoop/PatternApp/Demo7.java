package com.ForLoop.PatternApp;

public class Demo7 {
	public static void main(String[] args) {

    int row=5;
    for (int i = 1; i <= row; i++) 
    {

      for (int j = 1 ; j >=row-  1; j++) 
      {
    	  System.out.print("  ");
      }

      for(int k=1; k<=i; k++)
      {
    	  System.out.print(i+" ");
      }
	  System.out.println();

    }
  }

}
