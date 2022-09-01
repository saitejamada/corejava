package com.employee.main;
import java.util.Scanner;
import com.employee.*;
import com.employee.manager.*;
import com.employee.marketingexecutive.*;

public class MainClassOfEmployee
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Marketing Executive Id ");
		int id=sc.nextInt();
		System.out.println("Enter the name ");
		String name=sc.next();
		System.out.println("Enter basic Salary");
		int basl=sc.nextInt();
		Employee  e=new MarketingExecutive(id,name,basl);
		e.printdetails();
		
		System.out.println("------------------------------------------------");
		System.out.println("Enter The Manager Id ");
		int mid=sc.nextInt();
		System.out.println("Enter the name ");
		String mname=sc.next();
		System.out.println("Enter basic Salary");
		int mbasl=sc.nextInt();
		Employee e1=new Manager(mid,mname,mbasl);
		e1.printdetails();
	}
}
