package com.employee;


class Shape 
{
	String shape;
		Shape(String shape)
		{
			this.shape=shape;
		}
			void showShape()
			{
				System.out.println("THE SHAPE IS "+shape);
			}

}
class Triangle extends Shape
{
	int base,height,area;
	  Triangle(int base,int height)
	  {
		  super("Triangle");
		  this.base=base;
		  this.height=height;
		  
	  }
			void drawTriangle()
			{
				System.out.println("Drawing A Triangle");
			}
				void areaOfTriangle()
				{
					area=base*height;
						System.out.println("Area Of Triangle IS "+area);
				}
							void clearTriangle()
								{
									System.out.println("clearing Triangle");
									}
	
}

class Circle extends Shape
{
	int radius;
	double area;
	
	  Circle(int radius)
	  {
		  super("Circle");
		  this.radius=radius;
	  }
			void drawCircle()
			{
			System.out.println("Drawing A Circle");
			}
				void areaOfCircle()
				{
				area=3.14*radius*radius;
				System.out.println("Area Of Circle  IS "+area);
				}
					void clearCircle()
					{
						System.out.println("clearing Circle");
					}
}

class Square extends Shape
{
	int side,area;
	
	   Square(int side)
	   {
		   super("Square");
		   this.side=side;
	   }
			void drawSquare()
			{
				System.out.println("Drawing A Sqaure");
			}
					void areaOfSquare()
					{
							area=side*side;
								System.out.println("Area Of Square IS "+area);
					}
								void clearSquare()
								{
								System.out.println("clearing Square");
								}
		
}
class Draw
{
	public static void main(String[] args)
	{
		Square s=new Square(5);
		s.showShape();
		s.drawSquare();
		s.areaOfSquare();
		s.clearSquare();
			
			System.out.println();
			Triangle t=new Triangle(5,5);
			t.showShape();
			t.drawTriangle();
			t.areaOfTriangle();
			t.clearTriangle();
			
				System.out.println();
				Circle c=new Circle(7);
					c.showShape();
					c.drawCircle();
					c.areaOfCircle();
					c.clearCircle();
	}
}