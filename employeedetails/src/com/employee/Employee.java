package com.employee;

public class Employee {
	
	int eid,medicalallowance=200,it=300;
	double basic,grosssal,netsal,ta,da,hra,pf;
	String name,joiningdate,birthdate;
	
	Employee(int eid,String name,int basic,String joiningdate,String birthdate)
	{
		this.eid=eid;
		this.name=name;
		this.basic=basic;
		this.joiningdate=joiningdate;
		this.birthdate=birthdate;
	}
	
	double calTa()
	{
	  ta=basic*0.05;	
	  return ta;	
	}
	  double  calDa()
	{
	  da=basic*0.08;
	  return da;		
	}
	 double calHra()
	{
	  hra=basic*0.10;
	  return hra;		
	}
	 double calPf()
	{
	  pf=basic*0.03;
	  return pf;		
	}
	double calGrosssal()
	{
	  grosssal=basic+ta+da+hra+medicalallowance;
	  return grosssal;		
	}
	double calNetsal()
	{
	  netsal=grosssal-(pf+it);
	  return netsal;		
	}
	
	void printDetails()
	{
		 System.out.println("Employee Name is :"+name);
		  System.out.println("Employee Id is :"+eid);
		  System.out.println("Employee Joining Date is :"+joiningdate);
		  System.out.println("Employee Birth Date is :"+birthdate);
		  System.out.println("Employee basic Salary is :"+basic);
		  System.out.println("Employee Travel Allowance  is :"+calTa());
		  System.out.println("Employee Dearness Allowance  is :"+calDa());
		  System.out.println("Employee House Rent Allowance  is :"+calHra());
		  System.out.println("Employee Provident Fund  is :"+calPf());
		  System.out.println("Employee Gross Salary  is :"+calGrosssal());
		  System.out.println("Employee Net Salary  is :"+calNetsal());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Employee e=new Employee(121,"sai",25000,"12-1-2020","12-11-1997");
       e.printDetails();
	}

}
