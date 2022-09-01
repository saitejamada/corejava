package com.multithreading_examples;

import java.util.*;


class PrimeNumber extends Thread 
{

	int n;
	 boolean status;
	public PrimeNumber(int n) {
		super();
		this.n = n;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		prime();
		
	}
	
	void prime()
	{
		int count=0;
		
		for(int i=2;i<=n-1;i++)
		{
		  if(n%i==0)
		 count++;
		}
		if(count>=1)
		{
			status=false;
		}	
		else 
		{
			status=true;
		}
		
		
	}
	synchronized boolean getstatus()
	{
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}

}
class Armstrong extends Thread
{
	int n;
	  boolean status;
	public Armstrong(int n) {
		super();
		this.n = n;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		armstrong();
		
	}
	
	void armstrong()
	{
		int n1=n,r=0,s=0;
		while(n1>0)
		{
		r=n1%10;
		n1=n1/10;
		s=s+(r*r*r);
		}
		if(s==n)
		{
			status=true;
		}
		else
		{
			status=false;
		}
		
	}
	synchronized boolean getStatus()
	{
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}
	
}

public class Prime_ArmStrong_Number {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
	
		ArrayList a=new ArrayList();
		LinkedList ll=new LinkedList();
		ArrayList a1=new ArrayList();
		
		System.out.println("Enter The Number To Enter ");
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
		
			System.out.println("Enter The "+i+" Number");
			int num=sc.nextInt();
			a.add(num);
		}
		
		for(int i=0;i<a.size();i++)
		{
			Armstrong arm=new Armstrong((int) a.get(i));
			arm.start();
			
			boolean armstatus=arm.getStatus();
			
			PrimeNumber p=new PrimeNumber((int) a.get(i));
			p.start();
			
			boolean pstatus=p.getstatus();
			
			if(armstatus==true)
			{
				ll.add(a.get(i));
			}
			else if(pstatus==true)
			{
				a1.add(a.get(i));
			}
			else
			{
				System.out.println("Given No "+a.get(i)+" Is Not Prime Or ArmStrong");
			}
		}
		
		Collections.sort(a1);
		Collections.sort(ll);
		
		System.out.println(" ArrayList Elements Are "+a1);
			System.out.println(" LinkedList Elements Are "+ll);
		
	}
}
