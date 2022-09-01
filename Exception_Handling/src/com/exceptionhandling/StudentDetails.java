package com.exceptionhandling;

import java.util.Scanner;

public class StudentDetails 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String name="";
		String course="";
		int id=0;
		int p=0,c=0,m=0,t=0;
		
		System.out.println("Student name");
		name=sc.nextLine();
		System.out.println("Student course");
		course=sc.nextLine();

		System.out.println("1) Enter The Student Id  2)Enter Maths Marks ");
		System.out.println("3) Enter Computer Marks 4) Physics Marks");
		
		try
		{
			 id=sc.nextInt();
			 m=sc.nextInt();
			 c=sc.nextInt();
			 p=sc.nextInt();
			 t=p+c+m;
		}
		catch( NumberFormatException e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Student Id is "+id+"Student name is "+name+"Student course is "+course+" Total is"+t);
		}
		
	}
}
