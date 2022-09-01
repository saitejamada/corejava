package com.MethodOverrididng;

class ShapeMethodOverriding
{
	
 void draw()
 {
	 System.out.println("drawing a shape");
 }
  void area()
  {
	  System.out.println("Area of Shape");
  }
}
	
class Triangle extends ShapeMethodOverriding
	{
		  int base,height,area;
		  
		Triangle(int base,int height)
		{
			this.base=base;
			this.height=height;
		}
		  
		void draw()
		{
					System.out.println("Drawing A Triangle");
		}
		
		void area()
		{
				area=base*height;
				System.out.println("Area Of Triangle IS "+area);
		}
				
	}

	class Circle extends ShapeMethodOverriding
	{
		double area;
		int radius;
		
				Circle(int radius)
				{
					this.radius=radius;
				}
		
		        void draw()
				{
				    System.out.println("Drawing A Circle");
				}
				
		        void area()
				{
		        	area=3.14*radius*radius;
					System.out.println("Area Of Circle  IS "+area);
				}
						
	}

	class Square extends ShapeMethodOverriding
	{
		int side,area;
		
		   Square(int side)
		   {
			   this.side=side;
		   }
		
		
		       void draw()
				{
					System.out.println("Drawing A Sqaure");
				}
				
		       void area()
			   {
		    	   area=side*side;
				    System.out.println("Area Of Square IS "+area);
			   }
	}
	
    class Shape
	{
		public static void main(String[] args)
		{
			Square s=new Square(5);
				s.draw();
				s.area();
			
		        System.out.println();
				Triangle t=new Triangle(4,5);
					t.draw();
					t.area();
				
				
					System.out.println();
					Circle c=new Circle(7);
						c.draw();
						c.area();
						
		}
	}

