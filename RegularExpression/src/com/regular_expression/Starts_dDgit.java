package com.regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Starts_dDgit {

	public static void main(String[] args) {
		
		String s="0basdhjhasbdjbasbdb";
		
		Pattern p=Pattern.compile("^[0-9]");
		Matcher m=p.matcher(s);
		
		boolean status=m.find();
		
		if(status==true)
		{
			System.out.println(" String Starts  With digit "+status);
		}
		else
		{
			System.out.println("No String Starts  With digit "+status);
		}
		
	}
}
