package com.employee;

public class EngineeringStudent1 extends Student1{
	String course;
	int year;
	void getStudentDetails(String course,int year)
	{
		
		this.course=course;
		this.year=year;
	}
	void showDetils()
	{
		System.out.println("course is"+course);
		System.out.println("year is"+year);
		
	}
	public static void main(String[] args) {
		 EngineeringStudent1 es1=new  EngineeringStudent1();
		 es1.getStudentDetails(444,"Varun","Hyderabad",440);
		 es1.getStudentDetails("cse",3);
		 es1.showStudentDetails();
		 es1.showDetils();
	}
}
