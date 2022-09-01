package com.assignments14dec;

public class Point 
{
	private int x,y;

	public Point()
	{
		x=5;
		y=5;
	}
	public Point(int x, int y)
	{
		super();
		this.x = x;
		this.y = y;
	}
	
	public void setX(int x)
	{
		this.x=x;
	}
	public void setY(int y)
	{
		this.y=y;
	}
	public void setXY(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	@Override
	public String toString() 
	{
		return "Point [x=" + x + ", y=" + y + "]";
	}
	public static void main(String[] args) 
	{
		Point p=new Point();
		p.toString();
		
		Point p1=new Point(2,2);
		p1.toString();
	}
	
}
