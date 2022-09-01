package com.MethodOverrididng;

public class Student extends Person
{
	int ssc,inter,hallticketnumber;
	String dept;
	//Method Overloading
	void setdata(String name,String lastname,int mobilenumber)
	{
		super.setData(name, lastname);
		super.setData(mobilenumber);
	}
	
	void setData(int ssc,int inter,int hallticketnumber)
	{
		this.ssc=ssc;
		this.inter=inter;
		this.hallticketnumber=hallticketnumber;
	}
	
	void setData(String dept)
	{
		this.dept=dept;
	}
	//Method Overriding
	void getData()
	{
		super.getData();
		System.out.println("SSC Marks Are "+ssc);
		System.out.println("Inter Marks Are "+inter);
		System.out.println("Hall Ticket Number Is "+hallticketnumber);
		System.out.println("Department is "+dept);
		
	}
	
	public static void main(String[] args) 
	{
		Student s=new Student();
		s.setdata("SaiTeja", "Mada", 123456789);
		s.setData(92, 80, 122134);
		s.setData("Computer Science");
		s.getData();
	}

}
