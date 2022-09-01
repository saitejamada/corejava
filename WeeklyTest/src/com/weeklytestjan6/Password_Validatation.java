package com.weeklytestjan6;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class InvalidPasswordException extends RuntimeException
{
	String msg;

	public InvalidPasswordException(String msg) {
		super(msg);
		this.msg = msg;
	}
}


public class Password_Validatation {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Password");
		String pass=sc.next();

		if(pass.length()>=8)
		{
			boolean res=Pattern.matches("([a-z]*| [A-Z]*| [0-9]*)", pass);
			System.out.println(res);
//			if(res==true)
//			{
//				System.out.println("Valid");
//			}
//			else
//			{
//				throw new InvalidPasswordException("Password Must Contain 1 Uppercase Character 1 LowerCase Characeter 1 Number and 1 special charater(@ , $ , . , _)");
//			}
			
		}
		else
		{
			throw new InvalidPasswordException("Password Should Be AtLeast 8 Charecters ");
		}
		
	}
}
