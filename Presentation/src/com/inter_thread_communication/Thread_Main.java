package com.inter_thread_communication;

class A extends Thread
{
	int total;
	 public void run()
	 {
		 System.out.println(Thread.currentThread().getName());
		 for(int i=1;i<=100;i++)
		 {
			 total+=i;
		 }
		 
	 }
}

public class Thread_Main {

	public static void main(String[] args) throws InterruptedException {
		 
		A a =new A();
		a.setName("Thread A ");
		a.start();
		a.wait();
		System.out.println("Sum Of 100 Natural No is "+a.total);
	}
}
