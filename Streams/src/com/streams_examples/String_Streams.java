package com.streams_examples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class String_Streams {
	
	public static void main(String[] args) {
	
		List<String> al=new ArrayList<String>();
		al.add("sai");
		al.add("");
		al.add("teja");
		al.add("mada");
		al.add("");
		al.add("prakash");
		al.add("Sunny");
		
		Long c=al.stream().filter(s->s.isEmpty()).count();
		System.out.println(" Empty String  Count is "+c);
		
		Long c1=al.stream().filter(s1->s1.length()>3).count();
		System.out.println(" Length Of String Greater Than 3 is : "+c1);
		
		List<String> ne=al.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println("After Converting To Upper case"+ne);
		
		
	}
}
