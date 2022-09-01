package com.employee;

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
	 	
	 	public void printdetails()
		{
	 		System.out.println("In Employee class printDetails method");	
			
		} 	
	}

