package com.InterfaceDemo;

public class Shape implements Printable{

	String shape;int radius; double area;
	@Override
	
	public void printData() 
	{
		System.out.println("Drawing Shape"+shape);	
		area=pi*radius*radius;
		System.out.println("The Area Of Shape is "+area);
	}

	public Shape(String shape, int radius)
	{
		super();
		this.shape = shape;
		this.radius = radius;
	}

	
}
