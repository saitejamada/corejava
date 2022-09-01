package com.ManagerEmployee;
import com.EmloyeePack.*;

public class Manager extends Employee 
{
	 int eid,bsal,ma;
	 double netsal,incentive;
	 double grosssal;
	 double comm;
	 double ta;
	 String ename;
	 
	 
	public Manager(int eid,String ename,int bsal)
	{
		super(eid,ename,bsal);
		this.eid=eid;
		this.ename=ename;
		this.bsal=bsal;
		
     }
	
	public void calculateTa()
	{
	  ta=bsal*0.05;	
	}
 	
 	public void calculateComm()
 	{
 		comm=bsal*0.02;
 	}
 	
 	public void calculategrosssalary()
 	{
 		grosssal=bsal+ta+comm+ma;
 	}
 	public void calculateIncentive()
 	{
 		incentive=bsal*0.10;
 	}
 	
 	public void calculateNetsal()
	{
	  netsal=grosssal-200;		
	}
 	public void printdetails()
	{
		System.out.println("Name is"+ename);
		System.out.println("Id IS "+eid);
		System.out.println("Basic Salary is"+bsal);
		System.out.println("Gross Salary is "+grosssal);
		System.out.println("Incentives Are "+incentive);
		System.out.println("Net Salary"+netsal);
	}
	
	

}
