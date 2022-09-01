package com.anonmyousinnerclass;

import java.util.Scanner;

interface Printable1
{
	void acceptdetails();
	  	
	   void printdetails();
	  	 
}
abstract class Employee1 implements Printable1
{
	int eid,sal;
    String name;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

public class Employee 
{
	
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	Printable1 p=new Employee1(){
    		public void acceptdetails()
    		{
    			System.out.println("Enter id");
    			eid=sc.nextInt();
    			System.out.println("Enter name");
    			name=sc.next();
    			System.out.println("Enter sal");
    			sal=sc.nextInt();
    		}
    		
    		public void printdetails()
    		{
    			System.out.println("Employee Id is "+eid);
    			System.out.println("Employee Name is "+name);
    			System.out.println("Employee Salary is "+sal);
    		}
    	};
    	p.acceptdetails();
    	p.printdetails();
    }	
    	
    	
	}
	


