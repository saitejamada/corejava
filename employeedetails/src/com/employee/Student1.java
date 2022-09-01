package com.employee;

class Student1 {
	int sid,marks;
	String sname,address;

	void getStudentDetails(int sid,String sname,String address,int marks)
	{
	this.sid=sid;
	this.sname=sname;
	this.address=address;
	this.marks=marks;
	}

	void showStudentDetails()
	{
	System.out.println("Student name is"+sname);
	System.out.println("Student id is"+sid);
	System.out.println("Student address is"+address);
	System.out.println("Student marks are"+marks);
	}
	
	public static void main(String[] args) {
		EngineeringStuden es1=new  EngineeringStuden();
		 es1.getStudentDetails(444,"Varun","Hyderabad",440);
		 es1.getStudentDetails("cse",3);
		 es1.showStudentDetails();
		 es1.showDetils();
		
		MedicalStuden m=new MedicalStuden();
		m.getStudentDetails(11,"Arjun","Hyderabad",500);
		m.getStudentdetails("MBBS");
		m.showStudentDetails();
		m.showDetils();
	}
}
class EngineeringStuden extends Student1{
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
	
}
class MedicalStuden extends Student1{
	String Specailization;
	void getStudentdetails(String  Specailization)
	{
		this.Specailization= Specailization;
	}

	void showDetils()
	{
		System.out.println("Specailization is"+Specailization);
		
	}
	
}