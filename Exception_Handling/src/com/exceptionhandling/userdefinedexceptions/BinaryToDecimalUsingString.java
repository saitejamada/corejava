package com.exceptionhandling.userdefinedexceptions;

import java.util.Scanner;

class InvalidBinaryException extends RuntimeException
{
	String msg;

	public  InvalidBinaryException(String msg) 
	{
		super(msg);
		this.msg = msg;
	}
	
}

public class BinaryToDecimalUsingString 
{

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int res=0;
	    try
	    {
	    	System.out.println("Enter the String That Contains Binary Number");
		    String s=scan.next();
		    for(int i=0;i<s.length();i++)
		    {
		    	int binary=s.charAt(i);
		    	if(binary>'1')
		    		throw new  InvalidBinaryException("Binary Consist of Only 0&1");
		    	else
		    	res+=(binary-48)*Math.pow(2, i);
		    }
		    System.out.println("Number IS ="+res); 
	    }
	    finally {}
	}
}
