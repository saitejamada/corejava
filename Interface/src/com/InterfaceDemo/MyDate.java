package com.InterfaceDemo;

public class MyDate implements Printable{

	int day,month,year;
	
	public MyDate(int day, int month, int year)
	{
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	@Override
	public void printData() 
	{
		// TODO Auto-generated method stub
		System.out.println("Date Is "+day+"Month is "+month+"Year is "+year);
	}

		
}
