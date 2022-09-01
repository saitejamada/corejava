package com.regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class String_Ends_With_B {

	public static void main(String[] args) {
		
		String s="basdhjhasbdjbasbdb";
	
		Pattern p=Pattern.compile("b$");
		Matcher m=p.matcher(s);
		
		boolean status=m.find();
		
		if(status==true)
		{
			System.out.println(" String Ends With b "+m.start());
		}
		else
		{
			System.out.println("No String Ends With B");
		}
	}
}
