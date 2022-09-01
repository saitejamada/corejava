package com.inter_thread_communication;

class B extends Thread
{
	int total;
	
	public void run()
	{
		synchronized(this)
		{
			System.out.println("Thread B Stareted Calculating");
			for(int i=1;i<=100;i++)
			{
				total+=i;
			}
			System.out.println("Thread B is Givivng Notification");
			this.notify();
		}
	}
}

public class Thread_Main2 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		B b=new B();
		b.setName("Thread B");
		b.start();
		Thread.sleep(5000);
		synchronized(b)
		{
			System.out.println("Main Thread Going Into Wait");
			b.wait(5000);
			System.out.println("main Thread Got Notification");
		}
		System.out.println("Sum Is "+b.total);
	}
}
