package com.streams_examples;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Square_Distinct_Numbers {

	public static void main(String[] args) {
		
		List<Integer> al=new ArrayList<Integer>();
		al.add(21);
		al.add(22);
		al.add(22);
		al.add(4);
		al.add(5);
		al.add(25);
		al.add(21);
		System.out.println(" Elements In List "+al);
		
		List<Integer> l=al.stream().distinct().map(i->i*i).toList();
		System.out.println("Square Of Distinct Values"+l);
		
		Integer min=al.stream().min((i,i1)-> i.compareTo(i1)).get();
		System.out.println("Minumum value is "+min);
		
		Integer max=al.stream().max((i,i1)-> i.compareTo(i1)).get();
		System.out.println("Maximum value is "+max);
		
		int s=0;
		int sum=al.stream().mapToInt(e->e).sum();
		System.out.println("Sum is "+sum);
		
		OptionalDouble avg=al.stream().mapToInt(e->e).average();
		System.out.println("Average is "+avg);
		
		
	
	}
}
