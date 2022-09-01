package com.assignments14dec;

interface Test
{
	void square();
}

class Arthematic implements Test
{

	int length,breath;
	double area;
	
	
	public Arthematic(int length, int breath) 
	{
		super();
		this.length = length;
		this.breath = breath;
	}
	@Override
	public void square() 
	{
		// TODO Auto-generated method stub
		System.out.println("Shape Is  Square ");
		area();
	}
	void area()
	{
		area=length*breath;
		System.out.println("Area Is "+area);
	}
}

public class ToTestInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t=new Arthematic(4,5);
		t.square();
	}

}
