package com.exceptionhandling;

import java.util.Scanner;

public class NumberToBinary 
{
	int number,binary;
	
	public NumberToBinary(int number)
	{
		super();
		this.number = number;
	}

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the decimal number");
		int number=scan.nextInt();
		
		NumberToBinary b=new NumberToBinary(number);
		
		 int a[]=new int[number];
		 int i=0;
		 while(number>0)
		 {
			 a[i]=(number%2);
			 number=number/2;
			 i++; 
		 }
		 for(int j=i-1;j>=0;j--)
		 {
			 System.out.print(a[j]);
		 }
	}
}
