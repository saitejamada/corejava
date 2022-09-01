package com.saiPractice;

 class Number
 {

	int a;
	int b,c;
	void add() 
	{
		c=a+b;

	}	
	
	public Number(int a, int b) 
	{
		super();
		this.a = a;
		this.b = b;
	}
		void printdetails() 
		{
			System.out.println(" a val is "+a+" b val is "+b+" Addition :"+c);
		}
 }

 

class Number1 extends Number
{
	public Number1(int a, int b) 
	{
		super(a, b);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Number n=new Number(2,5);
		n.add();
		n.printdetails();
	}
}

