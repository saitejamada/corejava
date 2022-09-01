package com.WeeklyTest.dec232021;

import java.util.Scanner;

public class StringToNumber
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The String");
		String s=sc.nextLine();
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c==' ')
			continue;
			if(c>='0'&&c<='9')
			continue;
			System.out.println("String "+c+" After Converting Into Number "+(int)(c-48));
		}
	}
}
