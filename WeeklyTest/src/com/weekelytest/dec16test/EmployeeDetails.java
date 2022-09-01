package com.weekelytest.dec16test;

import java.util.Scanner;


abstract class Employee implements Printable
{
	int eid,bsal;
	String name;
}

public class EmployeeDetails
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Printable p=new Employee() {

			@Override
			public void acceptDetails() {
				// TODO Auto-generated method stub
				System.out.println("Enter Employee id ");
				eid=sc.nextInt();
				System.out.println("Enter Employee Name");
				name=sc.next();
				System.out.println("Enter Employee Basic salary ");
				bsal=sc.nextInt();
			}

			@Override
			public void printdetails() {
				// TODO Auto-generated method stub
				System.out.println("The Employee Id  IS "+eid);
				System.out.println("The Employee name Is "+name);
				System.out.println("The Employee Salary 		IS "+bsal);
			}
			
		};
		p.acceptDetails();
		p.printdetails();
	}

}
