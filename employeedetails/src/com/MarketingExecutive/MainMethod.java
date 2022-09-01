package com.MarketingExecutive;

import com.EmloyeePack.Employee;
import com.ManagerEmployee.Manager;

public class MainMethod 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Employee  e=new Marketingexecutive(1102,"Saiteja",22000);
		
		e.calculateComm();
		e.calculateTa();
		e.calculategrosssalary();
		e.calculateNetsal();
		e.printdetails();
		
		System.out.println("------------------------------------------------");
		
		Employee e1=new Manager(2202,"PavanKalyan",12000);
		
		e1.calculateComm();
		e1.calculateTa();
		e1.calculategrosssalary();
		e1.calculateIncentive();
		e1.calculateNetsal();
		e1.printdetails();
	}
	

}
