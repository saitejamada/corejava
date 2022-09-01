package com.weekelytest.dec30.test;

import java.util.Scanner;

public class Replace_Word_String {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter The String  ");
		String s=sc.nextLine();
		
		System.out.println("Enter The Word to Replace  ");
		String word=sc.nextLine();
		
		System.out.println("Enter The Word You Wanted to get Replace With  "+word+" Word");
		String replaceword=sc.next();
		
		String[] arr= s.split(" ");
		
		for(int i=0;i<arr.length;i++)
		{
			
			if(arr[i].equalsIgnoreCase(word))
			{
				arr[i]=replaceword;
			}
			System.out.print(" "+arr[i]);
		}
	}
}
