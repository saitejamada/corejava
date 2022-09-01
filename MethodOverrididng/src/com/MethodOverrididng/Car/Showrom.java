package com.MethodOverrididng.Car;

class Car 
{
  int speed;
  double regularPrice;
  String colour;

  public Car(int speed, double regularPrice, String colour) 
  {
	super();
	this.speed = speed;
	this.regularPrice = regularPrice;
	this.colour = colour;
  }
  
  double getSalePrice()
  {
	  return 0.0;
  }
  
  void PrintDetails()
  {
	  System.out.println("Car Colour Is ="+colour);
	  System.out.println("Car Speed Is ="+speed);
	  System.out.println("Car Regular price Is ="+regularPrice);
  }
}

class Ford extends Car
{
	int year,manufacturingDiscount;
	double salesPrice;

	public Ford(int speed, double regularPrice, String colour, int year, int manufacturingDiscount)
	{
		super(speed, regularPrice, colour);
		this.year = year;
		this.manufacturingDiscount = manufacturingDiscount;
	}
	
	 double getSalePrice()
	  {
		 regularPrice=super.regularPrice-manufacturingDiscount;
		salesPrice=regularPrice+(regularPrice*0.02);
		  return salesPrice;
	  }
	  
	  void PrintDetails()
	  {
		  super.PrintDetails();
		  System.out.println("Car Model Is="+year);
		  System.out.println("Car Manufacturing discount Is="+manufacturingDiscount);
		  System.out.println("Total Sale Price Is ="+getSalePrice());
	  }

}

class Seden extends Car
{
	double length;
	double salesPrice;

	public Seden(int speed, double regularPrice, String colour, double length)
	{
		super(speed, regularPrice, colour);
		this.length = length;
	}
	
	 double getSalePrice()
	  {
		 regularPrice=super.regularPrice;
		 salesPrice = regularPrice+(regularPrice*0.02);
		  return salesPrice;
	  }
	 
	 void PrintDetails()
	  {
		  super.PrintDetails();
		  System.out.println("Car Length Is="+length);
		  System.out.println("Total Sale Price Is ="+getSalePrice());
	  }
}

class Showrrom
{
	public static void main(String[] args) 
	{
		Car c=new Ford(152,800000,"white",2019,20000);
		c.PrintDetails();

		System.out.println("_____________________________________");
		Car c1=new Seden(120,500000,"Blue",14.7);
		c1.PrintDetails();
	}
}