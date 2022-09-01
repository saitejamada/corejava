package com.streams_examples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Sorting_Using_Strams {

	public static void main(String[] args) {
		
		List<String> al=new ArrayList<String>();
		al.add("hyderabad");
		al.add("nzb");
		al.add("warangal");
		al.add("khammam");
		al.add("kamareddy");
		al.add("nirmal");
		al.add("mumbai");
		al.add("bangalore");
		al.add("chennai");
		al.add("manglore");
		System.out.println("Before Sorting "+al);
		List<String> al1=al.stream().sorted((s,s1)-> s.compareTo(s1)).collect(Collectors.toList());
		System.out.println("After Sorting "+al1);
		
	}
}
