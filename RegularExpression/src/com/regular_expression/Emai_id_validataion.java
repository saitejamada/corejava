package com.regular_expression;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Emai_id_validataion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		char c='n';
		do
		{
			System.out.println("Enter Email Id ");
			String s=sc.next();
			System.out.println("Validate Email "+Pattern.matches("[a-z][._a-z0-9]+@[a-z]+.[c][o][m]+$", s));
			System.out.println("Do You Wish To Continue");
			c=sc.next().charAt(0);
		}while(c=='y');
	}
}
