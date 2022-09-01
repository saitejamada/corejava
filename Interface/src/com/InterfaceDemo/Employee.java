package com.InterfaceDemo;

public class Employee implements Printable {

	int basic,empid;
	String ename;
	
	
	public Employee(int basic, int empid, String ename) 
	{
		super();
		this.basic = basic;
		this.empid = empid;
		this.ename = ename;
	}
	
	@Override
	public void printData()
	{
		// TODO Auto-generated method stub
		System.out.println("Employee Id Is "+empid+" Employee Name Is "+ename+"Employee Basic salary Is "+basic);
	}

}
