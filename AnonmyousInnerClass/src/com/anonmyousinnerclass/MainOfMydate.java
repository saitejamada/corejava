package com.anonmyousinnerclass;

import java.util.Scanner;

interface Printable
{
	void acceptdetails();
	  	
	 void printdetails();
	  	 
}

abstract class Mydate implements Printable 
{
	int date,month,year;

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
}
 class MainOfMydate 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	
	Printable p=new Mydate(){
		public void acceptdetails()
		{
			System.out.println("Enter date");
			date=sc.nextInt();
			System.out.println("Enter month");
			month=sc.nextInt();
			System.out.println("Enter Year");
			year=sc.nextInt();
		}
		
		public void printdetails()
		{
			System.out.println("date is "+date+"Month is "+month+"year is"+year);
		}
	};
	p.acceptdetails();
	p.printdetails();
}	
	
}
 
