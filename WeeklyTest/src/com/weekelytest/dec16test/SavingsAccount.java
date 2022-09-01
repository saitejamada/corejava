package com.weekelytest.dec16test;

import java.util.Scanner;

public class SavingsAccount
{
	
	static double annualInterestRate=4;
	double savingBalance,montlyInterest;
	
	public SavingsAccount(double savingBalance) 
	{
		this.savingBalance = savingBalance;
	}

	double calculateMonthlyInterest()
	{
		montlyInterest=savingBalance*annualInterestRate/100;
		return montlyInterest;
	}
	double getsavingBalance()
	{
		savingBalance+=montlyInterest;
		return savingBalance;
	}
	static void modifyInterestRate(double a)
	{
	   annualInterestRate=a;
	  
	}
	
	void printDetails()
	{
		System.out.println("Account Balance Is : "+savingBalance+" Rs");
		System.out.println("Annual Interest rate IS : "+annualInterestRate+" % ");
		System.out.println("Monthly Interest Is : "+calculateMonthlyInterest()+" Rs");
		System.out.println("Total Account Balance IS : "+getsavingBalance()+" Rs");
		System.out.println("_________________________");
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Account balance ");
		int bal=sc.nextInt();
		
		SavingsAccount s=new SavingsAccount(bal);
		s.printDetails();
		modifyInterestRate(5);
		s.printDetails();
		
		System.out.println("Enter The Account balance");
		int bal1=sc.nextInt();
		
		s=new SavingsAccount(bal1);
		s.printDetails();
		modifyInterestRate(5);
		s.printDetails();
		
	}
}
