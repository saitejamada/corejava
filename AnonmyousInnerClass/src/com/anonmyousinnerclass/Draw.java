package com.anonmyousinnerclass;

import java.util.Scanner;

interface Printable2
{
	void acceptdetails();
	  	
	   void printdetails();
	  	 
}
abstract class Shape implements Printable2
{
   String shape;
   
}

public class Draw {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Printable2 p=new Shape(){
			
			@Override
			public void acceptdetails() {
				// TODO Auto-generated method stub
				System.out.println("Enter Shape");
				shape=sc.next();
			}
			@Override
			public void printdetails() {
				// TODO Auto-generated method stub
				System.out.println("Shape is"+shape);	
			}
		};
		p.acceptdetails();
		p.printdetails();
	}

}
