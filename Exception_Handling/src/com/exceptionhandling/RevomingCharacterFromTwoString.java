package com.exceptionhandling;

import java.util.Scanner;

public class RevomingCharacterFromTwoString
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int count=0;
		System.out.println("Enter the String One ");
	    String s=scan.next();
	    
	    System.out.println("Enter the String  Two");
	    String s1=scan.next();
	    
	    char ch[]=s.toCharArray();
	    char ch1[]=s1.toCharArray();
	    
	    System.out.print("After removing Character Present String Two ==");
	    
	    	for(int i=0;i<ch.length;i++)
	    	{
			  
			  	if(ch[i] ==' ')
			  	continue; 
			       
				for(int j=0;j<ch1.length;j++)
				{
				   if(ch[i]==ch1[j])
					count++;
				}
				 if(count==0)
				 {
					 System.out.print(ch[i]+",");
				 }
				 count=0;
	    	}
	}
}
