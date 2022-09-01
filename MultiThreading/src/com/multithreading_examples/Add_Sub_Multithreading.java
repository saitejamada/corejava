package com.multithreading_examples;

class Addition implements Runnable
{

	int a,b,c;
	
	
	public Addition(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		add();
	}
	void add()
	{
		c=a+b;
		System.out.println("Addition of A and B is "+c);
	}
	
}
class Subtraction extends Thread
{
	int a,b,c;
	
	public Subtraction(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	public void run()
	{
		sub();
	}
	void sub()
	{
		c=a-b;
		System.out.println("Subtraction is "+c);
	}
}

public class Add_Sub_Multithreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 
		 Subtraction s=new Subtraction(10,5);
		 s.start();
		 
		 Addition a=new Addition(2,4);
		 Thread t1=new Thread(a);
		 t1.start();
	}

}
