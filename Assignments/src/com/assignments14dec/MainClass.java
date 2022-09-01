package com.assignments14dec;

interface Myclass 
{

	void method1();
	void method2();
}

class MainClass implements Myclass
{
	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("In MainClass implemtation Class Method 1");
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("In MainClass implemtation Class Method 2");
	}
	
	public static void main(String[] args) 
	{
		Myclass m=new MainClass();
		m.method1();
		m.method2();
	}
}