package com.employee_management;

import java.util.Date;
import java.util.Scanner;

abstract class Employee
{	
	int emp_id;
	int dept_id;
	Date join_date;
	Registration r;
	Login l;
	
	public Employee(Login l) {
		super();
		this.l = l;
	}
	public Employee(Registration r) {
		super();
		this.r = r;
	}
	abstract int getEmpid();
	abstract int getDeptid();
	
}
class Manager extends Employee
{

	public Manager(Login l) {
		super(l);
		// TODO Auto-generated constructor stub
	}
	public Manager(Registration r) {
		super(r);
		// TODO Auto-generated constructor stub
	}
	@Override
	int getEmpid() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	int getDeptid() {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
class Login
{
	String username;
	String password;
	Scanner sc=new Scanner(System.in);
	public Login() 
	{
		//loginin();
		
	}
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void loginin() {
		// TODO Auto-generated method stub
		
		System.out.println("Enter The Username");
		username=sc.next();
		System.out.println("Enter The Password");
		password=sc.next();
		System.out.println("Login successful");
	}
	@Override
	public String toString() {
		return "Login [username=" + username + ", password=" + password + "]";
	}
	
}
class Registration
{
	String name;
	String address;
	int mobile;
	String mailid;
	Scanner sc=new Scanner(System.in);
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	
	public Registration() {
		super();
		// getDetails();
	}
	void getDetails()
	{
		System.out.println("Enter name");
		name=sc.next();
		System.out.println("Enter Id");
		address=sc.next();
		System.out.println("Enter mobile no");
		mobile=sc.nextInt();
		System.out.println("Mail Id");
		mailid=sc.next();
		System.out.println("Details Stored");
	}
	@Override
	public String toString() {
		return "Registration [name=" + name + ", address=" + address + ", mobile=" + mobile + ", mailid=" + mailid
				+ "]";
	}
	
}
class Start
{
	Scanner sc=new Scanner(System.in);
	Employee e;
	
	public Start()
	{
		getUser();
	}
	
	void getUser()
	{
		System.out.println("Welcome press 1.signin 2.registration");
		int op=sc.nextInt();
		if(op==1)
		{
			Login l=new  Login();
			e=new Manager(l);
		
		}
		else if(op==2)
		{
			Registration r=new Registration();
			e=new Manager(r);
		}
		else
		{
			System.err.println("Invalid Option");
		}
	}
	
	
}
public class Employee_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Start s=new Start();

	}

}
