package com.exceptionhandling;

import java.util.Scanner;

public class ArthimaticException 
{   
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The A value ");
		int a =sc.nextInt();
		System.out.println("Enter The B value ");
		int b =sc.nextInt();
		
		ArthimaticException ae=new ArthimaticException();
		System.out.println("division of a,b is = "+ae.divide(a,b));
	}
	
	int divide(int a,int b)
	{
		int c=0;
		try
		{
			c=a/b;	
		}
		
		catch(Exception e)
		{
		   System.out.println(" b cannot be 0 ");	
		}
		
		return c;
	}
}
