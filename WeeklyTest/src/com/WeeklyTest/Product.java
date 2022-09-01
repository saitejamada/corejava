package com.WeeklyTest;

class Product
{
	int product_id,product_price;
	String product_name;
	static int count=0;
	
	public int getProduct_id() 
	{
		return product_id;
	}
	
	
	public int getProduct_price() {
		return product_price;
	}


	public void setProduct_price(int product_price) {
		this.product_price = product_price;
	}


	public void setProduct_id(int product_id) 
	{
		this.product_id = product_id;
	}
	
	
	public String getProduct_name() 
	{
		return product_name;
	}
	
	
	public void setProduct_name(String product_name)
	{
		this.product_name = product_name;
	}
	
	public Product(int product_id, String product_name,int product_price)
	{
		this.product_id = product_id;
		this.product_price = product_price;
		this.product_name = product_name;
	}
	
	
	static int calculateCount()
	{
		return ++count;
	}
	
	void printdetails()
	{
		System.out.println("Product name Is "+product_name);
		System.out.println("Product Id Is "+product_id);
		System.out.println("Product Price Is "+product_price);
		System.out.println("Number Of Objects Created "+calculateCount());
		System.out.println("___________________________________________________");
	}
	
	public static void main(String[] args) 
	{
		Product p=new Product(1121,"Iphone",70000);
		p.printdetails();
		
		Product p1=new Product(123,"WashingMachine",25000);
		p1.printdetails();
		
		Product p2=new Product(1298,"laptop",450000);
		p2.printdetails();
	}
}


