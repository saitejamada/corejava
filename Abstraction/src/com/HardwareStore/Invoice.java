package com.HardwareStore;

import java.util.Scanner;

public class Invoice 
{
	String partNumber,partDescription;
	int quantity;
	double price,totalPrice;
	
	public String getPartNumber() 
	{
		return partNumber;
	}
	
	public void setPartNumber(String partNumber) 
	{
		this.partNumber = partNumber;
	}
	
	public String getPartDescription() 
	{
		return partDescription;
	}
	
	public void setPartDescription(String partDescription) 
	{
		this.partDescription = partDescription;
	}
	
	public int getQuantity()
	{
		return quantity;
	}
	
	public void setQuantity(int quantity)
	{
		this.quantity = quantity;
	}
	
	public double getPrice() 
	{
		return price;
	}
	
	public void setPrice(double price) 
	{
		this.price = price;
	}

	public Invoice(String partNumber, String partDescription, int quantity, double price) 
	{
		super();
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		this.quantity = quantity;
		this.price = price;
	}
	 double getInvoiceAmount()
	 {
		totalPrice=price*quantity;
		return totalPrice;
	 }
	 
	 void printInvoice()
	 {
		 System.out.println("The Part Number is : "+partNumber);
		 System.out.println("The Part Description is : "+partDescription);
		 System.out.println("The Part Quantity is : "+quantity);
		 System.out.println("The Part Price is : "+price);
		 System.out.println("The Total Invoice IS : "+getInvoiceAmount());
		  
	 }
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Part Number");
		String pno=sc.next();
		System.out.println("Enter Product Description");
		String description=sc.next();
		System.out.println("Enter Quantity");
		int quantity=sc.nextInt();
		if(quantity<0)
		{
			quantity=0;
		}
		System.out.println("Enter The Price");
		double price=sc.nextInt();
		if(price<0)
		{
			price=0.0;
		}
		
		Invoice i=new Invoice(pno,description,quantity,price);
		i.printInvoice();
	}
}
