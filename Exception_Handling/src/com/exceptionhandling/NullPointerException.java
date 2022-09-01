package com.exceptionhandling;

public class NullPointerException 
{
	public static void main(String[] args)  
	{
		String s=null;
		 NullPointerException ne=null;
		 
		 try
		 {
			 s.equals("sai");
			 ne.print();
		 } 
		 catch (Exception e) 
		 {
			 
			e.printStackTrace();
		 }
	  
		 finally
		 {
			System.out.println("In Finally Block"); 
		 } 
	  
	}
	void print()
	{
		System.out.println("In Print Method");
	}
}
