package com.weekelytest.dec16test;

import java.util.Scanner;

public class Calculator 
{
	public static void main(String[] args) 
	{
		char choice;
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("Choose Options");
			System.out.println("addition(add)  subtraction(sub) multiplication(mul) division(div)");
			final String option=sc.next();
			
			System.out.println("Enter The X value");
			int x=sc.nextInt();
			System.out.println("Enter The y Value");
			int y=sc.nextInt();
			
			switch (option)
			{
			case "add":
			    System.out.println("Addition is "+(x+y));
			    break;
			  case "sub":
				  System.out.println("Subtraction  is "+(x-y));
			    break;
			  case "mul":
				  System.out.println("Multiplication is "+(x*y));
			    break;
			  case "div":
				  System.out.println("Division is "+(x/y));
			    break;
			    default:
			    	System.out.println("Invalid Input");
			}
			
			System.out.println("Do you want to continue  Y / N");
			choice=sc.next().charAt(0);
			
		}while(choice=='y'||choice=='Y');
	}
}
