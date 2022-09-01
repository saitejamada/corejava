package com.assignments14dec;

import java.util.Scanner;

public class Octual 
{
	int number;
	
	public  Octual(int number) 
	{
		super();
		this.number = number;
	}


public static void main(String[] args) 
 {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the decimal number");
	int number=scan.nextInt();
	 Octual c=new  Octual(number);
	int a[]=new int[number];
	 int i=0;
	 while(number>0)
	 {
		 a[i]=(number%8);
		 number=number/8;
		 i++; 
	 }
	 for(int j=i;j>=0;j--)
	 {
		 System.out.print(a[j]);
	 }
}
}
