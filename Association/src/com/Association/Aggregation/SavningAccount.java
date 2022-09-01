package com.Association.Aggregation;

public class SavningAccount 
{

	static double annualInterestRate=4;
	double savingBalance,montlyInterest;
	
	public SavningAccount(double savingBalance) 
	{
		super();
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
		System.out.println("Account Balance Is : "+savingBalance+"Rs");
		System.out.println("Annual Interest rate IS : "+annualInterestRate+" % ");
		System.out.println("Monthly Interest Is : "+calculateMonthlyInterest()+"Rs");
		System.out.println("Total Account Balance IS : "+getsavingBalance()+"Rs");
		System.out.println("_________________________");
	}

	

	public static void main(String[] args)
	{
		SavningAccount s1=new SavningAccount(2000);
		s1.printDetails();
		
		modifyInterestRate(5);
		System.out.println("Next Month Interest");
		s1.printDetails();
		
		SavningAccount s2=new SavningAccount(3000);
		s2.printDetails();
		
		modifyInterestRate(5);
		System.out.println("Next Month Interest");
		s2.printDetails();
		
		
		
		
		
	}
	
}
