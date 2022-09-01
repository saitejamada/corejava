package com.employee;

public class MedicalStudent extends Student {
String Specailization;
MedicalStudent(String  Specailization)
{
	super(333,"Arjun","Bangolore",499);
	this.Specailization= Specailization;
}

void showDetils()
{
	System.out.println("Specailization is"+Specailization);
	
}
public static void main(String[] args) {
	MedicalStudent m=new MedicalStudent("MBBS");
	m.showStudentDetails();
	m.showDetils();
}
}
