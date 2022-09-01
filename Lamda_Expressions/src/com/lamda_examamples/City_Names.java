package com.lamda_examamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class City_Names {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		ArrayList al=new ArrayList<>();
		
		System.out.println("Enter The No Of Citys");
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter City Name");
			String city=sc.next();
			al.add(city);
		}
		
		Comparator<String> comp=(s1,s2)->s1.compareTo(s2);
		System.out.println("Before Sorting "+al);
		Collections.sort(al, comp);
		System.out.println("After Sorting"+al);
	}
}
