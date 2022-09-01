package com.wrapperclasses;

import java.util.Scanner;

class Wrap
{
	static int  convert(String s)
	   {
			int n=0;
			for(int i=0;i<s.length();i++)
			{
				char c=s.charAt(i);
				if(c>=48 && c<=57)
				{
					n=n*10+c-48;
				}
			}
			return n;
	   }
}

public class Wrapping 
{
   public static void main(String[] args) 
   {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter The String to be Convereted To Integer");
	    String s=sc.next();
	    System.out.println("Integer is "+Wrap.convert(s));
    }
}