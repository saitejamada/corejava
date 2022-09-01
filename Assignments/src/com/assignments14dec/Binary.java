package com.assignments14dec;

import java.util.Scanner;

public class Binary 
{ 
	int number;
	int binary;
	public Binary(int number) 
	{
		super();
		this.number = number;
	}


public static void main(String[] args) 
 {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the decimal number");
	int number=scan.nextInt();
	Binary b=new Binary(number);
	int a[]=new int[number];
	 int i=0;
	 while(number>0)
	 {
		 a[i]=(number%2);
		 number=number/2;
		 i++; 
	 }
	 for(int j=i;j>=0;j--)
	 {
		 System.out.print(a[j]);
	 }
}
}