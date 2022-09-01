package com.InterfaceDemo;

public class EmployeeDemo implements Printable // for interfaces we use implements keyword
{
  
	public void printData()
	{
		System.out.println("Enfec pvt Solution");
	}
	
	public static void main(String[] args) 
	{
		//Printable p=new Printable(); we can not create objects for interfaces
		
		Printable p1=new EmployeeDemo();//we can create reference for interfaces
		p1.printData();
	}
}
