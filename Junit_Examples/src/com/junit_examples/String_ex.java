package com.junit_examples;

public class String_ex 
{
	static String con(String s,String s1)
	{
			return s+s1;
	}
	
	int pass(String pass)
	{
		return pass.length();
	}
	
	int even(int n)
	{
		return n%2;
	}
	 
	int prime(int n)
	{
		int count=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		return count;
	}
	
	int armstrong(int n)
	{
		int s=0,r=0;
		while(n>0)
		{
		r=n%10;
		n=n/10;
		s=s+(r*r*r);
		}
		return s;
	}
	
}
	
	

