package com.employee;

public class MedicalStuden1 extends Student1 {
	String Specailization;
	void getStudentdetails(String  Specailization)
	{
		this.Specailization= Specailization;
	}

	void showDetils()
	{
		System.out.println("Specailization is"+Specailization);
		
	}
	public static void main(String[] args) {
		MedicalStuden1 m=new MedicalStuden1();
		m.getStudentDetails(11,"Arjun","Hyderabad",500);
		m.getStudentdetails("MBBS");
		m.showStudentDetails();
		m.showDetils();
	}
}
