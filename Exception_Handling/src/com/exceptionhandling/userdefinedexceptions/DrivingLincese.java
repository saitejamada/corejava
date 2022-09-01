package com.exceptionhandling.userdefinedexceptions;

import java.util.Scanner;

class MinimumAgeException extends RuntimeException
{
	String msg;

	public MinimumAgeException(String msg) {
		super(msg);
		this.msg = msg;
	}
	
}
class InvalidAgeException extends RuntimeException
{
	String msg;

	public InvalidAgeException(String msg) 
	{
		super(msg);
		this.msg = msg;
	}
	
}

public class DrivingLincese
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		try 
		{
				System.out.println("Enter your  Age ");
				int age=sc.nextInt();
			
				 if(age<1)
				throw new  InvalidAgeException("Age Cant Be Zero (or) Negative ");
				 
				 else if(age<18 && age>=90)
					 throw new  MinimumAgeException("Age Should Be 18 (or) Above ");
				 
				 else
					System.out.println("You Are Eligible For Driving Lincese");
				
			} 
		catch(InvalidAgeException ie)
		{
			System.err.println(ie.getMessage());
		}
		catch(MinimumAgeException me)
		{
			System.err.println(me.getMessage());
		}
	
	}
}
