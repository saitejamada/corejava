package com.weeklytestjan6;

import java.util.Scanner;

class  Account {
	Scanner sc=new Scanner(System.in);
	int balance=10000;


	 public  int withdraw()
	{
		 
		 synchronized(this)
		 {
			 System.out.println(" Current Thread Is "+Thread.currentThread().getName());
			 System.out.println("Enter the Amount To Be WithDraw");
			int amt=sc.nextInt();
			 if(amt>balance)
				{
					System.out.println(" In Sufficient Funds To WithDraw Account Balance Is "+balance);
					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			 	System.out.println(" Current Thread Is "+Thread.currentThread().getName());
				balance-=amt;
				System.out.println("After WithDrawing Amount Is "+balance);
				return amt;	
		 }
	}
	
	 public void deposit()
	{
		
		 synchronized(this)
		 {
			 System.out.println(" Current Thread Is "+Thread.currentThread().getName());
			 System.out.println("Enter the Amount To Be Deposit");
				int damt=sc.nextInt();
			 System.out.println("Waiting For Deposit ");
			 balance+=damt;
			 System.out.println("Deposit Succesful");
				System.out.println("Account Balance  is "+balance);
				notify();
		 }
		
	}
}

class Husband extends Thread
{

	Account a;
	
	public Husband(Account a) {
		super();
		this.a = a;
	
	}
	public void run()
	{
		a.deposit();
	}
}
class Wife extends Thread
{

	Account a;
	
	public Wife(Account a) {
		super();
		this.a = a;
	
	}
	public void run()
	{
		a.withdraw();
	}
}
class Bank_Account{

	public static void main(String[] args) {
		
		Account a=new Account();
		Husband h=new Husband(a);
		Wife w=new Wife(a);
		h.setName("Husband");
		w.setName("Wife");
		w.start();
		h.start();
		
	}
}