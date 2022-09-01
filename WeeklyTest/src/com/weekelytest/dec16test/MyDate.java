package com.weekelytest.dec16test;

import java.util.Scanner;

abstract class Mydate1 implements Printable
{
	int date,month,year;
}

public class MyDate 
{
  public static void main(String[] args) 
  {
	Scanner sc=new Scanner(System.in);
	Printable p=new Mydate1() {

		@Override
		public void acceptDetails() {
			// TODO Auto-generated method stub
			System.out.println("Enter date ");
			date=sc.nextInt();
			System.out.println("Enter month ");
			month=sc.nextInt();
			System.out.println("Enter year ");
			year=sc.nextInt();
		}

		@Override
		public void printdetails() {
			// TODO Auto-generated method stub
			System.out.println("date is "+date+" month is "+month+" year is "+year);
		}
		
	};
	p.acceptDetails();
	p.printdetails();
}
}
