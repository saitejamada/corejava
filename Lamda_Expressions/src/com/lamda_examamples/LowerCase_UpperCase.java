package com.lamda_examamples;

import java.util.*;
import java.util.function.*;

public class LowerCase_UpperCase {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The string");
		String s=sc.next();
		
		
		Function<String,String> f=(str)->{
			
			for(int i=0;i<str.length();i++)
			{
				char c=str.charAt(i);
				int value=c-32;
				System.out.print(""+((char) value));
			}
			return str;
		};
		f.apply(s);
		
		System.out.println();
		System.out.println("Enter The String To Count Vowels");
		String string=sc.next();
			
		Function<String,Integer> f1=(str1)->{
			int vcount=0;
			for(int i=0;i<str1.length();i++)
			{
				char c1=str1.charAt(i);
				if(c1=='a'||c1=='e'||c1=='i'||c1=='o'||c1=='u')
				{
					vcount++;
				}
			}
			return vcount;
		};
		System.out.println("Number Of Vowels Are "+f1.apply(string));
		
		System.out.println("Enter The Number For Find Factorial");
		int number=sc.nextInt();
		Function<Integer,Integer> f3=(n)->{
			int fact=1;
			for(int i=1;i<=n;i++)
			{
				fact*=i;
			}
			return fact;
		};
		System.out.println("Factorial Of Given Number is "+f3.apply(number));
		
		ArrayList<Integer> al=new ArrayList();
		System.out.println("Enter The Number opf Elements To Store");
		int cap=sc.nextInt();
		for(int i=0;i<cap;i++)
		{
			System.out.println("Enter The Number");
			int n=sc.nextInt();
			al.add(n);
		}
		System.out.println("Before Sorting"+al);
		
		Comparator<Integer> comp=(i1,i2)-> (i1<i2)?-1:(i1>i2)?1:0;
		
		Collections.sort(al,comp);
		System.out.println("After Sorting "+al);
		
		
	}
}
