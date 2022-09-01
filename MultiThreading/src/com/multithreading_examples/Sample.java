package com.multithreading_examples;
class Demo extends Thread
{

	public void run()
	{
		System.out.println(" "+Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class Sample {

	public static void main(String[] args) throws InterruptedException {
		
	Demo d=new Demo();
	d.setName("First");
	Demo d1=new Demo();
	d1.setName("Second");
	d.start();
//	d.join();
	System.out.println("Main Thread");
	d1.start();
	}
}
