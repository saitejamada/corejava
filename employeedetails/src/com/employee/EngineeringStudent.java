package com.employee;

public class EngineeringStudent extends Student {
String course;
int year;
EngineeringStudent(String course,int year)
{
	super(112,"sai","hyderabad",404);
	this.course=course;
	this.year=year;
}
void showDetils()
{
	System.out.println("course is"+course);
	System.out.println("year is"+year);
	
}
public static void main(String[] args) {
	 EngineeringStudent es=new  EngineeringStudent("cse",3);
	 es.showStudentDetails();
	 es.showDetils();
}
}
