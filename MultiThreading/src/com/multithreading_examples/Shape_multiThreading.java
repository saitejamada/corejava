package com.multithreading_examples;

import java.util.*;

class Rectangle extends Thread
{
	int length,breath,area,perimeter;
	
	
	public Rectangle(int length, int breath) {
		super();
		this.length = length;
		this.breath = breath;
	}
	public void run()
	{
		area();
		perimeter();
	}
	
	public void perimeter() {
		// TODO Auto-generated method stub
		perimeter=2*breath+length;
    	System.out.println("Perimeter  OF Rectangle is"+perimeter);
	}
	void area()
	{
		area=length*breath;
    	System.out.println("Area OF Rectangle is"+area);
	}
}

class Circle extends Thread
{
	int radius;
	final double pi=3.14;
	double area,perimeter;
	
	public Circle(int radius) {
		super();
		this.radius = radius;
	}
	public void run()
	{
		area();
		perimeter();
	}
	public void perimeter() {
		// TODO Auto-generated method stub
		 perimeter=2*pi*radius;
		  System.out.println("Perimeter Of Circle Is : "+perimeter);
		
	}
	public void area() {
		// TODO Auto-generated method stub
		area=pi*radius*radius;
		System.out.println("Area Of Circle  IS "+area);
	}	
}

class Triangle extends Thread
{
	int side,side1,side2,area,perimeter;

	public Triangle(int side, int side1, int side2) {
		super();
		this.side = side;
		this.side1 = side1;
		this.side2 = side2;
	}
	
	public void run()
	{
		area();
		perimeter();
	}

	public void perimeter() {
		// TODO Auto-generated method stub
		perimeter=side+side1+side2;
		System.out.println("Perimeter Of Triangle is "+perimeter);
	}

	public void area() {
		// TODO Auto-generated method stub
		area=side*side1*side2*1/2;
		System.out.println("Area Of Triangle IS "+area);
	}
}

class Square extends Thread
{
	int side,area;

	public Square(int side) {
		super();
		this.side = side;
	}
	public void run()
	{
		area();
	}
	
	void area() {
		// TODO Auto-generated method stub
		area=side*side;
		System.out.println("Area Of Square Is "+area);
	}
	
}

public class Shape_multiThreading 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		Triangle t=new Triangle(2,4,2);
		t.start();
		
		Square s=new Square(5);
		s.start();
		
		Circle c=new Circle(7);
		c.start();
		
		Rectangle r=new Rectangle(4,5);
		r.start();
		
	
	}
}
