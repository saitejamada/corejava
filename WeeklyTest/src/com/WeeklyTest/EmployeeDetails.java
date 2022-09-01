package com.WeeklyTest;

class Employee
{
	int empid,basicsal,totalsalary,ma;
	String ename;
	
	public Employee(int empid, int basicsal, String ename) 
	{
		super();
		this.empid = empid;
		this.basicsal = basicsal;
		this.ename = ename;
		this.ma = 200;
	}
	
	void printDetails()
	{
		System.out.println("Employee Name Is : "+ename);
		System.out.println("Employee Id Is : "+empid);
		System.out.println("Employee Basic Salary Is : "+basicsal+"/Rs");
		System.out.println("Employee Medical Allowance Is : "+ma+"/Rs");
	}

}

class MarketingExecutive extends Employee
{
	 int empid,basicsal;
	 double totalsalary,comm,ta;
	 String ename;
	 
	 
	 public MarketingExecutive(int empid, int basicsal, String ename) 
	 {
		super(empid, basicsal, ename);
		this.empid = empid;
		this.basicsal = basicsal;
		this.ename = ename;
		
	 }
	 
	 	double calculateTa()
		{
		  ta=basicsal*0.05;
		  return ta;
		}
	 	
	 	 double calculateComm()
	 	{
	 		comm=basicsal*0.02;
	 		return comm;
	 	}
	 	
	 	double calculateTotalSalary()
		{
		  totalsalary=basicsal+ma+ta+comm;
		  return totalsalary;
		}
	 	
		public void printdetails()
		{
			super.printDetails();
			System.out.println("Employee Travel Allowance Is : "+calculateTa()+"/Rs");
			System.out.println("Employee Commission  Is : "+calculateComm()+"/Rs");
			System.out.println("Employee TotalSalary : "+calculateTotalSalary()+"/Rs");
			System.out.println("____________________________________________________");
		}
}

class Manager extends Employee
{
	 int empid,basicsal;
	 double totalsalary,comm,ta,incentive;
	 String ename;
	
	 	public Manager(int empid, int basicsal, String ename) 
	 	{
		super(empid, basicsal, ename);
		this.empid = empid;
		this.basicsal = basicsal;
		this.ename=ename;
	 	}
	 	
	 	double calculateTa()
		{
		  ta=basicsal*0.05;
		  return ta;
		}
	 	
	 	 double calculateComm()
	 	{
	 		comm=basicsal*0.02;
	 		return comm;
	 	}
	 	 
	 	double calculateIncentive()
	 	{
	 		incentive=basicsal*0.10;
	 		return incentive;
	 	}
	 	
	 	double calculateTotalSalary()
		{
		  totalsalary=basicsal+ma+ta+comm+incentive;
		  return totalsalary;
		}
	 	
	 	public void printdetails()
		{
			super.printDetails();
			System.out.println("Employee Travel Allowance Is : "+calculateTa()+"/Rs");
			System.out.println("Employee commission Is : "+calculateComm()+"/Rs");
			System.out.println("Employee  Incentive Is : "+calculateIncentive()+"/Rs");
			System.out.println("Employee TotalSalary : "+calculateTotalSalary()+"/Rs");
		}
}

class EmployeeDetails
{
	public static void main(String[] args) 
	{
		MarketingExecutive  m=new MarketingExecutive(1102,12000,"Saiteja");
		m.printdetails();
		
		Manager m1=new Manager(22,20000,"PavanKalyan");
		m1.printdetails();
	}
}