package com.weekelytest.dec16test;

import java.util.Scanner;

interface Printable
{
	void acceptDetails();
	void printdetails();
}

abstract class Shape1 implements Printable
{
	String shape;
	double area;
	
}

public class Shape
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Printable p=new Shape1() {

			@Override
			public void acceptDetails() {
				// TODO Auto-generated method stub
				System.out.println("Enter Shape ");
				shape=sc.next();
				System.out.println("Enter The Area");
				area=sc.nextInt();
			}

			@Override
			public void printdetails() {
				// TODO Auto-generated method stub
				System.out.println("The Shape IS "+shape);
				System.out.println("The Area Is "+area);
			}	
		};
		p.acceptDetails();
		p.printdetails();
	}
	
}
