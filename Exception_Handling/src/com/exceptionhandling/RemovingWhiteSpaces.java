package com.exceptionhandling;

import java.util.Scanner;

public class RemovingWhiteSpaces
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String");
	    String s=scan.nextLine();	
	    
	    String[] sub=s.split(" ");
	    
	    System.out.print("After Removing Blank Spaces ====");
	    for(int i=0;i<sub.length;i++)
		  {
	    	System.out.print(sub[i]);
		  }
		  }
}
