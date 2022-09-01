package com.WeeklyTest.dec232021;

import java.util.Scanner;
import java.util.StringTokenizer;


public class ReverseOfWordsInString
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		  System.out.println("Enter The String  ");
		  String s=sc.nextLine();
		  
		 char []s1=s.toCharArray();
		 
		 int n=s1.length;
		 System.out.println(n);
		 
		 for(int i=0;i<n;i++)
		 {
			if(s1[i]==' ')
				break;
		 }
		  
		/*  StringTokenizer st= new StringTokenizer(s," ");
		  int n=st.countTokens();
		  
		  String[] sss=new String[n];
		  
		  for(int i=n-1;i>=0;i--)
		  {
			  sss[i]=(String) st.nextToken(); 
		  }
		 System.out.println("Reverse Of String After Removing Is :");
		 
		 for(int i=0;i<n;i++)
		 {
			 System.out.print(" "+sss[i]);
		 }
	*/
	}
}
