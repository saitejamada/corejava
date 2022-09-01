package com.multithreading_examples;

class Five extends Thread
{
	int n;
	
	public Five(int n) {
		super();
		this.n = n;
	}

	public  void run()
	{
		table();
	}
	
	synchronized void table()
	{
		for(int i=0;i<=10;i++)
		{
			
			System.out.println(n+" X "+i+" = "+n*i);
		}
	}
	
	
}

class Seven extends Thread
{
	int n;
	
	public Seven(int n) {
		super();
		this.n = n;
	}

	
	public  void run()
	{
		table();
	}
	
	synchronized  void table()
	{
		for(int i=0;i<=10;i++)
		{
			try {
				sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(n+" X "+i+" = "+n*i);
			
		}
	}
}

public class Table 
{

	public static void main(String[] args) {
		Five f=new Five(5);
		f.start();
		Seven s=new Seven(7);
				s.start();
	}
}
