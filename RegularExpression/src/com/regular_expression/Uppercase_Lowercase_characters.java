package com.regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Uppercase_Lowercase_characters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="ABbdjhbjhFbbjhbGnbjbhTxsfg";
		
		Pattern p=Pattern.compile("[A-Z][a-z]");
		Matcher m=p.matcher(s);
		while(m.find())
		{
			System.out.println(" Found At "+m.start()+" Word Is "+s.charAt(m.start())+" "+s.charAt(m.start()+1));
		}
	}

}
