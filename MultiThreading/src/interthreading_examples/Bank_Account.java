package interthreading_examples;

import java.util.Scanner;

class  Account {
	
	boolean status=false;
	int balance=1000;
	
	 public  int withdraw(int amt)
	{
		 synchronized(this)
		 {
			 if(!status)
			 {
				 if(amt>balance)
					{
						System.out.println(" In Sufficient Funds ");
						try {
							wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					} 
			 }
			
				balance-=amt;
				System.out.println(" Balance is "+balance);
				status=false;
				return amt;
		 }
	}
	
	 public void deposit(int damt)
	{
		 synchronized(this)
		 {
			 if(status)
			 {
				 try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 }
			 System.out.println("Waiting For Deposit ");
			 balance+=damt;
			 System.out.println("Deposit Succesful");
				System.out.println("Balance is "+balance);
				status=true;
				notify();
		 }
		
	}
}

class Husband extends Thread
{

	Account a;
	int bamt;
	public Husband(Account a, int bamt) {
		super();
		this.a = a;
		this.bamt = bamt;
	}
	public void run()
	{
		a.deposit(bamt);
	}
}
class Wife extends Thread
{

	Account a;
	int amt;
	public Wife(Account a, int amt) {
		super();
		this.a = a;
		this.amt = amt;
	}
	public void run()
	{
		a.withdraw(amt);
	}
}
class Bank_Account{

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Account a=new Account();
		

		Husband h=new Husband(a,20000);
		Wife w=new Wife(a,15000);
		w.start();
		h.start();
	}
}