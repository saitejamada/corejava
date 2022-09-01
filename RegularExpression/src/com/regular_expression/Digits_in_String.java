package com.regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Digits_in_String {

	public static void main(String[] args) {
		
		String s= "hgb6df6hebf34y535hk5r65c";
		int count=0;
		
		Pattern p=Pattern.compile("[0-9]");
		Matcher m=p.matcher(s);
		
		while(m.find())
		{
			System.out.println("Number is  "+s.charAt(m.start()));
			count++;
		}
		System.out.println("Number oF digits "+count);
		
	}
}
