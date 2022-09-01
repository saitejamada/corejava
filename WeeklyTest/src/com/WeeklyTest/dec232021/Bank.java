package com.WeeklyTest.dec232021;

import java.util.Scanner;

class MinimumBalanceException extends RuntimeException
{
	String msg;

	public MinimumBalanceException(String msg) {
		super(msg);
		this.msg = msg;
	}
	
}
class LowBalanceException extends RuntimeException
{
	String msg;

	public LowBalanceException(String msg) {
		super(msg);
		this.msg = msg;
	}
	
}
class InvalidAmountException extends RuntimeException
{
	String msg;

	public InvalidAmountException(String msg) 
	{
		super(msg);
		this.msg = msg;
	}

}
class InvalidChoiceException extends RuntimeException
{
	String msg;

	public InvalidChoiceException(String msg) 
	{
		super(msg);
		this.msg = msg;
	}

}
public class Bank 
{
int balance,minbal;
	
	public Bank(int balance)
	{
		super();
		this.balance = balance;
		minbal=500;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Bank b=new Bank(10000);
		System.out.println("Select 1.Withdraw 2.Deposit ");
		try 
		{
			System.out.println("Enter The Option ");
			int option=sc.nextInt();
			if(option==1)
			{
				System.out.println("Enter The Amount To be Withdrawn");
				int  amt=sc.nextInt();
				if(amt<1)
				throw new InvalidAmountException("Amount Can Not Be Zero Or Negative");
				else
				b.withdraw(amt);
			}
				
			else if(option==2)
			{
				System.out.println("Enter The Amount To be Deposited");
				int  amt=sc.nextInt();
				if(amt<1)
				throw new InvalidAmountException("Amount Can Not Be Zero Or Negative");
				else
				b.deposit(amt);
			}
				
			else
			throw new InvalidChoiceException("In-Valid Option,Option Should be 1 Or 2");
		}
		catch(MinimumBalanceException mb)
		{
			System.err.println(mb.getMessage());
		}
		catch(LowBalanceException lb)
		{
			System.err.println(lb.getMessage());
		}
		catch(InvalidAmountException la)
		{
			System.err.println(la.getMessage());
		}
		catch(InvalidChoiceException la)
		{
			System.err.println(la.getMessage());
		}
		
		
	}
	private void deposit(int amt) 
	{
		// TODO Auto-generated method stub
		int a=amt;
		balance=balance+amt;
		System.out.println("Deposit Succesfull Account Balance Is "+balance);
		
	}

	private void withdraw(int amt) 
	{
		// TODO Auto-generated method stub
		int a=amt;
		try 
		{
			if(amt>balance)
				throw new LowBalanceException("Insufficient Account Balance ");
			else
				balance=balance-amt;
			
			if(balance < minbal)
			throw new MinimumBalanceException("Account Balance Is Less Than Minimum Balance(500/Rs)");
			else
				System.out.println("Withdrawal  Succesfull Account Balance Is "+balance);	
		}
		finally {}

}
}
