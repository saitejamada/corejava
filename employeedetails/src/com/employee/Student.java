package com.employee;

public class Student {
int sid,marks;
String sname,address;

Student(int sid,String sname,String address,int marks)
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

}
