package com.exceptionhandling;

import java.util.Scanner;

public class BinaryToDecimal 
{
	public static void main(String[] args) 
	{	
		int number,res=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Binary number");
	    String s=scan.next();
	    
	    int i1=Integer.parseInt(s, 2);
	    System.out.println("Binary number After Converting It to decimal is : "+i1);
	    
	    for(int i=0;i<s.length();i++)
	    {
	    	int binary=s.charAt(i);
	    	res+=(binary-48)*Math.pow(2, i);
	    }
	   System.out.println("Result is "+res);
		
		
	}
}
