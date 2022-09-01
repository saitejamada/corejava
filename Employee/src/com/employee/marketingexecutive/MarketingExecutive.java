package com.employee.marketingexecutive;

import com.employee.Employee;

public class MarketingExecutive extends Employee
{
	
		 int eid,bsal,ma;
		 double netsal;
		 double grosssal;
		 double comm;
		 double ta;
		 String ename;
		 
		 
		public int getEid() {
			return eid;
		}

		public void setEid(int eid) {
			this.eid = eid;
		}

		public int getBsal() {
			return bsal;
		}

		public void setBsal(int bsal) {
			this.bsal = bsal;
		}

		public int getMa() {
			return ma;
		}

		public void setMa(int ma) {
			this.ma = ma;
		}

		public double getNetsal() {
			return netsal;
		}

		public void setNetsal(double netsal) {
			this.netsal = netsal;
		}

		public double getGrosssal() {
			return grosssal;
		}

		public void setGrosssal(double grosssal) {
			this.grosssal = grosssal;
		}

		public double getComm() {
			return comm;
		}

		public void setComm(double comm) {
			this.comm = comm;
		}

		public double getTa() {
			return ta;
		}

		public void setTa(double ta) {
			this.ta = ta;
		}

		public String getEname() {
			return ename;
		}

		public void setEname(String ename) {
			this.ename = ename;
		}

		public MarketingExecutive(int eid,String ename,int bsal)
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
	 	
	 	public double calculategrosssalary()
	 	{
	 		calculateComm();
	 		calculateTa();
	 		grosssal=bsal+ta+comm+ma;
	 		return grosssal; 
	 	}
	 	
	 	public double calculateNetsal()
		{
		  netsal=grosssal-200;	
		  return  netsal;
		}
		public void printdetails()
		{
			System.out.println("Name is"+ename);
			System.out.println("Id IS "+eid);
			System.out.println("Basic Salary is"+bsal);
			System.out.println("Gross Salary is "+calculategrosssalary());
			System.out.println("Travle allowance is "+ta);
			System.out.println("ma is "+ma);
			System.out.println("commisiom is"+comm);
			System.out.println("Net Salary"+calculateNetsal());
			
		}
	
	}


