package com.EmloyeePack;

public class Employee 
{
 int eid,bsal,ma;
double netsal,incentive;
double grosssal;
double comm;
double ta;
 String ename;
 
 
 	public Employee(int eid,String ename,int bsal)
 	{
 		this.eid=eid;
 		this.ename=ename;
 		this.bsal=bsal;
 		ma=200;
 	}
 	
 
 	public void calculateTa()
	{
	  	System.out.println("In Employee class ta method");
	}
 	
 	public void calculateComm()
 	{
 		System.out.println("In Employee class comm method");
 	}
 	
 	public void calculategrosssalary()
 	{
 		System.out.println("In Employee class gross sal method");
 	}
 	
 	public void calculateNetsal()
	{
 		System.out.println("In Employee class netsal method");
	}
 	public void calculateIncentive()
 	{
 		System.out.println("In Employee class incentive method");
 	}
 	public void printdetails()
	{
 		System.out.println("In Employee class printDetails method");	
		
	} 	
}
