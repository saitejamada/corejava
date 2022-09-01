package com.weekelytest.dec30.test;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.TreeSet;


class EmployeeDetails
{
	int eid;
	String ename;
	int sal;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public EmployeeDetails(int eid, String ename, int sal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "EmployeeDetails [eid=" + eid + ", ename=" + ename + ", sal=" + sal + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(eid);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeDetails other = (EmployeeDetails) obj;
		return eid == other.eid;
	}
		
}
class ComparatorById implements  Comparator<EmployeeDetails>
{

	@Override
	public int compare(EmployeeDetails o1, EmployeeDetails o2) {
		// TODO Auto-generated method stub
		if(o1.eid<o2.eid)
			return -1;
		else if(o1.eid>o2.eid)
			return 1;
		else
		return 0;
	}
	
}

class ComparatorByName implements Comparator<EmployeeDetails>
{

	@Override
	public int compare(EmployeeDetails o1, EmployeeDetails o2) {
		// TODO Auto-generated method stub
		return o1.ename.compareTo(o2.ename);
	}	
}

class ComparatorBySal implements Comparator<EmployeeDetails>
{

	@Override
	public int compare(EmployeeDetails o1, EmployeeDetails o2) {
		// TODO Auto-generated method stub
		if(o1.sal<o2.sal)
			return -1;
		else if(o1.sal>o2.sal)
			return 1;
		else
		return 0;
	
	}
	
}

public class Employee {

	public static void main(String[] args) {
		
		
		
		Comparator c;
		
		Scanner sc=new Scanner(System.in);
			
		System.out.println(" Select Sorting Option ");
		System.out.println("1.Sort By Id 2.Sort By Name  3.Sort By Salary ");
		
		int option=sc.nextInt();
		
		if(option==2)
		{
			c=new ComparatorByName();
			System.out.print("Sorting  By Name Is Selected ");
		}
		else if(option==3)
		{
			c=new ComparatorBySal();
			System.out.print("Sorting  By Salary  Is Selected ");
		}
		
		else
		{
			c=new ComparatorById();
			System.out.print("Sorting  By Id Is Selected ");
		}
		System.out.println();
		
		TreeSet<EmployeeDetails> hs=new TreeSet<EmployeeDetails>(c);
		
		System.out.println("Enter the Number Of Employees to Add");
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the details For "+i+" Employee ");
			System.out.println("Enter The Id");
			int id=sc.nextInt();
			
			System.out.println("Enter The Name");
			String sname=sc.next();
			
			System.out.println("Enter The Salary");
			int sal=sc.nextInt();
			
			hs.add(new EmployeeDetails(id,sname,sal));
		}
		
		System.out.println(" "+hs);
	}
}
