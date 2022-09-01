package com.Abstraction;

import java.util.Scanner;

abstract class Shape
{
	String shape;
	
	abstract void area();
	abstract void perimeter();
	
	public Shape(String shape)
	{
		super();
		this.shape = shape;
	}
	void draw()
	{
		System.out.println("Drawing A "+shape);
	}
	
}

class Triangle extends Shape
{
	int side,side1,side2,area,perimeter;
	
	public Triangle(int side, int side1, int side2) 
	{
		super("Triangle");
		this.side = side;
		this.side1 = side1;
		this.side2 = side2;
	}

	void area()
	{
		area=side*side1*side2*1/2;
		System.out.println("Area Of Triangle IS "+area);
	}
	
	void perimeter()
	{
		perimeter=side+side1+side2;
		System.out.println("Perimeter Of Triangle is "+perimeter);
	}
	
}

class Circle extends Shape
{
	int radius;
	double area,pi,perimeter;
	
	  Circle(int radius)
	  {
		  super("Circle");
		  this.radius=radius;
		  pi=3.14;
	  }
	  
	  void area()
	  {
		area=pi*radius*radius;
		System.out.println("Area Of Circle  IS "+area);
	  }
	  void perimeter()
	  {
		  perimeter=2*pi*radius;
		  System.out.println("Perimeter Of Circle Is : "+perimeter);
	  }
					
}
class Rectangle extends Shape
{
	    int length,breath;
	   double area,perimeter;
	
	   public Rectangle(int length, int breath) 
	  {
		super("Rectangle");
		this.length = length;
		this.breath = breath;
	   }
	   
	    void area()
	    {
	    	area=length*breath;
	    	System.out.println("Area OF Rectangle is"+area);
	    }
	    void perimeter()
	    {
	    	perimeter=2*breath+length;
	    	System.out.println("Perimeter  OF Rectangle is"+perimeter);
	    }
}


public class ShapeMain {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Base for Triangle");
		int side=sc.nextInt();
		System.out.println("Enter The Side for Triangle");
		int side1=sc.nextInt();
		System.out.println("Enter The Side for Triangle");
		int side2=sc.nextInt();
		
		Shape s=new Triangle(side,side1,side2);
		s.area();
		s.perimeter();
		
		System.out.println("Enter The Radius Of Circle");
		int radius=sc.nextInt();
		
		Shape c=new Circle(radius);
		c.area();
		c.perimeter();
		
		System.out.println("Enter The Length For rectangle");
		int lenght=sc.nextInt();
		System.out.println("Enter The Breath For rectangle");
		int Breath=sc.nextInt();
		
		Shape r=new Rectangle(lenght,Breath);
		r.area();
		r.perimeter();

	}

}
